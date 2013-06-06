package Moosend.API.Client;

import Moosend.API.Client.Wrappers.*;
import java.io.OutputStream;
import com.google.gson.Gson;
//import java.net.*;
//import org.apache.http.client.HttpClient;
//import org.apache.http.impl.client.DefaultHttpClient;
//import org.apache.http.params.BasicHttpParams;
//import org.apache.http.params.HttpConnectionParams;
//import org.apache.http.params.HttpParams;

public class ApiManager
{
	private static final String END_POINT = "http://api.moosend.com";

	public ApiManager()
	{
	}

	public ApiManager(String apiKey)
	{
		this.setApiKey(apiKey);
	}

	private String privateApiKey;
	public final String getApiKey()
	{
		return privateApiKey;
	}
	public final void setApiKey(String value)
	{
		privateApiKey = value;
	}

	private CampaignsWrapper _Campaigns;

	public final CampaignsWrapper getCampaigns()
	{
		if (_Campaigns == null)
		{
			_Campaigns = new CampaignsWrapper(this);
		}
		return _Campaigns;
	}

	private MembersWrapper _Members;

	public final MembersWrapper getMembers()
	{
		if (_Members == null)
		{
			_Members = new MembersWrapper(this);
		}
		return _Members;
	}

	private MailingListsWrapper _MailingLists;

	public final MailingListsWrapper getMailingLists()
	{
		if (_MailingLists == null)
		{
			_MailingLists = new MailingListsWrapper(this);
		}
		return _MailingLists;
	}

	public <T> T MakeRequest(HttpMethod method, String path) throws Exception
	{        
		try{
            return this.<T>MakeRequest(method, path, new Object());
        }
        catch(Exception ex){
            throw ex;
        }
	}

	public <Object> void doMakeRequest(HttpMethod method, String path) throws Exception
	{
		this.<Object>MakeRequest(method, path);
	}

	public <Object> void doMakeRequest(HttpMethod method, String path, Object parameters)
	{
		this.<Object>doMakeRequest(method, path, parameters);
	}

	public <T> T MakeRequest(HttpMethod method, String path, Object parameters) throws Exception
	{
		String query;
        Gson gson = new Gson();

		if (method == HttpMethod.GET)
		{
			// serialize parameters to be used in the query string
			query = parameters.toString();
		}
		else
		{
			// serialize parameters in json format to be used in POST and DELETE request streams			
            query = gson.toJson(parameters);
		}

		// build uri for request
		String parametersWithApiKey = "apiKey=" + getApiKey() + "&mode=Data";
		if (query.trim().isEmpty() && method == HttpMethod.GET)
		{
			parametersWithApiKey += "&" + query;
		}
		String uri = END_POINT + path + ".json?" + parametersWithApiKey + "&format=json";

		        
        try {
            // initialize web request
            java.net.URL iurl = new java.net.URL(uri);
            java.net.HttpURLConnection req = (java.net.HttpURLConnection)iurl.openConnection();            
            System.setProperty("http.keepAlive", "false");            
            req.setRequestMethod(method.toString());
            req.setRequestProperty("content-type","application/json; charset=utf-8");            
            req.setConnectTimeout(180000); // trhee minutes
            req.setRequestProperty("Accept-Encoding", "gzip, deflate");
            System.setProperty("http.agent", String.format("moosend-api-%1$s-%2$s", System.getProperty("java.version"), System.getProperty("os.name")));            
            
            if (method != HttpMethod.GET)
            {
                req.setRequestProperty("Content-Length", new Integer(new String(query.getBytes("UTF-8"), "UTF-8").getBytes().length).toString());

                // write serialized parameters to the request stream                        
                java.io.FileWriter streamWriter = new java.io.FileWriter(req.getInputStream().toString());
                streamWriter.write(query);
                streamWriter.close();                
            }
		
			// get response stream and deserialize to expected object            
            //			using (HttpWebResponse response = (HttpWebResponse)req.GetResponse())
			
			OutputStream readStream = req.getOutputStream();
			
            if (readStream == null)
            {
                return null;
            }

            //using (Stream responseStream = response.GetResponseStream())
            //Stream responseStream = response.GetResponseStream();

            //using (StreamReader readStream = new StreamReader(responseStream))
            //StreamReader readStream = new StreamReader(responseStream);

            String json = readStream.toString().trim();

            // deserialize as a generic api result and check if result is an error                    
            ApiResult result = gson.fromJson(json, ApiResult.class); //(json, ApiResult<Object>.class);
            if (result.getCode() == 0)
            {
                // deserialize again to get the expected object
                return (T)gson.fromJson(json, ApiResult.class).getContext();
            }
            else
            {
                // throw exception if deserialized object represents an error
                throw new ApiException(result.getError());
            }                      
        }					
		catch (Exception we)
		{
			throw we;
		}        
	}
}
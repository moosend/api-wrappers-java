package Moosend.API.Client.Wrappers;

import Moosend.API.Client.*;
import Moosend.API.Client.Models.*;
import java.util.*;

public class MembersWrapper
{
	private ApiManager _Manager;

	public MembersWrapper(ApiManager manager)
	{
		_Manager = manager;
	}

	public final MailingListMember GetByEmail(UUID mailingListID, final String email) throws Exception
	{        
        Object parameters = new Object(){public final String Email = email;};        
		return _Manager.MakeRequest(HttpMethod.GET, String.format("/subscribers/%1$s/view", mailingListID), parameters);
        //return _Manager.MakeRequest<MailingListMember>MakeRequest(HttpMethod.GET, String.format("/subscribers/%1$s/view", mailingListID), parameters);
	}

	public final List<MailingListMember> Subscribe(UUID mailingListID, List<MailingListMemberParams> members) throws Exception
	{
        ArrayList<Object> parameters = new ArrayList<Object>();
        for(final MailingListMemberParams member : members){
            final ArrayList<String> customFields = new ArrayList<String>();            
            for (Map.Entry<String,String> entry : member.getCustomFields().entrySet()) {               
               customFields.add(entry.getKey()+"="+entry.getValue());                
            }
            Object param = new Object(){
                public final String Name = member.getName();
                public final String Email = member.getEmail(); 
                public final ArrayList<String> CustomFields = customFields;
            };
            parameters.add(param);
        }

        return _Manager.MakeRequest(HttpMethod.POST, String.format("/subscribers/%1$s/subscribe_many", mailingListID), parameters);
	}
    
	public final MailingListMember Subscribe(UUID mailingListID, final MailingListMemberParams member) throws Exception
	{
        //parameters new {Name = member.Name, Email = member.Email, CustomFields = member.CustomFields.Select(c => c.Key + "=" + c.Value).ToList()}
        final ArrayList<String> customFields = new ArrayList<String>();            
        for (Map.Entry<String,String> entry : member.getCustomFields().entrySet()) {               
           customFields.add(entry.getKey()+"="+entry.getValue());                
        }
        Object parameters = new Object(){
            public final String Name = member.getName();
            public final String Email = member.getEmail(); 
            public final ArrayList<String> CustomFields = customFields;
        };
		return _Manager.<MailingListMember>MakeRequest(HttpMethod.POST, String.format("/subscribers/%1$s/subscribe", mailingListID), parameters);
	}

	public final void Unsubscribe(UUID mailingListID, UUID campaignID, final String email) throws Exception
	{
		_Manager.MakeRequest(HttpMethod.POST, String.format("/subscribers/%1$s/%2$s/unsubscribe", mailingListID, campaignID), new Object(){public final String Email = email;});
	}

	public final void Remove(UUID mailingListID, final String email) throws Exception
	{
		_Manager.MakeRequest(HttpMethod.POST, String.format("/subscribers/%1$s/remove", mailingListID), new Object(){public final String Email = email;});
	}

	public final void Remove(UUID mailingListID, List<String> emails)
	{
        String serializedEmails = "";
        for(int i=0; i<emails.size(); i++){
            if(i==0){
                serializedEmails = emails.get(0);
            }
            else{
                serializedEmails = serializedEmails + "," + emails.get(i);
            }            
        }
        final String finalSerializedEmails = serializedEmails;
        Object parameters = new Object(){            
            public final String Emails = finalSerializedEmails;
        };
        //Object parameters = new Object(); //TODO new Object{public final emails = tangible.DotNetToJavaStringHelper.join(",", emails)}
		_Manager.doMakeRequest(HttpMethod.POST, String.format("/subscribers/%1$s/remove_many", mailingListID), parameters);
	}
}

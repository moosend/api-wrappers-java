package Moosend.API.Client.Models;

public class MailingListMemberParams
{
	public MailingListMemberParams()
	{
		setCustomFields(new java.util.HashMap<String, String>());
	}


	private String privateName;
	public String getName()
	{
		return privateName;
	}
	public void setName(String value)
	{
		privateName = value;
	}


	private String privateEmail;
	public String getEmail()
	{
		return privateEmail;
	}
	public void setEmail(String value)
	{
		privateEmail = value;
	}


	private java.util.Map<String, String> privateCustomFields;
	public java.util.Map<String, String> getCustomFields()
	{
		return privateCustomFields;
	}
	public void setCustomFields(java.util.Map<String, String> value)
	{
		privateCustomFields = value;
	}
}
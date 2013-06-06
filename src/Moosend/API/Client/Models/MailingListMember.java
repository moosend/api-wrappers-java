package Moosend.API.Client.Models;


public class MailingListMember implements java.io.Serializable
{
	public MailingListMember()
	{
		setCustomFields(new java.util.ArrayList<CustomField>());
		setSubscribeType(getSubscribeType().Subscribed);
	}


	private java.util.UUID privateID = null; //java.util.UUID.randomUUID();
	public java.util.UUID getID()
	{
		return privateID;
	}
	public void setID(java.util.UUID value)
	{
		privateID = value;
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


	private java.util.Date privateCreatedOn = new java.util.Date(0);
	public java.util.Date getCreatedOn()
	{
		return privateCreatedOn;
	}
	public void setCreatedOn(java.util.Date value)
	{
		privateCreatedOn = value;
	}


	private java.util.Date privateUnsubscribedOn;
	public java.util.Date getUnsubscribedOn()
	{
		return privateUnsubscribedOn;
	}
	public void setUnsubscribedOn(java.util.Date value)
	{
		privateUnsubscribedOn = value;
	}


	private java.util.UUID privateUnsubscribedFromID;
	public java.util.UUID getUnsubscribedFromID()
	{
		return privateUnsubscribedFromID;
	}
	public void setUnsubscribedFromID(java.util.UUID value)
	{
		privateUnsubscribedFromID = value;
	}


	private Moosend.API.Client.SubscribeType privateSubscribeType;
	public Moosend.API.Client.SubscribeType getSubscribeType()
	{
		return privateSubscribeType;
	}
	public void setSubscribeType(Moosend.API.Client.SubscribeType value)
	{
		privateSubscribeType = value;
	}


	private java.util.List<CustomField> privateCustomFields;
	public java.util.List<CustomField> getCustomFields()
	{
		return privateCustomFields;
	}
	public void setCustomFields(java.util.List<CustomField> value)
	{
		privateCustomFields = value;
	}
}
package Moosend.API.Client.Models;


public class CustomFieldDefinition implements java.io.Serializable
{

	private java.util.UUID privateID = null; //java.util.UUID.randomUUID();
	public java.util.UUID getID()
	{
		return privateID;
	}
	public void setID(java.util.UUID value)
	{
		privateID = value;
	}

	private java.util.UUID privateMailingListID = null; //java.util.UUID.randomUUID();
	public java.util.UUID getMailingListID()
	{
		return privateMailingListID;
	}
	public void setMailingListID(java.util.UUID value)
	{
		privateMailingListID = value;
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


	private String privateContext;
	public String getContext()
	{
		return privateContext;
	}
	public void setContext(String value)
	{
		privateContext = value;
	}


	private boolean privateIsRequired;
	public boolean getIsRequired()
	{
		return privateIsRequired;
	}
	public void setIsRequired(boolean value)
	{
		privateIsRequired = value;
	}

	private Moosend.API.Client.CustomFieldType privateType;
	public Moosend.API.Client.CustomFieldType getType()
	{
		return privateType;
	}
	public void setType(Moosend.API.Client.CustomFieldType value)
	{
		privateType = value;
	}
}
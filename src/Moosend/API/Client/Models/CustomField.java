package Moosend.API.Client.Models;


public class CustomField implements java.io.Serializable
{
	private java.util.UUID privateMailingListMemberID = null; //java.util.UUID.randomUUID();
	public java.util.UUID getMailingListMemberID()
	{
		return privateMailingListMemberID;
	}
	public void setMailingListMemberID(java.util.UUID value)
	{
		privateMailingListMemberID = value;
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


	private String privateValue;
	public String getValue()
	{
		return privateValue;
	}
	public void setValue(String value)
	{
		privateValue = value;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == null)
		{
			return false;
		}
		CustomField t = (CustomField)((obj instanceof CustomField) ? obj : null);
		if (t == null)
		{
			return false;
		}
		if (getMailingListMemberID().equals(t.getMailingListMemberID()) && getName().equals(t.getName()))
		{
			return true;
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return (getMailingListMemberID().toString() + getName()).hashCode();
	}
}
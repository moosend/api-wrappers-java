package Moosend.API.Client.Models;


public class MailingList implements java.io.Serializable
{
	public MailingList()
	{
		setCustomFieldsDefinition(new java.util.ArrayList<CustomFieldDefinition>());
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

	public long getAllMemberCount()
	{
		return getActiveMemberCount() + getBouncedMemberCount() + getRemovedMemberCount() + getUnsubscribedMemberCount();
	}


	private long privateActiveMemberCount;
	public long getActiveMemberCount()
	{
		return privateActiveMemberCount;
	}
	public void setActiveMemberCount(long value)
	{
		privateActiveMemberCount = value;
	}


	private long privateBouncedMemberCount;
	public long getBouncedMemberCount()
	{
		return privateBouncedMemberCount;
	}
	public void setBouncedMemberCount(long value)
	{
		privateBouncedMemberCount = value;
	}


	private long privateRemovedMemberCount;
	public long getRemovedMemberCount()
	{
		return privateRemovedMemberCount;
	}
	public void setRemovedMemberCount(long value)
	{
		privateRemovedMemberCount = value;
	}


	private long privateUnsubscribedMemberCount;
	public long getUnsubscribedMemberCount()
	{
		return privateUnsubscribedMemberCount;
	}
	public void setUnsubscribedMemberCount(long value)
	{
		privateUnsubscribedMemberCount = value;
	}


	private Moosend.API.Client.MailingListStatus privateStatus;
	public Moosend.API.Client.MailingListStatus getStatus()
	{
		return privateStatus;
	}
	public void setStatus(Moosend.API.Client.MailingListStatus value)
	{
		privateStatus = value;
	}


	private java.util.List<CustomFieldDefinition> privateCustomFieldsDefinition;
	public java.util.List<CustomFieldDefinition> getCustomFieldsDefinition()
	{
		return privateCustomFieldsDefinition;
	}
	private void setCustomFieldsDefinition(java.util.List<CustomFieldDefinition> value)
	{
		privateCustomFieldsDefinition = value;
	}


	private String privateCreatedBy;
	public String getCreatedBy()
	{
		return privateCreatedBy;
	}
	public void setCreatedBy(String value)
	{
		privateCreatedBy = value;
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


	private String privateUpdatedBy;
	public String getUpdatedBy()
	{
		return privateUpdatedBy;
	}
	public void setUpdatedBy(String value)
	{
		privateUpdatedBy = value;
	}

	private java.util.Date privateUpdatedOn = new java.util.Date(0);
	public java.util.Date getUpdatedOn()
	{
		return privateUpdatedOn;
	}
	public void setUpdatedOn(java.util.Date value)
	{
		privateUpdatedOn = value;
	}

	private String privateConfirmationPage;
	public String getConfirmationPage()
	{
		return privateConfirmationPage;
	}
	public void setConfirmationPage(String value)
	{
		privateConfirmationPage = value;
	}

	private String privateRedirectAfterUnsubscribePage;
	public String getRedirectAfterUnsubscribePage()
	{
		return privateRedirectAfterUnsubscribePage;
	}
	public void setRedirectAfterUnsubscribePage(String value)
	{
		privateRedirectAfterUnsubscribePage = value;
	}
}
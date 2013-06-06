package Moosend.API.Client.Models;

public class CampaignSummary implements java.io.Serializable
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


	private String privateName;
	public String getName()
	{
		return privateName;
	}
	public void setName(String value)
	{
		privateName = value;
	}


	private String privateSubject;
	public String getSubject()
	{
		return privateSubject;
	}
	public void setSubject(String value)
	{
		privateSubject = value;
	}


	private String privateSiteName;
	public String getSiteName()
	{
		return privateSiteName;
	}
	public void setSiteName(String value)
	{
		privateSiteName = value;
	}


	private String privateConfirmationTo;
	public String getConfirmationTo()
	{
		return privateConfirmationTo;
	}
	public void setConfirmationTo(String value)
	{
		privateConfirmationTo = value;
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


	private Integer privateABHoursToTest;
	public Integer getABHoursToTest()
	{
		return privateABHoursToTest;
	}
	public void setABHoursToTest(Integer value)
	{
		privateABHoursToTest = value;
	}


	private Moosend.API.Client.ABCampaignType privateABCampaignType;
	public Moosend.API.Client.ABCampaignType getABCampaignType()
	{
		return privateABCampaignType;
	}
	public void setABCampaignType(Moosend.API.Client.ABCampaignType value)
	{
		privateABCampaignType = value;
	}


	private Moosend.API.Client.ABWinnerSelectionType privateABWinnerSelectionType;
	public Moosend.API.Client.ABWinnerSelectionType getABWinnerSelectionType()
	{
		return privateABWinnerSelectionType;
	}
	public void setABWinnerSelectionType(Moosend.API.Client.ABWinnerSelectionType value)
	{
		privateABWinnerSelectionType = value;
	}


	private Moosend.API.Client.CampaignStatus privateStatus;
	public Moosend.API.Client.CampaignStatus getStatus()
	{
		return privateStatus;
	}
	public void setStatus(Moosend.API.Client.CampaignStatus value)
	{
		privateStatus = value;
	}


	private java.util.Date privateDeliveredOn;
	public java.util.Date getDeliveredOn()
	{
		return privateDeliveredOn;
	}
	public void setDeliveredOn(java.util.Date value)
	{
		privateDeliveredOn = value;
	}


	private java.util.Date privateScheduledFor;
	public java.util.Date getScheduledFor()
	{
		return privateScheduledFor;
	}
	public void setScheduledFor(java.util.Date value)
	{
		privateScheduledFor = value;
	}


	private String privateScheduledForTimezone;
	public String getScheduledForTimezone()
	{
		return privateScheduledForTimezone;
	}
	public void setScheduledForTimezone(String value)
	{
		privateScheduledForTimezone = value;
	}


	private java.util.UUID privateMailingListID;
	public java.util.UUID getMailingListID()
	{
		return privateMailingListID;
	}
	public void setMailingListID(java.util.UUID value)
	{
		privateMailingListID = value;
	}


	private String privateMailingListName;
	public String getMailingListName()
	{
		return privateMailingListName;
	}
	public void setMailingListName(String value)
	{
		privateMailingListName = value;
	}


	private int privateSegmentID;
	public int getSegmentID()
	{
		return privateSegmentID;
	}
	public void setSegmentID(int value)
	{
		privateSegmentID = value;
	}


	private String privateSegmentName;
	public String getSegmentName()
	{
		return privateSegmentName;
	}
	public void setSegmentName(String value)
	{
		privateSegmentName = value;
	}


	private Moosend.API.Client.MailingListStatus privateMailingListStatus;
	public Moosend.API.Client.MailingListStatus getMailingListStatus()
	{
		return privateMailingListStatus;
	}
	public void setMailingListStatus(Moosend.API.Client.MailingListStatus value)
	{
		privateMailingListStatus = value;
	}


	private int privateTotalSent;
	public int getTotalSent()
	{
		return privateTotalSent;
	}
	public void setTotalSent(int value)
	{
		privateTotalSent = value;
	}


	private int privateTotalOpens;
	public int getTotalOpens()
	{
		return privateTotalOpens;
	}
	public void setTotalOpens(int value)
	{
		privateTotalOpens = value;
	}


	private int privateUniqueOpens;
	public int getUniqueOpens()
	{
		return privateUniqueOpens;
	}
	public void setUniqueOpens(int value)
	{
		privateUniqueOpens = value;
	}


	private int privateTotalBounces;
	public int getTotalBounces()
	{
		return privateTotalBounces;
	}
	public void setTotalBounces(int value)
	{
		privateTotalBounces = value;
	}


	private int privateTotalForwards;
	public int getTotalForwards()
	{
		return privateTotalForwards;
	}
	public void setTotalForwards(int value)
	{
		privateTotalForwards = value;
	}


	private int privateTotalLinkClicks;
	public int getTotalLinkClicks()
	{
		return privateTotalLinkClicks;
	}
	public void setTotalLinkClicks(int value)
	{
		privateTotalLinkClicks = value;
	}


	private int privateUniqueLinkClicks;
	public int getUniqueLinkClicks()
	{
		return privateUniqueLinkClicks;
	}
	public void setUniqueLinkClicks(int value)
	{
		privateUniqueLinkClicks = value;
	}

	public double getLinkClicksPercentage()
	{
		if (getRecipientsCount() == 0)
		{
			return 0;
		}
		return ((double)getUniqueLinkClicks() / (double)getRecipientsCount());
	}

	public double getOpenedPercentage()
	{
		if (getRecipientsCount() == 0)
		{
			return 0;
		}
		return ((double)getUniqueOpens() / (double)getRecipientsCount());
	}

	public double getBouncedPercentage()
	{
		if (getRecipientsCount() == 0)
		{
			return 0;
		}
		return ((double)getTotalBounces() / (double)getRecipientsCount());
	}


	private int privateRecipientsCount;
	public int getRecipientsCount()
	{
		return privateRecipientsCount;
	}
	public void setRecipientsCount(int value)
	{
		privateRecipientsCount = value;
	}


	private boolean privateIsTransactional;
	public boolean getIsTransactional()
	{
		return privateIsTransactional;
	}
	public void setIsTransactional(boolean value)
	{
		privateIsTransactional = value;
	}    
}
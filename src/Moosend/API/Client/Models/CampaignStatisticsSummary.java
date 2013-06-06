package Moosend.API.Client.Models;


public class CampaignStatisticsSummary implements java.io.Serializable
{
	private int privateID;
	public int getID()
	{
		return privateID;
	}
	public void setID(int value)
	{
		privateID = value;
	}


	private Moosend.API.Client.ABVersion privateABVersion;
	public Moosend.API.Client.ABVersion getABVersion()
	{
		return privateABVersion;
	}
	public void setABVersion(Moosend.API.Client.ABVersion value)
	{
		privateABVersion = value;
	}


	private java.util.UUID privateCampaignID = null; //java.util.UUID.randomUUID();
	public java.util.UUID getCampaignID()
	{
		return privateCampaignID;
	}
	public void setCampaignID(java.util.UUID value)
	{
		privateCampaignID = value;
	}


	private String privateCampaignName;
	public String getCampaignName()
	{
		return privateCampaignName;
	}
	public void setCampaignName(String value)
	{
		privateCampaignName = value;
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


	private String privateMailingListName;
	public String getMailingListName()
	{
		return privateMailingListName;
	}
	public void setMailingListName(String value)
	{
		privateMailingListName = value;
	}

	private java.util.Date privateCampaignDeliveredOn;
	public java.util.Date getCampaignDeliveredOn()
	{
		return privateCampaignDeliveredOn;
	}
	public void setCampaignDeliveredOn(java.util.Date value)
	{
		privateCampaignDeliveredOn = value;
	}


	private java.util.Date privateTo = new java.util.Date(0);
	public java.util.Date getTo()
	{
		return privateTo;
	}
	public void setTo(java.util.Date value)
	{
		privateTo = value;
	}


	private java.util.Date privateFrom = new java.util.Date(0);
	public java.util.Date getFrom()
	{
		return privateFrom;
	}
	public void setFrom(java.util.Date value)
	{
		privateFrom = value;
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


	private int privateUniqueForwards;
	public int getUniqueForwards()
	{
		return privateUniqueForwards;
	}
	public void setUniqueForwards(int value)
	{
		privateUniqueForwards = value;
	}


	private int privateTotalUnsubscribes;
	public int getTotalUnsubscribes()
	{
		return privateTotalUnsubscribes;
	}
	public void setTotalUnsubscribes(int value)
	{
		privateTotalUnsubscribes = value;
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


	private int privateSent;
	public int getSent()
	{
		return privateSent;
	}
	public void setSent(int value)
	{
		privateSent = value;
	}

	public double getLinkClicksPercentage()
	{
		if (getSent() == 0)
		{
			return 0;
		}
		return ((double)getUniqueLinkClicks() / (double)getSent());
	}

	public double getOpenedPercentage()
	{
		if (getSent() == 0)
		{
			return 0;
		}
		return ((double)getUniqueOpens() / (double)getSent());
	}

	public double getBouncedPercentage()
	{
		if (getSent() == 0)
		{
			return 0;
		}
		return ((double)getTotalBounces() / (double)getSent());
	}

	public double getUnsubscribedPercentage()
	{
		if (getSent() == 0)
		{
			return 0;
		}
		return ((double)getTotalUnsubscribes() / (double)getSent());
	}

	public double getUndeliveredPercentage()
	{
		if (getSent() == 0)
		{
			return 0;
		}
		return ((double)getTotalBounces() / (double)getSent());
	}

	public int getNotOpenedCount()
	{
		return getSent() - getUniqueOpens() - getTotalBounces();
	}
}
package Moosend.API.Client.Models;

//ORIGINAL LINE: [Serializable][DataContract(Namespace = "")] public class Campaign
public class Campaign implements java.io.Serializable
{
//ORIGINAL LINE: [DataMember] public virtual Guid ID {get;internal set;}
	private java.util.UUID privateID = null; //java.util.UUID.randomUUID();
	public java.util.UUID getID()
	{
		return privateID;
	}
	public void setID(java.util.UUID value)
	{
		privateID = value;
	}


//ORIGINAL LINE: [DataMember] public virtual String Name {get;set;}
	private String privateName;
	public String getName()
	{
		return privateName;
	}
	public void setName(String value)
	{
		privateName = value;
	}

//ORIGINAL LINE: [DataMember] public virtual String Subject {get;set;}
	private String privateSubject;
	public String getSubject()
	{
		return privateSubject;
	}
	public void setSubject(String value)
	{
		privateSubject = value;
	}

//ORIGINAL LINE: [DataMember] public virtual String WebLocation {get;set;}
	private String privateWebLocation;
	public String getWebLocation()
	{
		return privateWebLocation;
	}
	public void setWebLocation(String value)
	{
		privateWebLocation = value;
	}

//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [DataMember] public virtual String HTMLContent {get;set;}
	private String privateHTMLContent;
	public String getHTMLContent()
	{
		return privateHTMLContent;
	}
	public void setHTMLContent(String value)
	{
		privateHTMLContent = value;
	}

//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [DataMember] public virtual String PlainContent {get;set;}
	private String privatePlainContent;
	public String getPlainContent()
	{
		return privatePlainContent;
	}
	public void setPlainContent(String value)
	{
		privatePlainContent = value;
	}

//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [DataMember] public virtual Sender Sender {get;set;}
	private Sender privateSender;
	public Sender getSender()
	{
		return privateSender;
	}
	public void setSender(Sender value)
	{
		privateSender = value;
	}

//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [DataMember] public virtual Nullable<DateTime> DeliveredOn {get;set;}
	private java.util.Date privateDeliveredOn;
	public java.util.Date getDeliveredOn()
	{
		return privateDeliveredOn;
	}
	public void setDeliveredOn(java.util.Date value)
	{
		privateDeliveredOn = value;
	}

//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [DataMember] public virtual Sender ReplyToEmail {get;set;}
	private Sender privateReplyToEmail;
	public Sender getReplyToEmail()
	{
		return privateReplyToEmail;
	}
	public void setReplyToEmail(Sender value)
	{
		privateReplyToEmail = value;
	}

//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [DataMember] public virtual DateTime CreatedOn {get;internal set;}
	private java.util.Date privateCreatedOn = new java.util.Date(0);
	public java.util.Date getCreatedOn()
	{
		return privateCreatedOn;
	}
	public void setCreatedOn(java.util.Date value)
	{
		privateCreatedOn = value;
	}

//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [DataMember] public virtual DateTime UpdatedOn {get;internal set;}
	private java.util.Date privateUpdatedOn = new java.util.Date(0);
	public java.util.Date getUpdatedOn()
	{
		return privateUpdatedOn;
	}
	public void setUpdatedOn(java.util.Date value)
	{
		privateUpdatedOn = value;
	}

//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [DataMember] public virtual Nullable<DateTime> ScheduledFor {get;set;}
	private java.util.Date privateScheduledFor;
	public java.util.Date getScheduledFor()
	{
		return privateScheduledFor;
	}
	public void setScheduledFor(java.util.Date value)
	{
		privateScheduledFor = value;
	}

//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [DataMember] public virtual String Timezone {get;set;}
	private String privateTimezone;
	public String getTimezone()
	{
		return privateTimezone;
	}
	public void setTimezone(String value)
	{
		privateTimezone = value;
	}

//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [DataMember] public virtual FormatType FormatType {get;set;}
	private Moosend.API.Client.FormatType privateFormatType;
	public Moosend.API.Client.FormatType getFormatType()
	{
		return privateFormatType;
	}
	public void setFormatType(Moosend.API.Client.FormatType value)
	{
		privateFormatType = value;
	}

//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [DataMember] public virtual ABCampaignData ABCampaignData {get;internal set;}
	private ABCampaignData privateABCampaignData;
	public ABCampaignData getABCampaignData()
	{
		return privateABCampaignData;
	}
	public void setABCampaignData(ABCampaignData value)
	{
		privateABCampaignData = value;
	}

//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [DataMember] public virtual MailingList MailingList {get;set;}
	private MailingList privateMailingList;
	public MailingList getMailingList()
	{
		return privateMailingList;
	}
	public void setMailingList(MailingList value)
	{
		privateMailingList = value;
	}

//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [DataMember] public virtual String ConfirmationTo {get;set;}
	private String privateConfirmationTo;
	public String getConfirmationTo()
	{
		return privateConfirmationTo;
	}
	public void setConfirmationTo(String value)
	{
		privateConfirmationTo = value;
	}

//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [DataMember] public virtual CampaignStatus Status {get;internal set;}
	private Moosend.API.Client.CampaignStatus privateStatus;
	public Moosend.API.Client.CampaignStatus getStatus()
	{
		return privateStatus;
	}
	public void setStatus(Moosend.API.Client.CampaignStatus value)
	{
		privateStatus = value;
	}

//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [DataMember] public virtual Segment Segment {get;set;}
	private Segment privateSegment;
	public Segment getSegment()
	{
		return privateSegment;
	}
	public void setSegment(Segment value)
	{
		privateSegment = value;
	}

//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [DataMember] public virtual bool IsTransactional {get;internal set;}
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
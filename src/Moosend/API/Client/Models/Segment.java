package Moosend.API.Client.Models;


public class Segment implements java.io.Serializable
{
	public Segment()
	{
        this.privateCriteria = new java.util.ArrayList<SegmentCriteria>();
	}

	public Segment(java.util.UUID mailingListID)
	{
		//mailingListID.CheckNotNull("mailingListID");
		this.privateCriteria = new java.util.ArrayList<SegmentCriteria>();
		this.privateMailingListID = mailingListID;
	}


	public Segment(MailingList mailingList, String name)
	{
		this(mailingList, name, Moosend.API.Client.SegmentMatchType.All);
	}


	public Segment(MailingList mailingList, String name, Moosend.API.Client.SegmentMatchType matchType)
	{
        if(matchType == null){
            matchType = Moosend.API.Client.SegmentMatchType.All;
        }
        this.privateCriteria = new java.util.ArrayList<SegmentCriteria>();
		this.privateMailingListID = mailingList.getID();
		this.privateName = name;
		this.privateMatchType = matchType;
	}


	private int privateID;
	public int getID()
	{
		return privateID;
	}
	public void setID(int value)
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


    //@DataMember
	private Moosend.API.Client.SegmentMatchType privateMatchType;
	public Moosend.API.Client.SegmentMatchType getMatchType()
	{
		return privateMatchType;
	}
	public void setMatchType(Moosend.API.Client.SegmentMatchType value)
	{
		privateMatchType = value;
	}


	private java.util.List<SegmentCriteria> privateCriteria;
	public java.util.List<SegmentCriteria> getCriteria()
	{
		return privateCriteria;
	}
	public void setCriteria(java.util.List<SegmentCriteria> value)
	{
		privateCriteria = value;
	}


	private long privateMemberCount;
	public long getMemberCount()
	{
		return privateMemberCount;
	}
	public void setMemberCount(long value)
	{
		privateMemberCount = value;
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

	private java.util.UUID privateMailingListID = null; //java.util.UUID.randomUUID();
	public java.util.UUID getMailingListID()
	{
		return privateMailingListID;
	}
	public void setMailingListID(java.util.UUID value)
	{
		privateMailingListID = value;
	}

}
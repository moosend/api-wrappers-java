package Moosend.API.Client.Models;

import Moosend.API.Client.*;

public class ABCampaignData implements java.io.Serializable
{
//ORIGINAL LINE: [DataMember] public virtual int ID {get;internal set;}
	private int privateID;
	public int getID()
	{
		return privateID;
	}
	public void setID(int value)
	{
		privateID = value;
	}

//ORIGINAL LINE: [DataMember] public virtual String SubjectB {get;set;}
	private String privateSubjectB;
	public String getSubjectB()
	{
		return privateSubjectB;
	}
	public void setSubjectB(String value)
	{
		privateSubjectB = value;
	}

//ORIGINAL LINE: [DataMember] public virtual String PlainContentB {get;set;}
	private String privatePlainContentB;
	public String getPlainContentB()
	{
		return privatePlainContentB;
	}
	public void setPlainContentB(String value)
	{
		privatePlainContentB = value;
	}

//ORIGINAL LINE: [DataMember] public virtual String HTMLContentB {get;set;}
	private String privateHTMLContentB;
	public String getHTMLContentB()
	{
		return privateHTMLContentB;
	}
	public void setHTMLContentB(String value)
	{
		privateHTMLContentB = value;
	}

//ORIGINAL LINE: [DataMember] public virtual String WebLocationB {get;set;}
	private String privateWebLocationB;
	public String getWebLocationB()
	{
		return privateWebLocationB;
	}
	public void setWebLocationB(String value)
	{
		privateWebLocationB = value;
	}

//ORIGINAL LINE: [DataMember] public virtual Sender SenderB {get;set;}
	private Sender privateSenderB;
	public Sender getSenderB()
	{
		return privateSenderB;
	}
	public void setSenderB(Sender value)
	{
		privateSenderB = value;
	}

//ORIGINAL LINE: [DataMember] public virtual int HoursToTest {get;set;}
	private int privateHoursToTest;
	public int getHoursToTest()
	{
		return privateHoursToTest;
	}
	public void setHoursToTest(int value)
	{
		privateHoursToTest = value;
	}

//ORIGINAL LINE: [DataMember] public virtual int ListPercentage {get;set;}
	private int privateListPercentage;
	public int getListPercentage()
	{
		return privateListPercentage;
	}
	public void setListPercentage(int value)
	{
		privateListPercentage = value;
	}

//ORIGINAL LINE: [DataMember] public virtual ABCampaignType ABCampaignType {get;set;}
	private ABCampaignType privateABCampaignType;
	public ABCampaignType getABCampaignType()
	{
		return privateABCampaignType;
	}
	public void setABCampaignType(ABCampaignType value)
	{
		privateABCampaignType = value;
	}

//ORIGINAL LINE: [DataMember] public virtual ABWinnerSelectionType ABWinnerSelectionType {get;set;}
	private ABWinnerSelectionType privateABWinnerSelectionType;
	public ABWinnerSelectionType getABWinnerSelectionType()
	{
		return privateABWinnerSelectionType;
	}
	public void setABWinnerSelectionType(ABWinnerSelectionType value)
	{
		privateABWinnerSelectionType = value;
	}

//ORIGINAL LINE: [DataMember] public virtual Nullable<DateTime> DeliveredOnA {get;set;}
	private java.util.Date privateDeliveredOnA;
	public java.util.Date getDeliveredOnA()
	{
		return privateDeliveredOnA;
	}
	public void setDeliveredOnA(java.util.Date value)
	{
		privateDeliveredOnA = value;
	}

//ORIGINAL LINE: [DataMember] public virtual Nullable<DateTime> DeliveredOnB {get;set;}
	private java.util.Date privateDeliveredOnB;
	public java.util.Date getDeliveredOnB()
	{
		return privateDeliveredOnB;
	}
	public void setDeliveredOnB(java.util.Date value)
	{
		privateDeliveredOnB = value;
	}
}
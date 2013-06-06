package Moosend.API.Client.Models;

public class CampaignParams
{
	/** 
	 The campaign name
	*/
	private String privateName;
	public final String getName()
	{
		return privateName;
	}
	public final void setName(String value)
	{
		privateName = value;
	}

	/** 
	 The subject of the emails for the new campaign
	*/
	private String privateSubject;
	public final String getSubject()
	{
		return privateSubject;
	}
	public final void setSubject(String value)
	{
		privateSubject = value;
	}

	/** 
	 The sender of the campaign
	*/
	private String privateSenderEmail;
	public final String getSenderEmail()
	{
		return privateSenderEmail;
	}
	public final void setSenderEmail(String value)
	{
		privateSenderEmail = value;
	}

	/** 
	 The email address to which recipients replies will arrive. It must be one of your sender accounts. If not specified, the sender's email will be assumed.
	*/
	private String privateReplyToEmail;
	public final String getReplyToEmail()
	{
		return privateReplyToEmail;
	}
	public final void setReplyToEmail(String value)
	{
		privateReplyToEmail = value;
	}

	/** 
	 The email address to which a confirmation message will be sent when the campaign has been successfully sent. This can be any valid email address. It does not have to be one of your sender signatures. If not specified, the sender's email will be assumed.
	*/
	private String privateConfirmationToEmail;
	public final String getConfirmationToEmail()
	{
		return privateConfirmationToEmail;
	}
	public final void setConfirmationToEmail(String value)
	{
		privateConfirmationToEmail = value;
	}

	/** 
	 A url to retrieve the html content for the campaign. We'll automatically move all CSS inline.
	*/
	private String privateWebLocation;
	public final String getWebLocation()
	{
		return privateWebLocation;
	}
	public final void setWebLocation(String value)
	{
		privateWebLocation = value;
	}

	/** 
	 The ID of a mailing list in your account to which the campaign will be sent to.
	*/
	private java.util.UUID privateMailingListID = null; //java.util.UUID.randomUUID();
	public final java.util.UUID getMailingListID()
	{
		return privateMailingListID;
	}
	public final void setMailingListID(java.util.UUID value)
	{
		privateMailingListID = value;
	}

	/** 
	 The ID of a segment in the specified mailing list to filter the recipients with. If not specified, the campaign will be sent to all active members of the mailing list.
	*/
	private int privateSegmentID;
	public final int getSegmentID()
	{
		return privateSegmentID;
	}
	public final void setSegmentID(int value)
	{
		privateSegmentID = value;
	}

	/** 
	 Defines the way to split an AB campaign. If omitted, a regular campaign will be sent.
	*/
	private Moosend.API.Client.ABCampaignType privateABCampaignType;
	public final Moosend.API.Client.ABCampaignType getABCampaignType()
	{
		return privateABCampaignType;
	}
	public final void setABCampaignType(Moosend.API.Client.ABCampaignType value)
	{
		privateABCampaignType = value;
	}

	/** 
	 If you wish to send an AB split campaign with two different versions of the subject line (ABCampaignType=Subject), you must specify the second subject using this parameter. If specified in any other campaign type, it will be ignored.
	*/
	private String privateSubjectB;
	public final String getSubjectB()
	{
		return privateSubjectB;
	}
	public final void setSubjectB(String value)
	{
		privateSubjectB = value;
	}

	/** 
	 If you wish to send an AB split campaign with two different versions of the html content (ABCampaignType=Content), you must specify where the second html content will be retrieved from using this parameter. If specified in any other campaign type, it will be ignored.
	*/
	private String privateWebLocationB;
	public final String getWebLocationB()
	{
		return privateWebLocationB;
	}
	public final void setWebLocationB(String value)
	{
		privateWebLocationB = value;
	}

	/** 
	 If you wish to send an AB split campaign with two different versions of the sender (ABCampaignType=Sender), you must specify the second sender email address using this parameter. This must be one of your sender signatures defined in your account. If specified in any other campaign type, it will be ignored.
	*/
	private String privateSenderEmailB;
	public final String getSenderEmailB()
	{
		return privateSenderEmailB;
	}
	public final void setSenderEmailB(String value)
	{
		privateSenderEmailB = value;
	}

	/** 
	 If you choose to send an AB campaign type, you must set this parameter to specify how long the test will run, before determining which will be the winning version to be sent to the rest of the recipients. This should be an integer value between 1 and 24. If specified in a regural campaign, it will be ingored.
	*/
	private int privateHoursToTest;
	public final int getHoursToTest()
	{
		return privateHoursToTest;
	}
	public final void setHoursToTest(int value)
	{
		privateHoursToTest = value;
	}

	/** 
	 If you choose to send an AB campaign type, you must set this parameter to specify a portion of the target recipients that will receive the test versions. For example, if you specify 10, then 10% of your recipients will recieve the A version and another 10% will receive the B version. The specified value should be an integer between 5 and 40. If specified in a regural campaign, it will be ignored.
	*/
	private int privateListPercentage;
	public final int getListPercentage()
	{
		return privateListPercentage;
	}
	public final void setListPercentage(int value)
	{
		privateListPercentage = value;
	}

	/** 
	 Specifies the method to determine the winning version of an AB campaign after the the test has ended.
	 If not set, OpenRate will be assumed. If specified in a regural campaign, it will be ignored.
	*/
	private Moosend.API.Client.ABWinnerSelectionType privateABWinnerSelectionType;
	public final Moosend.API.Client.ABWinnerSelectionType getABWinnerSelectionType()
	{
		return privateABWinnerSelectionType;
	}
	public final void setABWinnerSelectionType(Moosend.API.Client.ABWinnerSelectionType value)
	{
		privateABWinnerSelectionType = value;
	}

}
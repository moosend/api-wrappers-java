package Moosend.API.Client.Models;


public class SegmentCriteria implements java.io.Serializable
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


	private int privateSegmentID;
	public int getSegmentID()
	{
		return privateSegmentID;
	}
	public void setSegmentID(int value)
	{
		privateSegmentID = value;
	}


	private Moosend.API.Client.SegmentCriteriaField privateField;
	public Moosend.API.Client.SegmentCriteriaField getField()
	{
		return privateField;
	}
	public void setField(Moosend.API.Client.SegmentCriteriaField value)
	{
		privateField = value;
	}


	private java.util.UUID privateCustomFieldID;
	public java.util.UUID getCustomFieldID()
	{
		return privateCustomFieldID;
	}
	public void setCustomFieldID(java.util.UUID value)
	{
		privateCustomFieldID = value;
	}


	private Moosend.API.Client.SegmentCriteriaComparer privateComparer;
	public Moosend.API.Client.SegmentCriteriaComparer getComparer()
	{
		return privateComparer;
	}
	public void setComparer(Moosend.API.Client.SegmentCriteriaComparer value)
	{
		privateComparer = value;
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


	private java.util.Date privateDateFrom;
	public java.util.Date getDateFrom()
	{
		return privateDateFrom;
	}
	public void setDateFrom(java.util.Date value)
	{
		privateDateFrom = value;
	}


	private java.util.Date privateDateTo;
	public java.util.Date getDateTo()
	{
		return privateDateTo;
	}
	public void setDateTo(java.util.Date value)
	{
		privateDateTo = value;
	}

}
package Moosend.API.Client.Serialization;


//ORIGINAL LINE: [Serializable][DataContract(Namespace = "")] internal class SerializablePagingInfo
public class SerializablePagingInfo implements java.io.Serializable
{

//ORIGINAL LINE: [DataMember] public int PageSize {get;set;}
	private int privatePageSize;
	public final int getPageSize()
	{
		return privatePageSize;
	}
	public final void setPageSize(int value)
	{
		privatePageSize = value;
	}


//ORIGINAL LINE: [DataMember] public int CurrentPage {get;set;}
	private int privateCurrentPage;
	public final int getCurrentPage()
	{
		return privateCurrentPage;
	}
	public final void setCurrentPage(int value)
	{
		privateCurrentPage = value;
	}


//ORIGINAL LINE: [DataMember] public string SortExpression {get;set;}
	private String privateSortExpression;
	public final String getSortExpression()
	{
		return privateSortExpression;
	}
	public final void setSortExpression(String value)
	{
		privateSortExpression = value;
	}


//ORIGINAL LINE: [DataMember] public Boolean SortIsAscending {get;set;}
	private boolean privateSortIsAscending;
	public final boolean getSortIsAscending()
	{
		return privateSortIsAscending;
	}
	public final void setSortIsAscending(boolean value)
	{
		privateSortIsAscending = value;
	}


//ORIGINAL LINE: [DataMember] public long TotalResults {get;set;}
	private long privateTotalResults;
	public final long getTotalResults()
	{
		return privateTotalResults;
	}
	public final void setTotalResults(long value)
	{
		privateTotalResults = value;
	}

}
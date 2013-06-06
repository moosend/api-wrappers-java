package Moosend.API.Client;

/** 
 Represents an object to store paging information
*/
public class PagingInfo implements java.io.Serializable
{
	public static PagingInfo getAll()
	{
		return new PagingInfo(0, 1);
	}

	/** 
	 Instantiate a new paging information object starting at the first page with the given number of entries (pageSize) per page
	*/
	public PagingInfo(int pageSize)
	{
		setPageSize(pageSize);
		setCurrentPage(1);
	}

	/** 
	 Instantiate a new paging information object starting at currentPage with the given number of entries (pageSize) per page
	*/
	public PagingInfo(int pageSize, int currentPage)
	{
		setPageSize(pageSize);
		setCurrentPage(currentPage);
	}

	/** 
	 Get the page size
	*/
	private int privatePageSize;
	public final int getPageSize()
	{
		return privatePageSize;
	}
	public final void setPageSize(int value)
	{
		privatePageSize = value;
	}

	/** 
	 Get the current page
	*/
	private int privateCurrentPage;
	public final int getCurrentPage()
	{
		return privateCurrentPage;
	}
	public final void setCurrentPage(int value)
	{
		privateCurrentPage = value;
	}

	private String privateSortExpression;
	public final String getSortExpression()
	{
		return privateSortExpression;
	}
	public final void setSortExpression(String value)
	{
		privateSortExpression = value;
	}

	private boolean privateSortIsAscending;
	public final boolean getSortIsAscending()
	{
		return privateSortIsAscending;
	}
	public final void setSortIsAscending(boolean value)
	{
		privateSortIsAscending = value;
	}

	@Override
	public boolean equals(Object obj)
	{
		PagingInfo p = (PagingInfo)((obj instanceof PagingInfo) ? obj : null);
		if (p == null)
		{
			return false;
		}

		if (this.getPageSize() != p.getPageSize())
		{
			return false;
		}
		if (this.getCurrentPage() != p.getCurrentPage())
		{
			return false;
		}

		return true;
	}
}
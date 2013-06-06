package Moosend.API.Client;


public class PagedList<T> extends java.util.ArrayList<T> implements java.io.Serializable // TODO implements IPagableCollection 
{
	public PagedList()
	{
		this.setPagingInfo(PagingInfo.getAll());
	}

	public PagedList(PagingInfo pagingInfo)
	{
		if (pagingInfo == null)
		{
			throw new IllegalArgumentException("pagingInfo");
		}

		this.setPagingInfo(pagingInfo);
	}

	public PagedList(java.util.List<T> list, PagingInfo pagingInfo)
	{
		if (pagingInfo == null)
		{
			throw new IllegalArgumentException("pagingInfo");
		}

		if (list != null)
		{
			this.addAll(list);
		}

		this.setPagingInfo(pagingInfo);
	}

	private PagingInfo privatePagingInfo;
	public final PagingInfo getPagingInfo()
	{
		return privatePagingInfo;
	}
	public void setPagingInfo(PagingInfo value)
	{
		privatePagingInfo = value;
	}

	private long privateTotalResults;
	public final long getTotalResults()
	{
		return privateTotalResults;
	}
	public final void setTotalResults(long value)
	{
		privateTotalResults = value;
	}

	public final int getTotalPageCount()
	{
		return (int)Math.ceil(getTotalResults() / (double)getPagingInfo().getPageSize());
	}

	public final boolean getCanPage()
	{
		return getHasNext() || getHasPrevious();
	}


	public final boolean getHasNext()
	{
		return getPagingInfo().getCurrentPage() < getTotalPageCount();
	}

	public final boolean getHasPrevious()
	{
		return getPagingInfo().getCurrentPage() > 1;
	}
}
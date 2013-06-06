package Moosend.API.Client.Serialization;

import Moosend.API.Client.*;
//import java.util.HashSet;


//ORIGINAL LINE: [Serializable][DataContract(Namespace = "")] internal class SerializablePagedList<T>
public class SerializablePagedList<T> implements java.io.Serializable
{
	private PagedList<T> _PagedList;


//ORIGINAL LINE: [DataMember] public PagedList<T> PagedList
	public PagedList<T> getPagedList()
	{
			// update properties of PagedList from the deserialized properties of SerializablePagedList 
			// before returning the expected PagedList object to the user
		UpdateList();
		return _PagedList;
	}
	public void setPagedList(PagedList<T> value)
	{
		_PagedList = value;
	}


//ORIGINAL LINE: [DataMember(Name = "Paging")] public SerializablePagingInfo PagingInfo {get;set;}
	private SerializablePagingInfo privatePagingInfo;
	public final SerializablePagingInfo getPagingInfo()
	{
		return privatePagingInfo;
	}
	public final void setPagingInfo(SerializablePagingInfo value)
	{
		privatePagingInfo = value;
	}

	private void UpdateList()
	{
		if (_PagedList != null && this.getPagingInfo() != null)
		{
			if (_PagedList.getPagingInfo() != null)
			{
                PagingInfo pageInfo = _PagedList.getPagingInfo();
				pageInfo.setCurrentPage(this.getPagingInfo().getCurrentPage());
				pageInfo.setPageSize(this.getPagingInfo().getPageSize());
				pageInfo.setSortExpression(this.getPagingInfo().getSortExpression());
				pageInfo.setSortIsAscending(this.getPagingInfo().getSortIsAscending());   
                
                _PagedList.setPagingInfo(pageInfo);
                
			}
			_PagedList.setTotalResults(this.getPagingInfo().getTotalResults());
		}
	}

}
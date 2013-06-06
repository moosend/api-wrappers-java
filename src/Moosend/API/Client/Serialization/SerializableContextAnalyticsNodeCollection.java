package Moosend.API.Client.Serialization;

import Moosend.API.Client.Models.*;
import Moosend.API.Client.*;

//ORIGINAL LINE: [Serializable][DataContract(Namespace = "")] internal class SerializableContextAnalyticsNodeCollection : SerializablePagedList<ContextAnalyticsNode>
public class SerializableContextAnalyticsNodeCollection extends SerializablePagedList<ContextAnalyticsNode> implements java.io.Serializable
{

    //ORIGINAL LINE: [DataMember(Name = "Analytics")] public new PagedList<ContextAnalyticsNode> PagedList
	public final PagedList<ContextAnalyticsNode> getPagedList()
	{
		return super.getPagedList();
	}
	public final void setPagedList(PagedList<ContextAnalyticsNode> value)
	{
		super.setPagedList(value);
	}
}
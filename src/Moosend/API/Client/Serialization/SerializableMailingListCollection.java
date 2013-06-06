package Moosend.API.Client.Serialization;

import Moosend.API.Client.Models.*;
import Moosend.API.Client.*;


//ORIGINAL LINE: [Serializable][DataContract(Namespace = "")] internal class SerializableMailingListCollection : SerializablePagedList<MailingList>
public class SerializableMailingListCollection extends SerializablePagedList<MailingList> implements java.io.Serializable
{

    //ORIGINAL LINE: [DataMember(Name = "MailingLists")] public new PagedList<MailingList> PagedList
	public final PagedList<MailingList> getPagedList()
	{
		return super.getPagedList();
	}
	public final void setPagedList(PagedList<MailingList> value)
	{
		super.setPagedList(value);
	}
}
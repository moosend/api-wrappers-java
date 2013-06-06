package Moosend.API.Client.Serialization;

import Moosend.API.Client.Models.*;
import Moosend.API.Client.*;


//ORIGINAL LINE: [Serializable][DataContract(Namespace = "")] internal class SerializableMailingListMemberCollection : SerializablePagedList<MailingListMember>
public class SerializableMailingListMemberCollection extends SerializablePagedList<MailingListMember> implements java.io.Serializable
{

//ORIGINAL LINE: [DataMember(Name = "MailingListMembers")] public new PagedList<MailingListMember> PagedList
	public final PagedList<MailingListMember> getPagedList()
	{
		return super.getPagedList();
	}
	public final void setPagedList(PagedList<MailingListMember> value)
	{
		super.setPagedList(value);
	}
}
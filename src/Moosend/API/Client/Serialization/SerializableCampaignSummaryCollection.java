package Moosend.API.Client.Serialization;

import Moosend.API.Client.Models.*;
import Moosend.API.Client.*;


//ORIGINAL LINE: [Serializable][DataContract(Namespace = "")] internal class SerializableCampaignSummaryCollection : SerializablePagedList<CampaignSummary>
public class SerializableCampaignSummaryCollection extends SerializablePagedList<CampaignSummary> implements java.io.Serializable
{

//ORIGINAL LINE: [DataMember(Name = "Campaigns")] public new PagedList<CampaignSummary> PagedList
	@Override
    public final PagedList<CampaignSummary> getPagedList()
	{
		return super.getPagedList();
	}
    
    @Override
	public final void setPagedList(PagedList<CampaignSummary> value)
	{
		super.setPagedList(value);
	}
}
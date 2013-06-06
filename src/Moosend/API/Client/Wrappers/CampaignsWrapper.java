package Moosend.API.Client.Wrappers;

import Moosend.API.Client.*;
import Moosend.API.Client.Models.*;
import Moosend.API.Client.Serialization.*;

public class CampaignsWrapper
{
	private ApiManager _Manager;

	public CampaignsWrapper(ApiManager manager)
	{
		_Manager = manager;
	}

	public final Sender FindSender(final String email) throws Exception
	{
        Object parameters = new Object() {
            public final String Email = email;
        };
		return _Manager.<Sender>MakeRequest(HttpMethod.GET, "/campaigns/senders/find", parameters);
	}

	public final java.util.List<Sender> GetSenders() throws Exception
	{
		return _Manager.<java.util.List<Sender>>MakeRequest(HttpMethod.GET, "/campaigns/senders");
	}

	public final java.util.UUID Create(CampaignParams campaignParams) throws Exception
	{
		return _Manager.<java.util.UUID>MakeRequest(HttpMethod.POST, "/campaigns/create", campaignParams);
	}

	public final void Save(Campaign campaign) throws Exception
	{
		if (campaign.getID() == null)
		{
			CampaignParams tempVar = new CampaignParams();
			tempVar.setConfirmationToEmail(campaign.getConfirmationTo());
			tempVar.setName(campaign.getName());
			tempVar.setSubject(campaign.getSubject());
			tempVar.setWebLocation(campaign.getWebLocation());
			CampaignParams data = tempVar;

			if (campaign.getMailingList() != null)
			{
				data.setMailingListID(campaign.getMailingList().getID());
			}
			if (campaign.getSegment() != null)
			{
				data.setSegmentID(campaign.getSegment().getID());
			}
			if (campaign.getSender() != null)
			{
				data.setSenderEmail(campaign.getSender().getEmail());
			}
			if (campaign.getReplyToEmail() != null)
			{
				data.setReplyToEmail(campaign.getReplyToEmail().getEmail());
			}
			else
			{
				campaign.setReplyToEmail(campaign.getSender());
			}

			if (campaign.getABCampaignData() != null)
			{
				data.setABCampaignType(campaign.getABCampaignData().getABCampaignType());
				data.setABWinnerSelectionType(campaign.getABCampaignData().getABWinnerSelectionType());
				data.setHoursToTest(campaign.getABCampaignData().getHoursToTest());
				data.setListPercentage(campaign.getABCampaignData().getListPercentage());
				if (campaign.getABCampaignData().getSenderB() != null)
				{
					data.setSenderEmailB(campaign.getABCampaignData().getSenderB().getEmail());
				}
				data.setSubjectB(campaign.getABCampaignData().getSubjectB());
				data.setWebLocationB(campaign.getABCampaignData().getWebLocationB());
			}
			campaign.setID(Create(data));
		}
		else
		{
			Update(campaign);
		}
		Campaign reloaded = FindByID(campaign.getID());
		Utilities.<Campaign>CopyProperties(reloaded, campaign);
	}

	public final Campaign Clone(final java.util.UUID campaignID) throws Exception
	{
        Object parameters = new Object() {
            public final java.util.UUID CampaignID = campaignID;
        };
        
		return _Manager.<Campaign>MakeRequest(HttpMethod.POST, "/campaigns/clone", parameters);
	}

	public final void SendTest(java.util.UUID campaignID, final java.util.List<String> emails) throws Exception
	{
        Object parameters = new Object() {
            public final java.util.List<String> TestEmails = emails;
        };
		_Manager.doMakeRequest(HttpMethod.POST, String.format("/campaigns/%1$s/send_test", campaignID), parameters);
	}

	public final void Send(java.util.UUID campaignID) throws Exception
	{
		_Manager.doMakeRequest(HttpMethod.POST, String.format("/campaigns/%1$s/send", campaignID));
	}

	public final void Update(Campaign campaign) throws Exception
	{
		CampaignParams tempVar = new CampaignParams();
		tempVar.setName(campaign.getName());
		tempVar.setSubject(campaign.getSubject());
		tempVar.setWebLocation(campaign.getWebLocation());
		tempVar.setConfirmationToEmail(campaign.getConfirmationTo());
		CampaignParams cp = tempVar;

		if (campaign.getSender() != null)
		{
			cp.setSenderEmail(campaign.getSender().getEmail());
		}
		else
		{
			cp.setSenderEmail(null);
		}

		if (campaign.getReplyToEmail() != null)
		{
			cp.setReplyToEmail(campaign.getReplyToEmail().getEmail());
		}
		else
		{
			cp.setReplyToEmail(null);
		}

		if (campaign.getMailingList() != null)
		{
			cp.setMailingListID(campaign.getMailingList().getID());
		}
		else
		{
			//cp.MailingListID = Guid.Empty;
		}

		if (campaign.getSegment() != null)
		{
			cp.setSegmentID(campaign.getSegment().getID());
		}
		else
		{
			cp.setSegmentID(0);
		}

		if (campaign.getABCampaignData() != null)
		{
			cp.setABCampaignType(campaign.getABCampaignData().getABCampaignType());
			cp.setABWinnerSelectionType(campaign.getABCampaignData().getABWinnerSelectionType());
			cp.setHoursToTest(campaign.getABCampaignData().getHoursToTest());
			cp.setListPercentage(campaign.getABCampaignData().getListPercentage());
			cp.setSubjectB(campaign.getABCampaignData().getSubjectB());
			cp.setWebLocationB(campaign.getABCampaignData().getWebLocationB());

			if (campaign.getABCampaignData().getSenderB() != null)
			{
				cp.setSenderEmailB(campaign.getABCampaignData().getSenderB().getEmail());
			}
			else
			{
				cp.setSenderEmailB(null);
			}
		}
		_Manager.doMakeRequest(HttpMethod.POST, String.format("/campaigns/%1$s/update", campaign.getID()), cp);
	}

	public final void Delete(java.util.UUID campaignID) throws Exception
	{
		_Manager.doMakeRequest(HttpMethod.POST, String.format("/campaigns/%1$s/delete", campaignID));
	}

	public final Campaign FindByID(java.util.UUID campaignID) throws Exception
	{
		return _Manager.<Campaign>MakeRequest(HttpMethod.GET, String.format("/campaigns/%1$s/view", campaignID));
	}

	public final CampaignStatisticsSummary FindByIDWithStatistics(java.util.UUID campaignID) throws Exception
	{
		return _Manager.<CampaignStatisticsSummary>MakeRequest(HttpMethod.GET, String.format("/campaigns/%1$s/view_summary", campaignID));
	}

	public final PagedList<ContextAnalyticsNode> GetGeographicsActivity(java.util.UUID campaignID) throws Exception
	{
		return _Manager.<SerializableContextAnalyticsNodeCollection>MakeRequest(HttpMethod.GET, String.format("/campaigns/%1$s/stats/countries", campaignID)).getPagedList();
	}

	public final PagedList<ContextAnalyticsNode> GetLinksActivity(java.util.UUID campaignID) throws Exception
	{
		return _Manager.<SerializableContextAnalyticsNodeCollection>MakeRequest(HttpMethod.GET, String.format("/campaigns/%1$s/stats/links", campaignID)).getPagedList();
	}


	public final PagedList<ContextAnalyticsNode> GetEventsByType(java.util.UUID campaignID, MailStatus type, int page, int pageSize, java.util.Date from) throws Exception
	{
		return GetEventsByType(campaignID, type, page, pageSize, from, null);
	}

	public final PagedList<ContextAnalyticsNode> GetEventsByType(java.util.UUID campaignID, MailStatus type, int page, int pageSize) throws Exception
	{
		return GetEventsByType(campaignID, type, page, pageSize, null, null);
	}

	public final PagedList<ContextAnalyticsNode> GetEventsByType(java.util.UUID campaignID, MailStatus type, int page) throws Exception
	{
		return GetEventsByType(campaignID, type, page, 50, null, null);
	}

	public final PagedList<ContextAnalyticsNode> GetEventsByType(java.util.UUID campaignID, MailStatus type) throws Exception
	{
		return GetEventsByType(campaignID, type, 1, 50, null, null);
	}

	public final PagedList<ContextAnalyticsNode> GetEventsByType(java.util.UUID campaignID) throws Exception
	{
		return GetEventsByType(campaignID, MailStatus.Sent, 1, 50, null, null);
	}


    //ORIGINAL LINE: public PagedList<ContextAnalyticsNode> GetEventsByType(Guid campaignID, MailStatus type = MailStatus.Sent, int page = 1, int pageSize = 50, Nullable<DateTime> from = null, Nullable<DateTime> to = null)
	public final PagedList<ContextAnalyticsNode> GetEventsByType(java.util.UUID campaignID, MailStatus type, int page, int pageSize, java.util.Date from, java.util.Date to) throws Exception
	{
        type = (type==null)? MailStatus.Sent : type;
        page = (page > 0)? page : 1;
        pageSize = (pageSize > 0)? pageSize : 50;        
		return _Manager.<SerializableContextAnalyticsNodeCollection>MakeRequest(HttpMethod.GET, String.format("/campaigns/%1$s/stats/%2$s", campaignID, type.toString())).getPagedList();
	}


	public final PagedList<CampaignSummary> FindAll(int page) throws Exception
	{
		return FindAll(page, 10);
	}

	public final PagedList<CampaignSummary> FindAll() throws Exception
	{
		return FindAll(1, 10);
	}

    
    //ORIGINAL LINE: public PagedList<CampaignSummary> FindAll(int page = 1, int pageSize = 10)
	public final PagedList<CampaignSummary> FindAll(int page, int pageSize) throws Exception
	{
        page = (page > 0)? page : 1;
        pageSize = (pageSize > 0)? pageSize : 50;     
		return _Manager.<SerializableCampaignSummaryCollection>MakeRequest(HttpMethod.GET, String.format("/campaigns/%1$s/%2$s", page, pageSize)).getPagedList();
	}

}
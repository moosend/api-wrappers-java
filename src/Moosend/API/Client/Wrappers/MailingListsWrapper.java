package Moosend.API.Client.Wrappers;

import Moosend.API.Client.*;
import Moosend.API.Client.Models.*;
import Moosend.API.Client.Serialization.*;
import java.util.*;

public class MailingListsWrapper
{
	private ApiManager _Manager;

	public MailingListsWrapper(ApiManager manager)
	{
		_Manager = manager;
	}

	public final PagedList<MailingList> FindAllActive(int page) throws Exception
	{
		return FindAllActive(page, 10);
	}

	public final PagedList<MailingList> FindAllActive() throws Exception
	{
		return FindAllActive(1, 10);
	}

//ORIGINAL LINE: public PagedList<MailingList> FindAllActive(int page = 1, int pageSize = 10)
	public final PagedList<MailingList> FindAllActive(int page, int pageSize) throws Exception
	{           
        PagedList<MailingList> lists = _Manager.<SerializableMailingListCollection>MakeRequest(HttpMethod.GET, String.format("/lists/%1$s/%2$s", page, pageSize)).getPagedList();
		for (MailingList list : lists)
		{
			for (CustomFieldDefinition customField : list.getCustomFieldsDefinition())
			{
				customField.setMailingListID(list.getID());
			}
		}
		return lists;
	}

	public final UUID Create(String name, String confirmationPage) throws Exception
	{
		return Create(name, confirmationPage, null);
	}

	public final UUID Create(String name) throws Exception
	{
		return Create(name, null, null);
	}

//ORIGINAL LINE: public Guid Create(String name, String confirmationPage = null, String redirectAfterUnsubscribePage = null)
	public final UUID Create(final String name, final String confirmationPage, final String redirectAfterUnsubscribePage) throws Exception
	{
        Object parameters = new Object(){
            public final String Name = name;
            public final String ConfirmationPage = confirmationPage;
            public final String RedirectAfterUnsubscribePage = redirectAfterUnsubscribePage;
        };
		return _Manager.MakeRequest(HttpMethod.POST, "/lists/create", parameters);
	}

	public final UUID Update(MailingList list) throws Exception
	{
		return _Manager.<UUID>MakeRequest(HttpMethod.POST, String.format("/lists/%1$s/update", list.getID()), list);
	}


	public final PagedList<MailingListMember> GetMembers(UUID mailingListID, SubscribeType status, Date since, int page) throws Exception
	{
		return GetMembers(mailingListID, status, since, page, 500);
	}

	public final PagedList<MailingListMember> GetMembers(UUID mailingListID, SubscribeType status, Date since) throws Exception
	{
		return GetMembers(mailingListID, status, since, 1, 500);
	}

	public final PagedList<MailingListMember> GetMembers(UUID mailingListID, SubscribeType status) throws Exception
	{
		return GetMembers(mailingListID, status, null, 1, 500);
	}


//ORIGINAL LINE: public PagedList<MailingListMember> GetMembers(Guid mailingListID, SubscribeType status, Nullable<DateTime> since = null, int page = 1, int pageSize = 500)
	public final PagedList<MailingListMember> GetMembers(UUID mailingListID, SubscribeType status, final Date since, final int page, final int pageSize) throws Exception
	{
        Object parameters = new Object() {
            public final Date Since = since;
            public final int Page = page;
            public final int PageSize = pageSize;
        };
		return _Manager.<SerializableMailingListMemberCollection>MakeRequest(HttpMethod.GET, String.format("/lists/%1$s/subscribers/%2$s", mailingListID, status.toString()), parameters).getPagedList();
	}


	public final MailingList FindByID(UUID mailingListID) throws Exception
	{
		return FindByID(mailingListID, true);
	}


    //ORIGINAL LINE: public MailingList FindByID(Guid mailingListID, Boolean withStatistics = true)
	public final MailingList FindByID(UUID mailingListID, final boolean withStatistics) throws Exception
	{        
        Object parameters = new Object(){public final Boolean WithStatistics = withStatistics;}; 
		MailingList list = _Manager.MakeRequest(HttpMethod.GET, String.format("/lists/%1$s/details", mailingListID), parameters);
		for (CustomFieldDefinition customField : list.getCustomFieldsDefinition())
		{
			customField.setMailingListID(list.getID());
		}
		return list;
	}

	public final void Delete(UUID mailingListID) throws Exception
	{
		_Manager.doMakeRequest(HttpMethod.DELETE, String.format("/lists/%1$s/delete", mailingListID));
	}


	public final UUID CreateCustomField(UUID mailingListID, String name, CustomFieldType type, boolean isRequired) throws Exception
	{
		return CreateCustomField(mailingListID, name, type, isRequired, null);
	}


	public final UUID CreateCustomField(UUID mailingListID, final String name, final CustomFieldType type, final boolean isRequired, final String context) throws Exception
	{
        Object parameters = new Object(){
            public final String Name = name;
            public final CustomFieldType Type = type;
            public final Boolean IsRequired = isRequired;
            public final String Context = context;
        };
		return _Manager.<UUID>MakeRequest(HttpMethod.POST, String.format("/lists/%1$s/customfields/create", mailingListID), parameters);
	}

	public final void UpdateCustomField(UUID mailingListID, final CustomFieldDefinition customField) throws Exception
	{
        //C# TO JAVA CONVERTER TODO TASK: This type of object initializer has no direct Java equivalent:
        Object parameters = new Object(){
            public final String Name = customField.getName();
            public final CustomFieldType Type = customField.getType();
            public final Boolean IsRequired = customField.getIsRequired();
            public final String Context = customField.getContext();
        };
		_Manager.doMakeRequest(HttpMethod.POST, String.format("lists/%1$s/customfields/%2$s/update", mailingListID, customField.getID()), parameters);
	}

	public final void DeleteCustomField(UUID mailingListID, UUID customFieldID) throws Exception
	{
		_Manager.doMakeRequest(HttpMethod.DELETE, String.format("/lists/%1$s/customfields%2$s/delete", mailingListID, customFieldID));
	}

	public final List<Segment> GetSegments(UUID mailingListID) throws Exception
	{
		List<Segment> segments = _Manager.<List<Segment>>MakeRequest(HttpMethod.GET, String.format("/lists/%1$s/segments", mailingListID));
		for (Segment s : segments)
		{
			s.setMailingListID(mailingListID);
		}
		return segments;
	}


	private int CreateSegment(UUID mailingListID, String name) throws Exception
	{
		return CreateSegment(mailingListID, name, SegmentMatchType.All);
	}


//ORIGINAL LINE: private int CreateSegment(Guid mailingListID, String name, SegmentMatchType matchType = SegmentMatchType.All)
	private int CreateSegment(UUID mailingListID, final String name, final SegmentMatchType matchType) throws Exception
	{
        Object parameters = new Object(){
            public final String Name = name;
            public final SegmentMatchType MatchType = matchType;
        };
		return _Manager.<Integer>MakeRequest(HttpMethod.POST, String.format("/lists/%1$s/segments/create", mailingListID), parameters);
	}

	private void UpdateSegment(final Segment segment) throws Exception
	{
        Object parameters = new Object(){
            public final String Name = segment.getName();
            public final SegmentMatchType MatchType = segment.getMatchType();
        };
		_Manager.doMakeRequest(HttpMethod.POST, String.format("/lists/%1$s/segments/%2$s/update", segment.getMailingListID(), segment.getID()), parameters);
	}

	public final void DeleteSegment(java.util.UUID mailingListID, int segmentID) throws Exception
	{
		_Manager.doMakeRequest(HttpMethod.DELETE, String.format("/lists/%1$s/segments/%2$s/delete", mailingListID, segmentID));
	}

	public final void Save(MailingList list) throws Exception
	{
		// do some validation
		for (CustomFieldDefinition customField : list.getCustomFieldsDefinition())
		{
			if (customField.getMailingListID() != list.getID() && customField.getMailingListID() != null)
			{
				throw new UnsupportedOperationException("Cannot save custom field that belongs to another mailing list");
			}
		}

		if (list.getID() == null)
		{
			list.setID(Create(list.getName(), list.getConfirmationPage(), list.getRedirectAfterUnsubscribePage()));

			for (CustomFieldDefinition customField : list.getCustomFieldsDefinition())
			{
				CreateCustomField(list.getID(), customField.getName(), customField.getType(), customField.getIsRequired(), customField.getContext());
			}
		}
		else
		{
			Update(list);

			MailingList existing = FindByID(list.getID());

			ArrayList<UUID> existingCustomFieldIDs = new ArrayList<UUID>();
            for(Iterator<CustomFieldDefinition> i = existing.getCustomFieldsDefinition().iterator(); i.hasNext(); ) {
                CustomFieldDefinition item = i.next();
                existingCustomFieldIDs.add(item.getID());
            }
                        
			ArrayList<java.util.UUID> currentCustomFieldIDs = new ArrayList<UUID>();
            for(CustomFieldDefinition item : existing.getCustomFieldsDefinition()) {
                if(item.getID() != null){
                    currentCustomFieldIDs.add(item.getID());
                }                
            }            
			
            for(UUID idToDelete : existingCustomFieldIDs) {                 
                if(!currentCustomFieldIDs.contains(idToDelete)){
                    DeleteCustomField(list.getID(), idToDelete);
                }
			}            
            
            for(UUID idToUpdate : currentCustomFieldIDs) {                 
                if(existingCustomFieldIDs.contains(idToUpdate)){                    
                    for(CustomFieldDefinition customField : list.getCustomFieldsDefinition()){
                        if(customField.getID() == idToUpdate){
                            UpdateCustomField(list.getID(), customField);
                        }
                    }
                }
			}

			// find which custom fields where modified
			for (UUID idToUpdate : currentCustomFieldIDs) {
                if(existingCustomFieldIDs.contains(idToUpdate)) {
                    for(CustomFieldDefinition customField : list.getCustomFieldsDefinition()){
                        if(customField.getID() == idToUpdate) {
                            UpdateCustomField(list.getID(), customField);
                        }
                    }
                }
			}                

			// find which custom fields where added
			for (CustomFieldDefinition customField : list.getCustomFieldsDefinition()) {
                if(customField.getID() == null){
                    //list.CustomFieldsDefinition.Where(x => x.ID == Guid.Empty
                    CreateCustomField(list.getID(), customField.getName(), customField.getType(), customField.getIsRequired(), customField.getContext());
                }
			}
		}

		MailingList reloaded = FindByID(list.getID(), true);
		Utilities.<MailingList>CopyProperties(reloaded, list);
	}


public final void SaveSegment(Segment segment) throws Exception
	{
		// do some validation
		for (SegmentCriteria criteria : segment.getCriteria()) {
			if (criteria.getSegmentID() != segment.getID() && criteria.getSegmentID() != 0) {
				throw new UnsupportedOperationException("Cannot save criteria that belong to another segment");
			}
		}

		if (segment.getID() == 0)
		{
			// we are inserting a new segment
			segment.setID(CreateSegment(segment.getMailingListID(), segment.getName(), segment.getMatchType()));

			// inserting criteria for the new segment as well
			for (SegmentCriteria criteria : segment.getCriteria())
			{
				String field = criteria.getField().toString();
				if (criteria.getField() == SegmentCriteriaField.CustomField) {
					field = criteria.getCustomFieldID().toString();
				}
				AddSegmentCriteria(segment.getMailingListID(), segment.getID(), field, criteria.getComparer(), criteria.getValue(), criteria.getDateFrom(), criteria.getDateTo());
			}
		}
		else
		{
			// or we are updating an existing segment
			UpdateSegment(segment);

			// updating criteria for the existing segment as well
			// we will load the existing segment from the database to compare it with our modified segment
			Segment existing = FindSegmentByID(segment.getMailingListID(), segment.getID());

			ArrayList<Integer> existingCriteriaIDs = new ArrayList<Integer>();
            for(SegmentCriteria segmentCriteria : existing.getCriteria()){
                existingCriteriaIDs.add(segmentCriteria.getID());
            }                    

			ArrayList<Integer> segmentCriteriaIDs = new ArrayList<Integer>();            
            for(SegmentCriteria segmentCriteria : segment.getCriteria()){
                if(segmentCriteria.getID() != 0){
                    segmentCriteriaIDs.add(segmentCriteria.getID());
                }                
            }
            
			// find with criteria where deleted
			for (int idToDelete : existingCriteriaIDs) {
                if(!segmentCriteriaIDs.contains(idToDelete)){
                    RemoveSegmentCriteria(segment.getMailingListID(), segment.getID(), idToDelete);
                }
			}

			// find which criteria where modified
			for (int idToUpdate : segmentCriteriaIDs) {
                if(existingCriteriaIDs.contains(idToUpdate)){
                    for(SegmentCriteria criteria : segment.getCriteria()){
                        if(criteria.getID() == idToUpdate){				
                            UpdateSegmentCriteria(segment.getMailingListID(), segment.getID(), criteria);
                        }
                    }
                }
			}

			// find which criteria where added
			for (SegmentCriteria criteria : segment.getCriteria()) {
                if(criteria.getID() == 0){
                    String field = criteria.getField().toString();
                    if (criteria.getField() == SegmentCriteriaField.CustomField) {
                        field = criteria.getCustomFieldID().toString();
                    }
                    AddSegmentCriteria(segment.getMailingListID(), segment.getID(), field, criteria.getComparer(), criteria.getValue(), criteria.getDateFrom(), criteria.getDateTo());
                }
			}
		}

		// reload segment to populate the object with all properties
		Segment reloaded = FindSegmentByID(segment.getMailingListID(), segment.getID());
		Utilities.<Segment>CopyProperties(reloaded, segment);
	}



	private int AddSegmentCriteria(java.util.UUID mailingListID, int segmentID, String field, SegmentCriteriaComparer comparer, String value, java.util.Date dateFrom) throws Exception
	{
		return AddSegmentCriteria(mailingListID, segmentID, field, comparer, value, dateFrom, null);
	}

	private int AddSegmentCriteria(java.util.UUID mailingListID, int segmentID, String field, SegmentCriteriaComparer comparer, String value) throws Exception
	{
		return AddSegmentCriteria(mailingListID, segmentID, field, comparer, value, null, null);
	}

//ORIGINAL LINE: private int AddSegmentCriteria(Guid mailingListID, int segmentID, String field, SegmentCriteriaComparer comparer, String value, Nullable<DateTime> dateFrom = null, Nullable<DateTime> dateTo = null)
	private int AddSegmentCriteria(java.util.UUID mailingListID, int segmentID, final String field, final SegmentCriteriaComparer comparer, final String value, final java.util.Date dateFrom, final java.util.Date dateTo) throws Exception
	{
        Object parameters = new Object() {
            public final String Field = field;
            public final SegmentCriteriaComparer Comparer = comparer;
            public final String Value = value;
            public final java.util.Date DateFrom = dateFrom;
            public final java.util.Date DateTo = dateTo;
        };
		return _Manager.<Integer>MakeRequest(HttpMethod.POST, String.format("/lists/%1$s/segments/%2$s/criteria/add", mailingListID, segmentID), parameters);
	}

	private void UpdateSegmentCriteria(java.util.UUID mailingListID, int segmentID, final SegmentCriteria criteria) throws Exception
	{
        Object parameters = new Object() {
            public final SegmentCriteriaField Field = criteria.getField();
            public final SegmentCriteriaComparer Comparer = criteria.getComparer();
            public final String Value = criteria.getValue();
            public final java.util.Date DateFrom = criteria.getDateFrom();
            public final java.util.Date DateTo = criteria.getDateTo();
        };
		_Manager.doMakeRequest(HttpMethod.POST, String.format("/lists/%1$s/segments/%2$s/criteria/%3$s/update", mailingListID, segmentID, criteria.getID()), parameters);
	}

	private void RemoveSegmentCriteria(UUID mailingListID, int segmentID, int criteriaID) throws Exception
	{
		_Manager.doMakeRequest(HttpMethod.DELETE, String.format("/lists/%1$s/segments/%2$s/criteria/%3$s/delete", mailingListID, segmentID, criteriaID));
	}


	public final PagedList<MailingListMember> GetSegmentMembers(Segment segment, SubscribeType status, int page) throws Exception
	{
		return GetSegmentMembers(segment, status, page, 500);
	}

	public final PagedList<MailingListMember> GetSegmentMembers(Segment segment, SubscribeType status) throws Exception
	{
		return GetSegmentMembers(segment, status, 1, 500);
	}

	public final PagedList<MailingListMember> GetSegmentMembers(Segment segment) throws Exception
	{
		return GetSegmentMembers(segment, SubscribeType.Subscribed, 1, 500);
	}


//ORIGINAL LINE: public PagedList<MailingListMember> GetSegmentMembers(Segment segment, SubscribeType status = SubscribeType.Subscribed, int page = 1, int pageSize = 500)
	public final PagedList<MailingListMember> GetSegmentMembers(Segment segment, SubscribeType status, int page, int pageSize) throws Exception
	{
		return GetSegmentMembers(segment.getMailingListID(), segment.getID(), status, page, pageSize);
	}


	public final PagedList<MailingListMember> GetSegmentMembers(UUID mailingListID, int segmentID, SubscribeType status, int page) throws Exception
	{
		return GetSegmentMembers(mailingListID, segmentID, status, page, 500);
	}

	public final PagedList<MailingListMember> GetSegmentMembers(UUID mailingListID, int segmentID, SubscribeType status) throws Exception
	{
		return GetSegmentMembers(mailingListID, segmentID, status, 1, 500);
	}

	public final PagedList<MailingListMember> GetSegmentMembers(UUID mailingListID, int segmentID) throws Exception
	{
		return GetSegmentMembers(mailingListID, segmentID, SubscribeType.Subscribed, 1, 500);
	}

    
    //ORIGINAL LINE: public PagedList<MailingListMember> GetSegmentMembers(Guid mailingListID, int segmentID, SubscribeType status = SubscribeType.Subscribed, int page = 1, int pageSize = 500)
	public final PagedList<MailingListMember> GetSegmentMembers(UUID mailingListID, int segmentID, final SubscribeType status, final int page, final int pageSize) throws Exception
	{
        Object parameters = new Object(){
            public final SubscribeType Status = status;
            public final int Page = page;
            public final int PageSize = pageSize;
        };
		return _Manager.<SerializableMailingListMemberCollection>MakeRequest(HttpMethod.GET, String.format("/lists/%1$s/segments/%2$s/members", mailingListID, segmentID), parameters).getPagedList();
	}
        
	public final Segment FindSegmentByID(UUID mailingListID, int segmentID) throws Exception
	{
		Segment segment = _Manager.<Segment>MakeRequest(HttpMethod.GET, String.format("/lists/%1$s/segments/%2$s/details", mailingListID, segmentID));
		segment.setMailingListID(mailingListID);
		return segment;
	}

}
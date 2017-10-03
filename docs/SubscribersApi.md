# SubscribersApi

All URIs are relative to *https://api.moosend.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addingMultipleSubscribers**](SubscribersApi.md#addingMultipleSubscribers) | **POST** /subscribers/{MailingListID}/subscribe_many.{Format} | Adding multiple subscribers
[**addingSubscribers**](SubscribersApi.md#addingSubscribers) | **POST** /subscribers/{MailingListID}/subscribe.{Format} | Adding subscribers
[**getSubscriberByEmailAddress**](SubscribersApi.md#getSubscriberByEmailAddress) | **GET** /subscribers/{MailingListID}/view.{Format} | Get subscriber by email address
[**getSubscriberById**](SubscribersApi.md#getSubscriberById) | **GET** /subscribers/{MailingListID}/find/{SubscriberID}.{Format} | Get subscriber by id
[**gettingSubscribers**](SubscribersApi.md#gettingSubscribers) | **GET** /lists/{MailingListID}/subscribers/{Status}.{Format} | Getting subscribers
[**removingASubscriber**](SubscribersApi.md#removingASubscriber) | **POST** /subscribers/{MailingListID}/remove.{Format} | Removing a subscriber
[**removingMultipleSubscribers**](SubscribersApi.md#removingMultipleSubscribers) | **POST** /subscribers/{MailingListID}/remove_many.{Format} | Removing multiple subscribers
[**unsubscribingSubscribersFromAccount**](SubscribersApi.md#unsubscribingSubscribersFromAccount) | **POST** /subscribers/unsubscribe.{Format} | Unsubscribing subscribers from account
[**unsubscribingSubscribersFromMailingList**](SubscribersApi.md#unsubscribingSubscribersFromMailingList) | **POST** /subscribers/{MailingListID}/unsubscribe.{Format} | Unsubscribing subscribers from mailing list
[**unsubscribingSubscribersFromMailingListAndASpecifiedCampaign**](SubscribersApi.md#unsubscribingSubscribersFromMailingListAndASpecifiedCampaign) | **POST** /subscribers/{MailingListID}/{CampaignID}/unsubscribe.{Format} | Unsubscribing subscribers from mailing list and a specified campaign
[**updatingASubscriber**](SubscribersApi.md#updatingASubscriber) | **POST** /subscribers/{MailingListID}/update/{SubscriberID}.{Format} | Updating a subscriber


<a name="addingMultipleSubscribers"></a>
# **addingMultipleSubscribers**
> AddingMultipleSubscribersResponse addingMultipleSubscribers(format, apikey, mailingListID, body)

Adding multiple subscribers

This method allows you to add multiple subscribers in a mailing list with a single call. If some subscribers already exist with the given email addresses, they will be updated. If you try to add a subscriber with an invalid email address, this attempt will be ignored, as the process will skip to the next subscriber automatically.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubscribersApi;


SubscribersApi apiInstance = new SubscribersApi();
String format = "format_example"; // String | 
String apikey = "apikey_example"; // String | You may find your API Key or generate a new one in your account settings.
String mailingListID = "mailingListID_example"; // String | The ID of the mailing list to add subscribers to.
AddingMultipleSubscribersRequest body = new AddingMultipleSubscribersRequest(); // AddingMultipleSubscribersRequest | 
try {
    AddingMultipleSubscribersResponse result = apiInstance.addingMultipleSubscribers(format, apikey, mailingListID, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscribersApi#addingMultipleSubscribers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**|  | [enum: json, xml]
 **apikey** | **String**| You may find your API Key or generate a new one in your account settings. |
 **mailingListID** | **String**| The ID of the mailing list to add subscribers to. |
 **body** | [**AddingMultipleSubscribersRequest**](AddingMultipleSubscribersRequest.md)|  |

### Return type

[**AddingMultipleSubscribersResponse**](AddingMultipleSubscribersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addingSubscribers"></a>
# **addingSubscribers**
> AddingSubscribersResponse addingSubscribers(format, mailingListID, apikey, body)

Adding subscribers

Adds a new subscriber to the specified mailing list. If there is already a subscriber with the specified email address in the list, an update will be performed instead.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubscribersApi;


SubscribersApi apiInstance = new SubscribersApi();
String format = "format_example"; // String | 
String mailingListID = "mailingListID_example"; // String | The ID of the mailing list to add the new member.
String apikey = "apikey_example"; // String | You may find your API Key or generate a new one in your account settings.
AddingSubscribersRequest body = new AddingSubscribersRequest(); // AddingSubscribersRequest | 
try {
    AddingSubscribersResponse result = apiInstance.addingSubscribers(format, mailingListID, apikey, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscribersApi#addingSubscribers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**|  | [enum: json, xml]
 **mailingListID** | **String**| The ID of the mailing list to add the new member. |
 **apikey** | **String**| You may find your API Key or generate a new one in your account settings. |
 **body** | [**AddingSubscribersRequest**](AddingSubscribersRequest.md)|  |

### Return type

[**AddingSubscribersResponse**](AddingSubscribersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSubscriberByEmailAddress"></a>
# **getSubscriberByEmailAddress**
> GetSubscriberByEmailAddressResponse getSubscriberByEmailAddress(format, apikey, mailingListID, email)

Get subscriber by email address

Searches for a subscriber with the specified email address in the specified mailing list and returns detailed information such as id, name, date created, date unsubscribed, status and custom fields

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubscribersApi;


SubscribersApi apiInstance = new SubscribersApi();
String format = "format_example"; // String | 
String apikey = "apikey_example"; // String | You may find your API Key or generate a new one in your account settings.
String mailingListID = "mailingListID_example"; // String | The ID of the mailing list where the subscriber belongs.
String email = "email_example"; // String | The email of the subscriber.
try {
    GetSubscriberByEmailAddressResponse result = apiInstance.getSubscriberByEmailAddress(format, apikey, mailingListID, email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscribersApi#getSubscriberByEmailAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**|  | [enum: json, xml]
 **apikey** | **String**| You may find your API Key or generate a new one in your account settings. |
 **mailingListID** | **String**| The ID of the mailing list where the subscriber belongs. |
 **email** | **String**| The email of the subscriber. |

### Return type

[**GetSubscriberByEmailAddressResponse**](GetSubscriberByEmailAddressResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSubscriberById"></a>
# **getSubscriberById**
> GetSubscriberByIdResponse getSubscriberById(format, apikey, mailingListID, subscriberID)

Get subscriber by id

Searches for a subscriber with the specified unique id in the specified mailing list and returns detailed information such as email, name, date created, date unsubscribed, status and custom fields.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubscribersApi;


SubscribersApi apiInstance = new SubscribersApi();
String format = "format_example"; // String | 
String apikey = "apikey_example"; // String | You may find your API Key or generate a new one in your account settings.
String mailingListID = "mailingListID_example"; // String | The ID of the mailing list to search the subscriber in.
String subscriberID = "subscriberID_example"; // String | The id of the subscriber being searched.
try {
    GetSubscriberByIdResponse result = apiInstance.getSubscriberById(format, apikey, mailingListID, subscriberID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscribersApi#getSubscriberById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**|  | [enum: json, xml]
 **apikey** | **String**| You may find your API Key or generate a new one in your account settings. |
 **mailingListID** | **String**| The ID of the mailing list to search the subscriber in. |
 **subscriberID** | **String**| The id of the subscriber being searched. |

### Return type

[**GetSubscriberByIdResponse**](GetSubscriberByIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="gettingSubscribers"></a>
# **gettingSubscribers**
> GettingSubscribersResponse gettingSubscribers(format, mailingListID, apikey, status, page, pageSize)

Getting subscribers

Gets a list of all subscribers in a given mailing list. You may filter the list by setting a date to fetch those subscribed since then and/or by their status. Because the results for this call could be quite big, paging information is required as input.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubscribersApi;


SubscribersApi apiInstance = new SubscribersApi();
String format = "format_example"; // String | 
String mailingListID = "mailingListID_example"; // String | The ID of the mailing list where the subscribers belong.
String apikey = "apikey_example"; // String | You may find your API Key or generate a new one in your account settings.
String status = "status_example"; // String | Specifies what type of subscriber statistics results will be returned.
Double page = 3.4D; // Double | Specifies the page of subscriber statistics results will be returned.
Double pageSize = 3.4D; // Double | Specifies the page size of subscriber statistics results will be returned.
try {
    GettingSubscribersResponse result = apiInstance.gettingSubscribers(format, mailingListID, apikey, status, page, pageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscribersApi#gettingSubscribers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**|  | [enum: json, xml]
 **mailingListID** | **String**| The ID of the mailing list where the subscribers belong. |
 **apikey** | **String**| You may find your API Key or generate a new one in your account settings. |
 **status** | **String**| Specifies what type of subscriber statistics results will be returned. | [enum: Subscribed, Unsubscribed, Bounced, Removed]
 **page** | **Double**| Specifies the page of subscriber statistics results will be returned. | [optional]
 **pageSize** | **Double**| Specifies the page size of subscriber statistics results will be returned. | [optional]

### Return type

[**GettingSubscribersResponse**](GettingSubscribersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removingASubscriber"></a>
# **removingASubscriber**
> RemovingASubscriberResponse removingASubscriber(format, apikey, mailingListID, body)

Removing a subscriber

Removes a subscriber from the specified mailing list permanently (without moving to the suppression list).

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubscribersApi;


SubscribersApi apiInstance = new SubscribersApi();
String format = "format_example"; // String | 
String apikey = "apikey_example"; // String | You may find your API Key or generate a new one in your account settings.
String mailingListID = "mailingListID_example"; // String | The ID of the mailing list to remove the subscriber from.
RemovingASubscriberRequest body = new RemovingASubscriberRequest(); // RemovingASubscriberRequest | 
try {
    RemovingASubscriberResponse result = apiInstance.removingASubscriber(format, apikey, mailingListID, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscribersApi#removingASubscriber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**|  | [enum: json, xml]
 **apikey** | **String**| You may find your API Key or generate a new one in your account settings. |
 **mailingListID** | **String**| The ID of the mailing list to remove the subscriber from. |
 **body** | [**RemovingASubscriberRequest**](RemovingASubscriberRequest.md)|  |

### Return type

[**RemovingASubscriberResponse**](RemovingASubscriberResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removingMultipleSubscribers"></a>
# **removingMultipleSubscribers**
> RemovingMultipleSubscribersResponse removingMultipleSubscribers(format, apikey, mailingListID, body)

Removing multiple subscribers

Removes a list of subscribers from the specified mailing list permanently (without putting them in the suppression list). Any invalid email addresses specified will be ignored.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubscribersApi;


SubscribersApi apiInstance = new SubscribersApi();
String format = "format_example"; // String | 
String apikey = "apikey_example"; // String | You may find your API Key or generate a new one in your account settings.
String mailingListID = "mailingListID_example"; // String | The ID of the mailing list to remove the subscribers from.
RemovingMultipleSubscribersRequest body = new RemovingMultipleSubscribersRequest(); // RemovingMultipleSubscribersRequest | 
try {
    RemovingMultipleSubscribersResponse result = apiInstance.removingMultipleSubscribers(format, apikey, mailingListID, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscribersApi#removingMultipleSubscribers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**|  | [enum: json, xml]
 **apikey** | **String**| You may find your API Key or generate a new one in your account settings. |
 **mailingListID** | **String**| The ID of the mailing list to remove the subscribers from. |
 **body** | [**RemovingMultipleSubscribersRequest**](RemovingMultipleSubscribersRequest.md)|  |

### Return type

[**RemovingMultipleSubscribersResponse**](RemovingMultipleSubscribersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="unsubscribingSubscribersFromAccount"></a>
# **unsubscribingSubscribersFromAccount**
> UnsubscribingSubscribersFromAccountResponse unsubscribingSubscribersFromAccount(format, apikey, body)

Unsubscribing subscribers from account

Unsubscribes a subscriber from the account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubscribersApi;


SubscribersApi apiInstance = new SubscribersApi();
String format = "format_example"; // String | 
String apikey = "apikey_example"; // String | You may find your API Key or generate a new one in your account settings.
UnsubscribingSubscribersFromAccountRequest body = new UnsubscribingSubscribersFromAccountRequest(); // UnsubscribingSubscribersFromAccountRequest | 
try {
    UnsubscribingSubscribersFromAccountResponse result = apiInstance.unsubscribingSubscribersFromAccount(format, apikey, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscribersApi#unsubscribingSubscribersFromAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**|  | [enum: json, xml]
 **apikey** | **String**| You may find your API Key or generate a new one in your account settings. |
 **body** | [**UnsubscribingSubscribersFromAccountRequest**](UnsubscribingSubscribersFromAccountRequest.md)|  |

### Return type

[**UnsubscribingSubscribersFromAccountResponse**](UnsubscribingSubscribersFromAccountResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="unsubscribingSubscribersFromMailingList"></a>
# **unsubscribingSubscribersFromMailingList**
> UnsubscribingSubscribersFromMailingListResponse unsubscribingSubscribersFromMailingList(format, apikey, mailingListID, body)

Unsubscribing subscribers from mailing list

Unsubscribes a subscriber from the specified mailing list. The subscriber is not deleted, but moved to the suppression list.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubscribersApi;


SubscribersApi apiInstance = new SubscribersApi();
String format = "format_example"; // String | 
String apikey = "apikey_example"; // String | You may find your API Key or generate a new one in your account settings.
String mailingListID = "mailingListID_example"; // String | The ID of the mailing list to add subscribers to.
UnsubscribingSubscribersFromMailingListRequest body = new UnsubscribingSubscribersFromMailingListRequest(); // UnsubscribingSubscribersFromMailingListRequest | 
try {
    UnsubscribingSubscribersFromMailingListResponse result = apiInstance.unsubscribingSubscribersFromMailingList(format, apikey, mailingListID, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscribersApi#unsubscribingSubscribersFromMailingList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**|  | [enum: json, xml]
 **apikey** | **String**| You may find your API Key or generate a new one in your account settings. |
 **mailingListID** | **String**| The ID of the mailing list to add subscribers to. |
 **body** | [**UnsubscribingSubscribersFromMailingListRequest**](UnsubscribingSubscribersFromMailingListRequest.md)|  |

### Return type

[**UnsubscribingSubscribersFromMailingListResponse**](UnsubscribingSubscribersFromMailingListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="unsubscribingSubscribersFromMailingListAndASpecifiedCampaign"></a>
# **unsubscribingSubscribersFromMailingListAndASpecifiedCampaign**
> UnsubscribingSubscribersFromMailingListAndASpecifiedCampaignResponse unsubscribingSubscribersFromMailingListAndASpecifiedCampaign(format, campaignID, apikey, mailingListID, body)

Unsubscribing subscribers from mailing list and a specified campaign

Unsubscribes a subscriber from the specified mailing list and the specified campaign. The subscriber is not deleted, but moved to the suppression list.  This call will take into account the setting you have in \&quot;suppression list and unsubscribe settings\&quot; and will remove the subscriber from all other mailing lists or not accordingly.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubscribersApi;


SubscribersApi apiInstance = new SubscribersApi();
String format = "format_example"; // String | 
String campaignID = "campaignID_example"; // String | The ID of the campaign that was sent to the specific mailing list.
String apikey = "apikey_example"; // String | You may find your API Key or generate a new one in your account settings.
String mailingListID = "mailingListID_example"; // String | The ID of the mailing list to remove the subscriber from.
UnsubscribingSubscribersFromMailingListAndASpecifiedCampaignRequest body = new UnsubscribingSubscribersFromMailingListAndASpecifiedCampaignRequest(); // UnsubscribingSubscribersFromMailingListAndASpecifiedCampaignRequest | 
try {
    UnsubscribingSubscribersFromMailingListAndASpecifiedCampaignResponse result = apiInstance.unsubscribingSubscribersFromMailingListAndASpecifiedCampaign(format, campaignID, apikey, mailingListID, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscribersApi#unsubscribingSubscribersFromMailingListAndASpecifiedCampaign");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**|  | [enum: json, xml]
 **campaignID** | **String**| The ID of the campaign that was sent to the specific mailing list. |
 **apikey** | **String**| You may find your API Key or generate a new one in your account settings. |
 **mailingListID** | **String**| The ID of the mailing list to remove the subscriber from. |
 **body** | [**UnsubscribingSubscribersFromMailingListAndASpecifiedCampaignRequest**](UnsubscribingSubscribersFromMailingListAndASpecifiedCampaignRequest.md)|  |

### Return type

[**UnsubscribingSubscribersFromMailingListAndASpecifiedCampaignResponse**](UnsubscribingSubscribersFromMailingListAndASpecifiedCampaignResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatingASubscriber"></a>
# **updatingASubscriber**
> UpdatingASubscriberResponse updatingASubscriber(format, apikey, mailingListID, subscriberID, body)

Updating a subscriber

Updates a subscriber in the specified mailing list. You can even update the subscribers email, if he has not unsubscribed.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SubscribersApi;


SubscribersApi apiInstance = new SubscribersApi();
String format = "format_example"; // String | 
String apikey = "apikey_example"; // String | You may find your API Key or generate a new one in your account settings.
String mailingListID = "mailingListID_example"; // String | The ID of the mailing list that contains the subscriber
String subscriberID = "subscriberID_example"; // String | The id of the subscriber to be updated
UpdatingASubscriberRequest body = new UpdatingASubscriberRequest(); // UpdatingASubscriberRequest | 
try {
    UpdatingASubscriberResponse result = apiInstance.updatingASubscriber(format, apikey, mailingListID, subscriberID, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscribersApi#updatingASubscriber");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**|  | [enum: json, xml]
 **apikey** | **String**| You may find your API Key or generate a new one in your account settings. |
 **mailingListID** | **String**| The ID of the mailing list that contains the subscriber |
 **subscriberID** | **String**| The id of the subscriber to be updated |
 **body** | [**UpdatingASubscriberRequest**](UpdatingASubscriberRequest.md)|  |

### Return type

[**UpdatingASubscriberResponse**](UpdatingASubscriberResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


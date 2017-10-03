# MailingListsApi

All URIs are relative to *https://api.moosend.com/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**creatingACustomField**](MailingListsApi.md#creatingACustomField) | **POST** /lists/{MailingListID}/customfields/create.{Format} | Creating a custom field
[**creatingAMailingList**](MailingListsApi.md#creatingAMailingList) | **POST** /lists/create.{Format} | Creating a mailing list
[**deletingAMailingList**](MailingListsApi.md#deletingAMailingList) | **DELETE** /lists/{MailingListID}/delete.{Format} | Deleting a mailing list
[**gettingAllActiveMailingLists**](MailingListsApi.md#gettingAllActiveMailingLists) | **GET** /lists.{Format} | Getting all active mailing lists
[**gettingAllActiveMailingListsWithPaging**](MailingListsApi.md#gettingAllActiveMailingListsWithPaging) | **GET** /lists/{Page}/{PageSize}.{Format} | Getting all active mailing lists with paging
[**gettingMailingListDetails**](MailingListsApi.md#gettingMailingListDetails) | **GET** /lists/{MailingListID}/details.{Format} | Getting mailing list details
[**removingACustomField**](MailingListsApi.md#removingACustomField) | **DELETE** /lists/{MailingListID}/customfields/{CustomFieldID}/delete.{Format} | Removing a custom field
[**updatingACustomField**](MailingListsApi.md#updatingACustomField) | **POST** /lists/{MailingListID}/customfields/{CustomFieldID}/update.{Format} | Updating a custom field
[**updatingAMailingList**](MailingListsApi.md#updatingAMailingList) | **POST** /lists/{MailingListID}/update.{Format} | Updating a mailing list


<a name="creatingACustomField"></a>
# **creatingACustomField**
> CreatingACustomFieldResponse creatingACustomField(format, apikey, mailingListID, body)

Creating a custom field

Creates a new custom field in the specified mailing list.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MailingListsApi;


MailingListsApi apiInstance = new MailingListsApi();
String format = "format_example"; // String | 
String apikey = "apikey_example"; // String | You may find your API Key or generate a new one in your account settings.
String mailingListID = "mailingListID_example"; // String | The ID of the mailing list where the custom field will belong.
CreatingACustomFieldRequest body = new CreatingACustomFieldRequest(); // CreatingACustomFieldRequest | 
try {
    CreatingACustomFieldResponse result = apiInstance.creatingACustomField(format, apikey, mailingListID, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MailingListsApi#creatingACustomField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**|  | [enum: json, xml]
 **apikey** | **String**| You may find your API Key or generate a new one in your account settings. |
 **mailingListID** | **String**| The ID of the mailing list where the custom field will belong. |
 **body** | [**CreatingACustomFieldRequest**](CreatingACustomFieldRequest.md)|  |

### Return type

[**CreatingACustomFieldResponse**](CreatingACustomFieldResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="creatingAMailingList"></a>
# **creatingAMailingList**
> CreatingAMailingListResponse creatingAMailingList(format, apikey, body)

Creating a mailing list

Creates a new empty mailing list in your account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MailingListsApi;


MailingListsApi apiInstance = new MailingListsApi();
String format = "format_example"; // String | 
String apikey = "apikey_example"; // String | You may find your API Key or generate a new one in your account settings.
CreatingAMailingListRequest body = new CreatingAMailingListRequest(); // CreatingAMailingListRequest | 
try {
    CreatingAMailingListResponse result = apiInstance.creatingAMailingList(format, apikey, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MailingListsApi#creatingAMailingList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**|  | [enum: json, xml]
 **apikey** | **String**| You may find your API Key or generate a new one in your account settings. |
 **body** | [**CreatingAMailingListRequest**](CreatingAMailingListRequest.md)|  |

### Return type

[**CreatingAMailingListResponse**](CreatingAMailingListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletingAMailingList"></a>
# **deletingAMailingList**
> DeletingAMailingListResponse deletingAMailingList(format, apikey, mailingListID)

Deleting a mailing list

Deletes a mailing list from your account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MailingListsApi;


MailingListsApi apiInstance = new MailingListsApi();
String format = "format_example"; // String | 
String apikey = "apikey_example"; // String | You may find your API Key or generate a new one in your account settings.
String mailingListID = "mailingListID_example"; // String | The ID of the mailing list to be deleted.
try {
    DeletingAMailingListResponse result = apiInstance.deletingAMailingList(format, apikey, mailingListID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MailingListsApi#deletingAMailingList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**|  | [enum: json, xml]
 **apikey** | **String**| You may find your API Key or generate a new one in your account settings. |
 **mailingListID** | **String**| The ID of the mailing list to be deleted. |

### Return type

[**DeletingAMailingListResponse**](DeletingAMailingListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="gettingAllActiveMailingLists"></a>
# **gettingAllActiveMailingLists**
> GettingAllActiveMailingListsResponse gettingAllActiveMailingLists(format, apikey, withStatistics, shortBy, sortMethod)

Getting all active mailing lists

Gets a list of your active mailing lists in your account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MailingListsApi;


MailingListsApi apiInstance = new MailingListsApi();
String format = "format_example"; // String | 
String apikey = "apikey_example"; // String | You may find your API Key or generate a new one in your account settings.
String withStatistics = "withStatistics_example"; // String | Specifies whether to fetch statistics for the subscribers or not. If omitted, results will be returned with statistics by default.
String shortBy = "shortBy_example"; // String | The name of the campaign property to sort results by. If not specified, results will be sorted by the CreatedOn property
String sortMethod = "sortMethod_example"; // String | The method to sort results: ASC for ascending, DESC for descending. If not specified, `ASC` will be assumed
try {
    GettingAllActiveMailingListsResponse result = apiInstance.gettingAllActiveMailingLists(format, apikey, withStatistics, shortBy, sortMethod);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MailingListsApi#gettingAllActiveMailingLists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**|  | [enum: json, xml]
 **apikey** | **String**| You may find your API Key or generate a new one in your account settings. |
 **withStatistics** | **String**| Specifies whether to fetch statistics for the subscribers or not. If omitted, results will be returned with statistics by default. | [optional] [enum: true, false]
 **shortBy** | **String**| The name of the campaign property to sort results by. If not specified, results will be sorted by the CreatedOn property | [optional] [enum: Name, Subject, Status, DeliveredOn, CreatedOn]
 **sortMethod** | **String**| The method to sort results: ASC for ascending, DESC for descending. If not specified, &#x60;ASC&#x60; will be assumed | [optional] [enum: ASC, DESC]

### Return type

[**GettingAllActiveMailingListsResponse**](GettingAllActiveMailingListsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="gettingAllActiveMailingListsWithPaging"></a>
# **gettingAllActiveMailingListsWithPaging**
> GettingAllActiveMailingListsWithPagingResponse gettingAllActiveMailingListsWithPaging(format, apikey, page, pageSize, shortBy, sortMethod)

Getting all active mailing lists with paging

Gets a list of your active mailing lists in your account. Because the results for this call could be quite big, paging information is required as input.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MailingListsApi;


MailingListsApi apiInstance = new MailingListsApi();
String format = "format_example"; // String | 
String apikey = "apikey_example"; // String | You may find your API Key or generate a new one in your account settings.
Double page = 3.4D; // Double | The page that you want to get.
Double pageSize = 3.4D; // Double | Lists Per Page.
String shortBy = "shortBy_example"; // String | The name of the campaign property to sort results by. If not specified, results will be sorted by the CreatedOn property
String sortMethod = "sortMethod_example"; // String | The method to sort results: ASC for ascending, DESC for descending. If not specified, `ASC` will be assumed
try {
    GettingAllActiveMailingListsWithPagingResponse result = apiInstance.gettingAllActiveMailingListsWithPaging(format, apikey, page, pageSize, shortBy, sortMethod);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MailingListsApi#gettingAllActiveMailingListsWithPaging");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**|  | [enum: json, xml]
 **apikey** | **String**| You may find your API Key or generate a new one in your account settings. |
 **page** | **Double**| The page that you want to get. |
 **pageSize** | **Double**| Lists Per Page. |
 **shortBy** | **String**| The name of the campaign property to sort results by. If not specified, results will be sorted by the CreatedOn property | [optional] [enum: Name, Subject, Status, DeliveredOn, CreatedOn]
 **sortMethod** | **String**| The method to sort results: ASC for ascending, DESC for descending. If not specified, &#x60;ASC&#x60; will be assumed | [optional] [enum: ASC, DESC]

### Return type

[**GettingAllActiveMailingListsWithPagingResponse**](GettingAllActiveMailingListsWithPagingResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="gettingMailingListDetails"></a>
# **gettingMailingListDetails**
> GettingMailingListDetailsResponse gettingMailingListDetails(format, mailingListID, apikey, withStatistics)

Getting mailing list details

Gets details for a given mailing list. You may include subscriber statistics in your results or not. Any segments existing for the requested mailing list will not be included in the results.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MailingListsApi;


MailingListsApi apiInstance = new MailingListsApi();
String format = "format_example"; // String | 
String mailingListID = "mailingListID_example"; // String | The ID of the mailing list to be returned.
String apikey = "apikey_example"; // String | You may find your API Key or generate a new one in your account settings.
String withStatistics = "withStatistics_example"; // String | Specifies whether to fetch statistics for the subscribers or not. If omitted, results will be returned with statistics by default.
try {
    GettingMailingListDetailsResponse result = apiInstance.gettingMailingListDetails(format, mailingListID, apikey, withStatistics);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MailingListsApi#gettingMailingListDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**|  | [enum: json, xml]
 **mailingListID** | **String**| The ID of the mailing list to be returned. |
 **apikey** | **String**| You may find your API Key or generate a new one in your account settings. |
 **withStatistics** | **String**| Specifies whether to fetch statistics for the subscribers or not. If omitted, results will be returned with statistics by default. | [optional] [enum: true, false]

### Return type

[**GettingMailingListDetailsResponse**](GettingMailingListDetailsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removingACustomField"></a>
# **removingACustomField**
> RemovingACustomFieldResponse removingACustomField(format, customFieldID, apikey, mailingListID)

Removing a custom field

Removes a custom field definition from the specified mailing list.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MailingListsApi;


MailingListsApi apiInstance = new MailingListsApi();
String format = "format_example"; // String | 
String customFieldID = "customFieldID_example"; // String | The ID of the custom field to be deleted.
String apikey = "apikey_example"; // String | You may find your API Key or generate a new one in your account settings.
String mailingListID = "mailingListID_example"; // String | The ID of the mailing list where the custom field belongs.
try {
    RemovingACustomFieldResponse result = apiInstance.removingACustomField(format, customFieldID, apikey, mailingListID);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MailingListsApi#removingACustomField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**|  | [enum: json, xml]
 **customFieldID** | **String**| The ID of the custom field to be deleted. |
 **apikey** | **String**| You may find your API Key or generate a new one in your account settings. |
 **mailingListID** | **String**| The ID of the mailing list where the custom field belongs. |

### Return type

[**RemovingACustomFieldResponse**](RemovingACustomFieldResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatingACustomField"></a>
# **updatingACustomField**
> UpdatingACustomFieldResponse updatingACustomField(format, customFieldID, apikey, mailingListID, body)

Updating a custom field

Updates the properties of an existing custom field in the specified mailing list.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MailingListsApi;


MailingListsApi apiInstance = new MailingListsApi();
String format = "format_example"; // String | 
String customFieldID = "customFieldID_example"; // String | The ID of the custom field to be updated.
String apikey = "apikey_example"; // String | You may find your API Key or generate a new one in your account settings.
String mailingListID = "mailingListID_example"; // String | The ID of the mailing list where the custom field belongs.
UpdatingACustomFieldRequest body = new UpdatingACustomFieldRequest(); // UpdatingACustomFieldRequest | 
try {
    UpdatingACustomFieldResponse result = apiInstance.updatingACustomField(format, customFieldID, apikey, mailingListID, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MailingListsApi#updatingACustomField");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**|  | [enum: json, xml]
 **customFieldID** | **String**| The ID of the custom field to be updated. |
 **apikey** | **String**| You may find your API Key or generate a new one in your account settings. |
 **mailingListID** | **String**| The ID of the mailing list where the custom field belongs. |
 **body** | [**UpdatingACustomFieldRequest**](UpdatingACustomFieldRequest.md)|  |

### Return type

[**UpdatingACustomFieldResponse**](UpdatingACustomFieldResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatingAMailingList"></a>
# **updatingAMailingList**
> UpdatingAMailingListResponse updatingAMailingList(format, apikey, mailingListID, body)

Updating a mailing list

Updates the properties of an existing mailing list.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.MailingListsApi;


MailingListsApi apiInstance = new MailingListsApi();
String format = "format_example"; // String | 
String apikey = "apikey_example"; // String | You may find your API Key or generate a new one in your account settings.
String mailingListID = "mailingListID_example"; // String | The ID of the mailing list to be updated.
UpdatingAMailingListRequest body = new UpdatingAMailingListRequest(); // UpdatingAMailingListRequest | 
try {
    UpdatingAMailingListResponse result = apiInstance.updatingAMailingList(format, apikey, mailingListID, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MailingListsApi#updatingAMailingList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | **String**|  | [enum: json, xml]
 **apikey** | **String**| You may find your API Key or generate a new one in your account settings. |
 **mailingListID** | **String**| The ID of the mailing list to be updated. |
 **body** | [**UpdatingAMailingListRequest**](UpdatingAMailingListRequest.md)|  |

### Return type

[**UpdatingAMailingListResponse**](UpdatingAMailingListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


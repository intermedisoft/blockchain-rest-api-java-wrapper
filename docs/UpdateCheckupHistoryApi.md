# UpdateCheckupHistoryApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**updateCheckupHistoryCreate**](UpdateCheckupHistoryApi.md#updateCheckupHistoryCreate) | **POST** /UpdateCheckupHistory | Create a new instance of the model and persist it into the data source.
[**updateCheckupHistoryFind**](UpdateCheckupHistoryApi.md#updateCheckupHistoryFind) | **GET** /UpdateCheckupHistory | Find all instances of the model matched by filter from the data source.
[**updateCheckupHistoryFindById**](UpdateCheckupHistoryApi.md#updateCheckupHistoryFindById) | **GET** /UpdateCheckupHistory/{id} | Find a model instance by {{id}} from the data source.


<a name="updateCheckupHistoryCreate"></a>
# **updateCheckupHistoryCreate**
> UpdateCheckupHistory updateCheckupHistoryCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UpdateCheckupHistoryApi;


UpdateCheckupHistoryApi apiInstance = new UpdateCheckupHistoryApi();
UpdateCheckupHistory data = new UpdateCheckupHistory(); // UpdateCheckupHistory | Model instance data
try {
    UpdateCheckupHistory result = apiInstance.updateCheckupHistoryCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpdateCheckupHistoryApi#updateCheckupHistoryCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**UpdateCheckupHistory**](UpdateCheckupHistory.md)| Model instance data | [optional]

### Return type

[**UpdateCheckupHistory**](UpdateCheckupHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="updateCheckupHistoryFind"></a>
# **updateCheckupHistoryFind**
> List&lt;UpdateCheckupHistory&gt; updateCheckupHistoryFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UpdateCheckupHistoryApi;


UpdateCheckupHistoryApi apiInstance = new UpdateCheckupHistoryApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<UpdateCheckupHistory> result = apiInstance.updateCheckupHistoryFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpdateCheckupHistoryApi#updateCheckupHistoryFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;UpdateCheckupHistory&gt;**](UpdateCheckupHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="updateCheckupHistoryFindById"></a>
# **updateCheckupHistoryFindById**
> UpdateCheckupHistory updateCheckupHistoryFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UpdateCheckupHistoryApi;


UpdateCheckupHistoryApi apiInstance = new UpdateCheckupHistoryApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    UpdateCheckupHistory result = apiInstance.updateCheckupHistoryFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpdateCheckupHistoryApi#updateCheckupHistoryFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**UpdateCheckupHistory**](UpdateCheckupHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


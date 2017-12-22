# UpdateServiceHistoryApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**updateServiceHistoryCreate**](UpdateServiceHistoryApi.md#updateServiceHistoryCreate) | **POST** /UpdateServiceHistory | Create a new instance of the model and persist it into the data source.
[**updateServiceHistoryFind**](UpdateServiceHistoryApi.md#updateServiceHistoryFind) | **GET** /UpdateServiceHistory | Find all instances of the model matched by filter from the data source.
[**updateServiceHistoryFindById**](UpdateServiceHistoryApi.md#updateServiceHistoryFindById) | **GET** /UpdateServiceHistory/{id} | Find a model instance by {{id}} from the data source.


<a name="updateServiceHistoryCreate"></a>
# **updateServiceHistoryCreate**
> UpdateServiceHistory updateServiceHistoryCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UpdateServiceHistoryApi;


UpdateServiceHistoryApi apiInstance = new UpdateServiceHistoryApi();
UpdateServiceHistory data = new UpdateServiceHistory(); // UpdateServiceHistory | Model instance data
try {
    UpdateServiceHistory result = apiInstance.updateServiceHistoryCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpdateServiceHistoryApi#updateServiceHistoryCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**UpdateServiceHistory**](UpdateServiceHistory.md)| Model instance data | [optional]

### Return type

[**UpdateServiceHistory**](UpdateServiceHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="updateServiceHistoryFind"></a>
# **updateServiceHistoryFind**
> List&lt;UpdateServiceHistory&gt; updateServiceHistoryFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UpdateServiceHistoryApi;


UpdateServiceHistoryApi apiInstance = new UpdateServiceHistoryApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<UpdateServiceHistory> result = apiInstance.updateServiceHistoryFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpdateServiceHistoryApi#updateServiceHistoryFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;UpdateServiceHistory&gt;**](UpdateServiceHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="updateServiceHistoryFindById"></a>
# **updateServiceHistoryFindById**
> UpdateServiceHistory updateServiceHistoryFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UpdateServiceHistoryApi;


UpdateServiceHistoryApi apiInstance = new UpdateServiceHistoryApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    UpdateServiceHistory result = apiInstance.updateServiceHistoryFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpdateServiceHistoryApi#updateServiceHistoryFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**UpdateServiceHistory**](UpdateServiceHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


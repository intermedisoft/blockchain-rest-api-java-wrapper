# UpdateDiagHistoryApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**updateDiagHistoryCreate**](UpdateDiagHistoryApi.md#updateDiagHistoryCreate) | **POST** /UpdateDiagHistory | Create a new instance of the model and persist it into the data source.
[**updateDiagHistoryFind**](UpdateDiagHistoryApi.md#updateDiagHistoryFind) | **GET** /UpdateDiagHistory | Find all instances of the model matched by filter from the data source.
[**updateDiagHistoryFindById**](UpdateDiagHistoryApi.md#updateDiagHistoryFindById) | **GET** /UpdateDiagHistory/{id} | Find a model instance by {{id}} from the data source.


<a name="updateDiagHistoryCreate"></a>
# **updateDiagHistoryCreate**
> UpdateDiagHistory updateDiagHistoryCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UpdateDiagHistoryApi;


UpdateDiagHistoryApi apiInstance = new UpdateDiagHistoryApi();
UpdateDiagHistory data = new UpdateDiagHistory(); // UpdateDiagHistory | Model instance data
try {
    UpdateDiagHistory result = apiInstance.updateDiagHistoryCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpdateDiagHistoryApi#updateDiagHistoryCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**UpdateDiagHistory**](UpdateDiagHistory.md)| Model instance data | [optional]

### Return type

[**UpdateDiagHistory**](UpdateDiagHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="updateDiagHistoryFind"></a>
# **updateDiagHistoryFind**
> List&lt;UpdateDiagHistory&gt; updateDiagHistoryFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UpdateDiagHistoryApi;


UpdateDiagHistoryApi apiInstance = new UpdateDiagHistoryApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<UpdateDiagHistory> result = apiInstance.updateDiagHistoryFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpdateDiagHistoryApi#updateDiagHistoryFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;UpdateDiagHistory&gt;**](UpdateDiagHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="updateDiagHistoryFindById"></a>
# **updateDiagHistoryFindById**
> UpdateDiagHistory updateDiagHistoryFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UpdateDiagHistoryApi;


UpdateDiagHistoryApi apiInstance = new UpdateDiagHistoryApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    UpdateDiagHistory result = apiInstance.updateDiagHistoryFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpdateDiagHistoryApi#updateDiagHistoryFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**UpdateDiagHistory**](UpdateDiagHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


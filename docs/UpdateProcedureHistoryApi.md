# UpdateProcedureHistoryApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**updateProcedureHistoryCreate**](UpdateProcedureHistoryApi.md#updateProcedureHistoryCreate) | **POST** /UpdateProcedureHistory | Create a new instance of the model and persist it into the data source.
[**updateProcedureHistoryFind**](UpdateProcedureHistoryApi.md#updateProcedureHistoryFind) | **GET** /UpdateProcedureHistory | Find all instances of the model matched by filter from the data source.
[**updateProcedureHistoryFindById**](UpdateProcedureHistoryApi.md#updateProcedureHistoryFindById) | **GET** /UpdateProcedureHistory/{id} | Find a model instance by {{id}} from the data source.


<a name="updateProcedureHistoryCreate"></a>
# **updateProcedureHistoryCreate**
> UpdateProcedureHistory updateProcedureHistoryCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UpdateProcedureHistoryApi;


UpdateProcedureHistoryApi apiInstance = new UpdateProcedureHistoryApi();
UpdateProcedureHistory data = new UpdateProcedureHistory(); // UpdateProcedureHistory | Model instance data
try {
    UpdateProcedureHistory result = apiInstance.updateProcedureHistoryCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpdateProcedureHistoryApi#updateProcedureHistoryCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**UpdateProcedureHistory**](UpdateProcedureHistory.md)| Model instance data | [optional]

### Return type

[**UpdateProcedureHistory**](UpdateProcedureHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="updateProcedureHistoryFind"></a>
# **updateProcedureHistoryFind**
> List&lt;UpdateProcedureHistory&gt; updateProcedureHistoryFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UpdateProcedureHistoryApi;


UpdateProcedureHistoryApi apiInstance = new UpdateProcedureHistoryApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<UpdateProcedureHistory> result = apiInstance.updateProcedureHistoryFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpdateProcedureHistoryApi#updateProcedureHistoryFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;UpdateProcedureHistory&gt;**](UpdateProcedureHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="updateProcedureHistoryFindById"></a>
# **updateProcedureHistoryFindById**
> UpdateProcedureHistory updateProcedureHistoryFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UpdateProcedureHistoryApi;


UpdateProcedureHistoryApi apiInstance = new UpdateProcedureHistoryApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    UpdateProcedureHistory result = apiInstance.updateProcedureHistoryFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpdateProcedureHistoryApi#updateProcedureHistoryFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**UpdateProcedureHistory**](UpdateProcedureHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


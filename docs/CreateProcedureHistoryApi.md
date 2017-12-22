# CreateProcedureHistoryApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProcedureHistoryCreate**](CreateProcedureHistoryApi.md#createProcedureHistoryCreate) | **POST** /CreateProcedureHistory | Create a new instance of the model and persist it into the data source.
[**createProcedureHistoryFind**](CreateProcedureHistoryApi.md#createProcedureHistoryFind) | **GET** /CreateProcedureHistory | Find all instances of the model matched by filter from the data source.
[**createProcedureHistoryFindById**](CreateProcedureHistoryApi.md#createProcedureHistoryFindById) | **GET** /CreateProcedureHistory/{id} | Find a model instance by {{id}} from the data source.


<a name="createProcedureHistoryCreate"></a>
# **createProcedureHistoryCreate**
> CreateProcedureHistory createProcedureHistoryCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CreateProcedureHistoryApi;


CreateProcedureHistoryApi apiInstance = new CreateProcedureHistoryApi();
CreateProcedureHistory data = new CreateProcedureHistory(); // CreateProcedureHistory | Model instance data
try {
    CreateProcedureHistory result = apiInstance.createProcedureHistoryCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreateProcedureHistoryApi#createProcedureHistoryCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**CreateProcedureHistory**](CreateProcedureHistory.md)| Model instance data | [optional]

### Return type

[**CreateProcedureHistory**](CreateProcedureHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="createProcedureHistoryFind"></a>
# **createProcedureHistoryFind**
> List&lt;CreateProcedureHistory&gt; createProcedureHistoryFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CreateProcedureHistoryApi;


CreateProcedureHistoryApi apiInstance = new CreateProcedureHistoryApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<CreateProcedureHistory> result = apiInstance.createProcedureHistoryFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreateProcedureHistoryApi#createProcedureHistoryFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;CreateProcedureHistory&gt;**](CreateProcedureHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="createProcedureHistoryFindById"></a>
# **createProcedureHistoryFindById**
> CreateProcedureHistory createProcedureHistoryFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CreateProcedureHistoryApi;


CreateProcedureHistoryApi apiInstance = new CreateProcedureHistoryApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    CreateProcedureHistory result = apiInstance.createProcedureHistoryFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreateProcedureHistoryApi#createProcedureHistoryFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**CreateProcedureHistory**](CreateProcedureHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


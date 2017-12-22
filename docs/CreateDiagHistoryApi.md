# CreateDiagHistoryApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDiagHistoryCreate**](CreateDiagHistoryApi.md#createDiagHistoryCreate) | **POST** /CreateDiagHistory | Create a new instance of the model and persist it into the data source.
[**createDiagHistoryFind**](CreateDiagHistoryApi.md#createDiagHistoryFind) | **GET** /CreateDiagHistory | Find all instances of the model matched by filter from the data source.
[**createDiagHistoryFindById**](CreateDiagHistoryApi.md#createDiagHistoryFindById) | **GET** /CreateDiagHistory/{id} | Find a model instance by {{id}} from the data source.


<a name="createDiagHistoryCreate"></a>
# **createDiagHistoryCreate**
> CreateDiagHistory createDiagHistoryCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CreateDiagHistoryApi;


CreateDiagHistoryApi apiInstance = new CreateDiagHistoryApi();
CreateDiagHistory data = new CreateDiagHistory(); // CreateDiagHistory | Model instance data
try {
    CreateDiagHistory result = apiInstance.createDiagHistoryCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreateDiagHistoryApi#createDiagHistoryCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**CreateDiagHistory**](CreateDiagHistory.md)| Model instance data | [optional]

### Return type

[**CreateDiagHistory**](CreateDiagHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="createDiagHistoryFind"></a>
# **createDiagHistoryFind**
> List&lt;CreateDiagHistory&gt; createDiagHistoryFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CreateDiagHistoryApi;


CreateDiagHistoryApi apiInstance = new CreateDiagHistoryApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<CreateDiagHistory> result = apiInstance.createDiagHistoryFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreateDiagHistoryApi#createDiagHistoryFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;CreateDiagHistory&gt;**](CreateDiagHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="createDiagHistoryFindById"></a>
# **createDiagHistoryFindById**
> CreateDiagHistory createDiagHistoryFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CreateDiagHistoryApi;


CreateDiagHistoryApi apiInstance = new CreateDiagHistoryApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    CreateDiagHistory result = apiInstance.createDiagHistoryFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreateDiagHistoryApi#createDiagHistoryFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**CreateDiagHistory**](CreateDiagHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


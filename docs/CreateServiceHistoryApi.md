# CreateServiceHistoryApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createServiceHistoryCreate**](CreateServiceHistoryApi.md#createServiceHistoryCreate) | **POST** /CreateServiceHistory | Create a new instance of the model and persist it into the data source.
[**createServiceHistoryFind**](CreateServiceHistoryApi.md#createServiceHistoryFind) | **GET** /CreateServiceHistory | Find all instances of the model matched by filter from the data source.
[**createServiceHistoryFindById**](CreateServiceHistoryApi.md#createServiceHistoryFindById) | **GET** /CreateServiceHistory/{id} | Find a model instance by {{id}} from the data source.


<a name="createServiceHistoryCreate"></a>
# **createServiceHistoryCreate**
> CreateServiceHistory createServiceHistoryCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CreateServiceHistoryApi;


CreateServiceHistoryApi apiInstance = new CreateServiceHistoryApi();
CreateServiceHistory data = new CreateServiceHistory(); // CreateServiceHistory | Model instance data
try {
    CreateServiceHistory result = apiInstance.createServiceHistoryCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreateServiceHistoryApi#createServiceHistoryCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**CreateServiceHistory**](CreateServiceHistory.md)| Model instance data | [optional]

### Return type

[**CreateServiceHistory**](CreateServiceHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="createServiceHistoryFind"></a>
# **createServiceHistoryFind**
> List&lt;CreateServiceHistory&gt; createServiceHistoryFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CreateServiceHistoryApi;


CreateServiceHistoryApi apiInstance = new CreateServiceHistoryApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<CreateServiceHistory> result = apiInstance.createServiceHistoryFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreateServiceHistoryApi#createServiceHistoryFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;CreateServiceHistory&gt;**](CreateServiceHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="createServiceHistoryFindById"></a>
# **createServiceHistoryFindById**
> CreateServiceHistory createServiceHistoryFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CreateServiceHistoryApi;


CreateServiceHistoryApi apiInstance = new CreateServiceHistoryApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    CreateServiceHistory result = apiInstance.createServiceHistoryFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreateServiceHistoryApi#createServiceHistoryFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**CreateServiceHistory**](CreateServiceHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


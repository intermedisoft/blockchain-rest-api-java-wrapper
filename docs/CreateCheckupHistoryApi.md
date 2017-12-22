# CreateCheckupHistoryApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCheckupHistoryCreate**](CreateCheckupHistoryApi.md#createCheckupHistoryCreate) | **POST** /CreateCheckupHistory | Create a new instance of the model and persist it into the data source.
[**createCheckupHistoryFind**](CreateCheckupHistoryApi.md#createCheckupHistoryFind) | **GET** /CreateCheckupHistory | Find all instances of the model matched by filter from the data source.
[**createCheckupHistoryFindById**](CreateCheckupHistoryApi.md#createCheckupHistoryFindById) | **GET** /CreateCheckupHistory/{id} | Find a model instance by {{id}} from the data source.


<a name="createCheckupHistoryCreate"></a>
# **createCheckupHistoryCreate**
> CreateCheckupHistory createCheckupHistoryCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CreateCheckupHistoryApi;


CreateCheckupHistoryApi apiInstance = new CreateCheckupHistoryApi();
CreateCheckupHistory data = new CreateCheckupHistory(); // CreateCheckupHistory | Model instance data
try {
    CreateCheckupHistory result = apiInstance.createCheckupHistoryCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreateCheckupHistoryApi#createCheckupHistoryCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**CreateCheckupHistory**](CreateCheckupHistory.md)| Model instance data | [optional]

### Return type

[**CreateCheckupHistory**](CreateCheckupHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="createCheckupHistoryFind"></a>
# **createCheckupHistoryFind**
> List&lt;CreateCheckupHistory&gt; createCheckupHistoryFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CreateCheckupHistoryApi;


CreateCheckupHistoryApi apiInstance = new CreateCheckupHistoryApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<CreateCheckupHistory> result = apiInstance.createCheckupHistoryFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreateCheckupHistoryApi#createCheckupHistoryFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;CreateCheckupHistory&gt;**](CreateCheckupHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="createCheckupHistoryFindById"></a>
# **createCheckupHistoryFindById**
> CreateCheckupHistory createCheckupHistoryFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CreateCheckupHistoryApi;


CreateCheckupHistoryApi apiInstance = new CreateCheckupHistoryApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    CreateCheckupHistory result = apiInstance.createCheckupHistoryFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreateCheckupHistoryApi#createCheckupHistoryFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**CreateCheckupHistory**](CreateCheckupHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


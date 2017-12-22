# CreateDrugHistoryApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDrugHistoryCreate**](CreateDrugHistoryApi.md#createDrugHistoryCreate) | **POST** /CreateDrugHistory | Create a new instance of the model and persist it into the data source.
[**createDrugHistoryFind**](CreateDrugHistoryApi.md#createDrugHistoryFind) | **GET** /CreateDrugHistory | Find all instances of the model matched by filter from the data source.
[**createDrugHistoryFindById**](CreateDrugHistoryApi.md#createDrugHistoryFindById) | **GET** /CreateDrugHistory/{id} | Find a model instance by {{id}} from the data source.


<a name="createDrugHistoryCreate"></a>
# **createDrugHistoryCreate**
> CreateDrugHistory createDrugHistoryCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CreateDrugHistoryApi;


CreateDrugHistoryApi apiInstance = new CreateDrugHistoryApi();
CreateDrugHistory data = new CreateDrugHistory(); // CreateDrugHistory | Model instance data
try {
    CreateDrugHistory result = apiInstance.createDrugHistoryCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreateDrugHistoryApi#createDrugHistoryCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**CreateDrugHistory**](CreateDrugHistory.md)| Model instance data | [optional]

### Return type

[**CreateDrugHistory**](CreateDrugHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="createDrugHistoryFind"></a>
# **createDrugHistoryFind**
> List&lt;CreateDrugHistory&gt; createDrugHistoryFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CreateDrugHistoryApi;


CreateDrugHistoryApi apiInstance = new CreateDrugHistoryApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<CreateDrugHistory> result = apiInstance.createDrugHistoryFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreateDrugHistoryApi#createDrugHistoryFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;CreateDrugHistory&gt;**](CreateDrugHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="createDrugHistoryFindById"></a>
# **createDrugHistoryFindById**
> CreateDrugHistory createDrugHistoryFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CreateDrugHistoryApi;


CreateDrugHistoryApi apiInstance = new CreateDrugHistoryApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    CreateDrugHistory result = apiInstance.createDrugHistoryFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CreateDrugHistoryApi#createDrugHistoryFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**CreateDrugHistory**](CreateDrugHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


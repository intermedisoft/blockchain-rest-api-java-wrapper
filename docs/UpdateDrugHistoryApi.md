# UpdateDrugHistoryApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**updateDrugHistoryCreate**](UpdateDrugHistoryApi.md#updateDrugHistoryCreate) | **POST** /UpdateDrugHistory | Create a new instance of the model and persist it into the data source.
[**updateDrugHistoryFind**](UpdateDrugHistoryApi.md#updateDrugHistoryFind) | **GET** /UpdateDrugHistory | Find all instances of the model matched by filter from the data source.
[**updateDrugHistoryFindById**](UpdateDrugHistoryApi.md#updateDrugHistoryFindById) | **GET** /UpdateDrugHistory/{id} | Find a model instance by {{id}} from the data source.


<a name="updateDrugHistoryCreate"></a>
# **updateDrugHistoryCreate**
> UpdateDrugHistory updateDrugHistoryCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UpdateDrugHistoryApi;


UpdateDrugHistoryApi apiInstance = new UpdateDrugHistoryApi();
UpdateDrugHistory data = new UpdateDrugHistory(); // UpdateDrugHistory | Model instance data
try {
    UpdateDrugHistory result = apiInstance.updateDrugHistoryCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpdateDrugHistoryApi#updateDrugHistoryCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**UpdateDrugHistory**](UpdateDrugHistory.md)| Model instance data | [optional]

### Return type

[**UpdateDrugHistory**](UpdateDrugHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="updateDrugHistoryFind"></a>
# **updateDrugHistoryFind**
> List&lt;UpdateDrugHistory&gt; updateDrugHistoryFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UpdateDrugHistoryApi;


UpdateDrugHistoryApi apiInstance = new UpdateDrugHistoryApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<UpdateDrugHistory> result = apiInstance.updateDrugHistoryFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpdateDrugHistoryApi#updateDrugHistoryFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;UpdateDrugHistory&gt;**](UpdateDrugHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="updateDrugHistoryFindById"></a>
# **updateDrugHistoryFindById**
> UpdateDrugHistory updateDrugHistoryFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UpdateDrugHistoryApi;


UpdateDrugHistoryApi apiInstance = new UpdateDrugHistoryApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    UpdateDrugHistory result = apiInstance.updateDrugHistoryFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpdateDrugHistoryApi#updateDrugHistoryFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**UpdateDrugHistory**](UpdateDrugHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


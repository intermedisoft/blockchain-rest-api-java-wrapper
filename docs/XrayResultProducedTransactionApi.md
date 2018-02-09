# XrayResultProducedTransactionApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**xrayResultProducedTransactionCreate**](XrayResultProducedTransactionApi.md#xrayResultProducedTransactionCreate) | **POST** /XrayResultProducedTransaction | Create a new instance of the model and persist it into the data source.
[**xrayResultProducedTransactionFind**](XrayResultProducedTransactionApi.md#xrayResultProducedTransactionFind) | **GET** /XrayResultProducedTransaction | Find all instances of the model matched by filter from the data source.
[**xrayResultProducedTransactionFindById**](XrayResultProducedTransactionApi.md#xrayResultProducedTransactionFindById) | **GET** /XrayResultProducedTransaction/{id} | Find a model instance by {{id}} from the data source.


<a name="xrayResultProducedTransactionCreate"></a>
# **xrayResultProducedTransactionCreate**
> XrayResultProducedTransaction xrayResultProducedTransactionCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XrayResultProducedTransactionApi;


XrayResultProducedTransactionApi apiInstance = new XrayResultProducedTransactionApi();
XrayResultProducedTransaction data = new XrayResultProducedTransaction(); // XrayResultProducedTransaction | Model instance data
try {
    XrayResultProducedTransaction result = apiInstance.xrayResultProducedTransactionCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XrayResultProducedTransactionApi#xrayResultProducedTransactionCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**XrayResultProducedTransaction**](XrayResultProducedTransaction.md)| Model instance data | [optional]

### Return type

[**XrayResultProducedTransaction**](XrayResultProducedTransaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="xrayResultProducedTransactionFind"></a>
# **xrayResultProducedTransactionFind**
> List&lt;XrayResultProducedTransaction&gt; xrayResultProducedTransactionFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XrayResultProducedTransactionApi;


XrayResultProducedTransactionApi apiInstance = new XrayResultProducedTransactionApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<XrayResultProducedTransaction> result = apiInstance.xrayResultProducedTransactionFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XrayResultProducedTransactionApi#xrayResultProducedTransactionFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;XrayResultProducedTransaction&gt;**](XrayResultProducedTransaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="xrayResultProducedTransactionFindById"></a>
# **xrayResultProducedTransactionFindById**
> XrayResultProducedTransaction xrayResultProducedTransactionFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XrayResultProducedTransactionApi;


XrayResultProducedTransactionApi apiInstance = new XrayResultProducedTransactionApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    XrayResultProducedTransaction result = apiInstance.xrayResultProducedTransactionFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XrayResultProducedTransactionApi#xrayResultProducedTransactionFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**XrayResultProducedTransaction**](XrayResultProducedTransaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


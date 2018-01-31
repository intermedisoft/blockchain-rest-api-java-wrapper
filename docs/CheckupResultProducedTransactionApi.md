# CheckupResultProducedTransactionApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkupResultProducedTransactionCreate**](CheckupResultProducedTransactionApi.md#checkupResultProducedTransactionCreate) | **POST** /CheckupResultProducedTransaction | Create a new instance of the model and persist it into the data source.
[**checkupResultProducedTransactionFind**](CheckupResultProducedTransactionApi.md#checkupResultProducedTransactionFind) | **GET** /CheckupResultProducedTransaction | Find all instances of the model matched by filter from the data source.
[**checkupResultProducedTransactionFindById**](CheckupResultProducedTransactionApi.md#checkupResultProducedTransactionFindById) | **GET** /CheckupResultProducedTransaction/{id} | Find a model instance by {{id}} from the data source.


<a name="checkupResultProducedTransactionCreate"></a>
# **checkupResultProducedTransactionCreate**
> CheckupResultProducedTransaction checkupResultProducedTransactionCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CheckupResultProducedTransactionApi;


CheckupResultProducedTransactionApi apiInstance = new CheckupResultProducedTransactionApi();
CheckupResultProducedTransaction data = new CheckupResultProducedTransaction(); // CheckupResultProducedTransaction | Model instance data
try {
    CheckupResultProducedTransaction result = apiInstance.checkupResultProducedTransactionCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckupResultProducedTransactionApi#checkupResultProducedTransactionCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**CheckupResultProducedTransaction**](CheckupResultProducedTransaction.md)| Model instance data | [optional]

### Return type

[**CheckupResultProducedTransaction**](CheckupResultProducedTransaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="checkupResultProducedTransactionFind"></a>
# **checkupResultProducedTransactionFind**
> List&lt;CheckupResultProducedTransaction&gt; checkupResultProducedTransactionFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CheckupResultProducedTransactionApi;


CheckupResultProducedTransactionApi apiInstance = new CheckupResultProducedTransactionApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<CheckupResultProducedTransaction> result = apiInstance.checkupResultProducedTransactionFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckupResultProducedTransactionApi#checkupResultProducedTransactionFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;CheckupResultProducedTransaction&gt;**](CheckupResultProducedTransaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="checkupResultProducedTransactionFindById"></a>
# **checkupResultProducedTransactionFindById**
> CheckupResultProducedTransaction checkupResultProducedTransactionFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CheckupResultProducedTransactionApi;


CheckupResultProducedTransactionApi apiInstance = new CheckupResultProducedTransactionApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    CheckupResultProducedTransaction result = apiInstance.checkupResultProducedTransactionFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckupResultProducedTransactionApi#checkupResultProducedTransactionFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**CheckupResultProducedTransaction**](CheckupResultProducedTransaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


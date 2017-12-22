# DrugHistoryApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**drugHistoryCreate**](DrugHistoryApi.md#drugHistoryCreate) | **POST** /DrugHistory | Create a new instance of the model and persist it into the data source.
[**drugHistoryDeleteById**](DrugHistoryApi.md#drugHistoryDeleteById) | **DELETE** /DrugHistory/{id} | Delete a model instance by {{id}} from the data source.
[**drugHistoryExists**](DrugHistoryApi.md#drugHistoryExists) | **HEAD** /DrugHistory/{id} | Check whether a model instance exists in the data source.
[**drugHistoryFind**](DrugHistoryApi.md#drugHistoryFind) | **GET** /DrugHistory | Find all instances of the model matched by filter from the data source.
[**drugHistoryFindById**](DrugHistoryApi.md#drugHistoryFindById) | **GET** /DrugHistory/{id} | Find a model instance by {{id}} from the data source.
[**drugHistoryReplaceById**](DrugHistoryApi.md#drugHistoryReplaceById) | **PUT** /DrugHistory/{id} | Replace attributes for a model instance and persist it into the data source.


<a name="drugHistoryCreate"></a>
# **drugHistoryCreate**
> DrugHistory drugHistoryCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DrugHistoryApi;


DrugHistoryApi apiInstance = new DrugHistoryApi();
DrugHistory data = new DrugHistory(); // DrugHistory | Model instance data
try {
    DrugHistory result = apiInstance.drugHistoryCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DrugHistoryApi#drugHistoryCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**DrugHistory**](DrugHistory.md)| Model instance data | [optional]

### Return type

[**DrugHistory**](DrugHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="drugHistoryDeleteById"></a>
# **drugHistoryDeleteById**
> Object drugHistoryDeleteById(id)

Delete a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DrugHistoryApi;


DrugHistoryApi apiInstance = new DrugHistoryApi();
String id = "id_example"; // String | Model id
try {
    Object result = apiInstance.drugHistoryDeleteById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DrugHistoryApi#drugHistoryDeleteById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="drugHistoryExists"></a>
# **drugHistoryExists**
> InlineResponse200 drugHistoryExists(id)

Check whether a model instance exists in the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DrugHistoryApi;


DrugHistoryApi apiInstance = new DrugHistoryApi();
String id = "id_example"; // String | Model id
try {
    InlineResponse200 result = apiInstance.drugHistoryExists(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DrugHistoryApi#drugHistoryExists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="drugHistoryFind"></a>
# **drugHistoryFind**
> List&lt;DrugHistory&gt; drugHistoryFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DrugHistoryApi;


DrugHistoryApi apiInstance = new DrugHistoryApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<DrugHistory> result = apiInstance.drugHistoryFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DrugHistoryApi#drugHistoryFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;DrugHistory&gt;**](DrugHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="drugHistoryFindById"></a>
# **drugHistoryFindById**
> DrugHistory drugHistoryFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DrugHistoryApi;


DrugHistoryApi apiInstance = new DrugHistoryApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    DrugHistory result = apiInstance.drugHistoryFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DrugHistoryApi#drugHistoryFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**DrugHistory**](DrugHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="drugHistoryReplaceById"></a>
# **drugHistoryReplaceById**
> DrugHistory drugHistoryReplaceById(id, data)

Replace attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DrugHistoryApi;


DrugHistoryApi apiInstance = new DrugHistoryApi();
String id = "id_example"; // String | Model id
DrugHistory data = new DrugHistory(); // DrugHistory | Model instance data
try {
    DrugHistory result = apiInstance.drugHistoryReplaceById(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DrugHistoryApi#drugHistoryReplaceById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **data** | [**DrugHistory**](DrugHistory.md)| Model instance data | [optional]

### Return type

[**DrugHistory**](DrugHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


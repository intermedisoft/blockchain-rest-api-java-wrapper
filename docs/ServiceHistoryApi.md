# ServiceHistoryApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**serviceHistoryCreate**](ServiceHistoryApi.md#serviceHistoryCreate) | **POST** /ServiceHistory | Create a new instance of the model and persist it into the data source.
[**serviceHistoryDeleteById**](ServiceHistoryApi.md#serviceHistoryDeleteById) | **DELETE** /ServiceHistory/{id} | Delete a model instance by {{id}} from the data source.
[**serviceHistoryExists**](ServiceHistoryApi.md#serviceHistoryExists) | **HEAD** /ServiceHistory/{id} | Check whether a model instance exists in the data source.
[**serviceHistoryFind**](ServiceHistoryApi.md#serviceHistoryFind) | **GET** /ServiceHistory | Find all instances of the model matched by filter from the data source.
[**serviceHistoryFindById**](ServiceHistoryApi.md#serviceHistoryFindById) | **GET** /ServiceHistory/{id} | Find a model instance by {{id}} from the data source.
[**serviceHistoryReplaceById**](ServiceHistoryApi.md#serviceHistoryReplaceById) | **PUT** /ServiceHistory/{id} | Replace attributes for a model instance and persist it into the data source.


<a name="serviceHistoryCreate"></a>
# **serviceHistoryCreate**
> ServiceHistory serviceHistoryCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceHistoryApi;


ServiceHistoryApi apiInstance = new ServiceHistoryApi();
ServiceHistory data = new ServiceHistory(); // ServiceHistory | Model instance data
try {
    ServiceHistory result = apiInstance.serviceHistoryCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceHistoryApi#serviceHistoryCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**ServiceHistory**](ServiceHistory.md)| Model instance data | [optional]

### Return type

[**ServiceHistory**](ServiceHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="serviceHistoryDeleteById"></a>
# **serviceHistoryDeleteById**
> Object serviceHistoryDeleteById(id)

Delete a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceHistoryApi;


ServiceHistoryApi apiInstance = new ServiceHistoryApi();
String id = "id_example"; // String | Model id
try {
    Object result = apiInstance.serviceHistoryDeleteById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceHistoryApi#serviceHistoryDeleteById");
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

<a name="serviceHistoryExists"></a>
# **serviceHistoryExists**
> InlineResponse200 serviceHistoryExists(id)

Check whether a model instance exists in the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceHistoryApi;


ServiceHistoryApi apiInstance = new ServiceHistoryApi();
String id = "id_example"; // String | Model id
try {
    InlineResponse200 result = apiInstance.serviceHistoryExists(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceHistoryApi#serviceHistoryExists");
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

<a name="serviceHistoryFind"></a>
# **serviceHistoryFind**
> List&lt;ServiceHistory&gt; serviceHistoryFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceHistoryApi;


ServiceHistoryApi apiInstance = new ServiceHistoryApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<ServiceHistory> result = apiInstance.serviceHistoryFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceHistoryApi#serviceHistoryFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;ServiceHistory&gt;**](ServiceHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="serviceHistoryFindById"></a>
# **serviceHistoryFindById**
> ServiceHistory serviceHistoryFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceHistoryApi;


ServiceHistoryApi apiInstance = new ServiceHistoryApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    ServiceHistory result = apiInstance.serviceHistoryFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceHistoryApi#serviceHistoryFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**ServiceHistory**](ServiceHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="serviceHistoryReplaceById"></a>
# **serviceHistoryReplaceById**
> ServiceHistory serviceHistoryReplaceById(id, data)

Replace attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ServiceHistoryApi;


ServiceHistoryApi apiInstance = new ServiceHistoryApi();
String id = "id_example"; // String | Model id
ServiceHistory data = new ServiceHistory(); // ServiceHistory | Model instance data
try {
    ServiceHistory result = apiInstance.serviceHistoryReplaceById(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ServiceHistoryApi#serviceHistoryReplaceById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **data** | [**ServiceHistory**](ServiceHistory.md)| Model instance data | [optional]

### Return type

[**ServiceHistory**](ServiceHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


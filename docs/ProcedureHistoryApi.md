# ProcedureHistoryApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**procedureHistoryCreate**](ProcedureHistoryApi.md#procedureHistoryCreate) | **POST** /ProcedureHistory | Create a new instance of the model and persist it into the data source.
[**procedureHistoryDeleteById**](ProcedureHistoryApi.md#procedureHistoryDeleteById) | **DELETE** /ProcedureHistory/{id} | Delete a model instance by {{id}} from the data source.
[**procedureHistoryExists**](ProcedureHistoryApi.md#procedureHistoryExists) | **HEAD** /ProcedureHistory/{id} | Check whether a model instance exists in the data source.
[**procedureHistoryFind**](ProcedureHistoryApi.md#procedureHistoryFind) | **GET** /ProcedureHistory | Find all instances of the model matched by filter from the data source.
[**procedureHistoryFindById**](ProcedureHistoryApi.md#procedureHistoryFindById) | **GET** /ProcedureHistory/{id} | Find a model instance by {{id}} from the data source.
[**procedureHistoryReplaceById**](ProcedureHistoryApi.md#procedureHistoryReplaceById) | **PUT** /ProcedureHistory/{id} | Replace attributes for a model instance and persist it into the data source.


<a name="procedureHistoryCreate"></a>
# **procedureHistoryCreate**
> ProcedureHistory procedureHistoryCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProcedureHistoryApi;


ProcedureHistoryApi apiInstance = new ProcedureHistoryApi();
ProcedureHistory data = new ProcedureHistory(); // ProcedureHistory | Model instance data
try {
    ProcedureHistory result = apiInstance.procedureHistoryCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcedureHistoryApi#procedureHistoryCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**ProcedureHistory**](ProcedureHistory.md)| Model instance data | [optional]

### Return type

[**ProcedureHistory**](ProcedureHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="procedureHistoryDeleteById"></a>
# **procedureHistoryDeleteById**
> Object procedureHistoryDeleteById(id)

Delete a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProcedureHistoryApi;


ProcedureHistoryApi apiInstance = new ProcedureHistoryApi();
String id = "id_example"; // String | Model id
try {
    Object result = apiInstance.procedureHistoryDeleteById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcedureHistoryApi#procedureHistoryDeleteById");
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

<a name="procedureHistoryExists"></a>
# **procedureHistoryExists**
> InlineResponse200 procedureHistoryExists(id)

Check whether a model instance exists in the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProcedureHistoryApi;


ProcedureHistoryApi apiInstance = new ProcedureHistoryApi();
String id = "id_example"; // String | Model id
try {
    InlineResponse200 result = apiInstance.procedureHistoryExists(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcedureHistoryApi#procedureHistoryExists");
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

<a name="procedureHistoryFind"></a>
# **procedureHistoryFind**
> List&lt;ProcedureHistory&gt; procedureHistoryFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProcedureHistoryApi;


ProcedureHistoryApi apiInstance = new ProcedureHistoryApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<ProcedureHistory> result = apiInstance.procedureHistoryFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcedureHistoryApi#procedureHistoryFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;ProcedureHistory&gt;**](ProcedureHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="procedureHistoryFindById"></a>
# **procedureHistoryFindById**
> ProcedureHistory procedureHistoryFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProcedureHistoryApi;


ProcedureHistoryApi apiInstance = new ProcedureHistoryApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    ProcedureHistory result = apiInstance.procedureHistoryFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcedureHistoryApi#procedureHistoryFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**ProcedureHistory**](ProcedureHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="procedureHistoryReplaceById"></a>
# **procedureHistoryReplaceById**
> ProcedureHistory procedureHistoryReplaceById(id, data)

Replace attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProcedureHistoryApi;


ProcedureHistoryApi apiInstance = new ProcedureHistoryApi();
String id = "id_example"; // String | Model id
ProcedureHistory data = new ProcedureHistory(); // ProcedureHistory | Model instance data
try {
    ProcedureHistory result = apiInstance.procedureHistoryReplaceById(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcedureHistoryApi#procedureHistoryReplaceById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **data** | [**ProcedureHistory**](ProcedureHistory.md)| Model instance data | [optional]

### Return type

[**ProcedureHistory**](ProcedureHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


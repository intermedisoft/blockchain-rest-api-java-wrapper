# DiagHistoryApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**diagHistoryCreate**](DiagHistoryApi.md#diagHistoryCreate) | **POST** /DiagHistory | Create a new instance of the model and persist it into the data source.
[**diagHistoryDeleteById**](DiagHistoryApi.md#diagHistoryDeleteById) | **DELETE** /DiagHistory/{id} | Delete a model instance by {{id}} from the data source.
[**diagHistoryExists**](DiagHistoryApi.md#diagHistoryExists) | **HEAD** /DiagHistory/{id} | Check whether a model instance exists in the data source.
[**diagHistoryFind**](DiagHistoryApi.md#diagHistoryFind) | **GET** /DiagHistory | Find all instances of the model matched by filter from the data source.
[**diagHistoryFindById**](DiagHistoryApi.md#diagHistoryFindById) | **GET** /DiagHistory/{id} | Find a model instance by {{id}} from the data source.
[**diagHistoryReplaceById**](DiagHistoryApi.md#diagHistoryReplaceById) | **PUT** /DiagHistory/{id} | Replace attributes for a model instance and persist it into the data source.


<a name="diagHistoryCreate"></a>
# **diagHistoryCreate**
> DiagHistory diagHistoryCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DiagHistoryApi;


DiagHistoryApi apiInstance = new DiagHistoryApi();
DiagHistory data = new DiagHistory(); // DiagHistory | Model instance data
try {
    DiagHistory result = apiInstance.diagHistoryCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiagHistoryApi#diagHistoryCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**DiagHistory**](DiagHistory.md)| Model instance data | [optional]

### Return type

[**DiagHistory**](DiagHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="diagHistoryDeleteById"></a>
# **diagHistoryDeleteById**
> Object diagHistoryDeleteById(id)

Delete a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DiagHistoryApi;


DiagHistoryApi apiInstance = new DiagHistoryApi();
String id = "id_example"; // String | Model id
try {
    Object result = apiInstance.diagHistoryDeleteById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiagHistoryApi#diagHistoryDeleteById");
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

<a name="diagHistoryExists"></a>
# **diagHistoryExists**
> InlineResponse200 diagHistoryExists(id)

Check whether a model instance exists in the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DiagHistoryApi;


DiagHistoryApi apiInstance = new DiagHistoryApi();
String id = "id_example"; // String | Model id
try {
    InlineResponse200 result = apiInstance.diagHistoryExists(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiagHistoryApi#diagHistoryExists");
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

<a name="diagHistoryFind"></a>
# **diagHistoryFind**
> List&lt;DiagHistory&gt; diagHistoryFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DiagHistoryApi;


DiagHistoryApi apiInstance = new DiagHistoryApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<DiagHistory> result = apiInstance.diagHistoryFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiagHistoryApi#diagHistoryFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;DiagHistory&gt;**](DiagHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="diagHistoryFindById"></a>
# **diagHistoryFindById**
> DiagHistory diagHistoryFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DiagHistoryApi;


DiagHistoryApi apiInstance = new DiagHistoryApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    DiagHistory result = apiInstance.diagHistoryFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiagHistoryApi#diagHistoryFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**DiagHistory**](DiagHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="diagHistoryReplaceById"></a>
# **diagHistoryReplaceById**
> DiagHistory diagHistoryReplaceById(id, data)

Replace attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DiagHistoryApi;


DiagHistoryApi apiInstance = new DiagHistoryApi();
String id = "id_example"; // String | Model id
DiagHistory data = new DiagHistory(); // DiagHistory | Model instance data
try {
    DiagHistory result = apiInstance.diagHistoryReplaceById(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiagHistoryApi#diagHistoryReplaceById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **data** | [**DiagHistory**](DiagHistory.md)| Model instance data | [optional]

### Return type

[**DiagHistory**](DiagHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


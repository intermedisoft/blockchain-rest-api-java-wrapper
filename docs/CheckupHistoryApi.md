# CheckupHistoryApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkupHistoryCreate**](CheckupHistoryApi.md#checkupHistoryCreate) | **POST** /CheckupHistory | Create a new instance of the model and persist it into the data source.
[**checkupHistoryDeleteById**](CheckupHistoryApi.md#checkupHistoryDeleteById) | **DELETE** /CheckupHistory/{id} | Delete a model instance by {{id}} from the data source.
[**checkupHistoryExists**](CheckupHistoryApi.md#checkupHistoryExists) | **HEAD** /CheckupHistory/{id} | Check whether a model instance exists in the data source.
[**checkupHistoryFind**](CheckupHistoryApi.md#checkupHistoryFind) | **GET** /CheckupHistory | Find all instances of the model matched by filter from the data source.
[**checkupHistoryFindById**](CheckupHistoryApi.md#checkupHistoryFindById) | **GET** /CheckupHistory/{id} | Find a model instance by {{id}} from the data source.
[**checkupHistoryReplaceById**](CheckupHistoryApi.md#checkupHistoryReplaceById) | **PUT** /CheckupHistory/{id} | Replace attributes for a model instance and persist it into the data source.


<a name="checkupHistoryCreate"></a>
# **checkupHistoryCreate**
> CheckupHistory checkupHistoryCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CheckupHistoryApi;


CheckupHistoryApi apiInstance = new CheckupHistoryApi();
CheckupHistory data = new CheckupHistory(); // CheckupHistory | Model instance data
try {
    CheckupHistory result = apiInstance.checkupHistoryCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckupHistoryApi#checkupHistoryCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**CheckupHistory**](CheckupHistory.md)| Model instance data | [optional]

### Return type

[**CheckupHistory**](CheckupHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="checkupHistoryDeleteById"></a>
# **checkupHistoryDeleteById**
> Object checkupHistoryDeleteById(id)

Delete a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CheckupHistoryApi;


CheckupHistoryApi apiInstance = new CheckupHistoryApi();
String id = "id_example"; // String | Model id
try {
    Object result = apiInstance.checkupHistoryDeleteById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckupHistoryApi#checkupHistoryDeleteById");
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

<a name="checkupHistoryExists"></a>
# **checkupHistoryExists**
> InlineResponse200 checkupHistoryExists(id)

Check whether a model instance exists in the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CheckupHistoryApi;


CheckupHistoryApi apiInstance = new CheckupHistoryApi();
String id = "id_example"; // String | Model id
try {
    InlineResponse200 result = apiInstance.checkupHistoryExists(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckupHistoryApi#checkupHistoryExists");
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

<a name="checkupHistoryFind"></a>
# **checkupHistoryFind**
> List&lt;CheckupHistory&gt; checkupHistoryFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CheckupHistoryApi;


CheckupHistoryApi apiInstance = new CheckupHistoryApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<CheckupHistory> result = apiInstance.checkupHistoryFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckupHistoryApi#checkupHistoryFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;CheckupHistory&gt;**](CheckupHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="checkupHistoryFindById"></a>
# **checkupHistoryFindById**
> CheckupHistory checkupHistoryFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CheckupHistoryApi;


CheckupHistoryApi apiInstance = new CheckupHistoryApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    CheckupHistory result = apiInstance.checkupHistoryFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckupHistoryApi#checkupHistoryFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**CheckupHistory**](CheckupHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="checkupHistoryReplaceById"></a>
# **checkupHistoryReplaceById**
> CheckupHistory checkupHistoryReplaceById(id, data)

Replace attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CheckupHistoryApi;


CheckupHistoryApi apiInstance = new CheckupHistoryApi();
String id = "id_example"; // String | Model id
CheckupHistory data = new CheckupHistory(); // CheckupHistory | Model instance data
try {
    CheckupHistory result = apiInstance.checkupHistoryReplaceById(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CheckupHistoryApi#checkupHistoryReplaceById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **data** | [**CheckupHistory**](CheckupHistory.md)| Model instance data | [optional]

### Return type

[**CheckupHistory**](CheckupHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


# XrayApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**xrayCreate**](XrayApi.md#xrayCreate) | **POST** /Xray | Create a new instance of the model and persist it into the data source.
[**xrayDeleteById**](XrayApi.md#xrayDeleteById) | **DELETE** /Xray/{id} | Delete a model instance by {{id}} from the data source.
[**xrayExists**](XrayApi.md#xrayExists) | **HEAD** /Xray/{id} | Check whether a model instance exists in the data source.
[**xrayFind**](XrayApi.md#xrayFind) | **GET** /Xray | Find all instances of the model matched by filter from the data source.
[**xrayFindById**](XrayApi.md#xrayFindById) | **GET** /Xray/{id} | Find a model instance by {{id}} from the data source.
[**xrayReplaceById**](XrayApi.md#xrayReplaceById) | **PUT** /Xray/{id} | Replace attributes for a model instance and persist it into the data source.


<a name="xrayCreate"></a>
# **xrayCreate**
> Xray xrayCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XrayApi;


XrayApi apiInstance = new XrayApi();
Xray data = new Xray(); // Xray | Model instance data
try {
    Xray result = apiInstance.xrayCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XrayApi#xrayCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Xray**](Xray.md)| Model instance data | [optional]

### Return type

[**Xray**](Xray.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="xrayDeleteById"></a>
# **xrayDeleteById**
> Object xrayDeleteById(id)

Delete a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XrayApi;


XrayApi apiInstance = new XrayApi();
String id = "id_example"; // String | Model id
try {
    Object result = apiInstance.xrayDeleteById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XrayApi#xrayDeleteById");
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

<a name="xrayExists"></a>
# **xrayExists**
> InlineResponse200 xrayExists(id)

Check whether a model instance exists in the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XrayApi;


XrayApi apiInstance = new XrayApi();
String id = "id_example"; // String | Model id
try {
    InlineResponse200 result = apiInstance.xrayExists(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XrayApi#xrayExists");
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

<a name="xrayFind"></a>
# **xrayFind**
> List&lt;Xray&gt; xrayFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XrayApi;


XrayApi apiInstance = new XrayApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<Xray> result = apiInstance.xrayFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XrayApi#xrayFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;Xray&gt;**](Xray.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="xrayFindById"></a>
# **xrayFindById**
> Xray xrayFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XrayApi;


XrayApi apiInstance = new XrayApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    Xray result = apiInstance.xrayFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XrayApi#xrayFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**Xray**](Xray.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="xrayReplaceById"></a>
# **xrayReplaceById**
> Xray xrayReplaceById(id, data)

Replace attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.XrayApi;


XrayApi apiInstance = new XrayApi();
String id = "id_example"; // String | Model id
Xray data = new Xray(); // Xray | Model instance data
try {
    Xray result = apiInstance.xrayReplaceById(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XrayApi#xrayReplaceById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **data** | [**Xray**](Xray.md)| Model instance data | [optional]

### Return type

[**Xray**](Xray.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


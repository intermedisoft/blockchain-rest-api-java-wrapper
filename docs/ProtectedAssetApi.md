# ProtectedAssetApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**protectedAssetCreate**](ProtectedAssetApi.md#protectedAssetCreate) | **POST** /ProtectedAsset | Create a new instance of the model and persist it into the data source.
[**protectedAssetDeleteById**](ProtectedAssetApi.md#protectedAssetDeleteById) | **DELETE** /ProtectedAsset/{id} | Delete a model instance by {{id}} from the data source.
[**protectedAssetExists**](ProtectedAssetApi.md#protectedAssetExists) | **HEAD** /ProtectedAsset/{id} | Check whether a model instance exists in the data source.
[**protectedAssetFind**](ProtectedAssetApi.md#protectedAssetFind) | **GET** /ProtectedAsset | Find all instances of the model matched by filter from the data source.
[**protectedAssetFindById**](ProtectedAssetApi.md#protectedAssetFindById) | **GET** /ProtectedAsset/{id} | Find a model instance by {{id}} from the data source.
[**protectedAssetReplaceById**](ProtectedAssetApi.md#protectedAssetReplaceById) | **PUT** /ProtectedAsset/{id} | Replace attributes for a model instance and persist it into the data source.


<a name="protectedAssetCreate"></a>
# **protectedAssetCreate**
> ProtectedAsset protectedAssetCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProtectedAssetApi;


ProtectedAssetApi apiInstance = new ProtectedAssetApi();
ProtectedAsset data = new ProtectedAsset(); // ProtectedAsset | Model instance data
try {
    ProtectedAsset result = apiInstance.protectedAssetCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtectedAssetApi#protectedAssetCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**ProtectedAsset**](ProtectedAsset.md)| Model instance data | [optional]

### Return type

[**ProtectedAsset**](ProtectedAsset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="protectedAssetDeleteById"></a>
# **protectedAssetDeleteById**
> Object protectedAssetDeleteById(id)

Delete a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProtectedAssetApi;


ProtectedAssetApi apiInstance = new ProtectedAssetApi();
String id = "id_example"; // String | Model id
try {
    Object result = apiInstance.protectedAssetDeleteById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtectedAssetApi#protectedAssetDeleteById");
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

<a name="protectedAssetExists"></a>
# **protectedAssetExists**
> InlineResponse200 protectedAssetExists(id)

Check whether a model instance exists in the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProtectedAssetApi;


ProtectedAssetApi apiInstance = new ProtectedAssetApi();
String id = "id_example"; // String | Model id
try {
    InlineResponse200 result = apiInstance.protectedAssetExists(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtectedAssetApi#protectedAssetExists");
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

<a name="protectedAssetFind"></a>
# **protectedAssetFind**
> List&lt;ProtectedAsset&gt; protectedAssetFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProtectedAssetApi;


ProtectedAssetApi apiInstance = new ProtectedAssetApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<ProtectedAsset> result = apiInstance.protectedAssetFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtectedAssetApi#protectedAssetFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;ProtectedAsset&gt;**](ProtectedAsset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="protectedAssetFindById"></a>
# **protectedAssetFindById**
> ProtectedAsset protectedAssetFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProtectedAssetApi;


ProtectedAssetApi apiInstance = new ProtectedAssetApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    ProtectedAsset result = apiInstance.protectedAssetFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtectedAssetApi#protectedAssetFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**ProtectedAsset**](ProtectedAsset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="protectedAssetReplaceById"></a>
# **protectedAssetReplaceById**
> ProtectedAsset protectedAssetReplaceById(id, data)

Replace attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.ProtectedAssetApi;


ProtectedAssetApi apiInstance = new ProtectedAssetApi();
String id = "id_example"; // String | Model id
ProtectedAsset data = new ProtectedAsset(); // ProtectedAsset | Model instance data
try {
    ProtectedAsset result = apiInstance.protectedAssetReplaceById(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtectedAssetApi#protectedAssetReplaceById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **data** | [**ProtectedAsset**](ProtectedAsset.md)| Model instance data | [optional]

### Return type

[**ProtectedAsset**](ProtectedAsset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


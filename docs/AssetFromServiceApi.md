# AssetFromServiceApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assetFromServiceCreate**](AssetFromServiceApi.md#assetFromServiceCreate) | **POST** /AssetFromService | Create a new instance of the model and persist it into the data source.
[**assetFromServiceDeleteById**](AssetFromServiceApi.md#assetFromServiceDeleteById) | **DELETE** /AssetFromService/{id} | Delete a model instance by {{id}} from the data source.
[**assetFromServiceExists**](AssetFromServiceApi.md#assetFromServiceExists) | **HEAD** /AssetFromService/{id} | Check whether a model instance exists in the data source.
[**assetFromServiceFind**](AssetFromServiceApi.md#assetFromServiceFind) | **GET** /AssetFromService | Find all instances of the model matched by filter from the data source.
[**assetFromServiceFindById**](AssetFromServiceApi.md#assetFromServiceFindById) | **GET** /AssetFromService/{id} | Find a model instance by {{id}} from the data source.
[**assetFromServiceReplaceById**](AssetFromServiceApi.md#assetFromServiceReplaceById) | **PUT** /AssetFromService/{id} | Replace attributes for a model instance and persist it into the data source.


<a name="assetFromServiceCreate"></a>
# **assetFromServiceCreate**
> AssetFromService assetFromServiceCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetFromServiceApi;


AssetFromServiceApi apiInstance = new AssetFromServiceApi();
AssetFromService data = new AssetFromService(); // AssetFromService | Model instance data
try {
    AssetFromService result = apiInstance.assetFromServiceCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetFromServiceApi#assetFromServiceCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**AssetFromService**](AssetFromService.md)| Model instance data | [optional]

### Return type

[**AssetFromService**](AssetFromService.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="assetFromServiceDeleteById"></a>
# **assetFromServiceDeleteById**
> Object assetFromServiceDeleteById(id)

Delete a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetFromServiceApi;


AssetFromServiceApi apiInstance = new AssetFromServiceApi();
String id = "id_example"; // String | Model id
try {
    Object result = apiInstance.assetFromServiceDeleteById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetFromServiceApi#assetFromServiceDeleteById");
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

<a name="assetFromServiceExists"></a>
# **assetFromServiceExists**
> InlineResponse200 assetFromServiceExists(id)

Check whether a model instance exists in the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetFromServiceApi;


AssetFromServiceApi apiInstance = new AssetFromServiceApi();
String id = "id_example"; // String | Model id
try {
    InlineResponse200 result = apiInstance.assetFromServiceExists(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetFromServiceApi#assetFromServiceExists");
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

<a name="assetFromServiceFind"></a>
# **assetFromServiceFind**
> List&lt;AssetFromService&gt; assetFromServiceFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetFromServiceApi;


AssetFromServiceApi apiInstance = new AssetFromServiceApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<AssetFromService> result = apiInstance.assetFromServiceFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetFromServiceApi#assetFromServiceFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;AssetFromService&gt;**](AssetFromService.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="assetFromServiceFindById"></a>
# **assetFromServiceFindById**
> AssetFromService assetFromServiceFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetFromServiceApi;


AssetFromServiceApi apiInstance = new AssetFromServiceApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    AssetFromService result = apiInstance.assetFromServiceFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetFromServiceApi#assetFromServiceFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**AssetFromService**](AssetFromService.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="assetFromServiceReplaceById"></a>
# **assetFromServiceReplaceById**
> AssetFromService assetFromServiceReplaceById(id, data)

Replace attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AssetFromServiceApi;


AssetFromServiceApi apiInstance = new AssetFromServiceApi();
String id = "id_example"; // String | Model id
AssetFromService data = new AssetFromService(); // AssetFromService | Model instance data
try {
    AssetFromService result = apiInstance.assetFromServiceReplaceById(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetFromServiceApi#assetFromServiceReplaceById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **data** | [**AssetFromService**](AssetFromService.md)| Model instance data | [optional]

### Return type

[**AssetFromService**](AssetFromService.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


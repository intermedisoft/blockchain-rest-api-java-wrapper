# HealthCareProviderApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**healthCareProviderCreate**](HealthCareProviderApi.md#healthCareProviderCreate) | **POST** /HealthCareProvider | Create a new instance of the model and persist it into the data source.
[**healthCareProviderDeleteById**](HealthCareProviderApi.md#healthCareProviderDeleteById) | **DELETE** /HealthCareProvider/{id} | Delete a model instance by {{id}} from the data source.
[**healthCareProviderExists**](HealthCareProviderApi.md#healthCareProviderExists) | **HEAD** /HealthCareProvider/{id} | Check whether a model instance exists in the data source.
[**healthCareProviderFind**](HealthCareProviderApi.md#healthCareProviderFind) | **GET** /HealthCareProvider | Find all instances of the model matched by filter from the data source.
[**healthCareProviderFindById**](HealthCareProviderApi.md#healthCareProviderFindById) | **GET** /HealthCareProvider/{id} | Find a model instance by {{id}} from the data source.
[**healthCareProviderReplaceById**](HealthCareProviderApi.md#healthCareProviderReplaceById) | **PUT** /HealthCareProvider/{id} | Replace attributes for a model instance and persist it into the data source.


<a name="healthCareProviderCreate"></a>
# **healthCareProviderCreate**
> HealthCareProvider healthCareProviderCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HealthCareProviderApi;


HealthCareProviderApi apiInstance = new HealthCareProviderApi();
HealthCareProvider data = new HealthCareProvider(); // HealthCareProvider | Model instance data
try {
    HealthCareProvider result = apiInstance.healthCareProviderCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HealthCareProviderApi#healthCareProviderCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**HealthCareProvider**](HealthCareProvider.md)| Model instance data | [optional]

### Return type

[**HealthCareProvider**](HealthCareProvider.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="healthCareProviderDeleteById"></a>
# **healthCareProviderDeleteById**
> Object healthCareProviderDeleteById(id)

Delete a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HealthCareProviderApi;


HealthCareProviderApi apiInstance = new HealthCareProviderApi();
String id = "id_example"; // String | Model id
try {
    Object result = apiInstance.healthCareProviderDeleteById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HealthCareProviderApi#healthCareProviderDeleteById");
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

<a name="healthCareProviderExists"></a>
# **healthCareProviderExists**
> InlineResponse200 healthCareProviderExists(id)

Check whether a model instance exists in the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HealthCareProviderApi;


HealthCareProviderApi apiInstance = new HealthCareProviderApi();
String id = "id_example"; // String | Model id
try {
    InlineResponse200 result = apiInstance.healthCareProviderExists(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HealthCareProviderApi#healthCareProviderExists");
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

<a name="healthCareProviderFind"></a>
# **healthCareProviderFind**
> List&lt;HealthCareProvider&gt; healthCareProviderFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HealthCareProviderApi;


HealthCareProviderApi apiInstance = new HealthCareProviderApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<HealthCareProvider> result = apiInstance.healthCareProviderFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HealthCareProviderApi#healthCareProviderFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;HealthCareProvider&gt;**](HealthCareProvider.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="healthCareProviderFindById"></a>
# **healthCareProviderFindById**
> HealthCareProvider healthCareProviderFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HealthCareProviderApi;


HealthCareProviderApi apiInstance = new HealthCareProviderApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    HealthCareProvider result = apiInstance.healthCareProviderFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HealthCareProviderApi#healthCareProviderFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**HealthCareProvider**](HealthCareProvider.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="healthCareProviderReplaceById"></a>
# **healthCareProviderReplaceById**
> HealthCareProvider healthCareProviderReplaceById(id, data)

Replace attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HealthCareProviderApi;


HealthCareProviderApi apiInstance = new HealthCareProviderApi();
String id = "id_example"; // String | Model id
HealthCareProvider data = new HealthCareProvider(); // HealthCareProvider | Model instance data
try {
    HealthCareProvider result = apiInstance.healthCareProviderReplaceById(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HealthCareProviderApi#healthCareProviderReplaceById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **data** | [**HealthCareProvider**](HealthCareProvider.md)| Model instance data | [optional]

### Return type

[**HealthCareProvider**](HealthCareProvider.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


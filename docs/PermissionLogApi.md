# PermissionLogApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**permissionLogCreate**](PermissionLogApi.md#permissionLogCreate) | **POST** /PermissionLog | Create a new instance of the model and persist it into the data source.
[**permissionLogDeleteById**](PermissionLogApi.md#permissionLogDeleteById) | **DELETE** /PermissionLog/{id} | Delete a model instance by {{id}} from the data source.
[**permissionLogExists**](PermissionLogApi.md#permissionLogExists) | **HEAD** /PermissionLog/{id} | Check whether a model instance exists in the data source.
[**permissionLogFind**](PermissionLogApi.md#permissionLogFind) | **GET** /PermissionLog | Find all instances of the model matched by filter from the data source.
[**permissionLogFindById**](PermissionLogApi.md#permissionLogFindById) | **GET** /PermissionLog/{id} | Find a model instance by {{id}} from the data source.
[**permissionLogReplaceById**](PermissionLogApi.md#permissionLogReplaceById) | **PUT** /PermissionLog/{id} | Replace attributes for a model instance and persist it into the data source.


<a name="permissionLogCreate"></a>
# **permissionLogCreate**
> PermissionLog permissionLogCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PermissionLogApi;


PermissionLogApi apiInstance = new PermissionLogApi();
PermissionLog data = new PermissionLog(); // PermissionLog | Model instance data
try {
    PermissionLog result = apiInstance.permissionLogCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PermissionLogApi#permissionLogCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**PermissionLog**](PermissionLog.md)| Model instance data | [optional]

### Return type

[**PermissionLog**](PermissionLog.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="permissionLogDeleteById"></a>
# **permissionLogDeleteById**
> Object permissionLogDeleteById(id)

Delete a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PermissionLogApi;


PermissionLogApi apiInstance = new PermissionLogApi();
String id = "id_example"; // String | Model id
try {
    Object result = apiInstance.permissionLogDeleteById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PermissionLogApi#permissionLogDeleteById");
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

<a name="permissionLogExists"></a>
# **permissionLogExists**
> InlineResponse200 permissionLogExists(id)

Check whether a model instance exists in the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PermissionLogApi;


PermissionLogApi apiInstance = new PermissionLogApi();
String id = "id_example"; // String | Model id
try {
    InlineResponse200 result = apiInstance.permissionLogExists(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PermissionLogApi#permissionLogExists");
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

<a name="permissionLogFind"></a>
# **permissionLogFind**
> List&lt;PermissionLog&gt; permissionLogFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PermissionLogApi;


PermissionLogApi apiInstance = new PermissionLogApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<PermissionLog> result = apiInstance.permissionLogFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PermissionLogApi#permissionLogFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;PermissionLog&gt;**](PermissionLog.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="permissionLogFindById"></a>
# **permissionLogFindById**
> PermissionLog permissionLogFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PermissionLogApi;


PermissionLogApi apiInstance = new PermissionLogApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    PermissionLog result = apiInstance.permissionLogFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PermissionLogApi#permissionLogFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**PermissionLog**](PermissionLog.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="permissionLogReplaceById"></a>
# **permissionLogReplaceById**
> PermissionLog permissionLogReplaceById(id, data)

Replace attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PermissionLogApi;


PermissionLogApi apiInstance = new PermissionLogApi();
String id = "id_example"; // String | Model id
PermissionLog data = new PermissionLog(); // PermissionLog | Model instance data
try {
    PermissionLog result = apiInstance.permissionLogReplaceById(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PermissionLogApi#permissionLogReplaceById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **data** | [**PermissionLog**](PermissionLog.md)| Model instance data | [optional]

### Return type

[**PermissionLog**](PermissionLog.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


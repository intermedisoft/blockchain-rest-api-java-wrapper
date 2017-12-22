# PermissionTransactionApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**permissionTransactionCreate**](PermissionTransactionApi.md#permissionTransactionCreate) | **POST** /PermissionTransaction | Create a new instance of the model and persist it into the data source.
[**permissionTransactionFind**](PermissionTransactionApi.md#permissionTransactionFind) | **GET** /PermissionTransaction | Find all instances of the model matched by filter from the data source.
[**permissionTransactionFindById**](PermissionTransactionApi.md#permissionTransactionFindById) | **GET** /PermissionTransaction/{id} | Find a model instance by {{id}} from the data source.


<a name="permissionTransactionCreate"></a>
# **permissionTransactionCreate**
> PermissionTransaction permissionTransactionCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PermissionTransactionApi;


PermissionTransactionApi apiInstance = new PermissionTransactionApi();
PermissionTransaction data = new PermissionTransaction(); // PermissionTransaction | Model instance data
try {
    PermissionTransaction result = apiInstance.permissionTransactionCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PermissionTransactionApi#permissionTransactionCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**PermissionTransaction**](PermissionTransaction.md)| Model instance data | [optional]

### Return type

[**PermissionTransaction**](PermissionTransaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="permissionTransactionFind"></a>
# **permissionTransactionFind**
> List&lt;PermissionTransaction&gt; permissionTransactionFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PermissionTransactionApi;


PermissionTransactionApi apiInstance = new PermissionTransactionApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<PermissionTransaction> result = apiInstance.permissionTransactionFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PermissionTransactionApi#permissionTransactionFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;PermissionTransaction&gt;**](PermissionTransaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="permissionTransactionFindById"></a>
# **permissionTransactionFindById**
> PermissionTransaction permissionTransactionFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PermissionTransactionApi;


PermissionTransactionApi apiInstance = new PermissionTransactionApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    PermissionTransaction result = apiInstance.permissionTransactionFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PermissionTransactionApi#permissionTransactionFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**PermissionTransaction**](PermissionTransaction.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


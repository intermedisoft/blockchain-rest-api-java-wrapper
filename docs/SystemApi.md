# SystemApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**systemBindIdentity**](SystemApi.md#systemBindIdentity) | **POST** /system/identities/bind | Bind an identity to the specified participant
[**systemGetAllHistorianRecords**](SystemApi.md#systemGetAllHistorianRecords) | **GET** /system/historian | Get all Historian Records from the Historian
[**systemGetAllIdentities**](SystemApi.md#systemGetAllIdentities) | **GET** /system/identities | Get all identities from the identity registry
[**systemGetHistorianRecordByID**](SystemApi.md#systemGetHistorianRecordByID) | **GET** /system/historian/{id} | Get the specified Historian Record from the Historian
[**systemGetIdentityByID**](SystemApi.md#systemGetIdentityByID) | **GET** /system/identities/{id} | Get the specified identity from the identity registry
[**systemIssueIdentity**](SystemApi.md#systemIssueIdentity) | **POST** /system/identities/issue | Issue an identity to the specified participant
[**systemPing**](SystemApi.md#systemPing) | **GET** /system/ping | Test the connection to the business network
[**systemRevokeIdentity**](SystemApi.md#systemRevokeIdentity) | **POST** /system/identities/{id}/revoke | Revoke the specified identity


<a name="systemBindIdentity"></a>
# **systemBindIdentity**
> systemBindIdentity(data)

Bind an identity to the specified participant

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SystemApi;


SystemApi apiInstance = new SystemApi();
BindIdentityRequest data = new BindIdentityRequest(); // BindIdentityRequest | 
try {
    apiInstance.systemBindIdentity(data);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#systemBindIdentity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**BindIdentityRequest**](BindIdentityRequest.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="systemGetAllHistorianRecords"></a>
# **systemGetAllHistorianRecords**
> List&lt;Object&gt; systemGetAllHistorianRecords()

Get all Historian Records from the Historian

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SystemApi;


SystemApi apiInstance = new SystemApi();
try {
    List<Object> result = apiInstance.systemGetAllHistorianRecords();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#systemGetAllHistorianRecords");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;Object&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="systemGetAllIdentities"></a>
# **systemGetAllIdentities**
> List&lt;Object&gt; systemGetAllIdentities()

Get all identities from the identity registry

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SystemApi;


SystemApi apiInstance = new SystemApi();
try {
    List<Object> result = apiInstance.systemGetAllIdentities();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#systemGetAllIdentities");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;Object&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="systemGetHistorianRecordByID"></a>
# **systemGetHistorianRecordByID**
> Object systemGetHistorianRecordByID(id)

Get the specified Historian Record from the Historian

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SystemApi;


SystemApi apiInstance = new SystemApi();
String id = "id_example"; // String | 
try {
    Object result = apiInstance.systemGetHistorianRecordByID(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#systemGetHistorianRecordByID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="systemGetIdentityByID"></a>
# **systemGetIdentityByID**
> Object systemGetIdentityByID(id)

Get the specified identity from the identity registry

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SystemApi;


SystemApi apiInstance = new SystemApi();
String id = "id_example"; // String | 
try {
    Object result = apiInstance.systemGetIdentityByID(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#systemGetIdentityByID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="systemIssueIdentity"></a>
# **systemIssueIdentity**
> File systemIssueIdentity(data)

Issue an identity to the specified participant

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SystemApi;


SystemApi apiInstance = new SystemApi();
IssueIdentityRequest data = new IssueIdentityRequest(); // IssueIdentityRequest | 
try {
    File result = apiInstance.systemIssueIdentity(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#systemIssueIdentity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**IssueIdentityRequest**](IssueIdentityRequest.md)|  |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="systemPing"></a>
# **systemPing**
> PingResponse systemPing()

Test the connection to the business network

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SystemApi;


SystemApi apiInstance = new SystemApi();
try {
    PingResponse result = apiInstance.systemPing();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#systemPing");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PingResponse**](PingResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="systemRevokeIdentity"></a>
# **systemRevokeIdentity**
> systemRevokeIdentity(id)

Revoke the specified identity

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SystemApi;


SystemApi apiInstance = new SystemApi();
String id = "id_example"; // String | 
try {
    apiInstance.systemRevokeIdentity(id);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemApi#systemRevokeIdentity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


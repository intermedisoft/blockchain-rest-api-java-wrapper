# QueryApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**queryListAllCheckupHistoryOfPatient**](QueryApi.md#queryListAllCheckupHistoryOfPatient) | **GET** /queries/listAllCheckupHistoryOfPatient | Show all checkup history for specified patient
[**queryListAllDiagHistoryOfPatient**](QueryApi.md#queryListAllDiagHistoryOfPatient) | **GET** /queries/listAllDiagHistoryOfPatient | Show all diagnostic history for specified patient
[**queryListAllDrugHistoryOfPatient**](QueryApi.md#queryListAllDrugHistoryOfPatient) | **GET** /queries/listAllDrugHistoryOfPatient | Show all drug history for specified patient
[**queryListAllProcedureHistoryOfPatient**](QueryApi.md#queryListAllProcedureHistoryOfPatient) | **GET** /queries/listAllProcedureHistoryOfPatient | Show all procedure history for specified patient
[**queryListAllProtectedAssets**](QueryApi.md#queryListAllProtectedAssets) | **GET** /queries/listAllProtectedAssets | List all protected assets
[**queryListAllRequestWithNoResponse**](QueryApi.md#queryListAllRequestWithNoResponse) | **GET** /queries/listAllRequestWithNoResponse | List all REQUEST PermissionLog that not yet response.
[**queryListAllServiceHistoryOfPatient**](QueryApi.md#queryListAllServiceHistoryOfPatient) | **GET** /queries/listAllServiceHistoryOfPatient | Show all service history for specified patient
[**queryListAllVaccinationOfPatient**](QueryApi.md#queryListAllVaccinationOfPatient) | **GET** /queries/listAllVaccinationOfPatient | Show all vaccination for specified patient


<a name="queryListAllCheckupHistoryOfPatient"></a>
# **queryListAllCheckupHistoryOfPatient**
> List&lt;CheckupHistory&gt; queryListAllCheckupHistoryOfPatient(patientIdParam)

Show all checkup history for specified patient

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.QueryApi;


QueryApi apiInstance = new QueryApi();
String patientIdParam = "patientIdParam_example"; // String | 
try {
    List<CheckupHistory> result = apiInstance.queryListAllCheckupHistoryOfPatient(patientIdParam);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueryApi#queryListAllCheckupHistoryOfPatient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **patientIdParam** | **String**|  |

### Return type

[**List&lt;CheckupHistory&gt;**](CheckupHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="queryListAllDiagHistoryOfPatient"></a>
# **queryListAllDiagHistoryOfPatient**
> List&lt;DiagHistory&gt; queryListAllDiagHistoryOfPatient(patientIdParam)

Show all diagnostic history for specified patient

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.QueryApi;


QueryApi apiInstance = new QueryApi();
String patientIdParam = "patientIdParam_example"; // String | 
try {
    List<DiagHistory> result = apiInstance.queryListAllDiagHistoryOfPatient(patientIdParam);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueryApi#queryListAllDiagHistoryOfPatient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **patientIdParam** | **String**|  |

### Return type

[**List&lt;DiagHistory&gt;**](DiagHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="queryListAllDrugHistoryOfPatient"></a>
# **queryListAllDrugHistoryOfPatient**
> List&lt;DrugHistory&gt; queryListAllDrugHistoryOfPatient(patientIdParam)

Show all drug history for specified patient

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.QueryApi;


QueryApi apiInstance = new QueryApi();
String patientIdParam = "patientIdParam_example"; // String | 
try {
    List<DrugHistory> result = apiInstance.queryListAllDrugHistoryOfPatient(patientIdParam);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueryApi#queryListAllDrugHistoryOfPatient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **patientIdParam** | **String**|  |

### Return type

[**List&lt;DrugHistory&gt;**](DrugHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="queryListAllProcedureHistoryOfPatient"></a>
# **queryListAllProcedureHistoryOfPatient**
> List&lt;ProcedureHistory&gt; queryListAllProcedureHistoryOfPatient(patientIdParam)

Show all procedure history for specified patient

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.QueryApi;


QueryApi apiInstance = new QueryApi();
String patientIdParam = "patientIdParam_example"; // String | 
try {
    List<ProcedureHistory> result = apiInstance.queryListAllProcedureHistoryOfPatient(patientIdParam);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueryApi#queryListAllProcedureHistoryOfPatient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **patientIdParam** | **String**|  |

### Return type

[**List&lt;ProcedureHistory&gt;**](ProcedureHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="queryListAllProtectedAssets"></a>
# **queryListAllProtectedAssets**
> List&lt;ProtectedAsset&gt; queryListAllProtectedAssets()

List all protected assets

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.QueryApi;


QueryApi apiInstance = new QueryApi();
try {
    List<ProtectedAsset> result = apiInstance.queryListAllProtectedAssets();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueryApi#queryListAllProtectedAssets");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ProtectedAsset&gt;**](ProtectedAsset.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="queryListAllRequestWithNoResponse"></a>
# **queryListAllRequestWithNoResponse**
> List&lt;PermissionLog&gt; queryListAllRequestWithNoResponse(patientIdParam, hcpIdParam)

List all REQUEST PermissionLog that not yet response.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.QueryApi;


QueryApi apiInstance = new QueryApi();
String patientIdParam = "patientIdParam_example"; // String | 
String hcpIdParam = "hcpIdParam_example"; // String | 
try {
    List<PermissionLog> result = apiInstance.queryListAllRequestWithNoResponse(patientIdParam, hcpIdParam);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueryApi#queryListAllRequestWithNoResponse");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **patientIdParam** | **String**|  |
 **hcpIdParam** | **String**|  |

### Return type

[**List&lt;PermissionLog&gt;**](PermissionLog.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="queryListAllServiceHistoryOfPatient"></a>
# **queryListAllServiceHistoryOfPatient**
> List&lt;ServiceHistory&gt; queryListAllServiceHistoryOfPatient(patientIdParam)

Show all service history for specified patient

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.QueryApi;


QueryApi apiInstance = new QueryApi();
String patientIdParam = "patientIdParam_example"; // String | 
try {
    List<ServiceHistory> result = apiInstance.queryListAllServiceHistoryOfPatient(patientIdParam);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueryApi#queryListAllServiceHistoryOfPatient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **patientIdParam** | **String**|  |

### Return type

[**List&lt;ServiceHistory&gt;**](ServiceHistory.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="queryListAllVaccinationOfPatient"></a>
# **queryListAllVaccinationOfPatient**
> List&lt;Vaccination&gt; queryListAllVaccinationOfPatient(patientIdParam)

Show all vaccination for specified patient

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.QueryApi;


QueryApi apiInstance = new QueryApi();
String patientIdParam = "patientIdParam_example"; // String | 
try {
    List<Vaccination> result = apiInstance.queryListAllVaccinationOfPatient(patientIdParam);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QueryApi#queryListAllVaccinationOfPatient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **patientIdParam** | **String**|  |

### Return type

[**List&lt;Vaccination&gt;**](Vaccination.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


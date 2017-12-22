# PatientApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**patientCreate**](PatientApi.md#patientCreate) | **POST** /Patient | Create a new instance of the model and persist it into the data source.
[**patientDeleteById**](PatientApi.md#patientDeleteById) | **DELETE** /Patient/{id} | Delete a model instance by {{id}} from the data source.
[**patientExists**](PatientApi.md#patientExists) | **HEAD** /Patient/{id} | Check whether a model instance exists in the data source.
[**patientFind**](PatientApi.md#patientFind) | **GET** /Patient | Find all instances of the model matched by filter from the data source.
[**patientFindById**](PatientApi.md#patientFindById) | **GET** /Patient/{id} | Find a model instance by {{id}} from the data source.
[**patientReplaceById**](PatientApi.md#patientReplaceById) | **PUT** /Patient/{id} | Replace attributes for a model instance and persist it into the data source.


<a name="patientCreate"></a>
# **patientCreate**
> Patient patientCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PatientApi;


PatientApi apiInstance = new PatientApi();
Patient data = new Patient(); // Patient | Model instance data
try {
    Patient result = apiInstance.patientCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PatientApi#patientCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Patient**](Patient.md)| Model instance data | [optional]

### Return type

[**Patient**](Patient.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="patientDeleteById"></a>
# **patientDeleteById**
> Object patientDeleteById(id)

Delete a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PatientApi;


PatientApi apiInstance = new PatientApi();
String id = "id_example"; // String | Model id
try {
    Object result = apiInstance.patientDeleteById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PatientApi#patientDeleteById");
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

<a name="patientExists"></a>
# **patientExists**
> InlineResponse200 patientExists(id)

Check whether a model instance exists in the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PatientApi;


PatientApi apiInstance = new PatientApi();
String id = "id_example"; // String | Model id
try {
    InlineResponse200 result = apiInstance.patientExists(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PatientApi#patientExists");
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

<a name="patientFind"></a>
# **patientFind**
> List&lt;Patient&gt; patientFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PatientApi;


PatientApi apiInstance = new PatientApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<Patient> result = apiInstance.patientFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PatientApi#patientFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;Patient&gt;**](Patient.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="patientFindById"></a>
# **patientFindById**
> Patient patientFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PatientApi;


PatientApi apiInstance = new PatientApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    Patient result = apiInstance.patientFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PatientApi#patientFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**Patient**](Patient.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="patientReplaceById"></a>
# **patientReplaceById**
> Patient patientReplaceById(id, data)

Replace attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.PatientApi;


PatientApi apiInstance = new PatientApi();
String id = "id_example"; // String | Model id
Patient data = new Patient(); // Patient | Model instance data
try {
    Patient result = apiInstance.patientReplaceById(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PatientApi#patientReplaceById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **data** | [**Patient**](Patient.md)| Model instance data | [optional]

### Return type

[**Patient**](Patient.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


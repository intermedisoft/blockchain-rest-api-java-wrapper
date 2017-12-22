# DoctorApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**doctorCreate**](DoctorApi.md#doctorCreate) | **POST** /Doctor | Create a new instance of the model and persist it into the data source.
[**doctorDeleteById**](DoctorApi.md#doctorDeleteById) | **DELETE** /Doctor/{id} | Delete a model instance by {{id}} from the data source.
[**doctorExists**](DoctorApi.md#doctorExists) | **HEAD** /Doctor/{id} | Check whether a model instance exists in the data source.
[**doctorFind**](DoctorApi.md#doctorFind) | **GET** /Doctor | Find all instances of the model matched by filter from the data source.
[**doctorFindById**](DoctorApi.md#doctorFindById) | **GET** /Doctor/{id} | Find a model instance by {{id}} from the data source.
[**doctorReplaceById**](DoctorApi.md#doctorReplaceById) | **PUT** /Doctor/{id} | Replace attributes for a model instance and persist it into the data source.


<a name="doctorCreate"></a>
# **doctorCreate**
> Doctor doctorCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DoctorApi;


DoctorApi apiInstance = new DoctorApi();
Doctor data = new Doctor(); // Doctor | Model instance data
try {
    Doctor result = apiInstance.doctorCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DoctorApi#doctorCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Doctor**](Doctor.md)| Model instance data | [optional]

### Return type

[**Doctor**](Doctor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="doctorDeleteById"></a>
# **doctorDeleteById**
> Object doctorDeleteById(id)

Delete a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DoctorApi;


DoctorApi apiInstance = new DoctorApi();
String id = "id_example"; // String | Model id
try {
    Object result = apiInstance.doctorDeleteById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DoctorApi#doctorDeleteById");
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

<a name="doctorExists"></a>
# **doctorExists**
> InlineResponse200 doctorExists(id)

Check whether a model instance exists in the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DoctorApi;


DoctorApi apiInstance = new DoctorApi();
String id = "id_example"; // String | Model id
try {
    InlineResponse200 result = apiInstance.doctorExists(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DoctorApi#doctorExists");
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

<a name="doctorFind"></a>
# **doctorFind**
> List&lt;Doctor&gt; doctorFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DoctorApi;


DoctorApi apiInstance = new DoctorApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<Doctor> result = apiInstance.doctorFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DoctorApi#doctorFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;Doctor&gt;**](Doctor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="doctorFindById"></a>
# **doctorFindById**
> Doctor doctorFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DoctorApi;


DoctorApi apiInstance = new DoctorApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    Doctor result = apiInstance.doctorFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DoctorApi#doctorFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**Doctor**](Doctor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="doctorReplaceById"></a>
# **doctorReplaceById**
> Doctor doctorReplaceById(id, data)

Replace attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DoctorApi;


DoctorApi apiInstance = new DoctorApi();
String id = "id_example"; // String | Model id
Doctor data = new Doctor(); // Doctor | Model instance data
try {
    Doctor result = apiInstance.doctorReplaceById(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DoctorApi#doctorReplaceById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **data** | [**Doctor**](Doctor.md)| Model instance data | [optional]

### Return type

[**Doctor**](Doctor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


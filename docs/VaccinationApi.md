# VaccinationApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**vaccinationCreate**](VaccinationApi.md#vaccinationCreate) | **POST** /Vaccination | Create a new instance of the model and persist it into the data source.
[**vaccinationDeleteById**](VaccinationApi.md#vaccinationDeleteById) | **DELETE** /Vaccination/{id} | Delete a model instance by {{id}} from the data source.
[**vaccinationExists**](VaccinationApi.md#vaccinationExists) | **HEAD** /Vaccination/{id} | Check whether a model instance exists in the data source.
[**vaccinationFind**](VaccinationApi.md#vaccinationFind) | **GET** /Vaccination | Find all instances of the model matched by filter from the data source.
[**vaccinationFindById**](VaccinationApi.md#vaccinationFindById) | **GET** /Vaccination/{id} | Find a model instance by {{id}} from the data source.
[**vaccinationReplaceById**](VaccinationApi.md#vaccinationReplaceById) | **PUT** /Vaccination/{id} | Replace attributes for a model instance and persist it into the data source.


<a name="vaccinationCreate"></a>
# **vaccinationCreate**
> Vaccination vaccinationCreate(data)

Create a new instance of the model and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VaccinationApi;


VaccinationApi apiInstance = new VaccinationApi();
Vaccination data = new Vaccination(); // Vaccination | Model instance data
try {
    Vaccination result = apiInstance.vaccinationCreate(data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VaccinationApi#vaccinationCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**Vaccination**](Vaccination.md)| Model instance data | [optional]

### Return type

[**Vaccination**](Vaccination.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="vaccinationDeleteById"></a>
# **vaccinationDeleteById**
> Object vaccinationDeleteById(id)

Delete a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VaccinationApi;


VaccinationApi apiInstance = new VaccinationApi();
String id = "id_example"; // String | Model id
try {
    Object result = apiInstance.vaccinationDeleteById(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VaccinationApi#vaccinationDeleteById");
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

<a name="vaccinationExists"></a>
# **vaccinationExists**
> InlineResponse200 vaccinationExists(id)

Check whether a model instance exists in the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VaccinationApi;


VaccinationApi apiInstance = new VaccinationApi();
String id = "id_example"; // String | Model id
try {
    InlineResponse200 result = apiInstance.vaccinationExists(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VaccinationApi#vaccinationExists");
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

<a name="vaccinationFind"></a>
# **vaccinationFind**
> List&lt;Vaccination&gt; vaccinationFind(filter)

Find all instances of the model matched by filter from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VaccinationApi;


VaccinationApi apiInstance = new VaccinationApi();
String filter = "filter_example"; // String | Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    List<Vaccination> result = apiInstance.vaccinationFind(filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VaccinationApi#vaccinationFind");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter defining fields, where, include, order, offset, and limit - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**List&lt;Vaccination&gt;**](Vaccination.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="vaccinationFindById"></a>
# **vaccinationFindById**
> Vaccination vaccinationFindById(id, filter)

Find a model instance by {{id}} from the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VaccinationApi;


VaccinationApi apiInstance = new VaccinationApi();
String id = "id_example"; // String | Model id
String filter = "filter_example"; // String | Filter defining fields and include - must be a JSON-encoded string ({\"something\":\"value\"})
try {
    Vaccination result = apiInstance.vaccinationFindById(id, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VaccinationApi#vaccinationFindById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **filter** | **String**| Filter defining fields and include - must be a JSON-encoded string ({\&quot;something\&quot;:\&quot;value\&quot;}) | [optional]

### Return type

[**Vaccination**](Vaccination.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="vaccinationReplaceById"></a>
# **vaccinationReplaceById**
> Vaccination vaccinationReplaceById(id, data)

Replace attributes for a model instance and persist it into the data source.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.VaccinationApi;


VaccinationApi apiInstance = new VaccinationApi();
String id = "id_example"; // String | Model id
Vaccination data = new Vaccination(); // Vaccination | Model instance data
try {
    Vaccination result = apiInstance.vaccinationReplaceById(id, data);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VaccinationApi#vaccinationReplaceById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Model id |
 **data** | [**Vaccination**](Vaccination.md)| Model instance data | [optional]

### Return type

[**Vaccination**](Vaccination.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


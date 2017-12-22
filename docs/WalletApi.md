# WalletApi

All URIs are relative to *https://localhost/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cardDeleteCardByName**](WalletApi.md#cardDeleteCardByName) | **DELETE** /wallet/{name} | Delete a specific business network card from the wallet
[**cardExistsCardByName**](WalletApi.md#cardExistsCardByName) | **HEAD** /wallet/{name} | Test the existance of a specific business network card in the wallet
[**cardExportCard**](WalletApi.md#cardExportCard) | **GET** /wallet/{name}/export | Export a business network card from the wallet
[**cardGetAllCards**](WalletApi.md#cardGetAllCards) | **GET** /wallet | Get all of the business network cards in the wallet
[**cardGetCardByName**](WalletApi.md#cardGetCardByName) | **GET** /wallet/{name} | Get a specific business network card from the wallet
[**cardImportCard**](WalletApi.md#cardImportCard) | **POST** /wallet/import | Import a business network card into the wallet
[**cardSetDefault**](WalletApi.md#cardSetDefault) | **POST** /wallet/{name}/setDefault | Set a specific business network card as the default business network card


<a name="cardDeleteCardByName"></a>
# **cardDeleteCardByName**
> cardDeleteCardByName(name)

Delete a specific business network card from the wallet

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WalletApi;


WalletApi apiInstance = new WalletApi();
String name = "name_example"; // String | The name of the business network card
try {
    apiInstance.cardDeleteCardByName(name);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#cardDeleteCardByName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the business network card |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="cardExistsCardByName"></a>
# **cardExistsCardByName**
> cardExistsCardByName(name)

Test the existance of a specific business network card in the wallet

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WalletApi;


WalletApi apiInstance = new WalletApi();
String name = "name_example"; // String | The name of the business network card
try {
    apiInstance.cardExistsCardByName(name);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#cardExistsCardByName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the business network card |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="cardExportCard"></a>
# **cardExportCard**
> File cardExportCard(name)

Export a business network card from the wallet

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WalletApi;


WalletApi apiInstance = new WalletApi();
String name = "name_example"; // String | The name of the business network card
try {
    File result = apiInstance.cardExportCard(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#cardExportCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the business network card |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="cardGetAllCards"></a>
# **cardGetAllCards**
> List&lt;Card&gt; cardGetAllCards()

Get all of the business network cards in the wallet

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WalletApi;


WalletApi apiInstance = new WalletApi();
try {
    List<Card> result = apiInstance.cardGetAllCards();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#cardGetAllCards");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Card&gt;**](Card.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="cardGetCardByName"></a>
# **cardGetCardByName**
> Card cardGetCardByName(name)

Get a specific business network card from the wallet

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WalletApi;


WalletApi apiInstance = new WalletApi();
String name = "name_example"; // String | The name of the business network card
try {
    Card result = apiInstance.cardGetCardByName(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#cardGetCardByName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the business network card |

### Return type

[**Card**](Card.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="cardImportCard"></a>
# **cardImportCard**
> cardImportCard(card, name)

Import a business network card into the wallet

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WalletApi;


WalletApi apiInstance = new WalletApi();
File card = new File("/path/to/file.txt"); // File | File to upload
String name = "name_example"; // String | The name of the business network card
try {
    apiInstance.cardImportCard(card, name);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#cardImportCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **card** | **File**| File to upload | [optional]
 **name** | **String**| The name of the business network card | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript

<a name="cardSetDefault"></a>
# **cardSetDefault**
> cardSetDefault(name)

Set a specific business network card as the default business network card

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.WalletApi;


WalletApi apiInstance = new WalletApi();
String name = "name_example"; // String | The name of the business network card
try {
    apiInstance.cardSetDefault(name);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#cardSetDefault");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the business network card |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/x-www-form-urlencoded, application/xml, text/xml
 - **Accept**: application/json, application/xml, text/xml, application/javascript, text/javascript


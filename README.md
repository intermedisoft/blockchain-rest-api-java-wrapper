# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AssetFromServiceApi;

import java.io.File;
import java.util.*;

public class AssetFromServiceApiExample {

    public static void main(String[] args) {
        
        AssetFromServiceApi apiInstance = new AssetFromServiceApi();
        AssetFromService data = new AssetFromService(); // AssetFromService | Model instance data
        try {
            AssetFromService result = apiInstance.assetFromServiceCreate(data);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AssetFromServiceApi#assetFromServiceCreate");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AssetFromServiceApi* | [**assetFromServiceCreate**](docs/AssetFromServiceApi.md#assetFromServiceCreate) | **POST** /AssetFromService | Create a new instance of the model and persist it into the data source.
*AssetFromServiceApi* | [**assetFromServiceDeleteById**](docs/AssetFromServiceApi.md#assetFromServiceDeleteById) | **DELETE** /AssetFromService/{id} | Delete a model instance by {{id}} from the data source.
*AssetFromServiceApi* | [**assetFromServiceExists**](docs/AssetFromServiceApi.md#assetFromServiceExists) | **HEAD** /AssetFromService/{id} | Check whether a model instance exists in the data source.
*AssetFromServiceApi* | [**assetFromServiceFind**](docs/AssetFromServiceApi.md#assetFromServiceFind) | **GET** /AssetFromService | Find all instances of the model matched by filter from the data source.
*AssetFromServiceApi* | [**assetFromServiceFindById**](docs/AssetFromServiceApi.md#assetFromServiceFindById) | **GET** /AssetFromService/{id} | Find a model instance by {{id}} from the data source.
*AssetFromServiceApi* | [**assetFromServiceReplaceById**](docs/AssetFromServiceApi.md#assetFromServiceReplaceById) | **PUT** /AssetFromService/{id} | Replace attributes for a model instance and persist it into the data source.
*CheckupHistoryApi* | [**checkupHistoryCreate**](docs/CheckupHistoryApi.md#checkupHistoryCreate) | **POST** /CheckupHistory | Create a new instance of the model and persist it into the data source.
*CheckupHistoryApi* | [**checkupHistoryDeleteById**](docs/CheckupHistoryApi.md#checkupHistoryDeleteById) | **DELETE** /CheckupHistory/{id} | Delete a model instance by {{id}} from the data source.
*CheckupHistoryApi* | [**checkupHistoryExists**](docs/CheckupHistoryApi.md#checkupHistoryExists) | **HEAD** /CheckupHistory/{id} | Check whether a model instance exists in the data source.
*CheckupHistoryApi* | [**checkupHistoryFind**](docs/CheckupHistoryApi.md#checkupHistoryFind) | **GET** /CheckupHistory | Find all instances of the model matched by filter from the data source.
*CheckupHistoryApi* | [**checkupHistoryFindById**](docs/CheckupHistoryApi.md#checkupHistoryFindById) | **GET** /CheckupHistory/{id} | Find a model instance by {{id}} from the data source.
*CheckupHistoryApi* | [**checkupHistoryReplaceById**](docs/CheckupHistoryApi.md#checkupHistoryReplaceById) | **PUT** /CheckupHistory/{id} | Replace attributes for a model instance and persist it into the data source.
*CreateCheckupHistoryApi* | [**createCheckupHistoryCreate**](docs/CreateCheckupHistoryApi.md#createCheckupHistoryCreate) | **POST** /CreateCheckupHistory | Create a new instance of the model and persist it into the data source.
*CreateCheckupHistoryApi* | [**createCheckupHistoryFind**](docs/CreateCheckupHistoryApi.md#createCheckupHistoryFind) | **GET** /CreateCheckupHistory | Find all instances of the model matched by filter from the data source.
*CreateCheckupHistoryApi* | [**createCheckupHistoryFindById**](docs/CreateCheckupHistoryApi.md#createCheckupHistoryFindById) | **GET** /CreateCheckupHistory/{id} | Find a model instance by {{id}} from the data source.
*CreateDiagHistoryApi* | [**createDiagHistoryCreate**](docs/CreateDiagHistoryApi.md#createDiagHistoryCreate) | **POST** /CreateDiagHistory | Create a new instance of the model and persist it into the data source.
*CreateDiagHistoryApi* | [**createDiagHistoryFind**](docs/CreateDiagHistoryApi.md#createDiagHistoryFind) | **GET** /CreateDiagHistory | Find all instances of the model matched by filter from the data source.
*CreateDiagHistoryApi* | [**createDiagHistoryFindById**](docs/CreateDiagHistoryApi.md#createDiagHistoryFindById) | **GET** /CreateDiagHistory/{id} | Find a model instance by {{id}} from the data source.
*CreateDrugHistoryApi* | [**createDrugHistoryCreate**](docs/CreateDrugHistoryApi.md#createDrugHistoryCreate) | **POST** /CreateDrugHistory | Create a new instance of the model and persist it into the data source.
*CreateDrugHistoryApi* | [**createDrugHistoryFind**](docs/CreateDrugHistoryApi.md#createDrugHistoryFind) | **GET** /CreateDrugHistory | Find all instances of the model matched by filter from the data source.
*CreateDrugHistoryApi* | [**createDrugHistoryFindById**](docs/CreateDrugHistoryApi.md#createDrugHistoryFindById) | **GET** /CreateDrugHistory/{id} | Find a model instance by {{id}} from the data source.
*CreateProcedureHistoryApi* | [**createProcedureHistoryCreate**](docs/CreateProcedureHistoryApi.md#createProcedureHistoryCreate) | **POST** /CreateProcedureHistory | Create a new instance of the model and persist it into the data source.
*CreateProcedureHistoryApi* | [**createProcedureHistoryFind**](docs/CreateProcedureHistoryApi.md#createProcedureHistoryFind) | **GET** /CreateProcedureHistory | Find all instances of the model matched by filter from the data source.
*CreateProcedureHistoryApi* | [**createProcedureHistoryFindById**](docs/CreateProcedureHistoryApi.md#createProcedureHistoryFindById) | **GET** /CreateProcedureHistory/{id} | Find a model instance by {{id}} from the data source.
*CreateServiceHistoryApi* | [**createServiceHistoryCreate**](docs/CreateServiceHistoryApi.md#createServiceHistoryCreate) | **POST** /CreateServiceHistory | Create a new instance of the model and persist it into the data source.
*CreateServiceHistoryApi* | [**createServiceHistoryFind**](docs/CreateServiceHistoryApi.md#createServiceHistoryFind) | **GET** /CreateServiceHistory | Find all instances of the model matched by filter from the data source.
*CreateServiceHistoryApi* | [**createServiceHistoryFindById**](docs/CreateServiceHistoryApi.md#createServiceHistoryFindById) | **GET** /CreateServiceHistory/{id} | Find a model instance by {{id}} from the data source.
*DiagHistoryApi* | [**diagHistoryCreate**](docs/DiagHistoryApi.md#diagHistoryCreate) | **POST** /DiagHistory | Create a new instance of the model and persist it into the data source.
*DiagHistoryApi* | [**diagHistoryDeleteById**](docs/DiagHistoryApi.md#diagHistoryDeleteById) | **DELETE** /DiagHistory/{id} | Delete a model instance by {{id}} from the data source.
*DiagHistoryApi* | [**diagHistoryExists**](docs/DiagHistoryApi.md#diagHistoryExists) | **HEAD** /DiagHistory/{id} | Check whether a model instance exists in the data source.
*DiagHistoryApi* | [**diagHistoryFind**](docs/DiagHistoryApi.md#diagHistoryFind) | **GET** /DiagHistory | Find all instances of the model matched by filter from the data source.
*DiagHistoryApi* | [**diagHistoryFindById**](docs/DiagHistoryApi.md#diagHistoryFindById) | **GET** /DiagHistory/{id} | Find a model instance by {{id}} from the data source.
*DiagHistoryApi* | [**diagHistoryReplaceById**](docs/DiagHistoryApi.md#diagHistoryReplaceById) | **PUT** /DiagHistory/{id} | Replace attributes for a model instance and persist it into the data source.
*DoctorApi* | [**doctorCreate**](docs/DoctorApi.md#doctorCreate) | **POST** /Doctor | Create a new instance of the model and persist it into the data source.
*DoctorApi* | [**doctorDeleteById**](docs/DoctorApi.md#doctorDeleteById) | **DELETE** /Doctor/{id} | Delete a model instance by {{id}} from the data source.
*DoctorApi* | [**doctorExists**](docs/DoctorApi.md#doctorExists) | **HEAD** /Doctor/{id} | Check whether a model instance exists in the data source.
*DoctorApi* | [**doctorFind**](docs/DoctorApi.md#doctorFind) | **GET** /Doctor | Find all instances of the model matched by filter from the data source.
*DoctorApi* | [**doctorFindById**](docs/DoctorApi.md#doctorFindById) | **GET** /Doctor/{id} | Find a model instance by {{id}} from the data source.
*DoctorApi* | [**doctorReplaceById**](docs/DoctorApi.md#doctorReplaceById) | **PUT** /Doctor/{id} | Replace attributes for a model instance and persist it into the data source.
*DrugHistoryApi* | [**drugHistoryCreate**](docs/DrugHistoryApi.md#drugHistoryCreate) | **POST** /DrugHistory | Create a new instance of the model and persist it into the data source.
*DrugHistoryApi* | [**drugHistoryDeleteById**](docs/DrugHistoryApi.md#drugHistoryDeleteById) | **DELETE** /DrugHistory/{id} | Delete a model instance by {{id}} from the data source.
*DrugHistoryApi* | [**drugHistoryExists**](docs/DrugHistoryApi.md#drugHistoryExists) | **HEAD** /DrugHistory/{id} | Check whether a model instance exists in the data source.
*DrugHistoryApi* | [**drugHistoryFind**](docs/DrugHistoryApi.md#drugHistoryFind) | **GET** /DrugHistory | Find all instances of the model matched by filter from the data source.
*DrugHistoryApi* | [**drugHistoryFindById**](docs/DrugHistoryApi.md#drugHistoryFindById) | **GET** /DrugHistory/{id} | Find a model instance by {{id}} from the data source.
*DrugHistoryApi* | [**drugHistoryReplaceById**](docs/DrugHistoryApi.md#drugHistoryReplaceById) | **PUT** /DrugHistory/{id} | Replace attributes for a model instance and persist it into the data source.
*HealthCareProviderApi* | [**healthCareProviderCreate**](docs/HealthCareProviderApi.md#healthCareProviderCreate) | **POST** /HealthCareProvider | Create a new instance of the model and persist it into the data source.
*HealthCareProviderApi* | [**healthCareProviderDeleteById**](docs/HealthCareProviderApi.md#healthCareProviderDeleteById) | **DELETE** /HealthCareProvider/{id} | Delete a model instance by {{id}} from the data source.
*HealthCareProviderApi* | [**healthCareProviderExists**](docs/HealthCareProviderApi.md#healthCareProviderExists) | **HEAD** /HealthCareProvider/{id} | Check whether a model instance exists in the data source.
*HealthCareProviderApi* | [**healthCareProviderFind**](docs/HealthCareProviderApi.md#healthCareProviderFind) | **GET** /HealthCareProvider | Find all instances of the model matched by filter from the data source.
*HealthCareProviderApi* | [**healthCareProviderFindById**](docs/HealthCareProviderApi.md#healthCareProviderFindById) | **GET** /HealthCareProvider/{id} | Find a model instance by {{id}} from the data source.
*HealthCareProviderApi* | [**healthCareProviderReplaceById**](docs/HealthCareProviderApi.md#healthCareProviderReplaceById) | **PUT** /HealthCareProvider/{id} | Replace attributes for a model instance and persist it into the data source.
*PatientApi* | [**patientCreate**](docs/PatientApi.md#patientCreate) | **POST** /Patient | Create a new instance of the model and persist it into the data source.
*PatientApi* | [**patientDeleteById**](docs/PatientApi.md#patientDeleteById) | **DELETE** /Patient/{id} | Delete a model instance by {{id}} from the data source.
*PatientApi* | [**patientExists**](docs/PatientApi.md#patientExists) | **HEAD** /Patient/{id} | Check whether a model instance exists in the data source.
*PatientApi* | [**patientFind**](docs/PatientApi.md#patientFind) | **GET** /Patient | Find all instances of the model matched by filter from the data source.
*PatientApi* | [**patientFindById**](docs/PatientApi.md#patientFindById) | **GET** /Patient/{id} | Find a model instance by {{id}} from the data source.
*PatientApi* | [**patientReplaceById**](docs/PatientApi.md#patientReplaceById) | **PUT** /Patient/{id} | Replace attributes for a model instance and persist it into the data source.
*PermissionLogApi* | [**permissionLogCreate**](docs/PermissionLogApi.md#permissionLogCreate) | **POST** /PermissionLog | Create a new instance of the model and persist it into the data source.
*PermissionLogApi* | [**permissionLogDeleteById**](docs/PermissionLogApi.md#permissionLogDeleteById) | **DELETE** /PermissionLog/{id} | Delete a model instance by {{id}} from the data source.
*PermissionLogApi* | [**permissionLogExists**](docs/PermissionLogApi.md#permissionLogExists) | **HEAD** /PermissionLog/{id} | Check whether a model instance exists in the data source.
*PermissionLogApi* | [**permissionLogFind**](docs/PermissionLogApi.md#permissionLogFind) | **GET** /PermissionLog | Find all instances of the model matched by filter from the data source.
*PermissionLogApi* | [**permissionLogFindById**](docs/PermissionLogApi.md#permissionLogFindById) | **GET** /PermissionLog/{id} | Find a model instance by {{id}} from the data source.
*PermissionLogApi* | [**permissionLogReplaceById**](docs/PermissionLogApi.md#permissionLogReplaceById) | **PUT** /PermissionLog/{id} | Replace attributes for a model instance and persist it into the data source.
*PermissionTransactionApi* | [**permissionTransactionCreate**](docs/PermissionTransactionApi.md#permissionTransactionCreate) | **POST** /PermissionTransaction | Create a new instance of the model and persist it into the data source.
*PermissionTransactionApi* | [**permissionTransactionFind**](docs/PermissionTransactionApi.md#permissionTransactionFind) | **GET** /PermissionTransaction | Find all instances of the model matched by filter from the data source.
*PermissionTransactionApi* | [**permissionTransactionFindById**](docs/PermissionTransactionApi.md#permissionTransactionFindById) | **GET** /PermissionTransaction/{id} | Find a model instance by {{id}} from the data source.
*ProcedureHistoryApi* | [**procedureHistoryCreate**](docs/ProcedureHistoryApi.md#procedureHistoryCreate) | **POST** /ProcedureHistory | Create a new instance of the model and persist it into the data source.
*ProcedureHistoryApi* | [**procedureHistoryDeleteById**](docs/ProcedureHistoryApi.md#procedureHistoryDeleteById) | **DELETE** /ProcedureHistory/{id} | Delete a model instance by {{id}} from the data source.
*ProcedureHistoryApi* | [**procedureHistoryExists**](docs/ProcedureHistoryApi.md#procedureHistoryExists) | **HEAD** /ProcedureHistory/{id} | Check whether a model instance exists in the data source.
*ProcedureHistoryApi* | [**procedureHistoryFind**](docs/ProcedureHistoryApi.md#procedureHistoryFind) | **GET** /ProcedureHistory | Find all instances of the model matched by filter from the data source.
*ProcedureHistoryApi* | [**procedureHistoryFindById**](docs/ProcedureHistoryApi.md#procedureHistoryFindById) | **GET** /ProcedureHistory/{id} | Find a model instance by {{id}} from the data source.
*ProcedureHistoryApi* | [**procedureHistoryReplaceById**](docs/ProcedureHistoryApi.md#procedureHistoryReplaceById) | **PUT** /ProcedureHistory/{id} | Replace attributes for a model instance and persist it into the data source.
*ProtectedAssetApi* | [**protectedAssetCreate**](docs/ProtectedAssetApi.md#protectedAssetCreate) | **POST** /ProtectedAsset | Create a new instance of the model and persist it into the data source.
*ProtectedAssetApi* | [**protectedAssetDeleteById**](docs/ProtectedAssetApi.md#protectedAssetDeleteById) | **DELETE** /ProtectedAsset/{id} | Delete a model instance by {{id}} from the data source.
*ProtectedAssetApi* | [**protectedAssetExists**](docs/ProtectedAssetApi.md#protectedAssetExists) | **HEAD** /ProtectedAsset/{id} | Check whether a model instance exists in the data source.
*ProtectedAssetApi* | [**protectedAssetFind**](docs/ProtectedAssetApi.md#protectedAssetFind) | **GET** /ProtectedAsset | Find all instances of the model matched by filter from the data source.
*ProtectedAssetApi* | [**protectedAssetFindById**](docs/ProtectedAssetApi.md#protectedAssetFindById) | **GET** /ProtectedAsset/{id} | Find a model instance by {{id}} from the data source.
*ProtectedAssetApi* | [**protectedAssetReplaceById**](docs/ProtectedAssetApi.md#protectedAssetReplaceById) | **PUT** /ProtectedAsset/{id} | Replace attributes for a model instance and persist it into the data source.
*QueryApi* | [**queryListAllCheckupHistoryOfPatient**](docs/QueryApi.md#queryListAllCheckupHistoryOfPatient) | **GET** /queries/listAllCheckupHistoryOfPatient | Show all checkup history for specified patient
*QueryApi* | [**queryListAllDiagHistoryOfPatient**](docs/QueryApi.md#queryListAllDiagHistoryOfPatient) | **GET** /queries/listAllDiagHistoryOfPatient | Show all diagnostic history for specified patient
*QueryApi* | [**queryListAllDrugHistoryOfPatient**](docs/QueryApi.md#queryListAllDrugHistoryOfPatient) | **GET** /queries/listAllDrugHistoryOfPatient | Show all drug history for specified patient
*QueryApi* | [**queryListAllGrantedPermission**](docs/QueryApi.md#queryListAllGrantedPermission) | **GET** /queries/listAllGrantedPermission | List all valid permission grant
*QueryApi* | [**queryListAllPendingPermissionRequest**](docs/QueryApi.md#queryListAllPendingPermissionRequest) | **GET** /queries/listAllPendingPermissionRequest | Get list of pending permission request of patient
*QueryApi* | [**queryListAllProcedureHistoryOfPatient**](docs/QueryApi.md#queryListAllProcedureHistoryOfPatient) | **GET** /queries/listAllProcedureHistoryOfPatient | Show all procedure history for specified patient
*QueryApi* | [**queryListAllProtectedAssets**](docs/QueryApi.md#queryListAllProtectedAssets) | **GET** /queries/listAllProtectedAssets | List all protected assets
*QueryApi* | [**queryListAllServiceHistoryOfPatient**](docs/QueryApi.md#queryListAllServiceHistoryOfPatient) | **GET** /queries/listAllServiceHistoryOfPatient | Show all service history for specified patient
*ServiceHistoryApi* | [**serviceHistoryCreate**](docs/ServiceHistoryApi.md#serviceHistoryCreate) | **POST** /ServiceHistory | Create a new instance of the model and persist it into the data source.
*ServiceHistoryApi* | [**serviceHistoryDeleteById**](docs/ServiceHistoryApi.md#serviceHistoryDeleteById) | **DELETE** /ServiceHistory/{id} | Delete a model instance by {{id}} from the data source.
*ServiceHistoryApi* | [**serviceHistoryExists**](docs/ServiceHistoryApi.md#serviceHistoryExists) | **HEAD** /ServiceHistory/{id} | Check whether a model instance exists in the data source.
*ServiceHistoryApi* | [**serviceHistoryFind**](docs/ServiceHistoryApi.md#serviceHistoryFind) | **GET** /ServiceHistory | Find all instances of the model matched by filter from the data source.
*ServiceHistoryApi* | [**serviceHistoryFindById**](docs/ServiceHistoryApi.md#serviceHistoryFindById) | **GET** /ServiceHistory/{id} | Find a model instance by {{id}} from the data source.
*ServiceHistoryApi* | [**serviceHistoryReplaceById**](docs/ServiceHistoryApi.md#serviceHistoryReplaceById) | **PUT** /ServiceHistory/{id} | Replace attributes for a model instance and persist it into the data source.
*SystemApi* | [**systemBindIdentity**](docs/SystemApi.md#systemBindIdentity) | **POST** /system/identities/bind | Bind an identity to the specified participant
*SystemApi* | [**systemGetAllHistorianRecords**](docs/SystemApi.md#systemGetAllHistorianRecords) | **GET** /system/historian | Get all Historian Records from the Historian
*SystemApi* | [**systemGetAllIdentities**](docs/SystemApi.md#systemGetAllIdentities) | **GET** /system/identities | Get all identities from the identity registry
*SystemApi* | [**systemGetHistorianRecordByID**](docs/SystemApi.md#systemGetHistorianRecordByID) | **GET** /system/historian/{id} | Get the specified Historian Record from the Historian
*SystemApi* | [**systemGetIdentityByID**](docs/SystemApi.md#systemGetIdentityByID) | **GET** /system/identities/{id} | Get the specified identity from the identity registry
*SystemApi* | [**systemIssueIdentity**](docs/SystemApi.md#systemIssueIdentity) | **POST** /system/identities/issue | Issue an identity to the specified participant
*SystemApi* | [**systemPing**](docs/SystemApi.md#systemPing) | **GET** /system/ping | Test the connection to the business network
*SystemApi* | [**systemRevokeIdentity**](docs/SystemApi.md#systemRevokeIdentity) | **POST** /system/identities/{id}/revoke | Revoke the specified identity
*UpdateCheckupHistoryApi* | [**updateCheckupHistoryCreate**](docs/UpdateCheckupHistoryApi.md#updateCheckupHistoryCreate) | **POST** /UpdateCheckupHistory | Create a new instance of the model and persist it into the data source.
*UpdateCheckupHistoryApi* | [**updateCheckupHistoryFind**](docs/UpdateCheckupHistoryApi.md#updateCheckupHistoryFind) | **GET** /UpdateCheckupHistory | Find all instances of the model matched by filter from the data source.
*UpdateCheckupHistoryApi* | [**updateCheckupHistoryFindById**](docs/UpdateCheckupHistoryApi.md#updateCheckupHistoryFindById) | **GET** /UpdateCheckupHistory/{id} | Find a model instance by {{id}} from the data source.
*UpdateDiagHistoryApi* | [**updateDiagHistoryCreate**](docs/UpdateDiagHistoryApi.md#updateDiagHistoryCreate) | **POST** /UpdateDiagHistory | Create a new instance of the model and persist it into the data source.
*UpdateDiagHistoryApi* | [**updateDiagHistoryFind**](docs/UpdateDiagHistoryApi.md#updateDiagHistoryFind) | **GET** /UpdateDiagHistory | Find all instances of the model matched by filter from the data source.
*UpdateDiagHistoryApi* | [**updateDiagHistoryFindById**](docs/UpdateDiagHistoryApi.md#updateDiagHistoryFindById) | **GET** /UpdateDiagHistory/{id} | Find a model instance by {{id}} from the data source.
*UpdateDrugHistoryApi* | [**updateDrugHistoryCreate**](docs/UpdateDrugHistoryApi.md#updateDrugHistoryCreate) | **POST** /UpdateDrugHistory | Create a new instance of the model and persist it into the data source.
*UpdateDrugHistoryApi* | [**updateDrugHistoryFind**](docs/UpdateDrugHistoryApi.md#updateDrugHistoryFind) | **GET** /UpdateDrugHistory | Find all instances of the model matched by filter from the data source.
*UpdateDrugHistoryApi* | [**updateDrugHistoryFindById**](docs/UpdateDrugHistoryApi.md#updateDrugHistoryFindById) | **GET** /UpdateDrugHistory/{id} | Find a model instance by {{id}} from the data source.
*UpdateProcedureHistoryApi* | [**updateProcedureHistoryCreate**](docs/UpdateProcedureHistoryApi.md#updateProcedureHistoryCreate) | **POST** /UpdateProcedureHistory | Create a new instance of the model and persist it into the data source.
*UpdateProcedureHistoryApi* | [**updateProcedureHistoryFind**](docs/UpdateProcedureHistoryApi.md#updateProcedureHistoryFind) | **GET** /UpdateProcedureHistory | Find all instances of the model matched by filter from the data source.
*UpdateProcedureHistoryApi* | [**updateProcedureHistoryFindById**](docs/UpdateProcedureHistoryApi.md#updateProcedureHistoryFindById) | **GET** /UpdateProcedureHistory/{id} | Find a model instance by {{id}} from the data source.
*UpdateServiceHistoryApi* | [**updateServiceHistoryCreate**](docs/UpdateServiceHistoryApi.md#updateServiceHistoryCreate) | **POST** /UpdateServiceHistory | Create a new instance of the model and persist it into the data source.
*UpdateServiceHistoryApi* | [**updateServiceHistoryFind**](docs/UpdateServiceHistoryApi.md#updateServiceHistoryFind) | **GET** /UpdateServiceHistory | Find all instances of the model matched by filter from the data source.
*UpdateServiceHistoryApi* | [**updateServiceHistoryFindById**](docs/UpdateServiceHistoryApi.md#updateServiceHistoryFindById) | **GET** /UpdateServiceHistory/{id} | Find a model instance by {{id}} from the data source.
*WalletApi* | [**cardDeleteCardByName**](docs/WalletApi.md#cardDeleteCardByName) | **DELETE** /wallet/{name} | Delete a specific business network card from the wallet
*WalletApi* | [**cardExistsCardByName**](docs/WalletApi.md#cardExistsCardByName) | **HEAD** /wallet/{name} | Test the existance of a specific business network card in the wallet
*WalletApi* | [**cardExportCard**](docs/WalletApi.md#cardExportCard) | **GET** /wallet/{name}/export | Export a business network card from the wallet
*WalletApi* | [**cardGetAllCards**](docs/WalletApi.md#cardGetAllCards) | **GET** /wallet | Get all of the business network cards in the wallet
*WalletApi* | [**cardGetCardByName**](docs/WalletApi.md#cardGetCardByName) | **GET** /wallet/{name} | Get a specific business network card from the wallet
*WalletApi* | [**cardImportCard**](docs/WalletApi.md#cardImportCard) | **POST** /wallet/import | Import a business network card into the wallet
*WalletApi* | [**cardSetDefault**](docs/WalletApi.md#cardSetDefault) | **POST** /wallet/{name}/setDefault | Set a specific business network card as the default business network card


## Documentation for Models

 - [AssetFromService](docs/AssetFromService.md)
 - [BindIdentityRequest](docs/BindIdentityRequest.md)
 - [Card](docs/Card.md)
 - [CheckupHistory](docs/CheckupHistory.md)
 - [CreateCheckupHistory](docs/CreateCheckupHistory.md)
 - [CreateDiagHistory](docs/CreateDiagHistory.md)
 - [CreateDrugHistory](docs/CreateDrugHistory.md)
 - [CreateProcedureHistory](docs/CreateProcedureHistory.md)
 - [CreateServiceHistory](docs/CreateServiceHistory.md)
 - [DiagHistory](docs/DiagHistory.md)
 - [Doctor](docs/Doctor.md)
 - [DrugHistory](docs/DrugHistory.md)
 - [Exercise](docs/Exercise.md)
 - [Food](docs/Food.md)
 - [HealthCareProvider](docs/HealthCareProvider.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [IssueIdentityRequest](docs/IssueIdentityRequest.md)
 - [Lifestyle](docs/Lifestyle.md)
 - [Patient](docs/Patient.md)
 - [PermissionLog](docs/PermissionLog.md)
 - [PermissionTransaction](docs/PermissionTransaction.md)
 - [PingResponse](docs/PingResponse.md)
 - [ProcedureHistory](docs/ProcedureHistory.md)
 - [ProtectedAsset](docs/ProtectedAsset.md)
 - [ServiceHistory](docs/ServiceHistory.md)
 - [UpdateCheckupHistory](docs/UpdateCheckupHistory.md)
 - [UpdateDiagHistory](docs/UpdateDiagHistory.md)
 - [UpdateDrugHistory](docs/UpdateDrugHistory.md)
 - [UpdateProcedureHistory](docs/UpdateProcedureHistory.md)
 - [UpdateServiceHistory](docs/UpdateServiceHistory.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author




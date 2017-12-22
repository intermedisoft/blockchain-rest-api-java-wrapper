
# PermissionTransaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PropertyClass** | **String** | The class identifier for this type |  [optional]
**permissionType** | [**PermissionTypeEnum**](#PermissionTypeEnum) |  | 
**patient** | [**XAny**](XAny.md) | The identifier of an instance of patient | 
**healthCareProvider** | [**XAny**](XAny.md) | The identifier of an instance of healthCareProvider | 
**transactionId** | **String** | The instance identifier for this type |  [optional]
**timestamp** | [**DateTime**](DateTime.md) |  |  [optional]


<a name="PermissionTypeEnum"></a>
## Enum: PermissionTypeEnum
Name | Value
---- | -----
REQUEST | &quot;REQUEST&quot;
GRANT | &quot;GRANT&quot;
DENY | &quot;DENY&quot;
REVOKE | &quot;REVOKE&quot;




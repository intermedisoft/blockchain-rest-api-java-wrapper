
# PermissionLog

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PropertyClass** | **String** | The class identifier for this type |  [optional]
**permissionLogId** | **String** | The instance identifier for this type | 
**permissionType** | [**PermissionTypeEnum**](#PermissionTypeEnum) |  | 
**actionDateTime** | [**DateTime**](DateTime.md) |  | 
**patient** | [**XAny**](XAny.md) | The identifier of an instance of patient | 
**healthCareProvider** | [**XAny**](XAny.md) | The identifier of an instance of healthCareProvider | 


<a name="PermissionTypeEnum"></a>
## Enum: PermissionTypeEnum
Name | Value
---- | -----
REQUEST | &quot;REQUEST&quot;
GRANT | &quot;GRANT&quot;
DENY | &quot;DENY&quot;
REVOKE | &quot;REVOKE&quot;




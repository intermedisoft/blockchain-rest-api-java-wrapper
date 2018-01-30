
# PermissionLog

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PropertyClass** | **String** | The class identifier for this type |  [optional]
**permissionLogId** | **String** | The instance identifier for this type | 
**permissionType** | [**PermissionTypeEnum**](#PermissionTypeEnum) |  | 
**actionDateTime** | [**DateTime**](DateTime.md) |  | 
**patientResponseResult** | [**PatientResponseResultEnum**](#PatientResponseResultEnum) |  |  [optional]
**patientResponseDateTime** | [**DateTime**](DateTime.md) |  |  [optional]
**patientAcknowledgeDateTime** | [**DateTime**](DateTime.md) |  |  [optional]
**patient** | [**XAny**](XAny.md) | The identifier of an instance of patient | 
**healthCareProvider** | [**XAny**](XAny.md) | The identifier of an instance of healthCareProvider | 


<a name="PermissionTypeEnum"></a>
## Enum: PermissionTypeEnum
Name | Value
---- | -----
NOOP | &quot;NOOP&quot;
REQUEST | &quot;REQUEST&quot;
GRANT | &quot;GRANT&quot;
DENY | &quot;DENY&quot;
REVOKE | &quot;REVOKE&quot;


<a name="PatientResponseResultEnum"></a>
## Enum: PatientResponseResultEnum
Name | Value
---- | -----
NOOP | &quot;NOOP&quot;
REQUEST | &quot;REQUEST&quot;
GRANT | &quot;GRANT&quot;
DENY | &quot;DENY&quot;
REVOKE | &quot;REVOKE&quot;




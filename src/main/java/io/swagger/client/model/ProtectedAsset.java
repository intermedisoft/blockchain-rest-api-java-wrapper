/**
 * LoopBack Application
 * No descripton provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * An asset named ProtectedAsset
 */
@ApiModel(description = "An asset named ProtectedAsset")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-22T10:20:50.211+07:00")
public class ProtectedAsset   {
  @SerializedName("$class")
  private String PropertyClass = "com.depa.blockchain.assets.ProtectedAsset";

  @SerializedName("assetId")
  private String assetId = null;

  @SerializedName("authorized")
  private List<String> authorized = new ArrayList<String>();

  @SerializedName("patient")
  private String patient = null;

  @SerializedName("healthCareProvider")
  private String healthCareProvider = null;

  public ProtectedAsset PropertyClass(String PropertyClass) {
    this.PropertyClass = PropertyClass;
    return this;
  }

   /**
   * The class identifier for this type
   * @return PropertyClass
  **/
  @ApiModelProperty(example = "null", value = "The class identifier for this type")
  public String getPropertyClass() {
    return PropertyClass;
  }

  public void setPropertyClass(String PropertyClass) {
    this.PropertyClass = PropertyClass;
  }

  public ProtectedAsset assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

   /**
   * The instance identifier for this type
   * @return assetId
  **/
  @ApiModelProperty(example = "null", required = true, value = "The instance identifier for this type")
  public String getAssetId() {
    return assetId;
  }

  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  public ProtectedAsset authorized(List<String> authorized) {
    this.authorized = authorized;
    return this;
  }

  public ProtectedAsset addAuthorizedItem(String authorizedItem) {
    this.authorized.add(authorizedItem);
    return this;
  }

   /**
   * Get authorized
   * @return authorized
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getAuthorized() {
    return authorized;
  }

  public void setAuthorized(List<String> authorized) {
    this.authorized = authorized;
  }

  public ProtectedAsset patient(String patient) {
    this.patient = patient;
    return this;
  }

   /**
   * The identifier of an instance of patient
   * @return patient
  **/
  @ApiModelProperty(example = "null", required = true, value = "The identifier of an instance of patient")
  public String getPatient() {
    return patient;
  }

  public void setPatient(String patient) {
    this.patient = patient;
  }

  public ProtectedAsset healthCareProvider(String healthCareProvider) {
    this.healthCareProvider = healthCareProvider;
    return this;
  }

   /**
   * The identifier of an instance of healthCareProvider
   * @return healthCareProvider
  **/
  @ApiModelProperty(example = "null", required = true, value = "The identifier of an instance of healthCareProvider")
  public String getHealthCareProvider() {
    return healthCareProvider;
  }

  public void setHealthCareProvider(String healthCareProvider) {
    this.healthCareProvider = healthCareProvider;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProtectedAsset protectedAsset = (ProtectedAsset) o;
    return Objects.equals(this.PropertyClass, protectedAsset.PropertyClass) &&
        Objects.equals(this.assetId, protectedAsset.assetId) &&
        Objects.equals(this.authorized, protectedAsset.authorized) &&
        Objects.equals(this.patient, protectedAsset.patient) &&
        Objects.equals(this.healthCareProvider, protectedAsset.healthCareProvider);
  }

  @Override
  public int hashCode() {
    return Objects.hash(PropertyClass, assetId, authorized, patient, healthCareProvider);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProtectedAsset {\n");
    
    sb.append("    PropertyClass: ").append(toIndentedString(PropertyClass)).append("\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    authorized: ").append(toIndentedString(authorized)).append("\n");
    sb.append("    patient: ").append(toIndentedString(patient)).append("\n");
    sb.append("    healthCareProvider: ").append(toIndentedString(healthCareProvider)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

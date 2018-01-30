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
import org.joda.time.DateTime;


/**
 * An asset named Xray
 */
@ApiModel(description = "An asset named Xray")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-30T11:08:37.226+07:00")
public class Xray   {
  @SerializedName("$class")
  private String PropertyClass = "com.depa.blockchain.assets.Xray";

  @SerializedName("xrayName")
  private String xrayName = null;

  @SerializedName("xrayResult")
  private String xrayResult = null;

  @SerializedName("xrayImage")
  private String xrayImage = null;

  @SerializedName("dateTimeService")
  private DateTime dateTimeService = null;

  @SerializedName("dateTimeUpdate")
  private DateTime dateTimeUpdate = null;

  @SerializedName("assetId")
  private String assetId = null;

  @SerializedName("patient")
  private String patient = null;

  @SerializedName("healthCareProvider")
  private String healthCareProvider = null;

  public Xray PropertyClass(String PropertyClass) {
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

  public Xray xrayName(String xrayName) {
    this.xrayName = xrayName;
    return this;
  }

   /**
   * Get xrayName
   * @return xrayName
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getXrayName() {
    return xrayName;
  }

  public void setXrayName(String xrayName) {
    this.xrayName = xrayName;
  }

  public Xray xrayResult(String xrayResult) {
    this.xrayResult = xrayResult;
    return this;
  }

   /**
   * Get xrayResult
   * @return xrayResult
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getXrayResult() {
    return xrayResult;
  }

  public void setXrayResult(String xrayResult) {
    this.xrayResult = xrayResult;
  }

  public Xray xrayImage(String xrayImage) {
    this.xrayImage = xrayImage;
    return this;
  }

   /**
   * Get xrayImage
   * @return xrayImage
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getXrayImage() {
    return xrayImage;
  }

  public void setXrayImage(String xrayImage) {
    this.xrayImage = xrayImage;
  }

  public Xray dateTimeService(DateTime dateTimeService) {
    this.dateTimeService = dateTimeService;
    return this;
  }

   /**
   * Get dateTimeService
   * @return dateTimeService
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public DateTime getDateTimeService() {
    return dateTimeService;
  }

  public void setDateTimeService(DateTime dateTimeService) {
    this.dateTimeService = dateTimeService;
  }

  public Xray dateTimeUpdate(DateTime dateTimeUpdate) {
    this.dateTimeUpdate = dateTimeUpdate;
    return this;
  }

   /**
   * Get dateTimeUpdate
   * @return dateTimeUpdate
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public DateTime getDateTimeUpdate() {
    return dateTimeUpdate;
  }

  public void setDateTimeUpdate(DateTime dateTimeUpdate) {
    this.dateTimeUpdate = dateTimeUpdate;
  }

  public Xray assetId(String assetId) {
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

  public Xray patient(String patient) {
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

  public Xray healthCareProvider(String healthCareProvider) {
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Xray xray = (Xray) o;
    return Objects.equals(this.PropertyClass, xray.PropertyClass) &&
        Objects.equals(this.xrayName, xray.xrayName) &&
        Objects.equals(this.xrayResult, xray.xrayResult) &&
        Objects.equals(this.xrayImage, xray.xrayImage) &&
        Objects.equals(this.dateTimeService, xray.dateTimeService) &&
        Objects.equals(this.dateTimeUpdate, xray.dateTimeUpdate) &&
        Objects.equals(this.assetId, xray.assetId) &&
        Objects.equals(this.patient, xray.patient) &&
        Objects.equals(this.healthCareProvider, xray.healthCareProvider);
  }

  @Override
  public int hashCode() {
    return Objects.hash(PropertyClass, xrayName, xrayResult, xrayImage, dateTimeService, dateTimeUpdate, assetId, patient, healthCareProvider);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Xray {\n");
    
    sb.append("    PropertyClass: ").append(toIndentedString(PropertyClass)).append("\n");
    sb.append("    xrayName: ").append(toIndentedString(xrayName)).append("\n");
    sb.append("    xrayResult: ").append(toIndentedString(xrayResult)).append("\n");
    sb.append("    xrayImage: ").append(toIndentedString(xrayImage)).append("\n");
    sb.append("    dateTimeService: ").append(toIndentedString(dateTimeService)).append("\n");
    sb.append("    dateTimeUpdate: ").append(toIndentedString(dateTimeUpdate)).append("\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    patient: ").append(toIndentedString(patient)).append("\n");
    sb.append("    healthCareProvider: ").append(toIndentedString(healthCareProvider)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


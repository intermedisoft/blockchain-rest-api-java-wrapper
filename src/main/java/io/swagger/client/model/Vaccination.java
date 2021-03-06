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
import org.joda.time.DateTime;


/**
 * An asset named Vaccination
 */
@ApiModel(description = "An asset named Vaccination")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-11T18:06:20.333+07:00")
public class Vaccination   {
  @SerializedName("$class")
  private String PropertyClass = "com.depa.blockchain.assets.Vaccination";

  @SerializedName("vaccineName")
  private String vaccineName = null;

  @SerializedName("vaccineType")
  private String vaccineType = null;

  @SerializedName("dateTimeServe")
  private DateTime dateTimeServe = null;

  @SerializedName("numberOfBooster")
  private String numberOfBooster = null;

  @SerializedName("assetId")
  private String assetId = null;

  @SerializedName("patient")
  private String patient = null;

  @SerializedName("healthCareProvider")
  private String healthCareProvider = null;

  public Vaccination PropertyClass(String PropertyClass) {
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

  public Vaccination vaccineName(String vaccineName) {
    this.vaccineName = vaccineName;
    return this;
  }

   /**
   * Get vaccineName
   * @return vaccineName
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getVaccineName() {
    return vaccineName;
  }

  public void setVaccineName(String vaccineName) {
    this.vaccineName = vaccineName;
  }

  public Vaccination vaccineType(String vaccineType) {
    this.vaccineType = vaccineType;
    return this;
  }

   /**
   * Get vaccineType
   * @return vaccineType
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getVaccineType() {
    return vaccineType;
  }

  public void setVaccineType(String vaccineType) {
    this.vaccineType = vaccineType;
  }

  public Vaccination dateTimeServe(DateTime dateTimeServe) {
    this.dateTimeServe = dateTimeServe;
    return this;
  }

   /**
   * Get dateTimeServe
   * @return dateTimeServe
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public DateTime getDateTimeServe() {
    return dateTimeServe;
  }

  public void setDateTimeServe(DateTime dateTimeServe) {
    this.dateTimeServe = dateTimeServe;
  }

  public Vaccination numberOfBooster(String numberOfBooster) {
    this.numberOfBooster = numberOfBooster;
    return this;
  }

   /**
   * Get numberOfBooster
   * @return numberOfBooster
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNumberOfBooster() {
    return numberOfBooster;
  }

  public void setNumberOfBooster(String numberOfBooster) {
    this.numberOfBooster = numberOfBooster;
  }

  public Vaccination assetId(String assetId) {
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

  public Vaccination patient(String patient) {
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

  public Vaccination healthCareProvider(String healthCareProvider) {
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
    Vaccination vaccination = (Vaccination) o;
    return Objects.equals(this.PropertyClass, vaccination.PropertyClass) &&
        Objects.equals(this.vaccineName, vaccination.vaccineName) &&
        Objects.equals(this.vaccineType, vaccination.vaccineType) &&
        Objects.equals(this.dateTimeServe, vaccination.dateTimeServe) &&
        Objects.equals(this.numberOfBooster, vaccination.numberOfBooster) &&
        Objects.equals(this.assetId, vaccination.assetId) &&
        Objects.equals(this.patient, vaccination.patient) &&
        Objects.equals(this.healthCareProvider, vaccination.healthCareProvider);
  }

  @Override
  public int hashCode() {
    return Objects.hash(PropertyClass, vaccineName, vaccineType, dateTimeServe, numberOfBooster, assetId, patient, healthCareProvider);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vaccination {\n");
    
    sb.append("    PropertyClass: ").append(toIndentedString(PropertyClass)).append("\n");
    sb.append("    vaccineName: ").append(toIndentedString(vaccineName)).append("\n");
    sb.append("    vaccineType: ").append(toIndentedString(vaccineType)).append("\n");
    sb.append("    dateTimeServe: ").append(toIndentedString(dateTimeServe)).append("\n");
    sb.append("    numberOfBooster: ").append(toIndentedString(numberOfBooster)).append("\n");
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


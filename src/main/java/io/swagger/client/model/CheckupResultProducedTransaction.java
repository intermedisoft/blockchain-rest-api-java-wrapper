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
import io.swagger.client.model.CheckupHistory;
import org.joda.time.DateTime;


/**
 * A transaction named CheckupResultProducedTransaction
 */
@ApiModel(description = "A transaction named CheckupResultProducedTransaction")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-01-31T11:52:43.847+07:00")
public class CheckupResultProducedTransaction   {
  @SerializedName("$class")
  private String PropertyClass = "com.depa.blockchain.core.CheckupResultProducedTransaction";

  @SerializedName("checkupHistory")
  private CheckupHistory checkupHistory = null;

  @SerializedName("transactionId")
  private String transactionId = null;

  @SerializedName("timestamp")
  private DateTime timestamp = null;

  public CheckupResultProducedTransaction PropertyClass(String PropertyClass) {
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

  public CheckupResultProducedTransaction checkupHistory(CheckupHistory checkupHistory) {
    this.checkupHistory = checkupHistory;
    return this;
  }

   /**
   * Get checkupHistory
   * @return checkupHistory
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public CheckupHistory getCheckupHistory() {
    return checkupHistory;
  }

  public void setCheckupHistory(CheckupHistory checkupHistory) {
    this.checkupHistory = checkupHistory;
  }

  public CheckupResultProducedTransaction transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * The instance identifier for this type
   * @return transactionId
  **/
  @ApiModelProperty(example = "null", value = "The instance identifier for this type")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public CheckupResultProducedTransaction timestamp(DateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(DateTime timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckupResultProducedTransaction checkupResultProducedTransaction = (CheckupResultProducedTransaction) o;
    return Objects.equals(this.PropertyClass, checkupResultProducedTransaction.PropertyClass) &&
        Objects.equals(this.checkupHistory, checkupResultProducedTransaction.checkupHistory) &&
        Objects.equals(this.transactionId, checkupResultProducedTransaction.transactionId) &&
        Objects.equals(this.timestamp, checkupResultProducedTransaction.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(PropertyClass, checkupHistory, transactionId, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckupResultProducedTransaction {\n");
    
    sb.append("    PropertyClass: ").append(toIndentedString(PropertyClass)).append("\n");
    sb.append("    checkupHistory: ").append(toIndentedString(checkupHistory)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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


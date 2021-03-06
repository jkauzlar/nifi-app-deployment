/*
 * NiFi Rest Api
 * The Rest Api provides programmatic access to command and control a NiFi instance in real time. Start and                                              stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * The version of the OpenAPI document: 1.5.0
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TransactionResultEntity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-19T16:10:34.866069300-08:00[America/Los_Angeles]")
public class TransactionResultEntity {
  public static final String SERIALIZED_NAME_FLOW_FILE_SENT = "flowFileSent";
  @SerializedName(SERIALIZED_NAME_FLOW_FILE_SENT)
  private Integer flowFileSent;

  public static final String SERIALIZED_NAME_RESPONSE_CODE = "responseCode";
  @SerializedName(SERIALIZED_NAME_RESPONSE_CODE)
  private Integer responseCode;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;


  public TransactionResultEntity flowFileSent(Integer flowFileSent) {
    
    this.flowFileSent = flowFileSent;
    return this;
  }

   /**
   * Get flowFileSent
   * @return flowFileSent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getFlowFileSent() {
    return flowFileSent;
  }


  public void setFlowFileSent(Integer flowFileSent) {
    this.flowFileSent = flowFileSent;
  }


  public TransactionResultEntity responseCode(Integer responseCode) {
    
    this.responseCode = responseCode;
    return this;
  }

   /**
   * Get responseCode
   * @return responseCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getResponseCode() {
    return responseCode;
  }


  public void setResponseCode(Integer responseCode) {
    this.responseCode = responseCode;
  }


  public TransactionResultEntity message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionResultEntity transactionResultEntity = (TransactionResultEntity) o;
    return Objects.equals(this.flowFileSent, transactionResultEntity.flowFileSent) &&
        Objects.equals(this.responseCode, transactionResultEntity.responseCode) &&
        Objects.equals(this.message, transactionResultEntity.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowFileSent, responseCode, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionResultEntity {\n");
    sb.append("    flowFileSent: ").append(toIndentedString(flowFileSent)).append("\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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


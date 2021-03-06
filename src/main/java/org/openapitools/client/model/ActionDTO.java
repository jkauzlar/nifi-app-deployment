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
 * ActionDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-19T16:10:34.866069300-08:00[America/Los_Angeles]")
public class ActionDTO {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_USER_IDENTITY = "userIdentity";
  @SerializedName(SERIALIZED_NAME_USER_IDENTITY)
  private String userIdentity;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private String timestamp;

  public static final String SERIALIZED_NAME_SOURCE_ID = "sourceId";
  @SerializedName(SERIALIZED_NAME_SOURCE_ID)
  private String sourceId;

  public static final String SERIALIZED_NAME_SOURCE_NAME = "sourceName";
  @SerializedName(SERIALIZED_NAME_SOURCE_NAME)
  private String sourceName;

  public static final String SERIALIZED_NAME_SOURCE_TYPE = "sourceType";
  @SerializedName(SERIALIZED_NAME_SOURCE_TYPE)
  private String sourceType;

  public static final String SERIALIZED_NAME_COMPONENT_DETAILS = "componentDetails";
  @SerializedName(SERIALIZED_NAME_COMPONENT_DETAILS)
  private Object componentDetails;

  public static final String SERIALIZED_NAME_OPERATION = "operation";
  @SerializedName(SERIALIZED_NAME_OPERATION)
  private String operation;

  public static final String SERIALIZED_NAME_ACTION_DETAILS = "actionDetails";
  @SerializedName(SERIALIZED_NAME_ACTION_DETAILS)
  private Object actionDetails;


  public ActionDTO id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * The action id.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The action id.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public ActionDTO userIdentity(String userIdentity) {
    
    this.userIdentity = userIdentity;
    return this;
  }

   /**
   * The identity of the user that performed the action.
   * @return userIdentity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The identity of the user that performed the action.")

  public String getUserIdentity() {
    return userIdentity;
  }


  public void setUserIdentity(String userIdentity) {
    this.userIdentity = userIdentity;
  }


  public ActionDTO timestamp(String timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The timestamp of the action.
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timestamp of the action.")

  public String getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  public ActionDTO sourceId(String sourceId) {
    
    this.sourceId = sourceId;
    return this;
  }

   /**
   * The id of the source component.
   * @return sourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the source component.")

  public String getSourceId() {
    return sourceId;
  }


  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }


  public ActionDTO sourceName(String sourceName) {
    
    this.sourceName = sourceName;
    return this;
  }

   /**
   * The name of the source component.
   * @return sourceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the source component.")

  public String getSourceName() {
    return sourceName;
  }


  public void setSourceName(String sourceName) {
    this.sourceName = sourceName;
  }


  public ActionDTO sourceType(String sourceType) {
    
    this.sourceType = sourceType;
    return this;
  }

   /**
   * The type of the source component.
   * @return sourceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of the source component.")

  public String getSourceType() {
    return sourceType;
  }


  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
  }


  public ActionDTO componentDetails(Object componentDetails) {
    
    this.componentDetails = componentDetails;
    return this;
  }

   /**
   * Get componentDetails
   * @return componentDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getComponentDetails() {
    return componentDetails;
  }


  public void setComponentDetails(Object componentDetails) {
    this.componentDetails = componentDetails;
  }


  public ActionDTO operation(String operation) {
    
    this.operation = operation;
    return this;
  }

   /**
   * The operation that was performed.
   * @return operation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The operation that was performed.")

  public String getOperation() {
    return operation;
  }


  public void setOperation(String operation) {
    this.operation = operation;
  }


  public ActionDTO actionDetails(Object actionDetails) {
    
    this.actionDetails = actionDetails;
    return this;
  }

   /**
   * Get actionDetails
   * @return actionDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getActionDetails() {
    return actionDetails;
  }


  public void setActionDetails(Object actionDetails) {
    this.actionDetails = actionDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionDTO actionDTO = (ActionDTO) o;
    return Objects.equals(this.id, actionDTO.id) &&
        Objects.equals(this.userIdentity, actionDTO.userIdentity) &&
        Objects.equals(this.timestamp, actionDTO.timestamp) &&
        Objects.equals(this.sourceId, actionDTO.sourceId) &&
        Objects.equals(this.sourceName, actionDTO.sourceName) &&
        Objects.equals(this.sourceType, actionDTO.sourceType) &&
        Objects.equals(this.componentDetails, actionDTO.componentDetails) &&
        Objects.equals(this.operation, actionDTO.operation) &&
        Objects.equals(this.actionDetails, actionDTO.actionDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userIdentity, timestamp, sourceId, sourceName, sourceType, componentDetails, operation, actionDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userIdentity: ").append(toIndentedString(userIdentity)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    sourceName: ").append(toIndentedString(sourceName)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    componentDetails: ").append(toIndentedString(componentDetails)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    actionDetails: ").append(toIndentedString(actionDetails)).append("\n");
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


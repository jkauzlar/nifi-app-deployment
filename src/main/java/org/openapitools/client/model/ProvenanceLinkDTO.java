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
 * ProvenanceLinkDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-19T16:10:34.866069300-08:00[America/Los_Angeles]")
public class ProvenanceLinkDTO {
  public static final String SERIALIZED_NAME_SOURCE_ID = "sourceId";
  @SerializedName(SERIALIZED_NAME_SOURCE_ID)
  private String sourceId;

  public static final String SERIALIZED_NAME_TARGET_ID = "targetId";
  @SerializedName(SERIALIZED_NAME_TARGET_ID)
  private String targetId;

  public static final String SERIALIZED_NAME_FLOW_FILE_UUID = "flowFileUuid";
  @SerializedName(SERIALIZED_NAME_FLOW_FILE_UUID)
  private String flowFileUuid;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private String timestamp;

  public static final String SERIALIZED_NAME_MILLIS = "millis";
  @SerializedName(SERIALIZED_NAME_MILLIS)
  private Long millis;


  public ProvenanceLinkDTO sourceId(String sourceId) {
    
    this.sourceId = sourceId;
    return this;
  }

   /**
   * The source node id of the link.
   * @return sourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The source node id of the link.")

  public String getSourceId() {
    return sourceId;
  }


  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }


  public ProvenanceLinkDTO targetId(String targetId) {
    
    this.targetId = targetId;
    return this;
  }

   /**
   * The target node id of the link.
   * @return targetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The target node id of the link.")

  public String getTargetId() {
    return targetId;
  }


  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }


  public ProvenanceLinkDTO flowFileUuid(String flowFileUuid) {
    
    this.flowFileUuid = flowFileUuid;
    return this;
  }

   /**
   * The flowfile uuid that traversed the link.
   * @return flowFileUuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The flowfile uuid that traversed the link.")

  public String getFlowFileUuid() {
    return flowFileUuid;
  }


  public void setFlowFileUuid(String flowFileUuid) {
    this.flowFileUuid = flowFileUuid;
  }


  public ProvenanceLinkDTO timestamp(String timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The timestamp of the link (based on the destination).
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timestamp of the link (based on the destination).")

  public String getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  public ProvenanceLinkDTO millis(Long millis) {
    
    this.millis = millis;
    return this;
  }

   /**
   * The timestamp of this link in milliseconds.
   * @return millis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timestamp of this link in milliseconds.")

  public Long getMillis() {
    return millis;
  }


  public void setMillis(Long millis) {
    this.millis = millis;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvenanceLinkDTO provenanceLinkDTO = (ProvenanceLinkDTO) o;
    return Objects.equals(this.sourceId, provenanceLinkDTO.sourceId) &&
        Objects.equals(this.targetId, provenanceLinkDTO.targetId) &&
        Objects.equals(this.flowFileUuid, provenanceLinkDTO.flowFileUuid) &&
        Objects.equals(this.timestamp, provenanceLinkDTO.timestamp) &&
        Objects.equals(this.millis, provenanceLinkDTO.millis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceId, targetId, flowFileUuid, timestamp, millis);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvenanceLinkDTO {\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    flowFileUuid: ").append(toIndentedString(flowFileUuid)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    millis: ").append(toIndentedString(millis)).append("\n");
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


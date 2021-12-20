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
 * VersionedFlowDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-19T16:10:34.866069300-08:00[America/Los_Angeles]")
public class VersionedFlowDTO {
  public static final String SERIALIZED_NAME_REGISTRY_ID = "registryId";
  @SerializedName(SERIALIZED_NAME_REGISTRY_ID)
  private String registryId;

  public static final String SERIALIZED_NAME_BUCKET_ID = "bucketId";
  @SerializedName(SERIALIZED_NAME_BUCKET_ID)
  private String bucketId;

  public static final String SERIALIZED_NAME_FLOW_ID = "flowId";
  @SerializedName(SERIALIZED_NAME_FLOW_ID)
  private String flowId;

  public static final String SERIALIZED_NAME_FLOW_NAME = "flowName";
  @SerializedName(SERIALIZED_NAME_FLOW_NAME)
  private String flowName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_COMMENTS = "comments";
  @SerializedName(SERIALIZED_NAME_COMMENTS)
  private String comments;


  public VersionedFlowDTO registryId(String registryId) {
    
    this.registryId = registryId;
    return this;
  }

   /**
   * The ID of the registry that the flow is tracked to
   * @return registryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the registry that the flow is tracked to")

  public String getRegistryId() {
    return registryId;
  }


  public void setRegistryId(String registryId) {
    this.registryId = registryId;
  }


  public VersionedFlowDTO bucketId(String bucketId) {
    
    this.bucketId = bucketId;
    return this;
  }

   /**
   * The ID of the bucket where the flow is stored
   * @return bucketId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the bucket where the flow is stored")

  public String getBucketId() {
    return bucketId;
  }


  public void setBucketId(String bucketId) {
    this.bucketId = bucketId;
  }


  public VersionedFlowDTO flowId(String flowId) {
    
    this.flowId = flowId;
    return this;
  }

   /**
   * The ID of the flow
   * @return flowId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the flow")

  public String getFlowId() {
    return flowId;
  }


  public void setFlowId(String flowId) {
    this.flowId = flowId;
  }


  public VersionedFlowDTO flowName(String flowName) {
    
    this.flowName = flowName;
    return this;
  }

   /**
   * The name of the flow
   * @return flowName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the flow")

  public String getFlowName() {
    return flowName;
  }


  public void setFlowName(String flowName) {
    this.flowName = flowName;
  }


  public VersionedFlowDTO description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A description of the flow
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A description of the flow")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public VersionedFlowDTO comments(String comments) {
    
    this.comments = comments;
    return this;
  }

   /**
   * Comments for the changeset
   * @return comments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Comments for the changeset")

  public String getComments() {
    return comments;
  }


  public void setComments(String comments) {
    this.comments = comments;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionedFlowDTO versionedFlowDTO = (VersionedFlowDTO) o;
    return Objects.equals(this.registryId, versionedFlowDTO.registryId) &&
        Objects.equals(this.bucketId, versionedFlowDTO.bucketId) &&
        Objects.equals(this.flowId, versionedFlowDTO.flowId) &&
        Objects.equals(this.flowName, versionedFlowDTO.flowName) &&
        Objects.equals(this.description, versionedFlowDTO.description) &&
        Objects.equals(this.comments, versionedFlowDTO.comments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registryId, bucketId, flowId, flowName, description, comments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionedFlowDTO {\n");
    sb.append("    registryId: ").append(toIndentedString(registryId)).append("\n");
    sb.append("    bucketId: ").append(toIndentedString(bucketId)).append("\n");
    sb.append("    flowId: ").append(toIndentedString(flowId)).append("\n");
    sb.append("    flowName: ").append(toIndentedString(flowName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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

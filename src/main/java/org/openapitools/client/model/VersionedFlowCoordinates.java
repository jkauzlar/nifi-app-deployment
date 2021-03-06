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
 * VersionedFlowCoordinates
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-19T16:10:34.866069300-08:00[America/Los_Angeles]")
public class VersionedFlowCoordinates {
  public static final String SERIALIZED_NAME_REGISTRY_URL = "registryUrl";
  @SerializedName(SERIALIZED_NAME_REGISTRY_URL)
  private String registryUrl;

  public static final String SERIALIZED_NAME_BUCKET_ID = "bucketId";
  @SerializedName(SERIALIZED_NAME_BUCKET_ID)
  private String bucketId;

  public static final String SERIALIZED_NAME_FLOW_ID = "flowId";
  @SerializedName(SERIALIZED_NAME_FLOW_ID)
  private String flowId;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_LATEST = "latest";
  @SerializedName(SERIALIZED_NAME_LATEST)
  private Boolean latest;


  public VersionedFlowCoordinates registryUrl(String registryUrl) {
    
    this.registryUrl = registryUrl;
    return this;
  }

   /**
   * The URL of the Flow Registry that contains the flow
   * @return registryUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the Flow Registry that contains the flow")

  public String getRegistryUrl() {
    return registryUrl;
  }


  public void setRegistryUrl(String registryUrl) {
    this.registryUrl = registryUrl;
  }


  public VersionedFlowCoordinates bucketId(String bucketId) {
    
    this.bucketId = bucketId;
    return this;
  }

   /**
   * The UUID of the bucket that the flow resides in
   * @return bucketId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The UUID of the bucket that the flow resides in")

  public String getBucketId() {
    return bucketId;
  }


  public void setBucketId(String bucketId) {
    this.bucketId = bucketId;
  }


  public VersionedFlowCoordinates flowId(String flowId) {
    
    this.flowId = flowId;
    return this;
  }

   /**
   * The UUID of the flow
   * @return flowId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The UUID of the flow")

  public String getFlowId() {
    return flowId;
  }


  public void setFlowId(String flowId) {
    this.flowId = flowId;
  }


  public VersionedFlowCoordinates version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * The version of the flow
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The version of the flow")

  public Integer getVersion() {
    return version;
  }


  public void setVersion(Integer version) {
    this.version = version;
  }


  public VersionedFlowCoordinates latest(Boolean latest) {
    
    this.latest = latest;
    return this;
  }

   /**
   * Whether or not these coordinates point to the latest version of the flow
   * @return latest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not these coordinates point to the latest version of the flow")

  public Boolean getLatest() {
    return latest;
  }


  public void setLatest(Boolean latest) {
    this.latest = latest;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionedFlowCoordinates versionedFlowCoordinates = (VersionedFlowCoordinates) o;
    return Objects.equals(this.registryUrl, versionedFlowCoordinates.registryUrl) &&
        Objects.equals(this.bucketId, versionedFlowCoordinates.bucketId) &&
        Objects.equals(this.flowId, versionedFlowCoordinates.flowId) &&
        Objects.equals(this.version, versionedFlowCoordinates.version) &&
        Objects.equals(this.latest, versionedFlowCoordinates.latest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(registryUrl, bucketId, flowId, version, latest);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionedFlowCoordinates {\n");
    sb.append("    registryUrl: ").append(toIndentedString(registryUrl)).append("\n");
    sb.append("    bucketId: ").append(toIndentedString(bucketId)).append("\n");
    sb.append("    flowId: ").append(toIndentedString(flowId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    latest: ").append(toIndentedString(latest)).append("\n");
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


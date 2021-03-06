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
import org.openapitools.client.model.Bucket;
import org.openapitools.client.model.VersionedFlow;
import org.openapitools.client.model.VersionedProcessGroup;

/**
 * VersionedFlowSnapshot
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-19T16:10:34.866069300-08:00[America/Los_Angeles]")
public class VersionedFlowSnapshot {
  public static final String SERIALIZED_NAME_SNAPSHOT_METADATA = "snapshotMetadata";
  @SerializedName(SERIALIZED_NAME_SNAPSHOT_METADATA)
  private VersionedFlowSnapshot snapshotMetadata;

  public static final String SERIALIZED_NAME_FLOW_CONTENTS = "flowContents";
  @SerializedName(SERIALIZED_NAME_FLOW_CONTENTS)
  private VersionedProcessGroup flowContents;

  public static final String SERIALIZED_NAME_FLOW = "flow";
  @SerializedName(SERIALIZED_NAME_FLOW)
  private VersionedFlow flow;

  public static final String SERIALIZED_NAME_BUCKET = "bucket";
  @SerializedName(SERIALIZED_NAME_BUCKET)
  private Bucket bucket;

  public static final String SERIALIZED_NAME_LATEST = "latest";
  @SerializedName(SERIALIZED_NAME_LATEST)
  private Boolean latest;


  public VersionedFlowSnapshot snapshotMetadata(VersionedFlowSnapshot snapshotMetadata) {
    
    this.snapshotMetadata = snapshotMetadata;
    return this;
  }

   /**
   * Get snapshotMetadata
   * @return snapshotMetadata
  **/
  @ApiModelProperty(required = true, value = "")

  public VersionedFlowSnapshot getSnapshotMetadata() {
    return snapshotMetadata;
  }


  public void setSnapshotMetadata(VersionedFlowSnapshot snapshotMetadata) {
    this.snapshotMetadata = snapshotMetadata;
  }


  public VersionedFlowSnapshot flowContents(VersionedProcessGroup flowContents) {
    
    this.flowContents = flowContents;
    return this;
  }

   /**
   * Get flowContents
   * @return flowContents
  **/
  @ApiModelProperty(required = true, value = "")

  public VersionedProcessGroup getFlowContents() {
    return flowContents;
  }


  public void setFlowContents(VersionedProcessGroup flowContents) {
    this.flowContents = flowContents;
  }


  public VersionedFlowSnapshot flow(VersionedFlow flow) {
    
    this.flow = flow;
    return this;
  }

   /**
   * Get flow
   * @return flow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VersionedFlow getFlow() {
    return flow;
  }


  public void setFlow(VersionedFlow flow) {
    this.flow = flow;
  }


  public VersionedFlowSnapshot bucket(Bucket bucket) {
    
    this.bucket = bucket;
    return this;
  }

   /**
   * Get bucket
   * @return bucket
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Bucket getBucket() {
    return bucket;
  }


  public void setBucket(Bucket bucket) {
    this.bucket = bucket;
  }


  public VersionedFlowSnapshot latest(Boolean latest) {
    
    this.latest = latest;
    return this;
  }

   /**
   * Get latest
   * @return latest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
    VersionedFlowSnapshot versionedFlowSnapshot = (VersionedFlowSnapshot) o;
    return Objects.equals(this.snapshotMetadata, versionedFlowSnapshot.snapshotMetadata) &&
        Objects.equals(this.flowContents, versionedFlowSnapshot.flowContents) &&
        Objects.equals(this.flow, versionedFlowSnapshot.flow) &&
        Objects.equals(this.bucket, versionedFlowSnapshot.bucket) &&
        Objects.equals(this.latest, versionedFlowSnapshot.latest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snapshotMetadata, flowContents, flow, bucket, latest);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionedFlowSnapshot {\n");
    sb.append("    snapshotMetadata: ").append(toIndentedString(snapshotMetadata)).append("\n");
    sb.append("    flowContents: ").append(toIndentedString(flowContents)).append("\n");
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
    sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
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


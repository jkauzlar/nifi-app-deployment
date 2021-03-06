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
 * ConnectionStatusSnapshotDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-19T16:10:34.866069300-08:00[America/Los_Angeles]")
public class ConnectionStatusSnapshotDTO {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_GROUP_ID = "groupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SOURCE_ID = "sourceId";
  @SerializedName(SERIALIZED_NAME_SOURCE_ID)
  private String sourceId;

  public static final String SERIALIZED_NAME_SOURCE_NAME = "sourceName";
  @SerializedName(SERIALIZED_NAME_SOURCE_NAME)
  private String sourceName;

  public static final String SERIALIZED_NAME_DESTINATION_ID = "destinationId";
  @SerializedName(SERIALIZED_NAME_DESTINATION_ID)
  private String destinationId;

  public static final String SERIALIZED_NAME_DESTINATION_NAME = "destinationName";
  @SerializedName(SERIALIZED_NAME_DESTINATION_NAME)
  private String destinationName;

  public static final String SERIALIZED_NAME_FLOW_FILES_IN = "flowFilesIn";
  @SerializedName(SERIALIZED_NAME_FLOW_FILES_IN)
  private Integer flowFilesIn;

  public static final String SERIALIZED_NAME_BYTES_IN = "bytesIn";
  @SerializedName(SERIALIZED_NAME_BYTES_IN)
  private Long bytesIn;

  public static final String SERIALIZED_NAME_INPUT = "input";
  @SerializedName(SERIALIZED_NAME_INPUT)
  private String input;

  public static final String SERIALIZED_NAME_FLOW_FILES_OUT = "flowFilesOut";
  @SerializedName(SERIALIZED_NAME_FLOW_FILES_OUT)
  private Integer flowFilesOut;

  public static final String SERIALIZED_NAME_BYTES_OUT = "bytesOut";
  @SerializedName(SERIALIZED_NAME_BYTES_OUT)
  private Long bytesOut;

  public static final String SERIALIZED_NAME_OUTPUT = "output";
  @SerializedName(SERIALIZED_NAME_OUTPUT)
  private String output;

  public static final String SERIALIZED_NAME_FLOW_FILES_QUEUED = "flowFilesQueued";
  @SerializedName(SERIALIZED_NAME_FLOW_FILES_QUEUED)
  private Integer flowFilesQueued;

  public static final String SERIALIZED_NAME_BYTES_QUEUED = "bytesQueued";
  @SerializedName(SERIALIZED_NAME_BYTES_QUEUED)
  private Long bytesQueued;

  public static final String SERIALIZED_NAME_QUEUED = "queued";
  @SerializedName(SERIALIZED_NAME_QUEUED)
  private String queued;

  public static final String SERIALIZED_NAME_QUEUED_SIZE = "queuedSize";
  @SerializedName(SERIALIZED_NAME_QUEUED_SIZE)
  private String queuedSize;

  public static final String SERIALIZED_NAME_QUEUED_COUNT = "queuedCount";
  @SerializedName(SERIALIZED_NAME_QUEUED_COUNT)
  private String queuedCount;

  public static final String SERIALIZED_NAME_PERCENT_USE_COUNT = "percentUseCount";
  @SerializedName(SERIALIZED_NAME_PERCENT_USE_COUNT)
  private Integer percentUseCount;

  public static final String SERIALIZED_NAME_PERCENT_USE_BYTES = "percentUseBytes";
  @SerializedName(SERIALIZED_NAME_PERCENT_USE_BYTES)
  private Integer percentUseBytes;


  public ConnectionStatusSnapshotDTO id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The id of the connection.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the connection.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ConnectionStatusSnapshotDTO groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * The id of the process group the connection belongs to.
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the process group the connection belongs to.")

  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public ConnectionStatusSnapshotDTO name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the connection.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the connection.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ConnectionStatusSnapshotDTO sourceId(String sourceId) {
    
    this.sourceId = sourceId;
    return this;
  }

   /**
   * The id of the source of the connection.
   * @return sourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the source of the connection.")

  public String getSourceId() {
    return sourceId;
  }


  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }


  public ConnectionStatusSnapshotDTO sourceName(String sourceName) {
    
    this.sourceName = sourceName;
    return this;
  }

   /**
   * The name of the source of the connection.
   * @return sourceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the source of the connection.")

  public String getSourceName() {
    return sourceName;
  }


  public void setSourceName(String sourceName) {
    this.sourceName = sourceName;
  }


  public ConnectionStatusSnapshotDTO destinationId(String destinationId) {
    
    this.destinationId = destinationId;
    return this;
  }

   /**
   * The id of the destination of the connection.
   * @return destinationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the destination of the connection.")

  public String getDestinationId() {
    return destinationId;
  }


  public void setDestinationId(String destinationId) {
    this.destinationId = destinationId;
  }


  public ConnectionStatusSnapshotDTO destinationName(String destinationName) {
    
    this.destinationName = destinationName;
    return this;
  }

   /**
   * The name of the destination of the connection.
   * @return destinationName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the destination of the connection.")

  public String getDestinationName() {
    return destinationName;
  }


  public void setDestinationName(String destinationName) {
    this.destinationName = destinationName;
  }


  public ConnectionStatusSnapshotDTO flowFilesIn(Integer flowFilesIn) {
    
    this.flowFilesIn = flowFilesIn;
    return this;
  }

   /**
   * The number of FlowFiles that have come into the connection in the last 5 minutes.
   * @return flowFilesIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of FlowFiles that have come into the connection in the last 5 minutes.")

  public Integer getFlowFilesIn() {
    return flowFilesIn;
  }


  public void setFlowFilesIn(Integer flowFilesIn) {
    this.flowFilesIn = flowFilesIn;
  }


  public ConnectionStatusSnapshotDTO bytesIn(Long bytesIn) {
    
    this.bytesIn = bytesIn;
    return this;
  }

   /**
   * The size of the FlowFiles that have come into the connection in the last 5 minutes.
   * @return bytesIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The size of the FlowFiles that have come into the connection in the last 5 minutes.")

  public Long getBytesIn() {
    return bytesIn;
  }


  public void setBytesIn(Long bytesIn) {
    this.bytesIn = bytesIn;
  }


  public ConnectionStatusSnapshotDTO input(String input) {
    
    this.input = input;
    return this;
  }

   /**
   * The input count/size for the connection in the last 5 minutes, pretty printed.
   * @return input
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The input count/size for the connection in the last 5 minutes, pretty printed.")

  public String getInput() {
    return input;
  }


  public void setInput(String input) {
    this.input = input;
  }


  public ConnectionStatusSnapshotDTO flowFilesOut(Integer flowFilesOut) {
    
    this.flowFilesOut = flowFilesOut;
    return this;
  }

   /**
   * The number of FlowFiles that have left the connection in the last 5 minutes.
   * @return flowFilesOut
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of FlowFiles that have left the connection in the last 5 minutes.")

  public Integer getFlowFilesOut() {
    return flowFilesOut;
  }


  public void setFlowFilesOut(Integer flowFilesOut) {
    this.flowFilesOut = flowFilesOut;
  }


  public ConnectionStatusSnapshotDTO bytesOut(Long bytesOut) {
    
    this.bytesOut = bytesOut;
    return this;
  }

   /**
   * The number of bytes that have left the connection in the last 5 minutes.
   * @return bytesOut
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of bytes that have left the connection in the last 5 minutes.")

  public Long getBytesOut() {
    return bytesOut;
  }


  public void setBytesOut(Long bytesOut) {
    this.bytesOut = bytesOut;
  }


  public ConnectionStatusSnapshotDTO output(String output) {
    
    this.output = output;
    return this;
  }

   /**
   * The output count/sie for the connection in the last 5 minutes, pretty printed.
   * @return output
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The output count/sie for the connection in the last 5 minutes, pretty printed.")

  public String getOutput() {
    return output;
  }


  public void setOutput(String output) {
    this.output = output;
  }


  public ConnectionStatusSnapshotDTO flowFilesQueued(Integer flowFilesQueued) {
    
    this.flowFilesQueued = flowFilesQueued;
    return this;
  }

   /**
   * The number of FlowFiles that are currently queued in the connection.
   * @return flowFilesQueued
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of FlowFiles that are currently queued in the connection.")

  public Integer getFlowFilesQueued() {
    return flowFilesQueued;
  }


  public void setFlowFilesQueued(Integer flowFilesQueued) {
    this.flowFilesQueued = flowFilesQueued;
  }


  public ConnectionStatusSnapshotDTO bytesQueued(Long bytesQueued) {
    
    this.bytesQueued = bytesQueued;
    return this;
  }

   /**
   * The size of the FlowFiles that are currently queued in the connection.
   * @return bytesQueued
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The size of the FlowFiles that are currently queued in the connection.")

  public Long getBytesQueued() {
    return bytesQueued;
  }


  public void setBytesQueued(Long bytesQueued) {
    this.bytesQueued = bytesQueued;
  }


  public ConnectionStatusSnapshotDTO queued(String queued) {
    
    this.queued = queued;
    return this;
  }

   /**
   * The total count and size of queued flowfiles formatted.
   * @return queued
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total count and size of queued flowfiles formatted.")

  public String getQueued() {
    return queued;
  }


  public void setQueued(String queued) {
    this.queued = queued;
  }


  public ConnectionStatusSnapshotDTO queuedSize(String queuedSize) {
    
    this.queuedSize = queuedSize;
    return this;
  }

   /**
   * The total size of flowfiles that are queued formatted.
   * @return queuedSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total size of flowfiles that are queued formatted.")

  public String getQueuedSize() {
    return queuedSize;
  }


  public void setQueuedSize(String queuedSize) {
    this.queuedSize = queuedSize;
  }


  public ConnectionStatusSnapshotDTO queuedCount(String queuedCount) {
    
    this.queuedCount = queuedCount;
    return this;
  }

   /**
   * The number of flowfiles that are queued, pretty printed.
   * @return queuedCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of flowfiles that are queued, pretty printed.")

  public String getQueuedCount() {
    return queuedCount;
  }


  public void setQueuedCount(String queuedCount) {
    this.queuedCount = queuedCount;
  }


  public ConnectionStatusSnapshotDTO percentUseCount(Integer percentUseCount) {
    
    this.percentUseCount = percentUseCount;
    return this;
  }

   /**
   * Connection percent use regarding queued flow files count and backpressure threshold if configured.
   * @return percentUseCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Connection percent use regarding queued flow files count and backpressure threshold if configured.")

  public Integer getPercentUseCount() {
    return percentUseCount;
  }


  public void setPercentUseCount(Integer percentUseCount) {
    this.percentUseCount = percentUseCount;
  }


  public ConnectionStatusSnapshotDTO percentUseBytes(Integer percentUseBytes) {
    
    this.percentUseBytes = percentUseBytes;
    return this;
  }

   /**
   * Connection percent use regarding queued flow files size and backpressure threshold if configured.
   * @return percentUseBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Connection percent use regarding queued flow files size and backpressure threshold if configured.")

  public Integer getPercentUseBytes() {
    return percentUseBytes;
  }


  public void setPercentUseBytes(Integer percentUseBytes) {
    this.percentUseBytes = percentUseBytes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionStatusSnapshotDTO connectionStatusSnapshotDTO = (ConnectionStatusSnapshotDTO) o;
    return Objects.equals(this.id, connectionStatusSnapshotDTO.id) &&
        Objects.equals(this.groupId, connectionStatusSnapshotDTO.groupId) &&
        Objects.equals(this.name, connectionStatusSnapshotDTO.name) &&
        Objects.equals(this.sourceId, connectionStatusSnapshotDTO.sourceId) &&
        Objects.equals(this.sourceName, connectionStatusSnapshotDTO.sourceName) &&
        Objects.equals(this.destinationId, connectionStatusSnapshotDTO.destinationId) &&
        Objects.equals(this.destinationName, connectionStatusSnapshotDTO.destinationName) &&
        Objects.equals(this.flowFilesIn, connectionStatusSnapshotDTO.flowFilesIn) &&
        Objects.equals(this.bytesIn, connectionStatusSnapshotDTO.bytesIn) &&
        Objects.equals(this.input, connectionStatusSnapshotDTO.input) &&
        Objects.equals(this.flowFilesOut, connectionStatusSnapshotDTO.flowFilesOut) &&
        Objects.equals(this.bytesOut, connectionStatusSnapshotDTO.bytesOut) &&
        Objects.equals(this.output, connectionStatusSnapshotDTO.output) &&
        Objects.equals(this.flowFilesQueued, connectionStatusSnapshotDTO.flowFilesQueued) &&
        Objects.equals(this.bytesQueued, connectionStatusSnapshotDTO.bytesQueued) &&
        Objects.equals(this.queued, connectionStatusSnapshotDTO.queued) &&
        Objects.equals(this.queuedSize, connectionStatusSnapshotDTO.queuedSize) &&
        Objects.equals(this.queuedCount, connectionStatusSnapshotDTO.queuedCount) &&
        Objects.equals(this.percentUseCount, connectionStatusSnapshotDTO.percentUseCount) &&
        Objects.equals(this.percentUseBytes, connectionStatusSnapshotDTO.percentUseBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, groupId, name, sourceId, sourceName, destinationId, destinationName, flowFilesIn, bytesIn, input, flowFilesOut, bytesOut, output, flowFilesQueued, bytesQueued, queued, queuedSize, queuedCount, percentUseCount, percentUseBytes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionStatusSnapshotDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    sourceName: ").append(toIndentedString(sourceName)).append("\n");
    sb.append("    destinationId: ").append(toIndentedString(destinationId)).append("\n");
    sb.append("    destinationName: ").append(toIndentedString(destinationName)).append("\n");
    sb.append("    flowFilesIn: ").append(toIndentedString(flowFilesIn)).append("\n");
    sb.append("    bytesIn: ").append(toIndentedString(bytesIn)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    flowFilesOut: ").append(toIndentedString(flowFilesOut)).append("\n");
    sb.append("    bytesOut: ").append(toIndentedString(bytesOut)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    flowFilesQueued: ").append(toIndentedString(flowFilesQueued)).append("\n");
    sb.append("    bytesQueued: ").append(toIndentedString(bytesQueued)).append("\n");
    sb.append("    queued: ").append(toIndentedString(queued)).append("\n");
    sb.append("    queuedSize: ").append(toIndentedString(queuedSize)).append("\n");
    sb.append("    queuedCount: ").append(toIndentedString(queuedCount)).append("\n");
    sb.append("    percentUseCount: ").append(toIndentedString(percentUseCount)).append("\n");
    sb.append("    percentUseBytes: ").append(toIndentedString(percentUseBytes)).append("\n");
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


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
 * PortStatusSnapshotDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-19T16:10:34.866069300-08:00[America/Los_Angeles]")
public class PortStatusSnapshotDTO {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_GROUP_ID = "groupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ACTIVE_THREAD_COUNT = "activeThreadCount";
  @SerializedName(SERIALIZED_NAME_ACTIVE_THREAD_COUNT)
  private Integer activeThreadCount;

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

  public static final String SERIALIZED_NAME_TRANSMITTING = "transmitting";
  @SerializedName(SERIALIZED_NAME_TRANSMITTING)
  private Boolean transmitting;

  public static final String SERIALIZED_NAME_RUN_STATUS = "runStatus";
  @SerializedName(SERIALIZED_NAME_RUN_STATUS)
  private String runStatus;


  public PortStatusSnapshotDTO id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The id of the port.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the port.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public PortStatusSnapshotDTO groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * The id of the parent process group of the port.
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the parent process group of the port.")

  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public PortStatusSnapshotDTO name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the port.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the port.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PortStatusSnapshotDTO activeThreadCount(Integer activeThreadCount) {
    
    this.activeThreadCount = activeThreadCount;
    return this;
  }

   /**
   * The active thread count for the port.
   * @return activeThreadCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The active thread count for the port.")

  public Integer getActiveThreadCount() {
    return activeThreadCount;
  }


  public void setActiveThreadCount(Integer activeThreadCount) {
    this.activeThreadCount = activeThreadCount;
  }


  public PortStatusSnapshotDTO flowFilesIn(Integer flowFilesIn) {
    
    this.flowFilesIn = flowFilesIn;
    return this;
  }

   /**
   * The number of FlowFiles that have been accepted in the last 5 minutes.
   * @return flowFilesIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of FlowFiles that have been accepted in the last 5 minutes.")

  public Integer getFlowFilesIn() {
    return flowFilesIn;
  }


  public void setFlowFilesIn(Integer flowFilesIn) {
    this.flowFilesIn = flowFilesIn;
  }


  public PortStatusSnapshotDTO bytesIn(Long bytesIn) {
    
    this.bytesIn = bytesIn;
    return this;
  }

   /**
   * The size of hte FlowFiles that have been accepted in the last 5 minutes.
   * @return bytesIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The size of hte FlowFiles that have been accepted in the last 5 minutes.")

  public Long getBytesIn() {
    return bytesIn;
  }


  public void setBytesIn(Long bytesIn) {
    this.bytesIn = bytesIn;
  }


  public PortStatusSnapshotDTO input(String input) {
    
    this.input = input;
    return this;
  }

   /**
   * The count/size of flowfiles that have been accepted in the last 5 minutes.
   * @return input
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The count/size of flowfiles that have been accepted in the last 5 minutes.")

  public String getInput() {
    return input;
  }


  public void setInput(String input) {
    this.input = input;
  }


  public PortStatusSnapshotDTO flowFilesOut(Integer flowFilesOut) {
    
    this.flowFilesOut = flowFilesOut;
    return this;
  }

   /**
   * The number of FlowFiles that have been processed in the last 5 minutes.
   * @return flowFilesOut
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of FlowFiles that have been processed in the last 5 minutes.")

  public Integer getFlowFilesOut() {
    return flowFilesOut;
  }


  public void setFlowFilesOut(Integer flowFilesOut) {
    this.flowFilesOut = flowFilesOut;
  }


  public PortStatusSnapshotDTO bytesOut(Long bytesOut) {
    
    this.bytesOut = bytesOut;
    return this;
  }

   /**
   * The number of bytes that have been processed in the last 5 minutes.
   * @return bytesOut
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of bytes that have been processed in the last 5 minutes.")

  public Long getBytesOut() {
    return bytesOut;
  }


  public void setBytesOut(Long bytesOut) {
    this.bytesOut = bytesOut;
  }


  public PortStatusSnapshotDTO output(String output) {
    
    this.output = output;
    return this;
  }

   /**
   * The count/size of flowfiles that have been processed in the last 5 minutes.
   * @return output
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The count/size of flowfiles that have been processed in the last 5 minutes.")

  public String getOutput() {
    return output;
  }


  public void setOutput(String output) {
    this.output = output;
  }


  public PortStatusSnapshotDTO transmitting(Boolean transmitting) {
    
    this.transmitting = transmitting;
    return this;
  }

   /**
   * Whether the port has incoming or outgoing connections to a remote NiFi.
   * @return transmitting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the port has incoming or outgoing connections to a remote NiFi.")

  public Boolean getTransmitting() {
    return transmitting;
  }


  public void setTransmitting(Boolean transmitting) {
    this.transmitting = transmitting;
  }


  public PortStatusSnapshotDTO runStatus(String runStatus) {
    
    this.runStatus = runStatus;
    return this;
  }

   /**
   * The run status of the port.
   * @return runStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The run status of the port.")

  public String getRunStatus() {
    return runStatus;
  }


  public void setRunStatus(String runStatus) {
    this.runStatus = runStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortStatusSnapshotDTO portStatusSnapshotDTO = (PortStatusSnapshotDTO) o;
    return Objects.equals(this.id, portStatusSnapshotDTO.id) &&
        Objects.equals(this.groupId, portStatusSnapshotDTO.groupId) &&
        Objects.equals(this.name, portStatusSnapshotDTO.name) &&
        Objects.equals(this.activeThreadCount, portStatusSnapshotDTO.activeThreadCount) &&
        Objects.equals(this.flowFilesIn, portStatusSnapshotDTO.flowFilesIn) &&
        Objects.equals(this.bytesIn, portStatusSnapshotDTO.bytesIn) &&
        Objects.equals(this.input, portStatusSnapshotDTO.input) &&
        Objects.equals(this.flowFilesOut, portStatusSnapshotDTO.flowFilesOut) &&
        Objects.equals(this.bytesOut, portStatusSnapshotDTO.bytesOut) &&
        Objects.equals(this.output, portStatusSnapshotDTO.output) &&
        Objects.equals(this.transmitting, portStatusSnapshotDTO.transmitting) &&
        Objects.equals(this.runStatus, portStatusSnapshotDTO.runStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, groupId, name, activeThreadCount, flowFilesIn, bytesIn, input, flowFilesOut, bytesOut, output, transmitting, runStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortStatusSnapshotDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    activeThreadCount: ").append(toIndentedString(activeThreadCount)).append("\n");
    sb.append("    flowFilesIn: ").append(toIndentedString(flowFilesIn)).append("\n");
    sb.append("    bytesIn: ").append(toIndentedString(bytesIn)).append("\n");
    sb.append("    input: ").append(toIndentedString(input)).append("\n");
    sb.append("    flowFilesOut: ").append(toIndentedString(flowFilesOut)).append("\n");
    sb.append("    bytesOut: ").append(toIndentedString(bytesOut)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    transmitting: ").append(toIndentedString(transmitting)).append("\n");
    sb.append("    runStatus: ").append(toIndentedString(runStatus)).append("\n");
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

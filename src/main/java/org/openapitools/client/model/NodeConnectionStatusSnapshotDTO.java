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
import org.openapitools.client.model.ConnectionStatusSnapshotDTO;

/**
 * NodeConnectionStatusSnapshotDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-19T16:10:34.866069300-08:00[America/Los_Angeles]")
public class NodeConnectionStatusSnapshotDTO {
  public static final String SERIALIZED_NAME_NODE_ID = "nodeId";
  @SerializedName(SERIALIZED_NAME_NODE_ID)
  private String nodeId;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_API_PORT = "apiPort";
  @SerializedName(SERIALIZED_NAME_API_PORT)
  private Integer apiPort;

  public static final String SERIALIZED_NAME_STATUS_SNAPSHOT = "statusSnapshot";
  @SerializedName(SERIALIZED_NAME_STATUS_SNAPSHOT)
  private ConnectionStatusSnapshotDTO statusSnapshot;


  public NodeConnectionStatusSnapshotDTO nodeId(String nodeId) {
    
    this.nodeId = nodeId;
    return this;
  }

   /**
   * The unique ID that identifies the node
   * @return nodeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique ID that identifies the node")

  public String getNodeId() {
    return nodeId;
  }


  public void setNodeId(String nodeId) {
    this.nodeId = nodeId;
  }


  public NodeConnectionStatusSnapshotDTO address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * The API address of the node
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The API address of the node")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public NodeConnectionStatusSnapshotDTO apiPort(Integer apiPort) {
    
    this.apiPort = apiPort;
    return this;
  }

   /**
   * The API port used to communicate with the node
   * @return apiPort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The API port used to communicate with the node")

  public Integer getApiPort() {
    return apiPort;
  }


  public void setApiPort(Integer apiPort) {
    this.apiPort = apiPort;
  }


  public NodeConnectionStatusSnapshotDTO statusSnapshot(ConnectionStatusSnapshotDTO statusSnapshot) {
    
    this.statusSnapshot = statusSnapshot;
    return this;
  }

   /**
   * Get statusSnapshot
   * @return statusSnapshot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConnectionStatusSnapshotDTO getStatusSnapshot() {
    return statusSnapshot;
  }


  public void setStatusSnapshot(ConnectionStatusSnapshotDTO statusSnapshot) {
    this.statusSnapshot = statusSnapshot;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeConnectionStatusSnapshotDTO nodeConnectionStatusSnapshotDTO = (NodeConnectionStatusSnapshotDTO) o;
    return Objects.equals(this.nodeId, nodeConnectionStatusSnapshotDTO.nodeId) &&
        Objects.equals(this.address, nodeConnectionStatusSnapshotDTO.address) &&
        Objects.equals(this.apiPort, nodeConnectionStatusSnapshotDTO.apiPort) &&
        Objects.equals(this.statusSnapshot, nodeConnectionStatusSnapshotDTO.statusSnapshot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeId, address, apiPort, statusSnapshot);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeConnectionStatusSnapshotDTO {\n");
    sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    apiPort: ").append(toIndentedString(apiPort)).append("\n");
    sb.append("    statusSnapshot: ").append(toIndentedString(statusSnapshot)).append("\n");
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


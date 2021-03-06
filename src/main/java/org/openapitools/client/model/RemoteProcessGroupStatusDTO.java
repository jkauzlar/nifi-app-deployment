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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.NodeRemoteProcessGroupStatusSnapshotDTO;
import org.openapitools.client.model.RemoteProcessGroupStatusSnapshotDTO;

/**
 * RemoteProcessGroupStatusDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-19T16:10:34.866069300-08:00[America/Los_Angeles]")
public class RemoteProcessGroupStatusDTO {
  public static final String SERIALIZED_NAME_GROUP_ID = "groupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TARGET_URI = "targetUri";
  @SerializedName(SERIALIZED_NAME_TARGET_URI)
  private String targetUri;

  public static final String SERIALIZED_NAME_TRANSMISSION_STATUS = "transmissionStatus";
  @SerializedName(SERIALIZED_NAME_TRANSMISSION_STATUS)
  private String transmissionStatus;

  public static final String SERIALIZED_NAME_STATS_LAST_REFRESHED = "statsLastRefreshed";
  @SerializedName(SERIALIZED_NAME_STATS_LAST_REFRESHED)
  private String statsLastRefreshed;

  public static final String SERIALIZED_NAME_AGGREGATE_SNAPSHOT = "aggregateSnapshot";
  @SerializedName(SERIALIZED_NAME_AGGREGATE_SNAPSHOT)
  private RemoteProcessGroupStatusSnapshotDTO aggregateSnapshot;

  public static final String SERIALIZED_NAME_NODE_SNAPSHOTS = "nodeSnapshots";
  @SerializedName(SERIALIZED_NAME_NODE_SNAPSHOTS)
  private List<NodeRemoteProcessGroupStatusSnapshotDTO> nodeSnapshots = null;


  public RemoteProcessGroupStatusDTO groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * The unique ID of the process group that the Processor belongs to
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique ID of the process group that the Processor belongs to")

  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public RemoteProcessGroupStatusDTO id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique ID of the Processor
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique ID of the Processor")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public RemoteProcessGroupStatusDTO name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the remote process group.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the remote process group.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public RemoteProcessGroupStatusDTO targetUri(String targetUri) {
    
    this.targetUri = targetUri;
    return this;
  }

   /**
   * The URI of the target system.
   * @return targetUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URI of the target system.")

  public String getTargetUri() {
    return targetUri;
  }


  public void setTargetUri(String targetUri) {
    this.targetUri = targetUri;
  }


  public RemoteProcessGroupStatusDTO transmissionStatus(String transmissionStatus) {
    
    this.transmissionStatus = transmissionStatus;
    return this;
  }

   /**
   * The transmission status of the remote process group.
   * @return transmissionStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The transmission status of the remote process group.")

  public String getTransmissionStatus() {
    return transmissionStatus;
  }


  public void setTransmissionStatus(String transmissionStatus) {
    this.transmissionStatus = transmissionStatus;
  }


  public RemoteProcessGroupStatusDTO statsLastRefreshed(String statsLastRefreshed) {
    
    this.statsLastRefreshed = statsLastRefreshed;
    return this;
  }

   /**
   * The time the status for the process group was last refreshed.
   * @return statsLastRefreshed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time the status for the process group was last refreshed.")

  public String getStatsLastRefreshed() {
    return statsLastRefreshed;
  }


  public void setStatsLastRefreshed(String statsLastRefreshed) {
    this.statsLastRefreshed = statsLastRefreshed;
  }


  public RemoteProcessGroupStatusDTO aggregateSnapshot(RemoteProcessGroupStatusSnapshotDTO aggregateSnapshot) {
    
    this.aggregateSnapshot = aggregateSnapshot;
    return this;
  }

   /**
   * Get aggregateSnapshot
   * @return aggregateSnapshot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RemoteProcessGroupStatusSnapshotDTO getAggregateSnapshot() {
    return aggregateSnapshot;
  }


  public void setAggregateSnapshot(RemoteProcessGroupStatusSnapshotDTO aggregateSnapshot) {
    this.aggregateSnapshot = aggregateSnapshot;
  }


  public RemoteProcessGroupStatusDTO nodeSnapshots(List<NodeRemoteProcessGroupStatusSnapshotDTO> nodeSnapshots) {
    
    this.nodeSnapshots = nodeSnapshots;
    return this;
  }

  public RemoteProcessGroupStatusDTO addNodeSnapshotsItem(NodeRemoteProcessGroupStatusSnapshotDTO nodeSnapshotsItem) {
    if (this.nodeSnapshots == null) {
      this.nodeSnapshots = new ArrayList<NodeRemoteProcessGroupStatusSnapshotDTO>();
    }
    this.nodeSnapshots.add(nodeSnapshotsItem);
    return this;
  }

   /**
   * A status snapshot for each node in the cluster. If the NiFi instance is a standalone instance, rather than a cluster, this may be null.
   * @return nodeSnapshots
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A status snapshot for each node in the cluster. If the NiFi instance is a standalone instance, rather than a cluster, this may be null.")

  public List<NodeRemoteProcessGroupStatusSnapshotDTO> getNodeSnapshots() {
    return nodeSnapshots;
  }


  public void setNodeSnapshots(List<NodeRemoteProcessGroupStatusSnapshotDTO> nodeSnapshots) {
    this.nodeSnapshots = nodeSnapshots;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteProcessGroupStatusDTO remoteProcessGroupStatusDTO = (RemoteProcessGroupStatusDTO) o;
    return Objects.equals(this.groupId, remoteProcessGroupStatusDTO.groupId) &&
        Objects.equals(this.id, remoteProcessGroupStatusDTO.id) &&
        Objects.equals(this.name, remoteProcessGroupStatusDTO.name) &&
        Objects.equals(this.targetUri, remoteProcessGroupStatusDTO.targetUri) &&
        Objects.equals(this.transmissionStatus, remoteProcessGroupStatusDTO.transmissionStatus) &&
        Objects.equals(this.statsLastRefreshed, remoteProcessGroupStatusDTO.statsLastRefreshed) &&
        Objects.equals(this.aggregateSnapshot, remoteProcessGroupStatusDTO.aggregateSnapshot) &&
        Objects.equals(this.nodeSnapshots, remoteProcessGroupStatusDTO.nodeSnapshots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, id, name, targetUri, transmissionStatus, statsLastRefreshed, aggregateSnapshot, nodeSnapshots);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteProcessGroupStatusDTO {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    targetUri: ").append(toIndentedString(targetUri)).append("\n");
    sb.append("    transmissionStatus: ").append(toIndentedString(transmissionStatus)).append("\n");
    sb.append("    statsLastRefreshed: ").append(toIndentedString(statsLastRefreshed)).append("\n");
    sb.append("    aggregateSnapshot: ").append(toIndentedString(aggregateSnapshot)).append("\n");
    sb.append("    nodeSnapshots: ").append(toIndentedString(nodeSnapshots)).append("\n");
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


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
import org.openapitools.client.model.BulletinDTO;

/**
 * BulletinEntity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-19T16:10:34.866069300-08:00[America/Los_Angeles]")
public class BulletinEntity {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_GROUP_ID = "groupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_SOURCE_ID = "sourceId";
  @SerializedName(SERIALIZED_NAME_SOURCE_ID)
  private String sourceId;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private String timestamp;

  public static final String SERIALIZED_NAME_NODE_ADDRESS = "nodeAddress";
  @SerializedName(SERIALIZED_NAME_NODE_ADDRESS)
  private String nodeAddress;

  public static final String SERIALIZED_NAME_CAN_READ = "canRead";
  @SerializedName(SERIALIZED_NAME_CAN_READ)
  private Boolean canRead;

  public static final String SERIALIZED_NAME_BULLETIN = "bulletin";
  @SerializedName(SERIALIZED_NAME_BULLETIN)
  private BulletinDTO bulletin;


  public BulletinEntity id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public BulletinEntity groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * Get groupId
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public BulletinEntity sourceId(String sourceId) {
    
    this.sourceId = sourceId;
    return this;
  }

   /**
   * Get sourceId
   * @return sourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSourceId() {
    return sourceId;
  }


  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }


  public BulletinEntity timestamp(String timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * When this bulletin was generated.
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When this bulletin was generated.")

  public String getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }


  public BulletinEntity nodeAddress(String nodeAddress) {
    
    this.nodeAddress = nodeAddress;
    return this;
  }

   /**
   * Get nodeAddress
   * @return nodeAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNodeAddress() {
    return nodeAddress;
  }


  public void setNodeAddress(String nodeAddress) {
    this.nodeAddress = nodeAddress;
  }


   /**
   * Indicates whether the user can read a given resource.
   * @return canRead
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the user can read a given resource.")

  public Boolean getCanRead() {
    return canRead;
  }




  public BulletinEntity bulletin(BulletinDTO bulletin) {
    
    this.bulletin = bulletin;
    return this;
  }

   /**
   * Get bulletin
   * @return bulletin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BulletinDTO getBulletin() {
    return bulletin;
  }


  public void setBulletin(BulletinDTO bulletin) {
    this.bulletin = bulletin;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulletinEntity bulletinEntity = (BulletinEntity) o;
    return Objects.equals(this.id, bulletinEntity.id) &&
        Objects.equals(this.groupId, bulletinEntity.groupId) &&
        Objects.equals(this.sourceId, bulletinEntity.sourceId) &&
        Objects.equals(this.timestamp, bulletinEntity.timestamp) &&
        Objects.equals(this.nodeAddress, bulletinEntity.nodeAddress) &&
        Objects.equals(this.canRead, bulletinEntity.canRead) &&
        Objects.equals(this.bulletin, bulletinEntity.bulletin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, groupId, sourceId, timestamp, nodeAddress, canRead, bulletin);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulletinEntity {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    nodeAddress: ").append(toIndentedString(nodeAddress)).append("\n");
    sb.append("    canRead: ").append(toIndentedString(canRead)).append("\n");
    sb.append("    bulletin: ").append(toIndentedString(bulletin)).append("\n");
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

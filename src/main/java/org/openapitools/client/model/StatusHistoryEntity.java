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
import org.openapitools.client.model.StatusHistoryDTO;

/**
 * StatusHistoryEntity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-19T16:10:34.866069300-08:00[America/Los_Angeles]")
public class StatusHistoryEntity {
  public static final String SERIALIZED_NAME_STATUS_HISTORY = "statusHistory";
  @SerializedName(SERIALIZED_NAME_STATUS_HISTORY)
  private StatusHistoryDTO statusHistory;

  public static final String SERIALIZED_NAME_CAN_READ = "canRead";
  @SerializedName(SERIALIZED_NAME_CAN_READ)
  private Boolean canRead;


  public StatusHistoryEntity statusHistory(StatusHistoryDTO statusHistory) {
    
    this.statusHistory = statusHistory;
    return this;
  }

   /**
   * Get statusHistory
   * @return statusHistory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StatusHistoryDTO getStatusHistory() {
    return statusHistory;
  }


  public void setStatusHistory(StatusHistoryDTO statusHistory) {
    this.statusHistory = statusHistory;
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




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusHistoryEntity statusHistoryEntity = (StatusHistoryEntity) o;
    return Objects.equals(this.statusHistory, statusHistoryEntity.statusHistory) &&
        Objects.equals(this.canRead, statusHistoryEntity.canRead);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusHistory, canRead);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusHistoryEntity {\n");
    sb.append("    statusHistory: ").append(toIndentedString(statusHistory)).append("\n");
    sb.append("    canRead: ").append(toIndentedString(canRead)).append("\n");
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


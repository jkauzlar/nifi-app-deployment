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
import org.openapitools.client.model.ClusterSummaryDTO;

/**
 * ClusteSummaryEntity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-19T16:10:34.866069300-08:00[America/Los_Angeles]")
public class ClusteSummaryEntity {
  public static final String SERIALIZED_NAME_CLUSTER_SUMMARY = "clusterSummary";
  @SerializedName(SERIALIZED_NAME_CLUSTER_SUMMARY)
  private ClusterSummaryDTO clusterSummary;


  public ClusteSummaryEntity clusterSummary(ClusterSummaryDTO clusterSummary) {
    
    this.clusterSummary = clusterSummary;
    return this;
  }

   /**
   * Get clusterSummary
   * @return clusterSummary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClusterSummaryDTO getClusterSummary() {
    return clusterSummary;
  }


  public void setClusterSummary(ClusterSummaryDTO clusterSummary) {
    this.clusterSummary = clusterSummary;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusteSummaryEntity clusteSummaryEntity = (ClusteSummaryEntity) o;
    return Objects.equals(this.clusterSummary, clusteSummaryEntity.clusterSummary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterSummary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusteSummaryEntity {\n");
    sb.append("    clusterSummary: ").append(toIndentedString(clusterSummary)).append("\n");
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


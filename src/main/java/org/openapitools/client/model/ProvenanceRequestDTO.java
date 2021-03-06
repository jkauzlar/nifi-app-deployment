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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ProvenanceRequestDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-19T16:10:34.866069300-08:00[America/Los_Angeles]")
public class ProvenanceRequestDTO {
  public static final String SERIALIZED_NAME_SEARCH_TERMS = "searchTerms";
  @SerializedName(SERIALIZED_NAME_SEARCH_TERMS)
  private Map<String, String> searchTerms = null;

  public static final String SERIALIZED_NAME_CLUSTER_NODE_ID = "clusterNodeId";
  @SerializedName(SERIALIZED_NAME_CLUSTER_NODE_ID)
  private String clusterNodeId;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public static final String SERIALIZED_NAME_MINIMUM_FILE_SIZE = "minimumFileSize";
  @SerializedName(SERIALIZED_NAME_MINIMUM_FILE_SIZE)
  private String minimumFileSize;

  public static final String SERIALIZED_NAME_MAXIMUM_FILE_SIZE = "maximumFileSize";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_FILE_SIZE)
  private String maximumFileSize;

  public static final String SERIALIZED_NAME_MAX_RESULTS = "maxResults";
  @SerializedName(SERIALIZED_NAME_MAX_RESULTS)
  private Integer maxResults;

  public static final String SERIALIZED_NAME_SUMMARIZE = "summarize";
  @SerializedName(SERIALIZED_NAME_SUMMARIZE)
  private Boolean summarize;

  public static final String SERIALIZED_NAME_INCREMENTAL_RESULTS = "incrementalResults";
  @SerializedName(SERIALIZED_NAME_INCREMENTAL_RESULTS)
  private Boolean incrementalResults;


  public ProvenanceRequestDTO searchTerms(Map<String, String> searchTerms) {
    
    this.searchTerms = searchTerms;
    return this;
  }

  public ProvenanceRequestDTO putSearchTermsItem(String key, String searchTermsItem) {
    if (this.searchTerms == null) {
      this.searchTerms = new HashMap<String, String>();
    }
    this.searchTerms.put(key, searchTermsItem);
    return this;
  }

   /**
   * The search terms used to perform the search.
   * @return searchTerms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The search terms used to perform the search.")

  public Map<String, String> getSearchTerms() {
    return searchTerms;
  }


  public void setSearchTerms(Map<String, String> searchTerms) {
    this.searchTerms = searchTerms;
  }


  public ProvenanceRequestDTO clusterNodeId(String clusterNodeId) {
    
    this.clusterNodeId = clusterNodeId;
    return this;
  }

   /**
   * The id of the node in the cluster where this provenance originated.
   * @return clusterNodeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the node in the cluster where this provenance originated.")

  public String getClusterNodeId() {
    return clusterNodeId;
  }


  public void setClusterNodeId(String clusterNodeId) {
    this.clusterNodeId = clusterNodeId;
  }


  public ProvenanceRequestDTO startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The earliest event time to include in the query.
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The earliest event time to include in the query.")

  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public ProvenanceRequestDTO endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The latest event time to include in the query.
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The latest event time to include in the query.")

  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public ProvenanceRequestDTO minimumFileSize(String minimumFileSize) {
    
    this.minimumFileSize = minimumFileSize;
    return this;
  }

   /**
   * The minimum file size to include in the query.
   * @return minimumFileSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The minimum file size to include in the query.")

  public String getMinimumFileSize() {
    return minimumFileSize;
  }


  public void setMinimumFileSize(String minimumFileSize) {
    this.minimumFileSize = minimumFileSize;
  }


  public ProvenanceRequestDTO maximumFileSize(String maximumFileSize) {
    
    this.maximumFileSize = maximumFileSize;
    return this;
  }

   /**
   * The maximum file size to include in the query.
   * @return maximumFileSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum file size to include in the query.")

  public String getMaximumFileSize() {
    return maximumFileSize;
  }


  public void setMaximumFileSize(String maximumFileSize) {
    this.maximumFileSize = maximumFileSize;
  }


  public ProvenanceRequestDTO maxResults(Integer maxResults) {
    
    this.maxResults = maxResults;
    return this;
  }

   /**
   * The maximum number of results to include.
   * @return maxResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum number of results to include.")

  public Integer getMaxResults() {
    return maxResults;
  }


  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }


  public ProvenanceRequestDTO summarize(Boolean summarize) {
    
    this.summarize = summarize;
    return this;
  }

   /**
   * Whether or not to summarize provenance events returned. This property is false by default.
   * @return summarize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not to summarize provenance events returned. This property is false by default.")

  public Boolean getSummarize() {
    return summarize;
  }


  public void setSummarize(Boolean summarize) {
    this.summarize = summarize;
  }


  public ProvenanceRequestDTO incrementalResults(Boolean incrementalResults) {
    
    this.incrementalResults = incrementalResults;
    return this;
  }

   /**
   * Whether or not incremental results are returned. If false, provenance events are only returned once the query completes. This property is true by default.
   * @return incrementalResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not incremental results are returned. If false, provenance events are only returned once the query completes. This property is true by default.")

  public Boolean getIncrementalResults() {
    return incrementalResults;
  }


  public void setIncrementalResults(Boolean incrementalResults) {
    this.incrementalResults = incrementalResults;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvenanceRequestDTO provenanceRequestDTO = (ProvenanceRequestDTO) o;
    return Objects.equals(this.searchTerms, provenanceRequestDTO.searchTerms) &&
        Objects.equals(this.clusterNodeId, provenanceRequestDTO.clusterNodeId) &&
        Objects.equals(this.startDate, provenanceRequestDTO.startDate) &&
        Objects.equals(this.endDate, provenanceRequestDTO.endDate) &&
        Objects.equals(this.minimumFileSize, provenanceRequestDTO.minimumFileSize) &&
        Objects.equals(this.maximumFileSize, provenanceRequestDTO.maximumFileSize) &&
        Objects.equals(this.maxResults, provenanceRequestDTO.maxResults) &&
        Objects.equals(this.summarize, provenanceRequestDTO.summarize) &&
        Objects.equals(this.incrementalResults, provenanceRequestDTO.incrementalResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchTerms, clusterNodeId, startDate, endDate, minimumFileSize, maximumFileSize, maxResults, summarize, incrementalResults);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvenanceRequestDTO {\n");
    sb.append("    searchTerms: ").append(toIndentedString(searchTerms)).append("\n");
    sb.append("    clusterNodeId: ").append(toIndentedString(clusterNodeId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    minimumFileSize: ").append(toIndentedString(minimumFileSize)).append("\n");
    sb.append("    maximumFileSize: ").append(toIndentedString(maximumFileSize)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    summarize: ").append(toIndentedString(summarize)).append("\n");
    sb.append("    incrementalResults: ").append(toIndentedString(incrementalResults)).append("\n");
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


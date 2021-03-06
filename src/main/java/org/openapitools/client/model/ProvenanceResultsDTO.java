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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openapitools.client.model.ProvenanceEventDTO;

/**
 * ProvenanceResultsDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-19T16:10:34.866069300-08:00[America/Los_Angeles]")
public class ProvenanceResultsDTO {
  public static final String SERIALIZED_NAME_PROVENANCE_EVENTS = "provenanceEvents";
  @SerializedName(SERIALIZED_NAME_PROVENANCE_EVENTS)
  private List<ProvenanceEventDTO> provenanceEvents = null;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private String total;

  public static final String SERIALIZED_NAME_TOTAL_COUNT = "totalCount";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Long totalCount;

  public static final String SERIALIZED_NAME_GENERATED = "generated";
  @SerializedName(SERIALIZED_NAME_GENERATED)
  private String generated;

  public static final String SERIALIZED_NAME_OLDEST_EVENT = "oldestEvent";
  @SerializedName(SERIALIZED_NAME_OLDEST_EVENT)
  private String oldestEvent;

  public static final String SERIALIZED_NAME_TIME_OFFSET = "timeOffset";
  @SerializedName(SERIALIZED_NAME_TIME_OFFSET)
  private Integer timeOffset;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private Set<String> errors = null;


  public ProvenanceResultsDTO provenanceEvents(List<ProvenanceEventDTO> provenanceEvents) {
    
    this.provenanceEvents = provenanceEvents;
    return this;
  }

  public ProvenanceResultsDTO addProvenanceEventsItem(ProvenanceEventDTO provenanceEventsItem) {
    if (this.provenanceEvents == null) {
      this.provenanceEvents = new ArrayList<ProvenanceEventDTO>();
    }
    this.provenanceEvents.add(provenanceEventsItem);
    return this;
  }

   /**
   * The provenance events that matched the search criteria.
   * @return provenanceEvents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The provenance events that matched the search criteria.")

  public List<ProvenanceEventDTO> getProvenanceEvents() {
    return provenanceEvents;
  }


  public void setProvenanceEvents(List<ProvenanceEventDTO> provenanceEvents) {
    this.provenanceEvents = provenanceEvents;
  }


  public ProvenanceResultsDTO total(String total) {
    
    this.total = total;
    return this;
  }

   /**
   * The total number of results formatted.
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total number of results formatted.")

  public String getTotal() {
    return total;
  }


  public void setTotal(String total) {
    this.total = total;
  }


  public ProvenanceResultsDTO totalCount(Long totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * The total number of results.
   * @return totalCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total number of results.")

  public Long getTotalCount() {
    return totalCount;
  }


  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }


  public ProvenanceResultsDTO generated(String generated) {
    
    this.generated = generated;
    return this;
  }

   /**
   * Then the search was performed.
   * @return generated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Then the search was performed.")

  public String getGenerated() {
    return generated;
  }


  public void setGenerated(String generated) {
    this.generated = generated;
  }


  public ProvenanceResultsDTO oldestEvent(String oldestEvent) {
    
    this.oldestEvent = oldestEvent;
    return this;
  }

   /**
   * The oldest event available in the provenance repository.
   * @return oldestEvent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The oldest event available in the provenance repository.")

  public String getOldestEvent() {
    return oldestEvent;
  }


  public void setOldestEvent(String oldestEvent) {
    this.oldestEvent = oldestEvent;
  }


  public ProvenanceResultsDTO timeOffset(Integer timeOffset) {
    
    this.timeOffset = timeOffset;
    return this;
  }

   /**
   * The time offset of the server that&#39;s used for event time.
   * @return timeOffset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time offset of the server that's used for event time.")

  public Integer getTimeOffset() {
    return timeOffset;
  }


  public void setTimeOffset(Integer timeOffset) {
    this.timeOffset = timeOffset;
  }


  public ProvenanceResultsDTO errors(Set<String> errors) {
    
    this.errors = errors;
    return this;
  }

  public ProvenanceResultsDTO addErrorsItem(String errorsItem) {
    if (this.errors == null) {
      this.errors = new LinkedHashSet<String>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Any errors that occurred while performing the provenance request.
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Any errors that occurred while performing the provenance request.")

  public Set<String> getErrors() {
    return errors;
  }


  public void setErrors(Set<String> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvenanceResultsDTO provenanceResultsDTO = (ProvenanceResultsDTO) o;
    return Objects.equals(this.provenanceEvents, provenanceResultsDTO.provenanceEvents) &&
        Objects.equals(this.total, provenanceResultsDTO.total) &&
        Objects.equals(this.totalCount, provenanceResultsDTO.totalCount) &&
        Objects.equals(this.generated, provenanceResultsDTO.generated) &&
        Objects.equals(this.oldestEvent, provenanceResultsDTO.oldestEvent) &&
        Objects.equals(this.timeOffset, provenanceResultsDTO.timeOffset) &&
        Objects.equals(this.errors, provenanceResultsDTO.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(provenanceEvents, total, totalCount, generated, oldestEvent, timeOffset, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvenanceResultsDTO {\n");
    sb.append("    provenanceEvents: ").append(toIndentedString(provenanceEvents)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    generated: ").append(toIndentedString(generated)).append("\n");
    sb.append("    oldestEvent: ").append(toIndentedString(oldestEvent)).append("\n");
    sb.append("    timeOffset: ").append(toIndentedString(timeOffset)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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


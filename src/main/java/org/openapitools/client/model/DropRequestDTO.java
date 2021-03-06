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
 * DropRequestDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-19T16:10:34.866069300-08:00[America/Los_Angeles]")
public class DropRequestDTO {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public static final String SERIALIZED_NAME_SUBMISSION_TIME = "submissionTime";
  @SerializedName(SERIALIZED_NAME_SUBMISSION_TIME)
  private String submissionTime;

  public static final String SERIALIZED_NAME_LAST_UPDATED = "lastUpdated";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED)
  private String lastUpdated;

  public static final String SERIALIZED_NAME_PERCENT_COMPLETED = "percentCompleted";
  @SerializedName(SERIALIZED_NAME_PERCENT_COMPLETED)
  private Integer percentCompleted;

  public static final String SERIALIZED_NAME_FINISHED = "finished";
  @SerializedName(SERIALIZED_NAME_FINISHED)
  private Boolean finished;

  public static final String SERIALIZED_NAME_FAILURE_REASON = "failureReason";
  @SerializedName(SERIALIZED_NAME_FAILURE_REASON)
  private String failureReason;

  public static final String SERIALIZED_NAME_CURRENT_COUNT = "currentCount";
  @SerializedName(SERIALIZED_NAME_CURRENT_COUNT)
  private Integer currentCount;

  public static final String SERIALIZED_NAME_CURRENT_SIZE = "currentSize";
  @SerializedName(SERIALIZED_NAME_CURRENT_SIZE)
  private Long currentSize;

  public static final String SERIALIZED_NAME_CURRENT = "current";
  @SerializedName(SERIALIZED_NAME_CURRENT)
  private String current;

  public static final String SERIALIZED_NAME_ORIGINAL_COUNT = "originalCount";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_COUNT)
  private Integer originalCount;

  public static final String SERIALIZED_NAME_ORIGINAL_SIZE = "originalSize";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_SIZE)
  private Long originalSize;

  public static final String SERIALIZED_NAME_ORIGINAL = "original";
  @SerializedName(SERIALIZED_NAME_ORIGINAL)
  private String original;

  public static final String SERIALIZED_NAME_DROPPED_COUNT = "droppedCount";
  @SerializedName(SERIALIZED_NAME_DROPPED_COUNT)
  private Integer droppedCount;

  public static final String SERIALIZED_NAME_DROPPED_SIZE = "droppedSize";
  @SerializedName(SERIALIZED_NAME_DROPPED_SIZE)
  private Long droppedSize;

  public static final String SERIALIZED_NAME_DROPPED = "dropped";
  @SerializedName(SERIALIZED_NAME_DROPPED)
  private String dropped;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;


  public DropRequestDTO id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The id for this drop request.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id for this drop request.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public DropRequestDTO uri(String uri) {
    
    this.uri = uri;
    return this;
  }

   /**
   * The URI for future requests to this drop request.
   * @return uri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URI for future requests to this drop request.")

  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    this.uri = uri;
  }


  public DropRequestDTO submissionTime(String submissionTime) {
    
    this.submissionTime = submissionTime;
    return this;
  }

   /**
   * The timestamp when the query was submitted.
   * @return submissionTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timestamp when the query was submitted.")

  public String getSubmissionTime() {
    return submissionTime;
  }


  public void setSubmissionTime(String submissionTime) {
    this.submissionTime = submissionTime;
  }


  public DropRequestDTO lastUpdated(String lastUpdated) {
    
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * The last time this drop request was updated.
   * @return lastUpdated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The last time this drop request was updated.")

  public String getLastUpdated() {
    return lastUpdated;
  }


  public void setLastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
  }


  public DropRequestDTO percentCompleted(Integer percentCompleted) {
    
    this.percentCompleted = percentCompleted;
    return this;
  }

   /**
   * The current percent complete.
   * @return percentCompleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The current percent complete.")

  public Integer getPercentCompleted() {
    return percentCompleted;
  }


  public void setPercentCompleted(Integer percentCompleted) {
    this.percentCompleted = percentCompleted;
  }


  public DropRequestDTO finished(Boolean finished) {
    
    this.finished = finished;
    return this;
  }

   /**
   * Whether the query has finished.
   * @return finished
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the query has finished.")

  public Boolean getFinished() {
    return finished;
  }


  public void setFinished(Boolean finished) {
    this.finished = finished;
  }


  public DropRequestDTO failureReason(String failureReason) {
    
    this.failureReason = failureReason;
    return this;
  }

   /**
   * The reason, if any, that this drop request failed.
   * @return failureReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The reason, if any, that this drop request failed.")

  public String getFailureReason() {
    return failureReason;
  }


  public void setFailureReason(String failureReason) {
    this.failureReason = failureReason;
  }


  public DropRequestDTO currentCount(Integer currentCount) {
    
    this.currentCount = currentCount;
    return this;
  }

   /**
   * The number of flow files currently queued.
   * @return currentCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of flow files currently queued.")

  public Integer getCurrentCount() {
    return currentCount;
  }


  public void setCurrentCount(Integer currentCount) {
    this.currentCount = currentCount;
  }


  public DropRequestDTO currentSize(Long currentSize) {
    
    this.currentSize = currentSize;
    return this;
  }

   /**
   * The size of flow files currently queued in bytes.
   * @return currentSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The size of flow files currently queued in bytes.")

  public Long getCurrentSize() {
    return currentSize;
  }


  public void setCurrentSize(Long currentSize) {
    this.currentSize = currentSize;
  }


  public DropRequestDTO current(String current) {
    
    this.current = current;
    return this;
  }

   /**
   * The count and size of flow files currently queued.
   * @return current
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The count and size of flow files currently queued.")

  public String getCurrent() {
    return current;
  }


  public void setCurrent(String current) {
    this.current = current;
  }


  public DropRequestDTO originalCount(Integer originalCount) {
    
    this.originalCount = originalCount;
    return this;
  }

   /**
   * The number of flow files to be dropped as a result of this request.
   * @return originalCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of flow files to be dropped as a result of this request.")

  public Integer getOriginalCount() {
    return originalCount;
  }


  public void setOriginalCount(Integer originalCount) {
    this.originalCount = originalCount;
  }


  public DropRequestDTO originalSize(Long originalSize) {
    
    this.originalSize = originalSize;
    return this;
  }

   /**
   * The size of flow files to be dropped as a result of this request in bytes.
   * @return originalSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The size of flow files to be dropped as a result of this request in bytes.")

  public Long getOriginalSize() {
    return originalSize;
  }


  public void setOriginalSize(Long originalSize) {
    this.originalSize = originalSize;
  }


  public DropRequestDTO original(String original) {
    
    this.original = original;
    return this;
  }

   /**
   * The count and size of flow files to be dropped as a result of this request.
   * @return original
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The count and size of flow files to be dropped as a result of this request.")

  public String getOriginal() {
    return original;
  }


  public void setOriginal(String original) {
    this.original = original;
  }


  public DropRequestDTO droppedCount(Integer droppedCount) {
    
    this.droppedCount = droppedCount;
    return this;
  }

   /**
   * The number of flow files that have been dropped thus far.
   * @return droppedCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of flow files that have been dropped thus far.")

  public Integer getDroppedCount() {
    return droppedCount;
  }


  public void setDroppedCount(Integer droppedCount) {
    this.droppedCount = droppedCount;
  }


  public DropRequestDTO droppedSize(Long droppedSize) {
    
    this.droppedSize = droppedSize;
    return this;
  }

   /**
   * The size of flow files that have been dropped thus far in bytes.
   * @return droppedSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The size of flow files that have been dropped thus far in bytes.")

  public Long getDroppedSize() {
    return droppedSize;
  }


  public void setDroppedSize(Long droppedSize) {
    this.droppedSize = droppedSize;
  }


  public DropRequestDTO dropped(String dropped) {
    
    this.dropped = dropped;
    return this;
  }

   /**
   * The count and size of flow files that have been dropped thus far.
   * @return dropped
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The count and size of flow files that have been dropped thus far.")

  public String getDropped() {
    return dropped;
  }


  public void setDropped(String dropped) {
    this.dropped = dropped;
  }


  public DropRequestDTO state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * The current state of the drop request.
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The current state of the drop request.")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DropRequestDTO dropRequestDTO = (DropRequestDTO) o;
    return Objects.equals(this.id, dropRequestDTO.id) &&
        Objects.equals(this.uri, dropRequestDTO.uri) &&
        Objects.equals(this.submissionTime, dropRequestDTO.submissionTime) &&
        Objects.equals(this.lastUpdated, dropRequestDTO.lastUpdated) &&
        Objects.equals(this.percentCompleted, dropRequestDTO.percentCompleted) &&
        Objects.equals(this.finished, dropRequestDTO.finished) &&
        Objects.equals(this.failureReason, dropRequestDTO.failureReason) &&
        Objects.equals(this.currentCount, dropRequestDTO.currentCount) &&
        Objects.equals(this.currentSize, dropRequestDTO.currentSize) &&
        Objects.equals(this.current, dropRequestDTO.current) &&
        Objects.equals(this.originalCount, dropRequestDTO.originalCount) &&
        Objects.equals(this.originalSize, dropRequestDTO.originalSize) &&
        Objects.equals(this.original, dropRequestDTO.original) &&
        Objects.equals(this.droppedCount, dropRequestDTO.droppedCount) &&
        Objects.equals(this.droppedSize, dropRequestDTO.droppedSize) &&
        Objects.equals(this.dropped, dropRequestDTO.dropped) &&
        Objects.equals(this.state, dropRequestDTO.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uri, submissionTime, lastUpdated, percentCompleted, finished, failureReason, currentCount, currentSize, current, originalCount, originalSize, original, droppedCount, droppedSize, dropped, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DropRequestDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    submissionTime: ").append(toIndentedString(submissionTime)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    percentCompleted: ").append(toIndentedString(percentCompleted)).append("\n");
    sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    currentCount: ").append(toIndentedString(currentCount)).append("\n");
    sb.append("    currentSize: ").append(toIndentedString(currentSize)).append("\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    originalCount: ").append(toIndentedString(originalCount)).append("\n");
    sb.append("    originalSize: ").append(toIndentedString(originalSize)).append("\n");
    sb.append("    original: ").append(toIndentedString(original)).append("\n");
    sb.append("    droppedCount: ").append(toIndentedString(droppedCount)).append("\n");
    sb.append("    droppedSize: ").append(toIndentedString(droppedSize)).append("\n");
    sb.append("    dropped: ").append(toIndentedString(dropped)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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


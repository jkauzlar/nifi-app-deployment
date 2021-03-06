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
 * ControllerConfigurationDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-19T16:10:34.866069300-08:00[America/Los_Angeles]")
public class ControllerConfigurationDTO {
  public static final String SERIALIZED_NAME_MAX_TIMER_DRIVEN_THREAD_COUNT = "maxTimerDrivenThreadCount";
  @SerializedName(SERIALIZED_NAME_MAX_TIMER_DRIVEN_THREAD_COUNT)
  private Integer maxTimerDrivenThreadCount;

  public static final String SERIALIZED_NAME_MAX_EVENT_DRIVEN_THREAD_COUNT = "maxEventDrivenThreadCount";
  @SerializedName(SERIALIZED_NAME_MAX_EVENT_DRIVEN_THREAD_COUNT)
  private Integer maxEventDrivenThreadCount;


  public ControllerConfigurationDTO maxTimerDrivenThreadCount(Integer maxTimerDrivenThreadCount) {
    
    this.maxTimerDrivenThreadCount = maxTimerDrivenThreadCount;
    return this;
  }

   /**
   * The maximum number of timer driven threads the NiFi has available.
   * @return maxTimerDrivenThreadCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum number of timer driven threads the NiFi has available.")

  public Integer getMaxTimerDrivenThreadCount() {
    return maxTimerDrivenThreadCount;
  }


  public void setMaxTimerDrivenThreadCount(Integer maxTimerDrivenThreadCount) {
    this.maxTimerDrivenThreadCount = maxTimerDrivenThreadCount;
  }


  public ControllerConfigurationDTO maxEventDrivenThreadCount(Integer maxEventDrivenThreadCount) {
    
    this.maxEventDrivenThreadCount = maxEventDrivenThreadCount;
    return this;
  }

   /**
   * The maximum number of event driven threads the NiFi has available.
   * @return maxEventDrivenThreadCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum number of event driven threads the NiFi has available.")

  public Integer getMaxEventDrivenThreadCount() {
    return maxEventDrivenThreadCount;
  }


  public void setMaxEventDrivenThreadCount(Integer maxEventDrivenThreadCount) {
    this.maxEventDrivenThreadCount = maxEventDrivenThreadCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControllerConfigurationDTO controllerConfigurationDTO = (ControllerConfigurationDTO) o;
    return Objects.equals(this.maxTimerDrivenThreadCount, controllerConfigurationDTO.maxTimerDrivenThreadCount) &&
        Objects.equals(this.maxEventDrivenThreadCount, controllerConfigurationDTO.maxEventDrivenThreadCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxTimerDrivenThreadCount, maxEventDrivenThreadCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControllerConfigurationDTO {\n");
    sb.append("    maxTimerDrivenThreadCount: ").append(toIndentedString(maxTimerDrivenThreadCount)).append("\n");
    sb.append("    maxEventDrivenThreadCount: ").append(toIndentedString(maxEventDrivenThreadCount)).append("\n");
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


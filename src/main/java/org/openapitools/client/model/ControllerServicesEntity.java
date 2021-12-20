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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openapitools.client.model.ControllerServiceEntity;

/**
 * ControllerServicesEntity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-19T16:10:34.866069300-08:00[America/Los_Angeles]")
public class ControllerServicesEntity {
  public static final String SERIALIZED_NAME_CURRENT_TIME = "currentTime";
  @SerializedName(SERIALIZED_NAME_CURRENT_TIME)
  private String currentTime;

  public static final String SERIALIZED_NAME_CONTROLLER_SERVICES = "controllerServices";
  @SerializedName(SERIALIZED_NAME_CONTROLLER_SERVICES)
  private Set<ControllerServiceEntity> controllerServices = null;


  public ControllerServicesEntity currentTime(String currentTime) {
    
    this.currentTime = currentTime;
    return this;
  }

   /**
   * The current time on the system.
   * @return currentTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The current time on the system.")

  public String getCurrentTime() {
    return currentTime;
  }


  public void setCurrentTime(String currentTime) {
    this.currentTime = currentTime;
  }


  public ControllerServicesEntity controllerServices(Set<ControllerServiceEntity> controllerServices) {
    
    this.controllerServices = controllerServices;
    return this;
  }

  public ControllerServicesEntity addControllerServicesItem(ControllerServiceEntity controllerServicesItem) {
    if (this.controllerServices == null) {
      this.controllerServices = new LinkedHashSet<ControllerServiceEntity>();
    }
    this.controllerServices.add(controllerServicesItem);
    return this;
  }

   /**
   * Get controllerServices
   * @return controllerServices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<ControllerServiceEntity> getControllerServices() {
    return controllerServices;
  }


  public void setControllerServices(Set<ControllerServiceEntity> controllerServices) {
    this.controllerServices = controllerServices;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControllerServicesEntity controllerServicesEntity = (ControllerServicesEntity) o;
    return Objects.equals(this.currentTime, controllerServicesEntity.currentTime) &&
        Objects.equals(this.controllerServices, controllerServicesEntity.controllerServices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentTime, controllerServices);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControllerServicesEntity {\n");
    sb.append("    currentTime: ").append(toIndentedString(currentTime)).append("\n");
    sb.append("    controllerServices: ").append(toIndentedString(controllerServices)).append("\n");
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

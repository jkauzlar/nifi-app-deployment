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
 * VersionedPropertyDescriptor
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-19T16:10:34.866069300-08:00[America/Los_Angeles]")
public class VersionedPropertyDescriptor {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_IDENTIFIES_CONTROLLER_SERVICE = "identifiesControllerService";
  @SerializedName(SERIALIZED_NAME_IDENTIFIES_CONTROLLER_SERVICE)
  private Boolean identifiesControllerService;


  public VersionedPropertyDescriptor name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the property
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the property")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public VersionedPropertyDescriptor displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The display name of the property
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The display name of the property")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public VersionedPropertyDescriptor identifiesControllerService(Boolean identifiesControllerService) {
    
    this.identifiesControllerService = identifiesControllerService;
    return this;
  }

   /**
   * Whether or not the property provides the identifier of a Controller Service
   * @return identifiesControllerService
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not the property provides the identifier of a Controller Service")

  public Boolean getIdentifiesControllerService() {
    return identifiesControllerService;
  }


  public void setIdentifiesControllerService(Boolean identifiesControllerService) {
    this.identifiesControllerService = identifiesControllerService;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionedPropertyDescriptor versionedPropertyDescriptor = (VersionedPropertyDescriptor) o;
    return Objects.equals(this.name, versionedPropertyDescriptor.name) &&
        Objects.equals(this.displayName, versionedPropertyDescriptor.displayName) &&
        Objects.equals(this.identifiesControllerService, versionedPropertyDescriptor.identifiesControllerService);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, displayName, identifiesControllerService);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionedPropertyDescriptor {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    identifiesControllerService: ").append(toIndentedString(identifiesControllerService)).append("\n");
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

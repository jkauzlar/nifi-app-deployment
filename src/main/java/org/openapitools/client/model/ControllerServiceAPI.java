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
import org.openapitools.client.model.Bundle;

/**
 * ControllerServiceAPI
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-19T16:10:34.866069300-08:00[America/Los_Angeles]")
public class ControllerServiceAPI {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_BUNDLE = "bundle";
  @SerializedName(SERIALIZED_NAME_BUNDLE)
  private Bundle bundle;


  public ControllerServiceAPI type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The fully qualified name of the service interface.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The fully qualified name of the service interface.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public ControllerServiceAPI bundle(Bundle bundle) {
    
    this.bundle = bundle;
    return this;
  }

   /**
   * Get bundle
   * @return bundle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Bundle getBundle() {
    return bundle;
  }


  public void setBundle(Bundle bundle) {
    this.bundle = bundle;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControllerServiceAPI controllerServiceAPI = (ControllerServiceAPI) o;
    return Objects.equals(this.type, controllerServiceAPI.type) &&
        Objects.equals(this.bundle, controllerServiceAPI.bundle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, bundle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControllerServiceAPI {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    bundle: ").append(toIndentedString(bundle)).append("\n");
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


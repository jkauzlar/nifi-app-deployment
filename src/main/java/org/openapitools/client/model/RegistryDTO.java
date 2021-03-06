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
 * RegistryDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-19T16:10:34.866069300-08:00[America/Los_Angeles]")
public class RegistryDTO {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;


  public RegistryDTO id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The registry identifier
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The registry identifier")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public RegistryDTO name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The registry name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The registry name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public RegistryDTO description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The registry description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The registry description")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public RegistryDTO uri(String uri) {
    
    this.uri = uri;
    return this;
  }

   /**
   * The registry URI
   * @return uri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The registry URI")

  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    this.uri = uri;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistryDTO registryDTO = (RegistryDTO) o;
    return Objects.equals(this.id, registryDTO.id) &&
        Objects.equals(this.name, registryDTO.name) &&
        Objects.equals(this.description, registryDTO.description) &&
        Objects.equals(this.uri, registryDTO.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, uri);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistryDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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


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
import org.openapitools.client.model.VersionControlInformationDTO;

/**
 * FlowBreadcrumbDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-19T16:10:34.866069300-08:00[America/Los_Angeles]")
public class FlowBreadcrumbDTO {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VERSION_CONTROL_INFORMATION = "versionControlInformation";
  @SerializedName(SERIALIZED_NAME_VERSION_CONTROL_INFORMATION)
  private VersionControlInformationDTO versionControlInformation;


  public FlowBreadcrumbDTO id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The id of the group.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the group.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public FlowBreadcrumbDTO name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The id of the group.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the group.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public FlowBreadcrumbDTO versionControlInformation(VersionControlInformationDTO versionControlInformation) {
    
    this.versionControlInformation = versionControlInformation;
    return this;
  }

   /**
   * Get versionControlInformation
   * @return versionControlInformation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VersionControlInformationDTO getVersionControlInformation() {
    return versionControlInformation;
  }


  public void setVersionControlInformation(VersionControlInformationDTO versionControlInformation) {
    this.versionControlInformation = versionControlInformation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowBreadcrumbDTO flowBreadcrumbDTO = (FlowBreadcrumbDTO) o;
    return Objects.equals(this.id, flowBreadcrumbDTO.id) &&
        Objects.equals(this.name, flowBreadcrumbDTO.name) &&
        Objects.equals(this.versionControlInformation, flowBreadcrumbDTO.versionControlInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, versionControlInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowBreadcrumbDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    versionControlInformation: ").append(toIndentedString(versionControlInformation)).append("\n");
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


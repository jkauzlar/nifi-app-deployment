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
import org.openapitools.client.model.RevisionDTO;
import org.openapitools.client.model.VariableRegistryDTO;

/**
 * VariableRegistryEntity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-19T16:10:34.866069300-08:00[America/Los_Angeles]")
public class VariableRegistryEntity {
  public static final String SERIALIZED_NAME_PROCESS_GROUP_REVISION = "processGroupRevision";
  @SerializedName(SERIALIZED_NAME_PROCESS_GROUP_REVISION)
  private RevisionDTO processGroupRevision;

  public static final String SERIALIZED_NAME_VARIABLE_REGISTRY = "variableRegistry";
  @SerializedName(SERIALIZED_NAME_VARIABLE_REGISTRY)
  private VariableRegistryDTO variableRegistry;


  public VariableRegistryEntity processGroupRevision(RevisionDTO processGroupRevision) {
    
    this.processGroupRevision = processGroupRevision;
    return this;
  }

   /**
   * Get processGroupRevision
   * @return processGroupRevision
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RevisionDTO getProcessGroupRevision() {
    return processGroupRevision;
  }


  public void setProcessGroupRevision(RevisionDTO processGroupRevision) {
    this.processGroupRevision = processGroupRevision;
  }


  public VariableRegistryEntity variableRegistry(VariableRegistryDTO variableRegistry) {
    
    this.variableRegistry = variableRegistry;
    return this;
  }

   /**
   * Get variableRegistry
   * @return variableRegistry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VariableRegistryDTO getVariableRegistry() {
    return variableRegistry;
  }


  public void setVariableRegistry(VariableRegistryDTO variableRegistry) {
    this.variableRegistry = variableRegistry;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariableRegistryEntity variableRegistryEntity = (VariableRegistryEntity) o;
    return Objects.equals(this.processGroupRevision, variableRegistryEntity.processGroupRevision) &&
        Objects.equals(this.variableRegistry, variableRegistryEntity.variableRegistry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processGroupRevision, variableRegistry);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableRegistryEntity {\n");
    sb.append("    processGroupRevision: ").append(toIndentedString(processGroupRevision)).append("\n");
    sb.append("    variableRegistry: ").append(toIndentedString(variableRegistry)).append("\n");
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

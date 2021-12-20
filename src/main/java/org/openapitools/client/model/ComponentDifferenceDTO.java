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
import java.util.List;
import org.openapitools.client.model.DifferenceDTO;

/**
 * ComponentDifferenceDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-19T16:10:34.866069300-08:00[America/Los_Angeles]")
public class ComponentDifferenceDTO {
  public static final String SERIALIZED_NAME_COMPONENT_TYPE = "componentType";
  @SerializedName(SERIALIZED_NAME_COMPONENT_TYPE)
  private String componentType;

  public static final String SERIALIZED_NAME_COMPONENT_ID = "componentId";
  @SerializedName(SERIALIZED_NAME_COMPONENT_ID)
  private String componentId;

  public static final String SERIALIZED_NAME_COMPONENT_NAME = "componentName";
  @SerializedName(SERIALIZED_NAME_COMPONENT_NAME)
  private String componentName;

  public static final String SERIALIZED_NAME_PROCESS_GROUP_ID = "processGroupId";
  @SerializedName(SERIALIZED_NAME_PROCESS_GROUP_ID)
  private String processGroupId;

  public static final String SERIALIZED_NAME_DIFFERENCES = "differences";
  @SerializedName(SERIALIZED_NAME_DIFFERENCES)
  private List<DifferenceDTO> differences = null;


  public ComponentDifferenceDTO componentType(String componentType) {
    
    this.componentType = componentType;
    return this;
  }

   /**
   * The type of component
   * @return componentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of component")

  public String getComponentType() {
    return componentType;
  }


  public void setComponentType(String componentType) {
    this.componentType = componentType;
  }


  public ComponentDifferenceDTO componentId(String componentId) {
    
    this.componentId = componentId;
    return this;
  }

   /**
   * The ID of the component
   * @return componentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the component")

  public String getComponentId() {
    return componentId;
  }


  public void setComponentId(String componentId) {
    this.componentId = componentId;
  }


  public ComponentDifferenceDTO componentName(String componentName) {
    
    this.componentName = componentName;
    return this;
  }

   /**
   * The name of the component
   * @return componentName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the component")

  public String getComponentName() {
    return componentName;
  }


  public void setComponentName(String componentName) {
    this.componentName = componentName;
  }


  public ComponentDifferenceDTO processGroupId(String processGroupId) {
    
    this.processGroupId = processGroupId;
    return this;
  }

   /**
   * The ID of the Process Group that the component belongs to
   * @return processGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the Process Group that the component belongs to")

  public String getProcessGroupId() {
    return processGroupId;
  }


  public void setProcessGroupId(String processGroupId) {
    this.processGroupId = processGroupId;
  }


  public ComponentDifferenceDTO differences(List<DifferenceDTO> differences) {
    
    this.differences = differences;
    return this;
  }

  public ComponentDifferenceDTO addDifferencesItem(DifferenceDTO differencesItem) {
    if (this.differences == null) {
      this.differences = new ArrayList<DifferenceDTO>();
    }
    this.differences.add(differencesItem);
    return this;
  }

   /**
   * The differences in the component between the two flows
   * @return differences
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The differences in the component between the two flows")

  public List<DifferenceDTO> getDifferences() {
    return differences;
  }


  public void setDifferences(List<DifferenceDTO> differences) {
    this.differences = differences;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentDifferenceDTO componentDifferenceDTO = (ComponentDifferenceDTO) o;
    return Objects.equals(this.componentType, componentDifferenceDTO.componentType) &&
        Objects.equals(this.componentId, componentDifferenceDTO.componentId) &&
        Objects.equals(this.componentName, componentDifferenceDTO.componentName) &&
        Objects.equals(this.processGroupId, componentDifferenceDTO.processGroupId) &&
        Objects.equals(this.differences, componentDifferenceDTO.differences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentType, componentId, componentName, processGroupId, differences);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentDifferenceDTO {\n");
    sb.append("    componentType: ").append(toIndentedString(componentType)).append("\n");
    sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
    sb.append("    componentName: ").append(toIndentedString(componentName)).append("\n");
    sb.append("    processGroupId: ").append(toIndentedString(processGroupId)).append("\n");
    sb.append("    differences: ").append(toIndentedString(differences)).append("\n");
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


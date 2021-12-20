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
import org.openapitools.client.model.FlowBreadcrumbEntity;
import org.openapitools.client.model.FlowDTO;

/**
 * ProcessGroupFlowDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-19T16:10:34.866069300-08:00[America/Los_Angeles]")
public class ProcessGroupFlowDTO {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public static final String SERIALIZED_NAME_PARENT_GROUP_ID = "parentGroupId";
  @SerializedName(SERIALIZED_NAME_PARENT_GROUP_ID)
  private String parentGroupId;

  public static final String SERIALIZED_NAME_BREADCRUMB = "breadcrumb";
  @SerializedName(SERIALIZED_NAME_BREADCRUMB)
  private FlowBreadcrumbEntity breadcrumb;

  public static final String SERIALIZED_NAME_FLOW = "flow";
  @SerializedName(SERIALIZED_NAME_FLOW)
  private FlowDTO flow;

  public static final String SERIALIZED_NAME_LAST_REFRESHED = "lastRefreshed";
  @SerializedName(SERIALIZED_NAME_LAST_REFRESHED)
  private String lastRefreshed;


  public ProcessGroupFlowDTO id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The id of the component.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the component.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ProcessGroupFlowDTO uri(String uri) {
    
    this.uri = uri;
    return this;
  }

   /**
   * The URI for futures requests to the component.
   * @return uri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URI for futures requests to the component.")

  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    this.uri = uri;
  }


  public ProcessGroupFlowDTO parentGroupId(String parentGroupId) {
    
    this.parentGroupId = parentGroupId;
    return this;
  }

   /**
   * The id of parent process group of this component if applicable.
   * @return parentGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of parent process group of this component if applicable.")

  public String getParentGroupId() {
    return parentGroupId;
  }


  public void setParentGroupId(String parentGroupId) {
    this.parentGroupId = parentGroupId;
  }


  public ProcessGroupFlowDTO breadcrumb(FlowBreadcrumbEntity breadcrumb) {
    
    this.breadcrumb = breadcrumb;
    return this;
  }

   /**
   * Get breadcrumb
   * @return breadcrumb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FlowBreadcrumbEntity getBreadcrumb() {
    return breadcrumb;
  }


  public void setBreadcrumb(FlowBreadcrumbEntity breadcrumb) {
    this.breadcrumb = breadcrumb;
  }


  public ProcessGroupFlowDTO flow(FlowDTO flow) {
    
    this.flow = flow;
    return this;
  }

   /**
   * Get flow
   * @return flow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FlowDTO getFlow() {
    return flow;
  }


  public void setFlow(FlowDTO flow) {
    this.flow = flow;
  }


  public ProcessGroupFlowDTO lastRefreshed(String lastRefreshed) {
    
    this.lastRefreshed = lastRefreshed;
    return this;
  }

   /**
   * The time the flow for the process group was last refreshed.
   * @return lastRefreshed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time the flow for the process group was last refreshed.")

  public String getLastRefreshed() {
    return lastRefreshed;
  }


  public void setLastRefreshed(String lastRefreshed) {
    this.lastRefreshed = lastRefreshed;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessGroupFlowDTO processGroupFlowDTO = (ProcessGroupFlowDTO) o;
    return Objects.equals(this.id, processGroupFlowDTO.id) &&
        Objects.equals(this.uri, processGroupFlowDTO.uri) &&
        Objects.equals(this.parentGroupId, processGroupFlowDTO.parentGroupId) &&
        Objects.equals(this.breadcrumb, processGroupFlowDTO.breadcrumb) &&
        Objects.equals(this.flow, processGroupFlowDTO.flow) &&
        Objects.equals(this.lastRefreshed, processGroupFlowDTO.lastRefreshed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uri, parentGroupId, breadcrumb, flow, lastRefreshed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessGroupFlowDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    parentGroupId: ").append(toIndentedString(parentGroupId)).append("\n");
    sb.append("    breadcrumb: ").append(toIndentedString(breadcrumb)).append("\n");
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
    sb.append("    lastRefreshed: ").append(toIndentedString(lastRefreshed)).append("\n");
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

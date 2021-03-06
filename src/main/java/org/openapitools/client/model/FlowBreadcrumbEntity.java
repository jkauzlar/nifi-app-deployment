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
import org.openapitools.client.model.FlowBreadcrumbDTO;
import org.openapitools.client.model.PermissionsDTO;

/**
 * FlowBreadcrumbEntity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-19T16:10:34.866069300-08:00[America/Los_Angeles]")
public class FlowBreadcrumbEntity {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private PermissionsDTO permissions;

  /**
   * The current state of the Process Group, as it relates to the Versioned Flow
   */
  @JsonAdapter(VersionedFlowStateEnum.Adapter.class)
  public enum VersionedFlowStateEnum {
    LOCALLY_MODIFIED_DESCENDANT("LOCALLY_MODIFIED_DESCENDANT"),
    
    LOCALLY_MODIFIED("LOCALLY_MODIFIED"),
    
    STALE("STALE"),
    
    LOCALLY_MODIFIED_AND_STALE("LOCALLY_MODIFIED_AND_STALE"),
    
    UP_TO_DATE("UP_TO_DATE");

    private String value;

    VersionedFlowStateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VersionedFlowStateEnum fromValue(String value) {
      for (VersionedFlowStateEnum b : VersionedFlowStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<VersionedFlowStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VersionedFlowStateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VersionedFlowStateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return VersionedFlowStateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VERSIONED_FLOW_STATE = "versionedFlowState";
  @SerializedName(SERIALIZED_NAME_VERSIONED_FLOW_STATE)
  private VersionedFlowStateEnum versionedFlowState;

  public static final String SERIALIZED_NAME_BREADCRUMB = "breadcrumb";
  @SerializedName(SERIALIZED_NAME_BREADCRUMB)
  private FlowBreadcrumbDTO breadcrumb;

  public static final String SERIALIZED_NAME_PARENT_BREADCRUMB = "parentBreadcrumb";
  @SerializedName(SERIALIZED_NAME_PARENT_BREADCRUMB)
  private FlowBreadcrumbEntity parentBreadcrumb;


  public FlowBreadcrumbEntity id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The id of this ancestor ProcessGroup.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of this ancestor ProcessGroup.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public FlowBreadcrumbEntity permissions(PermissionsDTO permissions) {
    
    this.permissions = permissions;
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PermissionsDTO getPermissions() {
    return permissions;
  }


  public void setPermissions(PermissionsDTO permissions) {
    this.permissions = permissions;
  }


   /**
   * The current state of the Process Group, as it relates to the Versioned Flow
   * @return versionedFlowState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The current state of the Process Group, as it relates to the Versioned Flow")

  public VersionedFlowStateEnum getVersionedFlowState() {
    return versionedFlowState;
  }




  public FlowBreadcrumbEntity breadcrumb(FlowBreadcrumbDTO breadcrumb) {
    
    this.breadcrumb = breadcrumb;
    return this;
  }

   /**
   * Get breadcrumb
   * @return breadcrumb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FlowBreadcrumbDTO getBreadcrumb() {
    return breadcrumb;
  }


  public void setBreadcrumb(FlowBreadcrumbDTO breadcrumb) {
    this.breadcrumb = breadcrumb;
  }


  public FlowBreadcrumbEntity parentBreadcrumb(FlowBreadcrumbEntity parentBreadcrumb) {
    
    this.parentBreadcrumb = parentBreadcrumb;
    return this;
  }

   /**
   * Get parentBreadcrumb
   * @return parentBreadcrumb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FlowBreadcrumbEntity getParentBreadcrumb() {
    return parentBreadcrumb;
  }


  public void setParentBreadcrumb(FlowBreadcrumbEntity parentBreadcrumb) {
    this.parentBreadcrumb = parentBreadcrumb;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowBreadcrumbEntity flowBreadcrumbEntity = (FlowBreadcrumbEntity) o;
    return Objects.equals(this.id, flowBreadcrumbEntity.id) &&
        Objects.equals(this.permissions, flowBreadcrumbEntity.permissions) &&
        Objects.equals(this.versionedFlowState, flowBreadcrumbEntity.versionedFlowState) &&
        Objects.equals(this.breadcrumb, flowBreadcrumbEntity.breadcrumb) &&
        Objects.equals(this.parentBreadcrumb, flowBreadcrumbEntity.parentBreadcrumb);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, permissions, versionedFlowState, breadcrumb, parentBreadcrumb);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowBreadcrumbEntity {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    versionedFlowState: ").append(toIndentedString(versionedFlowState)).append("\n");
    sb.append("    breadcrumb: ").append(toIndentedString(breadcrumb)).append("\n");
    sb.append("    parentBreadcrumb: ").append(toIndentedString(parentBreadcrumb)).append("\n");
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


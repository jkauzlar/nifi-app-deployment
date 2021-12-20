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
import org.openapitools.client.model.BulletinEntity;
import org.openapitools.client.model.PermissionsDTO;
import org.openapitools.client.model.PositionDTO;
import org.openapitools.client.model.ProcessorDTO;
import org.openapitools.client.model.ProcessorStatusDTO;
import org.openapitools.client.model.RevisionDTO;

/**
 * ProcessorEntity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-19T16:10:34.866069300-08:00[America/Los_Angeles]")
public class ProcessorEntity {
  public static final String SERIALIZED_NAME_REVISION = "revision";
  @SerializedName(SERIALIZED_NAME_REVISION)
  private RevisionDTO revision;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private PositionDTO position;

  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private PermissionsDTO permissions;

  public static final String SERIALIZED_NAME_BULLETINS = "bulletins";
  @SerializedName(SERIALIZED_NAME_BULLETINS)
  private List<BulletinEntity> bulletins = null;

  public static final String SERIALIZED_NAME_COMPONENT = "component";
  @SerializedName(SERIALIZED_NAME_COMPONENT)
  private ProcessorDTO component;

  public static final String SERIALIZED_NAME_INPUT_REQUIREMENT = "inputRequirement";
  @SerializedName(SERIALIZED_NAME_INPUT_REQUIREMENT)
  private String inputRequirement;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ProcessorStatusDTO status;


  public ProcessorEntity revision(RevisionDTO revision) {
    
    this.revision = revision;
    return this;
  }

   /**
   * Get revision
   * @return revision
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RevisionDTO getRevision() {
    return revision;
  }


  public void setRevision(RevisionDTO revision) {
    this.revision = revision;
  }


  public ProcessorEntity id(String id) {
    
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


  public ProcessorEntity uri(String uri) {
    
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


  public ProcessorEntity position(PositionDTO position) {
    
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PositionDTO getPosition() {
    return position;
  }


  public void setPosition(PositionDTO position) {
    this.position = position;
  }


  public ProcessorEntity permissions(PermissionsDTO permissions) {
    
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


  public ProcessorEntity bulletins(List<BulletinEntity> bulletins) {
    
    this.bulletins = bulletins;
    return this;
  }

  public ProcessorEntity addBulletinsItem(BulletinEntity bulletinsItem) {
    if (this.bulletins == null) {
      this.bulletins = new ArrayList<BulletinEntity>();
    }
    this.bulletins.add(bulletinsItem);
    return this;
  }

   /**
   * The bulletins for this component.
   * @return bulletins
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The bulletins for this component.")

  public List<BulletinEntity> getBulletins() {
    return bulletins;
  }


  public void setBulletins(List<BulletinEntity> bulletins) {
    this.bulletins = bulletins;
  }


  public ProcessorEntity component(ProcessorDTO component) {
    
    this.component = component;
    return this;
  }

   /**
   * Get component
   * @return component
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProcessorDTO getComponent() {
    return component;
  }


  public void setComponent(ProcessorDTO component) {
    this.component = component;
  }


  public ProcessorEntity inputRequirement(String inputRequirement) {
    
    this.inputRequirement = inputRequirement;
    return this;
  }

   /**
   * The input requirement for this processor.
   * @return inputRequirement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The input requirement for this processor.")

  public String getInputRequirement() {
    return inputRequirement;
  }


  public void setInputRequirement(String inputRequirement) {
    this.inputRequirement = inputRequirement;
  }


  public ProcessorEntity status(ProcessorStatusDTO status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProcessorStatusDTO getStatus() {
    return status;
  }


  public void setStatus(ProcessorStatusDTO status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessorEntity processorEntity = (ProcessorEntity) o;
    return Objects.equals(this.revision, processorEntity.revision) &&
        Objects.equals(this.id, processorEntity.id) &&
        Objects.equals(this.uri, processorEntity.uri) &&
        Objects.equals(this.position, processorEntity.position) &&
        Objects.equals(this.permissions, processorEntity.permissions) &&
        Objects.equals(this.bulletins, processorEntity.bulletins) &&
        Objects.equals(this.component, processorEntity.component) &&
        Objects.equals(this.inputRequirement, processorEntity.inputRequirement) &&
        Objects.equals(this.status, processorEntity.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(revision, id, uri, position, permissions, bulletins, component, inputRequirement, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessorEntity {\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    bulletins: ").append(toIndentedString(bulletins)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    inputRequirement: ").append(toIndentedString(inputRequirement)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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


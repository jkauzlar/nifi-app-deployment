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
import org.openapitools.client.model.ComponentReferenceDTO;
import org.openapitools.client.model.PermissionsDTO;
import org.openapitools.client.model.PositionDTO;
import org.openapitools.client.model.RevisionDTO;

/**
 * ComponentReferenceEntity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-19T16:10:34.866069300-08:00[America/Los_Angeles]")
public class ComponentReferenceEntity {
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

  public static final String SERIALIZED_NAME_PARENT_GROUP_ID = "parentGroupId";
  @SerializedName(SERIALIZED_NAME_PARENT_GROUP_ID)
  private String parentGroupId;

  public static final String SERIALIZED_NAME_COMPONENT = "component";
  @SerializedName(SERIALIZED_NAME_COMPONENT)
  private ComponentReferenceDTO component;


  public ComponentReferenceEntity revision(RevisionDTO revision) {
    
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


  public ComponentReferenceEntity id(String id) {
    
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


  public ComponentReferenceEntity uri(String uri) {
    
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


  public ComponentReferenceEntity position(PositionDTO position) {
    
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


  public ComponentReferenceEntity permissions(PermissionsDTO permissions) {
    
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


  public ComponentReferenceEntity bulletins(List<BulletinEntity> bulletins) {
    
    this.bulletins = bulletins;
    return this;
  }

  public ComponentReferenceEntity addBulletinsItem(BulletinEntity bulletinsItem) {
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


  public ComponentReferenceEntity parentGroupId(String parentGroupId) {
    
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


  public ComponentReferenceEntity component(ComponentReferenceDTO component) {
    
    this.component = component;
    return this;
  }

   /**
   * Get component
   * @return component
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComponentReferenceDTO getComponent() {
    return component;
  }


  public void setComponent(ComponentReferenceDTO component) {
    this.component = component;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentReferenceEntity componentReferenceEntity = (ComponentReferenceEntity) o;
    return Objects.equals(this.revision, componentReferenceEntity.revision) &&
        Objects.equals(this.id, componentReferenceEntity.id) &&
        Objects.equals(this.uri, componentReferenceEntity.uri) &&
        Objects.equals(this.position, componentReferenceEntity.position) &&
        Objects.equals(this.permissions, componentReferenceEntity.permissions) &&
        Objects.equals(this.bulletins, componentReferenceEntity.bulletins) &&
        Objects.equals(this.parentGroupId, componentReferenceEntity.parentGroupId) &&
        Objects.equals(this.component, componentReferenceEntity.component);
  }

  @Override
  public int hashCode() {
    return Objects.hash(revision, id, uri, position, permissions, bulletins, parentGroupId, component);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentReferenceEntity {\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    bulletins: ").append(toIndentedString(bulletins)).append("\n");
    sb.append("    parentGroupId: ").append(toIndentedString(parentGroupId)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
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


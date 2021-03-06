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
 * ProvenanceSearchableFieldDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-19T16:10:34.866069300-08:00[America/Los_Angeles]")
public class ProvenanceSearchableFieldDTO {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  private String field;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public ProvenanceSearchableFieldDTO id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The id of the searchable field.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the searchable field.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ProvenanceSearchableFieldDTO field(String field) {
    
    this.field = field;
    return this;
  }

   /**
   * The searchable field.
   * @return field
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The searchable field.")

  public String getField() {
    return field;
  }


  public void setField(String field) {
    this.field = field;
  }


  public ProvenanceSearchableFieldDTO label(String label) {
    
    this.label = label;
    return this;
  }

   /**
   * The label for the searchable field.
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The label for the searchable field.")

  public String getLabel() {
    return label;
  }


  public void setLabel(String label) {
    this.label = label;
  }


  public ProvenanceSearchableFieldDTO type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the searchable field.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of the searchable field.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvenanceSearchableFieldDTO provenanceSearchableFieldDTO = (ProvenanceSearchableFieldDTO) o;
    return Objects.equals(this.id, provenanceSearchableFieldDTO.id) &&
        Objects.equals(this.field, provenanceSearchableFieldDTO.field) &&
        Objects.equals(this.label, provenanceSearchableFieldDTO.label) &&
        Objects.equals(this.type, provenanceSearchableFieldDTO.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, field, label, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvenanceSearchableFieldDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


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
 * BucketDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-19T16:10:34.866069300-08:00[America/Los_Angeles]")
public class BucketDTO {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private Long created;


  public BucketDTO id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The bucket identifier
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The bucket identifier")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public BucketDTO name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The bucket name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The bucket name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public BucketDTO description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The bucket description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The bucket description")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public BucketDTO created(Long created) {
    
    this.created = created;
    return this;
  }

   /**
   * The created timestamp of this bucket
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The created timestamp of this bucket")

  public Long getCreated() {
    return created;
  }


  public void setCreated(Long created) {
    this.created = created;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BucketDTO bucketDTO = (BucketDTO) o;
    return Objects.equals(this.id, bucketDTO.id) &&
        Objects.equals(this.name, bucketDTO.name) &&
        Objects.equals(this.description, bucketDTO.description) &&
        Objects.equals(this.created, bucketDTO.created);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, created);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BucketDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
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


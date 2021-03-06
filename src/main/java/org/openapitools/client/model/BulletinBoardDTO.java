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

/**
 * BulletinBoardDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-19T16:10:34.866069300-08:00[America/Los_Angeles]")
public class BulletinBoardDTO {
  public static final String SERIALIZED_NAME_BULLETINS = "bulletins";
  @SerializedName(SERIALIZED_NAME_BULLETINS)
  private List<BulletinEntity> bulletins = null;

  public static final String SERIALIZED_NAME_GENERATED = "generated";
  @SerializedName(SERIALIZED_NAME_GENERATED)
  private String generated;


  public BulletinBoardDTO bulletins(List<BulletinEntity> bulletins) {
    
    this.bulletins = bulletins;
    return this;
  }

  public BulletinBoardDTO addBulletinsItem(BulletinEntity bulletinsItem) {
    if (this.bulletins == null) {
      this.bulletins = new ArrayList<BulletinEntity>();
    }
    this.bulletins.add(bulletinsItem);
    return this;
  }

   /**
   * The bulletins in the bulletin board, that matches the supplied request.
   * @return bulletins
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The bulletins in the bulletin board, that matches the supplied request.")

  public List<BulletinEntity> getBulletins() {
    return bulletins;
  }


  public void setBulletins(List<BulletinEntity> bulletins) {
    this.bulletins = bulletins;
  }


  public BulletinBoardDTO generated(String generated) {
    
    this.generated = generated;
    return this;
  }

   /**
   * The timestamp when this report was generated.
   * @return generated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timestamp when this report was generated.")

  public String getGenerated() {
    return generated;
  }


  public void setGenerated(String generated) {
    this.generated = generated;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulletinBoardDTO bulletinBoardDTO = (BulletinBoardDTO) o;
    return Objects.equals(this.bulletins, bulletinBoardDTO.bulletins) &&
        Objects.equals(this.generated, bulletinBoardDTO.generated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bulletins, generated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulletinBoardDTO {\n");
    sb.append("    bulletins: ").append(toIndentedString(bulletins)).append("\n");
    sb.append("    generated: ").append(toIndentedString(generated)).append("\n");
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


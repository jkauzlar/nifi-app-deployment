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
import org.openapitools.client.model.PreviousValueDTO;

/**
 * PropertyHistoryDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-19T16:10:34.866069300-08:00[America/Los_Angeles]")
public class PropertyHistoryDTO {
  public static final String SERIALIZED_NAME_PREVIOUS_VALUES = "previousValues";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_VALUES)
  private List<PreviousValueDTO> previousValues = null;


  public PropertyHistoryDTO previousValues(List<PreviousValueDTO> previousValues) {
    
    this.previousValues = previousValues;
    return this;
  }

  public PropertyHistoryDTO addPreviousValuesItem(PreviousValueDTO previousValuesItem) {
    if (this.previousValues == null) {
      this.previousValues = new ArrayList<PreviousValueDTO>();
    }
    this.previousValues.add(previousValuesItem);
    return this;
  }

   /**
   * Previous values for a given property.
   * @return previousValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Previous values for a given property.")

  public List<PreviousValueDTO> getPreviousValues() {
    return previousValues;
  }


  public void setPreviousValues(List<PreviousValueDTO> previousValues) {
    this.previousValues = previousValues;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertyHistoryDTO propertyHistoryDTO = (PropertyHistoryDTO) o;
    return Objects.equals(this.previousValues, propertyHistoryDTO.previousValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(previousValues);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyHistoryDTO {\n");
    sb.append("    previousValues: ").append(toIndentedString(previousValues)).append("\n");
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


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

/**
 * AffectedComponentDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-19T16:10:34.866069300-08:00[America/Los_Angeles]")
public class AffectedComponentDTO {
  public static final String SERIALIZED_NAME_PROCESS_GROUP_ID = "processGroupId";
  @SerializedName(SERIALIZED_NAME_PROCESS_GROUP_ID)
  private String processGroupId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  /**
   * The type of this component
   */
  @JsonAdapter(ReferenceTypeEnum.Adapter.class)
  public enum ReferenceTypeEnum {
    PROCESSOR("PROCESSOR"),
    
    CONTROLLER_SERVICE("CONTROLLER_SERVICE"),
    
    INPUT_PORT("INPUT_PORT"),
    
    OUTPUT_PORT("OUTPUT_PORT"),
    
    REMOTE_INPUT_PORT("REMOTE_INPUT_PORT"),
    
    REMOTE_OUTPUT_PORT("REMOTE_OUTPUT_PORT");

    private String value;

    ReferenceTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReferenceTypeEnum fromValue(String value) {
      for (ReferenceTypeEnum b : ReferenceTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ReferenceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReferenceTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReferenceTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ReferenceTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REFERENCE_TYPE = "referenceType";
  @SerializedName(SERIALIZED_NAME_REFERENCE_TYPE)
  private ReferenceTypeEnum referenceType;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_ACTIVE_THREAD_COUNT = "activeThreadCount";
  @SerializedName(SERIALIZED_NAME_ACTIVE_THREAD_COUNT)
  private Integer activeThreadCount;

  public static final String SERIALIZED_NAME_VALIDATION_ERRORS = "validationErrors";
  @SerializedName(SERIALIZED_NAME_VALIDATION_ERRORS)
  private List<String> validationErrors = null;


  public AffectedComponentDTO processGroupId(String processGroupId) {
    
    this.processGroupId = processGroupId;
    return this;
  }

   /**
   * The UUID of the Process Group that this component is in
   * @return processGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The UUID of the Process Group that this component is in")

  public String getProcessGroupId() {
    return processGroupId;
  }


  public void setProcessGroupId(String processGroupId) {
    this.processGroupId = processGroupId;
  }


  public AffectedComponentDTO id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The UUID of this component
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The UUID of this component")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public AffectedComponentDTO referenceType(ReferenceTypeEnum referenceType) {
    
    this.referenceType = referenceType;
    return this;
  }

   /**
   * The type of this component
   * @return referenceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of this component")

  public ReferenceTypeEnum getReferenceType() {
    return referenceType;
  }


  public void setReferenceType(ReferenceTypeEnum referenceType) {
    this.referenceType = referenceType;
  }


  public AffectedComponentDTO name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of this component.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of this component.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AffectedComponentDTO state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * The scheduled state of a processor or reporting task referencing a controller service. If this component is another controller service, this field represents the controller service state.
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The scheduled state of a processor or reporting task referencing a controller service. If this component is another controller service, this field represents the controller service state.")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public AffectedComponentDTO activeThreadCount(Integer activeThreadCount) {
    
    this.activeThreadCount = activeThreadCount;
    return this;
  }

   /**
   * The number of active threads for the referencing component.
   * @return activeThreadCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of active threads for the referencing component.")

  public Integer getActiveThreadCount() {
    return activeThreadCount;
  }


  public void setActiveThreadCount(Integer activeThreadCount) {
    this.activeThreadCount = activeThreadCount;
  }


  public AffectedComponentDTO validationErrors(List<String> validationErrors) {
    
    this.validationErrors = validationErrors;
    return this;
  }

  public AffectedComponentDTO addValidationErrorsItem(String validationErrorsItem) {
    if (this.validationErrors == null) {
      this.validationErrors = new ArrayList<String>();
    }
    this.validationErrors.add(validationErrorsItem);
    return this;
  }

   /**
   * The validation errors for the component.
   * @return validationErrors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The validation errors for the component.")

  public List<String> getValidationErrors() {
    return validationErrors;
  }


  public void setValidationErrors(List<String> validationErrors) {
    this.validationErrors = validationErrors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AffectedComponentDTO affectedComponentDTO = (AffectedComponentDTO) o;
    return Objects.equals(this.processGroupId, affectedComponentDTO.processGroupId) &&
        Objects.equals(this.id, affectedComponentDTO.id) &&
        Objects.equals(this.referenceType, affectedComponentDTO.referenceType) &&
        Objects.equals(this.name, affectedComponentDTO.name) &&
        Objects.equals(this.state, affectedComponentDTO.state) &&
        Objects.equals(this.activeThreadCount, affectedComponentDTO.activeThreadCount) &&
        Objects.equals(this.validationErrors, affectedComponentDTO.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(processGroupId, id, referenceType, name, state, activeThreadCount, validationErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AffectedComponentDTO {\n");
    sb.append("    processGroupId: ").append(toIndentedString(processGroupId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    referenceType: ").append(toIndentedString(referenceType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    activeThreadCount: ").append(toIndentedString(activeThreadCount)).append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
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


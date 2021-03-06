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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.BundleDTO;
import org.openapitools.client.model.PositionDTO;
import org.openapitools.client.model.ProcessorConfigDTO;
import org.openapitools.client.model.RelationshipDTO;

/**
 * ProcessorDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-19T16:10:34.866069300-08:00[America/Los_Angeles]")
public class ProcessorDTO {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_VERSIONED_COMPONENT_ID = "versionedComponentId";
  @SerializedName(SERIALIZED_NAME_VERSIONED_COMPONENT_ID)
  private String versionedComponentId;

  public static final String SERIALIZED_NAME_PARENT_GROUP_ID = "parentGroupId";
  @SerializedName(SERIALIZED_NAME_PARENT_GROUP_ID)
  private String parentGroupId;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private PositionDTO position;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_BUNDLE = "bundle";
  @SerializedName(SERIALIZED_NAME_BUNDLE)
  private BundleDTO bundle;

  /**
   * The state of the processor
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    RUNNING("RUNNING"),
    
    STOPPED("STOPPED"),
    
    DISABLED("DISABLED");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  public static final String SERIALIZED_NAME_STYLE = "style";
  @SerializedName(SERIALIZED_NAME_STYLE)
  private Map<String, String> style = null;

  public static final String SERIALIZED_NAME_RELATIONSHIPS = "relationships";
  @SerializedName(SERIALIZED_NAME_RELATIONSHIPS)
  private List<RelationshipDTO> relationships = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SUPPORTS_PARALLEL_PROCESSING = "supportsParallelProcessing";
  @SerializedName(SERIALIZED_NAME_SUPPORTS_PARALLEL_PROCESSING)
  private Boolean supportsParallelProcessing;

  public static final String SERIALIZED_NAME_SUPPORTS_EVENT_DRIVEN = "supportsEventDriven";
  @SerializedName(SERIALIZED_NAME_SUPPORTS_EVENT_DRIVEN)
  private Boolean supportsEventDriven;

  public static final String SERIALIZED_NAME_SUPPORTS_BATCHING = "supportsBatching";
  @SerializedName(SERIALIZED_NAME_SUPPORTS_BATCHING)
  private Boolean supportsBatching;

  public static final String SERIALIZED_NAME_PERSISTS_STATE = "persistsState";
  @SerializedName(SERIALIZED_NAME_PERSISTS_STATE)
  private Boolean persistsState;

  public static final String SERIALIZED_NAME_RESTRICTED = "restricted";
  @SerializedName(SERIALIZED_NAME_RESTRICTED)
  private Boolean restricted;

  public static final String SERIALIZED_NAME_DEPRECATED = "deprecated";
  @SerializedName(SERIALIZED_NAME_DEPRECATED)
  private Boolean deprecated;

  public static final String SERIALIZED_NAME_MULTIPLE_VERSIONS_AVAILABLE = "multipleVersionsAvailable";
  @SerializedName(SERIALIZED_NAME_MULTIPLE_VERSIONS_AVAILABLE)
  private Boolean multipleVersionsAvailable;

  public static final String SERIALIZED_NAME_INPUT_REQUIREMENT = "inputRequirement";
  @SerializedName(SERIALIZED_NAME_INPUT_REQUIREMENT)
  private String inputRequirement;

  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private ProcessorConfigDTO config;

  public static final String SERIALIZED_NAME_VALIDATION_ERRORS = "validationErrors";
  @SerializedName(SERIALIZED_NAME_VALIDATION_ERRORS)
  private List<String> validationErrors = null;

  public static final String SERIALIZED_NAME_EXTENSION_MISSING = "extensionMissing";
  @SerializedName(SERIALIZED_NAME_EXTENSION_MISSING)
  private Boolean extensionMissing;


  public ProcessorDTO id(String id) {
    
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


  public ProcessorDTO versionedComponentId(String versionedComponentId) {
    
    this.versionedComponentId = versionedComponentId;
    return this;
  }

   /**
   * The ID of the corresponding component that is under version control
   * @return versionedComponentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the corresponding component that is under version control")

  public String getVersionedComponentId() {
    return versionedComponentId;
  }


  public void setVersionedComponentId(String versionedComponentId) {
    this.versionedComponentId = versionedComponentId;
  }


  public ProcessorDTO parentGroupId(String parentGroupId) {
    
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


  public ProcessorDTO position(PositionDTO position) {
    
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


  public ProcessorDTO name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the processor.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the processor.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ProcessorDTO type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the processor.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of the processor.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public ProcessorDTO bundle(BundleDTO bundle) {
    
    this.bundle = bundle;
    return this;
  }

   /**
   * Get bundle
   * @return bundle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BundleDTO getBundle() {
    return bundle;
  }


  public void setBundle(BundleDTO bundle) {
    this.bundle = bundle;
  }


  public ProcessorDTO state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * The state of the processor
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The state of the processor")

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    this.state = state;
  }


  public ProcessorDTO style(Map<String, String> style) {
    
    this.style = style;
    return this;
  }

  public ProcessorDTO putStyleItem(String key, String styleItem) {
    if (this.style == null) {
      this.style = new HashMap<String, String>();
    }
    this.style.put(key, styleItem);
    return this;
  }

   /**
   * Styles for the processor (background-color : #eee).
   * @return style
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Styles for the processor (background-color : #eee).")

  public Map<String, String> getStyle() {
    return style;
  }


  public void setStyle(Map<String, String> style) {
    this.style = style;
  }


   /**
   * The available relationships that the processor currently supports.
   * @return relationships
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The available relationships that the processor currently supports.")

  public List<RelationshipDTO> getRelationships() {
    return relationships;
  }




  public ProcessorDTO description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the processor.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the processor.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ProcessorDTO supportsParallelProcessing(Boolean supportsParallelProcessing) {
    
    this.supportsParallelProcessing = supportsParallelProcessing;
    return this;
  }

   /**
   * Whether the processor supports parallel processing.
   * @return supportsParallelProcessing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the processor supports parallel processing.")

  public Boolean getSupportsParallelProcessing() {
    return supportsParallelProcessing;
  }


  public void setSupportsParallelProcessing(Boolean supportsParallelProcessing) {
    this.supportsParallelProcessing = supportsParallelProcessing;
  }


  public ProcessorDTO supportsEventDriven(Boolean supportsEventDriven) {
    
    this.supportsEventDriven = supportsEventDriven;
    return this;
  }

   /**
   * Whether the processor supports event driven scheduling.
   * @return supportsEventDriven
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the processor supports event driven scheduling.")

  public Boolean getSupportsEventDriven() {
    return supportsEventDriven;
  }


  public void setSupportsEventDriven(Boolean supportsEventDriven) {
    this.supportsEventDriven = supportsEventDriven;
  }


  public ProcessorDTO supportsBatching(Boolean supportsBatching) {
    
    this.supportsBatching = supportsBatching;
    return this;
  }

   /**
   * Whether the processor supports batching. This makes the run duration settings available.
   * @return supportsBatching
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the processor supports batching. This makes the run duration settings available.")

  public Boolean getSupportsBatching() {
    return supportsBatching;
  }


  public void setSupportsBatching(Boolean supportsBatching) {
    this.supportsBatching = supportsBatching;
  }


  public ProcessorDTO persistsState(Boolean persistsState) {
    
    this.persistsState = persistsState;
    return this;
  }

   /**
   * Whether the processor persists state.
   * @return persistsState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the processor persists state.")

  public Boolean getPersistsState() {
    return persistsState;
  }


  public void setPersistsState(Boolean persistsState) {
    this.persistsState = persistsState;
  }


  public ProcessorDTO restricted(Boolean restricted) {
    
    this.restricted = restricted;
    return this;
  }

   /**
   * Whether the processor requires elevated privileges.
   * @return restricted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the processor requires elevated privileges.")

  public Boolean getRestricted() {
    return restricted;
  }


  public void setRestricted(Boolean restricted) {
    this.restricted = restricted;
  }


  public ProcessorDTO deprecated(Boolean deprecated) {
    
    this.deprecated = deprecated;
    return this;
  }

   /**
   * Whether the processor has been deprecated.
   * @return deprecated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the processor has been deprecated.")

  public Boolean getDeprecated() {
    return deprecated;
  }


  public void setDeprecated(Boolean deprecated) {
    this.deprecated = deprecated;
  }


  public ProcessorDTO multipleVersionsAvailable(Boolean multipleVersionsAvailable) {
    
    this.multipleVersionsAvailable = multipleVersionsAvailable;
    return this;
  }

   /**
   * Whether the processor has multiple versions available.
   * @return multipleVersionsAvailable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the processor has multiple versions available.")

  public Boolean getMultipleVersionsAvailable() {
    return multipleVersionsAvailable;
  }


  public void setMultipleVersionsAvailable(Boolean multipleVersionsAvailable) {
    this.multipleVersionsAvailable = multipleVersionsAvailable;
  }


  public ProcessorDTO inputRequirement(String inputRequirement) {
    
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


  public ProcessorDTO config(ProcessorConfigDTO config) {
    
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProcessorConfigDTO getConfig() {
    return config;
  }


  public void setConfig(ProcessorConfigDTO config) {
    this.config = config;
  }


  public ProcessorDTO validationErrors(List<String> validationErrors) {
    
    this.validationErrors = validationErrors;
    return this;
  }

  public ProcessorDTO addValidationErrorsItem(String validationErrorsItem) {
    if (this.validationErrors == null) {
      this.validationErrors = new ArrayList<String>();
    }
    this.validationErrors.add(validationErrorsItem);
    return this;
  }

   /**
   * The validation errors for the processor. These validation errors represent the problems with the processor that must be resolved before it can be started.
   * @return validationErrors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The validation errors for the processor. These validation errors represent the problems with the processor that must be resolved before it can be started.")

  public List<String> getValidationErrors() {
    return validationErrors;
  }


  public void setValidationErrors(List<String> validationErrors) {
    this.validationErrors = validationErrors;
  }


  public ProcessorDTO extensionMissing(Boolean extensionMissing) {
    
    this.extensionMissing = extensionMissing;
    return this;
  }

   /**
   * Whether the underlying extension is missing.
   * @return extensionMissing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the underlying extension is missing.")

  public Boolean getExtensionMissing() {
    return extensionMissing;
  }


  public void setExtensionMissing(Boolean extensionMissing) {
    this.extensionMissing = extensionMissing;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessorDTO processorDTO = (ProcessorDTO) o;
    return Objects.equals(this.id, processorDTO.id) &&
        Objects.equals(this.versionedComponentId, processorDTO.versionedComponentId) &&
        Objects.equals(this.parentGroupId, processorDTO.parentGroupId) &&
        Objects.equals(this.position, processorDTO.position) &&
        Objects.equals(this.name, processorDTO.name) &&
        Objects.equals(this.type, processorDTO.type) &&
        Objects.equals(this.bundle, processorDTO.bundle) &&
        Objects.equals(this.state, processorDTO.state) &&
        Objects.equals(this.style, processorDTO.style) &&
        Objects.equals(this.relationships, processorDTO.relationships) &&
        Objects.equals(this.description, processorDTO.description) &&
        Objects.equals(this.supportsParallelProcessing, processorDTO.supportsParallelProcessing) &&
        Objects.equals(this.supportsEventDriven, processorDTO.supportsEventDriven) &&
        Objects.equals(this.supportsBatching, processorDTO.supportsBatching) &&
        Objects.equals(this.persistsState, processorDTO.persistsState) &&
        Objects.equals(this.restricted, processorDTO.restricted) &&
        Objects.equals(this.deprecated, processorDTO.deprecated) &&
        Objects.equals(this.multipleVersionsAvailable, processorDTO.multipleVersionsAvailable) &&
        Objects.equals(this.inputRequirement, processorDTO.inputRequirement) &&
        Objects.equals(this.config, processorDTO.config) &&
        Objects.equals(this.validationErrors, processorDTO.validationErrors) &&
        Objects.equals(this.extensionMissing, processorDTO.extensionMissing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, versionedComponentId, parentGroupId, position, name, type, bundle, state, style, relationships, description, supportsParallelProcessing, supportsEventDriven, supportsBatching, persistsState, restricted, deprecated, multipleVersionsAvailable, inputRequirement, config, validationErrors, extensionMissing);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessorDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    versionedComponentId: ").append(toIndentedString(versionedComponentId)).append("\n");
    sb.append("    parentGroupId: ").append(toIndentedString(parentGroupId)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    bundle: ").append(toIndentedString(bundle)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    relationships: ").append(toIndentedString(relationships)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    supportsParallelProcessing: ").append(toIndentedString(supportsParallelProcessing)).append("\n");
    sb.append("    supportsEventDriven: ").append(toIndentedString(supportsEventDriven)).append("\n");
    sb.append("    supportsBatching: ").append(toIndentedString(supportsBatching)).append("\n");
    sb.append("    persistsState: ").append(toIndentedString(persistsState)).append("\n");
    sb.append("    restricted: ").append(toIndentedString(restricted)).append("\n");
    sb.append("    deprecated: ").append(toIndentedString(deprecated)).append("\n");
    sb.append("    multipleVersionsAvailable: ").append(toIndentedString(multipleVersionsAvailable)).append("\n");
    sb.append("    inputRequirement: ").append(toIndentedString(inputRequirement)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
    sb.append("    extensionMissing: ").append(toIndentedString(extensionMissing)).append("\n");
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


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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openapitools.client.model.BundleDTO;
import org.openapitools.client.model.ControllerServiceApiDTO;
import org.openapitools.client.model.ControllerServiceReferencingComponentEntity;
import org.openapitools.client.model.PositionDTO;
import org.openapitools.client.model.PropertyDescriptorDTO;

/**
 * ControllerServiceDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-19T16:10:34.866069300-08:00[America/Los_Angeles]")
public class ControllerServiceDTO {
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

  public static final String SERIALIZED_NAME_CONTROLLER_SERVICE_APIS = "controllerServiceApis";
  @SerializedName(SERIALIZED_NAME_CONTROLLER_SERVICE_APIS)
  private List<ControllerServiceApiDTO> controllerServiceApis = null;

  public static final String SERIALIZED_NAME_COMMENTS = "comments";
  @SerializedName(SERIALIZED_NAME_COMMENTS)
  private String comments;

  /**
   * The state of the controller service.
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    ENABLED("ENABLED"),
    
    ENABLING("ENABLING"),
    
    DISABLED("DISABLED"),
    
    DISABLING("DISABLING");

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

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, String> properties = null;

  public static final String SERIALIZED_NAME_DESCRIPTORS = "descriptors";
  @SerializedName(SERIALIZED_NAME_DESCRIPTORS)
  private Map<String, PropertyDescriptorDTO> descriptors = null;

  public static final String SERIALIZED_NAME_CUSTOM_UI_URL = "customUiUrl";
  @SerializedName(SERIALIZED_NAME_CUSTOM_UI_URL)
  private String customUiUrl;

  public static final String SERIALIZED_NAME_ANNOTATION_DATA = "annotationData";
  @SerializedName(SERIALIZED_NAME_ANNOTATION_DATA)
  private String annotationData;

  public static final String SERIALIZED_NAME_REFERENCING_COMPONENTS = "referencingComponents";
  @SerializedName(SERIALIZED_NAME_REFERENCING_COMPONENTS)
  private Set<ControllerServiceReferencingComponentEntity> referencingComponents = null;

  public static final String SERIALIZED_NAME_VALIDATION_ERRORS = "validationErrors";
  @SerializedName(SERIALIZED_NAME_VALIDATION_ERRORS)
  private List<String> validationErrors = null;

  public static final String SERIALIZED_NAME_EXTENSION_MISSING = "extensionMissing";
  @SerializedName(SERIALIZED_NAME_EXTENSION_MISSING)
  private Boolean extensionMissing;


  public ControllerServiceDTO id(String id) {
    
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


  public ControllerServiceDTO versionedComponentId(String versionedComponentId) {
    
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


  public ControllerServiceDTO parentGroupId(String parentGroupId) {
    
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


  public ControllerServiceDTO position(PositionDTO position) {
    
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


  public ControllerServiceDTO name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the controller service.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the controller service.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ControllerServiceDTO type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the controller service.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of the controller service.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public ControllerServiceDTO bundle(BundleDTO bundle) {
    
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


  public ControllerServiceDTO controllerServiceApis(List<ControllerServiceApiDTO> controllerServiceApis) {
    
    this.controllerServiceApis = controllerServiceApis;
    return this;
  }

  public ControllerServiceDTO addControllerServiceApisItem(ControllerServiceApiDTO controllerServiceApisItem) {
    if (this.controllerServiceApis == null) {
      this.controllerServiceApis = new ArrayList<ControllerServiceApiDTO>();
    }
    this.controllerServiceApis.add(controllerServiceApisItem);
    return this;
  }

   /**
   * Lists the APIs this Controller Service implements.
   * @return controllerServiceApis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Lists the APIs this Controller Service implements.")

  public List<ControllerServiceApiDTO> getControllerServiceApis() {
    return controllerServiceApis;
  }


  public void setControllerServiceApis(List<ControllerServiceApiDTO> controllerServiceApis) {
    this.controllerServiceApis = controllerServiceApis;
  }


  public ControllerServiceDTO comments(String comments) {
    
    this.comments = comments;
    return this;
  }

   /**
   * The comments for the controller service.
   * @return comments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The comments for the controller service.")

  public String getComments() {
    return comments;
  }


  public void setComments(String comments) {
    this.comments = comments;
  }


  public ControllerServiceDTO state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * The state of the controller service.
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The state of the controller service.")

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    this.state = state;
  }


  public ControllerServiceDTO persistsState(Boolean persistsState) {
    
    this.persistsState = persistsState;
    return this;
  }

   /**
   * Whether the controller service persists state.
   * @return persistsState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the controller service persists state.")

  public Boolean getPersistsState() {
    return persistsState;
  }


  public void setPersistsState(Boolean persistsState) {
    this.persistsState = persistsState;
  }


  public ControllerServiceDTO restricted(Boolean restricted) {
    
    this.restricted = restricted;
    return this;
  }

   /**
   * Whether the controller service requires elevated privileges.
   * @return restricted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the controller service requires elevated privileges.")

  public Boolean getRestricted() {
    return restricted;
  }


  public void setRestricted(Boolean restricted) {
    this.restricted = restricted;
  }


  public ControllerServiceDTO deprecated(Boolean deprecated) {
    
    this.deprecated = deprecated;
    return this;
  }

   /**
   * Whether the ontroller service has been deprecated.
   * @return deprecated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the ontroller service has been deprecated.")

  public Boolean getDeprecated() {
    return deprecated;
  }


  public void setDeprecated(Boolean deprecated) {
    this.deprecated = deprecated;
  }


  public ControllerServiceDTO multipleVersionsAvailable(Boolean multipleVersionsAvailable) {
    
    this.multipleVersionsAvailable = multipleVersionsAvailable;
    return this;
  }

   /**
   * Whether the controller service has multiple versions available.
   * @return multipleVersionsAvailable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the controller service has multiple versions available.")

  public Boolean getMultipleVersionsAvailable() {
    return multipleVersionsAvailable;
  }


  public void setMultipleVersionsAvailable(Boolean multipleVersionsAvailable) {
    this.multipleVersionsAvailable = multipleVersionsAvailable;
  }


  public ControllerServiceDTO properties(Map<String, String> properties) {
    
    this.properties = properties;
    return this;
  }

  public ControllerServiceDTO putPropertiesItem(String key, String propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<String, String>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * The properties of the controller service.
   * @return properties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The properties of the controller service.")

  public Map<String, String> getProperties() {
    return properties;
  }


  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }


  public ControllerServiceDTO descriptors(Map<String, PropertyDescriptorDTO> descriptors) {
    
    this.descriptors = descriptors;
    return this;
  }

  public ControllerServiceDTO putDescriptorsItem(String key, PropertyDescriptorDTO descriptorsItem) {
    if (this.descriptors == null) {
      this.descriptors = new HashMap<String, PropertyDescriptorDTO>();
    }
    this.descriptors.put(key, descriptorsItem);
    return this;
  }

   /**
   * The descriptors for the controller service properties.
   * @return descriptors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The descriptors for the controller service properties.")

  public Map<String, PropertyDescriptorDTO> getDescriptors() {
    return descriptors;
  }


  public void setDescriptors(Map<String, PropertyDescriptorDTO> descriptors) {
    this.descriptors = descriptors;
  }


  public ControllerServiceDTO customUiUrl(String customUiUrl) {
    
    this.customUiUrl = customUiUrl;
    return this;
  }

   /**
   * The URL for the controller services custom configuration UI if applicable.
   * @return customUiUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL for the controller services custom configuration UI if applicable.")

  public String getCustomUiUrl() {
    return customUiUrl;
  }


  public void setCustomUiUrl(String customUiUrl) {
    this.customUiUrl = customUiUrl;
  }


  public ControllerServiceDTO annotationData(String annotationData) {
    
    this.annotationData = annotationData;
    return this;
  }

   /**
   * The annotation for the controller service. This is how the custom UI relays configuration to the controller service.
   * @return annotationData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The annotation for the controller service. This is how the custom UI relays configuration to the controller service.")

  public String getAnnotationData() {
    return annotationData;
  }


  public void setAnnotationData(String annotationData) {
    this.annotationData = annotationData;
  }


  public ControllerServiceDTO referencingComponents(Set<ControllerServiceReferencingComponentEntity> referencingComponents) {
    
    this.referencingComponents = referencingComponents;
    return this;
  }

  public ControllerServiceDTO addReferencingComponentsItem(ControllerServiceReferencingComponentEntity referencingComponentsItem) {
    if (this.referencingComponents == null) {
      this.referencingComponents = new LinkedHashSet<ControllerServiceReferencingComponentEntity>();
    }
    this.referencingComponents.add(referencingComponentsItem);
    return this;
  }

   /**
   * All components referencing this controller service.
   * @return referencingComponents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "All components referencing this controller service.")

  public Set<ControllerServiceReferencingComponentEntity> getReferencingComponents() {
    return referencingComponents;
  }


  public void setReferencingComponents(Set<ControllerServiceReferencingComponentEntity> referencingComponents) {
    this.referencingComponents = referencingComponents;
  }


  public ControllerServiceDTO validationErrors(List<String> validationErrors) {
    
    this.validationErrors = validationErrors;
    return this;
  }

  public ControllerServiceDTO addValidationErrorsItem(String validationErrorsItem) {
    if (this.validationErrors == null) {
      this.validationErrors = new ArrayList<String>();
    }
    this.validationErrors.add(validationErrorsItem);
    return this;
  }

   /**
   * The validation errors from the controller service. These validation errors represent the problems with the controller service that must be resolved before it can be enabled.
   * @return validationErrors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The validation errors from the controller service. These validation errors represent the problems with the controller service that must be resolved before it can be enabled.")

  public List<String> getValidationErrors() {
    return validationErrors;
  }


  public void setValidationErrors(List<String> validationErrors) {
    this.validationErrors = validationErrors;
  }


  public ControllerServiceDTO extensionMissing(Boolean extensionMissing) {
    
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
    ControllerServiceDTO controllerServiceDTO = (ControllerServiceDTO) o;
    return Objects.equals(this.id, controllerServiceDTO.id) &&
        Objects.equals(this.versionedComponentId, controllerServiceDTO.versionedComponentId) &&
        Objects.equals(this.parentGroupId, controllerServiceDTO.parentGroupId) &&
        Objects.equals(this.position, controllerServiceDTO.position) &&
        Objects.equals(this.name, controllerServiceDTO.name) &&
        Objects.equals(this.type, controllerServiceDTO.type) &&
        Objects.equals(this.bundle, controllerServiceDTO.bundle) &&
        Objects.equals(this.controllerServiceApis, controllerServiceDTO.controllerServiceApis) &&
        Objects.equals(this.comments, controllerServiceDTO.comments) &&
        Objects.equals(this.state, controllerServiceDTO.state) &&
        Objects.equals(this.persistsState, controllerServiceDTO.persistsState) &&
        Objects.equals(this.restricted, controllerServiceDTO.restricted) &&
        Objects.equals(this.deprecated, controllerServiceDTO.deprecated) &&
        Objects.equals(this.multipleVersionsAvailable, controllerServiceDTO.multipleVersionsAvailable) &&
        Objects.equals(this.properties, controllerServiceDTO.properties) &&
        Objects.equals(this.descriptors, controllerServiceDTO.descriptors) &&
        Objects.equals(this.customUiUrl, controllerServiceDTO.customUiUrl) &&
        Objects.equals(this.annotationData, controllerServiceDTO.annotationData) &&
        Objects.equals(this.referencingComponents, controllerServiceDTO.referencingComponents) &&
        Objects.equals(this.validationErrors, controllerServiceDTO.validationErrors) &&
        Objects.equals(this.extensionMissing, controllerServiceDTO.extensionMissing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, versionedComponentId, parentGroupId, position, name, type, bundle, controllerServiceApis, comments, state, persistsState, restricted, deprecated, multipleVersionsAvailable, properties, descriptors, customUiUrl, annotationData, referencingComponents, validationErrors, extensionMissing);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControllerServiceDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    versionedComponentId: ").append(toIndentedString(versionedComponentId)).append("\n");
    sb.append("    parentGroupId: ").append(toIndentedString(parentGroupId)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    bundle: ").append(toIndentedString(bundle)).append("\n");
    sb.append("    controllerServiceApis: ").append(toIndentedString(controllerServiceApis)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    persistsState: ").append(toIndentedString(persistsState)).append("\n");
    sb.append("    restricted: ").append(toIndentedString(restricted)).append("\n");
    sb.append("    deprecated: ").append(toIndentedString(deprecated)).append("\n");
    sb.append("    multipleVersionsAvailable: ").append(toIndentedString(multipleVersionsAvailable)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    descriptors: ").append(toIndentedString(descriptors)).append("\n");
    sb.append("    customUiUrl: ").append(toIndentedString(customUiUrl)).append("\n");
    sb.append("    annotationData: ").append(toIndentedString(annotationData)).append("\n");
    sb.append("    referencingComponents: ").append(toIndentedString(referencingComponents)).append("\n");
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


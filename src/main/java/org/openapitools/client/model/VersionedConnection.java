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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openapitools.client.model.ConnectableComponent;
import org.openapitools.client.model.ThePositionOfAComponentOnTheGraph;

/**
 * VersionedConnection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-19T16:10:34.866069300-08:00[America/Los_Angeles]")
public class VersionedConnection {
  public static final String SERIALIZED_NAME_IDENTIFIER = "identifier";
  @SerializedName(SERIALIZED_NAME_IDENTIFIER)
  private String identifier;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_COMMENTS = "comments";
  @SerializedName(SERIALIZED_NAME_COMMENTS)
  private String comments;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private ThePositionOfAComponentOnTheGraph position;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private ConnectableComponent source;

  public static final String SERIALIZED_NAME_DESTINATION = "destination";
  @SerializedName(SERIALIZED_NAME_DESTINATION)
  private ConnectableComponent destination;

  public static final String SERIALIZED_NAME_LABEL_INDEX = "labelIndex";
  @SerializedName(SERIALIZED_NAME_LABEL_INDEX)
  private Integer labelIndex;

  public static final String SERIALIZED_NAME_GETZ_INDEX = "getzIndex";
  @SerializedName(SERIALIZED_NAME_GETZ_INDEX)
  private Long getzIndex;

  public static final String SERIALIZED_NAME_SELECTED_RELATIONSHIPS = "selectedRelationships";
  @SerializedName(SERIALIZED_NAME_SELECTED_RELATIONSHIPS)
  private Set<String> selectedRelationships = null;

  public static final String SERIALIZED_NAME_BACK_PRESSURE_OBJECT_THRESHOLD = "backPressureObjectThreshold";
  @SerializedName(SERIALIZED_NAME_BACK_PRESSURE_OBJECT_THRESHOLD)
  private Long backPressureObjectThreshold;

  public static final String SERIALIZED_NAME_BACK_PRESSURE_DATA_SIZE_THRESHOLD = "backPressureDataSizeThreshold";
  @SerializedName(SERIALIZED_NAME_BACK_PRESSURE_DATA_SIZE_THRESHOLD)
  private String backPressureDataSizeThreshold;

  public static final String SERIALIZED_NAME_FLOW_FILE_EXPIRATION = "flowFileExpiration";
  @SerializedName(SERIALIZED_NAME_FLOW_FILE_EXPIRATION)
  private String flowFileExpiration;

  public static final String SERIALIZED_NAME_PRIORITIZERS = "prioritizers";
  @SerializedName(SERIALIZED_NAME_PRIORITIZERS)
  private List<String> prioritizers = null;

  public static final String SERIALIZED_NAME_BENDS = "bends";
  @SerializedName(SERIALIZED_NAME_BENDS)
  private List<ThePositionOfAComponentOnTheGraph> bends = null;

  /**
   * Gets or Sets componentType
   */
  @JsonAdapter(ComponentTypeEnum.Adapter.class)
  public enum ComponentTypeEnum {
    CONNECTION("CONNECTION"),
    
    PROCESSOR("PROCESSOR"),
    
    PROCESS_GROUP("PROCESS_GROUP"),
    
    REMOTE_PROCESS_GROUP("REMOTE_PROCESS_GROUP"),
    
    INPUT_PORT("INPUT_PORT"),
    
    OUTPUT_PORT("OUTPUT_PORT"),
    
    REMOTE_INPUT_PORT("REMOTE_INPUT_PORT"),
    
    REMOTE_OUTPUT_PORT("REMOTE_OUTPUT_PORT"),
    
    FUNNEL("FUNNEL"),
    
    LABEL("LABEL"),
    
    CONTROLLER_SERVICE("CONTROLLER_SERVICE");

    private String value;

    ComponentTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ComponentTypeEnum fromValue(String value) {
      for (ComponentTypeEnum b : ComponentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ComponentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ComponentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ComponentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ComponentTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_COMPONENT_TYPE = "componentType";
  @SerializedName(SERIALIZED_NAME_COMPONENT_TYPE)
  private ComponentTypeEnum componentType;

  public static final String SERIALIZED_NAME_GROUP_IDENTIFIER = "groupIdentifier";
  @SerializedName(SERIALIZED_NAME_GROUP_IDENTIFIER)
  private String groupIdentifier;


  public VersionedConnection identifier(String identifier) {
    
    this.identifier = identifier;
    return this;
  }

   /**
   * The component&#39;s unique identifier
   * @return identifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The component's unique identifier")

  public String getIdentifier() {
    return identifier;
  }


  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }


  public VersionedConnection name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The component&#39;s name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The component's name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public VersionedConnection comments(String comments) {
    
    this.comments = comments;
    return this;
  }

   /**
   * The user-supplied comments for the component
   * @return comments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user-supplied comments for the component")

  public String getComments() {
    return comments;
  }


  public void setComments(String comments) {
    this.comments = comments;
  }


  public VersionedConnection position(ThePositionOfAComponentOnTheGraph position) {
    
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ThePositionOfAComponentOnTheGraph getPosition() {
    return position;
  }


  public void setPosition(ThePositionOfAComponentOnTheGraph position) {
    this.position = position;
  }


  public VersionedConnection source(ConnectableComponent source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConnectableComponent getSource() {
    return source;
  }


  public void setSource(ConnectableComponent source) {
    this.source = source;
  }


  public VersionedConnection destination(ConnectableComponent destination) {
    
    this.destination = destination;
    return this;
  }

   /**
   * Get destination
   * @return destination
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConnectableComponent getDestination() {
    return destination;
  }


  public void setDestination(ConnectableComponent destination) {
    this.destination = destination;
  }


  public VersionedConnection labelIndex(Integer labelIndex) {
    
    this.labelIndex = labelIndex;
    return this;
  }

   /**
   * The index of the bend point where to place the connection label.
   * @return labelIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The index of the bend point where to place the connection label.")

  public Integer getLabelIndex() {
    return labelIndex;
  }


  public void setLabelIndex(Integer labelIndex) {
    this.labelIndex = labelIndex;
  }


  public VersionedConnection getzIndex(Long getzIndex) {
    
    this.getzIndex = getzIndex;
    return this;
  }

   /**
   * The z index of the connection.
   * @return getzIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The z index of the connection.")

  public Long getGetzIndex() {
    return getzIndex;
  }


  public void setGetzIndex(Long getzIndex) {
    this.getzIndex = getzIndex;
  }


  public VersionedConnection selectedRelationships(Set<String> selectedRelationships) {
    
    this.selectedRelationships = selectedRelationships;
    return this;
  }

  public VersionedConnection addSelectedRelationshipsItem(String selectedRelationshipsItem) {
    if (this.selectedRelationships == null) {
      this.selectedRelationships = new LinkedHashSet<String>();
    }
    this.selectedRelationships.add(selectedRelationshipsItem);
    return this;
  }

   /**
   * The selected relationship that comprise the connection.
   * @return selectedRelationships
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The selected relationship that comprise the connection.")

  public Set<String> getSelectedRelationships() {
    return selectedRelationships;
  }


  public void setSelectedRelationships(Set<String> selectedRelationships) {
    this.selectedRelationships = selectedRelationships;
  }


  public VersionedConnection backPressureObjectThreshold(Long backPressureObjectThreshold) {
    
    this.backPressureObjectThreshold = backPressureObjectThreshold;
    return this;
  }

   /**
   * The object count threshold for determining when back pressure is applied. Updating this value is a passive change in the sense that it won&#39;t impact whether existing files over the limit are affected but it does help feeder processors to stop pushing too much into this work queue.
   * @return backPressureObjectThreshold
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The object count threshold for determining when back pressure is applied. Updating this value is a passive change in the sense that it won't impact whether existing files over the limit are affected but it does help feeder processors to stop pushing too much into this work queue.")

  public Long getBackPressureObjectThreshold() {
    return backPressureObjectThreshold;
  }


  public void setBackPressureObjectThreshold(Long backPressureObjectThreshold) {
    this.backPressureObjectThreshold = backPressureObjectThreshold;
  }


  public VersionedConnection backPressureDataSizeThreshold(String backPressureDataSizeThreshold) {
    
    this.backPressureDataSizeThreshold = backPressureDataSizeThreshold;
    return this;
  }

   /**
   * The object data size threshold for determining when back pressure is applied. Updating this value is a passive change in the sense that it won&#39;t impact whether existing files over the limit are affected but it does help feeder processors to stop pushing too much into this work queue.
   * @return backPressureDataSizeThreshold
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The object data size threshold for determining when back pressure is applied. Updating this value is a passive change in the sense that it won't impact whether existing files over the limit are affected but it does help feeder processors to stop pushing too much into this work queue.")

  public String getBackPressureDataSizeThreshold() {
    return backPressureDataSizeThreshold;
  }


  public void setBackPressureDataSizeThreshold(String backPressureDataSizeThreshold) {
    this.backPressureDataSizeThreshold = backPressureDataSizeThreshold;
  }


  public VersionedConnection flowFileExpiration(String flowFileExpiration) {
    
    this.flowFileExpiration = flowFileExpiration;
    return this;
  }

   /**
   * The amount of time a flow file may be in the flow before it will be automatically aged out of the flow. Once a flow file reaches this age it will be terminated from the flow the next time a processor attempts to start work on it.
   * @return flowFileExpiration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The amount of time a flow file may be in the flow before it will be automatically aged out of the flow. Once a flow file reaches this age it will be terminated from the flow the next time a processor attempts to start work on it.")

  public String getFlowFileExpiration() {
    return flowFileExpiration;
  }


  public void setFlowFileExpiration(String flowFileExpiration) {
    this.flowFileExpiration = flowFileExpiration;
  }


  public VersionedConnection prioritizers(List<String> prioritizers) {
    
    this.prioritizers = prioritizers;
    return this;
  }

  public VersionedConnection addPrioritizersItem(String prioritizersItem) {
    if (this.prioritizers == null) {
      this.prioritizers = new ArrayList<String>();
    }
    this.prioritizers.add(prioritizersItem);
    return this;
  }

   /**
   * The comparators used to prioritize the queue.
   * @return prioritizers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The comparators used to prioritize the queue.")

  public List<String> getPrioritizers() {
    return prioritizers;
  }


  public void setPrioritizers(List<String> prioritizers) {
    this.prioritizers = prioritizers;
  }


  public VersionedConnection bends(List<ThePositionOfAComponentOnTheGraph> bends) {
    
    this.bends = bends;
    return this;
  }

  public VersionedConnection addBendsItem(ThePositionOfAComponentOnTheGraph bendsItem) {
    if (this.bends == null) {
      this.bends = new ArrayList<ThePositionOfAComponentOnTheGraph>();
    }
    this.bends.add(bendsItem);
    return this;
  }

   /**
   * The bend points on the connection.
   * @return bends
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The bend points on the connection.")

  public List<ThePositionOfAComponentOnTheGraph> getBends() {
    return bends;
  }


  public void setBends(List<ThePositionOfAComponentOnTheGraph> bends) {
    this.bends = bends;
  }


  public VersionedConnection componentType(ComponentTypeEnum componentType) {
    
    this.componentType = componentType;
    return this;
  }

   /**
   * Get componentType
   * @return componentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComponentTypeEnum getComponentType() {
    return componentType;
  }


  public void setComponentType(ComponentTypeEnum componentType) {
    this.componentType = componentType;
  }


  public VersionedConnection groupIdentifier(String groupIdentifier) {
    
    this.groupIdentifier = groupIdentifier;
    return this;
  }

   /**
   * The ID of the Process Group that this component belongs to
   * @return groupIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the Process Group that this component belongs to")

  public String getGroupIdentifier() {
    return groupIdentifier;
  }


  public void setGroupIdentifier(String groupIdentifier) {
    this.groupIdentifier = groupIdentifier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionedConnection versionedConnection = (VersionedConnection) o;
    return Objects.equals(this.identifier, versionedConnection.identifier) &&
        Objects.equals(this.name, versionedConnection.name) &&
        Objects.equals(this.comments, versionedConnection.comments) &&
        Objects.equals(this.position, versionedConnection.position) &&
        Objects.equals(this.source, versionedConnection.source) &&
        Objects.equals(this.destination, versionedConnection.destination) &&
        Objects.equals(this.labelIndex, versionedConnection.labelIndex) &&
        Objects.equals(this.getzIndex, versionedConnection.getzIndex) &&
        Objects.equals(this.selectedRelationships, versionedConnection.selectedRelationships) &&
        Objects.equals(this.backPressureObjectThreshold, versionedConnection.backPressureObjectThreshold) &&
        Objects.equals(this.backPressureDataSizeThreshold, versionedConnection.backPressureDataSizeThreshold) &&
        Objects.equals(this.flowFileExpiration, versionedConnection.flowFileExpiration) &&
        Objects.equals(this.prioritizers, versionedConnection.prioritizers) &&
        Objects.equals(this.bends, versionedConnection.bends) &&
        Objects.equals(this.componentType, versionedConnection.componentType) &&
        Objects.equals(this.groupIdentifier, versionedConnection.groupIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, name, comments, position, source, destination, labelIndex, getzIndex, selectedRelationships, backPressureObjectThreshold, backPressureDataSizeThreshold, flowFileExpiration, prioritizers, bends, componentType, groupIdentifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionedConnection {\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    labelIndex: ").append(toIndentedString(labelIndex)).append("\n");
    sb.append("    getzIndex: ").append(toIndentedString(getzIndex)).append("\n");
    sb.append("    selectedRelationships: ").append(toIndentedString(selectedRelationships)).append("\n");
    sb.append("    backPressureObjectThreshold: ").append(toIndentedString(backPressureObjectThreshold)).append("\n");
    sb.append("    backPressureDataSizeThreshold: ").append(toIndentedString(backPressureDataSizeThreshold)).append("\n");
    sb.append("    flowFileExpiration: ").append(toIndentedString(flowFileExpiration)).append("\n");
    sb.append("    prioritizers: ").append(toIndentedString(prioritizers)).append("\n");
    sb.append("    bends: ").append(toIndentedString(bends)).append("\n");
    sb.append("    componentType: ").append(toIndentedString(componentType)).append("\n");
    sb.append("    groupIdentifier: ").append(toIndentedString(groupIdentifier)).append("\n");
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


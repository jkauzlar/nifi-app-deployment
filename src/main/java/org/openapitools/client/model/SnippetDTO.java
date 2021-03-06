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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.RevisionDTO;

/**
 * SnippetDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-19T16:10:34.866069300-08:00[America/Los_Angeles]")
public class SnippetDTO {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_URI = "uri";
  @SerializedName(SERIALIZED_NAME_URI)
  private String uri;

  public static final String SERIALIZED_NAME_PARENT_GROUP_ID = "parentGroupId";
  @SerializedName(SERIALIZED_NAME_PARENT_GROUP_ID)
  private String parentGroupId;

  public static final String SERIALIZED_NAME_PROCESS_GROUPS = "processGroups";
  @SerializedName(SERIALIZED_NAME_PROCESS_GROUPS)
  private Map<String, RevisionDTO> processGroups = null;

  public static final String SERIALIZED_NAME_REMOTE_PROCESS_GROUPS = "remoteProcessGroups";
  @SerializedName(SERIALIZED_NAME_REMOTE_PROCESS_GROUPS)
  private Map<String, RevisionDTO> remoteProcessGroups = null;

  public static final String SERIALIZED_NAME_PROCESSORS = "processors";
  @SerializedName(SERIALIZED_NAME_PROCESSORS)
  private Map<String, RevisionDTO> processors = null;

  public static final String SERIALIZED_NAME_INPUT_PORTS = "inputPorts";
  @SerializedName(SERIALIZED_NAME_INPUT_PORTS)
  private Map<String, RevisionDTO> inputPorts = null;

  public static final String SERIALIZED_NAME_OUTPUT_PORTS = "outputPorts";
  @SerializedName(SERIALIZED_NAME_OUTPUT_PORTS)
  private Map<String, RevisionDTO> outputPorts = null;

  public static final String SERIALIZED_NAME_CONNECTIONS = "connections";
  @SerializedName(SERIALIZED_NAME_CONNECTIONS)
  private Map<String, RevisionDTO> connections = null;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, RevisionDTO> labels = null;

  public static final String SERIALIZED_NAME_FUNNELS = "funnels";
  @SerializedName(SERIALIZED_NAME_FUNNELS)
  private Map<String, RevisionDTO> funnels = null;


  public SnippetDTO id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The id of the snippet.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the snippet.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public SnippetDTO uri(String uri) {
    
    this.uri = uri;
    return this;
  }

   /**
   * The URI of the snippet.
   * @return uri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URI of the snippet.")

  public String getUri() {
    return uri;
  }


  public void setUri(String uri) {
    this.uri = uri;
  }


  public SnippetDTO parentGroupId(String parentGroupId) {
    
    this.parentGroupId = parentGroupId;
    return this;
  }

   /**
   * The group id for the components in the snippet.
   * @return parentGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The group id for the components in the snippet.")

  public String getParentGroupId() {
    return parentGroupId;
  }


  public void setParentGroupId(String parentGroupId) {
    this.parentGroupId = parentGroupId;
  }


  public SnippetDTO processGroups(Map<String, RevisionDTO> processGroups) {
    
    this.processGroups = processGroups;
    return this;
  }

  public SnippetDTO putProcessGroupsItem(String key, RevisionDTO processGroupsItem) {
    if (this.processGroups == null) {
      this.processGroups = new HashMap<String, RevisionDTO>();
    }
    this.processGroups.put(key, processGroupsItem);
    return this;
  }

   /**
   * The ids of the process groups in this snippet. These ids will be populated within each response. They can be specified when creating a snippet. However, once a snippet has been created its contents cannot be modified (these ids are ignored during update requests).
   * @return processGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ids of the process groups in this snippet. These ids will be populated within each response. They can be specified when creating a snippet. However, once a snippet has been created its contents cannot be modified (these ids are ignored during update requests).")

  public Map<String, RevisionDTO> getProcessGroups() {
    return processGroups;
  }


  public void setProcessGroups(Map<String, RevisionDTO> processGroups) {
    this.processGroups = processGroups;
  }


  public SnippetDTO remoteProcessGroups(Map<String, RevisionDTO> remoteProcessGroups) {
    
    this.remoteProcessGroups = remoteProcessGroups;
    return this;
  }

  public SnippetDTO putRemoteProcessGroupsItem(String key, RevisionDTO remoteProcessGroupsItem) {
    if (this.remoteProcessGroups == null) {
      this.remoteProcessGroups = new HashMap<String, RevisionDTO>();
    }
    this.remoteProcessGroups.put(key, remoteProcessGroupsItem);
    return this;
  }

   /**
   * The ids of the remote process groups in this snippet. These ids will be populated within each response. They can be specified when creating a snippet. However, once a snippet has been created its contents cannot be modified (these ids are ignored during update requests).
   * @return remoteProcessGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ids of the remote process groups in this snippet. These ids will be populated within each response. They can be specified when creating a snippet. However, once a snippet has been created its contents cannot be modified (these ids are ignored during update requests).")

  public Map<String, RevisionDTO> getRemoteProcessGroups() {
    return remoteProcessGroups;
  }


  public void setRemoteProcessGroups(Map<String, RevisionDTO> remoteProcessGroups) {
    this.remoteProcessGroups = remoteProcessGroups;
  }


  public SnippetDTO processors(Map<String, RevisionDTO> processors) {
    
    this.processors = processors;
    return this;
  }

  public SnippetDTO putProcessorsItem(String key, RevisionDTO processorsItem) {
    if (this.processors == null) {
      this.processors = new HashMap<String, RevisionDTO>();
    }
    this.processors.put(key, processorsItem);
    return this;
  }

   /**
   * The ids of the processors in this snippet. These ids will be populated within each response. They can be specified when creating a snippet. However, once a snippet has been created its contents cannot be modified (these ids are ignored during update requests).
   * @return processors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ids of the processors in this snippet. These ids will be populated within each response. They can be specified when creating a snippet. However, once a snippet has been created its contents cannot be modified (these ids are ignored during update requests).")

  public Map<String, RevisionDTO> getProcessors() {
    return processors;
  }


  public void setProcessors(Map<String, RevisionDTO> processors) {
    this.processors = processors;
  }


  public SnippetDTO inputPorts(Map<String, RevisionDTO> inputPorts) {
    
    this.inputPorts = inputPorts;
    return this;
  }

  public SnippetDTO putInputPortsItem(String key, RevisionDTO inputPortsItem) {
    if (this.inputPorts == null) {
      this.inputPorts = new HashMap<String, RevisionDTO>();
    }
    this.inputPorts.put(key, inputPortsItem);
    return this;
  }

   /**
   * The ids of the input ports in this snippet. These ids will be populated within each response. They can be specified when creating a snippet. However, once a snippet has been created its contents cannot be modified (these ids are ignored during update requests).
   * @return inputPorts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ids of the input ports in this snippet. These ids will be populated within each response. They can be specified when creating a snippet. However, once a snippet has been created its contents cannot be modified (these ids are ignored during update requests).")

  public Map<String, RevisionDTO> getInputPorts() {
    return inputPorts;
  }


  public void setInputPorts(Map<String, RevisionDTO> inputPorts) {
    this.inputPorts = inputPorts;
  }


  public SnippetDTO outputPorts(Map<String, RevisionDTO> outputPorts) {
    
    this.outputPorts = outputPorts;
    return this;
  }

  public SnippetDTO putOutputPortsItem(String key, RevisionDTO outputPortsItem) {
    if (this.outputPorts == null) {
      this.outputPorts = new HashMap<String, RevisionDTO>();
    }
    this.outputPorts.put(key, outputPortsItem);
    return this;
  }

   /**
   * The ids of the output ports in this snippet. These ids will be populated within each response. They can be specified when creating a snippet. However, once a snippet has been created its contents cannot be modified (these ids are ignored during update requests).
   * @return outputPorts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ids of the output ports in this snippet. These ids will be populated within each response. They can be specified when creating a snippet. However, once a snippet has been created its contents cannot be modified (these ids are ignored during update requests).")

  public Map<String, RevisionDTO> getOutputPorts() {
    return outputPorts;
  }


  public void setOutputPorts(Map<String, RevisionDTO> outputPorts) {
    this.outputPorts = outputPorts;
  }


  public SnippetDTO connections(Map<String, RevisionDTO> connections) {
    
    this.connections = connections;
    return this;
  }

  public SnippetDTO putConnectionsItem(String key, RevisionDTO connectionsItem) {
    if (this.connections == null) {
      this.connections = new HashMap<String, RevisionDTO>();
    }
    this.connections.put(key, connectionsItem);
    return this;
  }

   /**
   * The ids of the connections in this snippet. These ids will be populated within each response. They can be specified when creating a snippet. However, once a snippet has been created its contents cannot be modified (these ids are ignored during update requests).
   * @return connections
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ids of the connections in this snippet. These ids will be populated within each response. They can be specified when creating a snippet. However, once a snippet has been created its contents cannot be modified (these ids are ignored during update requests).")

  public Map<String, RevisionDTO> getConnections() {
    return connections;
  }


  public void setConnections(Map<String, RevisionDTO> connections) {
    this.connections = connections;
  }


  public SnippetDTO labels(Map<String, RevisionDTO> labels) {
    
    this.labels = labels;
    return this;
  }

  public SnippetDTO putLabelsItem(String key, RevisionDTO labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<String, RevisionDTO>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * The ids of the labels in this snippet. These ids will be populated within each response. They can be specified when creating a snippet. However, once a snippet has been created its contents cannot be modified (these ids are ignored during update requests).
   * @return labels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ids of the labels in this snippet. These ids will be populated within each response. They can be specified when creating a snippet. However, once a snippet has been created its contents cannot be modified (these ids are ignored during update requests).")

  public Map<String, RevisionDTO> getLabels() {
    return labels;
  }


  public void setLabels(Map<String, RevisionDTO> labels) {
    this.labels = labels;
  }


  public SnippetDTO funnels(Map<String, RevisionDTO> funnels) {
    
    this.funnels = funnels;
    return this;
  }

  public SnippetDTO putFunnelsItem(String key, RevisionDTO funnelsItem) {
    if (this.funnels == null) {
      this.funnels = new HashMap<String, RevisionDTO>();
    }
    this.funnels.put(key, funnelsItem);
    return this;
  }

   /**
   * The ids of the funnels in this snippet. These ids will be populated within each response. They can be specified when creating a snippet. However, once a snippet has been created its contents cannot be modified (these ids are ignored during update requests).
   * @return funnels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ids of the funnels in this snippet. These ids will be populated within each response. They can be specified when creating a snippet. However, once a snippet has been created its contents cannot be modified (these ids are ignored during update requests).")

  public Map<String, RevisionDTO> getFunnels() {
    return funnels;
  }


  public void setFunnels(Map<String, RevisionDTO> funnels) {
    this.funnels = funnels;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnippetDTO snippetDTO = (SnippetDTO) o;
    return Objects.equals(this.id, snippetDTO.id) &&
        Objects.equals(this.uri, snippetDTO.uri) &&
        Objects.equals(this.parentGroupId, snippetDTO.parentGroupId) &&
        Objects.equals(this.processGroups, snippetDTO.processGroups) &&
        Objects.equals(this.remoteProcessGroups, snippetDTO.remoteProcessGroups) &&
        Objects.equals(this.processors, snippetDTO.processors) &&
        Objects.equals(this.inputPorts, snippetDTO.inputPorts) &&
        Objects.equals(this.outputPorts, snippetDTO.outputPorts) &&
        Objects.equals(this.connections, snippetDTO.connections) &&
        Objects.equals(this.labels, snippetDTO.labels) &&
        Objects.equals(this.funnels, snippetDTO.funnels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uri, parentGroupId, processGroups, remoteProcessGroups, processors, inputPorts, outputPorts, connections, labels, funnels);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnippetDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    parentGroupId: ").append(toIndentedString(parentGroupId)).append("\n");
    sb.append("    processGroups: ").append(toIndentedString(processGroups)).append("\n");
    sb.append("    remoteProcessGroups: ").append(toIndentedString(remoteProcessGroups)).append("\n");
    sb.append("    processors: ").append(toIndentedString(processors)).append("\n");
    sb.append("    inputPorts: ").append(toIndentedString(inputPorts)).append("\n");
    sb.append("    outputPorts: ").append(toIndentedString(outputPorts)).append("\n");
    sb.append("    connections: ").append(toIndentedString(connections)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    funnels: ").append(toIndentedString(funnels)).append("\n");
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


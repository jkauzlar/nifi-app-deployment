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
 * PeerDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-19T16:10:34.866069300-08:00[America/Los_Angeles]")
public class PeerDTO {
  public static final String SERIALIZED_NAME_HOSTNAME = "hostname";
  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  private String hostname;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public static final String SERIALIZED_NAME_SECURE = "secure";
  @SerializedName(SERIALIZED_NAME_SECURE)
  private Boolean secure;

  public static final String SERIALIZED_NAME_FLOW_FILE_COUNT = "flowFileCount";
  @SerializedName(SERIALIZED_NAME_FLOW_FILE_COUNT)
  private Integer flowFileCount;


  public PeerDTO hostname(String hostname) {
    
    this.hostname = hostname;
    return this;
  }

   /**
   * The hostname of this peer.
   * @return hostname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The hostname of this peer.")

  public String getHostname() {
    return hostname;
  }


  public void setHostname(String hostname) {
    this.hostname = hostname;
  }


  public PeerDTO port(Integer port) {
    
    this.port = port;
    return this;
  }

   /**
   * The port number of this peer.
   * @return port
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The port number of this peer.")

  public Integer getPort() {
    return port;
  }


  public void setPort(Integer port) {
    this.port = port;
  }


  public PeerDTO secure(Boolean secure) {
    
    this.secure = secure;
    return this;
  }

   /**
   * Returns if this peer connection is secure.
   * @return secure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Returns if this peer connection is secure.")

  public Boolean getSecure() {
    return secure;
  }


  public void setSecure(Boolean secure) {
    this.secure = secure;
  }


  public PeerDTO flowFileCount(Integer flowFileCount) {
    
    this.flowFileCount = flowFileCount;
    return this;
  }

   /**
   * The number of flowFiles this peer holds.
   * @return flowFileCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of flowFiles this peer holds.")

  public Integer getFlowFileCount() {
    return flowFileCount;
  }


  public void setFlowFileCount(Integer flowFileCount) {
    this.flowFileCount = flowFileCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PeerDTO peerDTO = (PeerDTO) o;
    return Objects.equals(this.hostname, peerDTO.hostname) &&
        Objects.equals(this.port, peerDTO.port) &&
        Objects.equals(this.secure, peerDTO.secure) &&
        Objects.equals(this.flowFileCount, peerDTO.flowFileCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostname, port, secure, flowFileCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeerDTO {\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    secure: ").append(toIndentedString(secure)).append("\n");
    sb.append("    flowFileCount: ").append(toIndentedString(flowFileCount)).append("\n");
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

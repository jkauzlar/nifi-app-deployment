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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openapitools.client.model.ReportingTaskEntity;

/**
 * ReportingTasksEntity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-19T16:10:34.866069300-08:00[America/Los_Angeles]")
public class ReportingTasksEntity {
  public static final String SERIALIZED_NAME_REPORTING_TASKS = "reportingTasks";
  @SerializedName(SERIALIZED_NAME_REPORTING_TASKS)
  private Set<ReportingTaskEntity> reportingTasks = null;


  public ReportingTasksEntity reportingTasks(Set<ReportingTaskEntity> reportingTasks) {
    
    this.reportingTasks = reportingTasks;
    return this;
  }

  public ReportingTasksEntity addReportingTasksItem(ReportingTaskEntity reportingTasksItem) {
    if (this.reportingTasks == null) {
      this.reportingTasks = new LinkedHashSet<ReportingTaskEntity>();
    }
    this.reportingTasks.add(reportingTasksItem);
    return this;
  }

   /**
   * Get reportingTasks
   * @return reportingTasks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<ReportingTaskEntity> getReportingTasks() {
    return reportingTasks;
  }


  public void setReportingTasks(Set<ReportingTaskEntity> reportingTasks) {
    this.reportingTasks = reportingTasks;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingTasksEntity reportingTasksEntity = (ReportingTasksEntity) o;
    return Objects.equals(this.reportingTasks, reportingTasksEntity.reportingTasks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportingTasks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingTasksEntity {\n");
    sb.append("    reportingTasks: ").append(toIndentedString(reportingTasks)).append("\n");
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


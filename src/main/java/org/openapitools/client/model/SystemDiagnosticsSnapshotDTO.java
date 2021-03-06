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
import org.openapitools.client.model.GarbageCollectionDTO;
import org.openapitools.client.model.StorageUsageDTO;
import org.openapitools.client.model.VersionInfoDTO;

/**
 * SystemDiagnosticsSnapshotDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-19T16:10:34.866069300-08:00[America/Los_Angeles]")
public class SystemDiagnosticsSnapshotDTO {
  public static final String SERIALIZED_NAME_TOTAL_NON_HEAP = "totalNonHeap";
  @SerializedName(SERIALIZED_NAME_TOTAL_NON_HEAP)
  private String totalNonHeap;

  public static final String SERIALIZED_NAME_TOTAL_NON_HEAP_BYTES = "totalNonHeapBytes";
  @SerializedName(SERIALIZED_NAME_TOTAL_NON_HEAP_BYTES)
  private Long totalNonHeapBytes;

  public static final String SERIALIZED_NAME_USED_NON_HEAP = "usedNonHeap";
  @SerializedName(SERIALIZED_NAME_USED_NON_HEAP)
  private String usedNonHeap;

  public static final String SERIALIZED_NAME_USED_NON_HEAP_BYTES = "usedNonHeapBytes";
  @SerializedName(SERIALIZED_NAME_USED_NON_HEAP_BYTES)
  private Long usedNonHeapBytes;

  public static final String SERIALIZED_NAME_FREE_NON_HEAP = "freeNonHeap";
  @SerializedName(SERIALIZED_NAME_FREE_NON_HEAP)
  private String freeNonHeap;

  public static final String SERIALIZED_NAME_FREE_NON_HEAP_BYTES = "freeNonHeapBytes";
  @SerializedName(SERIALIZED_NAME_FREE_NON_HEAP_BYTES)
  private Long freeNonHeapBytes;

  public static final String SERIALIZED_NAME_MAX_NON_HEAP = "maxNonHeap";
  @SerializedName(SERIALIZED_NAME_MAX_NON_HEAP)
  private String maxNonHeap;

  public static final String SERIALIZED_NAME_MAX_NON_HEAP_BYTES = "maxNonHeapBytes";
  @SerializedName(SERIALIZED_NAME_MAX_NON_HEAP_BYTES)
  private Long maxNonHeapBytes;

  public static final String SERIALIZED_NAME_NON_HEAP_UTILIZATION = "nonHeapUtilization";
  @SerializedName(SERIALIZED_NAME_NON_HEAP_UTILIZATION)
  private String nonHeapUtilization;

  public static final String SERIALIZED_NAME_TOTAL_HEAP = "totalHeap";
  @SerializedName(SERIALIZED_NAME_TOTAL_HEAP)
  private String totalHeap;

  public static final String SERIALIZED_NAME_TOTAL_HEAP_BYTES = "totalHeapBytes";
  @SerializedName(SERIALIZED_NAME_TOTAL_HEAP_BYTES)
  private Long totalHeapBytes;

  public static final String SERIALIZED_NAME_USED_HEAP = "usedHeap";
  @SerializedName(SERIALIZED_NAME_USED_HEAP)
  private String usedHeap;

  public static final String SERIALIZED_NAME_USED_HEAP_BYTES = "usedHeapBytes";
  @SerializedName(SERIALIZED_NAME_USED_HEAP_BYTES)
  private Long usedHeapBytes;

  public static final String SERIALIZED_NAME_FREE_HEAP = "freeHeap";
  @SerializedName(SERIALIZED_NAME_FREE_HEAP)
  private String freeHeap;

  public static final String SERIALIZED_NAME_FREE_HEAP_BYTES = "freeHeapBytes";
  @SerializedName(SERIALIZED_NAME_FREE_HEAP_BYTES)
  private Long freeHeapBytes;

  public static final String SERIALIZED_NAME_MAX_HEAP = "maxHeap";
  @SerializedName(SERIALIZED_NAME_MAX_HEAP)
  private String maxHeap;

  public static final String SERIALIZED_NAME_MAX_HEAP_BYTES = "maxHeapBytes";
  @SerializedName(SERIALIZED_NAME_MAX_HEAP_BYTES)
  private Long maxHeapBytes;

  public static final String SERIALIZED_NAME_HEAP_UTILIZATION = "heapUtilization";
  @SerializedName(SERIALIZED_NAME_HEAP_UTILIZATION)
  private String heapUtilization;

  public static final String SERIALIZED_NAME_AVAILABLE_PROCESSORS = "availableProcessors";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_PROCESSORS)
  private Integer availableProcessors;

  public static final String SERIALIZED_NAME_PROCESSOR_LOAD_AVERAGE = "processorLoadAverage";
  @SerializedName(SERIALIZED_NAME_PROCESSOR_LOAD_AVERAGE)
  private Double processorLoadAverage;

  public static final String SERIALIZED_NAME_TOTAL_THREADS = "totalThreads";
  @SerializedName(SERIALIZED_NAME_TOTAL_THREADS)
  private Integer totalThreads;

  public static final String SERIALIZED_NAME_DAEMON_THREADS = "daemonThreads";
  @SerializedName(SERIALIZED_NAME_DAEMON_THREADS)
  private Integer daemonThreads;

  public static final String SERIALIZED_NAME_UPTIME = "uptime";
  @SerializedName(SERIALIZED_NAME_UPTIME)
  private String uptime;

  public static final String SERIALIZED_NAME_FLOW_FILE_REPOSITORY_STORAGE_USAGE = "flowFileRepositoryStorageUsage";
  @SerializedName(SERIALIZED_NAME_FLOW_FILE_REPOSITORY_STORAGE_USAGE)
  private StorageUsageDTO flowFileRepositoryStorageUsage;

  public static final String SERIALIZED_NAME_CONTENT_REPOSITORY_STORAGE_USAGE = "contentRepositoryStorageUsage";
  @SerializedName(SERIALIZED_NAME_CONTENT_REPOSITORY_STORAGE_USAGE)
  private Set<StorageUsageDTO> contentRepositoryStorageUsage = null;

  public static final String SERIALIZED_NAME_PROVENANCE_REPOSITORY_STORAGE_USAGE = "provenanceRepositoryStorageUsage";
  @SerializedName(SERIALIZED_NAME_PROVENANCE_REPOSITORY_STORAGE_USAGE)
  private Set<StorageUsageDTO> provenanceRepositoryStorageUsage = null;

  public static final String SERIALIZED_NAME_GARBAGE_COLLECTION = "garbageCollection";
  @SerializedName(SERIALIZED_NAME_GARBAGE_COLLECTION)
  private Set<GarbageCollectionDTO> garbageCollection = null;

  public static final String SERIALIZED_NAME_STATS_LAST_REFRESHED = "statsLastRefreshed";
  @SerializedName(SERIALIZED_NAME_STATS_LAST_REFRESHED)
  private String statsLastRefreshed;

  public static final String SERIALIZED_NAME_VERSION_INFO = "versionInfo";
  @SerializedName(SERIALIZED_NAME_VERSION_INFO)
  private VersionInfoDTO versionInfo;


  public SystemDiagnosticsSnapshotDTO totalNonHeap(String totalNonHeap) {
    
    this.totalNonHeap = totalNonHeap;
    return this;
  }

   /**
   * Total size of non heap.
   * @return totalNonHeap
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total size of non heap.")

  public String getTotalNonHeap() {
    return totalNonHeap;
  }


  public void setTotalNonHeap(String totalNonHeap) {
    this.totalNonHeap = totalNonHeap;
  }


  public SystemDiagnosticsSnapshotDTO totalNonHeapBytes(Long totalNonHeapBytes) {
    
    this.totalNonHeapBytes = totalNonHeapBytes;
    return this;
  }

   /**
   * Total number of bytes allocated to the JVM not used for heap
   * @return totalNonHeapBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total number of bytes allocated to the JVM not used for heap")

  public Long getTotalNonHeapBytes() {
    return totalNonHeapBytes;
  }


  public void setTotalNonHeapBytes(Long totalNonHeapBytes) {
    this.totalNonHeapBytes = totalNonHeapBytes;
  }


  public SystemDiagnosticsSnapshotDTO usedNonHeap(String usedNonHeap) {
    
    this.usedNonHeap = usedNonHeap;
    return this;
  }

   /**
   * Amount of use non heap.
   * @return usedNonHeap
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of use non heap.")

  public String getUsedNonHeap() {
    return usedNonHeap;
  }


  public void setUsedNonHeap(String usedNonHeap) {
    this.usedNonHeap = usedNonHeap;
  }


  public SystemDiagnosticsSnapshotDTO usedNonHeapBytes(Long usedNonHeapBytes) {
    
    this.usedNonHeapBytes = usedNonHeapBytes;
    return this;
  }

   /**
   * Total number of bytes used by the JVM not in the heap space
   * @return usedNonHeapBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total number of bytes used by the JVM not in the heap space")

  public Long getUsedNonHeapBytes() {
    return usedNonHeapBytes;
  }


  public void setUsedNonHeapBytes(Long usedNonHeapBytes) {
    this.usedNonHeapBytes = usedNonHeapBytes;
  }


  public SystemDiagnosticsSnapshotDTO freeNonHeap(String freeNonHeap) {
    
    this.freeNonHeap = freeNonHeap;
    return this;
  }

   /**
   * Amount of free non heap.
   * @return freeNonHeap
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of free non heap.")

  public String getFreeNonHeap() {
    return freeNonHeap;
  }


  public void setFreeNonHeap(String freeNonHeap) {
    this.freeNonHeap = freeNonHeap;
  }


  public SystemDiagnosticsSnapshotDTO freeNonHeapBytes(Long freeNonHeapBytes) {
    
    this.freeNonHeapBytes = freeNonHeapBytes;
    return this;
  }

   /**
   * Total number of free non-heap bytes available to the JVM
   * @return freeNonHeapBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total number of free non-heap bytes available to the JVM")

  public Long getFreeNonHeapBytes() {
    return freeNonHeapBytes;
  }


  public void setFreeNonHeapBytes(Long freeNonHeapBytes) {
    this.freeNonHeapBytes = freeNonHeapBytes;
  }


  public SystemDiagnosticsSnapshotDTO maxNonHeap(String maxNonHeap) {
    
    this.maxNonHeap = maxNonHeap;
    return this;
  }

   /**
   * Maximum size of non heap.
   * @return maxNonHeap
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum size of non heap.")

  public String getMaxNonHeap() {
    return maxNonHeap;
  }


  public void setMaxNonHeap(String maxNonHeap) {
    this.maxNonHeap = maxNonHeap;
  }


  public SystemDiagnosticsSnapshotDTO maxNonHeapBytes(Long maxNonHeapBytes) {
    
    this.maxNonHeapBytes = maxNonHeapBytes;
    return this;
  }

   /**
   * The maximum number of bytes that the JVM can use for non-heap purposes
   * @return maxNonHeapBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum number of bytes that the JVM can use for non-heap purposes")

  public Long getMaxNonHeapBytes() {
    return maxNonHeapBytes;
  }


  public void setMaxNonHeapBytes(Long maxNonHeapBytes) {
    this.maxNonHeapBytes = maxNonHeapBytes;
  }


  public SystemDiagnosticsSnapshotDTO nonHeapUtilization(String nonHeapUtilization) {
    
    this.nonHeapUtilization = nonHeapUtilization;
    return this;
  }

   /**
   * Utilization of non heap.
   * @return nonHeapUtilization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Utilization of non heap.")

  public String getNonHeapUtilization() {
    return nonHeapUtilization;
  }


  public void setNonHeapUtilization(String nonHeapUtilization) {
    this.nonHeapUtilization = nonHeapUtilization;
  }


  public SystemDiagnosticsSnapshotDTO totalHeap(String totalHeap) {
    
    this.totalHeap = totalHeap;
    return this;
  }

   /**
   * Total size of heap.
   * @return totalHeap
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total size of heap.")

  public String getTotalHeap() {
    return totalHeap;
  }


  public void setTotalHeap(String totalHeap) {
    this.totalHeap = totalHeap;
  }


  public SystemDiagnosticsSnapshotDTO totalHeapBytes(Long totalHeapBytes) {
    
    this.totalHeapBytes = totalHeapBytes;
    return this;
  }

   /**
   * The total number of bytes that are available for the JVM heap to use
   * @return totalHeapBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total number of bytes that are available for the JVM heap to use")

  public Long getTotalHeapBytes() {
    return totalHeapBytes;
  }


  public void setTotalHeapBytes(Long totalHeapBytes) {
    this.totalHeapBytes = totalHeapBytes;
  }


  public SystemDiagnosticsSnapshotDTO usedHeap(String usedHeap) {
    
    this.usedHeap = usedHeap;
    return this;
  }

   /**
   * Amount of used heap.
   * @return usedHeap
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of used heap.")

  public String getUsedHeap() {
    return usedHeap;
  }


  public void setUsedHeap(String usedHeap) {
    this.usedHeap = usedHeap;
  }


  public SystemDiagnosticsSnapshotDTO usedHeapBytes(Long usedHeapBytes) {
    
    this.usedHeapBytes = usedHeapBytes;
    return this;
  }

   /**
   * The number of bytes of JVM heap that are currently being used
   * @return usedHeapBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of bytes of JVM heap that are currently being used")

  public Long getUsedHeapBytes() {
    return usedHeapBytes;
  }


  public void setUsedHeapBytes(Long usedHeapBytes) {
    this.usedHeapBytes = usedHeapBytes;
  }


  public SystemDiagnosticsSnapshotDTO freeHeap(String freeHeap) {
    
    this.freeHeap = freeHeap;
    return this;
  }

   /**
   * Amount of free heap.
   * @return freeHeap
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Amount of free heap.")

  public String getFreeHeap() {
    return freeHeap;
  }


  public void setFreeHeap(String freeHeap) {
    this.freeHeap = freeHeap;
  }


  public SystemDiagnosticsSnapshotDTO freeHeapBytes(Long freeHeapBytes) {
    
    this.freeHeapBytes = freeHeapBytes;
    return this;
  }

   /**
   * The number of bytes that are allocated to the JVM heap but not currently being used
   * @return freeHeapBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of bytes that are allocated to the JVM heap but not currently being used")

  public Long getFreeHeapBytes() {
    return freeHeapBytes;
  }


  public void setFreeHeapBytes(Long freeHeapBytes) {
    this.freeHeapBytes = freeHeapBytes;
  }


  public SystemDiagnosticsSnapshotDTO maxHeap(String maxHeap) {
    
    this.maxHeap = maxHeap;
    return this;
  }

   /**
   * Maximum size of heap.
   * @return maxHeap
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum size of heap.")

  public String getMaxHeap() {
    return maxHeap;
  }


  public void setMaxHeap(String maxHeap) {
    this.maxHeap = maxHeap;
  }


  public SystemDiagnosticsSnapshotDTO maxHeapBytes(Long maxHeapBytes) {
    
    this.maxHeapBytes = maxHeapBytes;
    return this;
  }

   /**
   * The maximum number of bytes that can be used by the JVM
   * @return maxHeapBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum number of bytes that can be used by the JVM")

  public Long getMaxHeapBytes() {
    return maxHeapBytes;
  }


  public void setMaxHeapBytes(Long maxHeapBytes) {
    this.maxHeapBytes = maxHeapBytes;
  }


  public SystemDiagnosticsSnapshotDTO heapUtilization(String heapUtilization) {
    
    this.heapUtilization = heapUtilization;
    return this;
  }

   /**
   * Utilization of heap.
   * @return heapUtilization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Utilization of heap.")

  public String getHeapUtilization() {
    return heapUtilization;
  }


  public void setHeapUtilization(String heapUtilization) {
    this.heapUtilization = heapUtilization;
  }


  public SystemDiagnosticsSnapshotDTO availableProcessors(Integer availableProcessors) {
    
    this.availableProcessors = availableProcessors;
    return this;
  }

   /**
   * Number of available processors if supported by the underlying system.
   * @return availableProcessors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of available processors if supported by the underlying system.")

  public Integer getAvailableProcessors() {
    return availableProcessors;
  }


  public void setAvailableProcessors(Integer availableProcessors) {
    this.availableProcessors = availableProcessors;
  }


  public SystemDiagnosticsSnapshotDTO processorLoadAverage(Double processorLoadAverage) {
    
    this.processorLoadAverage = processorLoadAverage;
    return this;
  }

   /**
   * The processor load average if supported by the underlying system.
   * @return processorLoadAverage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The processor load average if supported by the underlying system.")

  public Double getProcessorLoadAverage() {
    return processorLoadAverage;
  }


  public void setProcessorLoadAverage(Double processorLoadAverage) {
    this.processorLoadAverage = processorLoadAverage;
  }


  public SystemDiagnosticsSnapshotDTO totalThreads(Integer totalThreads) {
    
    this.totalThreads = totalThreads;
    return this;
  }

   /**
   * Total number of threads.
   * @return totalThreads
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total number of threads.")

  public Integer getTotalThreads() {
    return totalThreads;
  }


  public void setTotalThreads(Integer totalThreads) {
    this.totalThreads = totalThreads;
  }


  public SystemDiagnosticsSnapshotDTO daemonThreads(Integer daemonThreads) {
    
    this.daemonThreads = daemonThreads;
    return this;
  }

   /**
   * Number of daemon threads.
   * @return daemonThreads
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of daemon threads.")

  public Integer getDaemonThreads() {
    return daemonThreads;
  }


  public void setDaemonThreads(Integer daemonThreads) {
    this.daemonThreads = daemonThreads;
  }


  public SystemDiagnosticsSnapshotDTO uptime(String uptime) {
    
    this.uptime = uptime;
    return this;
  }

   /**
   * The uptime of the Java virtual machine
   * @return uptime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The uptime of the Java virtual machine")

  public String getUptime() {
    return uptime;
  }


  public void setUptime(String uptime) {
    this.uptime = uptime;
  }


  public SystemDiagnosticsSnapshotDTO flowFileRepositoryStorageUsage(StorageUsageDTO flowFileRepositoryStorageUsage) {
    
    this.flowFileRepositoryStorageUsage = flowFileRepositoryStorageUsage;
    return this;
  }

   /**
   * Get flowFileRepositoryStorageUsage
   * @return flowFileRepositoryStorageUsage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StorageUsageDTO getFlowFileRepositoryStorageUsage() {
    return flowFileRepositoryStorageUsage;
  }


  public void setFlowFileRepositoryStorageUsage(StorageUsageDTO flowFileRepositoryStorageUsage) {
    this.flowFileRepositoryStorageUsage = flowFileRepositoryStorageUsage;
  }


  public SystemDiagnosticsSnapshotDTO contentRepositoryStorageUsage(Set<StorageUsageDTO> contentRepositoryStorageUsage) {
    
    this.contentRepositoryStorageUsage = contentRepositoryStorageUsage;
    return this;
  }

  public SystemDiagnosticsSnapshotDTO addContentRepositoryStorageUsageItem(StorageUsageDTO contentRepositoryStorageUsageItem) {
    if (this.contentRepositoryStorageUsage == null) {
      this.contentRepositoryStorageUsage = new LinkedHashSet<StorageUsageDTO>();
    }
    this.contentRepositoryStorageUsage.add(contentRepositoryStorageUsageItem);
    return this;
  }

   /**
   * The content repository storage usage.
   * @return contentRepositoryStorageUsage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The content repository storage usage.")

  public Set<StorageUsageDTO> getContentRepositoryStorageUsage() {
    return contentRepositoryStorageUsage;
  }


  public void setContentRepositoryStorageUsage(Set<StorageUsageDTO> contentRepositoryStorageUsage) {
    this.contentRepositoryStorageUsage = contentRepositoryStorageUsage;
  }


  public SystemDiagnosticsSnapshotDTO provenanceRepositoryStorageUsage(Set<StorageUsageDTO> provenanceRepositoryStorageUsage) {
    
    this.provenanceRepositoryStorageUsage = provenanceRepositoryStorageUsage;
    return this;
  }

  public SystemDiagnosticsSnapshotDTO addProvenanceRepositoryStorageUsageItem(StorageUsageDTO provenanceRepositoryStorageUsageItem) {
    if (this.provenanceRepositoryStorageUsage == null) {
      this.provenanceRepositoryStorageUsage = new LinkedHashSet<StorageUsageDTO>();
    }
    this.provenanceRepositoryStorageUsage.add(provenanceRepositoryStorageUsageItem);
    return this;
  }

   /**
   * The provenance repository storage usage.
   * @return provenanceRepositoryStorageUsage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The provenance repository storage usage.")

  public Set<StorageUsageDTO> getProvenanceRepositoryStorageUsage() {
    return provenanceRepositoryStorageUsage;
  }


  public void setProvenanceRepositoryStorageUsage(Set<StorageUsageDTO> provenanceRepositoryStorageUsage) {
    this.provenanceRepositoryStorageUsage = provenanceRepositoryStorageUsage;
  }


  public SystemDiagnosticsSnapshotDTO garbageCollection(Set<GarbageCollectionDTO> garbageCollection) {
    
    this.garbageCollection = garbageCollection;
    return this;
  }

  public SystemDiagnosticsSnapshotDTO addGarbageCollectionItem(GarbageCollectionDTO garbageCollectionItem) {
    if (this.garbageCollection == null) {
      this.garbageCollection = new LinkedHashSet<GarbageCollectionDTO>();
    }
    this.garbageCollection.add(garbageCollectionItem);
    return this;
  }

   /**
   * The garbage collection details.
   * @return garbageCollection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The garbage collection details.")

  public Set<GarbageCollectionDTO> getGarbageCollection() {
    return garbageCollection;
  }


  public void setGarbageCollection(Set<GarbageCollectionDTO> garbageCollection) {
    this.garbageCollection = garbageCollection;
  }


  public SystemDiagnosticsSnapshotDTO statsLastRefreshed(String statsLastRefreshed) {
    
    this.statsLastRefreshed = statsLastRefreshed;
    return this;
  }

   /**
   * When the diagnostics were generated.
   * @return statsLastRefreshed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When the diagnostics were generated.")

  public String getStatsLastRefreshed() {
    return statsLastRefreshed;
  }


  public void setStatsLastRefreshed(String statsLastRefreshed) {
    this.statsLastRefreshed = statsLastRefreshed;
  }


  public SystemDiagnosticsSnapshotDTO versionInfo(VersionInfoDTO versionInfo) {
    
    this.versionInfo = versionInfo;
    return this;
  }

   /**
   * Get versionInfo
   * @return versionInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VersionInfoDTO getVersionInfo() {
    return versionInfo;
  }


  public void setVersionInfo(VersionInfoDTO versionInfo) {
    this.versionInfo = versionInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemDiagnosticsSnapshotDTO systemDiagnosticsSnapshotDTO = (SystemDiagnosticsSnapshotDTO) o;
    return Objects.equals(this.totalNonHeap, systemDiagnosticsSnapshotDTO.totalNonHeap) &&
        Objects.equals(this.totalNonHeapBytes, systemDiagnosticsSnapshotDTO.totalNonHeapBytes) &&
        Objects.equals(this.usedNonHeap, systemDiagnosticsSnapshotDTO.usedNonHeap) &&
        Objects.equals(this.usedNonHeapBytes, systemDiagnosticsSnapshotDTO.usedNonHeapBytes) &&
        Objects.equals(this.freeNonHeap, systemDiagnosticsSnapshotDTO.freeNonHeap) &&
        Objects.equals(this.freeNonHeapBytes, systemDiagnosticsSnapshotDTO.freeNonHeapBytes) &&
        Objects.equals(this.maxNonHeap, systemDiagnosticsSnapshotDTO.maxNonHeap) &&
        Objects.equals(this.maxNonHeapBytes, systemDiagnosticsSnapshotDTO.maxNonHeapBytes) &&
        Objects.equals(this.nonHeapUtilization, systemDiagnosticsSnapshotDTO.nonHeapUtilization) &&
        Objects.equals(this.totalHeap, systemDiagnosticsSnapshotDTO.totalHeap) &&
        Objects.equals(this.totalHeapBytes, systemDiagnosticsSnapshotDTO.totalHeapBytes) &&
        Objects.equals(this.usedHeap, systemDiagnosticsSnapshotDTO.usedHeap) &&
        Objects.equals(this.usedHeapBytes, systemDiagnosticsSnapshotDTO.usedHeapBytes) &&
        Objects.equals(this.freeHeap, systemDiagnosticsSnapshotDTO.freeHeap) &&
        Objects.equals(this.freeHeapBytes, systemDiagnosticsSnapshotDTO.freeHeapBytes) &&
        Objects.equals(this.maxHeap, systemDiagnosticsSnapshotDTO.maxHeap) &&
        Objects.equals(this.maxHeapBytes, systemDiagnosticsSnapshotDTO.maxHeapBytes) &&
        Objects.equals(this.heapUtilization, systemDiagnosticsSnapshotDTO.heapUtilization) &&
        Objects.equals(this.availableProcessors, systemDiagnosticsSnapshotDTO.availableProcessors) &&
        Objects.equals(this.processorLoadAverage, systemDiagnosticsSnapshotDTO.processorLoadAverage) &&
        Objects.equals(this.totalThreads, systemDiagnosticsSnapshotDTO.totalThreads) &&
        Objects.equals(this.daemonThreads, systemDiagnosticsSnapshotDTO.daemonThreads) &&
        Objects.equals(this.uptime, systemDiagnosticsSnapshotDTO.uptime) &&
        Objects.equals(this.flowFileRepositoryStorageUsage, systemDiagnosticsSnapshotDTO.flowFileRepositoryStorageUsage) &&
        Objects.equals(this.contentRepositoryStorageUsage, systemDiagnosticsSnapshotDTO.contentRepositoryStorageUsage) &&
        Objects.equals(this.provenanceRepositoryStorageUsage, systemDiagnosticsSnapshotDTO.provenanceRepositoryStorageUsage) &&
        Objects.equals(this.garbageCollection, systemDiagnosticsSnapshotDTO.garbageCollection) &&
        Objects.equals(this.statsLastRefreshed, systemDiagnosticsSnapshotDTO.statsLastRefreshed) &&
        Objects.equals(this.versionInfo, systemDiagnosticsSnapshotDTO.versionInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalNonHeap, totalNonHeapBytes, usedNonHeap, usedNonHeapBytes, freeNonHeap, freeNonHeapBytes, maxNonHeap, maxNonHeapBytes, nonHeapUtilization, totalHeap, totalHeapBytes, usedHeap, usedHeapBytes, freeHeap, freeHeapBytes, maxHeap, maxHeapBytes, heapUtilization, availableProcessors, processorLoadAverage, totalThreads, daemonThreads, uptime, flowFileRepositoryStorageUsage, contentRepositoryStorageUsage, provenanceRepositoryStorageUsage, garbageCollection, statsLastRefreshed, versionInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemDiagnosticsSnapshotDTO {\n");
    sb.append("    totalNonHeap: ").append(toIndentedString(totalNonHeap)).append("\n");
    sb.append("    totalNonHeapBytes: ").append(toIndentedString(totalNonHeapBytes)).append("\n");
    sb.append("    usedNonHeap: ").append(toIndentedString(usedNonHeap)).append("\n");
    sb.append("    usedNonHeapBytes: ").append(toIndentedString(usedNonHeapBytes)).append("\n");
    sb.append("    freeNonHeap: ").append(toIndentedString(freeNonHeap)).append("\n");
    sb.append("    freeNonHeapBytes: ").append(toIndentedString(freeNonHeapBytes)).append("\n");
    sb.append("    maxNonHeap: ").append(toIndentedString(maxNonHeap)).append("\n");
    sb.append("    maxNonHeapBytes: ").append(toIndentedString(maxNonHeapBytes)).append("\n");
    sb.append("    nonHeapUtilization: ").append(toIndentedString(nonHeapUtilization)).append("\n");
    sb.append("    totalHeap: ").append(toIndentedString(totalHeap)).append("\n");
    sb.append("    totalHeapBytes: ").append(toIndentedString(totalHeapBytes)).append("\n");
    sb.append("    usedHeap: ").append(toIndentedString(usedHeap)).append("\n");
    sb.append("    usedHeapBytes: ").append(toIndentedString(usedHeapBytes)).append("\n");
    sb.append("    freeHeap: ").append(toIndentedString(freeHeap)).append("\n");
    sb.append("    freeHeapBytes: ").append(toIndentedString(freeHeapBytes)).append("\n");
    sb.append("    maxHeap: ").append(toIndentedString(maxHeap)).append("\n");
    sb.append("    maxHeapBytes: ").append(toIndentedString(maxHeapBytes)).append("\n");
    sb.append("    heapUtilization: ").append(toIndentedString(heapUtilization)).append("\n");
    sb.append("    availableProcessors: ").append(toIndentedString(availableProcessors)).append("\n");
    sb.append("    processorLoadAverage: ").append(toIndentedString(processorLoadAverage)).append("\n");
    sb.append("    totalThreads: ").append(toIndentedString(totalThreads)).append("\n");
    sb.append("    daemonThreads: ").append(toIndentedString(daemonThreads)).append("\n");
    sb.append("    uptime: ").append(toIndentedString(uptime)).append("\n");
    sb.append("    flowFileRepositoryStorageUsage: ").append(toIndentedString(flowFileRepositoryStorageUsage)).append("\n");
    sb.append("    contentRepositoryStorageUsage: ").append(toIndentedString(contentRepositoryStorageUsage)).append("\n");
    sb.append("    provenanceRepositoryStorageUsage: ").append(toIndentedString(provenanceRepositoryStorageUsage)).append("\n");
    sb.append("    garbageCollection: ").append(toIndentedString(garbageCollection)).append("\n");
    sb.append("    statsLastRefreshed: ").append(toIndentedString(statsLastRefreshed)).append("\n");
    sb.append("    versionInfo: ").append(toIndentedString(versionInfo)).append("\n");
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


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


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.ProvenanceEventEntity;
import org.openapitools.client.model.SubmitReplayRequestEntity;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProvenanceEventsApi {
    private ApiClient localVarApiClient;

    public ProvenanceEventsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProvenanceEventsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getInputContent
     * @param id The provenance event id. (required)
     * @param clusterNodeId The id of the node where the content exists if clustered. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> NiFi was unable to complete the request because it was invalid. The request should not be retried without modification. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Client could not be authenticated. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Client is not authorized to make this request. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The specified resource could not be found. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> The request was valid but NiFi was not in the appropriate state to process it. Retrying the same request later may be successful. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getInputContentCall(String id, String clusterNodeId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/provenance-events/{id}/content/input"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (clusterNodeId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("clusterNodeId", clusterNodeId));
        }

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "auth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getInputContentValidateBeforeCall(String id, String clusterNodeId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getInputContent(Async)");
        }
        

        okhttp3.Call localVarCall = getInputContentCall(id, clusterNodeId, _callback);
        return localVarCall;

    }

    /**
     * Gets the input content for a provenance event
     * 
     * @param id The provenance event id. (required)
     * @param clusterNodeId The id of the node where the content exists if clustered. (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> NiFi was unable to complete the request because it was invalid. The request should not be retried without modification. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Client could not be authenticated. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Client is not authorized to make this request. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The specified resource could not be found. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> The request was valid but NiFi was not in the appropriate state to process it. Retrying the same request later may be successful. </td><td>  -  </td></tr>
     </table>
     */
    public Object getInputContent(String id, String clusterNodeId) throws ApiException {
        ApiResponse<Object> localVarResp = getInputContentWithHttpInfo(id, clusterNodeId);
        return localVarResp.getData();
    }

    /**
     * Gets the input content for a provenance event
     * 
     * @param id The provenance event id. (required)
     * @param clusterNodeId The id of the node where the content exists if clustered. (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> NiFi was unable to complete the request because it was invalid. The request should not be retried without modification. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Client could not be authenticated. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Client is not authorized to make this request. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The specified resource could not be found. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> The request was valid but NiFi was not in the appropriate state to process it. Retrying the same request later may be successful. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> getInputContentWithHttpInfo(String id, String clusterNodeId) throws ApiException {
        okhttp3.Call localVarCall = getInputContentValidateBeforeCall(id, clusterNodeId, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Gets the input content for a provenance event (asynchronously)
     * 
     * @param id The provenance event id. (required)
     * @param clusterNodeId The id of the node where the content exists if clustered. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> NiFi was unable to complete the request because it was invalid. The request should not be retried without modification. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Client could not be authenticated. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Client is not authorized to make this request. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The specified resource could not be found. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> The request was valid but NiFi was not in the appropriate state to process it. Retrying the same request later may be successful. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getInputContentAsync(String id, String clusterNodeId, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = getInputContentValidateBeforeCall(id, clusterNodeId, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getOutputContent
     * @param id The provenance event id. (required)
     * @param clusterNodeId The id of the node where the content exists if clustered. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> NiFi was unable to complete the request because it was invalid. The request should not be retried without modification. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Client could not be authenticated. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Client is not authorized to make this request. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The specified resource could not be found. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> The request was valid but NiFi was not in the appropriate state to process it. Retrying the same request later may be successful. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getOutputContentCall(String id, String clusterNodeId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/provenance-events/{id}/content/output"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (clusterNodeId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("clusterNodeId", clusterNodeId));
        }

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "auth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getOutputContentValidateBeforeCall(String id, String clusterNodeId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getOutputContent(Async)");
        }
        

        okhttp3.Call localVarCall = getOutputContentCall(id, clusterNodeId, _callback);
        return localVarCall;

    }

    /**
     * Gets the output content for a provenance event
     * 
     * @param id The provenance event id. (required)
     * @param clusterNodeId The id of the node where the content exists if clustered. (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> NiFi was unable to complete the request because it was invalid. The request should not be retried without modification. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Client could not be authenticated. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Client is not authorized to make this request. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The specified resource could not be found. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> The request was valid but NiFi was not in the appropriate state to process it. Retrying the same request later may be successful. </td><td>  -  </td></tr>
     </table>
     */
    public Object getOutputContent(String id, String clusterNodeId) throws ApiException {
        ApiResponse<Object> localVarResp = getOutputContentWithHttpInfo(id, clusterNodeId);
        return localVarResp.getData();
    }

    /**
     * Gets the output content for a provenance event
     * 
     * @param id The provenance event id. (required)
     * @param clusterNodeId The id of the node where the content exists if clustered. (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> NiFi was unable to complete the request because it was invalid. The request should not be retried without modification. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Client could not be authenticated. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Client is not authorized to make this request. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The specified resource could not be found. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> The request was valid but NiFi was not in the appropriate state to process it. Retrying the same request later may be successful. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> getOutputContentWithHttpInfo(String id, String clusterNodeId) throws ApiException {
        okhttp3.Call localVarCall = getOutputContentValidateBeforeCall(id, clusterNodeId, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Gets the output content for a provenance event (asynchronously)
     * 
     * @param id The provenance event id. (required)
     * @param clusterNodeId The id of the node where the content exists if clustered. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> NiFi was unable to complete the request because it was invalid. The request should not be retried without modification. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Client could not be authenticated. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Client is not authorized to make this request. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The specified resource could not be found. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> The request was valid but NiFi was not in the appropriate state to process it. Retrying the same request later may be successful. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getOutputContentAsync(String id, String clusterNodeId, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = getOutputContentValidateBeforeCall(id, clusterNodeId, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getProvenanceEvent
     * @param id The provenance event id. (required)
     * @param clusterNodeId The id of the node where this event exists if clustered. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> NiFi was unable to complete the request because it was invalid. The request should not be retried without modification. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Client could not be authenticated. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Client is not authorized to make this request. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The specified resource could not be found. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> The request was valid but NiFi was not in the appropriate state to process it. Retrying the same request later may be successful. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getProvenanceEventCall(String id, String clusterNodeId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/provenance-events/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (clusterNodeId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("clusterNodeId", clusterNodeId));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "auth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getProvenanceEventValidateBeforeCall(String id, String clusterNodeId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getProvenanceEvent(Async)");
        }
        

        okhttp3.Call localVarCall = getProvenanceEventCall(id, clusterNodeId, _callback);
        return localVarCall;

    }

    /**
     * Gets a provenance event
     * 
     * @param id The provenance event id. (required)
     * @param clusterNodeId The id of the node where this event exists if clustered. (optional)
     * @return ProvenanceEventEntity
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> NiFi was unable to complete the request because it was invalid. The request should not be retried without modification. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Client could not be authenticated. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Client is not authorized to make this request. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The specified resource could not be found. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> The request was valid but NiFi was not in the appropriate state to process it. Retrying the same request later may be successful. </td><td>  -  </td></tr>
     </table>
     */
    public ProvenanceEventEntity getProvenanceEvent(String id, String clusterNodeId) throws ApiException {
        ApiResponse<ProvenanceEventEntity> localVarResp = getProvenanceEventWithHttpInfo(id, clusterNodeId);
        return localVarResp.getData();
    }

    /**
     * Gets a provenance event
     * 
     * @param id The provenance event id. (required)
     * @param clusterNodeId The id of the node where this event exists if clustered. (optional)
     * @return ApiResponse&lt;ProvenanceEventEntity&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> NiFi was unable to complete the request because it was invalid. The request should not be retried without modification. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Client could not be authenticated. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Client is not authorized to make this request. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The specified resource could not be found. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> The request was valid but NiFi was not in the appropriate state to process it. Retrying the same request later may be successful. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProvenanceEventEntity> getProvenanceEventWithHttpInfo(String id, String clusterNodeId) throws ApiException {
        okhttp3.Call localVarCall = getProvenanceEventValidateBeforeCall(id, clusterNodeId, null);
        Type localVarReturnType = new TypeToken<ProvenanceEventEntity>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Gets a provenance event (asynchronously)
     * 
     * @param id The provenance event id. (required)
     * @param clusterNodeId The id of the node where this event exists if clustered. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> NiFi was unable to complete the request because it was invalid. The request should not be retried without modification. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Client could not be authenticated. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Client is not authorized to make this request. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The specified resource could not be found. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> The request was valid but NiFi was not in the appropriate state to process it. Retrying the same request later may be successful. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getProvenanceEventAsync(String id, String clusterNodeId, final ApiCallback<ProvenanceEventEntity> _callback) throws ApiException {

        okhttp3.Call localVarCall = getProvenanceEventValidateBeforeCall(id, clusterNodeId, _callback);
        Type localVarReturnType = new TypeToken<ProvenanceEventEntity>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for submitReplay
     * @param body The replay request. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> NiFi was unable to complete the request because it was invalid. The request should not be retried without modification. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Client could not be authenticated. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Client is not authorized to make this request. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The specified resource could not be found. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> The request was valid but NiFi was not in the appropriate state to process it. Retrying the same request later may be successful. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call submitReplayCall(SubmitReplayRequestEntity body, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/provenance-events/replays";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "auth" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call submitReplayValidateBeforeCall(SubmitReplayRequestEntity body, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling submitReplay(Async)");
        }
        

        okhttp3.Call localVarCall = submitReplayCall(body, _callback);
        return localVarCall;

    }

    /**
     * Replays content from a provenance event
     * 
     * @param body The replay request. (required)
     * @return ProvenanceEventEntity
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> NiFi was unable to complete the request because it was invalid. The request should not be retried without modification. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Client could not be authenticated. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Client is not authorized to make this request. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The specified resource could not be found. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> The request was valid but NiFi was not in the appropriate state to process it. Retrying the same request later may be successful. </td><td>  -  </td></tr>
     </table>
     */
    public ProvenanceEventEntity submitReplay(SubmitReplayRequestEntity body) throws ApiException {
        ApiResponse<ProvenanceEventEntity> localVarResp = submitReplayWithHttpInfo(body);
        return localVarResp.getData();
    }

    /**
     * Replays content from a provenance event
     * 
     * @param body The replay request. (required)
     * @return ApiResponse&lt;ProvenanceEventEntity&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> NiFi was unable to complete the request because it was invalid. The request should not be retried without modification. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Client could not be authenticated. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Client is not authorized to make this request. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The specified resource could not be found. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> The request was valid but NiFi was not in the appropriate state to process it. Retrying the same request later may be successful. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProvenanceEventEntity> submitReplayWithHttpInfo(SubmitReplayRequestEntity body) throws ApiException {
        okhttp3.Call localVarCall = submitReplayValidateBeforeCall(body, null);
        Type localVarReturnType = new TypeToken<ProvenanceEventEntity>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Replays content from a provenance event (asynchronously)
     * 
     * @param body The replay request. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> NiFi was unable to complete the request because it was invalid. The request should not be retried without modification. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Client could not be authenticated. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Client is not authorized to make this request. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The specified resource could not be found. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> The request was valid but NiFi was not in the appropriate state to process it. Retrying the same request later may be successful. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call submitReplayAsync(SubmitReplayRequestEntity body, final ApiCallback<ProvenanceEventEntity> _callback) throws ApiException {

        okhttp3.Call localVarCall = submitReplayValidateBeforeCall(body, _callback);
        Type localVarReturnType = new TypeToken<ProvenanceEventEntity>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

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


import org.openapitools.client.model.PortEntity;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InputPortsApi {
    private ApiClient localVarApiClient;

    public InputPortsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public InputPortsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getInputPort
     * @param id The input port id. (required)
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
    public okhttp3.Call getInputPortCall(String id, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/input-ports/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

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
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "auth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getInputPortValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getInputPort(Async)");
        }
        

        okhttp3.Call localVarCall = getInputPortCall(id, _callback);
        return localVarCall;

    }

    /**
     * Gets an input port
     * 
     * @param id The input port id. (required)
     * @return PortEntity
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
    public PortEntity getInputPort(String id) throws ApiException {
        ApiResponse<PortEntity> localVarResp = getInputPortWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Gets an input port
     * 
     * @param id The input port id. (required)
     * @return ApiResponse&lt;PortEntity&gt;
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
    public ApiResponse<PortEntity> getInputPortWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = getInputPortValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<PortEntity>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Gets an input port (asynchronously)
     * 
     * @param id The input port id. (required)
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
    public okhttp3.Call getInputPortAsync(String id, final ApiCallback<PortEntity> _callback) throws ApiException {

        okhttp3.Call localVarCall = getInputPortValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<PortEntity>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for removeInputPort
     * @param id The input port id. (required)
     * @param version The revision is used to verify the client is working with the latest version of the flow. (optional)
     * @param clientId If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. (optional)
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
    public okhttp3.Call removeInputPortCall(String id, String version, String clientId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/input-ports/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (version != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("version", version));
        }

        if (clientId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("clientId", clientId));
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
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call removeInputPortValidateBeforeCall(String id, String version, String clientId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling removeInputPort(Async)");
        }
        

        okhttp3.Call localVarCall = removeInputPortCall(id, version, clientId, _callback);
        return localVarCall;

    }

    /**
     * Deletes an input port
     * 
     * @param id The input port id. (required)
     * @param version The revision is used to verify the client is working with the latest version of the flow. (optional)
     * @param clientId If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. (optional)
     * @return PortEntity
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
    public PortEntity removeInputPort(String id, String version, String clientId) throws ApiException {
        ApiResponse<PortEntity> localVarResp = removeInputPortWithHttpInfo(id, version, clientId);
        return localVarResp.getData();
    }

    /**
     * Deletes an input port
     * 
     * @param id The input port id. (required)
     * @param version The revision is used to verify the client is working with the latest version of the flow. (optional)
     * @param clientId If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. (optional)
     * @return ApiResponse&lt;PortEntity&gt;
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
    public ApiResponse<PortEntity> removeInputPortWithHttpInfo(String id, String version, String clientId) throws ApiException {
        okhttp3.Call localVarCall = removeInputPortValidateBeforeCall(id, version, clientId, null);
        Type localVarReturnType = new TypeToken<PortEntity>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Deletes an input port (asynchronously)
     * 
     * @param id The input port id. (required)
     * @param version The revision is used to verify the client is working with the latest version of the flow. (optional)
     * @param clientId If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. (optional)
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
    public okhttp3.Call removeInputPortAsync(String id, String version, String clientId, final ApiCallback<PortEntity> _callback) throws ApiException {

        okhttp3.Call localVarCall = removeInputPortValidateBeforeCall(id, version, clientId, _callback);
        Type localVarReturnType = new TypeToken<PortEntity>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateInputPort
     * @param id The input port id. (required)
     * @param body The input port configuration details. (required)
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
    public okhttp3.Call updateInputPortCall(String id, PortEntity body, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/input-ports/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

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
        return localVarApiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateInputPortValidateBeforeCall(String id, PortEntity body, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateInputPort(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateInputPort(Async)");
        }
        

        okhttp3.Call localVarCall = updateInputPortCall(id, body, _callback);
        return localVarCall;

    }

    /**
     * Updates an input port
     * 
     * @param id The input port id. (required)
     * @param body The input port configuration details. (required)
     * @return PortEntity
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
    public PortEntity updateInputPort(String id, PortEntity body) throws ApiException {
        ApiResponse<PortEntity> localVarResp = updateInputPortWithHttpInfo(id, body);
        return localVarResp.getData();
    }

    /**
     * Updates an input port
     * 
     * @param id The input port id. (required)
     * @param body The input port configuration details. (required)
     * @return ApiResponse&lt;PortEntity&gt;
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
    public ApiResponse<PortEntity> updateInputPortWithHttpInfo(String id, PortEntity body) throws ApiException {
        okhttp3.Call localVarCall = updateInputPortValidateBeforeCall(id, body, null);
        Type localVarReturnType = new TypeToken<PortEntity>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Updates an input port (asynchronously)
     * 
     * @param id The input port id. (required)
     * @param body The input port configuration details. (required)
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
    public okhttp3.Call updateInputPortAsync(String id, PortEntity body, final ApiCallback<PortEntity> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateInputPortValidateBeforeCall(id, body, _callback);
        Type localVarReturnType = new TypeToken<PortEntity>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

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


import org.openapitools.client.model.FunnelEntity;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunnelApi {
    private ApiClient localVarApiClient;

    public FunnelApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FunnelApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getFunnel
     * @param id The funnel id. (required)
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
    public okhttp3.Call getFunnelCall(String id, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/funnels/{id}"
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
    private okhttp3.Call getFunnelValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getFunnel(Async)");
        }
        

        okhttp3.Call localVarCall = getFunnelCall(id, _callback);
        return localVarCall;

    }

    /**
     * Gets a funnel
     * 
     * @param id The funnel id. (required)
     * @return FunnelEntity
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
    public FunnelEntity getFunnel(String id) throws ApiException {
        ApiResponse<FunnelEntity> localVarResp = getFunnelWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Gets a funnel
     * 
     * @param id The funnel id. (required)
     * @return ApiResponse&lt;FunnelEntity&gt;
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
    public ApiResponse<FunnelEntity> getFunnelWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = getFunnelValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<FunnelEntity>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Gets a funnel (asynchronously)
     * 
     * @param id The funnel id. (required)
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
    public okhttp3.Call getFunnelAsync(String id, final ApiCallback<FunnelEntity> _callback) throws ApiException {

        okhttp3.Call localVarCall = getFunnelValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<FunnelEntity>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for removeFunnel
     * @param id The funnel id. (required)
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
    public okhttp3.Call removeFunnelCall(String id, String version, String clientId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/funnels/{id}"
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
    private okhttp3.Call removeFunnelValidateBeforeCall(String id, String version, String clientId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling removeFunnel(Async)");
        }
        

        okhttp3.Call localVarCall = removeFunnelCall(id, version, clientId, _callback);
        return localVarCall;

    }

    /**
     * Deletes a funnel
     * 
     * @param id The funnel id. (required)
     * @param version The revision is used to verify the client is working with the latest version of the flow. (optional)
     * @param clientId If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. (optional)
     * @return FunnelEntity
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
    public FunnelEntity removeFunnel(String id, String version, String clientId) throws ApiException {
        ApiResponse<FunnelEntity> localVarResp = removeFunnelWithHttpInfo(id, version, clientId);
        return localVarResp.getData();
    }

    /**
     * Deletes a funnel
     * 
     * @param id The funnel id. (required)
     * @param version The revision is used to verify the client is working with the latest version of the flow. (optional)
     * @param clientId If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. (optional)
     * @return ApiResponse&lt;FunnelEntity&gt;
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
    public ApiResponse<FunnelEntity> removeFunnelWithHttpInfo(String id, String version, String clientId) throws ApiException {
        okhttp3.Call localVarCall = removeFunnelValidateBeforeCall(id, version, clientId, null);
        Type localVarReturnType = new TypeToken<FunnelEntity>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Deletes a funnel (asynchronously)
     * 
     * @param id The funnel id. (required)
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
    public okhttp3.Call removeFunnelAsync(String id, String version, String clientId, final ApiCallback<FunnelEntity> _callback) throws ApiException {

        okhttp3.Call localVarCall = removeFunnelValidateBeforeCall(id, version, clientId, _callback);
        Type localVarReturnType = new TypeToken<FunnelEntity>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateFunnel
     * @param id The funnel id. (required)
     * @param body The funnel configuration details. (required)
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
    public okhttp3.Call updateFunnelCall(String id, FunnelEntity body, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/funnels/{id}"
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
    private okhttp3.Call updateFunnelValidateBeforeCall(String id, FunnelEntity body, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateFunnel(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateFunnel(Async)");
        }
        

        okhttp3.Call localVarCall = updateFunnelCall(id, body, _callback);
        return localVarCall;

    }

    /**
     * Updates a funnel
     * 
     * @param id The funnel id. (required)
     * @param body The funnel configuration details. (required)
     * @return FunnelEntity
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
    public FunnelEntity updateFunnel(String id, FunnelEntity body) throws ApiException {
        ApiResponse<FunnelEntity> localVarResp = updateFunnelWithHttpInfo(id, body);
        return localVarResp.getData();
    }

    /**
     * Updates a funnel
     * 
     * @param id The funnel id. (required)
     * @param body The funnel configuration details. (required)
     * @return ApiResponse&lt;FunnelEntity&gt;
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
    public ApiResponse<FunnelEntity> updateFunnelWithHttpInfo(String id, FunnelEntity body) throws ApiException {
        okhttp3.Call localVarCall = updateFunnelValidateBeforeCall(id, body, null);
        Type localVarReturnType = new TypeToken<FunnelEntity>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Updates a funnel (asynchronously)
     * 
     * @param id The funnel id. (required)
     * @param body The funnel configuration details. (required)
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
    public okhttp3.Call updateFunnelAsync(String id, FunnelEntity body, final ApiCallback<FunnelEntity> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateFunnelValidateBeforeCall(id, body, _callback);
        Type localVarReturnType = new TypeToken<FunnelEntity>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

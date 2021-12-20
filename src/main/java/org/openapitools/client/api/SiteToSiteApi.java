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


import org.openapitools.client.model.ControllerEntity;
import org.openapitools.client.model.PeersEntity;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SiteToSiteApi {
    private ApiClient localVarApiClient;

    public SiteToSiteApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SiteToSiteApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getPeers
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
        <tr><td> 409 </td><td> The request was valid but NiFi was not in the appropriate state to process it. Retrying the same request later may be successful. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPeersCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/site-to-site/peers";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
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
    private okhttp3.Call getPeersValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getPeersCall(_callback);
        return localVarCall;

    }

    /**
     * Returns the available Peers and its status of this NiFi
     * 
     * @return PeersEntity
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> NiFi was unable to complete the request because it was invalid. The request should not be retried without modification. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Client could not be authenticated. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Client is not authorized to make this request. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> The request was valid but NiFi was not in the appropriate state to process it. Retrying the same request later may be successful. </td><td>  -  </td></tr>
     </table>
     */
    public PeersEntity getPeers() throws ApiException {
        ApiResponse<PeersEntity> localVarResp = getPeersWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Returns the available Peers and its status of this NiFi
     * 
     * @return ApiResponse&lt;PeersEntity&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> NiFi was unable to complete the request because it was invalid. The request should not be retried without modification. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Client could not be authenticated. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Client is not authorized to make this request. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> The request was valid but NiFi was not in the appropriate state to process it. Retrying the same request later may be successful. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PeersEntity> getPeersWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getPeersValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<PeersEntity>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Returns the available Peers and its status of this NiFi (asynchronously)
     * 
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
        <tr><td> 409 </td><td> The request was valid but NiFi was not in the appropriate state to process it. Retrying the same request later may be successful. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPeersAsync(final ApiCallback<PeersEntity> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPeersValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<PeersEntity>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSiteToSiteDetails
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
        <tr><td> 409 </td><td> The request was valid but NiFi was not in the appropriate state to process it. Retrying the same request later may be successful. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSiteToSiteDetailsCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/site-to-site";

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
    private okhttp3.Call getSiteToSiteDetailsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getSiteToSiteDetailsCall(_callback);
        return localVarCall;

    }

    /**
     * Returns the details about this NiFi necessary to communicate via site to site
     * 
     * @return ControllerEntity
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> NiFi was unable to complete the request because it was invalid. The request should not be retried without modification. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Client could not be authenticated. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Client is not authorized to make this request. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> The request was valid but NiFi was not in the appropriate state to process it. Retrying the same request later may be successful. </td><td>  -  </td></tr>
     </table>
     */
    public ControllerEntity getSiteToSiteDetails() throws ApiException {
        ApiResponse<ControllerEntity> localVarResp = getSiteToSiteDetailsWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Returns the details about this NiFi necessary to communicate via site to site
     * 
     * @return ApiResponse&lt;ControllerEntity&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> NiFi was unable to complete the request because it was invalid. The request should not be retried without modification. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Client could not be authenticated. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Client is not authorized to make this request. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> The request was valid but NiFi was not in the appropriate state to process it. Retrying the same request later may be successful. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ControllerEntity> getSiteToSiteDetailsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getSiteToSiteDetailsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<ControllerEntity>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Returns the details about this NiFi necessary to communicate via site to site (asynchronously)
     * 
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
        <tr><td> 409 </td><td> The request was valid but NiFi was not in the appropriate state to process it. Retrying the same request later may be successful. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSiteToSiteDetailsAsync(final ApiCallback<ControllerEntity> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSiteToSiteDetailsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<ControllerEntity>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

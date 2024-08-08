/*
 * 1Source Ledger API
 * 1Source Ledger API provides client access to the 1Source Ledger. You can find out more about 1Source at [https://equilend.com](https://equilend.com).  This specification is work in progress. The design is meant to model the securities lending life cycle in as clean a way as possible while being robust enough to easily translate to ISLA CDM workflows and data model.  API specification is the intellectual property of EquiLend LLC and should not be copied or disseminated in any way. 
 *
 * OpenAPI spec version: 1.0.5
 * Contact: 1source_help@equilend.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.os.client.api;

import com.os.client.invoker.ApiCallback;
import com.os.client.invoker.ApiClient;
import com.os.client.invoker.ApiException;
import com.os.client.invoker.ApiResponse;
import com.os.client.invoker.Configuration;
import com.os.client.invoker.Pair;
import com.os.client.invoker.ProgressRequestBody;
import com.os.client.invoker.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.os.client.model.LedgerResponse;
import com.os.client.model.Parties;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PartiesApi {
    private ApiClient apiClient;

    public PartiesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PartiesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for ledgerPartiesGet
     * @param partyId The ledger Party ID sometimes referred to as Short Code (optional)
     * @param partyName Party name as defined during onboarding (optional)
     * @param gleifLei Global Legal Entity Identifier Foundation - Legal Entity Identifier (optional)
     * @param internalPartyId Client internal or proprietary id for this party (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call ledgerPartiesGetCall(String partyId, String partyName, String gleifLei, String internalPartyId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/ledger/parties";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (partyId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("partyId", partyId));
        if (partyName != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("partyName", partyName));
        if (gleifLei != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("gleifLei", gleifLei));
        if (internalPartyId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("internalPartyId", internalPartyId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "stage_auth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call ledgerPartiesGetValidateBeforeCall(String partyId, String partyName, String gleifLei, String internalPartyId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = ledgerPartiesGetCall(partyId, partyName, gleifLei, internalPartyId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Read a collection of registered trading parties.
     * 
     * @param partyId The ledger Party ID sometimes referred to as Short Code (optional)
     * @param partyName Party name as defined during onboarding (optional)
     * @param gleifLei Global Legal Entity Identifier Foundation - Legal Entity Identifier (optional)
     * @param internalPartyId Client internal or proprietary id for this party (optional)
     * @return Parties
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Parties ledgerPartiesGet(String partyId, String partyName, String gleifLei, String internalPartyId) throws ApiException {
        ApiResponse<Parties> resp = ledgerPartiesGetWithHttpInfo(partyId, partyName, gleifLei, internalPartyId);
        return resp.getData();
    }

    /**
     * Read a collection of registered trading parties.
     * 
     * @param partyId The ledger Party ID sometimes referred to as Short Code (optional)
     * @param partyName Party name as defined during onboarding (optional)
     * @param gleifLei Global Legal Entity Identifier Foundation - Legal Entity Identifier (optional)
     * @param internalPartyId Client internal or proprietary id for this party (optional)
     * @return ApiResponse&lt;Parties&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Parties> ledgerPartiesGetWithHttpInfo(String partyId, String partyName, String gleifLei, String internalPartyId) throws ApiException {
        com.squareup.okhttp.Call call = ledgerPartiesGetValidateBeforeCall(partyId, partyName, gleifLei, internalPartyId, null, null);
        Type localVarReturnType = new TypeToken<Parties>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read a collection of registered trading parties. (asynchronously)
     * 
     * @param partyId The ledger Party ID sometimes referred to as Short Code (optional)
     * @param partyName Party name as defined during onboarding (optional)
     * @param gleifLei Global Legal Entity Identifier Foundation - Legal Entity Identifier (optional)
     * @param internalPartyId Client internal or proprietary id for this party (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call ledgerPartiesGetAsync(String partyId, String partyName, String gleifLei, String internalPartyId, final ApiCallback<Parties> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = ledgerPartiesGetValidateBeforeCall(partyId, partyName, gleifLei, internalPartyId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Parties>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

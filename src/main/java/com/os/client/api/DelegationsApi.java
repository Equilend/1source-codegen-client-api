/*
 * 1Source Ledger API
 * 1Source Ledger API provides client access to the 1Source Ledger. You can find out more about 1Source at [https://equilend.com](https://equilend.com).  This specification is work in progress. The design is meant to model the securities lending life cycle in as clean a way as possible while being robust enough to easily translate to ISLA CDM workflows and data model.  API specification is the intellectual property of EquiLend LLC and should not be copied or disseminated in any way. 
 *
 * OpenAPI spec version: 1.1.0
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


import com.os.client.model.Delegation;
import com.os.client.model.DelegationProposal;
import com.os.client.model.Delegations;
import com.os.client.model.LedgerResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DelegationsApi {
    private ApiClient apiClient;

    public DelegationsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DelegationsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for ledgerDelegationsDelegationIdApprovePost
     * @param delegationId The unique identifier of a party delegation (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call ledgerDelegationsDelegationIdApprovePostCall(String delegationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/ledger/delegations/{delegationId}/approve"
            .replaceAll("\\{" + "delegationId" + "\\}", apiClient.escapeString(delegationId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call ledgerDelegationsDelegationIdApprovePostValidateBeforeCall(String delegationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'delegationId' is set
        if (delegationId == null) {
            throw new ApiException("Missing the required parameter 'delegationId' when calling ledgerDelegationsDelegationIdApprovePost(Async)");
        }
        
        com.squareup.okhttp.Call call = ledgerDelegationsDelegationIdApprovePostCall(delegationId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Approve a party delegation in \&quot;proposed\&quot; state
     * 
     * @param delegationId The unique identifier of a party delegation (required)
     * @return LedgerResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LedgerResponse ledgerDelegationsDelegationIdApprovePost(String delegationId) throws ApiException {
        ApiResponse<LedgerResponse> resp = ledgerDelegationsDelegationIdApprovePostWithHttpInfo(delegationId);
        return resp.getData();
    }

    /**
     * Approve a party delegation in \&quot;proposed\&quot; state
     * 
     * @param delegationId The unique identifier of a party delegation (required)
     * @return ApiResponse&lt;LedgerResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LedgerResponse> ledgerDelegationsDelegationIdApprovePostWithHttpInfo(String delegationId) throws ApiException {
        com.squareup.okhttp.Call call = ledgerDelegationsDelegationIdApprovePostValidateBeforeCall(delegationId, null, null);
        Type localVarReturnType = new TypeToken<LedgerResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Approve a party delegation in \&quot;proposed\&quot; state (asynchronously)
     * 
     * @param delegationId The unique identifier of a party delegation (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call ledgerDelegationsDelegationIdApprovePostAsync(String delegationId, final ApiCallback<LedgerResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = ledgerDelegationsDelegationIdApprovePostValidateBeforeCall(delegationId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LedgerResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for ledgerDelegationsDelegationIdCancelPost
     * @param delegationId The unique identifier of a party delegation (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call ledgerDelegationsDelegationIdCancelPostCall(String delegationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/ledger/delegations/{delegationId}/cancel"
            .replaceAll("\\{" + "delegationId" + "\\}", apiClient.escapeString(delegationId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call ledgerDelegationsDelegationIdCancelPostValidateBeforeCall(String delegationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'delegationId' is set
        if (delegationId == null) {
            throw new ApiException("Missing the required parameter 'delegationId' when calling ledgerDelegationsDelegationIdCancelPost(Async)");
        }
        
        com.squareup.okhttp.Call call = ledgerDelegationsDelegationIdCancelPostCall(delegationId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Cancel a party delegation in \&quot;proposed\&quot; state. Original proposer only.
     * 
     * @param delegationId The unique identifier of a party delegation (required)
     * @return LedgerResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LedgerResponse ledgerDelegationsDelegationIdCancelPost(String delegationId) throws ApiException {
        ApiResponse<LedgerResponse> resp = ledgerDelegationsDelegationIdCancelPostWithHttpInfo(delegationId);
        return resp.getData();
    }

    /**
     * Cancel a party delegation in \&quot;proposed\&quot; state. Original proposer only.
     * 
     * @param delegationId The unique identifier of a party delegation (required)
     * @return ApiResponse&lt;LedgerResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LedgerResponse> ledgerDelegationsDelegationIdCancelPostWithHttpInfo(String delegationId) throws ApiException {
        com.squareup.okhttp.Call call = ledgerDelegationsDelegationIdCancelPostValidateBeforeCall(delegationId, null, null);
        Type localVarReturnType = new TypeToken<LedgerResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Cancel a party delegation in \&quot;proposed\&quot; state. Original proposer only. (asynchronously)
     * 
     * @param delegationId The unique identifier of a party delegation (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call ledgerDelegationsDelegationIdCancelPostAsync(String delegationId, final ApiCallback<LedgerResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = ledgerDelegationsDelegationIdCancelPostValidateBeforeCall(delegationId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LedgerResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for ledgerDelegationsDelegationIdDeclinePost
     * @param delegationId The unique identifier of a party delegation (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call ledgerDelegationsDelegationIdDeclinePostCall(String delegationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/ledger/delegations/{delegationId}/decline"
            .replaceAll("\\{" + "delegationId" + "\\}", apiClient.escapeString(delegationId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call ledgerDelegationsDelegationIdDeclinePostValidateBeforeCall(String delegationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'delegationId' is set
        if (delegationId == null) {
            throw new ApiException("Missing the required parameter 'delegationId' when calling ledgerDelegationsDelegationIdDeclinePost(Async)");
        }
        
        com.squareup.okhttp.Call call = ledgerDelegationsDelegationIdDeclinePostCall(delegationId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Decline a party delegation in \&quot;proposed\&quot; state
     * 
     * @param delegationId The unique identifier of a party delegation (required)
     * @return LedgerResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LedgerResponse ledgerDelegationsDelegationIdDeclinePost(String delegationId) throws ApiException {
        ApiResponse<LedgerResponse> resp = ledgerDelegationsDelegationIdDeclinePostWithHttpInfo(delegationId);
        return resp.getData();
    }

    /**
     * Decline a party delegation in \&quot;proposed\&quot; state
     * 
     * @param delegationId The unique identifier of a party delegation (required)
     * @return ApiResponse&lt;LedgerResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LedgerResponse> ledgerDelegationsDelegationIdDeclinePostWithHttpInfo(String delegationId) throws ApiException {
        com.squareup.okhttp.Call call = ledgerDelegationsDelegationIdDeclinePostValidateBeforeCall(delegationId, null, null);
        Type localVarReturnType = new TypeToken<LedgerResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Decline a party delegation in \&quot;proposed\&quot; state (asynchronously)
     * 
     * @param delegationId The unique identifier of a party delegation (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call ledgerDelegationsDelegationIdDeclinePostAsync(String delegationId, final ApiCallback<LedgerResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = ledgerDelegationsDelegationIdDeclinePostValidateBeforeCall(delegationId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LedgerResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for ledgerDelegationsDelegationIdGet
     * @param delegationId The unique identifier of a party delegation (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call ledgerDelegationsDelegationIdGetCall(String delegationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/ledger/delegations/{delegationId}"
            .replaceAll("\\{" + "delegationId" + "\\}", apiClient.escapeString(delegationId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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
    private com.squareup.okhttp.Call ledgerDelegationsDelegationIdGetValidateBeforeCall(String delegationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'delegationId' is set
        if (delegationId == null) {
            throw new ApiException("Missing the required parameter 'delegationId' when calling ledgerDelegationsDelegationIdGet(Async)");
        }
        
        com.squareup.okhttp.Call call = ledgerDelegationsDelegationIdGetCall(delegationId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Read a party delegation
     * 
     * @param delegationId The unique identifier of a party delegation (required)
     * @return Delegation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Delegation ledgerDelegationsDelegationIdGet(String delegationId) throws ApiException {
        ApiResponse<Delegation> resp = ledgerDelegationsDelegationIdGetWithHttpInfo(delegationId);
        return resp.getData();
    }

    /**
     * Read a party delegation
     * 
     * @param delegationId The unique identifier of a party delegation (required)
     * @return ApiResponse&lt;Delegation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Delegation> ledgerDelegationsDelegationIdGetWithHttpInfo(String delegationId) throws ApiException {
        com.squareup.okhttp.Call call = ledgerDelegationsDelegationIdGetValidateBeforeCall(delegationId, null, null);
        Type localVarReturnType = new TypeToken<Delegation>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read a party delegation (asynchronously)
     * 
     * @param delegationId The unique identifier of a party delegation (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call ledgerDelegationsDelegationIdGetAsync(String delegationId, final ApiCallback<Delegation> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = ledgerDelegationsDelegationIdGetValidateBeforeCall(delegationId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Delegation>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for ledgerDelegationsGet
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call ledgerDelegationsGetCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/ledger/delegations";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

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
    private com.squareup.okhttp.Call ledgerDelegationsGetValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = ledgerDelegationsGetCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Read a collection of delegations.
     * 
     * @return Delegations
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Delegations ledgerDelegationsGet() throws ApiException {
        ApiResponse<Delegations> resp = ledgerDelegationsGetWithHttpInfo();
        return resp.getData();
    }

    /**
     * Read a collection of delegations.
     * 
     * @return ApiResponse&lt;Delegations&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Delegations> ledgerDelegationsGetWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = ledgerDelegationsGetValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<Delegations>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Read a collection of delegations. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call ledgerDelegationsGetAsync(final ApiCallback<Delegations> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = ledgerDelegationsGetValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Delegations>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for ledgerDelegationsPost
     * @param body Define a new venue delegate (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call ledgerDelegationsPostCall(DelegationProposal body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/ledger/delegations";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call ledgerDelegationsPostValidateBeforeCall(DelegationProposal body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling ledgerDelegationsPost(Async)");
        }
        
        com.squareup.okhttp.Call call = ledgerDelegationsPostCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delegate a set of workflows to a party
     * 
     * @param body Define a new venue delegate (required)
     * @return LedgerResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LedgerResponse ledgerDelegationsPost(DelegationProposal body) throws ApiException {
        ApiResponse<LedgerResponse> resp = ledgerDelegationsPostWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Delegate a set of workflows to a party
     * 
     * @param body Define a new venue delegate (required)
     * @return ApiResponse&lt;LedgerResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LedgerResponse> ledgerDelegationsPostWithHttpInfo(DelegationProposal body) throws ApiException {
        com.squareup.okhttp.Call call = ledgerDelegationsPostValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<LedgerResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delegate a set of workflows to a party (asynchronously)
     * 
     * @param body Define a new venue delegate (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call ledgerDelegationsPostAsync(DelegationProposal body, final ApiCallback<LedgerResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = ledgerDelegationsPostValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LedgerResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

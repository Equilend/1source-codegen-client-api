# DelegationsApi

All URIs are relative to *https://stageapi.equilend.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ledgerDelegationsDelegationIdApprovePost**](DelegationsApi.md#ledgerDelegationsDelegationIdApprovePost) | **POST** /ledger/delegations/{delegationId}/approve | Approve a party delegation in \&quot;proposed\&quot; state
[**ledgerDelegationsDelegationIdCancelPost**](DelegationsApi.md#ledgerDelegationsDelegationIdCancelPost) | **POST** /ledger/delegations/{delegationId}/cancel | Cancel a party delegation in \&quot;proposed\&quot; state. Original proposer only.
[**ledgerDelegationsDelegationIdDeclinePost**](DelegationsApi.md#ledgerDelegationsDelegationIdDeclinePost) | **POST** /ledger/delegations/{delegationId}/decline | Decline a party delegation in \&quot;proposed\&quot; state
[**ledgerDelegationsDelegationIdGet**](DelegationsApi.md#ledgerDelegationsDelegationIdGet) | **GET** /ledger/delegations/{delegationId} | Read a party delegation
[**ledgerDelegationsDelegationIdRemovePost**](DelegationsApi.md#ledgerDelegationsDelegationIdRemovePost) | **POST** /ledger/delegations/{delegationId}/remove | Propose removal of a party delegation in \&quot;approved\&quot; state
[**ledgerDelegationsGet**](DelegationsApi.md#ledgerDelegationsGet) | **GET** /ledger/delegations | Read a collection of delegations.
[**ledgerDelegationsPost**](DelegationsApi.md#ledgerDelegationsPost) | **POST** /ledger/delegations | Delegate a set of workflows to a party

<a name="ledgerDelegationsDelegationIdApprovePost"></a>
# **ledgerDelegationsDelegationIdApprovePost**
> LedgerResponse ledgerDelegationsDelegationIdApprovePost(delegationId)

Approve a party delegation in \&quot;proposed\&quot; state

### Example
```java
// Import classes:
//import com.os.client.invoker.ApiClient;
//import com.os.client.invoker.ApiException;
//import com.os.client.invoker.Configuration;
//import com.os.client.invoker.auth.*;
//import com.os.client.api.DelegationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: stage_auth
OAuth stage_auth = (OAuth) defaultClient.getAuthentication("stage_auth");
stage_auth.setAccessToken("YOUR ACCESS TOKEN");

DelegationsApi apiInstance = new DelegationsApi();
String delegationId = "delegationId_example"; // String | The unique identifier of a party delegation
try {
    LedgerResponse result = apiInstance.ledgerDelegationsDelegationIdApprovePost(delegationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DelegationsApi#ledgerDelegationsDelegationIdApprovePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delegationId** | [**String**](.md)| The unique identifier of a party delegation |

### Return type

[**LedgerResponse**](LedgerResponse.md)

### Authorization

[stage_auth](../README.md#stage_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ledgerDelegationsDelegationIdCancelPost"></a>
# **ledgerDelegationsDelegationIdCancelPost**
> LedgerResponse ledgerDelegationsDelegationIdCancelPost(delegationId)

Cancel a party delegation in \&quot;proposed\&quot; state. Original proposer only.

### Example
```java
// Import classes:
//import com.os.client.invoker.ApiClient;
//import com.os.client.invoker.ApiException;
//import com.os.client.invoker.Configuration;
//import com.os.client.invoker.auth.*;
//import com.os.client.api.DelegationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: stage_auth
OAuth stage_auth = (OAuth) defaultClient.getAuthentication("stage_auth");
stage_auth.setAccessToken("YOUR ACCESS TOKEN");

DelegationsApi apiInstance = new DelegationsApi();
String delegationId = "delegationId_example"; // String | The unique identifier of a party delegation
try {
    LedgerResponse result = apiInstance.ledgerDelegationsDelegationIdCancelPost(delegationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DelegationsApi#ledgerDelegationsDelegationIdCancelPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delegationId** | [**String**](.md)| The unique identifier of a party delegation |

### Return type

[**LedgerResponse**](LedgerResponse.md)

### Authorization

[stage_auth](../README.md#stage_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ledgerDelegationsDelegationIdDeclinePost"></a>
# **ledgerDelegationsDelegationIdDeclinePost**
> LedgerResponse ledgerDelegationsDelegationIdDeclinePost(delegationId)

Decline a party delegation in \&quot;proposed\&quot; state

### Example
```java
// Import classes:
//import com.os.client.invoker.ApiClient;
//import com.os.client.invoker.ApiException;
//import com.os.client.invoker.Configuration;
//import com.os.client.invoker.auth.*;
//import com.os.client.api.DelegationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: stage_auth
OAuth stage_auth = (OAuth) defaultClient.getAuthentication("stage_auth");
stage_auth.setAccessToken("YOUR ACCESS TOKEN");

DelegationsApi apiInstance = new DelegationsApi();
String delegationId = "delegationId_example"; // String | The unique identifier of a party delegation
try {
    LedgerResponse result = apiInstance.ledgerDelegationsDelegationIdDeclinePost(delegationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DelegationsApi#ledgerDelegationsDelegationIdDeclinePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delegationId** | [**String**](.md)| The unique identifier of a party delegation |

### Return type

[**LedgerResponse**](LedgerResponse.md)

### Authorization

[stage_auth](../README.md#stage_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ledgerDelegationsDelegationIdGet"></a>
# **ledgerDelegationsDelegationIdGet**
> Delegation ledgerDelegationsDelegationIdGet(delegationId)

Read a party delegation

### Example
```java
// Import classes:
//import com.os.client.invoker.ApiClient;
//import com.os.client.invoker.ApiException;
//import com.os.client.invoker.Configuration;
//import com.os.client.invoker.auth.*;
//import com.os.client.api.DelegationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: stage_auth
OAuth stage_auth = (OAuth) defaultClient.getAuthentication("stage_auth");
stage_auth.setAccessToken("YOUR ACCESS TOKEN");

DelegationsApi apiInstance = new DelegationsApi();
String delegationId = "delegationId_example"; // String | The unique identifier of a party delegation
try {
    Delegation result = apiInstance.ledgerDelegationsDelegationIdGet(delegationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DelegationsApi#ledgerDelegationsDelegationIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delegationId** | [**String**](.md)| The unique identifier of a party delegation |

### Return type

[**Delegation**](Delegation.md)

### Authorization

[stage_auth](../README.md#stage_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ledgerDelegationsDelegationIdRemovePost"></a>
# **ledgerDelegationsDelegationIdRemovePost**
> LedgerResponse ledgerDelegationsDelegationIdRemovePost(delegationId)

Propose removal of a party delegation in \&quot;approved\&quot; state

### Example
```java
// Import classes:
//import com.os.client.invoker.ApiClient;
//import com.os.client.invoker.ApiException;
//import com.os.client.invoker.Configuration;
//import com.os.client.invoker.auth.*;
//import com.os.client.api.DelegationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: stage_auth
OAuth stage_auth = (OAuth) defaultClient.getAuthentication("stage_auth");
stage_auth.setAccessToken("YOUR ACCESS TOKEN");

DelegationsApi apiInstance = new DelegationsApi();
String delegationId = "delegationId_example"; // String | The unique identifier of a party delegation
try {
    LedgerResponse result = apiInstance.ledgerDelegationsDelegationIdRemovePost(delegationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DelegationsApi#ledgerDelegationsDelegationIdRemovePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **delegationId** | [**String**](.md)| The unique identifier of a party delegation |

### Return type

[**LedgerResponse**](LedgerResponse.md)

### Authorization

[stage_auth](../README.md#stage_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ledgerDelegationsGet"></a>
# **ledgerDelegationsGet**
> Delegations ledgerDelegationsGet(size, delegationStatus, authorization)

Read a collection of delegations.

### Example
```java
// Import classes:
//import com.os.client.invoker.ApiClient;
//import com.os.client.invoker.ApiException;
//import com.os.client.invoker.Configuration;
//import com.os.client.invoker.auth.*;
//import com.os.client.api.DelegationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: stage_auth
OAuth stage_auth = (OAuth) defaultClient.getAuthentication("stage_auth");
stage_auth.setAccessToken("YOUR ACCESS TOKEN");

DelegationsApi apiInstance = new DelegationsApi();
Integer size = 56; // Integer | Number of delegation contracts to be returned. Can be used to facilitate paging
DelegationStatus delegationStatus = new DelegationStatus(); // DelegationStatus | Delegations with status matching DELEGATION STATUS
DelegationAuthorizationType authorization = new DelegationAuthorizationType(); // DelegationAuthorizationType | Delegations with authorization type matching AUTHORIZATION
try {
    Delegations result = apiInstance.ledgerDelegationsGet(size, delegationStatus, authorization);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DelegationsApi#ledgerDelegationsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **size** | **Integer**| Number of delegation contracts to be returned. Can be used to facilitate paging | [optional]
 **delegationStatus** | [**DelegationStatus**](.md)| Delegations with status matching DELEGATION STATUS | [optional]
 **authorization** | [**DelegationAuthorizationType**](.md)| Delegations with authorization type matching AUTHORIZATION | [optional]

### Return type

[**Delegations**](Delegations.md)

### Authorization

[stage_auth](../README.md#stage_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ledgerDelegationsPost"></a>
# **ledgerDelegationsPost**
> LedgerResponse ledgerDelegationsPost(body)

Delegate a set of workflows to a party

### Example
```java
// Import classes:
//import com.os.client.invoker.ApiClient;
//import com.os.client.invoker.ApiException;
//import com.os.client.invoker.Configuration;
//import com.os.client.invoker.auth.*;
//import com.os.client.api.DelegationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: stage_auth
OAuth stage_auth = (OAuth) defaultClient.getAuthentication("stage_auth");
stage_auth.setAccessToken("YOUR ACCESS TOKEN");

DelegationsApi apiInstance = new DelegationsApi();
DelegationProposal body = new DelegationProposal(); // DelegationProposal | Define a new venue delegate
try {
    LedgerResponse result = apiInstance.ledgerDelegationsPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DelegationsApi#ledgerDelegationsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DelegationProposal**](DelegationProposal.md)| Define a new venue delegate |

### Return type

[**LedgerResponse**](LedgerResponse.md)

### Authorization

[stage_auth](../README.md#stage_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


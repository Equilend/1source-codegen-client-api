# LoansApi

All URIs are relative to *https://stageapi.equilend.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ledgerLoansGet**](LoansApi.md#ledgerLoansGet) | **GET** /ledger/loans | Read a collection of loans. Defaults to return the last 100 loans updated.
[**ledgerLoansLoanIdApprovePost**](LoansApi.md#ledgerLoansLoanIdApprovePost) | **POST** /ledger/loans/{loanId}/approve | Approve a loan in \&quot;proposed\&quot; state
[**ledgerLoansLoanIdCancelPost**](LoansApi.md#ledgerLoansLoanIdCancelPost) | **POST** /ledger/loans/{loanId}/cancel | Cancel a loan in \&quot;proposed\&quot; state. Original proposer only.
[**ledgerLoansLoanIdCancelpendingPost**](LoansApi.md#ledgerLoansLoanIdCancelpendingPost) | **POST** /ledger/loans/{loanId}/cancelpending | Cancel a loan in \&quot;pending\&quot; state. Either party can initiate.
[**ledgerLoansLoanIdDeclinePost**](LoansApi.md#ledgerLoansLoanIdDeclinePost) | **POST** /ledger/loans/{loanId}/decline | Decline a loan in \&quot;proposed\&quot; state
[**ledgerLoansLoanIdGet**](LoansApi.md#ledgerLoansLoanIdGet) | **GET** /ledger/loans/{loanId} | Read a specific loan the user is authorized to access
[**ledgerLoansLoanIdHistoryGet**](LoansApi.md#ledgerLoansLoanIdHistoryGet) | **GET** /ledger/loans/{loanId}/history | Return an ordered history of this loan. Each loan has a reference event that triggered a new version.
[**ledgerLoansLoanIdPatch**](LoansApi.md#ledgerLoansLoanIdPatch) | **PATCH** /ledger/loans/{loanId} | Update unilateral fields in a loan
[**ledgerLoansLoanIdRatehistoryGet**](LoansApi.md#ledgerLoansLoanIdRatehistoryGet) | **GET** /ledger/loans/{loanId}/ratehistory | Return an ordered history of effective rate changes.
[**ledgerLoansLoanIdSplitLoanSplitIdApprovePost**](LoansApi.md#ledgerLoansLoanIdSplitLoanSplitIdApprovePost) | **POST** /ledger/loans/{loanId}/split/{loanSplitId}/approve | Approve a loan split in \&quot;proposed\&quot; state.
[**ledgerLoansLoanIdSplitLoanSplitIdGet**](LoansApi.md#ledgerLoansLoanIdSplitLoanSplitIdGet) | **GET** /ledger/loans/{loanId}/split/{loanSplitId} | Retrieve a loan split.
[**ledgerLoansLoanIdSplitPost**](LoansApi.md#ledgerLoansLoanIdSplitPost) | **POST** /ledger/loans/{loanId}/split | Split an open loan into multiple lots
[**ledgerLoansPost**](LoansApi.md#ledgerLoansPost) | **POST** /ledger/loans | Create a loan in \&quot;proposal\&quot; state. Normally done by the Lend side

<a name="ledgerLoansGet"></a>
# **ledgerLoansGet**
> Loans ledgerLoansGet(since, before, size, loanStatus, figi, sedol, cusip, ticker, isin, internalRefId, partyId, venueRefKey)

Read a collection of loans. Defaults to return the last 100 loans updated.

### Example
```java
// Import classes:
//import com.os.client.invoker.ApiClient;
//import com.os.client.invoker.ApiException;
//import com.os.client.invoker.Configuration;
//import com.os.client.invoker.auth.*;
//import com.os.client.api.LoansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: stage_auth
OAuth stage_auth = (OAuth) defaultClient.getAuthentication("stage_auth");
stage_auth.setAccessToken("YOUR ACCESS TOKEN");

LoansApi apiInstance = new LoansApi();
OffsetDateTime since = new OffsetDateTime(); // OffsetDateTime | Loans updated (since) timestamp UTC
OffsetDateTime before = new OffsetDateTime(); // OffsetDateTime | Loans updated (before) timestamp UTC
Integer size = 56; // Integer | Number of loans to be returned. Can be used to facilitate paging
LoanStatus loanStatus = new LoanStatus(); // LoanStatus | Loans with status matching LOAN STATUS
String figi = "figi_example"; // String | Loans with instrument matching FIGI
String sedol = "sedol_example"; // String | Loans with instrument matching SEDOL
String cusip = "cusip_example"; // String | Loans with instrument matching CUSIP
String ticker = "ticker_example"; // String | Loans with instrument matching TICKER
String isin = "isin_example"; // String | Loans with instrument matching ISIN
String internalRefId = "internalRefId_example"; // String | Loans with internalRef matching INTERNAL REF ID
String partyId = "partyId_example"; // String | Loans with a transacting party mathing PARTY ID
String venueRefKey = "venueRefKey_example"; // String | Loans with venueRefKey matching VENUE REF KEY
try {
    Loans result = apiInstance.ledgerLoansGet(since, before, size, loanStatus, figi, sedol, cusip, ticker, isin, internalRefId, partyId, venueRefKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoansApi#ledgerLoansGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **since** | **OffsetDateTime**| Loans updated (since) timestamp UTC | [optional]
 **before** | **OffsetDateTime**| Loans updated (before) timestamp UTC | [optional]
 **size** | **Integer**| Number of loans to be returned. Can be used to facilitate paging | [optional]
 **loanStatus** | [**LoanStatus**](.md)| Loans with status matching LOAN STATUS | [optional]
 **figi** | **String**| Loans with instrument matching FIGI | [optional]
 **sedol** | **String**| Loans with instrument matching SEDOL | [optional]
 **cusip** | **String**| Loans with instrument matching CUSIP | [optional]
 **ticker** | **String**| Loans with instrument matching TICKER | [optional]
 **isin** | **String**| Loans with instrument matching ISIN | [optional]
 **internalRefId** | **String**| Loans with internalRef matching INTERNAL REF ID | [optional]
 **partyId** | [**String**](.md)| Loans with a transacting party mathing PARTY ID | [optional]
 **venueRefKey** | **String**| Loans with venueRefKey matching VENUE REF KEY | [optional]

### Return type

[**Loans**](Loans.md)

### Authorization

[stage_auth](../README.md#stage_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ledgerLoansLoanIdApprovePost"></a>
# **ledgerLoansLoanIdApprovePost**
> LedgerResponse ledgerLoansLoanIdApprovePost(body, loanId)

Approve a loan in \&quot;proposed\&quot; state

### Example
```java
// Import classes:
//import com.os.client.invoker.ApiClient;
//import com.os.client.invoker.ApiException;
//import com.os.client.invoker.Configuration;
//import com.os.client.invoker.auth.*;
//import com.os.client.api.LoansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: stage_auth
OAuth stage_auth = (OAuth) defaultClient.getAuthentication("stage_auth");
stage_auth.setAccessToken("YOUR ACCESS TOKEN");

LoansApi apiInstance = new LoansApi();
LoanProposalApproval body = new LoanProposalApproval(); // LoanProposalApproval | Update settlement instructions on an existing loan
String loanId = "loanId_example"; // String | The unique identifier of a loan
try {
    LedgerResponse result = apiInstance.ledgerLoansLoanIdApprovePost(body, loanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoansApi#ledgerLoansLoanIdApprovePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LoanProposalApproval**](LoanProposalApproval.md)| Update settlement instructions on an existing loan |
 **loanId** | [**String**](.md)| The unique identifier of a loan |

### Return type

[**LedgerResponse**](LedgerResponse.md)

### Authorization

[stage_auth](../README.md#stage_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ledgerLoansLoanIdCancelPost"></a>
# **ledgerLoansLoanIdCancelPost**
> LedgerResponse ledgerLoansLoanIdCancelPost(loanId)

Cancel a loan in \&quot;proposed\&quot; state. Original proposer only.

### Example
```java
// Import classes:
//import com.os.client.invoker.ApiClient;
//import com.os.client.invoker.ApiException;
//import com.os.client.invoker.Configuration;
//import com.os.client.invoker.auth.*;
//import com.os.client.api.LoansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: stage_auth
OAuth stage_auth = (OAuth) defaultClient.getAuthentication("stage_auth");
stage_auth.setAccessToken("YOUR ACCESS TOKEN");

LoansApi apiInstance = new LoansApi();
String loanId = "loanId_example"; // String | The unique identifier of a loan
try {
    LedgerResponse result = apiInstance.ledgerLoansLoanIdCancelPost(loanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoansApi#ledgerLoansLoanIdCancelPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loanId** | [**String**](.md)| The unique identifier of a loan |

### Return type

[**LedgerResponse**](LedgerResponse.md)

### Authorization

[stage_auth](../README.md#stage_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ledgerLoansLoanIdCancelpendingPost"></a>
# **ledgerLoansLoanIdCancelpendingPost**
> LedgerResponse ledgerLoansLoanIdCancelpendingPost(loanId)

Cancel a loan in \&quot;pending\&quot; state. Either party can initiate.

### Example
```java
// Import classes:
//import com.os.client.invoker.ApiClient;
//import com.os.client.invoker.ApiException;
//import com.os.client.invoker.Configuration;
//import com.os.client.invoker.auth.*;
//import com.os.client.api.LoansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: stage_auth
OAuth stage_auth = (OAuth) defaultClient.getAuthentication("stage_auth");
stage_auth.setAccessToken("YOUR ACCESS TOKEN");

LoansApi apiInstance = new LoansApi();
String loanId = "loanId_example"; // String | The unique identifier of a loan
try {
    LedgerResponse result = apiInstance.ledgerLoansLoanIdCancelpendingPost(loanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoansApi#ledgerLoansLoanIdCancelpendingPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loanId** | [**String**](.md)| The unique identifier of a loan |

### Return type

[**LedgerResponse**](LedgerResponse.md)

### Authorization

[stage_auth](../README.md#stage_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ledgerLoansLoanIdDeclinePost"></a>
# **ledgerLoansLoanIdDeclinePost**
> LedgerResponse ledgerLoansLoanIdDeclinePost(loanId)

Decline a loan in \&quot;proposed\&quot; state

### Example
```java
// Import classes:
//import com.os.client.invoker.ApiClient;
//import com.os.client.invoker.ApiException;
//import com.os.client.invoker.Configuration;
//import com.os.client.invoker.auth.*;
//import com.os.client.api.LoansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: stage_auth
OAuth stage_auth = (OAuth) defaultClient.getAuthentication("stage_auth");
stage_auth.setAccessToken("YOUR ACCESS TOKEN");

LoansApi apiInstance = new LoansApi();
String loanId = "loanId_example"; // String | The unique identifier of a loan
try {
    LedgerResponse result = apiInstance.ledgerLoansLoanIdDeclinePost(loanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoansApi#ledgerLoansLoanIdDeclinePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loanId** | [**String**](.md)| The unique identifier of a loan |

### Return type

[**LedgerResponse**](LedgerResponse.md)

### Authorization

[stage_auth](../README.md#stage_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ledgerLoansLoanIdGet"></a>
# **ledgerLoansLoanIdGet**
> Loan ledgerLoansLoanIdGet(loanId)

Read a specific loan the user is authorized to access

### Example
```java
// Import classes:
//import com.os.client.invoker.ApiClient;
//import com.os.client.invoker.ApiException;
//import com.os.client.invoker.Configuration;
//import com.os.client.invoker.auth.*;
//import com.os.client.api.LoansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: stage_auth
OAuth stage_auth = (OAuth) defaultClient.getAuthentication("stage_auth");
stage_auth.setAccessToken("YOUR ACCESS TOKEN");

LoansApi apiInstance = new LoansApi();
String loanId = "loanId_example"; // String | The unique identifier of a loan
try {
    Loan result = apiInstance.ledgerLoansLoanIdGet(loanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoansApi#ledgerLoansLoanIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loanId** | [**String**](.md)| The unique identifier of a loan |

### Return type

[**Loan**](Loan.md)

### Authorization

[stage_auth](../README.md#stage_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ledgerLoansLoanIdHistoryGet"></a>
# **ledgerLoansLoanIdHistoryGet**
> Loans ledgerLoansLoanIdHistoryGet(loanId, since, before, size)

Return an ordered history of this loan. Each loan has a reference event that triggered a new version.

### Example
```java
// Import classes:
//import com.os.client.invoker.ApiClient;
//import com.os.client.invoker.ApiException;
//import com.os.client.invoker.Configuration;
//import com.os.client.invoker.auth.*;
//import com.os.client.api.LoansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: stage_auth
OAuth stage_auth = (OAuth) defaultClient.getAuthentication("stage_auth");
stage_auth.setAccessToken("YOUR ACCESS TOKEN");

LoansApi apiInstance = new LoansApi();
String loanId = "loanId_example"; // String | The unique identifier of a loan
OffsetDateTime since = new OffsetDateTime(); // OffsetDateTime | Events (since) timestamp UTC
OffsetDateTime before = new OffsetDateTime(); // OffsetDateTime | Events (before) timestamp UTC
Integer size = 56; // Integer | Number of loan changes to be returned. Can be used to facilitate paging
try {
    Loans result = apiInstance.ledgerLoansLoanIdHistoryGet(loanId, since, before, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoansApi#ledgerLoansLoanIdHistoryGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loanId** | [**String**](.md)| The unique identifier of a loan |
 **since** | **OffsetDateTime**| Events (since) timestamp UTC | [optional]
 **before** | **OffsetDateTime**| Events (before) timestamp UTC | [optional]
 **size** | **Integer**| Number of loan changes to be returned. Can be used to facilitate paging | [optional]

### Return type

[**Loans**](Loans.md)

### Authorization

[stage_auth](../README.md#stage_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ledgerLoansLoanIdPatch"></a>
# **ledgerLoansLoanIdPatch**
> LedgerResponse ledgerLoansLoanIdPatch(loanId, body)

Update unilateral fields in a loan

### Example
```java
// Import classes:
//import com.os.client.invoker.ApiClient;
//import com.os.client.invoker.ApiException;
//import com.os.client.invoker.Configuration;
//import com.os.client.invoker.auth.*;
//import com.os.client.api.LoansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: stage_auth
OAuth stage_auth = (OAuth) defaultClient.getAuthentication("stage_auth");
stage_auth.setAccessToken("YOUR ACCESS TOKEN");

LoansApi apiInstance = new LoansApi();
String loanId = "loanId_example"; // String | The unique identifier of a loan
LoansLoanIdBody body = new LoansLoanIdBody(); // LoansLoanIdBody | 
try {
    LedgerResponse result = apiInstance.ledgerLoansLoanIdPatch(loanId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoansApi#ledgerLoansLoanIdPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loanId** | [**String**](.md)| The unique identifier of a loan |
 **body** | [**LoansLoanIdBody**](LoansLoanIdBody.md)|  | [optional]

### Return type

[**LedgerResponse**](LedgerResponse.md)

### Authorization

[stage_auth](../README.md#stage_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ledgerLoansLoanIdRatehistoryGet"></a>
# **ledgerLoansLoanIdRatehistoryGet**
> Rates ledgerLoansLoanIdRatehistoryGet(loanId, since, before, size)

Return an ordered history of effective rate changes.

### Example
```java
// Import classes:
//import com.os.client.invoker.ApiClient;
//import com.os.client.invoker.ApiException;
//import com.os.client.invoker.Configuration;
//import com.os.client.invoker.auth.*;
//import com.os.client.api.LoansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: stage_auth
OAuth stage_auth = (OAuth) defaultClient.getAuthentication("stage_auth");
stage_auth.setAccessToken("YOUR ACCESS TOKEN");

LoansApi apiInstance = new LoansApi();
String loanId = "loanId_example"; // String | The unique identifier of a loan
OffsetDateTime since = new OffsetDateTime(); // OffsetDateTime | Events (since) timestamp UTC
OffsetDateTime before = new OffsetDateTime(); // OffsetDateTime | Events (before) timestamp UTC
Integer size = 56; // Integer | Number of effective rates to be returned. Can be used to facilitate paging
try {
    Rates result = apiInstance.ledgerLoansLoanIdRatehistoryGet(loanId, since, before, size);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoansApi#ledgerLoansLoanIdRatehistoryGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loanId** | [**String**](.md)| The unique identifier of a loan |
 **since** | **OffsetDateTime**| Events (since) timestamp UTC | [optional]
 **before** | **OffsetDateTime**| Events (before) timestamp UTC | [optional]
 **size** | **Integer**| Number of effective rates to be returned. Can be used to facilitate paging | [optional]

### Return type

[**Rates**](Rates.md)

### Authorization

[stage_auth](../README.md#stage_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ledgerLoansLoanIdSplitLoanSplitIdApprovePost"></a>
# **ledgerLoansLoanIdSplitLoanSplitIdApprovePost**
> LedgerResponse ledgerLoansLoanIdSplitLoanSplitIdApprovePost(body, loanId, loanSplitId)

Approve a loan split in \&quot;proposed\&quot; state.

### Example
```java
// Import classes:
//import com.os.client.invoker.ApiClient;
//import com.os.client.invoker.ApiException;
//import com.os.client.invoker.Configuration;
//import com.os.client.invoker.auth.*;
//import com.os.client.api.LoansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: stage_auth
OAuth stage_auth = (OAuth) defaultClient.getAuthentication("stage_auth");
stage_auth.setAccessToken("YOUR ACCESS TOKEN");

LoansApi apiInstance = new LoansApi();
List<LoanSplitLotAppoval> body = Arrays.asList(new LoanSplitLotAppoval()); // List<LoanSplitLotAppoval> | Split proposed against loan
String loanId = "loanId_example"; // String | The unique identifier of a loan
String loanSplitId = "loanSplitId_example"; // String | The unique identifier of a proposed loan split
try {
    LedgerResponse result = apiInstance.ledgerLoansLoanIdSplitLoanSplitIdApprovePost(body, loanId, loanSplitId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoansApi#ledgerLoansLoanIdSplitLoanSplitIdApprovePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;LoanSplitLotAppoval&gt;**](LoanSplitLotAppoval.md)| Split proposed against loan |
 **loanId** | [**String**](.md)| The unique identifier of a loan |
 **loanSplitId** | [**String**](.md)| The unique identifier of a proposed loan split |

### Return type

[**LedgerResponse**](LedgerResponse.md)

### Authorization

[stage_auth](../README.md#stage_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ledgerLoansLoanIdSplitLoanSplitIdGet"></a>
# **ledgerLoansLoanIdSplitLoanSplitIdGet**
> LoanSplit ledgerLoansLoanIdSplitLoanSplitIdGet(loanId, loanSplitId)

Retrieve a loan split.

### Example
```java
// Import classes:
//import com.os.client.invoker.ApiClient;
//import com.os.client.invoker.ApiException;
//import com.os.client.invoker.Configuration;
//import com.os.client.invoker.auth.*;
//import com.os.client.api.LoansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: stage_auth
OAuth stage_auth = (OAuth) defaultClient.getAuthentication("stage_auth");
stage_auth.setAccessToken("YOUR ACCESS TOKEN");

LoansApi apiInstance = new LoansApi();
String loanId = "loanId_example"; // String | The unique identifier of a loan
String loanSplitId = "loanSplitId_example"; // String | The unique identifier of a loan split
try {
    LoanSplit result = apiInstance.ledgerLoansLoanIdSplitLoanSplitIdGet(loanId, loanSplitId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoansApi#ledgerLoansLoanIdSplitLoanSplitIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loanId** | [**String**](.md)| The unique identifier of a loan |
 **loanSplitId** | [**String**](.md)| The unique identifier of a loan split |

### Return type

[**LoanSplit**](LoanSplit.md)

### Authorization

[stage_auth](../README.md#stage_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ledgerLoansLoanIdSplitPost"></a>
# **ledgerLoansLoanIdSplitPost**
> LedgerResponse ledgerLoansLoanIdSplitPost(body, loanId)

Split an open loan into multiple lots

### Example
```java
// Import classes:
//import com.os.client.invoker.ApiClient;
//import com.os.client.invoker.ApiException;
//import com.os.client.invoker.Configuration;
//import com.os.client.invoker.auth.*;
//import com.os.client.api.LoansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: stage_auth
OAuth stage_auth = (OAuth) defaultClient.getAuthentication("stage_auth");
stage_auth.setAccessToken("YOUR ACCESS TOKEN");

LoansApi apiInstance = new LoansApi();
List<LoanSplitLot> body = Arrays.asList(new LoanSplitLot()); // List<LoanSplitLot> | Split proposed against loan
String loanId = "loanId_example"; // String | The unique identifier of a loan
try {
    LedgerResponse result = apiInstance.ledgerLoansLoanIdSplitPost(body, loanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoansApi#ledgerLoansLoanIdSplitPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**List&lt;LoanSplitLot&gt;**](LoanSplitLot.md)| Split proposed against loan |
 **loanId** | [**String**](.md)| The unique identifier of a loan |

### Return type

[**LedgerResponse**](LedgerResponse.md)

### Authorization

[stage_auth](../README.md#stage_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ledgerLoansPost"></a>
# **ledgerLoansPost**
> LedgerResponse ledgerLoansPost(body)

Create a loan in \&quot;proposal\&quot; state. Normally done by the Lend side

### Example
```java
// Import classes:
//import com.os.client.invoker.ApiClient;
//import com.os.client.invoker.ApiException;
//import com.os.client.invoker.Configuration;
//import com.os.client.invoker.auth.*;
//import com.os.client.api.LoansApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: stage_auth
OAuth stage_auth = (OAuth) defaultClient.getAuthentication("stage_auth");
stage_auth.setAccessToken("YOUR ACCESS TOKEN");

LoansApi apiInstance = new LoansApi();
LoanProposal body = new LoanProposal(); // LoanProposal | New loan proposed for inclusion in the ledger
try {
    LedgerResponse result = apiInstance.ledgerLoansPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LoansApi#ledgerLoansPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LoanProposal**](LoanProposal.md)| New loan proposed for inclusion in the ledger |

### Return type

[**LedgerResponse**](LedgerResponse.md)

### Authorization

[stage_auth](../README.md#stage_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

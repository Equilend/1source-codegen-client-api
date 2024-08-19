# BuyinsApi

All URIs are relative to *https://stageapi.equilend.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ledgerBuyinsCompletesBuyinCompleteIdGet**](BuyinsApi.md#ledgerBuyinsCompletesBuyinCompleteIdGet) | **GET** /ledger/buyins/completes/{buyinCompleteId} | Read a completed buyin
[**ledgerBuyinsCompletesGet**](BuyinsApi.md#ledgerBuyinsCompletesGet) | **GET** /ledger/buyins/completes | Read collection of completed buyins
[**ledgerBuyinsInitiatesBuyinInitiateIdGet**](BuyinsApi.md#ledgerBuyinsInitiatesBuyinInitiateIdGet) | **GET** /ledger/buyins/initiates/{buyinInitiateId} | Read an initiated buyin
[**ledgerBuyinsInitiatesGet**](BuyinsApi.md#ledgerBuyinsInitiatesGet) | **GET** /ledger/buyins/initiates | Read collection of initiated buyins
[**ledgerLoansLoanIdBuyinsCompletesBuyinCompleteIdAcceptPost**](BuyinsApi.md#ledgerLoansLoanIdBuyinsCompletesBuyinCompleteIdAcceptPost) | **POST** /ledger/loans/{loanId}/buyins/completes/{buyinCompleteId}/accept | Complete some or all of an initiated Buyin
[**ledgerLoansLoanIdBuyinsCompletesBuyinCompleteIdGet**](BuyinsApi.md#ledgerLoansLoanIdBuyinsCompletesBuyinCompleteIdGet) | **GET** /ledger/loans/{loanId}/buyins/completes/{buyinCompleteId} | Read a completed Buyin
[**ledgerLoansLoanIdBuyinsCompletesGet**](BuyinsApi.md#ledgerLoansLoanIdBuyinsCompletesGet) | **GET** /ledger/loans/{loanId}/buyins/completes | Read collection of completed buyins against loan specified by &#x27;loanId&#x27;
[**ledgerLoansLoanIdBuyinsCompletesPost**](BuyinsApi.md#ledgerLoansLoanIdBuyinsCompletesPost) | **POST** /ledger/loans/{loanId}/buyins/completes | Complete a buyin
[**ledgerLoansLoanIdBuyinsInitiatesBuyinInitiateIdCancelPost**](BuyinsApi.md#ledgerLoansLoanIdBuyinsInitiatesBuyinInitiateIdCancelPost) | **POST** /ledger/loans/{loanId}/buyins/initiates/{buyinInitiateId}/cancel | Cancel an initiated buyin. Original proposer only.
[**ledgerLoansLoanIdBuyinsInitiatesBuyinInitiateIdGet**](BuyinsApi.md#ledgerLoansLoanIdBuyinsInitiatesBuyinInitiateIdGet) | **GET** /ledger/loans/{loanId}/buyins/initiates/{buyinInitiateId} | Read an initiated buyin
[**ledgerLoansLoanIdBuyinsInitiatesGet**](BuyinsApi.md#ledgerLoansLoanIdBuyinsInitiatesGet) | **GET** /ledger/loans/{loanId}/buyins/initiates | Read collection of initiated buyins against loan specified by &#x27;loanId&#x27;
[**ledgerLoansLoanIdBuyinsInitiatesPost**](BuyinsApi.md#ledgerLoansLoanIdBuyinsInitiatesPost) | **POST** /ledger/loans/{loanId}/buyins/initiates | Initiate a buyin

<a name="ledgerBuyinsCompletesBuyinCompleteIdGet"></a>
# **ledgerBuyinsCompletesBuyinCompleteIdGet**
> BuyinComplete ledgerBuyinsCompletesBuyinCompleteIdGet(buyinCompleteId)

Read a completed buyin

### Example
```java
// Import classes:
//import com.os.client.invoker.ApiClient;
//import com.os.client.invoker.ApiException;
//import com.os.client.invoker.Configuration;
//import com.os.client.invoker.auth.*;
//import com.os.client.api.BuyinsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: stage_auth
OAuth stage_auth = (OAuth) defaultClient.getAuthentication("stage_auth");
stage_auth.setAccessToken("YOUR ACCESS TOKEN");

BuyinsApi apiInstance = new BuyinsApi();
String buyinCompleteId = "buyinCompleteId_example"; // String | The unique identifier of a completed buyin
try {
    BuyinComplete result = apiInstance.ledgerBuyinsCompletesBuyinCompleteIdGet(buyinCompleteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuyinsApi#ledgerBuyinsCompletesBuyinCompleteIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyinCompleteId** | [**String**](.md)| The unique identifier of a completed buyin |

### Return type

[**BuyinComplete**](BuyinComplete.md)

### Authorization

[stage_auth](../README.md#stage_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ledgerBuyinsCompletesGet"></a>
# **ledgerBuyinsCompletesGet**
> BuyinCompletes ledgerBuyinsCompletesGet(since, before, size, buyinCompleteStatus, figi, sedol, cusip, ticker, isin, partyId, venueRefKey)

Read collection of completed buyins

### Example
```java
// Import classes:
//import com.os.client.invoker.ApiClient;
//import com.os.client.invoker.ApiException;
//import com.os.client.invoker.Configuration;
//import com.os.client.invoker.auth.*;
//import com.os.client.api.BuyinsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: stage_auth
OAuth stage_auth = (OAuth) defaultClient.getAuthentication("stage_auth");
stage_auth.setAccessToken("YOUR ACCESS TOKEN");

BuyinsApi apiInstance = new BuyinsApi();
OffsetDateTime since = new OffsetDateTime(); // OffsetDateTime | Completed buyins updated (since) timestamp UTC
OffsetDateTime before = new OffsetDateTime(); // OffsetDateTime | Completed buyins updated (before) timestamp UTC
Integer size = 56; // Integer | Number of completed buyins to be returned. Can be used to facilitate paging
BuyinCompleteStatus buyinCompleteStatus = new BuyinCompleteStatus(); // BuyinCompleteStatus | Completed buyins matching status BUYIN COMPLETE STATUS
String figi = "figi_example"; // String | Completed buyins with instrument matching FIGI
String sedol = "sedol_example"; // String | Completed buyins with instrument matching SEDOL
String cusip = "cusip_example"; // String | Completed buyins with instrument matching CUSIP
String ticker = "ticker_example"; // String | Completed buyins with instrument matching TICKER
String isin = "isin_example"; // String | Completed buyins with instrument matching ISIN
String partyId = "partyId_example"; // String | Completed buyins with a transacting party mathing PARTY ID
String venueRefKey = "venueRefKey_example"; // String | Completed buyins with venueRefKey matching VENUE REF KEY
try {
    BuyinCompletes result = apiInstance.ledgerBuyinsCompletesGet(since, before, size, buyinCompleteStatus, figi, sedol, cusip, ticker, isin, partyId, venueRefKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuyinsApi#ledgerBuyinsCompletesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **since** | **OffsetDateTime**| Completed buyins updated (since) timestamp UTC | [optional]
 **before** | **OffsetDateTime**| Completed buyins updated (before) timestamp UTC | [optional]
 **size** | **Integer**| Number of completed buyins to be returned. Can be used to facilitate paging | [optional]
 **buyinCompleteStatus** | [**BuyinCompleteStatus**](.md)| Completed buyins matching status BUYIN COMPLETE STATUS | [optional]
 **figi** | **String**| Completed buyins with instrument matching FIGI | [optional]
 **sedol** | **String**| Completed buyins with instrument matching SEDOL | [optional]
 **cusip** | **String**| Completed buyins with instrument matching CUSIP | [optional]
 **ticker** | **String**| Completed buyins with instrument matching TICKER | [optional]
 **isin** | **String**| Completed buyins with instrument matching ISIN | [optional]
 **partyId** | [**String**](.md)| Completed buyins with a transacting party mathing PARTY ID | [optional]
 **venueRefKey** | **String**| Completed buyins with venueRefKey matching VENUE REF KEY | [optional]

### Return type

[**BuyinCompletes**](BuyinCompletes.md)

### Authorization

[stage_auth](../README.md#stage_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ledgerBuyinsInitiatesBuyinInitiateIdGet"></a>
# **ledgerBuyinsInitiatesBuyinInitiateIdGet**
> BuyinInitiate ledgerBuyinsInitiatesBuyinInitiateIdGet(buyinInitiateId)

Read an initiated buyin

### Example
```java
// Import classes:
//import com.os.client.invoker.ApiClient;
//import com.os.client.invoker.ApiException;
//import com.os.client.invoker.Configuration;
//import com.os.client.invoker.auth.*;
//import com.os.client.api.BuyinsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: stage_auth
OAuth stage_auth = (OAuth) defaultClient.getAuthentication("stage_auth");
stage_auth.setAccessToken("YOUR ACCESS TOKEN");

BuyinsApi apiInstance = new BuyinsApi();
String buyinInitiateId = "buyinInitiateId_example"; // String | The unique identifier of an initiated buyin
try {
    BuyinInitiate result = apiInstance.ledgerBuyinsInitiatesBuyinInitiateIdGet(buyinInitiateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuyinsApi#ledgerBuyinsInitiatesBuyinInitiateIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyinInitiateId** | [**String**](.md)| The unique identifier of an initiated buyin |

### Return type

[**BuyinInitiate**](BuyinInitiate.md)

### Authorization

[stage_auth](../README.md#stage_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ledgerBuyinsInitiatesGet"></a>
# **ledgerBuyinsInitiatesGet**
> BuyinInitiates ledgerBuyinsInitiatesGet(since, before, size, buyinInitiateStatus, figi, sedol, cusip, ticker, isin, partyId, venueRefKey)

Read collection of initiated buyins

### Example
```java
// Import classes:
//import com.os.client.invoker.ApiClient;
//import com.os.client.invoker.ApiException;
//import com.os.client.invoker.Configuration;
//import com.os.client.invoker.auth.*;
//import com.os.client.api.BuyinsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: stage_auth
OAuth stage_auth = (OAuth) defaultClient.getAuthentication("stage_auth");
stage_auth.setAccessToken("YOUR ACCESS TOKEN");

BuyinsApi apiInstance = new BuyinsApi();
OffsetDateTime since = new OffsetDateTime(); // OffsetDateTime | Initiated buyins updated (since) timestamp UTC
OffsetDateTime before = new OffsetDateTime(); // OffsetDateTime | Initiated buyins updated (before) timestamp UTC
Integer size = 56; // Integer | Number of initiated buyins to be returned. Can be used to facilitate paging
BuyinInitiateStatus buyinInitiateStatus = new BuyinInitiateStatus(); // BuyinInitiateStatus | Initiated buyins matching status BUYIN INITIATE STATUS
String figi = "figi_example"; // String | Initiated buyins with instrument matching FIGI
String sedol = "sedol_example"; // String | Initiated buyins with instrument matching SEDOL
String cusip = "cusip_example"; // String | Initiated buyins with instrument matching CUSIP
String ticker = "ticker_example"; // String | Initiated buyins with instrument matching TICKER
String isin = "isin_example"; // String | Initiated buyins with instrument matching ISIN
String partyId = "partyId_example"; // String | Initiated buyins with a transacting party mathing PARTY ID
String venueRefKey = "venueRefKey_example"; // String | Initiated buyins with venueRefKey matching VENUE REF KEY
try {
    BuyinInitiates result = apiInstance.ledgerBuyinsInitiatesGet(since, before, size, buyinInitiateStatus, figi, sedol, cusip, ticker, isin, partyId, venueRefKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuyinsApi#ledgerBuyinsInitiatesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **since** | **OffsetDateTime**| Initiated buyins updated (since) timestamp UTC | [optional]
 **before** | **OffsetDateTime**| Initiated buyins updated (before) timestamp UTC | [optional]
 **size** | **Integer**| Number of initiated buyins to be returned. Can be used to facilitate paging | [optional]
 **buyinInitiateStatus** | [**BuyinInitiateStatus**](.md)| Initiated buyins matching status BUYIN INITIATE STATUS | [optional]
 **figi** | **String**| Initiated buyins with instrument matching FIGI | [optional]
 **sedol** | **String**| Initiated buyins with instrument matching SEDOL | [optional]
 **cusip** | **String**| Initiated buyins with instrument matching CUSIP | [optional]
 **ticker** | **String**| Initiated buyins with instrument matching TICKER | [optional]
 **isin** | **String**| Initiated buyins with instrument matching ISIN | [optional]
 **partyId** | [**String**](.md)| Initiated buyins with a transacting party mathing PARTY ID | [optional]
 **venueRefKey** | **String**| Initiated buyins with venueRefKey matching VENUE REF KEY | [optional]

### Return type

[**BuyinInitiates**](BuyinInitiates.md)

### Authorization

[stage_auth](../README.md#stage_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ledgerLoansLoanIdBuyinsCompletesBuyinCompleteIdAcceptPost"></a>
# **ledgerLoansLoanIdBuyinsCompletesBuyinCompleteIdAcceptPost**
> LedgerResponse ledgerLoansLoanIdBuyinsCompletesBuyinCompleteIdAcceptPost(loanId, buyinCompleteId)

Complete some or all of an initiated Buyin

### Example
```java
// Import classes:
//import com.os.client.invoker.ApiClient;
//import com.os.client.invoker.ApiException;
//import com.os.client.invoker.Configuration;
//import com.os.client.invoker.auth.*;
//import com.os.client.api.BuyinsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: stage_auth
OAuth stage_auth = (OAuth) defaultClient.getAuthentication("stage_auth");
stage_auth.setAccessToken("YOUR ACCESS TOKEN");

BuyinsApi apiInstance = new BuyinsApi();
String loanId = "loanId_example"; // String | The unique identifier of a loan
String buyinCompleteId = "buyinCompleteId_example"; // String | The unique identifier of a completed buyin
try {
    LedgerResponse result = apiInstance.ledgerLoansLoanIdBuyinsCompletesBuyinCompleteIdAcceptPost(loanId, buyinCompleteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuyinsApi#ledgerLoansLoanIdBuyinsCompletesBuyinCompleteIdAcceptPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loanId** | [**String**](.md)| The unique identifier of a loan |
 **buyinCompleteId** | [**String**](.md)| The unique identifier of a completed buyin |

### Return type

[**LedgerResponse**](LedgerResponse.md)

### Authorization

[stage_auth](../README.md#stage_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ledgerLoansLoanIdBuyinsCompletesBuyinCompleteIdGet"></a>
# **ledgerLoansLoanIdBuyinsCompletesBuyinCompleteIdGet**
> BuyinComplete ledgerLoansLoanIdBuyinsCompletesBuyinCompleteIdGet(loanId, buyinCompleteId)

Read a completed Buyin

### Example
```java
// Import classes:
//import com.os.client.invoker.ApiClient;
//import com.os.client.invoker.ApiException;
//import com.os.client.invoker.Configuration;
//import com.os.client.invoker.auth.*;
//import com.os.client.api.BuyinsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: stage_auth
OAuth stage_auth = (OAuth) defaultClient.getAuthentication("stage_auth");
stage_auth.setAccessToken("YOUR ACCESS TOKEN");

BuyinsApi apiInstance = new BuyinsApi();
String loanId = "loanId_example"; // String | The unique identifier of a loan
String buyinCompleteId = "buyinCompleteId_example"; // String | The unique identifier of a completed buyin
try {
    BuyinComplete result = apiInstance.ledgerLoansLoanIdBuyinsCompletesBuyinCompleteIdGet(loanId, buyinCompleteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuyinsApi#ledgerLoansLoanIdBuyinsCompletesBuyinCompleteIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loanId** | [**String**](.md)| The unique identifier of a loan |
 **buyinCompleteId** | [**String**](.md)| The unique identifier of a completed buyin |

### Return type

[**BuyinComplete**](BuyinComplete.md)

### Authorization

[stage_auth](../README.md#stage_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ledgerLoansLoanIdBuyinsCompletesGet"></a>
# **ledgerLoansLoanIdBuyinsCompletesGet**
> BuyinCompletes ledgerLoansLoanIdBuyinsCompletesGet(loanId)

Read collection of completed buyins against loan specified by &#x27;loanId&#x27;

### Example
```java
// Import classes:
//import com.os.client.invoker.ApiClient;
//import com.os.client.invoker.ApiException;
//import com.os.client.invoker.Configuration;
//import com.os.client.invoker.auth.*;
//import com.os.client.api.BuyinsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: stage_auth
OAuth stage_auth = (OAuth) defaultClient.getAuthentication("stage_auth");
stage_auth.setAccessToken("YOUR ACCESS TOKEN");

BuyinsApi apiInstance = new BuyinsApi();
String loanId = "loanId_example"; // String | The unique identifier of a loan
try {
    BuyinCompletes result = apiInstance.ledgerLoansLoanIdBuyinsCompletesGet(loanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuyinsApi#ledgerLoansLoanIdBuyinsCompletesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loanId** | [**String**](.md)| The unique identifier of a loan |

### Return type

[**BuyinCompletes**](BuyinCompletes.md)

### Authorization

[stage_auth](../README.md#stage_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ledgerLoansLoanIdBuyinsCompletesPost"></a>
# **ledgerLoansLoanIdBuyinsCompletesPost**
> ledgerLoansLoanIdBuyinsCompletesPost(loanId, body)

Complete a buyin

### Example
```java
// Import classes:
//import com.os.client.invoker.ApiClient;
//import com.os.client.invoker.ApiException;
//import com.os.client.invoker.Configuration;
//import com.os.client.invoker.auth.*;
//import com.os.client.api.BuyinsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: stage_auth
OAuth stage_auth = (OAuth) defaultClient.getAuthentication("stage_auth");
stage_auth.setAccessToken("YOUR ACCESS TOKEN");

BuyinsApi apiInstance = new BuyinsApi();
String loanId = "loanId_example"; // String | The unique identifier of a loan
BuyinCompleteRequest body = new BuyinCompleteRequest(); // BuyinCompleteRequest | 
try {
    apiInstance.ledgerLoansLoanIdBuyinsCompletesPost(loanId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling BuyinsApi#ledgerLoansLoanIdBuyinsCompletesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loanId** | [**String**](.md)| The unique identifier of a loan |
 **body** | [**BuyinCompleteRequest**](BuyinCompleteRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[stage_auth](../README.md#stage_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ledgerLoansLoanIdBuyinsInitiatesBuyinInitiateIdCancelPost"></a>
# **ledgerLoansLoanIdBuyinsInitiatesBuyinInitiateIdCancelPost**
> LedgerResponse ledgerLoansLoanIdBuyinsInitiatesBuyinInitiateIdCancelPost(loanId, buyinInitiateId)

Cancel an initiated buyin. Original proposer only.

### Example
```java
// Import classes:
//import com.os.client.invoker.ApiClient;
//import com.os.client.invoker.ApiException;
//import com.os.client.invoker.Configuration;
//import com.os.client.invoker.auth.*;
//import com.os.client.api.BuyinsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: stage_auth
OAuth stage_auth = (OAuth) defaultClient.getAuthentication("stage_auth");
stage_auth.setAccessToken("YOUR ACCESS TOKEN");

BuyinsApi apiInstance = new BuyinsApi();
String loanId = "loanId_example"; // String | The unique identifier of a loan
String buyinInitiateId = "buyinInitiateId_example"; // String | The unique identifier of an initiated buyin
try {
    LedgerResponse result = apiInstance.ledgerLoansLoanIdBuyinsInitiatesBuyinInitiateIdCancelPost(loanId, buyinInitiateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuyinsApi#ledgerLoansLoanIdBuyinsInitiatesBuyinInitiateIdCancelPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loanId** | [**String**](.md)| The unique identifier of a loan |
 **buyinInitiateId** | [**String**](.md)| The unique identifier of an initiated buyin |

### Return type

[**LedgerResponse**](LedgerResponse.md)

### Authorization

[stage_auth](../README.md#stage_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ledgerLoansLoanIdBuyinsInitiatesBuyinInitiateIdGet"></a>
# **ledgerLoansLoanIdBuyinsInitiatesBuyinInitiateIdGet**
> BuyinInitiate ledgerLoansLoanIdBuyinsInitiatesBuyinInitiateIdGet(loanId, buyinInitiateId)

Read an initiated buyin

### Example
```java
// Import classes:
//import com.os.client.invoker.ApiClient;
//import com.os.client.invoker.ApiException;
//import com.os.client.invoker.Configuration;
//import com.os.client.invoker.auth.*;
//import com.os.client.api.BuyinsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: stage_auth
OAuth stage_auth = (OAuth) defaultClient.getAuthentication("stage_auth");
stage_auth.setAccessToken("YOUR ACCESS TOKEN");

BuyinsApi apiInstance = new BuyinsApi();
String loanId = "loanId_example"; // String | The unique identifier of a loan
String buyinInitiateId = "buyinInitiateId_example"; // String | The unique identifier of an initiated buyin
try {
    BuyinInitiate result = apiInstance.ledgerLoansLoanIdBuyinsInitiatesBuyinInitiateIdGet(loanId, buyinInitiateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuyinsApi#ledgerLoansLoanIdBuyinsInitiatesBuyinInitiateIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loanId** | [**String**](.md)| The unique identifier of a loan |
 **buyinInitiateId** | [**String**](.md)| The unique identifier of an initiated buyin |

### Return type

[**BuyinInitiate**](BuyinInitiate.md)

### Authorization

[stage_auth](../README.md#stage_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ledgerLoansLoanIdBuyinsInitiatesGet"></a>
# **ledgerLoansLoanIdBuyinsInitiatesGet**
> BuyinInitiates ledgerLoansLoanIdBuyinsInitiatesGet(loanId)

Read collection of initiated buyins against loan specified by &#x27;loanId&#x27;

### Example
```java
// Import classes:
//import com.os.client.invoker.ApiClient;
//import com.os.client.invoker.ApiException;
//import com.os.client.invoker.Configuration;
//import com.os.client.invoker.auth.*;
//import com.os.client.api.BuyinsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: stage_auth
OAuth stage_auth = (OAuth) defaultClient.getAuthentication("stage_auth");
stage_auth.setAccessToken("YOUR ACCESS TOKEN");

BuyinsApi apiInstance = new BuyinsApi();
String loanId = "loanId_example"; // String | The unique identifier of a loan
try {
    BuyinInitiates result = apiInstance.ledgerLoansLoanIdBuyinsInitiatesGet(loanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BuyinsApi#ledgerLoansLoanIdBuyinsInitiatesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loanId** | [**String**](.md)| The unique identifier of a loan |

### Return type

[**BuyinInitiates**](BuyinInitiates.md)

### Authorization

[stage_auth](../README.md#stage_auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="ledgerLoansLoanIdBuyinsInitiatesPost"></a>
# **ledgerLoansLoanIdBuyinsInitiatesPost**
> ledgerLoansLoanIdBuyinsInitiatesPost(loanId, body)

Initiate a buyin

### Example
```java
// Import classes:
//import com.os.client.invoker.ApiClient;
//import com.os.client.invoker.ApiException;
//import com.os.client.invoker.Configuration;
//import com.os.client.invoker.auth.*;
//import com.os.client.api.BuyinsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: stage_auth
OAuth stage_auth = (OAuth) defaultClient.getAuthentication("stage_auth");
stage_auth.setAccessToken("YOUR ACCESS TOKEN");

BuyinsApi apiInstance = new BuyinsApi();
String loanId = "loanId_example"; // String | The unique identifier of a loan
BuyinInitiateRequest body = new BuyinInitiateRequest(); // BuyinInitiateRequest | 
try {
    apiInstance.ledgerLoansLoanIdBuyinsInitiatesPost(loanId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling BuyinsApi#ledgerLoansLoanIdBuyinsInitiatesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **loanId** | [**String**](.md)| The unique identifier of a loan |
 **body** | [**BuyinInitiateRequest**](BuyinInitiateRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[stage_auth](../README.md#stage_auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


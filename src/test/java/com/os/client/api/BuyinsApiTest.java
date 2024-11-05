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

import java.time.OffsetDateTime;

import org.junit.Ignore;
import org.junit.Test;

import com.os.client.model.BuyinComplete;
import com.os.client.model.BuyinCompleteRequest;
import com.os.client.model.BuyinCompleteStatus;
import com.os.client.model.BuyinCompletes;
import com.os.client.model.BuyinInitiate;
import com.os.client.model.BuyinInitiateRequest;
import com.os.client.model.BuyinInitiateStatus;
import com.os.client.model.BuyinInitiates;
import com.os.client.model.LedgerResponse;


/**
 * API tests for BuyinsApi
 */
@Ignore
public class BuyinsApiTest {

    private final BuyinsApi api = new BuyinsApi();

    /**
     * Read a completed buyin
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerBuyinsCompletesBuyinCompleteIdGetTest() throws Exception {
        String buyinCompleteId = null;
        BuyinComplete response = api.ledgerBuyinsCompletesBuyinCompleteIdGet(buyinCompleteId);

        // TODO: test validations
    }
    /**
     * Read collection of completed buyins
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerBuyinsCompletesGetTest() throws Exception {
        OffsetDateTime since = null;
        OffsetDateTime before = null;
        Integer size = null;
        BuyinCompleteStatus buyinCompleteStatus = null;
        String figi = null;
        String sedol = null;
        String cusip = null;
        String ticker = null;
        String isin = null;
        String partyId = null;
        String venueRefKey = null;
        BuyinCompletes response = api.ledgerBuyinsCompletesGet(since, before, size, buyinCompleteStatus, figi, sedol, cusip, ticker, isin, partyId, venueRefKey);

        // TODO: test validations
    }
    /**
     * Read an initiated buyin
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerBuyinsInitiatesBuyinInitiateIdGetTest() throws Exception {
        String buyinInitiateId = null;
        BuyinInitiate response = api.ledgerBuyinsInitiatesBuyinInitiateIdGet(buyinInitiateId);

        // TODO: test validations
    }
    /**
     * Read collection of initiated buyins
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerBuyinsInitiatesGetTest() throws Exception {
        OffsetDateTime since = null;
        OffsetDateTime before = null;
        Integer size = null;
        BuyinInitiateStatus buyinInitiateStatus = null;
        String figi = null;
        String sedol = null;
        String cusip = null;
        String ticker = null;
        String isin = null;
        String partyId = null;
        String venueRefKey = null;
        BuyinInitiates response = api.ledgerBuyinsInitiatesGet(since, before, size, buyinInitiateStatus, figi, sedol, cusip, ticker, isin, partyId, venueRefKey);

        // TODO: test validations
    }
    /**
     * Complete some or all of an initiated Buyin
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerLoansLoanIdBuyinsCompletesBuyinCompleteIdAcceptPostTest() throws Exception {
        String loanId = null;
        String buyinCompleteId = null;
        LedgerResponse response = api.ledgerLoansLoanIdBuyinsCompletesBuyinCompleteIdAcceptPost(loanId, buyinCompleteId);

        // TODO: test validations
    }
    /**
     * Read a completed Buyin
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerLoansLoanIdBuyinsCompletesBuyinCompleteIdGetTest() throws Exception {
        String loanId = null;
        String buyinCompleteId = null;
        BuyinComplete response = api.ledgerLoansLoanIdBuyinsCompletesBuyinCompleteIdGet(loanId, buyinCompleteId);

        // TODO: test validations
    }
    /**
     * Read collection of completed buyins against loan specified by &#x27;loanId&#x27;
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerLoansLoanIdBuyinsCompletesGetTest() throws Exception {
        String loanId = null;
        BuyinCompletes response = api.ledgerLoansLoanIdBuyinsCompletesGet(loanId);

        // TODO: test validations
    }
    /**
     * Complete a buyin
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerLoansLoanIdBuyinsCompletesPostTest() throws Exception {
        String loanId = null;
        BuyinCompleteRequest body = null;
        api.ledgerLoansLoanIdBuyinsCompletesPost(loanId, body);

        // TODO: test validations
    }
    /**
     * Cancel an initiated buyin. Original proposer only.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerLoansLoanIdBuyinsInitiatesBuyinInitiateIdCancelPostTest() throws Exception {
        String loanId = null;
        String buyinInitiateId = null;
        LedgerResponse response = api.ledgerLoansLoanIdBuyinsInitiatesBuyinInitiateIdCancelPost(loanId, buyinInitiateId);

        // TODO: test validations
    }
    /**
     * Read an initiated buyin
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerLoansLoanIdBuyinsInitiatesBuyinInitiateIdGetTest() throws Exception {
        String loanId = null;
        String buyinInitiateId = null;
        BuyinInitiate response = api.ledgerLoansLoanIdBuyinsInitiatesBuyinInitiateIdGet(loanId, buyinInitiateId);

        // TODO: test validations
    }
    /**
     * Read collection of initiated buyins against loan specified by &#x27;loanId&#x27;
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerLoansLoanIdBuyinsInitiatesGetTest() throws Exception {
        String loanId = null;
        BuyinInitiates response = api.ledgerLoansLoanIdBuyinsInitiatesGet(loanId);

        // TODO: test validations
    }
    /**
     * Initiate a buyin
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerLoansLoanIdBuyinsInitiatesPostTest() throws Exception {
        String loanId = null;
        BuyinInitiateRequest body = null;
        api.ledgerLoansLoanIdBuyinsInitiatesPost(loanId, body);

        // TODO: test validations
    }
}

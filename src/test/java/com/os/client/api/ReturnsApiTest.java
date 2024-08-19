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

import com.os.client.model.LedgerResponse;
import com.os.client.model.ModelReturn;
import java.time.OffsetDateTime;
import com.os.client.model.ReturnAcknowledgement;
import com.os.client.model.ReturnProposal;
import com.os.client.model.ReturnStatus;
import com.os.client.model.Returns;
import com.os.client.model.ReturnsReturnIdBody;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ReturnsApi
 */
@Ignore
public class ReturnsApiTest {

    private final ReturnsApi api = new ReturnsApi();

    /**
     * Read collection of returns against loan specified by &#x27;loanId&#x27;
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerLoansLoanIdReturnsGetTest() throws Exception {
        String loanId = null;
        Returns response = api.ledgerLoansLoanIdReturnsGet(loanId);

        // TODO: test validations
    }
    /**
     * Create a return
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerLoansLoanIdReturnsPostTest() throws Exception {
        ReturnProposal body = null;
        String loanId = null;
        api.ledgerLoansLoanIdReturnsPost(body, loanId);

        // TODO: test validations
    }
    /**
     * Acknowledge a pending return. No change to status.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerLoansLoanIdReturnsReturnIdAcknowledgePostTest() throws Exception {
        ReturnAcknowledgement body = null;
        String loanId = null;
        String returnId = null;
        LedgerResponse response = api.ledgerLoansLoanIdReturnsReturnIdAcknowledgePost(body, loanId, returnId);

        // TODO: test validations
    }
    /**
     * Cancel a return in \&quot;proposed\&quot; or \&quot;pending\&quot; state. Original proposer only.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerLoansLoanIdReturnsReturnIdCancelPostTest() throws Exception {
        String loanId = null;
        String returnId = null;
        LedgerResponse response = api.ledgerLoansLoanIdReturnsReturnIdCancelPost(loanId, returnId);

        // TODO: test validations
    }
    /**
     * Read a return
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerLoansLoanIdReturnsReturnIdGetTest() throws Exception {
        String loanId = null;
        String returnId = null;
        ModelReturn response = api.ledgerLoansLoanIdReturnsReturnIdGet(loanId, returnId);

        // TODO: test validations
    }
    /**
     * Update unilateral fields on a return
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerLoansLoanIdReturnsReturnIdPatchTest() throws Exception {
        String loanId = null;
        String returnId = null;
        ReturnsReturnIdBody body = null;
        LedgerResponse response = api.ledgerLoansLoanIdReturnsReturnIdPatch(loanId, returnId, body);

        // TODO: test validations
    }
    /**
     * Read collection of returns
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerReturnsGetTest() throws Exception {
        OffsetDateTime since = null;
        OffsetDateTime before = null;
        Integer size = null;
        ReturnStatus returnStatus = null;
        String figi = null;
        String sedol = null;
        String cusip = null;
        String ticker = null;
        String isin = null;
        String partyId = null;
        String venueRefKey = null;
        Returns response = api.ledgerReturnsGet(since, before, size, returnStatus, figi, sedol, cusip, ticker, isin, partyId, venueRefKey);

        // TODO: test validations
    }
    /**
     * Read a return
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerReturnsReturnIdGetTest() throws Exception {
        String returnId = null;
        ModelReturn response = api.ledgerReturnsReturnIdGet(returnId);

        // TODO: test validations
    }
}

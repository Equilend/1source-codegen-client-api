/*
 * 1Source Ledger API
 * 1Source Ledger API provides client access to the 1Source Ledger. You can find out more about 1Source at [https://equilend.com](https://equilend.com).  This specification is work in progress. The design is meant to model the securities lending life cycle in as clean a way as possible while being robust enough to easily translate to ISLA CDM workflows and data model.  API specification is the intellectual property of EquiLend LLC and should not be copied or disseminated in any way. 
 *
 * OpenAPI spec version: 1.2.1
 * Contact: 1source_help@equilend.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.os.client.api;

import com.os.client.model.LedgerResponse;
import java.time.OffsetDateTime;
import com.os.client.model.Recall;
import com.os.client.model.RecallAcknowledgement;
import com.os.client.model.RecallProposal;
import com.os.client.model.RecallStatus;
import com.os.client.model.Recalls;
import com.os.client.model.RecallsRecallIdBody;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for RecallsApi
 */
@Ignore
public class RecallsApiTest {

    private final RecallsApi api = new RecallsApi();

    /**
     * Read collection of recalls against loan specified by &#x27;loanId&#x27;
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerLoansLoanIdRecallsGetTest() throws Exception {
        String loanId = null;
        Recalls response = api.ledgerLoansLoanIdRecallsGet(loanId);

        // TODO: test validations
    }
    /**
     * Initiates a recall
     *
     * Initiates a recall notice to return securities on a loan.  ### Validation rules:   - Caller must be the lender on the loan   - &#x60;loanId&#x60; -- must reference an &#x60;OPEN&#x60; loan   - &#x60;executionVenue&#x60;     - is mandatory     - if &#x60;executionVenue.type&#x60; &#x3D;&#x3D; &#x60;ONPLATFORM&#x60; then all other elements in &#x60;executionVenue&#x60; must be null     - if &#x60;executionVenue.type&#x60; &#x3D;&#x3D; &#x60;OFFPLATFORM&#x60; then &#x60;executionVenue.partyId&#x60;, &#x60;executionVenue.venueName&#x60;, and &#x60;executionVenue.partyRole&#x60; are mandatory   - &#x60;quantity&#x60;     - is mandatory     - must be &lt; 0     - must be &lt;&#x3D; loan open quantity - all existing open recall quantities   - &#x60;recallDate&#x60;     - is mandatory     - must be &gt;&#x3D; current day   - &#x60;recallDueDate&#x60;     - is mandatory     - must be &gt; &#x60;recallDate&#x60; 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerLoansLoanIdRecallsPostTest() throws Exception {
        RecallProposal body = null;
        String loanId = null;
        api.ledgerLoansLoanIdRecallsPost(body, loanId);

        // TODO: test validations
    }
    /**
     * Acknowledge a pending recall. No change to status.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerLoansLoanIdRecallsRecallIdAcknowledgePostTest() throws Exception {
        RecallAcknowledgement body = null;
        String loanId = null;
        String recallId = null;
        LedgerResponse response = api.ledgerLoansLoanIdRecallsRecallIdAcknowledgePost(body, loanId, recallId);

        // TODO: test validations
    }
    /**
     * Cancel a recall in \&quot;proposed\&quot; state. Original proposer only.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerLoansLoanIdRecallsRecallIdCancelPostTest() throws Exception {
        String loanId = null;
        String recallId = null;
        LedgerResponse response = api.ledgerLoansLoanIdRecallsRecallIdCancelPost(loanId, recallId);

        // TODO: test validations
    }
    /**
     * Read a recall
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerLoansLoanIdRecallsRecallIdGetTest() throws Exception {
        String loanId = null;
        String recallId = null;
        Recall response = api.ledgerLoansLoanIdRecallsRecallIdGet(loanId, recallId);

        // TODO: test validations
    }
    /**
     * Update unilateral fields on a recall
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerLoansLoanIdRecallsRecallIdPatchTest() throws Exception {
        String loanId = null;
        String recallId = null;
        RecallsRecallIdBody body = null;
        LedgerResponse response = api.ledgerLoansLoanIdRecallsRecallIdPatch(loanId, recallId, body);

        // TODO: test validations
    }
    /**
     * Read collection of recalls
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerRecallsGetTest() throws Exception {
        OffsetDateTime since = null;
        OffsetDateTime before = null;
        Integer size = null;
        RecallStatus recallStatus = null;
        Recalls response = api.ledgerRecallsGet(since, before, size, recallStatus);

        // TODO: test validations
    }
    /**
     * Read a recall
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerRecallsRecallIdGetTest() throws Exception {
        String recallId = null;
        Recall response = api.ledgerRecallsRecallIdGet(recallId);

        // TODO: test validations
    }
}

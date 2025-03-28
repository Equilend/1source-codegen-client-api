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

import java.time.OffsetDateTime;

import org.junit.Ignore;
import org.junit.Test;

import com.os.client.model.LedgerResponse;
import com.os.client.model.Rerate;
import com.os.client.model.RerateCancelErrorResponse;
import com.os.client.model.RerateDeclineErrorResponse;
import com.os.client.model.RerateProposal;
import com.os.client.model.RerateStatus;
import com.os.client.model.Rerates;


/**
 * API tests for ReratesApi
 */
@Ignore
public class ReratesApiTest {

    private final ReratesApi api = new ReratesApi();

    /**
     * Read collection of rerates against loan specified by &#x27;loanId&#x27;
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerLoansLoanIdReratesGetTest() throws Exception {
        String loanId = null;
        Rerates response = api.ledgerLoansLoanIdReratesGet(loanId);

        // TODO: test validations
    }
    /**
     * Create a rerate.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerLoansLoanIdReratesPostTest() throws Exception {
        RerateProposal body = null;
        String loanId = null;
        api.ledgerLoansLoanIdReratesPost(body, loanId);

        // TODO: test validations
    }
    /**
     * Approve a rerate in \&quot;proposed\&quot; state.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerLoansLoanIdReratesRerateIdApprovePostTest() throws Exception {
        String loanId = null;
        String rerateId = null;
        LedgerResponse response = api.ledgerLoansLoanIdReratesRerateIdApprovePost(loanId, rerateId);

        // TODO: test validations
    }
    /**
     * Cancel a rerate in \&quot;proposed\&quot; state. Original proposer only.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerLoansLoanIdReratesRerateIdCancelPostTest() throws Exception {
        RerateCancelErrorResponse body = null;
        String loanId = null;
        String rerateId = null;
        LedgerResponse response = api.ledgerLoansLoanIdReratesRerateIdCancelPost(body, loanId, rerateId);

        // TODO: test validations
    }
    /**
     * Cancel a rerate in \&quot;pending\&quot; state. Either party can initiate. If canceled by a delegated Venue, the cancel will be done unilaterally
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerLoansLoanIdReratesRerateIdCancelpendingPostTest() throws Exception {
        String loanId = null;
        String rerateId = null;
        LedgerResponse response = api.ledgerLoansLoanIdReratesRerateIdCancelpendingPost(loanId, rerateId);

        // TODO: test validations
    }
    /**
     * Decline a rerate in \&quot;proposed\&quot; state.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerLoansLoanIdReratesRerateIdDeclinePostTest() throws Exception {
        RerateDeclineErrorResponse body = null;
        String loanId = null;
        String rerateId = null;
        LedgerResponse response = api.ledgerLoansLoanIdReratesRerateIdDeclinePost(body, loanId, rerateId);

        // TODO: test validations
    }
    /**
     * Read a rerate
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerLoansLoanIdReratesRerateIdGetTest() throws Exception {
        String loanId = null;
        String rerateId = null;
        Rerate response = api.ledgerLoansLoanIdReratesRerateIdGet(loanId, rerateId);

        // TODO: test validations
    }
    /**
     * Read collection of rerates
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerReratesGetTest() throws Exception {
        OffsetDateTime since = null;
        OffsetDateTime before = null;
        Integer size = null;
        RerateStatus rerateStatus = null;
        Rerates response = api.ledgerReratesGet(since, before, size, rerateStatus);

        // TODO: test validations
    }
    /**
     * Read a rerate
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerReratesRerateIdGetTest() throws Exception {
        String rerateId = null;
        Rerate response = api.ledgerReratesRerateIdGet(rerateId);

        // TODO: test validations
    }
}

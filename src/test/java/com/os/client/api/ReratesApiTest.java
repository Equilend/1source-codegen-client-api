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

import com.os.client.model.LedgerResponse;
import java.time.OffsetDateTime;
import com.os.client.model.Rerate;
import com.os.client.model.RerateProposal;
import com.os.client.model.RerateStatus;
import com.os.client.model.Rerates;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ReratesApi
 */
@Ignore
public class ReratesApiTest {

    private final ReratesApi api = new ReratesApi();

    /**
     * Read collection of rerates against contract specified by &#x27;contractId&#x27;
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerContractsContractIdReratesGetTest() throws Exception {
        String contractId = null;
        Rerates response = api.ledgerContractsContractIdReratesGet(contractId);

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
    public void ledgerContractsContractIdReratesPostTest() throws Exception {
        RerateProposal body = null;
        String contractId = null;
        api.ledgerContractsContractIdReratesPost(body, contractId);

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
    public void ledgerContractsContractIdReratesRerateIdApprovePostTest() throws Exception {
        String contractId = null;
        String rerateId = null;
        LedgerResponse response = api.ledgerContractsContractIdReratesRerateIdApprovePost(contractId, rerateId);

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
    public void ledgerContractsContractIdReratesRerateIdCancelPostTest() throws Exception {
        String contractId = null;
        String rerateId = null;
        LedgerResponse response = api.ledgerContractsContractIdReratesRerateIdCancelPost(contractId, rerateId);

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
    public void ledgerContractsContractIdReratesRerateIdCancelpendingPostTest() throws Exception {
        String contractId = null;
        String rerateId = null;
        LedgerResponse response = api.ledgerContractsContractIdReratesRerateIdCancelpendingPost(contractId, rerateId);

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
    public void ledgerContractsContractIdReratesRerateIdDeclinePostTest() throws Exception {
        String contractId = null;
        String rerateId = null;
        LedgerResponse response = api.ledgerContractsContractIdReratesRerateIdDeclinePost(contractId, rerateId);

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
    public void ledgerContractsContractIdReratesRerateIdGetTest() throws Exception {
        String contractId = null;
        String rerateId = null;
        Rerate response = api.ledgerContractsContractIdReratesRerateIdGet(contractId, rerateId);

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
    public void ledgerContractsContractIdReratesRerateIdVenuecancelpendingPostTest() throws Exception {
        String contractId = null;
        String rerateId = null;
        LedgerResponse response = api.ledgerContractsContractIdReratesRerateIdVenuecancelpendingPost(contractId, rerateId);

        // TODO: test validations
    }
    /**
     * For delegated venues to create a rerate atomically.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerContractsContractIdVenuereratesPostTest() throws Exception {
        RerateProposal body = null;
        String contractId = null;
        api.ledgerContractsContractIdVenuereratesPost(body, contractId);

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
        String figi = null;
        String sedol = null;
        String cusip = null;
        String ticker = null;
        String isin = null;
        String partyId = null;
        Rerates response = api.ledgerReratesGet(since, before, size, rerateStatus, figi, sedol, cusip, ticker, isin, partyId);

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

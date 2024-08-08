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

import com.os.client.model.Delegation;
import com.os.client.model.DelegationProposal;
import com.os.client.model.Delegations;
import com.os.client.model.LedgerResponse;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for DelegationsApi
 */
@Ignore
public class DelegationsApiTest {

    private final DelegationsApi api = new DelegationsApi();

    /**
     * Approve a party delegation in \&quot;proposed\&quot; state
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerDelegationsDelegationIdApprovePostTest() throws Exception {
        String delegationId = null;
        LedgerResponse response = api.ledgerDelegationsDelegationIdApprovePost(delegationId);

        // TODO: test validations
    }
    /**
     * Cancel a party delegation in \&quot;proposed\&quot; state. Original proposer only.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerDelegationsDelegationIdCancelPostTest() throws Exception {
        String delegationId = null;
        LedgerResponse response = api.ledgerDelegationsDelegationIdCancelPost(delegationId);

        // TODO: test validations
    }
    /**
     * Decline a party delegation in \&quot;proposed\&quot; state
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerDelegationsDelegationIdDeclinePostTest() throws Exception {
        String delegationId = null;
        LedgerResponse response = api.ledgerDelegationsDelegationIdDeclinePost(delegationId);

        // TODO: test validations
    }
    /**
     * Read a party delegation
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerDelegationsDelegationIdGetTest() throws Exception {
        String delegationId = null;
        Delegation response = api.ledgerDelegationsDelegationIdGet(delegationId);

        // TODO: test validations
    }
    /**
     * Read a collection of delegations.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerDelegationsGetTest() throws Exception {
        Delegations response = api.ledgerDelegationsGet();

        // TODO: test validations
    }
    /**
     * Delegate a set of workflows to a party
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerDelegationsPostTest() throws Exception {
        DelegationProposal body = null;
        LedgerResponse response = api.ledgerDelegationsPost(body);

        // TODO: test validations
    }
}

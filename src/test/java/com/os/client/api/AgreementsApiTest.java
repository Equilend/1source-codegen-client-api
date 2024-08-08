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

import com.os.client.model.Agreement;
import com.os.client.model.Agreements;
import com.os.client.model.LedgerResponse;
import java.time.OffsetDateTime;
import com.os.client.model.TradeAgreement;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for AgreementsApi
 */
@Ignore
public class AgreementsApiTest {

    private final AgreementsApi api = new AgreementsApi();

    /**
     * Read an agreement
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerAgreementsAgreementIdGetTest() throws Exception {
        String agreementId = null;
        Agreement response = api.ledgerAgreementsAgreementIdGet(agreementId);

        // TODO: test validations
    }
    /**
     * Read a collection of trade agreements. Defaults to return the last 100 trade agreeements created.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerAgreementsGetTest() throws Exception {
        OffsetDateTime since = null;
        OffsetDateTime before = null;
        Integer size = null;
        Agreements response = api.ledgerAgreementsGet(since, before, size);

        // TODO: test validations
    }
    /**
     * Create a trade agreement
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerAgreementsPostTest() throws Exception {
        TradeAgreement body = null;
        LedgerResponse response = api.ledgerAgreementsPost(body);

        // TODO: test validations
    }
    /**
     * For delegated venues to create a trade agreement atomically
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerVenueAgreementsPostTest() throws Exception {
        TradeAgreement body = null;
        LedgerResponse response = api.ledgerVenueAgreementsPost(body);

        // TODO: test validations
    }
}

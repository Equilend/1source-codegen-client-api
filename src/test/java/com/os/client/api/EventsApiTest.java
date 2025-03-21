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

import com.os.client.model.Event;
import com.os.client.model.EventType;
import com.os.client.model.Events;
import com.os.client.model.LedgerResponse;
import java.time.OffsetDateTime;
import com.os.client.model.SortOrder;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for EventsApi
 */
@Ignore
public class EventsApiTest {

    private final EventsApi api = new EventsApi();

    /**
     * Read an event
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerEventsEventIdGetTest() throws Exception {
        Long eventId = null;
        Event response = api.ledgerEventsEventIdGet(eventId);

        // TODO: test validations
    }
    /**
     * Read collection of events. With no parameters returns events since start of current day.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerEventsGetTest() throws Exception {
        List<EventType> eventType = null;
        Long beforeEventId = null;
        Long fromEventId = null;
        OffsetDateTime since = null;
        OffsetDateTime before = null;
        Integer size = null;
        SortOrder sortOrder = null;
        Events response = api.ledgerEventsGet(eventType, beforeEventId, fromEventId, since, before, size, sortOrder);

        // TODO: test validations
    }
    /**
     * Read an event
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerLoansLoanIdEventsEventIdGetTest() throws Exception {
        String loanId = null;
        Long eventId = null;
        Event response = api.ledgerLoansLoanIdEventsEventIdGet(loanId, eventId);

        // TODO: test validations
    }
    /**
     * Read collection of events against a specific loan. With no parameters returns events since start of current day.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void ledgerLoansLoanIdEventsGetTest() throws Exception {
        String loanId = null;
        List<EventType> eventType = null;
        Long beforeEventId = null;
        Long fromEventId = null;
        OffsetDateTime since = null;
        OffsetDateTime before = null;
        Integer size = null;
        SortOrder sortOrder = null;
        Events response = api.ledgerLoansLoanIdEventsGet(loanId, eventType, beforeEventId, fromEventId, since, before, size, sortOrder);

        // TODO: test validations
    }
}

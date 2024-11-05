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

package com.os.client.model;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets EventType
 */
@JsonAdapter(EventType.Adapter.class)
public enum EventType {
  @SerializedName("AUTO_RERATE_APPLIED")
  AUTO_RERATE_APPLIED("AUTO_RERATE_APPLIED"),
  @SerializedName("BUYIN_CANCELED")
  BUYIN_CANCELED("BUYIN_CANCELED"),
  @SerializedName("BUYIN_CLOSED")
  BUYIN_CLOSED("BUYIN_CLOSED"),
  @SerializedName("BUYIN_COMPLETED")
  BUYIN_COMPLETED("BUYIN_COMPLETED"),
  @SerializedName("BUYIN_OPENED")
  BUYIN_OPENED("BUYIN_OPENED"),
  @SerializedName("BUYIN_PENDING")
  BUYIN_PENDING("BUYIN_PENDING"),
  @SerializedName("BUYIN_UPDATED")
  BUYIN_UPDATED("BUYIN_UPDATED"),
  @SerializedName("DELEGATION_APPROVED")
  DELEGATION_APPROVED("DELEGATION_APPROVED"),
  @SerializedName("DELEGATION_CANCELED")
  DELEGATION_CANCELED("DELEGATION_CANCELED"),
  @SerializedName("DELEGATION_DECLINED")
  DELEGATION_DECLINED("DELEGATION_DECLINED"),
  @SerializedName("DELEGATION_PROPOSED")
  DELEGATION_PROPOSED("DELEGATION_PROPOSED"),
  @SerializedName("INTERNAL_REFID_UPDATE")
  INTERNAL_REFID_UPDATE("INTERNAL_REFID_UPDATE"),
  @SerializedName("LOAN_PROPOSED")
  LOAN_PROPOSED("LOAN_PROPOSED"),
  @SerializedName("LOAN_PENDING")
  LOAN_PENDING("LOAN_PENDING"),
  @SerializedName("LOAN_CANCELED")
  LOAN_CANCELED("LOAN_CANCELED"),
  @SerializedName("LOAN_CANCEL_PENDING")
  LOAN_CANCEL_PENDING("LOAN_CANCEL_PENDING"),
  @SerializedName("LOAN_CLOSED")
  LOAN_CLOSED("LOAN_CLOSED"),
  @SerializedName("LOAN_DECLINED")
  LOAN_DECLINED("LOAN_DECLINED"),
  @SerializedName("LOAN_MARKTOMARKET")
  LOAN_MARKTOMARKET("LOAN_MARKTOMARKET"),
  @SerializedName("LOAN_OPENED")
  LOAN_OPENED("LOAN_OPENED"),
  @SerializedName("LOAN_SPLIT_PROPOSED")
  LOAN_SPLIT_PROPOSED("LOAN_SPLIT_PROPOSED"),
  @SerializedName("LOAN_SPLIT_APPLIED")
  LOAN_SPLIT_APPLIED("LOAN_SPLIT_APPLIED"),
  @SerializedName("RECALL_ACKNOWLEDGED")
  RECALL_ACKNOWLEDGED("RECALL_ACKNOWLEDGED"),
  @SerializedName("RECALL_CANCELED")
  RECALL_CANCELED("RECALL_CANCELED"),
  @SerializedName("RECALL_CLOSED")
  RECALL_CLOSED("RECALL_CLOSED"),
  @SerializedName("RECALL_MODIFIED")
  RECALL_MODIFIED("RECALL_MODIFIED"),
  @SerializedName("RECALL_OPENED")
  RECALL_OPENED("RECALL_OPENED"),
  @SerializedName("RECALL_UPDATED")
  RECALL_UPDATED("RECALL_UPDATED"),
  @SerializedName("RERATE_APPLIED")
  RERATE_APPLIED("RERATE_APPLIED"),
  @SerializedName("RERATE_CANCELED")
  RERATE_CANCELED("RERATE_CANCELED"),
  @SerializedName("RERATE_CANCEL_PENDING")
  RERATE_CANCEL_PENDING("RERATE_CANCEL_PENDING"),
  @SerializedName("RERATE_DECLINED")
  RERATE_DECLINED("RERATE_DECLINED"),
  @SerializedName("RERATE_PENDING")
  RERATE_PENDING("RERATE_PENDING"),
  @SerializedName("RERATE_PROPOSED")
  RERATE_PROPOSED("RERATE_PROPOSED"),
  @SerializedName("RETURN_ACKNOWLEDGED")
  RETURN_ACKNOWLEDGED("RETURN_ACKNOWLEDGED"),
  @SerializedName("RETURN_CANCELED")
  RETURN_CANCELED("RETURN_CANCELED"),
  @SerializedName("RETURN_PENDING")
  RETURN_PENDING("RETURN_PENDING"),
  @SerializedName("RETURN_SETTLED")
  RETURN_SETTLED("RETURN_SETTLED"),
  @SerializedName("RETURN_SETTLEMENT_STATUS_UPDATE")
  RETURN_SETTLEMENT_STATUS_UPDATE("RETURN_SETTLEMENT_STATUS_UPDATE"),
  @SerializedName("SETTLEMENT_INSTRUCTION_UPDATE")
  SETTLEMENT_INSTRUCTION_UPDATE("SETTLEMENT_INSTRUCTION_UPDATE"),
  @SerializedName("SETTLEMENT_STATUS_UPDATE")
  SETTLEMENT_STATUS_UPDATE("SETTLEMENT_STATUS_UPDATE"),
  @SerializedName("TRADE_AGREED")
  TRADE_AGREED("TRADE_AGREED"),
  @SerializedName("TRADE_CANCELED")
  TRADE_CANCELED("TRADE_CANCELED"),
  @SerializedName("VENUE_REFERENCE_UPDATE")
  VENUE_REFERENCE_UPDATE("VENUE_REFERENCE_UPDATE");

  private String value;

  EventType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EventType fromValue(String input) {
    for (EventType b : EventType.values()) {
      if (b.value.equals(input)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<EventType> {
    @Override
    public void write(final JsonWriter jsonWriter, final EventType enumeration) throws IOException {
      jsonWriter.value(String.valueOf(enumeration.getValue()));
    }

    @Override
    public EventType read(final JsonReader jsonReader) throws IOException {
      Object value = jsonReader.nextString();
      return EventType.fromValue((String)(value));
    }
  }
}

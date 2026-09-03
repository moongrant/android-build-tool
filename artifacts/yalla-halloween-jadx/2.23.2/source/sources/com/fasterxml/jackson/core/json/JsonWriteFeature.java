package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonGenerator$Feature;

/* JADX INFO: loaded from: classes3.dex */
public enum JsonWriteFeature {
    QUOTE_FIELD_NAMES(true, JsonGenerator$Feature.QUOTE_FIELD_NAMES),
    WRITE_NAN_AS_STRINGS(true, JsonGenerator$Feature.QUOTE_NON_NUMERIC_NUMBERS),
    WRITE_NUMBERS_AS_STRINGS(false, JsonGenerator$Feature.WRITE_NUMBERS_AS_STRINGS),
    ESCAPE_NON_ASCII(false, JsonGenerator$Feature.ESCAPE_NON_ASCII);

    private final boolean _defaultState;
    private final JsonGenerator$Feature _mappedFeature;
    private final int _mask = 1 << ordinal();

    JsonWriteFeature(boolean z, JsonGenerator$Feature jsonGenerator$Feature) {
        this._defaultState = z;
        this._mappedFeature = jsonGenerator$Feature;
    }
}

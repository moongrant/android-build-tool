package com.fasterxml.jackson.core;

/* JADX INFO: loaded from: classes3.dex */
public enum JsonGenerator$Feature {
    AUTO_CLOSE_TARGET(true),
    AUTO_CLOSE_JSON_CONTENT(true),
    FLUSH_PASSED_TO_STREAM(true),
    QUOTE_FIELD_NAMES(true),
    QUOTE_NON_NUMERIC_NUMBERS(true),
    ESCAPE_NON_ASCII(false),
    WRITE_NUMBERS_AS_STRINGS(false),
    WRITE_BIGDECIMAL_AS_PLAIN(false),
    STRICT_DUPLICATE_DETECTION(false),
    IGNORE_UNKNOWN(false);

    private final boolean _defaultState;
    private final int _mask = 1 << ordinal();

    JsonGenerator$Feature(boolean z) {
        this._defaultState = z;
    }

    public static int OooO00o() {
        int i = 0;
        for (JsonGenerator$Feature jsonGenerator$Feature : values()) {
            if (jsonGenerator$Feature._defaultState) {
                i |= jsonGenerator$Feature._mask;
            }
        }
        return i;
    }

    public final boolean OooO0O0() {
        return this._defaultState;
    }

    public final int OooO0OO() {
        return this._mask;
    }
}

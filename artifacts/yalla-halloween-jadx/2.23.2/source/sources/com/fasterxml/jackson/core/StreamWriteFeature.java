package com.fasterxml.jackson.core;

/* JADX INFO: loaded from: classes3.dex */
public enum StreamWriteFeature {
    AUTO_CLOSE_TARGET(JsonGenerator$Feature.AUTO_CLOSE_TARGET),
    AUTO_CLOSE_CONTENT(JsonGenerator$Feature.AUTO_CLOSE_JSON_CONTENT),
    FLUSH_PASSED_TO_STREAM(JsonGenerator$Feature.FLUSH_PASSED_TO_STREAM),
    WRITE_BIGDECIMAL_AS_PLAIN(JsonGenerator$Feature.WRITE_BIGDECIMAL_AS_PLAIN),
    STRICT_DUPLICATE_DETECTION(JsonGenerator$Feature.STRICT_DUPLICATE_DETECTION),
    IGNORE_UNKNOWN(JsonGenerator$Feature.IGNORE_UNKNOWN);

    private final boolean _defaultState;
    private final JsonGenerator$Feature _mappedFeature;
    private final int _mask;

    StreamWriteFeature(JsonGenerator$Feature jsonGenerator$Feature) {
        this._mappedFeature = jsonGenerator$Feature;
        this._mask = jsonGenerator$Feature.OooO0OO();
        this._defaultState = jsonGenerator$Feature.OooO0O0();
    }
}

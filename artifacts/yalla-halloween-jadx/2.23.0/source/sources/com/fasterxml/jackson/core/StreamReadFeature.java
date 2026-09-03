package com.fasterxml.jackson.core;

/* JADX INFO: loaded from: classes3.dex */
public enum StreamReadFeature {
    AUTO_CLOSE_SOURCE(JsonParser$Feature.AUTO_CLOSE_SOURCE),
    STRICT_DUPLICATE_DETECTION(JsonParser$Feature.STRICT_DUPLICATE_DETECTION),
    IGNORE_UNDEFINED(JsonParser$Feature.IGNORE_UNDEFINED),
    INCLUDE_SOURCE_IN_LOCATION(JsonParser$Feature.INCLUDE_SOURCE_IN_LOCATION);

    private final boolean _defaultState;
    private final JsonParser$Feature _mappedFeature;
    private final int _mask;

    StreamReadFeature(JsonParser$Feature jsonParser$Feature) {
        this._mappedFeature = jsonParser$Feature;
        this._mask = jsonParser$Feature.OooO0OO();
        this._defaultState = jsonParser$Feature.OooO0O0();
    }
}

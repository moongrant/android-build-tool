package com.fasterxml.jackson.core;

/* JADX INFO: loaded from: classes3.dex */
public enum JsonParser$Feature {
    AUTO_CLOSE_SOURCE(true),
    ALLOW_COMMENTS(false),
    ALLOW_YAML_COMMENTS(false),
    ALLOW_UNQUOTED_FIELD_NAMES(false),
    ALLOW_SINGLE_QUOTES(false),
    ALLOW_UNQUOTED_CONTROL_CHARS(false),
    ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false),
    ALLOW_NUMERIC_LEADING_ZEROS(false),
    ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS(false),
    ALLOW_NON_NUMERIC_NUMBERS(false),
    ALLOW_MISSING_VALUES(false),
    ALLOW_TRAILING_COMMA(false),
    STRICT_DUPLICATE_DETECTION(false),
    IGNORE_UNDEFINED(false),
    INCLUDE_SOURCE_IN_LOCATION(true);

    private final boolean _defaultState;
    private final int _mask = 1 << ordinal();

    JsonParser$Feature(boolean z) {
        this._defaultState = z;
    }

    public static int OooO00o() {
        int i = 0;
        for (JsonParser$Feature jsonParser$Feature : values()) {
            if (jsonParser$Feature._defaultState) {
                i |= jsonParser$Feature._mask;
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

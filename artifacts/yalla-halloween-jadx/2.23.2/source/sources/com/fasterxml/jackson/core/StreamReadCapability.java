package com.fasterxml.jackson.core;

/* JADX INFO: loaded from: classes3.dex */
public enum StreamReadCapability {
    DUPLICATE_PROPERTIES,
    SCALARS_AS_OBJECTS,
    UNTYPED_SCALARS;

    private final boolean _defaultState = false;
    private final int _mask = 1 << ordinal();

    StreamReadCapability() {
    }
}

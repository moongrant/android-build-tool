package com.fasterxml.jackson.core;

/* JADX INFO: loaded from: classes3.dex */
public enum StreamWriteCapability {
    CAN_WRITE_BINARY_NATIVELY,
    CAN_WRITE_FORMATTED_NUMBERS;

    private final boolean _defaultState = false;
    private final int _mask = 1 << ordinal();

    StreamWriteCapability() {
    }
}

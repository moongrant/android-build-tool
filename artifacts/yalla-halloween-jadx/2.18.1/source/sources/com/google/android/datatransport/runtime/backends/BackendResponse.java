package com.google.android.datatransport.runtime.backends;

import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes2.dex */
@AutoValue
public abstract class BackendResponse {

    public enum Status {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    public static BackendResponse OooO00o() {
        return new OooO00o(Status.FATAL_ERROR, -1L);
    }

    public abstract long OooO0O0();

    public abstract Status OooO0OO();
}

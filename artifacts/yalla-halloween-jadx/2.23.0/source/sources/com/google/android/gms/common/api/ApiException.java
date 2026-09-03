package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class ApiException extends Exception {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    @Deprecated
    public final Status f14646OooO0Oo;

    public ApiException(@NonNull Status status) {
        super(status.getStatusCode() + ": " + (status.getStatusMessage() != null ? status.getStatusMessage() : ""));
        this.f14646OooO0Oo = status;
    }

    @NonNull
    public Status getStatus() {
        return this.f14646OooO0Oo;
    }

    public int getStatusCode() {
        return this.f14646OooO0Oo.getStatusCode();
    }

    @Nullable
    @Deprecated
    public String getStatusMessage() {
        return this.f14646OooO0Oo.getStatusMessage();
    }
}

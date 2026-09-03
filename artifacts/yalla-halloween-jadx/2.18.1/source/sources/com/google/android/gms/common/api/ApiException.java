package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class ApiException extends Exception {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NonNull
    @Deprecated
    public final Status f15147Oooo0o;

    public ApiException(@NonNull Status status) {
        super(status.getStatusCode() + ": " + (status.getStatusMessage() != null ? status.getStatusMessage() : ""));
        this.f15147Oooo0o = status;
    }

    @NonNull
    public Status getStatus() {
        return this.f15147Oooo0o;
    }

    public int getStatusCode() {
        return this.f15147Oooo0o.getStatusCode();
    }

    @Nullable
    @Deprecated
    public String getStatusMessage() {
        return this.f15147Oooo0o.getStatusMessage();
    }
}

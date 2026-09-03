package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes2.dex */
public final class UnsupportedApiCallException extends UnsupportedOperationException {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Feature f15202Oooo0o;

    @KeepForSdk
    public UnsupportedApiCallException(@NonNull Feature feature) {
        this.f15202Oooo0o = feature;
    }

    @Override // java.lang.Throwable
    @NonNull
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f15202Oooo0o));
    }
}

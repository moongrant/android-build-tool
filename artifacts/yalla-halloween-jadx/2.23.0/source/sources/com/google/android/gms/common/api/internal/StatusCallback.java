package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public class StatusCallback extends IStatusCallback.Stub {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @KeepForSdk
    public final BaseImplementation.ResultHolder<Status> f14801OooO0Oo;

    @KeepForSdk
    public StatusCallback(@NonNull BaseImplementation.ResultHolder<Status> resultHolder) {
        this.f14801OooO0Oo = resultHolder;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    @KeepForSdk
    public void onResult(@NonNull Status status) {
        this.f14801OooO0Oo.setResult(status);
    }
}

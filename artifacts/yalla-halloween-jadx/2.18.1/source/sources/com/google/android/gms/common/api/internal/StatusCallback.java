package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class StatusCallback extends IStatusCallback.Stub {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @KeepForSdk
    public final BaseImplementation.ResultHolder<Status> f15302OooO00o;

    @KeepForSdk
    public StatusCallback(@NonNull BaseImplementation.ResultHolder<Status> resultHolder) {
        this.f15302OooO00o = resultHolder;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    @KeepForSdk
    public void onResult(@NonNull Status status) {
        this.f15302OooO00o.setResult(status);
    }
}

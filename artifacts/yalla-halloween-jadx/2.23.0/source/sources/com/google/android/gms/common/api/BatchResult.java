package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class BatchResult implements Result {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Status f14655OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final PendingResult<?>[] f14656OooO0o0;

    public BatchResult(Status status, PendingResult<?>[] pendingResultArr) {
        this.f14655OooO0Oo = status;
        this.f14656OooO0o0 = pendingResultArr;
    }

    @Override // com.google.android.gms.common.api.Result
    @NonNull
    public Status getStatus() {
        return this.f14655OooO0Oo;
    }

    @NonNull
    public <R extends Result> R take(@NonNull BatchResultToken<R> batchResultToken) {
        int i = batchResultToken.f14657OooO00o;
        PendingResult<?>[] pendingResultArr = this.f14656OooO0o0;
        Preconditions.checkArgument(i < pendingResultArr.length, "The result token does not belong to this batch");
        return (R) pendingResultArr[batchResultToken.f14657OooO00o].await(0L, TimeUnit.MILLISECONDS);
    }
}

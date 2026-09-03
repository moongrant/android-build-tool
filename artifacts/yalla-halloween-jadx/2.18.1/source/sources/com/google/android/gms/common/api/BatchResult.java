package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class BatchResult implements Result {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Status f15156Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final PendingResult<?>[] f15157Oooo0oO;

    public BatchResult(Status status, PendingResult<?>[] pendingResultArr) {
        this.f15156Oooo0o = status;
        this.f15157Oooo0oO = pendingResultArr;
    }

    @Override // com.google.android.gms.common.api.Result
    @NonNull
    public Status getStatus() {
        return this.f15156Oooo0o;
    }

    @NonNull
    public <R extends Result> R take(@NonNull BatchResultToken<R> batchResultToken) {
        Preconditions.checkArgument(batchResultToken.f15158OooO00o < this.f15157Oooo0oO.length, "The result token does not belong to this batch");
        return (R) this.f15157Oooo0oO[batchResultToken.f15158OooO00o].await(0L, TimeUnit.MILLISECONDS);
    }
}

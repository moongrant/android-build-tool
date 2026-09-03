package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.TransformedResult;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public final class OptionalPendingResultImpl<R extends Result> extends OptionalPendingResult<R> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final BasePendingResult<R> f15290OooO00o;

    public OptionalPendingResultImpl(@NonNull PendingResult<R> pendingResult) {
        this.f15290OooO00o = (BasePendingResult) pendingResult;
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void addStatusListener(@NonNull PendingResult.StatusListener statusListener) {
        this.f15290OooO00o.addStatusListener(statusListener);
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @NonNull
    public final R await() {
        return (R) this.f15290OooO00o.await();
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void cancel() {
        this.f15290OooO00o.cancel();
    }

    @Override // com.google.android.gms.common.api.OptionalPendingResult
    @NonNull
    public final R get() {
        if (!this.f15290OooO00o.isReady()) {
            throw new IllegalStateException("Result is not available. Check that isDone() returns true before calling get().");
        }
        return (R) this.f15290OooO00o.await(0L, TimeUnit.MILLISECONDS);
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final boolean isCanceled() {
        return this.f15290OooO00o.isCanceled();
    }

    @Override // com.google.android.gms.common.api.OptionalPendingResult
    public final boolean isDone() {
        return this.f15290OooO00o.isReady();
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void setResultCallback(@NonNull ResultCallback<? super R> resultCallback) {
        this.f15290OooO00o.setResultCallback(resultCallback);
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @NonNull
    public final <S extends Result> TransformedResult<S> then(@NonNull ResultTransform<? super R, ? extends S> resultTransform) {
        return this.f15290OooO00o.then(resultTransform);
    }

    @Override // com.google.android.gms.common.api.PendingResult
    @NonNull
    public final R await(long j, @NonNull TimeUnit timeUnit) {
        return (R) this.f15290OooO00o.await(j, timeUnit);
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final void setResultCallback(@NonNull ResultCallback<? super R> resultCallback, long j, @NonNull TimeUnit timeUnit) {
        this.f15290OooO00o.setResultCallback(resultCallback, j, timeUnit);
    }
}

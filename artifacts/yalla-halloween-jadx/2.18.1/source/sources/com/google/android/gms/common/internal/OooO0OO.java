package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO implements PendingResult.StatusListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PendingResult f15605OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f15606OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ PendingResultUtil.ResultConverter f15607OooO0OO;

    public OooO0OO(PendingResult pendingResult, TaskCompletionSource taskCompletionSource, PendingResultUtil.ResultConverter resultConverter) {
        this.f15605OooO00o = pendingResult;
        this.f15606OooO0O0 = taskCompletionSource;
        this.f15607OooO0OO = resultConverter;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(Status status) {
        if (!status.isSuccess()) {
            this.f15606OooO0O0.setException(ApiExceptionUtil.fromStatus(status));
        } else {
            this.f15606OooO0O0.setResult(this.f15607OooO0OO.convert(this.f15605OooO00o.await(0L, TimeUnit.MILLISECONDS)));
        }
    }
}

package com.google.android.gms.common.api;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o implements PendingResult.StatusListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Batch f15193OooO00o;

    public OooO00o(Batch batch) {
        this.f15193OooO00o = batch;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(Status status) {
        synchronized (this.f15193OooO00o.f15153OooOo00) {
            try {
                if (this.f15193OooO00o.isCanceled()) {
                    return;
                }
                if (status.isCanceled()) {
                    this.f15193OooO00o.f15150OooOOo = true;
                } else if (!status.isSuccess()) {
                    this.f15193OooO00o.f15151OooOOo0 = true;
                }
                Batch batch = this.f15193OooO00o;
                int i = batch.f15149OooOOOo - 1;
                batch.f15149OooOOOo = i;
                if (i == 0) {
                    if (batch.f15150OooOOo) {
                        super/*com.google.android.gms.common.api.internal.BasePendingResult*/.cancel();
                    } else {
                        Status status2 = batch.f15151OooOOo0 ? new Status(13) : Status.RESULT_SUCCESS;
                        Batch batch2 = this.f15193OooO00o;
                        batch2.setResult(new BatchResult(status2, batch2.f15152OooOOoo));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

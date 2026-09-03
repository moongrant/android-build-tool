package com.google.android.gms.common.api;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o implements PendingResult.StatusListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Batch f14692OooO00o;

    public OooO00o(Batch batch) {
        this.f14692OooO00o = batch;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(Status status) {
        synchronized (this.f14692OooO00o.f14652OooOo00) {
            try {
                if (this.f14692OooO00o.isCanceled()) {
                    return;
                }
                if (status.isCanceled()) {
                    this.f14692OooO00o.f14649OooOOo = true;
                } else if (!status.isSuccess()) {
                    this.f14692OooO00o.f14650OooOOo0 = true;
                }
                Batch batch = this.f14692OooO00o;
                int i = batch.f14648OooOOOo - 1;
                batch.f14648OooOOOo = i;
                if (i == 0) {
                    if (batch.f14649OooOOo) {
                        super/*com.google.android.gms.common.api.internal.BasePendingResult*/.cancel();
                    } else {
                        Status status2 = batch.f14650OooOOo0 ? new Status(13) : Status.RESULT_SUCCESS;
                        Batch batch2 = this.f14692OooO00o;
                        batch2.setResult(new BatchResult(status2, batch2.f14651OooOOoo));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

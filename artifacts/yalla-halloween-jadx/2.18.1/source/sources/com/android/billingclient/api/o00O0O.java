package com.android.billingclient.api;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O implements Callable {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ String f11314OooO00o = BillingClient.SkuType.SUBS;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ OooO0o f11315OooO0O0;

    public o00O0O(OooO0o oooO0o) {
        this.f11315OooO0O0 = oooO0o;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        return OooO0o.OooO(this.f11315OooO0O0, this.f11314OooO00o);
    }
}

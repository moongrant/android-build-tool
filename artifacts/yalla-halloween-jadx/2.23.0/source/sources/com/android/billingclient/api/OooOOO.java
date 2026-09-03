package com.android.billingclient.api;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ CompletableDeferred<o00Oo0> f9652OooO00o;

    public OooOOO(CompletableDeferred<o00Oo0> completableDeferred) {
        this.f9652OooO00o = completableDeferred;
    }

    @Override // com.android.billingclient.api.o00O0O
    public final void OooO00o(OooOo00 billingResult, List<Purchase> purchases) {
        Intrinsics.checkNotNullExpressionValue(billingResult, "billingResult");
        Intrinsics.checkNotNullExpressionValue(purchases, "purchases");
        this.f9652OooO00o.complete(new o00Oo0(billingResult, purchases));
    }
}

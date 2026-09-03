package com.android.billingclient.api;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;

/* JADX INFO: loaded from: classes.dex */
public final class OooO implements OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ CompletableDeferred<OooOo> f11212OooO00o;

    public OooO(CompletableDeferred<OooOo> completableDeferred) {
        this.f11212OooO00o = completableDeferred;
    }

    public final void OooO00o(OooOOO0 billingResult, List<Purchase> purchases) {
        Intrinsics.checkNotNullExpressionValue(billingResult, "billingResult");
        Intrinsics.checkNotNullExpressionValue(purchases, "purchases");
        this.f11212OooO00o.complete(new OooOo(billingResult, purchases));
    }
}

package com.android.billingclient.api;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 implements Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ CompletableDeferred<Oooo0> f12741OooO00o;

    public OooOO0(CompletableDeferred<Oooo0> completableDeferred) {
        this.f12741OooO00o = completableDeferred;
    }

    @Override // com.android.billingclient.api.Oooo000
    public final void OooO00o(OooOo00 billingResult, String str) {
        Intrinsics.checkNotNullExpressionValue(billingResult, "billingResult");
        this.f12741OooO00o.complete(new Oooo0(billingResult, str));
    }
}

package com.android.billingclient.api;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO implements OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ CompletableDeferred<OooOo00> f9624OooO00o;

    public OooO(CompletableDeferred<OooOo00> completableDeferred) {
        this.f9624OooO00o = completableDeferred;
    }

    @Override // com.android.billingclient.api.OooO0OO
    public final void OooO00o(OooOo00 it) {
        Intrinsics.checkNotNullExpressionValue(it, "it");
        this.f9624OooO00o.complete(it);
    }
}

package com.android.billingclient.api;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O implements o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ CompletableDeferred<o0OoOo0> f12742OooO00o;

    public OooOO0O(CompletableDeferred<o0OoOo0> completableDeferred) {
        this.f12742OooO00o = completableDeferred;
    }

    public final void OooO00o(OooOo00 billingResult, ArrayList arrayList) {
        Intrinsics.checkNotNullExpressionValue(billingResult, "billingResult");
        this.f12742OooO00o.complete(new o0OoOo0(billingResult, arrayList));
    }
}

package com.android.billingclient.api;

import androidx.annotation.RecentlyNonNull;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p042Ooooo0o.o000O0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooOOO0 f11240OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final List f11241OooO0O0;

    public OooOo(@RecentlyNonNull OooOOO0 billingResult, @RecentlyNonNull List<? extends Purchase> purchasesList) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        Intrinsics.checkNotNullParameter(purchasesList, "purchasesList");
        this.f11240OooO00o = billingResult;
        this.f11241OooO0O0 = purchasesList;
    }

    public final boolean equals(@RecentlyNonNull @Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOo)) {
            return false;
        }
        OooOo oooOo = (OooOo) obj;
        return Intrinsics.areEqual(this.f11240OooO00o, oooOo.f11240OooO00o) && Intrinsics.areEqual(this.f11241OooO0O0, oooOo.f11241OooO0O0);
    }

    public final int hashCode() {
        return this.f11241OooO0O0.hashCode() + (this.f11240OooO00o.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("PurchasesResult(billingResult=");
        sbOooO0o0.append(this.f11240OooO00o);
        sbOooO0o0.append(", purchasesList=");
        return o000O0Oo.OooO00o(sbOooO0o0, this.f11241OooO0O0, ')');
    }
}

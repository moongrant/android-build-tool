package com.android.billingclient.api;

import androidx.annotation.RecentlyNonNull;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooOo00 f12840OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final List f12841OooO0O0;

    public o00Oo0(@RecentlyNonNull OooOo00 billingResult, @RecentlyNonNull List<? extends Purchase> purchasesList) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        Intrinsics.checkNotNullParameter(purchasesList, "purchasesList");
        this.f12840OooO00o = billingResult;
        this.f12841OooO0O0 = purchasesList;
    }

    public final boolean equals(@RecentlyNonNull @Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00Oo0)) {
            return false;
        }
        o00Oo0 o00oo1 = (o00Oo0) obj;
        return Intrinsics.areEqual(this.f12840OooO00o, o00oo1.f12840OooO00o) && Intrinsics.areEqual(this.f12841OooO0O0, o00oo1.f12841OooO0O0);
    }

    public final int hashCode() {
        return this.f12841OooO0O0.hashCode() + (this.f12840OooO00o.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "PurchasesResult(billingResult=" + this.f12840OooO00o + ", purchasesList=" + this.f12841OooO0O0 + ')';
    }
}

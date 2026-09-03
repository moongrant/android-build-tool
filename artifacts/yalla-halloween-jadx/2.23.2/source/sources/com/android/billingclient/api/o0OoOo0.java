package com.android.billingclient.api;

import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OoOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooOo00 f12851OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final List f12852OooO0O0;

    public o0OoOo0(@RecentlyNonNull OooOo00 billingResult, @RecentlyNonNull @Nullable ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        this.f12851OooO00o = billingResult;
        this.f12852OooO0O0 = arrayList;
    }

    public final boolean equals(@RecentlyNonNull @Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0OoOo0)) {
            return false;
        }
        o0OoOo0 o0oooo1 = (o0OoOo0) obj;
        return Intrinsics.areEqual(this.f12851OooO00o, o0oooo1.f12851OooO00o) && Intrinsics.areEqual(this.f12852OooO0O0, o0oooo1.f12852OooO0O0);
    }

    public final int hashCode() {
        int iHashCode = this.f12851OooO00o.hashCode() * 31;
        List list = this.f12852OooO0O0;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public final String toString() {
        return "ProductDetailsResult(billingResult=" + this.f12851OooO00o + ", productDetailsList=" + this.f12852OooO0O0 + ')';
    }
}

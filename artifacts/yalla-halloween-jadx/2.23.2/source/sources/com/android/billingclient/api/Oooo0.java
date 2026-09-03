package com.android.billingclient.api;

import androidx.annotation.RecentlyNonNull;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooOo00 f12750OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final String f12751OooO0O0;

    public Oooo0(@RecentlyNonNull OooOo00 billingResult, @RecentlyNonNull @Nullable String str) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        this.f12750OooO00o = billingResult;
        this.f12751OooO0O0 = str;
    }

    public final boolean equals(@RecentlyNonNull @Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Oooo0)) {
            return false;
        }
        Oooo0 oooo0 = (Oooo0) obj;
        return Intrinsics.areEqual(this.f12750OooO00o, oooo0.f12750OooO00o) && Intrinsics.areEqual(this.f12751OooO0O0, oooo0.f12751OooO0O0);
    }

    public final int hashCode() {
        int iHashCode = this.f12750OooO00o.hashCode() * 31;
        String str = this.f12751OooO0O0;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("ConsumeResult(billingResult=");
        sb.append(this.f12750OooO00o);
        sb.append(", purchaseToken=");
        return androidx.compose.foundation.layout.oo000o.OooO0O0(sb, this.f12751OooO0O0, ')');
    }
}

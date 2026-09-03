package com.google.common.math;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import java.util.Arrays;
import o0OOOO0o.OooOOO0;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@Beta
@GwtIncompatible
public final class Stats implements Serializable {
    public final boolean equals(@NullableDecl Object obj) {
        if (obj == null || Stats.class != obj.getClass()) {
            return false;
        }
        return Double.doubleToLongBits(0.0d) == Double.doubleToLongBits(0.0d) && Double.doubleToLongBits(0.0d) == Double.doubleToLongBits(0.0d) && Double.doubleToLongBits(0.0d) == Double.doubleToLongBits(0.0d) && Double.doubleToLongBits(0.0d) == Double.doubleToLongBits(0.0d);
    }

    public final int hashCode() {
        Double dValueOf = Double.valueOf(0.0d);
        return Arrays.hashCode(new Object[]{0L, dValueOf, dValueOf, dValueOf, dValueOf});
    }

    public final String toString() {
        OooOOO0.OooO00o oooO00oOooO0O0 = OooOOO0.OooO0O0(this);
        oooO00oOooO0O0.OooO0OO("count", String.valueOf(0L));
        return oooO00oOooO0O0.toString();
    }
}

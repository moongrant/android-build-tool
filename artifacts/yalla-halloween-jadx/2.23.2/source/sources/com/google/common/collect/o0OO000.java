package com.google.common.collect;

import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o0OO000<R, C, V> implements o0O.OooO00o<R, C, V> {
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0O.OooO00o)) {
            return false;
        }
        o0O.OooO00o oooO00o = (o0O.OooO00o) obj;
        return com.google.common.base.Oooo0.OooO00o(OooO00o(), oooO00o.OooO00o()) && com.google.common.base.Oooo0.OooO00o(OooO0O0(), oooO00o.OooO0O0()) && com.google.common.base.Oooo0.OooO00o(getValue(), oooO00o.getValue());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{OooO00o(), OooO0O0(), getValue()});
    }

    public final String toString() {
        String strValueOf = String.valueOf(OooO00o());
        String strValueOf2 = String.valueOf(OooO0O0());
        String strValueOf3 = String.valueOf(getValue());
        StringBuilder sb = new StringBuilder(strValueOf3.length() + strValueOf2.length() + strValueOf.length() + 4);
        sb.append("(");
        sb.append(strValueOf);
        sb.append(",");
        sb.append(strValueOf2);
        return p028Oooo0oO.o0oOO.OooO0O0(sb, ")=", strValueOf3);
    }
}

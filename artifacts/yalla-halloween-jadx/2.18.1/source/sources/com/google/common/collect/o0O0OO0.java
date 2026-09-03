package com.google.common.collect;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o0O0OO0<R, C, V> implements o0O0O0o0.OooO00o<R, C, V> {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0O0O0o0.OooO00o)) {
            return false;
        }
        o0O0O0o0.OooO00o oooO00o = (o0O0O0o0.OooO00o) obj;
        o0O0OOO0 o0o0ooo0 = (o0O0OOO0) this;
        return o0OOOO0o.OooOOO.OooO00o(o0o0ooo0.f18622Oooo0o, oooO00o.OooO0O0()) && o0OOOO0o.OooOOO.OooO00o(o0o0ooo0.f18623Oooo0oO, oooO00o.OooO00o()) && o0OOOO0o.OooOOO.OooO00o(o0o0ooo0.f18624Oooo0oo, oooO00o.getValue());
    }

    public final int hashCode() {
        o0O0OOO0 o0o0ooo0 = (o0O0OOO0) this;
        return Arrays.hashCode(new Object[]{o0o0ooo0.f18622Oooo0o, o0o0ooo0.f18623Oooo0oO, o0o0ooo0.f18624Oooo0oo});
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("(");
        o0O0OOO0 o0o0ooo0 = (o0O0OOO0) this;
        sbOooO0o0.append(o0o0ooo0.f18622Oooo0o);
        sbOooO0o0.append(",");
        sbOooO0o0.append(o0o0ooo0.f18623Oooo0oO);
        sbOooO0o0.append(")=");
        sbOooO0o0.append(o0o0ooo0.f18624Oooo0oo);
        return sbOooO0o0.toString();
    }
}

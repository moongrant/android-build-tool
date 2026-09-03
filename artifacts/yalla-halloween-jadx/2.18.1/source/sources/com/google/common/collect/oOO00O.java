package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true)
public final class oOO00O {
    public static String OooO00o(Iterable<?> iterable) {
        Iterator<?> it = iterable.iterator();
        StringBuilder sbOooO00o = p028Oooo0o0.o00O0O0O.OooO00o('[');
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sbOooO00o.append(", ");
            }
            z = false;
            sbOooO00o.append(it.next());
        }
        sbOooO00o.append(']');
        return sbOooO00o.toString();
    }
}

package org.jctools.maps;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class OooO0O0 {
    public static /* synthetic */ boolean OooO00o(Unsafe unsafe, Object obj, long j, Object obj2) {
        while (!unsafe.compareAndSwapObject(obj, j, (Object) null, obj2)) {
            if (unsafe.getObject(obj, j) != null) {
                return false;
            }
        }
        return true;
    }
}

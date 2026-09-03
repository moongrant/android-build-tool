package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import p334o0OO00o.o00O;
import p334o0OO00o.o00O0OOO;
import p334o0OO00o.oo0oOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzil {
    public static zzih zza(zzih zzihVar) {
        if ((zzihVar instanceof oo0oOO0) || (zzihVar instanceof o00O0OOO)) {
            return zzihVar;
        }
        return zzihVar instanceof Serializable ? new o00O0OOO(zzihVar) : new oo0oOO0(zzihVar);
    }

    public static zzih zzb(Object obj) {
        return new o00O(obj);
    }
}

package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzir {
    public static zzim zza(zzim zzimVar) {
        if ((zzimVar instanceof o00O) || (zzimVar instanceof oo0oOO0)) {
            return zzimVar;
        }
        return zzimVar instanceof Serializable ? new oo0oOO0(zzimVar) : new o00O(zzimVar);
    }

    public static zzim zzb(Object obj) {
        return new o00OO000(obj);
    }
}

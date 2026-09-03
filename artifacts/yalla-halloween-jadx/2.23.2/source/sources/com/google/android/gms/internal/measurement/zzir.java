package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzir {
    public static zzim zza(zzim zzimVar) {
        if ((zzimVar instanceof o00OO000) || (zzimVar instanceof o00O)) {
            return zzimVar;
        }
        return zzimVar instanceof Serializable ? new o00O(zzimVar) : new o00OO000(zzimVar);
    }

    public static zzim zzb(Object obj) {
        return new o00OO00O(obj);
    }
}

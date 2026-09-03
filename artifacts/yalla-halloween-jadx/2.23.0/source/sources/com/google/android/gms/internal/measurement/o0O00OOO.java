package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O00OOO extends o0oO0Ooo {
    @Override // com.google.android.gms.internal.measurement.o0oO0Ooo
    public final void OooO00o(long j, Object obj) {
        ((zzli) o0oo0000.OooOO0(j, obj)).zzb();
    }

    @Override // com.google.android.gms.internal.measurement.o0oO0Ooo
    public final void OooO0O0(long j, Object obj, Object obj2) {
        zzli zzliVarZzd = (zzli) o0oo0000.OooOO0(j, obj);
        zzli zzliVar = (zzli) o0oo0000.OooOO0(j, obj2);
        int size = zzliVarZzd.size();
        int size2 = zzliVar.size();
        if (size > 0 && size2 > 0) {
            if (!zzliVarZzd.zzc()) {
                zzliVarZzd = zzliVarZzd.zzd(size2 + size);
            }
            zzliVarZzd.addAll(zzliVar);
        }
        if (size > 0) {
            zzliVar = zzliVarZzd;
        }
        o0oo0000.OooOOo(j, obj, zzliVar);
    }
}

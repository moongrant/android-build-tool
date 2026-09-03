package p334o0OO00o;

import com.google.android.gms.internal.measurement.zzkl;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OoOoOo extends o0O000Oo {
    @Override // p334o0OO00o.o0O000Oo
    public final void OooO00o(Object obj, long j) {
        ((zzkl) o0OO0oO0.OooOO0(obj, j)).zzb();
    }

    @Override // p334o0OO00o.o0O000Oo
    public final void OooO0O0(Object obj, Object obj2, long j) {
        zzkl zzklVarZzd = (zzkl) o0OO0oO0.OooOO0(obj, j);
        zzkl zzklVar = (zzkl) o0OO0oO0.OooOO0(obj2, j);
        int size = zzklVarZzd.size();
        int size2 = zzklVar.size();
        if (size > 0 && size2 > 0) {
            if (!zzklVarZzd.zzc()) {
                zzklVarZzd = zzklVarZzd.zzd(size2 + size);
            }
            zzklVarZzd.addAll(zzklVar);
        }
        if (size > 0) {
            zzklVar = zzklVarZzd;
        }
        o0OO0oO0.OooOOo(obj, j, zzklVar);
    }
}

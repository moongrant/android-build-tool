package com.google.android.gms.internal.measurement;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OO000 implements zzim {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final zzio f15013OooO0o = zzio.zza;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile zzim f15014OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @CheckForNull
    public Object f15015OooO0o0;

    public o00OO000(zzim zzimVar) {
        zzimVar.getClass();
        this.f15014OooO0Oo = zzimVar;
    }

    public final String toString() {
        Object objOooO0O0 = this.f15014OooO0Oo;
        if (objOooO0O0 == f15013OooO0o) {
            objOooO0O0 = p004OooO0oO.o000oOoO.OooO0O0("<supplier that returned ", String.valueOf(this.f15015OooO0o0), ">");
        }
        return p004OooO0oO.o000oOoO.OooO0O0("Suppliers.memoize(", String.valueOf(objOooO0O0), ")");
    }

    @Override // com.google.android.gms.internal.measurement.zzim
    public final Object zza() {
        zzim zzimVar = this.f15014OooO0Oo;
        zzio zzioVar = f15013OooO0o;
        if (zzimVar != zzioVar) {
            synchronized (this) {
                if (this.f15014OooO0Oo != zzioVar) {
                    Object objZza = this.f15014OooO0Oo.zza();
                    this.f15015OooO0o0 = objZza;
                    this.f15014OooO0Oo = zzioVar;
                    return objZza;
                }
            }
        }
        return this.f15015OooO0o0;
    }
}

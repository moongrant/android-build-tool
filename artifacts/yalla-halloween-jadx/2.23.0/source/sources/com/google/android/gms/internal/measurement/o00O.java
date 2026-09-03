package com.google.android.gms.internal.measurement;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O implements zzim {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final zzio f15470OooO0o = zzio.zza;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile zzim f15471OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @CheckForNull
    public Object f15472OooO0o0;

    public o00O(zzim zzimVar) {
        zzimVar.getClass();
        this.f15471OooO0Oo = zzimVar;
    }

    public final String toString() {
        Object objOooO00o = this.f15471OooO0Oo;
        if (objOooO00o == f15470OooO0o) {
            objOooO00o = p004OooO0oO.o000oOoO.OooO00o("<supplier that returned ", String.valueOf(this.f15472OooO0o0), ">");
        }
        return p004OooO0oO.o000oOoO.OooO00o("Suppliers.memoize(", String.valueOf(objOooO00o), ")");
    }

    @Override // com.google.android.gms.internal.measurement.zzim
    public final Object zza() {
        zzim zzimVar = this.f15471OooO0Oo;
        zzio zzioVar = f15470OooO0o;
        if (zzimVar != zzioVar) {
            synchronized (this) {
                if (this.f15471OooO0Oo != zzioVar) {
                    Object objZza = this.f15471OooO0Oo.zza();
                    this.f15472OooO0o0 = objZza;
                    this.f15471OooO0Oo = zzioVar;
                    return objZza;
                }
            }
        }
        return this.f15472OooO0o0;
    }
}

package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class oo0oOO0 implements Serializable, zzim {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final zzim f15642OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @CheckForNull
    public transient Object f15643OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public volatile transient boolean f15644OooO0o0;

    public oo0oOO0(zzim zzimVar) {
        zzimVar.getClass();
        this.f15642OooO0Oo = zzimVar;
    }

    public final String toString() {
        return p004OooO0oO.o000oOoO.OooO00o("Suppliers.memoize(", (this.f15644OooO0o0 ? p004OooO0oO.o000oOoO.OooO00o("<supplier that returned ", String.valueOf(this.f15643OooO0o), ">") : this.f15642OooO0Oo).toString(), ")");
    }

    @Override // com.google.android.gms.internal.measurement.zzim
    public final Object zza() {
        if (!this.f15644OooO0o0) {
            synchronized (this) {
                if (!this.f15644OooO0o0) {
                    Object objZza = this.f15642OooO0Oo.zza();
                    this.f15643OooO0o = objZza;
                    this.f15644OooO0o0 = true;
                    return objZza;
                }
            }
        }
        return this.f15643OooO0o;
    }
}

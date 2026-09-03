package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O implements Serializable, zzim {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final zzim f14993OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @CheckForNull
    public transient Object f14994OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public volatile transient boolean f14995OooO0o0;

    public o00O(zzim zzimVar) {
        zzimVar.getClass();
        this.f14993OooO0Oo = zzimVar;
    }

    public final String toString() {
        return p004OooO0oO.o000oOoO.OooO0O0("Suppliers.memoize(", (this.f14995OooO0o0 ? p004OooO0oO.o000oOoO.OooO0O0("<supplier that returned ", String.valueOf(this.f14994OooO0o), ">") : this.f14993OooO0Oo).toString(), ")");
    }

    @Override // com.google.android.gms.internal.measurement.zzim
    public final Object zza() {
        if (!this.f14995OooO0o0) {
            synchronized (this) {
                if (!this.f14995OooO0o0) {
                    Object objZza = this.f14993OooO0Oo.zza();
                    this.f14994OooO0o = objZza;
                    this.f14995OooO0o0 = true;
                    return objZza;
                }
            }
        }
        return this.f14994OooO0o;
    }
}

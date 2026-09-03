package com.google.android.gms.internal.measurement;

import p334o0OO00o.o00OOO0O;

/* JADX INFO: loaded from: classes2.dex */
public class zzkr {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public volatile zzll f15982OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public volatile zzjd f15983OooO0O0;

    static {
        zzjq zzjqVar = zzjq.f15974OooO0OO;
    }

    public final void OooO00o(zzll zzllVar) {
        if (this.f15982OooO00o != null) {
            return;
        }
        synchronized (this) {
            if (this.f15982OooO00o == null) {
                try {
                    this.f15982OooO00o = zzllVar;
                    this.f15983OooO0O0 = zzjd.zzb;
                } catch (zzko unused) {
                    this.f15982OooO00o = zzllVar;
                    this.f15983OooO0O0 = zzjd.zzb;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzkr)) {
            return false;
        }
        zzkr zzkrVar = (zzkr) obj;
        zzll zzllVar = this.f15982OooO00o;
        zzll zzllVar2 = zzkrVar.f15982OooO00o;
        if (zzllVar == null && zzllVar2 == null) {
            return zzb().equals(zzkrVar.zzb());
        }
        if (zzllVar != null && zzllVar2 != null) {
            return zzllVar.equals(zzllVar2);
        }
        if (zzllVar != null) {
            zzkrVar.OooO00o(zzllVar.zzbO());
            return zzllVar.equals(zzkrVar.f15982OooO00o);
        }
        OooO00o(zzllVar2.zzbO());
        return this.f15982OooO00o.equals(zzllVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.f15983OooO0O0 != null) {
            return ((o00OOO0O) this.f15983OooO0O0).f37334Oooo0oO.length;
        }
        if (this.f15982OooO00o != null) {
            return this.f15982OooO00o.zzbw();
        }
        return 0;
    }

    public final zzjd zzb() {
        if (this.f15983OooO0O0 != null) {
            return this.f15983OooO0O0;
        }
        synchronized (this) {
            if (this.f15983OooO0O0 != null) {
                return this.f15983OooO0O0;
            }
            if (this.f15982OooO00o == null) {
                this.f15983OooO0O0 = zzjd.zzb;
            } else {
                this.f15983OooO0O0 = this.f15982OooO00o.zzbs();
            }
            return this.f15983OooO0O0;
        }
    }
}

package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public class zzlo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public volatile zzmi f15279OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public volatile zzka f15280OooO0O0;

    static {
        zzkn zzknVar = zzkn.f15271OooO0O0;
    }

    public final void OooO00o(zzmi zzmiVar) {
        if (this.f15279OooO00o != null) {
            return;
        }
        synchronized (this) {
            if (this.f15279OooO00o == null) {
                try {
                    this.f15279OooO00o = zzmiVar;
                    this.f15280OooO0O0 = zzka.zzb;
                } catch (zzll unused) {
                    this.f15279OooO00o = zzmiVar;
                    this.f15280OooO0O0 = zzka.zzb;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzlo)) {
            return false;
        }
        zzlo zzloVar = (zzlo) obj;
        zzmi zzmiVar = this.f15279OooO00o;
        zzmi zzmiVar2 = zzloVar.f15279OooO00o;
        if (zzmiVar == null && zzmiVar2 == null) {
            return zzb().equals(zzloVar.zzb());
        }
        if (zzmiVar != null && zzmiVar2 != null) {
            return zzmiVar.equals(zzmiVar2);
        }
        if (zzmiVar != null) {
            zzloVar.OooO00o(zzmiVar.zzbV());
            return zzmiVar.equals(zzloVar.f15279OooO00o);
        }
        OooO00o(zzmiVar2.zzbV());
        return this.f15279OooO00o.equals(zzmiVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.f15280OooO0O0 != null) {
            return ((o0O0o) this.f15280OooO0O0).f15077OooO0o0.length;
        }
        if (this.f15279OooO00o != null) {
            return this.f15279OooO00o.zzbz();
        }
        return 0;
    }

    public final zzka zzb() {
        if (this.f15280OooO0O0 != null) {
            return this.f15280OooO0O0;
        }
        synchronized (this) {
            if (this.f15280OooO0O0 != null) {
                return this.f15280OooO0O0;
            }
            if (this.f15279OooO00o == null) {
                this.f15280OooO0O0 = zzka.zzb;
            } else {
                this.f15280OooO0O0 = this.f15279OooO00o.zzbv();
            }
            return this.f15280OooO0O0;
        }
    }
}

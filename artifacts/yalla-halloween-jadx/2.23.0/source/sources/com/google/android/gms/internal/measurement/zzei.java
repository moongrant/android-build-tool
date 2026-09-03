package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzei extends zzlb implements zzmj {
    private static final zzei zza;
    private int zzd;
    private int zze;
    private zzli zzf;
    private zzli zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        zzei zzeiVar = new zzei();
        zza = zzeiVar;
        zzlb.OooO(zzei.class, zzeiVar);
    }

    public zzei() {
        o0O o0o = o0O.f15517OooO0oO;
        this.zzf = o0o;
        this.zzg = o0o;
    }

    public static /* synthetic */ void OooOOO(zzei zzeiVar, int i, zzet zzetVar) {
        zzetVar.getClass();
        zzli zzliVar = zzeiVar.zzf;
        if (!zzliVar.zzc()) {
            zzeiVar.zzf = zzlb.OooO0o(zzliVar);
        }
        zzeiVar.zzf.set(i, zzetVar);
    }

    public static /* synthetic */ void OooOOOO(zzei zzeiVar, int i, zzek zzekVar) {
        zzekVar.getClass();
        zzli zzliVar = zzeiVar.zzg;
        if (!zzliVar.zzc()) {
            zzeiVar.zzg = zzlb.OooO0o(zzliVar);
        }
        zzeiVar.zzg.set(i, zzekVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final Object OooOO0o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new o0OO000(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzd", "zze", "zzf", zzet.class, "zzg", zzek.class, "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzei();
        }
        if (i2 == 4) {
            return new zzeh(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final int zza() {
        return this.zze;
    }

    public final int zzb() {
        return this.zzg.size();
    }

    public final int zzc() {
        return this.zzf.size();
    }

    public final zzek zze(int i) {
        return (zzek) this.zzg.get(i);
    }

    public final zzet zzf(int i) {
        return (zzet) this.zzf.get(i);
    }

    public final List zzg() {
        return this.zzg;
    }

    public final List zzh() {
        return this.zzf;
    }

    public final boolean zzk() {
        return (this.zzd & 1) != 0;
    }
}

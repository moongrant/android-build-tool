package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgi extends zzlb implements zzmj {
    private static final zzgi zza;
    private zzlh zzd;
    private zzlh zze;
    private zzli zzf;
    private zzli zzg;

    static {
        zzgi zzgiVar = new zzgi();
        zza = zzgiVar;
        zzlb.OooO(zzgi.class, zzgiVar);
    }

    public zzgi() {
        o0O00oO0 o0o00oo1 = o0O00oO0.f15069OooO0oO;
        this.zzd = o0o00oo1;
        this.zze = o0o00oo1;
        o0OO000 o0oo000 = o0OO000.f15098OooO0oO;
        this.zzf = o0oo000;
        this.zzg = o0oo000;
    }

    public static void OooOOO(zzgi zzgiVar, Iterable iterable) {
        zzlh zzlhVar = zzgiVar.zzd;
        if (!zzlhVar.zzc()) {
            int size = zzlhVar.size();
            zzgiVar.zzd = zzlhVar.zzd(size == 0 ? 10 : size + size);
        }
        zzjk.OooO0O0(iterable, zzgiVar.zzd);
    }

    public static void OooOOOO(zzgi zzgiVar) {
        zzgiVar.zzd = o0O00oO0.f15069OooO0oO;
    }

    public static void OooOOOo(zzgi zzgiVar, Iterable iterable) {
        zzlh zzlhVar = zzgiVar.zze;
        if (!zzlhVar.zzc()) {
            int size = zzlhVar.size();
            zzgiVar.zze = zzlhVar.zzd(size == 0 ? 10 : size + size);
        }
        zzjk.OooO0O0(iterable, zzgiVar.zze);
    }

    public static /* synthetic */ void OooOOo(zzgi zzgiVar, Iterable iterable) {
        zzli zzliVar = zzgiVar.zzf;
        if (!zzliVar.zzc()) {
            zzgiVar.zzf = zzlb.OooO0o(zzliVar);
        }
        zzjk.OooO0O0(iterable, zzgiVar.zzf);
    }

    public static void OooOOo0(zzgi zzgiVar) {
        zzgiVar.zze = o0O00oO0.f15069OooO0oO;
    }

    public static void OooOOoo(zzgi zzgiVar) {
        zzgiVar.zzf = o0OO000.f15098OooO0oO;
    }

    public static void OooOo0(zzgi zzgiVar) {
        zzgiVar.zzg = o0OO000.f15098OooO0oO;
    }

    public static /* synthetic */ void OooOo00(zzgi zzgiVar, Iterable iterable) {
        zzli zzliVar = zzgiVar.zzg;
        if (!zzliVar.zzc()) {
            zzgiVar.zzg = zzlb.OooO0o(zzliVar);
        }
        zzjk.OooO0O0(iterable, zzgiVar.zzg);
    }

    public static zzgh zze() {
        return (zzgh) zza.OooO0Oo();
    }

    public static zzgi zzg() {
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final Object OooOO0o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new o0OO000o(zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzd", "zze", "zzf", zzfr.class, "zzg", zzgk.class});
        }
        if (i2 == 3) {
            return new zzgi();
        }
        if (i2 == 4) {
            return new zzgh(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final int zza() {
        return this.zzf.size();
    }

    public final int zzb() {
        return this.zze.size();
    }

    public final int zzc() {
        return this.zzg.size();
    }

    public final int zzd() {
        return this.zzd.size();
    }

    public final List zzh() {
        return this.zzf;
    }

    public final List zzi() {
        return this.zze;
    }

    public final List zzj() {
        return this.zzg;
    }

    public final List zzk() {
        return this.zzd;
    }
}

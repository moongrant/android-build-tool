package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfp extends zzlb implements zzmj {
    private static final zzfp zza;
    private int zzd;
    private int zze;
    private zzgi zzf;
    private zzgi zzg;
    private boolean zzh;

    static {
        zzfp zzfpVar = new zzfp();
        zza = zzfpVar;
        zzlb.OooO(zzfp.class, zzfpVar);
    }

    public static /* synthetic */ void OooOOO(zzfp zzfpVar, int i) {
        zzfpVar.zzd |= 1;
        zzfpVar.zze = i;
    }

    public static /* synthetic */ void OooOOOO(zzfp zzfpVar, zzgi zzgiVar) {
        zzgiVar.getClass();
        zzfpVar.zzf = zzgiVar;
        zzfpVar.zzd |= 2;
    }

    public static /* synthetic */ void OooOOOo(zzfp zzfpVar, zzgi zzgiVar) {
        zzfpVar.zzg = zzgiVar;
        zzfpVar.zzd |= 4;
    }

    public static /* synthetic */ void OooOOo0(zzfp zzfpVar, boolean z) {
        zzfpVar.zzd |= 8;
        zzfpVar.zzh = z;
    }

    public static zzfo zzb() {
        return (zzfo) zza.OooO0Oo();
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final Object OooOO0o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new o0OO000(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzfp();
        }
        if (i2 == 4) {
            return new zzfo(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzgi zzd() {
        zzgi zzgiVar = this.zzf;
        return zzgiVar == null ? zzgi.zzg() : zzgiVar;
    }

    public final zzgi zze() {
        zzgi zzgiVar = this.zzg;
        return zzgiVar == null ? zzgi.zzg() : zzgiVar;
    }

    public final boolean zzj() {
        return this.zzh;
    }

    public final boolean zzk() {
        return (this.zzd & 1) != 0;
    }

    public final boolean zzm() {
        return (this.zzd & 8) != 0;
    }

    public final boolean zzn() {
        return (this.zzd & 4) != 0;
    }
}

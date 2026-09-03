package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgm extends zzlb implements zzmj {
    private static final zzgm zza;
    private int zzd;
    private long zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;

    static {
        zzgm zzgmVar = new zzgm();
        zza = zzgmVar;
        zzlb.OooO(zzgm.class, zzgmVar);
    }

    public static /* synthetic */ void OooOOO(zzgm zzgmVar, long j) {
        zzgmVar.zzd |= 1;
        zzgmVar.zze = j;
    }

    public static /* synthetic */ void OooOOOO(zzgm zzgmVar, String str) {
        str.getClass();
        zzgmVar.zzd |= 2;
        zzgmVar.zzf = str;
    }

    public static /* synthetic */ void OooOOOo(zzgm zzgmVar, String str) {
        str.getClass();
        zzgmVar.zzd |= 4;
        zzgmVar.zzg = str;
    }

    public static /* synthetic */ void OooOOo(zzgm zzgmVar, long j) {
        zzgmVar.zzd |= 8;
        zzgmVar.zzh = j;
    }

    public static /* synthetic */ void OooOOo0(zzgm zzgmVar) {
        zzgmVar.zzd &= -5;
        zzgmVar.zzg = zza.zzg;
    }

    public static /* synthetic */ void OooOOoo(zzgm zzgmVar) {
        zzgmVar.zzd &= -9;
        zzgmVar.zzh = 0L;
    }

    public static /* synthetic */ void OooOo0(zzgm zzgmVar) {
        zzgmVar.zzd &= -33;
        zzgmVar.zzj = 0.0d;
    }

    public static /* synthetic */ void OooOo00(zzgm zzgmVar, double d) {
        zzgmVar.zzd |= 32;
        zzgmVar.zzj = d;
    }

    public static zzgl zzd() {
        return (zzgl) zza.OooO0Oo();
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final Object OooOO0o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new o0OO000(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzgm();
        }
        if (i2 == 4) {
            return new zzgl(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final double zza() {
        return this.zzj;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final long zzc() {
        return this.zze;
    }

    public final String zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zzg;
    }

    public final boolean zzq() {
        return (this.zzd & 32) != 0;
    }

    public final boolean zzr() {
        return (this.zzd & 8) != 0;
    }

    public final boolean zzs() {
        return (this.zzd & 1) != 0;
    }

    public final boolean zzt() {
        return (this.zzd & 4) != 0;
    }
}

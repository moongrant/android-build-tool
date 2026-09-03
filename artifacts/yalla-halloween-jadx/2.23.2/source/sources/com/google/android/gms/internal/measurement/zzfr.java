package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfr extends zzlb implements zzmj {
    private static final zzfr zza;
    private int zzd;
    private int zze;
    private long zzf;

    static {
        zzfr zzfrVar = new zzfr();
        zza = zzfrVar;
        zzlb.OooO(zzfr.class, zzfrVar);
    }

    public static /* synthetic */ void OooOOO(zzfr zzfrVar, int i) {
        zzfrVar.zzd |= 1;
        zzfrVar.zze = i;
    }

    public static /* synthetic */ void OooOOOO(zzfr zzfrVar, long j) {
        zzfrVar.zzd |= 2;
        zzfrVar.zzf = j;
    }

    public static zzfq zzc() {
        return (zzfq) zza.OooO0Oo();
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final Object OooOO0o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new o0OO000o(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzfr();
        }
        if (i2 == 4) {
            return new zzfq(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final int zza() {
        return this.zze;
    }

    public final long zzb() {
        return this.zzf;
    }

    public final boolean zzg() {
        return (this.zzd & 2) != 0;
    }

    public final boolean zzh() {
        return (this.zzd & 1) != 0;
    }
}

package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class zzer extends zzlb implements zzmj {
    private static final zzer zza;
    private int zzd;
    private int zze;
    private boolean zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        zzer zzerVar = new zzer();
        zza = zzerVar;
        zzlb.OooO(zzer.class, zzerVar);
    }

    public static zzer zzb() {
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
            return new o0OO000o(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzd", "zze", o00.f14915OooO00o, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzer();
        }
        if (i2 == 4) {
            return new zzen(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final String zzc() {
        return this.zzg;
    }

    public final String zzd() {
        return this.zzi;
    }

    public final String zze() {
        return this.zzh;
    }

    public final boolean zzf() {
        return this.zzf;
    }

    public final boolean zzg() {
        return (this.zzd & 1) != 0;
    }

    public final boolean zzh() {
        return (this.zzd & 4) != 0;
    }

    public final boolean zzi() {
        return (this.zzd & 2) != 0;
    }

    public final boolean zzj() {
        return (this.zzd & 16) != 0;
    }

    public final boolean zzk() {
        return (this.zzd & 8) != 0;
    }

    public final int zzm() {
        int iZza = zzeq.zza(this.zze);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }
}

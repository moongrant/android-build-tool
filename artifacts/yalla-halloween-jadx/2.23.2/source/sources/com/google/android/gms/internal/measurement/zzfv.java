package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfv extends zzlb implements zzmj {
    private static final zzfv zza;
    private int zzd;
    private String zze = "";
    private long zzf;

    static {
        zzfv zzfvVar = new zzfv();
        zza = zzfvVar;
        zzlb.OooO(zzfv.class, zzfvVar);
    }

    public static /* synthetic */ void OooOOO(zzfv zzfvVar, String str) {
        str.getClass();
        zzfvVar.zzd |= 1;
        zzfvVar.zze = str;
    }

    public static /* synthetic */ void OooOOOO(zzfv zzfvVar, long j) {
        zzfvVar.zzd |= 2;
        zzfvVar.zzf = j;
    }

    public static zzfu zza() {
        return (zzfu) zza.OooO0Oo();
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final Object OooOO0o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new o0OO000o(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzfv();
        }
        if (i2 == 4) {
            return new zzfu(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }
}

package com.google.android.gms.internal.measurement;

import com.android.billingclient.api.oo0o0Oo;
import p334o0OO00o.o0O0OOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfm extends zzke implements zzlm {
    private static final zzfm zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";

    static {
        zzfm zzfmVar = new zzfm();
        zza = zzfmVar;
        zzke.OooO0oO(zzfm.class, zzfmVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzke
    public final Object OooOO0(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new o0O0OOO0(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new zzfm();
        }
        oo0o0Oo oo0o0oo = null;
        if (i2 == 4) {
            return new zzfl(oo0o0oo);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }
}

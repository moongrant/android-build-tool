package com.google.android.gms.internal.measurement;

import com.android.billingclient.api.o0Oo0oo;
import p334o0OO00o.o0O0OOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfi extends zzke implements zzlm {
    private static final zzfi zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        zzfi zzfiVar = new zzfi();
        zza = zzfiVar;
        zzke.OooO0oO(zzfi.class, zzfiVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzke
    public final Object OooOO0(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new o0O0OOO0(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzfi();
        }
        o0Oo0oo o0oo0oo2 = null;
        if (i2 == 4) {
            return new zzfh(o0oo0oo2);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final String zzb() {
        return this.zzf;
    }

    public final String zzc() {
        return this.zzg;
    }
}

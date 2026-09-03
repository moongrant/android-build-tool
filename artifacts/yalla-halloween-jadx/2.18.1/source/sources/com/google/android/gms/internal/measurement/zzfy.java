package com.google.android.gms.internal.measurement;

import com.android.billingclient.api.oo0o0Oo;
import p334o0OO00o.o0O0OOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfy extends zzke implements zzlm {
    private static final zzfy zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private zzfm zzh;

    static {
        zzfy zzfyVar = new zzfy();
        zza = zzfyVar;
        zzke.OooO0oO(zzfy.class, zzfyVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzke
    public final Object OooOO0(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new o0O0OOO0(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzfy();
        }
        oo0o0Oo oo0o0oo = null;
        if (i2 == 4) {
            return new zzfx(oo0o0oo);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }
}

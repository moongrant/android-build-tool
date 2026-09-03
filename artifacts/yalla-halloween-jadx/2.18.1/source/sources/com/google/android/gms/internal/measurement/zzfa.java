package com.google.android.gms.internal.measurement;

import com.android.billingclient.api.o0Oo0oo;
import p334o0OO00o.o0O0OO0;
import p334o0OO00o.o0O0OOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfa extends zzke implements zzlm {
    private static final zzfa zza;
    private int zze;
    private String zzf = "";
    private zzkl zzg = o0O0OO0.f37394Oooo;
    private boolean zzh;

    static {
        zzfa zzfaVar = new zzfa();
        zza = zzfaVar;
        zzke.OooO0oO(zzfa.class, zzfaVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzke
    public final Object OooOO0(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new o0O0OOO0(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zze", "zzf", "zzg", zzfg.class, "zzh"});
        }
        if (i2 == 3) {
            return new zzfa();
        }
        o0Oo0oo o0oo0oo2 = null;
        if (i2 == 4) {
            return new zzez(o0oo0oo2);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final String zzb() {
        return this.zzf;
    }
}

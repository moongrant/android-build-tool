package com.google.android.gms.internal.measurement;

import com.android.billingclient.api.o0O0O00;
import java.util.List;
import p334o0OO00o.o0O0OO0;
import p334o0OO00o.o0O0OOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgq extends zzke implements zzlm {
    private static final zzgq zza;
    private int zze;
    private String zzf = "";
    private zzkl zzg = o0O0OO0.f37394Oooo;

    static {
        zzgq zzgqVar = new zzgq();
        zza = zzgqVar;
        zzke.OooO0oO(zzgq.class, zzgqVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzke
    public final Object OooOO0(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new o0O0OOO0(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", zzgx.class});
        }
        if (i2 == 3) {
            return new zzgq();
        }
        o0O0O00 o0o0o00 = null;
        if (i2 == 4) {
            return new zzgp(o0o0o00);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final String zzb() {
        return this.zzf;
    }

    public final List zzc() {
        return this.zzg;
    }
}

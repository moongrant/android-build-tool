package com.google.android.gms.internal.measurement;

import com.android.billingclient.api.o0O0O00;
import java.util.List;
import p334o0OO00o.o0O0OO0;
import p334o0OO00o.o0O0OOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgs extends zzke implements zzlm {
    private static final zzgs zza;
    private int zze;
    private zzkl zzf = o0O0OO0.f37394Oooo;
    private zzgo zzg;

    static {
        zzgs zzgsVar = new zzgs();
        zza = zzgsVar;
        zzke.OooO0oO(zzgs.class, zzgsVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzke
    public final Object OooOO0(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new o0O0OOO0(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", zzgx.class, "zzg"});
        }
        if (i2 == 3) {
            return new zzgs();
        }
        o0O0O00 o0o0o00 = null;
        if (i2 == 4) {
            return new zzgr(o0o0o00);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final zzgo zza() {
        zzgo zzgoVar = this.zzg;
        return zzgoVar == null ? zzgo.zzc() : zzgoVar;
    }

    public final List zzc() {
        return this.zzf;
    }
}

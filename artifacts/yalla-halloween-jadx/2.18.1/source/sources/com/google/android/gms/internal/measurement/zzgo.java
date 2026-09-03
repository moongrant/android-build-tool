package com.google.android.gms.internal.measurement;

import com.android.billingclient.api.o0O0O00;
import java.util.List;
import p334o0OO00o.o0O0OO0;
import p334o0OO00o.o0O0OOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgo extends zzke implements zzlm {
    private static final zzgo zza;
    private zzkl zze = o0O0OO0.f37394Oooo;

    static {
        zzgo zzgoVar = new zzgo();
        zza = zzgoVar;
        zzke.OooO0oO(zzgo.class, zzgoVar);
    }

    public static zzgo zzc() {
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzke
    public final Object OooOO0(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new o0O0OOO0(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzgq.class});
        }
        if (i2 == 3) {
            return new zzgo();
        }
        o0O0O00 o0o0o00 = null;
        if (i2 == 4) {
            return new zzgn(o0o0o00);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final int zza() {
        return this.zze.size();
    }

    public final List zzd() {
        return this.zze;
    }
}

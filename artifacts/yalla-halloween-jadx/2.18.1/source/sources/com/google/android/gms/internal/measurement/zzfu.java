package com.google.android.gms.internal.measurement;

import com.android.billingclient.api.oo0o0Oo;
import java.util.Objects;
import p334o0OO00o.o0O0OOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfu extends zzke implements zzlm {
    private static final zzfu zza;
    private int zze;
    private String zzf = "";
    private long zzg;

    static {
        zzfu zzfuVar = new zzfu();
        zza = zzfuVar;
        zzke.OooO0oO(zzfu.class, zzfuVar);
    }

    public static /* synthetic */ void OooOO0o(zzfu zzfuVar, String str) {
        Objects.requireNonNull(str);
        zzfuVar.zze |= 1;
        zzfuVar.zzf = str;
    }

    public static /* synthetic */ void OooOOO0(zzfu zzfuVar, long j) {
        zzfuVar.zze |= 2;
        zzfuVar.zzg = j;
    }

    public static zzft zza() {
        return (zzft) zza.OooO0oo();
    }

    @Override // com.google.android.gms.internal.measurement.zzke
    public final Object OooOO0(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new o0O0OOO0(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzfu();
        }
        oo0o0Oo oo0o0oo = null;
        if (i2 == 4) {
            return new zzft(oo0o0oo);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }
}

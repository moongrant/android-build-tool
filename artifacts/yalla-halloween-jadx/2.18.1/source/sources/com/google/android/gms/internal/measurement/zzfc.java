package com.google.android.gms.internal.measurement;

import com.android.billingclient.api.o0Oo0oo;
import java.util.Objects;
import p334o0OO00o.o0O0OOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfc extends zzke implements zzlm {
    private static final zzfc zza;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    static {
        zzfc zzfcVar = new zzfc();
        zza = zzfcVar;
        zzke.OooO0oO(zzfc.class, zzfcVar);
    }

    public static /* synthetic */ void OooOO0o(zzfc zzfcVar, String str) {
        Objects.requireNonNull(str);
        zzfcVar.zze |= 1;
        zzfcVar.zzf = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzke
    public final Object OooOO0(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new o0O0OOO0(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzfc();
        }
        o0Oo0oo o0oo0oo2 = null;
        if (i2 == 4) {
            return new zzfb(o0oo0oo2);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final int zza() {
        return this.zzi;
    }

    public final String zzc() {
        return this.zzf;
    }

    public final boolean zze() {
        return this.zzg;
    }

    public final boolean zzf() {
        return this.zzh;
    }

    public final boolean zzg() {
        return (this.zze & 2) != 0;
    }

    public final boolean zzh() {
        return (this.zze & 4) != 0;
    }

    public final boolean zzi() {
        return (this.zze & 8) != 0;
    }
}

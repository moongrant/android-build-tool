package com.google.android.gms.internal.measurement;

import com.android.billingclient.api.oo0o0Oo;
import p334o0OO00o.o0O0OOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfq extends zzke implements zzlm {
    private static final zzfq zza;
    private int zze;
    private int zzf;
    private long zzg;

    static {
        zzfq zzfqVar = new zzfq();
        zza = zzfqVar;
        zzke.OooO0oO(zzfq.class, zzfqVar);
    }

    public static /* synthetic */ void OooOO0o(zzfq zzfqVar, int i) {
        zzfqVar.zze |= 1;
        zzfqVar.zzf = i;
    }

    public static /* synthetic */ void OooOOO0(zzfq zzfqVar, long j) {
        zzfqVar.zze |= 2;
        zzfqVar.zzg = j;
    }

    public static zzfp zzc() {
        return (zzfp) zza.OooO0oo();
    }

    @Override // com.google.android.gms.internal.measurement.zzke
    public final Object OooOO0(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new o0O0OOO0(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzfq();
        }
        oo0o0Oo oo0o0oo = null;
        if (i2 == 4) {
            return new zzfp(oo0o0oo);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final int zza() {
        return this.zzf;
    }

    public final long zzb() {
        return this.zzg;
    }

    public final boolean zzg() {
        return (this.zze & 2) != 0;
    }

    public final boolean zzh() {
        return (this.zze & 1) != 0;
    }
}

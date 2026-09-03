package com.google.android.gms.internal.measurement;

import com.android.billingclient.api.o0O0O00;
import java.util.List;
import p334o0OO00o.o00O000o;
import p334o0OO00o.o0O0OO0;
import p334o0OO00o.o0O0OOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgx extends zzke implements zzlm {
    private static final zzgx zza;
    private int zze;
    private int zzf;
    private zzkl zzg = o0O0OO0.f37394Oooo;
    private String zzh = "";
    private String zzi = "";
    private boolean zzj;
    private double zzk;

    static {
        zzgx zzgxVar = new zzgx();
        zza = zzgxVar;
        zzke.OooO0oO(zzgx.class, zzgxVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzke
    public final Object OooOO0(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new o0O0OOO0(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", o00O000o.f37313OooO00o, "zzg", zzgx.class, "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new zzgx();
        }
        o0O0O00 o0o0o00 = null;
        if (i2 == 4) {
            return new zzgt(o0o0o00);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final double zza() {
        return this.zzk;
    }

    public final String zzc() {
        return this.zzh;
    }

    public final String zzd() {
        return this.zzi;
    }

    public final List zze() {
        return this.zzg;
    }

    public final boolean zzf() {
        return this.zzj;
    }

    public final boolean zzg() {
        return (this.zze & 8) != 0;
    }

    public final boolean zzh() {
        return (this.zze & 16) != 0;
    }

    public final boolean zzi() {
        return (this.zze & 4) != 0;
    }

    public final int zzj() {
        int iZza = zzgw.zza(this.zzf);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }
}

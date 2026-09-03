package com.google.android.gms.internal.measurement;

import com.android.billingclient.api.o0ooOOo;
import java.util.List;
import p334o0OO00o.o0O0OO0;
import p334o0OO00o.o0O0OOO0;
import p334o0OO00o.o0O0ooO;

/* JADX INFO: loaded from: classes2.dex */
public final class zzex extends zzke implements zzlm {
    private static final zzex zza;
    private int zze;
    private int zzf;
    private boolean zzh;
    private String zzg = "";
    private zzkl zzi = o0O0OO0.f37394Oooo;

    static {
        zzex zzexVar = new zzex();
        zza = zzexVar;
        zzke.OooO0oO(zzex.class, zzexVar);
    }

    public static zzex zzc() {
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzke
    public final Object OooOO0(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new o0O0OOO0(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", o0O0ooO.f37410OooO00o, "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzex();
        }
        o0ooOOo o0ooooo2 = null;
        if (i2 == 4) {
            return new zzet(o0ooooo2);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final int zza() {
        return this.zzi.size();
    }

    public final String zzd() {
        return this.zzg;
    }

    public final List zze() {
        return this.zzi;
    }

    public final boolean zzf() {
        return this.zzh;
    }

    public final boolean zzg() {
        return (this.zze & 4) != 0;
    }

    public final boolean zzh() {
        return (this.zze & 2) != 0;
    }

    public final boolean zzi() {
        return (this.zze & 1) != 0;
    }

    public final int zzj() {
        int iZza = zzew.zza(this.zzf);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }
}

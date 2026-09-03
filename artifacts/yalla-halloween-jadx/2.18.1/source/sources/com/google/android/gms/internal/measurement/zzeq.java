package com.google.android.gms.internal.measurement;

import com.android.billingclient.api.o0ooOOo;
import p334o0OO00o.o00O0000;
import p334o0OO00o.o0O0OOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeq extends zzke implements zzlm {
    private static final zzeq zza;
    private int zze;
    private int zzf;
    private boolean zzg;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        zzeq zzeqVar = new zzeq();
        zza = zzeqVar;
        zzke.OooO0oO(zzeq.class, zzeqVar);
    }

    public static zzeq zzb() {
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzke
    public final Object OooOO0(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new o0O0OOO0(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", o00O0000.f37312OooO00o, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzeq();
        }
        o0ooOOo o0ooooo2 = null;
        if (i2 == 4) {
            return new zzem(o0ooooo2);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final String zzc() {
        return this.zzh;
    }

    public final String zzd() {
        return this.zzj;
    }

    public final String zze() {
        return this.zzi;
    }

    public final boolean zzf() {
        return this.zzg;
    }

    public final boolean zzg() {
        return (this.zze & 1) != 0;
    }

    public final boolean zzh() {
        return (this.zze & 4) != 0;
    }

    public final boolean zzi() {
        return (this.zze & 2) != 0;
    }

    public final boolean zzj() {
        return (this.zze & 16) != 0;
    }

    public final boolean zzk() {
        return (this.zze & 8) != 0;
    }

    public final int zzm() {
        int iZza = zzep.zza(this.zzf);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }
}

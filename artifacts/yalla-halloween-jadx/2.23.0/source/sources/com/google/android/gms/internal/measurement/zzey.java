package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzey extends zzlb implements zzmj {
    private static final zzey zza;
    private int zzd;
    private int zze;
    private boolean zzg;
    private String zzf = "";
    private zzli zzh = o0O.f15517OooO0oO;

    static {
        zzey zzeyVar = new zzey();
        zza = zzeyVar;
        zzlb.OooO(zzey.class, zzeyVar);
    }

    public static zzey zzc() {
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final Object OooOO0o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new o0OO000(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzd", "zze", o00O0000.f15477OooO00o, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzey();
        }
        if (i2 == 4) {
            return new zzeu(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final int zza() {
        return this.zzh.size();
    }

    public final String zzd() {
        return this.zzf;
    }

    public final List zze() {
        return this.zzh;
    }

    public final boolean zzf() {
        return this.zzg;
    }

    public final boolean zzg() {
        return (this.zzd & 4) != 0;
    }

    public final boolean zzh() {
        return (this.zzd & 2) != 0;
    }

    public final boolean zzi() {
        return (this.zzd & 1) != 0;
    }

    public final int zzj() {
        int iZza = zzex.zza(this.zze);
        if (iZza == 0) {
            return 1;
        }
        return iZza;
    }
}

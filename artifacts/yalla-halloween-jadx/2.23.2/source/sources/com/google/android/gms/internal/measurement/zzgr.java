package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgr extends zzlb implements zzmj {
    private static final zzgr zza;
    private int zzd;
    private String zze = "";
    private zzli zzf = o0OO000.f15098OooO0oO;

    static {
        zzgr zzgrVar = new zzgr();
        zza = zzgrVar;
        zzlb.OooO(zzgr.class, zzgrVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final Object OooOO0o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new o0OO000o(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzd", "zze", "zzf", zzgy.class});
        }
        if (i2 == 3) {
            return new zzgr();
        }
        if (i2 == 4) {
            return new zzgq(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final String zzb() {
        return this.zze;
    }

    public final List zzc() {
        return this.zzf;
    }
}

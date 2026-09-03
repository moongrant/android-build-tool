package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgp extends zzlb implements zzmj {
    private static final zzgp zza;
    private zzli zzd = o0O.f15517OooO0oO;

    static {
        zzgp zzgpVar = new zzgp();
        zza = zzgpVar;
        zzlb.OooO(zzgp.class, zzgpVar);
    }

    public static zzgp zzc() {
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
            return new o0OO000(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzgr.class});
        }
        if (i2 == 3) {
            return new zzgp();
        }
        if (i2 == 4) {
            return new zzgo(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final int zza() {
        return this.zzd.size();
    }

    public final List zzd() {
        return this.zzd;
    }
}

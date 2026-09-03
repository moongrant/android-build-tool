package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgt extends zzlb implements zzmj {
    private static final zzgt zza;
    private int zzd;
    private zzli zze = o0OO000.f15098OooO0oO;
    private zzgp zzf;

    static {
        zzgt zzgtVar = new zzgt();
        zza = zzgtVar;
        zzlb.OooO(zzgt.class, zzgtVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final Object OooOO0o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new o0OO000o(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzd", "zze", zzgy.class, "zzf"});
        }
        if (i2 == 3) {
            return new zzgt();
        }
        if (i2 == 4) {
            return new zzgs(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final zzgp zza() {
        zzgp zzgpVar = this.zzf;
        return zzgpVar == null ? zzgp.zzc() : zzgpVar;
    }

    public final List zzc() {
        return this.zze;
    }
}

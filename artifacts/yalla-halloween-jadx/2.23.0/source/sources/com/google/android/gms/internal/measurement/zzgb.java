package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgb extends zzlb implements zzmj {
    private static final zzgb zza;
    private zzli zzd = o0O.f15517OooO0oO;

    static {
        zzgb zzgbVar = new zzgb();
        zza = zzgbVar;
        zzlb.OooO(zzgb.class, zzgbVar);
    }

    public static /* synthetic */ void OooOOO(zzgb zzgbVar, zzgd zzgdVar) {
        zzgdVar.getClass();
        zzli zzliVar = zzgbVar.zzd;
        if (!zzliVar.zzc()) {
            zzgbVar.zzd = zzlb.OooO0o(zzliVar);
        }
        zzgbVar.zzd.add(zzgdVar);
    }

    public static zzga zza() {
        return (zzga) zza.OooO0Oo();
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final Object OooOO0o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new o0OO000(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzgd.class});
        }
        if (i2 == 3) {
            return new zzgb();
        }
        if (i2 == 4) {
            return new zzga(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final zzgd zzc(int i) {
        return (zzgd) this.zzd.get(0);
    }

    public final List zzd() {
        return this.zzd;
    }
}

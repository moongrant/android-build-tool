package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgg extends zzlb implements zzmj {
    private static final zzgg zza;
    private int zzd;
    private int zze = 1;
    private zzli zzf = o0OO000.f15098OooO0oO;

    static {
        zzgg zzggVar = new zzgg();
        zza = zzggVar;
        zzlb.OooO(zzgg.class, zzggVar);
    }

    public static /* synthetic */ void OooOOO(zzgg zzggVar, zzfv zzfvVar) {
        zzfvVar.getClass();
        zzli zzliVar = zzggVar.zzf;
        if (!zzliVar.zzc()) {
            zzggVar.zzf = zzlb.OooO0o(zzliVar);
        }
        zzggVar.zzf.add(zzfvVar);
    }

    public static zzge zza() {
        return (zzge) zza.OooO0Oo();
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final Object OooOO0o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new o0OO000o(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zzd", "zze", o00O000o.f14999OooO00o, "zzf", zzfv.class});
        }
        if (i2 == 3) {
            return new zzgg();
        }
        if (i2 == 4) {
            return new zzge(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }
}

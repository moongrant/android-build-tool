package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgk extends zzlb implements zzmj {
    private static final zzgk zza;
    private int zzd;
    private int zze;
    private zzlh zzf = o0O00oO0.f15069OooO0oO;

    static {
        zzgk zzgkVar = new zzgk();
        zza = zzgkVar;
        zzlb.OooO(zzgk.class, zzgkVar);
    }

    public static /* synthetic */ void OooOOO(zzgk zzgkVar, int i) {
        zzgkVar.zzd |= 1;
        zzgkVar.zze = i;
    }

    public static void OooOOOO(zzgk zzgkVar, Iterable iterable) {
        zzlh zzlhVar = zzgkVar.zzf;
        if (!zzlhVar.zzc()) {
            int size = zzlhVar.size();
            zzgkVar.zzf = zzlhVar.zzd(size == 0 ? 10 : size + size);
        }
        zzjk.OooO0O0(iterable, zzgkVar.zzf);
    }

    public static zzgj zzd() {
        return (zzgj) zza.OooO0Oo();
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final Object OooOO0o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new o0OO000o(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzgk();
        }
        if (i2 == 4) {
            return new zzgj(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final int zza() {
        return this.zzf.size();
    }

    public final int zzb() {
        return this.zze;
    }

    public final long zzc(int i) {
        return this.zzf.zza(i);
    }

    public final List zzf() {
        return this.zzf;
    }

    public final boolean zzi() {
        return (this.zzd & 1) != 0;
    }
}

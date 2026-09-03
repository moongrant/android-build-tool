package com.google.android.gms.internal.measurement;

import com.android.billingclient.api.oo0o0Oo;
import java.util.List;
import p334o0OO00o.o0O000o0;
import p334o0OO00o.o0O0OOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgj extends zzke implements zzlm {
    private static final zzgj zza;
    private int zze;
    private int zzf;
    private zzkk zzg = o0O000o0.f37363Oooo;

    static {
        zzgj zzgjVar = new zzgj();
        zza = zzgjVar;
        zzke.OooO0oO(zzgj.class, zzgjVar);
    }

    public static /* synthetic */ void OooOO0o(zzgj zzgjVar, int i) {
        zzgjVar.zze |= 1;
        zzgjVar.zzf = i;
    }

    public static /* synthetic */ void OooOOO0(zzgj zzgjVar, Iterable iterable) {
        zzkk zzkkVar = zzgjVar.zzg;
        if (!zzkkVar.zzc()) {
            zzgjVar.zzg = zzke.OooO0Oo(zzkkVar);
        }
        zzin.OooO0O0(iterable, zzgjVar.zzg);
    }

    public static zzgi zzd() {
        return (zzgi) zza.OooO0oo();
    }

    @Override // com.google.android.gms.internal.measurement.zzke
    public final Object OooOO0(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new o0O0OOO0(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzgj();
        }
        oo0o0Oo oo0o0oo = null;
        if (i2 == 4) {
            return new zzgi(oo0o0oo);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final int zza() {
        return this.zzg.size();
    }

    public final int zzb() {
        return this.zzf;
    }

    public final long zzc(int i) {
        return this.zzg.zza(i);
    }

    public final List zzf() {
        return this.zzg;
    }

    public final boolean zzi() {
        return (this.zze & 1) != 0;
    }
}

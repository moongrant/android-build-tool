package com.google.android.gms.internal.measurement;

import com.android.billingclient.api.oo0o0Oo;
import java.util.Objects;
import p334o0OO00o.o00O000;
import p334o0OO00o.o0O0OO0;
import p334o0OO00o.o0O0OOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgf extends zzke implements zzlm {
    private static final zzgf zza;
    private int zze;
    private int zzf = 1;
    private zzkl zzg = o0O0OO0.f37394Oooo;

    static {
        zzgf zzgfVar = new zzgf();
        zza = zzgfVar;
        zzke.OooO0oO(zzgf.class, zzgfVar);
    }

    public static /* synthetic */ void OooOO0o(zzgf zzgfVar, zzfu zzfuVar) {
        Objects.requireNonNull(zzfuVar);
        zzkl zzklVar = zzgfVar.zzg;
        if (!zzklVar.zzc()) {
            zzgfVar.zzg = zzke.OooO0o0(zzklVar);
        }
        zzgfVar.zzg.add(zzfuVar);
    }

    public static zzgd zza() {
        return (zzgd) zza.OooO0oo();
    }

    @Override // com.google.android.gms.internal.measurement.zzke
    public final Object OooOO0(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new o0O0OOO0(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zze", "zzf", o00O000.f37311OooO00o, "zzg", zzfu.class});
        }
        if (i2 == 3) {
            return new zzgf();
        }
        oo0o0Oo oo0o0oo = null;
        if (i2 == 4) {
            return new zzgd(oo0o0oo);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }
}

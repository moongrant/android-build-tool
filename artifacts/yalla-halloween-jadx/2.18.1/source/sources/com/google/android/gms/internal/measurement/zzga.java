package com.google.android.gms.internal.measurement;

import com.android.billingclient.api.oo0o0Oo;
import java.util.List;
import java.util.Objects;
import p334o0OO00o.o0O0OO0;
import p334o0OO00o.o0O0OOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzga extends zzke implements zzlm {
    private static final zzga zza;
    private zzkl zze = o0O0OO0.f37394Oooo;

    static {
        zzga zzgaVar = new zzga();
        zza = zzgaVar;
        zzke.OooO0oO(zzga.class, zzgaVar);
    }

    public static /* synthetic */ void OooOO0o(zzga zzgaVar, zzgc zzgcVar) {
        Objects.requireNonNull(zzgcVar);
        zzkl zzklVar = zzgaVar.zze;
        if (!zzklVar.zzc()) {
            zzgaVar.zze = zzke.OooO0o0(zzklVar);
        }
        zzgaVar.zze.add(zzgcVar);
    }

    public static zzfz zza() {
        return (zzfz) zza.OooO0oo();
    }

    @Override // com.google.android.gms.internal.measurement.zzke
    public final Object OooOO0(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new o0O0OOO0(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzgc.class});
        }
        if (i2 == 3) {
            return new zzga();
        }
        oo0o0Oo oo0o0oo = null;
        if (i2 == 4) {
            return new zzfz(oo0o0oo);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final zzgc zzc(int i) {
        return (zzgc) this.zze.get(0);
    }

    public final List zzd() {
        return this.zze;
    }
}

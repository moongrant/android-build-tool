package com.google.android.gms.internal.measurement;

import com.android.billingclient.api.oo0o0Oo;
import java.util.Objects;
import p334o0OO00o.o0O0OOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfo extends zzke implements zzlm {
    private static final zzfo zza;
    private int zze;
    private int zzf;
    private zzgh zzg;
    private zzgh zzh;
    private boolean zzi;

    static {
        zzfo zzfoVar = new zzfo();
        zza = zzfoVar;
        zzke.OooO0oO(zzfo.class, zzfoVar);
    }

    public static /* synthetic */ void OooOO0o(zzfo zzfoVar, int i) {
        zzfoVar.zze |= 1;
        zzfoVar.zzf = i;
    }

    public static /* synthetic */ void OooOOO(zzfo zzfoVar, zzgh zzghVar) {
        zzfoVar.zzh = zzghVar;
        zzfoVar.zze |= 4;
    }

    public static /* synthetic */ void OooOOO0(zzfo zzfoVar, zzgh zzghVar) {
        Objects.requireNonNull(zzghVar);
        zzfoVar.zzg = zzghVar;
        zzfoVar.zze |= 2;
    }

    public static /* synthetic */ void OooOOOO(zzfo zzfoVar, boolean z) {
        zzfoVar.zze |= 8;
        zzfoVar.zzi = z;
    }

    public static zzfn zzb() {
        return (zzfn) zza.OooO0oo();
    }

    @Override // com.google.android.gms.internal.measurement.zzke
    public final Object OooOO0(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new o0O0OOO0(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzfo();
        }
        oo0o0Oo oo0o0oo = null;
        if (i2 == 4) {
            return new zzfn(oo0o0oo);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzgh zzd() {
        zzgh zzghVar = this.zzg;
        return zzghVar == null ? zzgh.zzh() : zzghVar;
    }

    public final zzgh zze() {
        zzgh zzghVar = this.zzh;
        return zzghVar == null ? zzgh.zzh() : zzghVar;
    }

    public final boolean zzj() {
        return this.zzi;
    }

    public final boolean zzk() {
        return (this.zze & 1) != 0;
    }

    public final boolean zzm() {
        return (this.zze & 8) != 0;
    }

    public final boolean zzn() {
        return (this.zze & 4) != 0;
    }
}

package com.google.android.gms.internal.measurement;

import com.android.billingclient.api.o0ooOOo;
import java.util.List;
import java.util.Objects;
import p334o0OO00o.o0O0OO0;
import p334o0OO00o.o0O0OOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeh extends zzke implements zzlm {
    private static final zzeh zza;
    private int zze;
    private int zzf;
    private zzkl zzg;
    private zzkl zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        zzeh zzehVar = new zzeh();
        zza = zzehVar;
        zzke.OooO0oO(zzeh.class, zzehVar);
    }

    public zzeh() {
        o0O0OO0 o0o0oo0 = o0O0OO0.f37394Oooo;
        this.zzg = o0o0oo0;
        this.zzh = o0o0oo0;
    }

    public static /* synthetic */ void OooOO0o(zzeh zzehVar, int i, zzes zzesVar) {
        Objects.requireNonNull(zzesVar);
        zzkl zzklVar = zzehVar.zzg;
        if (!zzklVar.zzc()) {
            zzehVar.zzg = zzke.OooO0o0(zzklVar);
        }
        zzehVar.zzg.set(i, zzesVar);
    }

    public static /* synthetic */ void OooOOO0(zzeh zzehVar, int i, zzej zzejVar) {
        Objects.requireNonNull(zzejVar);
        zzkl zzklVar = zzehVar.zzh;
        if (!zzklVar.zzc()) {
            zzehVar.zzh = zzke.OooO0o0(zzklVar);
        }
        zzehVar.zzh.set(i, zzejVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzke
    public final Object OooOO0(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new o0O0OOO0(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", zzes.class, "zzh", zzej.class, "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzeh();
        }
        o0ooOOo o0ooooo2 = null;
        if (i2 == 4) {
            return new zzeg(o0ooooo2);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final int zza() {
        return this.zzf;
    }

    public final int zzb() {
        return this.zzh.size();
    }

    public final int zzc() {
        return this.zzg.size();
    }

    public final zzej zze(int i) {
        return (zzej) this.zzh.get(i);
    }

    public final zzes zzf(int i) {
        return (zzes) this.zzg.get(i);
    }

    public final List zzg() {
        return this.zzh;
    }

    public final List zzh() {
        return this.zzg;
    }

    public final boolean zzk() {
        return (this.zze & 1) != 0;
    }
}

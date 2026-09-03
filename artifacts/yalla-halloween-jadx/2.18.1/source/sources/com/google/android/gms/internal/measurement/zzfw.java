package com.google.android.gms.internal.measurement;

import com.android.billingclient.api.oo0o0Oo;
import java.util.List;
import java.util.Objects;
import p334o0OO00o.o0O0OO0;
import p334o0OO00o.o0O0OOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfw extends zzke implements zzlm {
    private static final zzfw zza;
    private int zze;
    private long zzh;
    private float zzi;
    private double zzj;
    private String zzf = "";
    private String zzg = "";
    private zzkl zzk = o0O0OO0.f37394Oooo;

    static {
        zzfw zzfwVar = new zzfw();
        zza = zzfwVar;
        zzke.OooO0oO(zzfw.class, zzfwVar);
    }

    public static /* synthetic */ void OooOO0o(zzfw zzfwVar, String str) {
        Objects.requireNonNull(str);
        zzfwVar.zze |= 1;
        zzfwVar.zzf = str;
    }

    public static /* synthetic */ void OooOOO(zzfw zzfwVar) {
        zzfwVar.zze &= -3;
        zzfwVar.zzg = zza.zzg;
    }

    public static /* synthetic */ void OooOOO0(zzfw zzfwVar, String str) {
        Objects.requireNonNull(str);
        zzfwVar.zze |= 2;
        zzfwVar.zzg = str;
    }

    public static /* synthetic */ void OooOOOO(zzfw zzfwVar, long j) {
        zzfwVar.zze |= 4;
        zzfwVar.zzh = j;
    }

    public static /* synthetic */ void OooOOOo(zzfw zzfwVar) {
        zzfwVar.zze &= -5;
        zzfwVar.zzh = 0L;
    }

    public static /* synthetic */ void OooOOo(zzfw zzfwVar) {
        zzfwVar.zze &= -17;
        zzfwVar.zzj = 0.0d;
    }

    public static /* synthetic */ void OooOOo0(zzfw zzfwVar, double d) {
        zzfwVar.zze |= 16;
        zzfwVar.zzj = d;
    }

    public static void OooOOoo(zzfw zzfwVar, zzfw zzfwVar2) {
        Objects.requireNonNull(zzfwVar2);
        zzkl zzklVar = zzfwVar.zzk;
        if (!zzklVar.zzc()) {
            zzfwVar.zzk = zzke.OooO0o0(zzklVar);
        }
        zzfwVar.zzk.add(zzfwVar2);
    }

    public static void OooOo0(zzfw zzfwVar) {
        zzfwVar.zzk = o0O0OO0.f37394Oooo;
    }

    public static void OooOo00(zzfw zzfwVar, Iterable iterable) {
        zzkl zzklVar = zzfwVar.zzk;
        if (!zzklVar.zzc()) {
            zzfwVar.zzk = zzke.OooO0o0(zzklVar);
        }
        zzin.OooO0O0(iterable, zzfwVar.zzk);
    }

    public static zzfv zze() {
        return (zzfv) zza.OooO0oo();
    }

    @Override // com.google.android.gms.internal.measurement.zzke
    public final Object OooOO0(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new o0O0OOO0(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzfw.class});
        }
        if (i2 == 3) {
            return new zzfw();
        }
        oo0o0Oo oo0o0oo = null;
        if (i2 == 4) {
            return new zzfv(oo0o0oo);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final double zza() {
        return this.zzj;
    }

    public final float zzb() {
        return this.zzi;
    }

    public final int zzc() {
        return this.zzk.size();
    }

    public final long zzd() {
        return this.zzh;
    }

    public final String zzg() {
        return this.zzf;
    }

    public final String zzh() {
        return this.zzg;
    }

    public final List zzi() {
        return this.zzk;
    }

    public final boolean zzu() {
        return (this.zze & 16) != 0;
    }

    public final boolean zzv() {
        return (this.zze & 8) != 0;
    }

    public final boolean zzw() {
        return (this.zze & 4) != 0;
    }

    public final boolean zzx() {
        return (this.zze & 1) != 0;
    }

    public final boolean zzy() {
        return (this.zze & 2) != 0;
    }
}

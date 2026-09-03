package com.google.android.gms.internal.measurement;

import com.android.billingclient.api.oo0o0Oo;
import java.util.Objects;
import p334o0OO00o.o0O0OOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgl extends zzke implements zzlm {
    private static final zzgl zza;
    private int zze;
    private long zzf;
    private String zzg = "";
    private String zzh = "";
    private long zzi;
    private float zzj;
    private double zzk;

    static {
        zzgl zzglVar = new zzgl();
        zza = zzglVar;
        zzke.OooO0oO(zzgl.class, zzglVar);
    }

    public static /* synthetic */ void OooOO0o(zzgl zzglVar, long j) {
        zzglVar.zze |= 1;
        zzglVar.zzf = j;
    }

    public static /* synthetic */ void OooOOO(zzgl zzglVar, String str) {
        Objects.requireNonNull(str);
        zzglVar.zze |= 4;
        zzglVar.zzh = str;
    }

    public static /* synthetic */ void OooOOO0(zzgl zzglVar, String str) {
        Objects.requireNonNull(str);
        zzglVar.zze |= 2;
        zzglVar.zzg = str;
    }

    public static /* synthetic */ void OooOOOO(zzgl zzglVar) {
        zzglVar.zze &= -5;
        zzglVar.zzh = zza.zzh;
    }

    public static /* synthetic */ void OooOOOo(zzgl zzglVar, long j) {
        zzglVar.zze |= 8;
        zzglVar.zzi = j;
    }

    public static /* synthetic */ void OooOOo(zzgl zzglVar, double d) {
        zzglVar.zze |= 32;
        zzglVar.zzk = d;
    }

    public static /* synthetic */ void OooOOo0(zzgl zzglVar) {
        zzglVar.zze &= -9;
        zzglVar.zzi = 0L;
    }

    public static /* synthetic */ void OooOOoo(zzgl zzglVar) {
        zzglVar.zze &= -33;
        zzglVar.zzk = 0.0d;
    }

    public static zzgk zzd() {
        return (zzgk) zza.OooO0oo();
    }

    @Override // com.google.android.gms.internal.measurement.zzke
    public final Object OooOO0(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new o0O0OOO0(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new zzgl();
        }
        oo0o0Oo oo0o0oo = null;
        if (i2 == 4) {
            return new zzgk(oo0o0oo);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final double zza() {
        return this.zzk;
    }

    public final long zzb() {
        return this.zzi;
    }

    public final long zzc() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zzg;
    }

    public final String zzg() {
        return this.zzh;
    }

    public final boolean zzq() {
        return (this.zze & 32) != 0;
    }

    public final boolean zzr() {
        return (this.zze & 8) != 0;
    }

    public final boolean zzs() {
        return (this.zze & 1) != 0;
    }

    public final boolean zzt() {
        return (this.zze & 4) != 0;
    }
}

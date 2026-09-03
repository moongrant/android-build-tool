package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfx extends zzlb implements zzmj {
    private static final zzfx zza;
    private int zzd;
    private long zzg;
    private float zzh;
    private double zzi;
    private String zze = "";
    private String zzf = "";
    private zzli zzj = o0OO000.f15098OooO0oO;

    static {
        zzfx zzfxVar = new zzfx();
        zza = zzfxVar;
        zzlb.OooO(zzfx.class, zzfxVar);
    }

    public static /* synthetic */ void OooOOO(zzfx zzfxVar, String str) {
        str.getClass();
        zzfxVar.zzd |= 1;
        zzfxVar.zze = str;
    }

    public static /* synthetic */ void OooOOOO(zzfx zzfxVar, String str) {
        str.getClass();
        zzfxVar.zzd |= 2;
        zzfxVar.zzf = str;
    }

    public static /* synthetic */ void OooOOOo(zzfx zzfxVar) {
        zzfxVar.zzd &= -3;
        zzfxVar.zzf = zza.zzf;
    }

    public static /* synthetic */ void OooOOo(zzfx zzfxVar) {
        zzfxVar.zzd &= -5;
        zzfxVar.zzg = 0L;
    }

    public static /* synthetic */ void OooOOo0(zzfx zzfxVar, long j) {
        zzfxVar.zzd |= 4;
        zzfxVar.zzg = j;
    }

    public static /* synthetic */ void OooOOoo(zzfx zzfxVar, double d) {
        zzfxVar.zzd |= 16;
        zzfxVar.zzi = d;
    }

    public static void OooOo0(zzfx zzfxVar, zzfx zzfxVar2) {
        zzfxVar2.getClass();
        zzli zzliVar = zzfxVar.zzj;
        if (!zzliVar.zzc()) {
            zzfxVar.zzj = zzlb.OooO0o(zzliVar);
        }
        zzfxVar.zzj.add(zzfxVar2);
    }

    public static /* synthetic */ void OooOo00(zzfx zzfxVar) {
        zzfxVar.zzd &= -17;
        zzfxVar.zzi = 0.0d;
    }

    public static void OooOo0O(zzfx zzfxVar, Iterable iterable) {
        zzli zzliVar = zzfxVar.zzj;
        if (!zzliVar.zzc()) {
            zzfxVar.zzj = zzlb.OooO0o(zzliVar);
        }
        zzjk.OooO0O0(iterable, zzfxVar.zzj);
    }

    public static void OooOo0o(zzfx zzfxVar) {
        zzfxVar.zzj = o0OO000.f15098OooO0oO;
    }

    public static zzfw zze() {
        return (zzfw) zza.OooO0Oo();
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final Object OooOO0o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new o0OO000o(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzfx.class});
        }
        if (i2 == 3) {
            return new zzfx();
        }
        if (i2 == 4) {
            return new zzfw(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final double zza() {
        return this.zzi;
    }

    public final float zzb() {
        return this.zzh;
    }

    public final int zzc() {
        return this.zzj.size();
    }

    public final long zzd() {
        return this.zzg;
    }

    public final String zzg() {
        return this.zze;
    }

    public final String zzh() {
        return this.zzf;
    }

    public final List zzi() {
        return this.zzj;
    }

    public final boolean zzu() {
        return (this.zzd & 16) != 0;
    }

    public final boolean zzv() {
        return (this.zzd & 8) != 0;
    }

    public final boolean zzw() {
        return (this.zzd & 4) != 0;
    }

    public final boolean zzx() {
        return (this.zzd & 1) != 0;
    }

    public final boolean zzy() {
        return (this.zzd & 2) != 0;
    }
}

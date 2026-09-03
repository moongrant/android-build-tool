package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzft extends zzlb implements zzmj {
    private static final zzft zza;
    private int zzd;
    private zzli zze = o0OO000.f15098OooO0oO;
    private String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;

    static {
        zzft zzftVar = new zzft();
        zza = zzftVar;
        zzlb.OooO(zzft.class, zzftVar);
    }

    public static /* synthetic */ void OooOOO(zzft zzftVar, int i, zzfx zzfxVar) {
        zzfxVar.getClass();
        zzftVar.OooOo0O();
        zzftVar.zze.set(i, zzfxVar);
    }

    public static /* synthetic */ void OooOOOO(zzft zzftVar, zzfx zzfxVar) {
        zzfxVar.getClass();
        zzftVar.OooOo0O();
        zzftVar.zze.add(zzfxVar);
    }

    public static /* synthetic */ void OooOOOo(zzft zzftVar, Iterable iterable) {
        zzftVar.OooOo0O();
        zzjk.OooO0O0(iterable, zzftVar.zze);
    }

    public static /* synthetic */ void OooOOo(zzft zzftVar, int i) {
        zzftVar.OooOo0O();
        zzftVar.zze.remove(i);
    }

    public static void OooOOo0(zzft zzftVar) {
        zzftVar.zze = o0OO000.f15098OooO0oO;
    }

    public static /* synthetic */ void OooOOoo(zzft zzftVar, String str) {
        str.getClass();
        zzftVar.zzd |= 1;
        zzftVar.zzf = str;
    }

    public static /* synthetic */ void OooOo0(long j, zzft zzftVar) {
        zzftVar.zzd |= 4;
        zzftVar.zzh = j;
    }

    public static /* synthetic */ void OooOo00(long j, zzft zzftVar) {
        zzftVar.zzd |= 2;
        zzftVar.zzg = j;
    }

    public static zzfs zze() {
        return (zzfs) zza.OooO0Oo();
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final Object OooOO0o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new o0OO000o(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zzd", "zze", zzfx.class, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzft();
        }
        if (i2 == 4) {
            return new zzfs(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final void OooOo0O() {
        zzli zzliVar = this.zze;
        if (zzliVar.zzc()) {
            return;
        }
        this.zze = zzlb.OooO0o(zzliVar);
    }

    public final int zza() {
        return this.zzi;
    }

    public final int zzb() {
        return this.zze.size();
    }

    public final long zzc() {
        return this.zzh;
    }

    public final long zzd() {
        return this.zzg;
    }

    public final zzfx zzg(int i) {
        return (zzfx) this.zze.get(i);
    }

    public final String zzh() {
        return this.zzf;
    }

    public final List zzi() {
        return this.zze;
    }

    public final boolean zzs() {
        return (this.zzd & 8) != 0;
    }

    public final boolean zzt() {
        return (this.zzd & 4) != 0;
    }

    public final boolean zzu() {
        return (this.zzd & 2) != 0;
    }
}

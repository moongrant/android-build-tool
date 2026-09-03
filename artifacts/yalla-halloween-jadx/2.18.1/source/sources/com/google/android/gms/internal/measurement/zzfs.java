package com.google.android.gms.internal.measurement;

import com.android.billingclient.api.oo0o0Oo;
import java.util.List;
import java.util.Objects;
import p334o0OO00o.o0O0OO0;
import p334o0OO00o.o0O0OOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfs extends zzke implements zzlm {
    private static final zzfs zza;
    private int zze;
    private zzkl zzf = o0O0OO0.f37394Oooo;
    private String zzg = "";
    private long zzh;
    private long zzi;
    private int zzj;

    static {
        zzfs zzfsVar = new zzfs();
        zza = zzfsVar;
        zzke.OooO0oO(zzfs.class, zzfsVar);
    }

    public static /* synthetic */ void OooOO0o(zzfs zzfsVar, int i, zzfw zzfwVar) {
        Objects.requireNonNull(zzfwVar);
        zzfsVar.OooOo00();
        zzfsVar.zzf.set(i, zzfwVar);
    }

    public static /* synthetic */ void OooOOO(zzfs zzfsVar, Iterable iterable) {
        zzfsVar.OooOo00();
        zzin.OooO0O0(iterable, zzfsVar.zzf);
    }

    public static /* synthetic */ void OooOOO0(zzfs zzfsVar, zzfw zzfwVar) {
        Objects.requireNonNull(zzfwVar);
        zzfsVar.OooOo00();
        zzfsVar.zzf.add(zzfwVar);
    }

    public static void OooOOOO(zzfs zzfsVar) {
        zzfsVar.zzf = o0O0OO0.f37394Oooo;
    }

    public static /* synthetic */ void OooOOOo(zzfs zzfsVar, int i) {
        zzfsVar.OooOo00();
        zzfsVar.zzf.remove(i);
    }

    public static /* synthetic */ void OooOOo(zzfs zzfsVar, long j) {
        zzfsVar.zze |= 2;
        zzfsVar.zzh = j;
    }

    public static /* synthetic */ void OooOOo0(zzfs zzfsVar, String str) {
        Objects.requireNonNull(str);
        zzfsVar.zze |= 1;
        zzfsVar.zzg = str;
    }

    public static /* synthetic */ void OooOOoo(zzfs zzfsVar, long j) {
        zzfsVar.zze |= 4;
        zzfsVar.zzi = j;
    }

    public static zzfr zze() {
        return (zzfr) zza.OooO0oo();
    }

    @Override // com.google.android.gms.internal.measurement.zzke
    public final Object OooOO0(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new o0O0OOO0(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", zzfw.class, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzfs();
        }
        oo0o0Oo oo0o0oo = null;
        if (i2 == 4) {
            return new zzfr(oo0o0oo);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final void OooOo00() {
        zzkl zzklVar = this.zzf;
        if (zzklVar.zzc()) {
            return;
        }
        this.zzf = zzke.OooO0o0(zzklVar);
    }

    public final int zza() {
        return this.zzj;
    }

    public final int zzb() {
        return this.zzf.size();
    }

    public final long zzc() {
        return this.zzi;
    }

    public final long zzd() {
        return this.zzh;
    }

    public final zzfw zzg(int i) {
        return (zzfw) this.zzf.get(i);
    }

    public final String zzh() {
        return this.zzg;
    }

    public final List zzi() {
        return this.zzf;
    }

    public final boolean zzs() {
        return (this.zze & 8) != 0;
    }

    public final boolean zzt() {
        return (this.zze & 4) != 0;
    }

    public final boolean zzu() {
        return (this.zze & 2) != 0;
    }
}

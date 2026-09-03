package com.google.android.gms.internal.measurement;

import com.android.billingclient.api.oo0o0Oo;
import java.util.List;
import p334o0OO00o.o0O000o0;
import p334o0OO00o.o0O0OO0;
import p334o0OO00o.o0O0OOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgh extends zzke implements zzlm {
    private static final zzgh zza;
    private zzkk zze;
    private zzkk zzf;
    private zzkl zzg;
    private zzkl zzh;

    static {
        zzgh zzghVar = new zzgh();
        zza = zzghVar;
        zzke.OooO0oO(zzgh.class, zzghVar);
    }

    public zzgh() {
        o0O000o0 o0o000o1 = o0O000o0.f37363Oooo;
        this.zze = o0o000o1;
        this.zzf = o0o000o1;
        o0O0OO0 o0o0oo0 = o0O0OO0.f37394Oooo;
        this.zzg = o0o0oo0;
        this.zzh = o0o0oo0;
    }

    public static /* synthetic */ void OooOO0o(zzgh zzghVar, Iterable iterable) {
        zzkk zzkkVar = zzghVar.zze;
        if (!zzkkVar.zzc()) {
            zzghVar.zze = zzke.OooO0Oo(zzkkVar);
        }
        zzin.OooO0O0(iterable, zzghVar.zze);
    }

    public static /* synthetic */ void OooOOO(zzgh zzghVar, Iterable iterable) {
        zzkk zzkkVar = zzghVar.zzf;
        if (!zzkkVar.zzc()) {
            zzghVar.zzf = zzke.OooO0Oo(zzkkVar);
        }
        zzin.OooO0O0(iterable, zzghVar.zzf);
    }

    public static void OooOOO0(zzgh zzghVar) {
        zzghVar.zze = o0O000o0.f37363Oooo;
    }

    public static void OooOOOO(zzgh zzghVar) {
        zzghVar.zzf = o0O000o0.f37363Oooo;
    }

    public static void OooOOOo(zzgh zzghVar, Iterable iterable) {
        zzkl zzklVar = zzghVar.zzg;
        if (!zzklVar.zzc()) {
            zzghVar.zzg = zzke.OooO0o0(zzklVar);
        }
        zzin.OooO0O0(iterable, zzghVar.zzg);
    }

    public static void OooOOo(zzgh zzghVar, int i) {
        zzkl zzklVar = zzghVar.zzg;
        if (!zzklVar.zzc()) {
            zzghVar.zzg = zzke.OooO0o0(zzklVar);
        }
        zzghVar.zzg.remove(i);
    }

    public static void OooOOo0(zzgh zzghVar) {
        zzghVar.zzg = o0O0OO0.f37394Oooo;
    }

    public static void OooOOoo(zzgh zzghVar, Iterable iterable) {
        zzkl zzklVar = zzghVar.zzh;
        if (!zzklVar.zzc()) {
            zzghVar.zzh = zzke.OooO0o0(zzklVar);
        }
        zzin.OooO0O0(iterable, zzghVar.zzh);
    }

    public static void OooOo0(zzgh zzghVar, int i) {
        zzkl zzklVar = zzghVar.zzh;
        if (!zzklVar.zzc()) {
            zzghVar.zzh = zzke.OooO0o0(zzklVar);
        }
        zzghVar.zzh.remove(i);
    }

    public static void OooOo00(zzgh zzghVar) {
        zzghVar.zzh = o0O0OO0.f37394Oooo;
    }

    public static zzgg zzf() {
        return (zzgg) zza.OooO0oo();
    }

    public static zzgh zzh() {
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzke
    public final Object OooOO0(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new o0O0OOO0(zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", zzfq.class, "zzh", zzgj.class});
        }
        if (i2 == 3) {
            return new zzgh();
        }
        oo0o0Oo oo0o0oo = null;
        if (i2 == 4) {
            return new zzgg(oo0o0oo);
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
        return this.zzf.size();
    }

    public final int zzc() {
        return this.zzh.size();
    }

    public final int zzd() {
        return this.zze.size();
    }

    public final zzfq zze(int i) {
        return (zzfq) this.zzg.get(i);
    }

    public final zzgj zzi(int i) {
        return (zzgj) this.zzh.get(i);
    }

    public final List zzj() {
        return this.zzg;
    }

    public final List zzk() {
        return this.zzf;
    }

    public final List zzm() {
        return this.zzh;
    }

    public final List zzn() {
        return this.zze;
    }
}

package com.google.android.gms.internal.measurement;

import com.android.billingclient.api.o0Oo0oo;
import java.util.List;
import java.util.Objects;
import p334o0OO00o.o0O0OO0;
import p334o0OO00o.o0O0OOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfe extends zzke implements zzlm {
    private static final zzfe zza;
    private int zze;
    private long zzf;
    private String zzg = "";
    private int zzh;
    private zzkl zzi;
    private zzkl zzj;
    private zzkl zzk;
    private String zzl;
    private boolean zzm;
    private zzkl zzn;
    private zzkl zzo;
    private String zzp;

    static {
        zzfe zzfeVar = new zzfe();
        zza = zzfeVar;
        zzke.OooO0oO(zzfe.class, zzfeVar);
    }

    public zzfe() {
        o0O0OO0 o0o0oo0 = o0O0OO0.f37394Oooo;
        this.zzi = o0o0oo0;
        this.zzj = o0o0oo0;
        this.zzk = o0o0oo0;
        this.zzl = "";
        this.zzn = o0o0oo0;
        this.zzo = o0o0oo0;
        this.zzp = "";
    }

    public static /* synthetic */ void OooOO0o(zzfe zzfeVar, int i, zzfc zzfcVar) {
        Objects.requireNonNull(zzfcVar);
        zzkl zzklVar = zzfeVar.zzj;
        if (!zzklVar.zzc()) {
            zzfeVar.zzj = zzke.OooO0o0(zzklVar);
        }
        zzfeVar.zzj.set(i, zzfcVar);
    }

    public static void OooOOO0(zzfe zzfeVar) {
        zzfeVar.zzk = o0O0OO0.f37394Oooo;
    }

    public static zzfd zze() {
        return (zzfd) zza.OooO0oo();
    }

    public static zzfe zzg() {
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzke
    public final Object OooOO0(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new o0O0OOO0(zza, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", zzfi.class, "zzj", zzfc.class, "zzk", zzeh.class, "zzl", "zzm", "zzn", zzgs.class, "zzo", zzfa.class, "zzp"});
        }
        if (i2 == 3) {
            return new zzfe();
        }
        o0Oo0oo o0oo0oo2 = null;
        if (i2 == 4) {
            return new zzfd(o0oo0oo2);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final int zza() {
        return this.zzn.size();
    }

    public final int zzb() {
        return this.zzj.size();
    }

    public final long zzc() {
        return this.zzf;
    }

    public final zzfc zzd(int i) {
        return (zzfc) this.zzj.get(i);
    }

    public final String zzh() {
        return this.zzg;
    }

    public final String zzi() {
        return this.zzp;
    }

    public final List zzj() {
        return this.zzk;
    }

    public final List zzk() {
        return this.zzo;
    }

    public final List zzm() {
        return this.zzn;
    }

    public final List zzn() {
        return this.zzi;
    }

    public final boolean zzq() {
        return this.zzm;
    }

    public final boolean zzr() {
        return (this.zze & 2) != 0;
    }

    public final boolean zzs() {
        return (this.zze & 1) != 0;
    }
}

package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzff extends zzlb implements zzmj {
    private static final zzff zza;
    private int zzd;
    private long zze;
    private String zzf = "";
    private int zzg;
    private zzli zzh;
    private zzli zzi;
    private zzli zzj;
    private String zzk;
    private boolean zzl;
    private zzli zzm;
    private zzli zzn;
    private String zzo;
    private String zzp;
    private String zzq;
    private String zzr;

    static {
        zzff zzffVar = new zzff();
        zza = zzffVar;
        zzlb.OooO(zzff.class, zzffVar);
    }

    public zzff() {
        o0O o0o = o0O.f15517OooO0oO;
        this.zzh = o0o;
        this.zzi = o0o;
        this.zzj = o0o;
        this.zzk = "";
        this.zzm = o0o;
        this.zzn = o0o;
        this.zzo = "";
        this.zzp = "";
        this.zzq = "";
        this.zzr = "";
    }

    public static /* synthetic */ void OooOOO(zzff zzffVar, int i, zzfd zzfdVar) {
        zzfdVar.getClass();
        zzli zzliVar = zzffVar.zzi;
        if (!zzliVar.zzc()) {
            zzffVar.zzi = zzlb.OooO0o(zzliVar);
        }
        zzffVar.zzi.set(i, zzfdVar);
    }

    public static void OooOOOO(zzff zzffVar) {
        zzffVar.zzj = o0O.f15517OooO0oO;
    }

    public static zzfe zze() {
        return (zzfe) zza.OooO0Oo();
    }

    public static zzff zzg() {
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final Object OooOO0o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new o0OO000(zza, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\fဈ\u0006\rဈ\u0007\u000eဈ\b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzfj.class, "zzi", zzfd.class, "zzj", zzei.class, "zzk", "zzl", "zzm", zzgt.class, "zzn", zzfb.class, "zzo", "zzp", "zzq", "zzr"});
        }
        if (i2 == 3) {
            return new zzff();
        }
        if (i2 == 4) {
            return new zzfe(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zza;
    }

    public final int zza() {
        return this.zzm.size();
    }

    public final int zzb() {
        return this.zzi.size();
    }

    public final long zzc() {
        return this.zze;
    }

    public final zzfd zzd(int i) {
        return (zzfd) this.zzi.get(i);
    }

    public final String zzh() {
        return this.zzf;
    }

    public final String zzi() {
        return this.zzq;
    }

    public final String zzj() {
        return this.zzp;
    }

    public final String zzk() {
        return this.zzo;
    }

    public final List zzm() {
        return this.zzj;
    }

    public final List zzn() {
        return this.zzn;
    }

    public final List zzo() {
        return this.zzm;
    }

    public final List zzp() {
        return this.zzh;
    }

    public final boolean zzs() {
        return this.zzl;
    }

    public final boolean zzt() {
        return (this.zzd & 2) != 0;
    }

    public final boolean zzu() {
        return (this.zzd & 1) != 0;
    }
}

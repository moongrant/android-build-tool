package p269o00ooooo;

import com.google.android.gms.internal.measurement.zzqu;
import com.google.android.gms.measurement.internal.zzeg;
import com.google.android.gms.measurement.internal.zzhb;
import com.google.android.gms.measurement.internal.zzik;

/* JADX INFO: loaded from: classes3.dex */
public final class oOo0000O implements Runnable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ zzik f41490OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzhb f41491OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ long f41492OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f41493OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ boolean f41494OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ zzhb f41495OooO0oo;

    public oOo0000O(zzik zzikVar, zzhb zzhbVar, long j, long j2, boolean z, zzhb zzhbVar2) {
        this.f41490OooO = zzikVar;
        this.f41491OooO0Oo = zzhbVar;
        this.f41493OooO0o0 = j;
        this.f41492OooO0o = j2;
        this.f41494OooO0oO = z;
        this.f41495OooO0oo = zzhbVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzik zzikVar = this.f41490OooO;
        zzhb zzhbVar = this.f41491OooO0Oo;
        zzikVar.OooO0oO(zzhbVar);
        zzikVar.OooO0o(this.f41493OooO0o0, false);
        zzik.OooOO0o(this.f41490OooO, this.f41491OooO0Oo, this.f41492OooO0o, true, this.f41494OooO0oO);
        zzqu.zzc();
        if (zzikVar.f41276OooO00o.zzf().zzs(null, zzeg.zzan)) {
            zzik.OooOO0O(zzikVar, zzhbVar, this.f41495OooO0oo);
        }
    }
}

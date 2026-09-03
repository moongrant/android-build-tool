package p269o00ooooo;

import com.google.android.gms.internal.measurement.zzqu;
import com.google.android.gms.measurement.internal.zzeg;
import com.google.android.gms.measurement.internal.zzhb;
import com.google.android.gms.measurement.internal.zzik;

/* JADX INFO: loaded from: classes3.dex */
public final class oOo000o0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzhb f41498OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f41499OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f41500OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ zzhb f41501OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ zzik f41502OooO0oo;

    public oOo000o0(zzik zzikVar, zzhb zzhbVar, long j, boolean z, zzhb zzhbVar2) {
        this.f41502OooO0oo = zzikVar;
        this.f41498OooO0Oo = zzhbVar;
        this.f41500OooO0o0 = j;
        this.f41499OooO0o = z;
        this.f41501OooO0oO = zzhbVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzik zzikVar = this.f41502OooO0oo;
        zzhb zzhbVar = this.f41498OooO0Oo;
        zzikVar.OooO0oO(zzhbVar);
        zzik.OooOO0o(this.f41502OooO0oo, this.f41498OooO0Oo, this.f41500OooO0o0, false, this.f41499OooO0o);
        zzqu.zzc();
        if (zzikVar.f41276OooO00o.zzf().zzs(null, zzeg.zzan)) {
            zzik.OooOO0O(zzikVar, zzhbVar, this.f41501OooO0oO);
        }
    }
}

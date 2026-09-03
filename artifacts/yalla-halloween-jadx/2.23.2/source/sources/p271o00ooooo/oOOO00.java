package p271o00ooooo;

import com.google.android.gms.internal.measurement.zzqu;
import com.google.android.gms.measurement.internal.zzeg;
import com.google.android.gms.measurement.internal.zzhb;
import com.google.android.gms.measurement.internal.zzik;

/* JADX INFO: loaded from: classes3.dex */
public final class oOOO00 implements Runnable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ zzik f40725OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzhb f40726OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ long f40727OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f40728OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ boolean f40729OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ zzhb f40730OooO0oo;

    public oOOO00(zzik zzikVar, zzhb zzhbVar, long j, long j2, boolean z, zzhb zzhbVar2) {
        this.f40725OooO = zzikVar;
        this.f40726OooO0Oo = zzhbVar;
        this.f40728OooO0o0 = j;
        this.f40727OooO0o = j2;
        this.f40729OooO0oO = z;
        this.f40730OooO0oo = zzhbVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzik zzikVar = this.f40725OooO;
        zzhb zzhbVar = this.f40726OooO0Oo;
        zzikVar.OooO0oO(zzhbVar);
        zzikVar.OooO0o(this.f40728OooO0o0, false);
        zzik.OooOO0o(this.f40725OooO, this.f40726OooO0Oo, this.f40727OooO0o, true, this.f40729OooO0oO);
        zzqu.zzc();
        if (zzikVar.f40788OooO00o.zzf().zzs(null, zzeg.zzan)) {
            zzik.OooOO0O(zzikVar, zzhbVar, this.f40730OooO0oo);
        }
    }
}

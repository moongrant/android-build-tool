package p271o00ooooo;

import com.google.android.gms.internal.measurement.zzqu;
import com.google.android.gms.measurement.internal.zzeg;
import com.google.android.gms.measurement.internal.zzhb;
import com.google.android.gms.measurement.internal.zzik;

/* JADX INFO: loaded from: classes3.dex */
public final class oOOO00Oo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzhb f40733OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f40734OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f40735OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ zzhb f40736OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ zzik f40737OooO0oo;

    public oOOO00Oo(zzik zzikVar, zzhb zzhbVar, long j, boolean z, zzhb zzhbVar2) {
        this.f40737OooO0oo = zzikVar;
        this.f40733OooO0Oo = zzhbVar;
        this.f40735OooO0o0 = j;
        this.f40734OooO0o = z;
        this.f40736OooO0oO = zzhbVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzik zzikVar = this.f40737OooO0oo;
        zzhb zzhbVar = this.f40733OooO0Oo;
        zzikVar.OooO0oO(zzhbVar);
        zzik.OooOO0o(this.f40737OooO0oo, this.f40733OooO0Oo, this.f40735OooO0o0, false, this.f40734OooO0o);
        zzqu.zzc();
        if (zzikVar.f40788OooO00o.zzf().zzs(null, zzeg.zzan)) {
            zzik.OooOO0O(zzikVar, zzhbVar, this.f40736OooO0oO);
        }
    }
}

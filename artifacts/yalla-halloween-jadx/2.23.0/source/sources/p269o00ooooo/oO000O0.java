package p269o00ooooo;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzgv;
import com.google.android.gms.measurement.internal.zzlh;
import com.google.android.gms.measurement.internal.zzq;

/* JADX INFO: loaded from: classes3.dex */
public final class oO000O0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzq f41269OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzgv f41270OooO0o0;

    public oO000O0(zzgv zzgvVar, zzq zzqVar) {
        this.f41270OooO0o0 = zzgvVar;
        this.f41269OooO0Oo = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgv zzgvVar = this.f41270OooO0o0;
        zzgvVar.f16021OooO0Oo.OooO00o();
        zzlh zzlhVar = zzgvVar.f16021OooO0Oo;
        zzlhVar.zzaB().zzg();
        zzlhVar.OooO0O0();
        zzq zzqVar = this.f41269OooO0Oo;
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzlhVar.OooOooO(zzqVar);
    }
}

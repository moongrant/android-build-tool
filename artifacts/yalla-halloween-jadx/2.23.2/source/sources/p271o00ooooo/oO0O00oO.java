package p271o00ooooo;

import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzgv;
import com.google.android.gms.measurement.internal.zzlh;
import com.google.android.gms.measurement.internal.zzq;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0O00oO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzac f40611OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ zzgv f40612OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzq f40613OooO0o0;

    public oO0O00oO(zzgv zzgvVar, zzac zzacVar, zzq zzqVar) {
        this.f40612OooO0o = zzgvVar;
        this.f40611OooO0Oo = zzacVar;
        this.f40613OooO0o0 = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgv zzgvVar = this.f40612OooO0o;
        zzgvVar.f15545OooO0Oo.OooO00o();
        zzac zzacVar = this.f40611OooO0Oo;
        Object objZza = zzacVar.zzc.zza();
        zzlh zzlhVar = zzgvVar.f15545OooO0Oo;
        zzq zzqVar = this.f40613OooO0o0;
        if (objZza == null) {
            zzlhVar.OooO(zzacVar, zzqVar);
        } else {
            zzlhVar.OooOO0o(zzacVar, zzqVar);
        }
    }
}

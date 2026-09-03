package p269o00ooooo;

import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzgv;
import com.google.android.gms.measurement.internal.zzlh;
import com.google.android.gms.measurement.internal.zzq;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzac f41141OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ zzgv f41142OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzq f41143OooO0o0;

    public o(zzgv zzgvVar, zzac zzacVar, zzq zzqVar) {
        this.f41142OooO0o = zzgvVar;
        this.f41141OooO0Oo = zzacVar;
        this.f41143OooO0o0 = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgv zzgvVar = this.f41142OooO0o;
        zzgvVar.f16021OooO0Oo.OooO00o();
        zzac zzacVar = this.f41141OooO0Oo;
        Object objZza = zzacVar.zzc.zza();
        zzlh zzlhVar = zzgvVar.f16021OooO0Oo;
        zzq zzqVar = this.f41143OooO0o0;
        if (objZza == null) {
            zzlhVar.OooO(zzacVar, zzqVar);
        } else {
            zzlhVar.OooOO0o(zzacVar, zzqVar);
        }
    }
}

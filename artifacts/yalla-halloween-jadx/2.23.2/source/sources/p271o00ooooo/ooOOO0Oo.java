package p271o00ooooo;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzgv;
import com.google.android.gms.measurement.internal.zzlh;
import com.google.android.gms.measurement.internal.zzq;

/* JADX INFO: loaded from: classes3.dex */
public final class ooOOO0Oo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzq f40805OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzgv f40806OooO0o0;

    public ooOOO0Oo(zzgv zzgvVar, zzq zzqVar) {
        this.f40806OooO0o0 = zzgvVar;
        this.f40805OooO0Oo = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgv zzgvVar = this.f40806OooO0o0;
        zzgvVar.f15545OooO0Oo.OooO00o();
        zzlh zzlhVar = zzgvVar.f15545OooO0Oo;
        zzlhVar.zzaB().zzg();
        zzlhVar.OooO0O0();
        zzq zzqVar = this.f40805OooO0Oo;
        Preconditions.checkNotEmpty(zzqVar.zza);
        zzlhVar.OooOooO(zzqVar);
    }
}

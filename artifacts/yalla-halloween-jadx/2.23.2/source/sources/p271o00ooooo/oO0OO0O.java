package p271o00ooooo;

import com.google.android.gms.measurement.internal.zzgv;
import com.google.android.gms.measurement.internal.zzlh;
import com.google.android.gms.measurement.internal.zzlk;
import com.google.android.gms.measurement.internal.zzq;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0OO0O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzlk f40633OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ zzgv f40634OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzq f40635OooO0o0;

    public oO0OO0O(zzgv zzgvVar, zzlk zzlkVar, zzq zzqVar) {
        this.f40634OooO0o = zzgvVar;
        this.f40633OooO0Oo = zzlkVar;
        this.f40635OooO0o0 = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgv zzgvVar = this.f40634OooO0o;
        zzgvVar.f15545OooO0Oo.OooO00o();
        zzlk zzlkVar = this.f40633OooO0Oo;
        Object objZza = zzlkVar.zza();
        zzlh zzlhVar = zzgvVar.f15545OooO0Oo;
        zzq zzqVar = this.f40635OooO0o0;
        if (objZza == null) {
            zzlhVar.OooOO0(zzlkVar.zzb, zzqVar);
        } else {
            zzlhVar.OooOOO(zzlkVar, zzqVar);
        }
    }
}

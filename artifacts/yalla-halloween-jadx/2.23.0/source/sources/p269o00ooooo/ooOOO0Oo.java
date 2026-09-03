package p269o00ooooo;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzej;
import com.google.android.gms.measurement.internal.zzjz;
import com.google.android.gms.measurement.internal.zzlk;
import com.google.android.gms.measurement.internal.zzq;

/* JADX INFO: loaded from: classes3.dex */
public final class ooOOO0Oo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzq f41534OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ zzlk f41535OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f41536OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ zzjz f41537OooO0oO;

    public ooOOO0Oo(zzjz zzjzVar, zzq zzqVar, boolean z, zzlk zzlkVar) {
        this.f41537OooO0oO = zzjzVar;
        this.f41534OooO0Oo = zzqVar;
        this.f41536OooO0o0 = z;
        this.f41535OooO0o = zzlkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjz zzjzVar = this.f41537OooO0oO;
        zzej zzejVar = zzjzVar.f16064OooO0Oo;
        if (zzejVar == null) {
            o0O0OO0.OooO00o(zzjzVar.f41276OooO00o, "Discarding data. Failed to set user property");
            return;
        }
        zzq zzqVar = this.f41534OooO0Oo;
        Preconditions.checkNotNull(zzqVar);
        zzjzVar.OooO0OO(zzejVar, this.f41536OooO0o0 ? null : this.f41535OooO0o, zzqVar);
        zzjzVar.OooO();
    }
}

package p269o00ooooo;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzej;
import com.google.android.gms.measurement.internal.zzjz;
import com.google.android.gms.measurement.internal.zzq;

/* JADX INFO: loaded from: classes3.dex */
public final class oOO000o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzq f41435OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ zzac f41436OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f41437OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ zzjz f41438OooO0oO;

    public oOO000o(zzjz zzjzVar, zzq zzqVar, boolean z, zzac zzacVar) {
        this.f41438OooO0oO = zzjzVar;
        this.f41435OooO0Oo = zzqVar;
        this.f41437OooO0o0 = z;
        this.f41436OooO0o = zzacVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjz zzjzVar = this.f41438OooO0oO;
        zzej zzejVar = zzjzVar.f16064OooO0Oo;
        if (zzejVar == null) {
            o0O0OO0.OooO00o(zzjzVar.f41276OooO00o, "Discarding data. Failed to send conditional user property to service");
            return;
        }
        zzq zzqVar = this.f41435OooO0Oo;
        Preconditions.checkNotNull(zzqVar);
        zzjzVar.OooO0OO(zzejVar, this.f41437OooO0o0 ? null : this.f41436OooO0o, zzqVar);
        zzjzVar.OooO();
    }
}

package p271o00ooooo;

import androidx.media3.session.o00O00;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzej;
import com.google.android.gms.measurement.internal.zzjz;
import com.google.android.gms.measurement.internal.zzlk;
import com.google.android.gms.measurement.internal.zzq;

/* JADX INFO: loaded from: classes3.dex */
public final class Oo0000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzq f40446OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ zzlk f40447OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f40448OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ zzjz f40449OooO0oO;

    public Oo0000(zzjz zzjzVar, zzq zzqVar, boolean z, zzlk zzlkVar) {
        this.f40449OooO0oO = zzjzVar;
        this.f40446OooO0Oo = zzqVar;
        this.f40448OooO0o0 = z;
        this.f40447OooO0o = zzlkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjz zzjzVar = this.f40449OooO0oO;
        zzej zzejVar = zzjzVar.f15588OooO0Oo;
        if (zzejVar == null) {
            o00O00.OooO00o(zzjzVar.f40788OooO00o, "Discarding data. Failed to set user property");
            return;
        }
        zzq zzqVar = this.f40446OooO0Oo;
        Preconditions.checkNotNull(zzqVar);
        zzjzVar.OooO0OO(zzejVar, this.f40448OooO0o0 ? null : this.f40447OooO0o, zzqVar);
        zzjzVar.OooO();
    }
}

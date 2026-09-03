package p269o00ooooo;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzej;
import com.google.android.gms.measurement.internal.zzjz;
import com.google.android.gms.measurement.internal.zzq;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0o0000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzq f41409OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ zzjz f41410OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Bundle f41411OooO0o0;

    public oO0o0000(zzjz zzjzVar, zzq zzqVar, Bundle bundle) {
        this.f41410OooO0o = zzjzVar;
        this.f41409OooO0Oo = zzqVar;
        this.f41411OooO0o0 = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzq zzqVar = this.f41409OooO0Oo;
        zzjz zzjzVar = this.f41410OooO0o;
        zzej zzejVar = zzjzVar.f16064OooO0Oo;
        if (zzejVar == null) {
            o0O0OO0.OooO00o(zzjzVar.f41276OooO00o, "Failed to send default event parameters to service");
            return;
        }
        try {
            Preconditions.checkNotNull(zzqVar);
            zzejVar.zzr(this.f41411OooO0o0, zzqVar);
        } catch (RemoteException e) {
            zzjzVar.f41276OooO00o.zzaA().zzd().zzb("Failed to send default event parameters to service", e);
        }
    }
}

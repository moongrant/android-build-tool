package p269o00ooooo;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzej;
import com.google.android.gms.measurement.internal.zzjz;
import com.google.android.gms.measurement.internal.zzq;

/* JADX INFO: loaded from: classes3.dex */
public final class ooOOO00O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzq f41532OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzjz f41533OooO0o0;

    public ooOOO00O(zzjz zzjzVar, zzq zzqVar) {
        this.f41533OooO0o0 = zzjzVar;
        this.f41532OooO0Oo = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzq zzqVar = this.f41532OooO0Oo;
        zzjz zzjzVar = this.f41533OooO0o0;
        zzej zzejVar = zzjzVar.f16064OooO0Oo;
        if (zzejVar == null) {
            o0O0OO0.OooO00o(zzjzVar.f41276OooO00o, "Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            Preconditions.checkNotNull(zzqVar);
            zzejVar.zzm(zzqVar);
        } catch (RemoteException e) {
            zzjzVar.f41276OooO00o.zzaA().zzd().zzb("Failed to reset data on the service: remote exception", e);
        }
        zzjzVar.OooO();
    }
}

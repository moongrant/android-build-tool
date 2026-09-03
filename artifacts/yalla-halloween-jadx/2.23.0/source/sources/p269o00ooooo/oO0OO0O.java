package p269o00ooooo;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzej;
import com.google.android.gms.measurement.internal.zzjz;
import com.google.android.gms.measurement.internal.zzq;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0OO0O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzq f41387OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzjz f41388OooO0o0;

    public oO0OO0O(zzjz zzjzVar, zzq zzqVar) {
        this.f41388OooO0o0 = zzjzVar;
        this.f41387OooO0Oo = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzq zzqVar = this.f41387OooO0Oo;
        zzjz zzjzVar = this.f41388OooO0o0;
        zzej zzejVar = zzjzVar.f16064OooO0Oo;
        if (zzejVar == null) {
            o0O0OO0.OooO00o(zzjzVar.f41276OooO00o, "Discarding data. Failed to send app launch");
            return;
        }
        try {
            Preconditions.checkNotNull(zzqVar);
            zzejVar.zzj(zzqVar);
            zzjzVar.f41276OooO00o.zzi().zzm();
            zzjzVar.OooO0OO(zzejVar, null, zzqVar);
            zzjzVar.OooO();
        } catch (RemoteException e) {
            zzjzVar.f41276OooO00o.zzaA().zzd().zzb("Failed to send app launch to the service", e);
        }
    }
}

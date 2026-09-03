package p271o00ooooo;

import android.os.RemoteException;
import androidx.media3.session.o00O00;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzej;
import com.google.android.gms.measurement.internal.zzjz;
import com.google.android.gms.measurement.internal.zzq;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzq f40513OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzjz f40514OooO0o0;

    public k(zzjz zzjzVar, zzq zzqVar) {
        this.f40514OooO0o0 = zzjzVar;
        this.f40513OooO0Oo = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzq zzqVar = this.f40513OooO0Oo;
        zzjz zzjzVar = this.f40514OooO0o0;
        zzej zzejVar = zzjzVar.f15588OooO0Oo;
        if (zzejVar == null) {
            o00O00.OooO00o(zzjzVar.f40788OooO00o, "Failed to send consent settings to service");
            return;
        }
        try {
            Preconditions.checkNotNull(zzqVar);
            zzejVar.zzp(zzqVar);
            zzjzVar.OooO();
        } catch (RemoteException e) {
            zzjzVar.f40788OooO00o.zzaA().zzd().zzb("Failed to send consent settings to the service", e);
        }
    }
}

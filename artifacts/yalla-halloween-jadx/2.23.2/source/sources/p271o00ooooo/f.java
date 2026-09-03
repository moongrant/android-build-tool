package p271o00ooooo;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.media3.session.o00O00;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzej;
import com.google.android.gms.measurement.internal.zzjz;
import com.google.android.gms.measurement.internal.zzq;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zzq f40496OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ zzjz f40497OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Bundle f40498OooO0o0;

    public f(zzjz zzjzVar, zzq zzqVar, Bundle bundle) {
        this.f40497OooO0o = zzjzVar;
        this.f40496OooO0Oo = zzqVar;
        this.f40498OooO0o0 = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzq zzqVar = this.f40496OooO0Oo;
        zzjz zzjzVar = this.f40497OooO0o;
        zzej zzejVar = zzjzVar.f15588OooO0Oo;
        if (zzejVar == null) {
            o00O00.OooO00o(zzjzVar.f40788OooO00o, "Failed to send default event parameters to service");
            return;
        }
        try {
            Preconditions.checkNotNull(zzqVar);
            zzejVar.zzr(this.f40498OooO0o0, zzqVar);
        } catch (RemoteException e) {
            zzjzVar.f40788OooO00o.zzaA().zzd().zzb("Failed to send default event parameters to service", e);
        }
    }
}

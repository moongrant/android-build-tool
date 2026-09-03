package o0OO0OoO;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzee;
import com.google.android.gms.measurement.internal.zzjs;
import com.google.android.gms.measurement.internal.zzq;

/* JADX INFO: loaded from: classes2.dex */
public final class oo00oO implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ zzq f37894Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Bundle f37895Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ zzjs f37896Oooo0oo;

    public oo00oO(zzjs zzjsVar, zzq zzqVar, Bundle bundle) {
        this.f37896Oooo0oo = zzjsVar;
        this.f37894Oooo0o = zzqVar;
        this.f37895Oooo0oO = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjs zzjsVar = this.f37896Oooo0oo;
        zzee zzeeVar = zzjsVar.f16268OooO0Oo;
        if (zzeeVar == null) {
            p167o00Ooo.OooOO0.OooO0O0(zzjsVar.f37615OooO00o, "Failed to send default event parameters to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.f37894Oooo0o);
            zzeeVar.zzr(this.f37895Oooo0oO, this.f37894Oooo0o);
        } catch (RemoteException e) {
            this.f37896Oooo0oo.f37615OooO00o.zzay().zzd().zzb("Failed to send default event parameters to service", e);
        }
    }
}

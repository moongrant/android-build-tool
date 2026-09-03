package o0OO0OoO;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzee;
import com.google.android.gms.measurement.internal.zzjs;
import com.google.android.gms.measurement.internal.zzq;

/* JADX INFO: loaded from: classes2.dex */
public final class o0o0Oo implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ zzq f37864Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ zzjs f37865Oooo0oO;

    public o0o0Oo(zzjs zzjsVar, zzq zzqVar) {
        this.f37865Oooo0oO = zzjsVar;
        this.f37864Oooo0o = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjs zzjsVar = this.f37865Oooo0oO;
        zzee zzeeVar = zzjsVar.f16268OooO0Oo;
        if (zzeeVar == null) {
            p167o00Ooo.OooOO0.OooO0O0(zzjsVar.f37615OooO00o, "Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.f37864Oooo0o);
            zzeeVar.zzm(this.f37864Oooo0o);
        } catch (RemoteException e) {
            this.f37865Oooo0oO.f37615OooO00o.zzay().zzd().zzb("Failed to reset data on the service: remote exception", e);
        }
        this.f37865Oooo0oO.OooO();
    }
}

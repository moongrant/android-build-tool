package o0OO0OoO;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzee;
import com.google.android.gms.measurement.internal.zzjs;
import com.google.android.gms.measurement.internal.zzq;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O00000 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ zzq f37730Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ zzjs f37731Oooo0oO;

    public o0O00000(zzjs zzjsVar, zzq zzqVar) {
        this.f37731Oooo0oO = zzjsVar;
        this.f37730Oooo0o = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjs zzjsVar = this.f37731Oooo0oO;
        zzee zzeeVar = zzjsVar.f16268OooO0Oo;
        if (zzeeVar == null) {
            p167o00Ooo.OooOO0.OooO0O0(zzjsVar.f37615OooO00o, "Failed to send measurementEnabled to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.f37730Oooo0o);
            zzeeVar.zzs(this.f37730Oooo0o);
            this.f37731Oooo0oO.OooO();
        } catch (RemoteException e) {
            this.f37731Oooo0oO.f37615OooO00o.zzay().zzd().zzb("Failed to send measurementEnabled to the service", e);
        }
    }
}

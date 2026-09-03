package o0OO0OoO;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzee;
import com.google.android.gms.measurement.internal.zzjs;
import com.google.android.gms.measurement.internal.zzq;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Oo00 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ zzq f37713Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ zzjs f37714Oooo0oO;

    public o00Oo00(zzjs zzjsVar, zzq zzqVar) {
        this.f37714Oooo0oO = zzjsVar;
        this.f37713Oooo0o = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjs zzjsVar = this.f37714Oooo0oO;
        zzee zzeeVar = zzjsVar.f16268OooO0Oo;
        if (zzeeVar == null) {
            p167o00Ooo.OooOO0.OooO0O0(zzjsVar.f37615OooO00o, "Discarding data. Failed to send app launch");
            return;
        }
        try {
            Preconditions.checkNotNull(this.f37713Oooo0o);
            zzeeVar.zzj(this.f37713Oooo0o);
            this.f37714Oooo0oO.f37615OooO00o.zzi().zzm();
            this.f37714Oooo0oO.OooO0OO(zzeeVar, null, this.f37713Oooo0o);
            this.f37714Oooo0oO.OooO();
        } catch (RemoteException e) {
            this.f37714Oooo0oO.f37615OooO00o.zzay().zzd().zzb("Failed to send app launch to the service", e);
        }
    }
}

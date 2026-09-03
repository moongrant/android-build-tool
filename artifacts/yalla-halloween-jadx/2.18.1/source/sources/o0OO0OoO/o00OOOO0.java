package o0OO0OoO;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzee;
import com.google.android.gms.measurement.internal.zzjs;
import com.google.android.gms.measurement.internal.zzq;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OOOO0 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f37706Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ zzq f37707Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ zzjs f37708Oooo0oo;

    public o00OOOO0(zzjs zzjsVar, AtomicReference atomicReference, zzq zzqVar) {
        this.f37708Oooo0oo = zzjsVar;
        this.f37706Oooo0o = atomicReference;
        this.f37707Oooo0oO = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f37706Oooo0o) {
            try {
                try {
                    if (!this.f37708Oooo0oo.f37615OooO00o.zzm().OooO0o().zzi(zzah.ANALYTICS_STORAGE)) {
                        this.f37708Oooo0oo.f37615OooO00o.zzay().zzl().zza("Analytics storage consent denied; will not get app instance id");
                        this.f37708Oooo0oo.f37615OooO00o.zzq().OooO(null);
                        this.f37708Oooo0oo.f37615OooO00o.zzm().f37766OooO0o.zzb(null);
                        this.f37706Oooo0o.set(null);
                        this.f37706Oooo0o.notify();
                        return;
                    }
                    zzjs zzjsVar = this.f37708Oooo0oo;
                    zzee zzeeVar = zzjsVar.f16268OooO0Oo;
                    if (zzeeVar == null) {
                        zzjsVar.f37615OooO00o.zzay().zzd().zza("Failed to get app instance id");
                        this.f37706Oooo0o.notify();
                        return;
                    }
                    Preconditions.checkNotNull(this.f37707Oooo0oO);
                    this.f37706Oooo0o.set(zzeeVar.zzd(this.f37707Oooo0oO));
                    String str = (String) this.f37706Oooo0o.get();
                    if (str != null) {
                        this.f37708Oooo0oo.f37615OooO00o.zzq().OooO(str);
                        this.f37708Oooo0oo.f37615OooO00o.zzm().f37766OooO0o.zzb(str);
                    }
                    this.f37708Oooo0oo.OooO();
                    atomicReference = this.f37706Oooo0o;
                    atomicReference.notify();
                } catch (RemoteException e) {
                    this.f37708Oooo0oo.f37615OooO00o.zzay().zzd().zzb("Failed to get app instance id", e);
                    atomicReference = this.f37706Oooo0o;
                }
            } catch (Throwable th) {
                this.f37706Oooo0o.notify();
                throw th;
            }
        }
    }
}

package o0OO0OoO;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzee;
import com.google.android.gms.measurement.internal.zzjs;
import com.google.android.gms.measurement.internal.zzq;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OOO0O implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ zzjs f37702Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f37703Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ zzq f37704Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ boolean f37705Oooo0oo;

    public o00OOO0O(zzjs zzjsVar, AtomicReference atomicReference, zzq zzqVar, boolean z) {
        this.f37702Oooo = zzjsVar;
        this.f37703Oooo0o = atomicReference;
        this.f37704Oooo0oO = zzqVar;
        this.f37705Oooo0oo = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f37703Oooo0o) {
            try {
                try {
                    zzjs zzjsVar = this.f37702Oooo;
                    zzee zzeeVar = zzjsVar.f16268OooO0Oo;
                    if (zzeeVar == null) {
                        zzjsVar.f37615OooO00o.zzay().zzd().zza("Failed to get all user properties; not connected to service");
                        this.f37703Oooo0o.notify();
                        return;
                    }
                    Preconditions.checkNotNull(this.f37704Oooo0oO);
                    this.f37703Oooo0o.set(zzeeVar.zze(this.f37704Oooo0oO, this.f37705Oooo0oo));
                    this.f37702Oooo.OooO();
                    atomicReference = this.f37703Oooo0o;
                    atomicReference.notify();
                } catch (RemoteException e) {
                    this.f37702Oooo.f37615OooO00o.zzay().zzd().zzb("Failed to get all user properties; remote exception", e);
                    atomicReference = this.f37703Oooo0o;
                }
            } catch (Throwable th) {
                this.f37703Oooo0o.notify();
                throw th;
            }
        }
    }
}

package p269o00ooooo;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzej;
import com.google.android.gms.measurement.internal.zzjz;
import com.google.android.gms.measurement.internal.zzq;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class oOo0o0oO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f41516OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f41517OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzq f41518OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ zzjz f41519OooO0oO;

    public oOo0o0oO(zzjz zzjzVar, AtomicReference atomicReference, zzq zzqVar, boolean z) {
        this.f41519OooO0oO = zzjzVar;
        this.f41516OooO0Oo = atomicReference;
        this.f41518OooO0o0 = zzqVar;
        this.f41517OooO0o = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f41516OooO0Oo) {
            try {
                try {
                    zzjz zzjzVar = this.f41519OooO0oO;
                    zzej zzejVar = zzjzVar.f16064OooO0Oo;
                    if (zzejVar == null) {
                        zzjzVar.f41276OooO00o.zzaA().zzd().zza("Failed to get all user properties; not connected to service");
                        this.f41516OooO0Oo.notify();
                        return;
                    }
                    Preconditions.checkNotNull(this.f41518OooO0o0);
                    this.f41516OooO0Oo.set(zzejVar.zze(this.f41518OooO0o0, this.f41517OooO0o));
                    this.f41519OooO0oO.OooO();
                    atomicReference = this.f41516OooO0Oo;
                    atomicReference.notify();
                } catch (RemoteException e) {
                    this.f41519OooO0oO.f41276OooO00o.zzaA().zzd().zzb("Failed to get all user properties; remote exception", e);
                    atomicReference = this.f41516OooO0Oo;
                }
            } catch (Throwable th) {
                this.f41516OooO0Oo.notify();
                throw th;
            }
        }
    }
}

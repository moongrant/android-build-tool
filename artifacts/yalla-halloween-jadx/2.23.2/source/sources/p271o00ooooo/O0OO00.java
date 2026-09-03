package p271o00ooooo;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzej;
import com.google.android.gms.measurement.internal.zzjz;
import com.google.android.gms.measurement.internal.zzq;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class O0OO00 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f40442OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f40443OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzq f40444OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ zzjz f40445OooO0oO;

    public O0OO00(zzjz zzjzVar, AtomicReference atomicReference, zzq zzqVar, boolean z) {
        this.f40445OooO0oO = zzjzVar;
        this.f40442OooO0Oo = atomicReference;
        this.f40444OooO0o0 = zzqVar;
        this.f40443OooO0o = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f40442OooO0Oo) {
            try {
                try {
                    zzjz zzjzVar = this.f40445OooO0oO;
                    zzej zzejVar = zzjzVar.f15588OooO0Oo;
                    if (zzejVar == null) {
                        zzjzVar.f40788OooO00o.zzaA().zzd().zza("Failed to get all user properties; not connected to service");
                        this.f40442OooO0Oo.notify();
                        return;
                    }
                    Preconditions.checkNotNull(this.f40444OooO0o0);
                    this.f40442OooO0Oo.set(zzejVar.zze(this.f40444OooO0o0, this.f40443OooO0o));
                    this.f40445OooO0oO.OooO();
                    atomicReference = this.f40442OooO0Oo;
                    atomicReference.notify();
                } catch (RemoteException e) {
                    this.f40445OooO0oO.f40788OooO00o.zzaA().zzd().zzb("Failed to get all user properties; remote exception", e);
                    atomicReference = this.f40442OooO0Oo;
                }
            } catch (Throwable th) {
                this.f40442OooO0Oo.notify();
                throw th;
            }
        }
    }
}

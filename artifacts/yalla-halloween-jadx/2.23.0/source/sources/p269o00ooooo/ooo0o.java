package p269o00ooooo;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzej;
import com.google.android.gms.measurement.internal.zzha;
import com.google.android.gms.measurement.internal.zzjz;
import com.google.android.gms.measurement.internal.zzq;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class ooo0o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f41542OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ zzjz f41543OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzq f41544OooO0o0;

    public ooo0o(zzjz zzjzVar, AtomicReference atomicReference, zzq zzqVar) {
        this.f41543OooO0o = zzjzVar;
        this.f41542OooO0Oo = atomicReference;
        this.f41544OooO0o0 = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f41542OooO0Oo) {
            try {
                try {
                    if (!this.f41543OooO0o.f41276OooO00o.zzm().OooO0o0().zzj(zzha.ANALYTICS_STORAGE)) {
                        this.f41543OooO0o.f41276OooO00o.zzaA().zzl().zza("Analytics storage consent denied; will not get app instance id");
                        this.f41543OooO0o.f41276OooO00o.zzq().f16041OooO0oO.set(null);
                        this.f41543OooO0o.f41276OooO00o.zzm().f41211OooO0o.zzb(null);
                        this.f41542OooO0Oo.set(null);
                        this.f41542OooO0Oo.notify();
                        return;
                    }
                    zzjz zzjzVar = this.f41543OooO0o;
                    zzej zzejVar = zzjzVar.f16064OooO0Oo;
                    if (zzejVar == null) {
                        zzjzVar.f41276OooO00o.zzaA().zzd().zza("Failed to get app instance id");
                        this.f41542OooO0Oo.notify();
                        return;
                    }
                    Preconditions.checkNotNull(this.f41544OooO0o0);
                    this.f41542OooO0Oo.set(zzejVar.zzd(this.f41544OooO0o0));
                    String str = (String) this.f41542OooO0Oo.get();
                    if (str != null) {
                        this.f41543OooO0o.f41276OooO00o.zzq().f16041OooO0oO.set(str);
                        this.f41543OooO0o.f41276OooO00o.zzm().f41211OooO0o.zzb(str);
                    }
                    this.f41543OooO0o.OooO();
                    atomicReference = this.f41542OooO0Oo;
                    atomicReference.notify();
                } catch (RemoteException e) {
                    this.f41543OooO0o.f41276OooO00o.zzaA().zzd().zzb("Failed to get app instance id", e);
                    atomicReference = this.f41542OooO0Oo;
                }
            } catch (Throwable th) {
                this.f41542OooO0Oo.notify();
                throw th;
            }
        }
    }
}

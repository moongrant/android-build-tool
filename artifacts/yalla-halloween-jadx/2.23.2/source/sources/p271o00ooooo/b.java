package p271o00ooooo;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzej;
import com.google.android.gms.measurement.internal.zzha;
import com.google.android.gms.measurement.internal.zzjz;
import com.google.android.gms.measurement.internal.zzq;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f40462OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ zzjz f40463OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzq f40464OooO0o0;

    public b(zzjz zzjzVar, AtomicReference atomicReference, zzq zzqVar) {
        this.f40463OooO0o = zzjzVar;
        this.f40462OooO0Oo = atomicReference;
        this.f40464OooO0o0 = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f40462OooO0Oo) {
            try {
                try {
                    if (!this.f40463OooO0o.f40788OooO00o.zzm().OooO0o0().zzj(zzha.ANALYTICS_STORAGE)) {
                        this.f40463OooO0o.f40788OooO00o.zzaA().zzl().zza("Analytics storage consent denied; will not get app instance id");
                        this.f40463OooO0o.f40788OooO00o.zzq().f15565OooO0oO.set(null);
                        this.f40463OooO0o.f40788OooO00o.zzm().f40767OooO0o.zzb(null);
                        this.f40462OooO0Oo.set(null);
                        this.f40462OooO0Oo.notify();
                        return;
                    }
                    zzjz zzjzVar = this.f40463OooO0o;
                    zzej zzejVar = zzjzVar.f15588OooO0Oo;
                    if (zzejVar == null) {
                        zzjzVar.f40788OooO00o.zzaA().zzd().zza("Failed to get app instance id");
                        this.f40462OooO0Oo.notify();
                        return;
                    }
                    Preconditions.checkNotNull(this.f40464OooO0o0);
                    this.f40462OooO0Oo.set(zzejVar.zzd(this.f40464OooO0o0));
                    String str = (String) this.f40462OooO0Oo.get();
                    if (str != null) {
                        this.f40463OooO0o.f40788OooO00o.zzq().f15565OooO0oO.set(str);
                        this.f40463OooO0o.f40788OooO00o.zzm().f40767OooO0o.zzb(str);
                    }
                    this.f40463OooO0o.OooO();
                    atomicReference = this.f40462OooO0Oo;
                    atomicReference.notify();
                } catch (RemoteException e) {
                    this.f40463OooO0o.f40788OooO00o.zzaA().zzd().zzb("Failed to get app instance id", e);
                    atomicReference = this.f40462OooO0Oo;
                }
            } catch (Throwable th) {
                this.f40462OooO0Oo.notify();
                throw th;
            }
        }
    }
}

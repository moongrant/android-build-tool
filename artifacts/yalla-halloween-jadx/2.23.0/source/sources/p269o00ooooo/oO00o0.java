package p269o00ooooo;

import com.google.android.gms.measurement.internal.zzeg;
import com.google.android.gms.measurement.internal.zzik;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class oO00o0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f41306OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzik f41307OooO0o0;

    public oO00o0(zzik zzikVar, AtomicReference atomicReference) {
        this.f41307OooO0o0 = zzikVar;
        this.f41306OooO0Oo = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f41306OooO0Oo) {
            try {
                this.f41306OooO0Oo.set(this.f41307OooO0o0.f41276OooO00o.zzf().zzo(this.f41307OooO0o0.f41276OooO00o.zzh().zzl(), zzeg.zzL));
                this.f41306OooO0Oo.notify();
            } catch (Throwable th) {
                this.f41306OooO0Oo.notify();
                throw th;
            }
        }
    }
}

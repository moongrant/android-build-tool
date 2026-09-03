package p269o00ooooo;

import com.google.android.gms.measurement.internal.zzeg;
import com.google.android.gms.measurement.internal.zzik;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class oOOoOOO0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f41488OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzik f41489OooO0o0;

    public oOOoOOO0(zzik zzikVar, AtomicReference atomicReference) {
        this.f41489OooO0o0 = zzikVar;
        this.f41488OooO0Oo = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f41488OooO0Oo) {
            try {
                this.f41488OooO0Oo.set(Boolean.valueOf(this.f41489OooO0o0.f41276OooO00o.zzf().zzs(this.f41489OooO0o0.f41276OooO00o.zzh().zzl(), zzeg.zzK)));
                this.f41488OooO0Oo.notify();
            } catch (Throwable th) {
                this.f41488OooO0Oo.notify();
                throw th;
            }
        }
    }
}

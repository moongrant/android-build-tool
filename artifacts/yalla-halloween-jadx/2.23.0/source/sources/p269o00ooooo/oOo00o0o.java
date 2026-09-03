package p269o00ooooo;

import com.google.android.gms.measurement.internal.zzeg;
import com.google.android.gms.measurement.internal.zzik;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class oOo00o0o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f41509OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzik f41510OooO0o0;

    public oOo00o0o(zzik zzikVar, AtomicReference atomicReference) {
        this.f41510OooO0o0 = zzikVar;
        this.f41509OooO0Oo = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f41509OooO0Oo) {
            try {
                this.f41509OooO0Oo.set(Long.valueOf(this.f41510OooO0o0.f41276OooO00o.zzf().zzi(this.f41510OooO0o0.f41276OooO00o.zzh().zzl(), zzeg.zzM)));
                this.f41509OooO0Oo.notify();
            } catch (Throwable th) {
                this.f41509OooO0Oo.notify();
                throw th;
            }
        }
    }
}

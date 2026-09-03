package p269o00ooooo;

import com.google.android.gms.measurement.internal.zzeg;
import com.google.android.gms.measurement.internal.zzik;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0OO00o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f41385OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzik f41386OooO0o0;

    public oO0OO00o(zzik zzikVar, AtomicReference atomicReference) {
        this.f41386OooO0o0 = zzikVar;
        this.f41385OooO0Oo = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f41385OooO0Oo) {
            try {
                this.f41385OooO0Oo.set(Double.valueOf(this.f41386OooO0o0.f41276OooO00o.zzf().zza(this.f41386OooO0o0.f41276OooO00o.zzh().zzl(), zzeg.zzO)));
                this.f41385OooO0Oo.notify();
            } catch (Throwable th) {
                this.f41385OooO0Oo.notify();
                throw th;
            }
        }
    }
}

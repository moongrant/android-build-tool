package p271o00ooooo;

import com.google.android.gms.measurement.internal.zzeg;
import com.google.android.gms.measurement.internal.zzik;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class oOO0O0O0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f40714OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzik f40715OooO0o0;

    public oOO0O0O0(zzik zzikVar, AtomicReference atomicReference) {
        this.f40715OooO0o0 = zzikVar;
        this.f40714OooO0Oo = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f40714OooO0Oo) {
            try {
                this.f40714OooO0Oo.set(Boolean.valueOf(this.f40715OooO0o0.f40788OooO00o.zzf().zzs(this.f40715OooO0o0.f40788OooO00o.zzh().zzl(), zzeg.zzK)));
                this.f40714OooO0Oo.notify();
            } catch (Throwable th) {
                this.f40714OooO0Oo.notify();
                throw th;
            }
        }
    }
}

package p271o00ooooo;

import com.google.android.gms.measurement.internal.zzeg;
import com.google.android.gms.measurement.internal.zzik;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class oOO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f40645OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzik f40646OooO0o0;

    public oOO(zzik zzikVar, AtomicReference atomicReference) {
        this.f40646OooO0o0 = zzikVar;
        this.f40645OooO0Oo = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f40645OooO0Oo) {
            try {
                this.f40645OooO0Oo.set(Double.valueOf(this.f40646OooO0o0.f40788OooO00o.zzf().zza(this.f40646OooO0o0.f40788OooO00o.zzh().zzl(), zzeg.zzO)));
                this.f40645OooO0Oo.notify();
            } catch (Throwable th) {
                this.f40645OooO0Oo.notify();
                throw th;
            }
        }
    }
}

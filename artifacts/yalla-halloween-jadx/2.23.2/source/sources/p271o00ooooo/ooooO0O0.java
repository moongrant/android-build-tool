package p271o00ooooo;

import com.google.android.gms.measurement.internal.zzeg;
import com.google.android.gms.measurement.internal.zzik;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class ooooO0O0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f40813OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ zzik f40814OooO0o0;

    public ooooO0O0(zzik zzikVar, AtomicReference atomicReference) {
        this.f40814OooO0o0 = zzikVar;
        this.f40813OooO0Oo = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f40813OooO0Oo) {
            try {
                this.f40813OooO0Oo.set(Integer.valueOf(this.f40814OooO0o0.f40788OooO00o.zzf().zze(this.f40814OooO0o0.f40788OooO00o.zzh().zzl(), zzeg.zzN)));
                this.f40813OooO0Oo.notify();
            } catch (Throwable th) {
                this.f40813OooO0Oo.notify();
                throw th;
            }
        }
    }
}

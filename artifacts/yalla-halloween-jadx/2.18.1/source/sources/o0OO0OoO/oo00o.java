package o0OO0OoO;

import com.google.android.gms.measurement.internal.zzeb;
import com.google.android.gms.measurement.internal.zzid;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class oo00o implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f37892Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ zzid f37893Oooo0oO;

    public oo00o(zzid zzidVar, AtomicReference atomicReference) {
        this.f37893Oooo0oO = zzidVar;
        this.f37892Oooo0o = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f37892Oooo0o) {
            try {
                this.f37892Oooo0o.set(Long.valueOf(this.f37893Oooo0oO.f37615OooO00o.zzf().zzi(this.f37893Oooo0oO.f37615OooO00o.zzh().zzl(), zzeb.zzL)));
                this.f37892Oooo0o.notify();
            } catch (Throwable th) {
                this.f37892Oooo0o.notify();
                throw th;
            }
        }
    }
}

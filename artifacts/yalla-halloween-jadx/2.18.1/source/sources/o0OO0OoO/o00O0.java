package o0OO0OoO;

import com.google.android.gms.measurement.internal.zzeb;
import com.google.android.gms.measurement.internal.zzid;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f37631Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ zzid f37632Oooo0oO;

    public o00O0(zzid zzidVar, AtomicReference atomicReference) {
        this.f37632Oooo0oO = zzidVar;
        this.f37631Oooo0o = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f37631Oooo0o) {
            try {
                this.f37631Oooo0o.set(Integer.valueOf(this.f37632Oooo0oO.f37615OooO00o.zzf().zze(this.f37632Oooo0oO.f37615OooO00o.zzh().zzl(), zzeb.zzM)));
                this.f37631Oooo0o.notify();
            } catch (Throwable th) {
                this.f37631Oooo0o.notify();
                throw th;
            }
        }
    }
}

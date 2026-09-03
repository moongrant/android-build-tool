package o0OO0OoO;

import com.google.android.gms.measurement.internal.zzeb;
import com.google.android.gms.measurement.internal.zzid;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O00O implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f37646Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ zzid f37647Oooo0oO;

    public o00O00O(zzid zzidVar, AtomicReference atomicReference) {
        this.f37647Oooo0oO = zzidVar;
        this.f37646Oooo0o = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f37646Oooo0o) {
            try {
                this.f37646Oooo0o.set(Boolean.valueOf(this.f37647Oooo0oO.f37615OooO00o.zzf().zzs(this.f37647Oooo0oO.f37615OooO00o.zzh().zzl(), zzeb.zzJ)));
                this.f37646Oooo0o.notify();
            } catch (Throwable th) {
                this.f37646Oooo0o.notify();
                throw th;
            }
        }
    }
}

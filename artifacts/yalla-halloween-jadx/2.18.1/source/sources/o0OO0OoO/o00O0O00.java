package o0OO0OoO;

import com.google.android.gms.measurement.internal.zzeb;
import com.google.android.gms.measurement.internal.zzid;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O00 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f37655Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f37656Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Object f37657Oooo0oo;

    public /* synthetic */ o00O0O00(Object obj, Object obj2, int i) {
        this.f37655Oooo0o = i;
        this.f37657Oooo0oo = obj;
        this.f37656Oooo0oO = obj2;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f37655Oooo0o) {
            case 0:
                synchronized (((AtomicReference) this.f37656Oooo0oO)) {
                    try {
                        ((AtomicReference) this.f37656Oooo0oO).set(Double.valueOf(((zzid) this.f37657Oooo0oo).f37615OooO00o.zzf().zza(((zzid) this.f37657Oooo0oo).f37615OooO00o.zzh().zzl(), zzeb.zzN)));
                        ((AtomicReference) this.f37656Oooo0oO).notify();
                    } catch (Throwable th) {
                        ((AtomicReference) this.f37656Oooo0oO).notify();
                        throw th;
                    }
                }
                return;
            default:
                synchronized (((o0OO0o00.Oooo000) this.f37657Oooo0oo).f37947OooO0o0) {
                    OnCompleteListener<TResult> onCompleteListener = ((o0OO0o00.Oooo000) this.f37657Oooo0oo).f37946OooO0o;
                    if (onCompleteListener != 0) {
                        onCompleteListener.onComplete((Task<TResult>) ((Task) this.f37656Oooo0oO));
                    }
                    break;
                }
                return;
        }
    }
}

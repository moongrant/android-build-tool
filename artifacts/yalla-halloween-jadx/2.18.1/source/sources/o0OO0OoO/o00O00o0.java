package o0OO0OoO;

import com.google.android.gms.measurement.internal.zzeb;
import com.google.android.gms.measurement.internal.zzid;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskExecutors;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O00o0 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f37649Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f37650Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Object f37651Oooo0oo;

    public /* synthetic */ o00O00o0(Object obj, Object obj2, int i) {
        this.f37649Oooo0o = i;
        this.f37651Oooo0oo = obj;
        this.f37650Oooo0oO = obj2;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f37649Oooo0o) {
            case 0:
                synchronized (((AtomicReference) this.f37650Oooo0oO)) {
                    try {
                        ((AtomicReference) this.f37650Oooo0oO).set(((zzid) this.f37651Oooo0oo).f37615OooO00o.zzf().zzo(((zzid) this.f37651Oooo0oo).f37615OooO00o.zzh().zzl(), zzeb.zzK));
                        ((AtomicReference) this.f37650Oooo0oO).notify();
                    } catch (Throwable th) {
                        ((AtomicReference) this.f37650Oooo0oO).notify();
                        throw th;
                    }
                }
                return;
            default:
                try {
                    Task task = (Task) ((o0OO0o00.OooOOOO) this.f37651Oooo0oo).f37937OooO0o0.then((Task<TResult>) ((Task) this.f37650Oooo0oO));
                    if (task == null) {
                        ((o0OO0o00.OooOOOO) this.f37651Oooo0oo).onFailure(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    o0OO0o00.o0ooOOo o0ooooo2 = TaskExecutors.f16363OooO00o;
                    task.addOnSuccessListener(o0ooooo2, (o0OO0o00.OooOOOO) this.f37651Oooo0oo);
                    task.addOnFailureListener(o0ooooo2, (o0OO0o00.OooOOOO) this.f37651Oooo0oo);
                    task.addOnCanceledListener(o0ooooo2, (o0OO0o00.OooOOOO) this.f37651Oooo0oo);
                    return;
                } catch (RuntimeExecutionException e) {
                    if (e.getCause() instanceof Exception) {
                        ((o0OO0o00.OooOOOO) this.f37651Oooo0oo).f37936OooO0o.OooO00o((Exception) e.getCause());
                        return;
                    } else {
                        ((o0OO0o00.OooOOOO) this.f37651Oooo0oo).f37936OooO0o.OooO00o(e);
                        return;
                    }
                } catch (Exception e2) {
                    ((o0OO0o00.OooOOOO) this.f37651Oooo0oo).f37936OooO0o.OooO00o(e2);
                    return;
                }
        }
    }
}

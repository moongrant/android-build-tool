package o0OO0OoO;

import com.google.android.gms.measurement.internal.zzeb;
import com.google.android.gms.measurement.internal.zzid;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskExecutors;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O00OO implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f37672Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Object f37673OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f37674OoooO00;

    public /* synthetic */ o00O00OO(Object obj, Object obj2, int i) {
        this.f37672Oooo = i;
        this.f37673OoooO0 = obj;
        this.f37674OoooO00 = obj2;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f37672Oooo) {
            case 0:
                synchronized (((AtomicReference) this.f37674OoooO00)) {
                    try {
                        ((AtomicReference) this.f37674OoooO00).set(((zzid) this.f37673OoooO0).f37591OooO00o.zzf().zzo(((zzid) this.f37673OoooO0).f37591OooO00o.zzh().zzl(), zzeb.zzK));
                        ((AtomicReference) this.f37674OoooO00).notify();
                    } catch (Throwable th) {
                        ((AtomicReference) this.f37674OoooO00).notify();
                        throw th;
                    }
                }
                return;
            default:
                try {
                    Task task = (Task) ((o0OO0o00.OooOOOO) this.f37673OoooO0).f37957OoooO00.then((Task<TResult>) ((Task) this.f37674OoooO00));
                    if (task == null) {
                        ((o0OO0o00.OooOOOO) this.f37673OoooO0).onFailure(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    o0OO0o00.o0ooOOo o0ooooo2 = TaskExecutors.f16381OooO00o;
                    task.addOnSuccessListener(o0ooooo2, (o0OO0o00.OooOOOO) this.f37673OoooO0);
                    task.addOnFailureListener(o0ooooo2, (o0OO0o00.OooOOOO) this.f37673OoooO0);
                    task.addOnCanceledListener(o0ooooo2, (o0OO0o00.OooOOOO) this.f37673OoooO0);
                    return;
                } catch (RuntimeExecutionException e) {
                    if (e.getCause() instanceof Exception) {
                        ((o0OO0o00.OooOOOO) this.f37673OoooO0).f37956OoooO0.OooO00o((Exception) e.getCause());
                        return;
                    } else {
                        ((o0OO0o00.OooOOOO) this.f37673OoooO0).f37956OoooO0.OooO00o(e);
                        return;
                    }
                } catch (Exception e2) {
                    ((o0OO0o00.OooOOOO) this.f37673OoooO0).f37956OoooO0.OooO00o(e2);
                    return;
                }
        }
    }
}

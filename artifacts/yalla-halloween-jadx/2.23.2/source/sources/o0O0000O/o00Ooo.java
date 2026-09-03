package o0O0000O;

import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskExecutors;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Ooo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Task f40940OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ oo000o f40941OooO0o0;

    public o00Ooo(oo000o oo000oVar, Task task) {
        this.f40941OooO0o0 = oo000oVar;
        this.f40940OooO0Oo = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oo000o oo000oVar = this.f40941OooO0o0;
        try {
            Task taskThen = oo000oVar.f40958OooO0o0.then(this.f40940OooO0Oo.getResult());
            if (taskThen == null) {
                oo000oVar.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            o0Oo0oo o0oo0oo2 = TaskExecutors.f15686OooO00o;
            taskThen.addOnSuccessListener(o0oo0oo2, oo000oVar);
            taskThen.addOnFailureListener(o0oo0oo2, oo000oVar);
            taskThen.addOnCanceledListener(o0oo0oo2, oo000oVar);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                oo000oVar.onFailure((Exception) e.getCause());
            } else {
                oo000oVar.onFailure(e);
            }
        } catch (CancellationException unused) {
            oo000oVar.onCanceled();
        } catch (Exception e2) {
            oo000oVar.onFailure(e2);
        }
    }
}

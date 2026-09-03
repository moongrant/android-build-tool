package o0OO0o00;

import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskExecutors;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Task f37950Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o00Oo0 f37951Oooo0oO;

    public o00O0O(o00Oo0 o00oo1, Task task) {
        this.f37951Oooo0oO = o00oo1;
        this.f37950Oooo0o = task;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            Task taskThen = this.f37951Oooo0oO.f37954OooO0o0.then((TResult) this.f37950Oooo0o.getResult());
            if (taskThen == null) {
                this.f37951Oooo0oO.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            o0ooOOo o0ooooo2 = TaskExecutors.f16363OooO00o;
            taskThen.addOnSuccessListener(o0ooooo2, this.f37951Oooo0oO);
            taskThen.addOnFailureListener(o0ooooo2, this.f37951Oooo0oO);
            taskThen.addOnCanceledListener(o0ooooo2, this.f37951Oooo0oO);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.f37951Oooo0oO.onFailure((Exception) e.getCause());
            } else {
                this.f37951Oooo0oO.onFailure(e);
            }
        } catch (CancellationException unused) {
            this.f37951Oooo0oO.onCanceled();
        } catch (Exception e2) {
            this.f37951Oooo0oO.onFailure(e2);
        }
    }
}

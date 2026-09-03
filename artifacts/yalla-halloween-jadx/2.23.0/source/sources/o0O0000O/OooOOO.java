package o0O0000O;

import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskExecutors;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Task f41605OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooOOOO f41606OooO0o0;

    public OooOOO(OooOOOO oooOOOO, Task task) {
        this.f41606OooO0o0 = oooOOOO;
        this.f41605OooO0Oo = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OooOOOO oooOOOO = this.f41606OooO0o0;
        try {
            Task task = (Task) oooOOOO.f41612OooO0o0.then(this.f41605OooO0Oo);
            if (task == null) {
                oooOOOO.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            o0Oo0oo o0oo0oo2 = TaskExecutors.f16158OooO00o;
            task.addOnSuccessListener(o0oo0oo2, oooOOOO);
            task.addOnFailureListener(o0oo0oo2, oooOOOO);
            task.addOnCanceledListener(o0oo0oo2, oooOOOO);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                oooOOOO.f41611OooO0o.OooO00o((Exception) e.getCause());
            } else {
                oooOOOO.f41611OooO0o.OooO00o(e);
            }
        } catch (Exception e2) {
            oooOOOO.f41611OooO0o.OooO00o(e2);
        }
    }
}

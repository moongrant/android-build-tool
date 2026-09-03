package o0O0000O;

import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Task f41603OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooOOO0 f41604OooO0o0;

    public OooOO0O(OooOOO0 oooOOO0, Task task) {
        this.f41604OooO0o0 = oooOOO0;
        this.f41603OooO0Oo = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Task task = this.f41603OooO0Oo;
        boolean zIsCanceled = task.isCanceled();
        OooOOO0 oooOOO0 = this.f41604OooO0o0;
        if (zIsCanceled) {
            oooOOO0.f41608OooO0o.OooO0OO();
            return;
        }
        try {
            oooOOO0.f41608OooO0o.OooO0O0(oooOOO0.f41609OooO0o0.then(task));
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                oooOOO0.f41608OooO0o.OooO00o((Exception) e.getCause());
            } else {
                oooOOO0.f41608OooO0o.OooO00o(e);
            }
        } catch (Exception e2) {
            oooOOO0.f41608OooO0o.OooO00o(e2);
        }
    }
}

package o0OO0o00;

import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Task f37933Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ OooOOO f37934Oooo0oO;

    public OooOOO0(OooOOO oooOOO, Task task) {
        this.f37934Oooo0oO = oooOOO;
        this.f37933Oooo0o = task;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.f37933Oooo0o.isCanceled()) {
            this.f37934Oooo0oO.f37931OooO0o.OooO0OO();
            return;
        }
        try {
            this.f37934Oooo0oO.f37931OooO0o.OooO0O0((TContinuationResult) this.f37934Oooo0oO.f37932OooO0o0.then((Task<TResult>) this.f37933Oooo0o));
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.f37934Oooo0oO.f37931OooO0o.OooO00o((Exception) e.getCause());
            } else {
                this.f37934Oooo0oO.f37931OooO0o.OooO00o(e);
            }
        } catch (Exception e2) {
            this.f37934Oooo0oO.f37931OooO0o.OooO00o(e2);
        }
    }
}

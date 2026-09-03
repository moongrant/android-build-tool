package p289o0O0Oo0;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Executor f41471OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Task<Void> f41472OooO0O0 = Tasks.forResult(null);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Object f41473OooO0OO = new Object();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ThreadLocal<Boolean> f41474OooO0Oo = new ThreadLocal<>();

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            OooOOO0.this.f41474OooO0Oo.set(Boolean.TRUE);
        }
    }

    public OooOOO0(Executor executor) {
        this.f41471OooO00o = executor;
        executor.execute(new OooO00o());
    }

    public final <T> Task<T> OooO00o(Callable<T> callable) {
        Task<T> task;
        synchronized (this.f41473OooO0OO) {
            task = (Task<T>) this.f41472OooO0O0.continueWith(this.f41471OooO00o, new OooOOOO(callable));
            this.f41472OooO0O0 = task.continueWith(this.f41471OooO00o, new OooOo00());
        }
        return task;
    }

    public final <T> Task<T> OooO0O0(Callable<Task<T>> callable) {
        Task<T> task;
        synchronized (this.f41473OooO0OO) {
            task = (Task<T>) this.f41472OooO0O0.continueWithTask(this.f41471OooO00o, new OooOOOO(callable));
            this.f41472OooO0O0 = task.continueWith(this.f41471OooO00o, new OooOo00());
        }
        return task;
    }
}

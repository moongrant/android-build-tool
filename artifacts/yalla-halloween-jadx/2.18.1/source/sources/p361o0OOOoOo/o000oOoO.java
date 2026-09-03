package p361o0OOOoOo;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Executor f38479OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Task<Void> f38480OooO0O0 = Tasks.forResult(null);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Object f38481OooO0OO = new Object();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ThreadLocal<Boolean> f38482OooO0Oo = new ThreadLocal<>();

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o000oOoO.this.f38482OooO0Oo.set(Boolean.TRUE);
        }
    }

    public o000oOoO(Executor executor) {
        this.f38479OooO00o = executor;
        executor.execute(new OooO00o());
    }

    public final void OooO00o() {
        if (!Boolean.TRUE.equals(this.f38482OooO0Oo.get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    public final <T> Task<T> OooO0O0(Callable<T> callable) {
        Task<T> task;
        synchronized (this.f38481OooO0OO) {
            task = (Task<T>) this.f38480OooO0O0.continueWith(this.f38479OooO00o, new o0OoOo0(callable));
            this.f38480OooO0O0 = task.continueWith(this.f38479OooO00o, new o00O0O());
        }
        return task;
    }

    public final <T> Task<T> OooO0OO(Callable<Task<T>> callable) {
        Task<T> task;
        synchronized (this.f38481OooO0OO) {
            task = (Task<T>) this.f38480OooO0O0.continueWithTask(this.f38479OooO00o, new o0OoOo0(callable));
            this.f38480OooO0O0 = task.continueWith(this.f38479OooO00o, new o00O0O());
        }
        return task;
    }
}

package p285o0O0OOoo;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OoOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Executor f42223OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Task<Void> f42224OooO0O0 = Tasks.forResult(null);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Object f42225OooO0OO = new Object();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ThreadLocal<Boolean> f42226OooO0Oo = new ThreadLocal<>();

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            o0OoOo0.this.f42226OooO0Oo.set(Boolean.TRUE);
        }
    }

    public o0OoOo0(Executor executor) {
        this.f42223OooO00o = executor;
        executor.execute(new OooO00o());
    }

    public final <T> Task<T> OooO00o(Callable<T> callable) {
        Task<T> task;
        synchronized (this.f42225OooO0OO) {
            task = (Task<T>) this.f42224OooO0O0.continueWith(this.f42223OooO00o, new o00Oo0(callable));
            this.f42224OooO0O0 = task.continueWith(this.f42223OooO00o, new o00Ooo());
        }
        return task;
    }

    public final <T> Task<T> OooO0O0(Callable<Task<T>> callable) {
        Task<T> task;
        synchronized (this.f42225OooO0OO) {
            task = (Task<T>) this.f42224OooO0O0.continueWithTask(this.f42223OooO00o, new o00Oo0(callable));
            this.f42224OooO0O0 = task.continueWith(this.f42223OooO00o, new o00Ooo());
        }
        return task;
    }
}

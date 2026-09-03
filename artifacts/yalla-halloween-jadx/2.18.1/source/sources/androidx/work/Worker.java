package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.common.util.concurrent.OooO0OO;
import p236o00oOoo.o00OOOO0;

/* JADX INFO: loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public o00OOOO0<ListenableWorker.OooO00o> f9746OoooO0;

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Worker.this.f9746OoooO0.OooOO0(Worker.this.OooO0oo());
            } catch (Throwable th) {
                Worker.this.f9746OoooO0.OooOO0O(th);
            }
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.ListenableWorker
    @NonNull
    public final OooO0OO<ListenableWorker.OooO00o> OooO0o0() {
        this.f9746OoooO0 = new o00OOOO0<>();
        this.f9728Oooo0oO.f9750OooO0OO.execute(new OooO00o());
        return this.f9746OoooO0;
    }

    @NonNull
    @WorkerThread
    public abstract ListenableWorker.OooO00o OooO0oo();
}

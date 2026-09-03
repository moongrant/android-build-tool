package p431o0OoOO0o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes4.dex */
public class o000000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o000000 f46841OooO00o;

    public static class OooO00o extends o000000 {

        /* JADX INFO: renamed from: o0OoOO0o.o000000$OooO00o$OooO00o, reason: collision with other inner class name */
        public static class ExecutorC0457OooO00o implements Executor {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final Handler f46842OooO0Oo = new Handler(Looper.getMainLooper());

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.f46842OooO0Oo.post(runnable);
            }
        }

        @Override // p431o0OoOO0o.o000000
        public final Executor OooO00o() {
            return new ExecutorC0457OooO00o();
        }
    }

    static {
        o000000 o000000Var;
        try {
            Class.forName("android.os.Build");
            o000000Var = new OooO00o();
        } catch (ClassNotFoundException unused) {
            o000000Var = new o000000();
        }
        f46841OooO00o = o000000Var;
    }

    public Executor OooO00o() {
        return Executors.newCachedThreadPool();
    }
}

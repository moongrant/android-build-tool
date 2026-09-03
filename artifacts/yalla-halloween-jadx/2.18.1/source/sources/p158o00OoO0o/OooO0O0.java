package p158o00OoO0o;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO0O0 f32362OooO00o;

    public static class OooO00o extends OooO0O0 {

        /* JADX INFO: renamed from: o00OoO0o.OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static class ExecutorC0347OooO00o implements Executor {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final Handler f32363Oooo0o = new Handler(Looper.getMainLooper());

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.f32363Oooo0o.post(runnable);
            }
        }

        @Override // p158o00OoO0o.OooO0O0
        public final Executor OooO00o() {
            return new ExecutorC0347OooO00o();
        }
    }

    static {
        OooO0O0 oooO0O0;
        try {
            Class.forName("android.os.Build");
            oooO0O0 = new OooO00o();
        } catch (ClassNotFoundException unused) {
            oooO0O0 = new OooO0O0();
        }
        f32362OooO00o = oooO0O0;
    }

    public Executor OooO00o() {
        return Executors.newCachedThreadPool();
    }
}

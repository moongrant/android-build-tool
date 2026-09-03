package o0OoO;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes4.dex */
public class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f45430OooO00o;

    /* JADX INFO: renamed from: o0OoO.OooO00o$OooO00o, reason: collision with other inner class name */
    public static class C0467OooO00o extends OooO00o {

        /* JADX INFO: renamed from: o0OoO.OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
        public static class ExecutorC0468OooO00o implements Executor {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final Handler f45431OooO0Oo = new Handler(Looper.getMainLooper());

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.f45431OooO0Oo.post(runnable);
            }
        }

        @Override // o0OoO.OooO00o
        public final Executor OooO00o() {
            return new ExecutorC0468OooO00o();
        }
    }

    static {
        OooO00o oooO00o;
        try {
            Class.forName("android.os.Build");
            oooO00o = new C0467OooO00o();
        } catch (ClassNotFoundException unused) {
            oooO00o = new OooO00o();
        }
        f45430OooO00o = oooO00o;
    }

    public Executor OooO00o() {
        return Executors.newCachedThreadPool();
    }
}

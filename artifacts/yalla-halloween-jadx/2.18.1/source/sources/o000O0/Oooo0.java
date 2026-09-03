package o000O0;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo0 implements ThreadFactory {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f28072OooO00o = "fonts-androidx";

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f28073OooO0O0 = 10;

    public static class OooO00o extends Thread {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final int f28074Oooo0o;

        public OooO00o(Runnable runnable, String str, int i) {
            super(runnable, str);
            this.f28074Oooo0o = i;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(this.f28074Oooo0o);
            super.run();
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new OooO00o(runnable, this.f28072OooO00o, this.f28073OooO0O0);
    }
}

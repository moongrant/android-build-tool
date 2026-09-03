package o0000O0;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo0 implements ThreadFactory {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f34077OooO00o = "fonts-androidx";

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f34078OooO0O0 = 10;

    public static class OooO00o extends Thread {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f34079OooO0Oo;

        public OooO00o(String str, int i, Runnable runnable) {
            super(runnable, str);
            this.f34079OooO0Oo = i;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(this.f34079OooO0Oo);
            super.run();
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new OooO00o(this.f34077OooO00o, this.f34078OooO0O0, runnable);
    }
}

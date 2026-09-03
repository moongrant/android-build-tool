package p260o00ooOoo;

import android.os.Process;

/* JADX INFO: loaded from: classes3.dex */
public final class ooo0Oo0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Runnable f40377OooO0Oo;

    public ooo0Oo0(Runnable runnable) {
        this.f40377OooO0Oo = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.f40377OooO0Oo.run();
    }
}

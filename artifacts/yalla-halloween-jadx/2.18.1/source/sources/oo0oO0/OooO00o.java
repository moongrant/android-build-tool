package oo0oO0;

import android.os.Process;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Runnable f53362Oooo0o;

    public OooO00o(Runnable runnable) {
        this.f53362Oooo0o = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.f53362Oooo0o.run();
    }
}

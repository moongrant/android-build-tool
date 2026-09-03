package o0OO00OO;

import android.os.Process;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o extends Thread {
    public OooO00o(ThreadGroup threadGroup) {
        super(threadGroup, "GmsDynamite");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(19);
        synchronized (this) {
            while (true) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }
}

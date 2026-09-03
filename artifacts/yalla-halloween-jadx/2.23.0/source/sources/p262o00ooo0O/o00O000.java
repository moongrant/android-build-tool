package p262o00ooo0O;

import android.os.Process;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O000 extends Thread {
    public o00O000(ThreadGroup threadGroup) {
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

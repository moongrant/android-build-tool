package p361o0OOOoOo;

import android.os.Process;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooOo implements Runnable {
    public abstract void OooO00o();

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        OooO00o();
    }
}

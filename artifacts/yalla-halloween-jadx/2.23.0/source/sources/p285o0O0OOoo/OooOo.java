package p285o0O0OOoo;

import android.os.Process;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OooOo implements Runnable {
    public abstract void OooO00o();

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        OooO00o();
    }
}

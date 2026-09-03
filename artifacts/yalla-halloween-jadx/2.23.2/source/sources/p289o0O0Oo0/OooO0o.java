package p289o0O0Oo0;

import android.os.Process;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OooO0o implements Runnable {
    public abstract void OooO00o();

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        OooO00o();
    }
}

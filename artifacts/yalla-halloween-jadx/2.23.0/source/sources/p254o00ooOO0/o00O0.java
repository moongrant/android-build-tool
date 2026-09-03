package p254o00ooOO0;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.api.internal.zaaw;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o00O0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zaaw f40939OooO0Oo;

    public /* synthetic */ o00O0(zaaw zaawVar) {
        this.f40939OooO0Oo = zaawVar;
    }

    @WorkerThread
    public abstract void OooO00o();

    @Override // java.lang.Runnable
    @WorkerThread
    public final void run() {
        zaaw zaawVar = this.f40939OooO0Oo;
        zaawVar.f14819OooO0O0.lock();
        try {
            if (Thread.interrupted()) {
                return;
            }
            OooO00o();
            return;
        } catch (RuntimeException e) {
            oo0oOO0 oo0ooo0 = zaawVar.f14818OooO00o.f14869OooO0oo;
            oo0ooo0.sendMessage(oo0ooo0.obtainMessage(2, e));
            return;
        } finally {
            zaawVar.f14819OooO0O0.unlock();
        }
        zaawVar.f14819OooO0O0.unlock();
    }
}

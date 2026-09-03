package p331o0O0oooO;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.api.internal.zaaw;
import com.google.android.gms.common.api.internal.zabi;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o0oO0Ooo implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ zaaw f37150Oooo0o;

    public /* synthetic */ o0oO0Ooo(zaaw zaawVar) {
        this.f37150Oooo0o = zaawVar;
    }

    @WorkerThread
    public abstract void OooO00o();

    @Override // java.lang.Runnable
    @WorkerThread
    public final void run() {
        this.f37150Oooo0o.f15320OooO0O0.lock();
        try {
            if (Thread.interrupted()) {
                return;
            }
            OooO00o();
        } catch (RuntimeException e) {
            zabi zabiVar = this.f37150Oooo0o.f15319OooO00o;
            zabiVar.f15372OooO0o0.sendMessage(zabiVar.f15372OooO0o0.obtainMessage(2, e));
        } finally {
            this.f37150Oooo0o.f15320OooO0O0.unlock();
        }
    }
}

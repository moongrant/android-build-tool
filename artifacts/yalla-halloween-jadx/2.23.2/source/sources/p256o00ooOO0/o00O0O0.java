package p256o00ooOO0;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.api.internal.zaaw;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o00O0O0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zaaw f40278OooO0Oo;

    public /* synthetic */ o00O0O0(zaaw zaawVar) {
        this.f40278OooO0Oo = zaawVar;
    }

    @WorkerThread
    public abstract void OooO00o();

    @Override // java.lang.Runnable
    @WorkerThread
    public final void run() {
        zaaw zaawVar = this.f40278OooO0Oo;
        zaawVar.f14343OooO0O0.lock();
        try {
            if (Thread.interrupted()) {
                return;
            }
            OooO00o();
            return;
        } catch (RuntimeException e) {
            o00OO000 o00oo001 = zaawVar.f14342OooO00o.f14393OooO0oo;
            o00oo001.sendMessage(o00oo001.obtainMessage(2, e));
            return;
        } finally {
            zaawVar.f14343OooO0O0.unlock();
        }
        zaawVar.f14343OooO0O0.unlock();
    }
}

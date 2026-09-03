package p084o000Ooo0;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p039OoooOoo.o00OO;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o implements ThreadFactory {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AtomicInteger f35095OooO00o = new AtomicInteger(0);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ boolean f35096OooO0O0;

    public OooO0o(boolean z) {
        this.f35096OooO0O0 = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        StringBuilder sbOooO00o = o00OO.OooO00o(this.f35096OooO0O0 ? "WM.task-" : "androidx.work-");
        sbOooO00o.append(this.f35095OooO00o.incrementAndGet());
        return new Thread(runnable, sbOooO00o.toString());
    }
}

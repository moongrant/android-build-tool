package p102o000oo;

import OooO00o.OooO00o;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 implements ThreadFactory {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AtomicInteger f29786OooO00o = new AtomicInteger(0);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ boolean f29787OooO0O0;

    public OooOO0(boolean z) {
        this.f29787OooO0O0 = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0(this.f29787OooO0O0 ? "WM.task-" : "androidx.work-");
        sbOooO0o0.append(this.f29786OooO00o.incrementAndGet());
        return new Thread(runnable, sbOooO0o0.toString());
    }
}

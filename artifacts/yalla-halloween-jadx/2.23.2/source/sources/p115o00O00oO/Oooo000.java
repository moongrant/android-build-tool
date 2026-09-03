package p115o00O00oO;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p039OoooOoo.o0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo000 implements ThreadFactory {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AtomicInteger f36141OooO00o = new AtomicInteger(0);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ boolean f36142OooO0O0;

    public Oooo000(boolean z) {
        this.f36142OooO0O0 = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        StringBuilder sbOooO00o = o0o0Oo.OooO00o(this.f36142OooO0O0 ? "WM.task-" : "androidx.work-");
        sbOooO00o.append(this.f36141OooO00o.incrementAndGet());
        return new Thread(runnable, sbOooO00o.toString());
    }
}

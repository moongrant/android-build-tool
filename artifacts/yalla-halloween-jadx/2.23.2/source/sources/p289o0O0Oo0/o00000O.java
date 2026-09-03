package p289o0O0Oo0;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class o00000O implements ThreadFactory {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ String f41501OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ AtomicLong f41502OooO0O0;

    public class OooO00o extends OooO0o {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Runnable f41503OooO0Oo;

        public OooO00o(Runnable runnable) {
            this.f41503OooO0Oo = runnable;
        }

        @Override // p289o0O0Oo0.OooO0o
        public final void OooO00o() {
            this.f41503OooO0Oo.run();
        }
    }

    public o00000O(String str, AtomicLong atomicLong) {
        this.f41501OooO00o = str;
        this.f41502OooO0O0 = atomicLong;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = Executors.defaultThreadFactory().newThread(new OooO00o(runnable));
        threadNewThread.setName(this.f41501OooO00o + this.f41502OooO0O0.getAndIncrement());
        return threadNewThread;
    }
}

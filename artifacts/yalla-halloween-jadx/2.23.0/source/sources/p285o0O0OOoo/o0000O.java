package p285o0O0OOoo;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000O implements ThreadFactory {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ String f42123OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ AtomicLong f42124OooO0O0;

    public class OooO00o extends OooOo {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Runnable f42125OooO0Oo;

        public OooO00o(Runnable runnable) {
            this.f42125OooO0Oo = runnable;
        }

        @Override // p285o0O0OOoo.OooOo
        public final void OooO00o() {
            this.f42125OooO0Oo.run();
        }
    }

    public o0000O(String str, AtomicLong atomicLong) {
        this.f42123OooO00o = str;
        this.f42124OooO0O0 = atomicLong;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = Executors.defaultThreadFactory().newThread(new OooO00o(runnable));
        threadNewThread.setName(this.f42123OooO00o + this.f42124OooO0O0.getAndIncrement());
        return threadNewThread;
    }
}

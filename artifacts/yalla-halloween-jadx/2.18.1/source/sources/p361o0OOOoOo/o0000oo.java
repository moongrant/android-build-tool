package p361o0OOOoOo;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000oo implements ThreadFactory {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ String f38457OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ AtomicLong f38458OooO0O0;

    public class OooO00o extends OooOo {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Runnable f38459Oooo0o;

        public OooO00o(Runnable runnable) {
            this.f38459Oooo0o = runnable;
        }

        @Override // p361o0OOOoOo.OooOo
        public final void OooO00o() {
            this.f38459Oooo0o.run();
        }
    }

    public o0000oo(String str, AtomicLong atomicLong) {
        this.f38457OooO00o = str;
        this.f38458OooO0O0 = atomicLong;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = Executors.defaultThreadFactory().newThread(new OooO00o(runnable));
        threadNewThread.setName(this.f38457OooO00o + this.f38458OooO0O0.getAndIncrement());
        return threadNewThread;
    }
}

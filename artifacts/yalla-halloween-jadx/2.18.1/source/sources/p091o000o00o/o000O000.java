package p091o000o00o;

import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class o000O000 implements Executor {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Executor f29206Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final ArrayDeque<Runnable> f29207Oooo0oO = new ArrayDeque<>();

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public Runnable f29208Oooo0oo;

    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Runnable f29209Oooo0o;

        public OooO00o(Runnable runnable) {
            this.f29209Oooo0o = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f29209Oooo0o.run();
            } finally {
                o000O000.this.OooO00o();
            }
        }
    }

    public o000O000(@NonNull Executor executor) {
        this.f29206Oooo0o = executor;
    }

    public final synchronized void OooO00o() {
        Runnable runnablePoll = this.f29207Oooo0oO.poll();
        this.f29208Oooo0oo = runnablePoll;
        if (runnablePoll != null) {
            this.f29206Oooo0o.execute(runnablePoll);
        }
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        this.f29207Oooo0oO.offer(new OooO00o(runnable));
        if (this.f29208Oooo0oo == null) {
            OooO00o();
        }
    }
}

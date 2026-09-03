package p033OoooO0O;

import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0O0O00 implements Executor {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Executor f1422OooO0o0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @GuardedBy("mQueue")
    public final ArrayDeque f1420OooO0Oo = new ArrayDeque();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO0O0 f1421OooO0o = new OooO0O0();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @GuardedBy("mQueue")
    public OooO0OO f1423OooO0oO = OooO0OO.IDLE;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @GuardedBy("mQueue")
    public long f1424OooO0oo = 0;

    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Runnable f1425OooO0Oo;

        public OooO00o(Runnable runnable) {
            this.f1425OooO0Oo = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f1425OooO0Oo.run();
        }
    }

    public final class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
        
            if (r1 == false) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
        
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
        
            r3.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
        
            p028Oooo0oO.o00O0O0.OooO0OO("SequentialExecutor", "Exception while executing runnable " + r3, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void OooO00o() {
            boolean z = false;
            boolean zInterrupted = false;
            while (true) {
                try {
                    synchronized (o0O0O00.this.f1420OooO0Oo) {
                        if (!z) {
                            o0O0O00 o0o0o00 = o0O0O00.this;
                            OooO0OO oooO0OO = o0o0o00.f1423OooO0oO;
                            OooO0OO oooO0OO2 = OooO0OO.RUNNING;
                            if (oooO0OO != oooO0OO2) {
                                o0o0o00.f1424OooO0oo++;
                                o0o0o00.f1423OooO0oO = oooO0OO2;
                                z = true;
                            }
                        }
                        Runnable runnable = (Runnable) o0O0O00.this.f1420OooO0Oo.poll();
                        if (runnable == null) {
                            o0O0O00.this.f1423OooO0oO = OooO0OO.IDLE;
                        }
                    }
                    if (zInterrupted) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (zInterrupted) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                OooO00o();
            } catch (Error e) {
                synchronized (o0O0O00.this.f1420OooO0Oo) {
                    o0O0O00.this.f1423OooO0oO = OooO0OO.IDLE;
                    throw e;
                }
            }
        }
    }

    public enum OooO0OO {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    public o0O0O00(Executor executor) {
        executor.getClass();
        this.f1422OooO0o0 = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        OooO0OO oooO0OO;
        runnable.getClass();
        synchronized (this.f1420OooO0Oo) {
            OooO0OO oooO0OO2 = this.f1423OooO0oO;
            if (oooO0OO2 != OooO0OO.RUNNING && oooO0OO2 != (oooO0OO = OooO0OO.QUEUED)) {
                long j = this.f1424OooO0oo;
                OooO00o oooO00o = new OooO00o(runnable);
                this.f1420OooO0Oo.add(oooO00o);
                OooO0OO oooO0OO3 = OooO0OO.QUEUING;
                this.f1423OooO0oO = oooO0OO3;
                boolean z = true;
                try {
                    this.f1422OooO0o0.execute(this.f1421OooO0o);
                    if (this.f1423OooO0oO != oooO0OO3) {
                        return;
                    }
                    synchronized (this.f1420OooO0Oo) {
                        if (this.f1424OooO0oo == j && this.f1423OooO0oO == oooO0OO3) {
                            this.f1423OooO0oO = oooO0OO;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.f1420OooO0Oo) {
                        OooO0OO oooO0OO4 = this.f1423OooO0oO;
                        if ((oooO0OO4 != OooO0OO.IDLE && oooO0OO4 != OooO0OO.QUEUING) || !this.f1420OooO0Oo.removeLastOccurrence(oooO00o)) {
                            z = false;
                        }
                        if (!(e instanceof RejectedExecutionException) || z) {
                            throw e;
                        }
                    }
                    return;
                }
            }
            this.f1420OooO0Oo.add(runnable);
        }
    }
}

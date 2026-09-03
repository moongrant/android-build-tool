package o0O0OOOo;

import androidx.annotation.GuardedBy;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Oo0 implements Executor {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final Logger f41414OooO = Logger.getLogger(o00Oo0.class.getName());

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Executor f41415OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @GuardedBy("queue")
    public final ArrayDeque f41417OooO0o0 = new ArrayDeque();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @GuardedBy("queue")
    public OooO0OO f41416OooO0o = OooO0OO.IDLE;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @GuardedBy("queue")
    public long f41418OooO0oO = 0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooO0O0 f41419OooO0oo = new OooO0O0();

    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Runnable f41420OooO0Oo;

        public OooO00o(Runnable runnable) {
            this.f41420OooO0Oo = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f41420OooO0Oo.run();
        }

        public final String toString() {
            return this.f41420OooO0Oo.toString();
        }
    }

    public final class OooO0O0 implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @CheckForNull
        public Runnable f41421OooO0Oo;

        public OooO0O0() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
        
            if (r1 == false) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
        
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
        
            r9.f41421OooO0Oo.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0055, code lost:
        
            o0O0OOOo.o00Oo0.f41414OooO.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r9.f41421OooO0Oo, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0072, code lost:
        
            r9.f41421OooO0Oo = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
        
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
                    synchronized (o00Oo0.this.f41417OooO0o0) {
                        if (!z) {
                            o00Oo0 o00oo1 = o00Oo0.this;
                            OooO0OO oooO0OO = o00oo1.f41416OooO0o;
                            OooO0OO oooO0OO2 = OooO0OO.RUNNING;
                            if (oooO0OO != oooO0OO2) {
                                o00oo1.f41418OooO0oO++;
                                o00oo1.f41416OooO0o = oooO0OO2;
                                z = true;
                            }
                        }
                        Runnable runnable = (Runnable) o00Oo0.this.f41417OooO0o0.poll();
                        this.f41421OooO0Oo = runnable;
                        if (runnable == null) {
                            o00Oo0.this.f41416OooO0o = OooO0OO.IDLE;
                        }
                    }
                    if (zInterrupted) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                    this.f41421OooO0Oo = null;
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
                synchronized (o00Oo0.this.f41417OooO0o0) {
                    o00Oo0.this.f41416OooO0o = OooO0OO.IDLE;
                    throw e;
                }
            }
        }

        public final String toString() {
            Runnable runnable = this.f41421OooO0Oo;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + o00Oo0.this.f41416OooO0o + "}";
        }
    }

    public enum OooO0OO {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    public o00Oo0(Executor executor) {
        this.f41415OooO0Oo = (Executor) Preconditions.checkNotNull(executor);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        OooO0OO oooO0OO;
        Preconditions.checkNotNull(runnable);
        synchronized (this.f41417OooO0o0) {
            OooO0OO oooO0OO2 = this.f41416OooO0o;
            if (oooO0OO2 != OooO0OO.RUNNING && oooO0OO2 != (oooO0OO = OooO0OO.QUEUED)) {
                long j = this.f41418OooO0oO;
                OooO00o oooO00o = new OooO00o(runnable);
                this.f41417OooO0o0.add(oooO00o);
                OooO0OO oooO0OO3 = OooO0OO.QUEUING;
                this.f41416OooO0o = oooO0OO3;
                boolean z = true;
                try {
                    this.f41415OooO0Oo.execute(this.f41419OooO0oo);
                    if (this.f41416OooO0o != oooO0OO3) {
                        return;
                    }
                    synchronized (this.f41417OooO0o0) {
                        if (this.f41418OooO0oO == j && this.f41416OooO0o == oooO0OO3) {
                            this.f41416OooO0o = oooO0OO;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.f41417OooO0o0) {
                        OooO0OO oooO0OO4 = this.f41416OooO0o;
                        if ((oooO0OO4 != OooO0OO.IDLE && oooO0OO4 != OooO0OO.QUEUING) || !this.f41417OooO0o0.removeLastOccurrence(oooO00o)) {
                            z = false;
                        }
                        if (!(e instanceof RejectedExecutionException) || z) {
                            throw e;
                        }
                    }
                    return;
                }
            }
            this.f41417OooO0o0.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f41415OooO0Oo + "}";
    }
}

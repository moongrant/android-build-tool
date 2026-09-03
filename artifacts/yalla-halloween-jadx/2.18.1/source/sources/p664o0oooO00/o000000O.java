package p664o0oooO00;

import com.qiniu.android.http.ResponseInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p659o0ooo0o.o00OO;
import p659o0ooo0o.o00OOO00;

/* JADX INFO: loaded from: classes3.dex */
public final class o000000O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public static final Logger f51824OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o000000O f51825OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final OooO0O0 f51826OooOO0 = new OooO0O0();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f51827OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f51828OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public long f51829OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<o000000> f51830OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO0o f51831OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final List<o000000> f51832OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final OooO00o f51833OooO0oO;

    public interface OooO00o {
        void OooO00o(@NotNull o000000O o000000o2, long j);

        void OooO0O0(@NotNull o000000O o000000o2);

        void execute(@NotNull Runnable runnable);

        long nanoTime();
    }

    public static final class OooO0O0 {
    }

    public static final class OooO0OO implements OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ThreadPoolExecutor f51834OooO00o;

        public OooO0OO(@NotNull ThreadFactory threadFactory) {
            Intrinsics.checkNotNullParameter(threadFactory, "threadFactory");
            this.f51834OooO00o = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // o0oooO00.o000000O.OooO00o
        public final void OooO00o(@NotNull o000000O taskRunner, long j) throws InterruptedException {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            long j2 = j / 1000000;
            long j3 = j - (1000000 * j2);
            if (j2 > 0 || j > 0) {
                taskRunner.wait(j2, (int) j3);
            }
        }

        @Override // o0oooO00.o000000O.OooO00o
        public final void OooO0O0(@NotNull o000000O taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // o0oooO00.o000000O.OooO00o
        public final void execute(@NotNull Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.f51834OooO00o.execute(runnable);
        }

        @Override // o0oooO00.o000000O.OooO00o
        public final long nanoTime() {
            return System.nanoTime();
        }
    }

    public static final class OooO0o implements Runnable {
        public OooO0o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            oo0o0Oo oo0o0ooOooO0OO;
            while (true) {
                synchronized (o000000O.this) {
                    oo0o0ooOooO0OO = o000000O.this.OooO0OO();
                }
                if (oo0o0ooOooO0OO == null) {
                    return;
                }
                o000000 o000000Var = oo0o0ooOooO0OO.f51837OooO00o;
                Intrinsics.checkNotNull(o000000Var);
                long jNanoTime = -1;
                OooO0O0 oooO0O0 = o000000O.f51826OooOO0;
                boolean zIsLoggable = o000000O.f51824OooO.isLoggable(Level.FINE);
                if (zIsLoggable) {
                    jNanoTime = o000000Var.f51823OooO0o0.f51833OooO0oO.nanoTime();
                    o0O0O00.OooO00o(oo0o0ooOooO0OO, o000000Var, "starting");
                }
                try {
                    o000000O.OooO00o(o000000O.this, oo0o0ooOooO0OO);
                    try {
                        Unit unit = Unit.INSTANCE;
                        if (zIsLoggable) {
                            long jNanoTime2 = o000000Var.f51823OooO0o0.f51833OooO0oO.nanoTime() - jNanoTime;
                            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("finished run in ");
                            sbOooO0o0.append(o0O0O00.OooO0O0(jNanoTime2));
                            o0O0O00.OooO00o(oo0o0ooOooO0OO, o000000Var, sbOooO0o0.toString());
                        }
                    } catch (Throwable th) {
                        if (zIsLoggable) {
                            long jNanoTime3 = o000000Var.f51823OooO0o0.f51833OooO0oO.nanoTime() - jNanoTime;
                            StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("failed a run in ");
                            sbOooO0o1.append(o0O0O00.OooO0O0(jNanoTime3));
                            o0O0O00.OooO00o(oo0o0ooOooO0OO, o000000Var, sbOooO0o1.toString());
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    o000000O.this.f51833OooO0oO.execute(this);
                    throw th2;
                }
            }
        }
    }

    static {
        String name = o00OOO00.f51189OooO0oO + " TaskRunner";
        Intrinsics.checkNotNullParameter(name, "name");
        f51825OooO0oo = new o000000O(new OooO0OO(new o00OO(name, true)));
        Logger logger = Logger.getLogger(o000000O.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "Logger.getLogger(TaskRunner::class.java.name)");
        f51824OooO = logger;
    }

    public o000000O(@NotNull OooO00o backend) {
        Intrinsics.checkNotNullParameter(backend, "backend");
        this.f51833OooO0oO = backend;
        this.f51827OooO00o = ResponseInfo.UnknownError;
        this.f51830OooO0Oo = new ArrayList();
        this.f51832OooO0o0 = new ArrayList();
        this.f51831OooO0o = new OooO0o();
    }

    public static final void OooO00o(o000000O o000000o2, oo0o0Oo oo0o0oo) {
        Objects.requireNonNull(o000000o2);
        byte[] bArr = o00OOO00.f51183OooO00o;
        Thread currentThread = Thread.currentThread();
        Intrinsics.checkNotNullExpressionValue(currentThread, "currentThread");
        String name = currentThread.getName();
        currentThread.setName(oo0o0oo.f51839OooO0OO);
        try {
            long jOooO00o = oo0o0oo.OooO00o();
            synchronized (o000000o2) {
                o000000o2.OooO0O0(oo0o0oo, jOooO00o);
                Unit unit = Unit.INSTANCE;
            }
        } finally {
            synchronized (o000000o2) {
                o000000o2.OooO0O0(oo0o0oo, -1L);
                Unit unit2 = Unit.INSTANCE;
                currentThread.setName(name);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList, java.util.List<o0oooO00.o000000>] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList, java.util.List<o0oooO00.oo0o0Oo>] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.ArrayList, java.util.List<o0oooO00.o000000>] */
    public final void OooO0O0(oo0o0Oo oo0o0oo, long j) {
        byte[] bArr = o00OOO00.f51183OooO00o;
        o000000 o000000Var = oo0o0oo.f51837OooO00o;
        Intrinsics.checkNotNull(o000000Var);
        if (!(o000000Var.f51819OooO0O0 == oo0o0oo)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        boolean z = o000000Var.f51821OooO0Oo;
        o000000Var.f51821OooO0Oo = false;
        o000000Var.f51819OooO0O0 = null;
        this.f51830OooO0Oo.remove(o000000Var);
        if (j != -1 && !z && !o000000Var.f51818OooO00o) {
            o000000Var.OooO0o0(oo0o0oo, j, true);
        }
        if (!o000000Var.f51820OooO0OO.isEmpty()) {
            this.f51832OooO0o0.add(o000000Var);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<o0oooO00.o000000>] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.ArrayList, java.util.List<o0oooO00.o000000>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<o0oooO00.o000000>] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.ArrayList, java.util.List<o0oooO00.oo0o0Oo>] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<o0oooO00.o000000>] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList, java.util.List<o0oooO00.o000000>] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.ArrayList, java.util.List<o0oooO00.oo0o0Oo>] */
    @Nullable
    public final oo0o0Oo OooO0OO() {
        boolean z;
        byte[] bArr = o00OOO00.f51183OooO00o;
        while (!this.f51832OooO0o0.isEmpty()) {
            long jNanoTime = this.f51833OooO0oO.nanoTime();
            long jMin = Long.MAX_VALUE;
            Iterator it = this.f51832OooO0o0.iterator();
            oo0o0Oo oo0o0oo = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                oo0o0Oo oo0o0oo2 = (oo0o0Oo) ((o000000) it.next()).f51820OooO0OO.get(0);
                long jMax = Math.max(0L, oo0o0oo2.f51838OooO0O0 - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (oo0o0oo != null) {
                        z = true;
                        break;
                    }
                    oo0o0oo = oo0o0oo2;
                }
            }
            if (oo0o0oo != null) {
                byte[] bArr2 = o00OOO00.f51183OooO00o;
                oo0o0oo.f51838OooO0O0 = -1L;
                o000000 o000000Var = oo0o0oo.f51837OooO00o;
                Intrinsics.checkNotNull(o000000Var);
                o000000Var.f51820OooO0OO.remove(oo0o0oo);
                this.f51832OooO0o0.remove(o000000Var);
                o000000Var.f51819OooO0O0 = oo0o0oo;
                this.f51830OooO0Oo.add(o000000Var);
                if (z || (!this.f51828OooO0O0 && (!this.f51832OooO0o0.isEmpty()))) {
                    this.f51833OooO0oO.execute(this.f51831OooO0o);
                }
                return oo0o0oo;
            }
            if (this.f51828OooO0O0) {
                if (jMin < this.f51829OooO0OO - jNanoTime) {
                    this.f51833OooO0oO.OooO0O0(this);
                }
                return null;
            }
            this.f51828OooO0O0 = true;
            this.f51829OooO0OO = jNanoTime + jMin;
            try {
                try {
                    this.f51833OooO0oO.OooO00o(this, jMin);
                } catch (InterruptedException unused) {
                    OooO0Oo();
                }
                this.f51828OooO0O0 = false;
            } catch (Throwable th) {
                this.f51828OooO0O0 = false;
                throw th;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<o0oooO00.o000000>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<o0oooO00.o000000>] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<o0oooO00.o000000>] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList, java.util.List<o0oooO00.oo0o0Oo>] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList, java.util.List<o0oooO00.o000000>] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList, java.util.List<o0oooO00.o000000>] */
    public final void OooO0Oo() {
        int size = this.f51830OooO0Oo.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else {
                ((o000000) this.f51830OooO0Oo.get(size)).OooO0O0();
            }
        }
        int size2 = this.f51832OooO0o0.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            }
            o000000 o000000Var = (o000000) this.f51832OooO0o0.get(size2);
            o000000Var.OooO0O0();
            if (o000000Var.f51820OooO0OO.isEmpty()) {
                this.f51832OooO0o0.remove(size2);
            }
        }
    }

    @NotNull
    public final o000000 OooO0o() {
        int i;
        synchronized (this) {
            i = this.f51827OooO00o;
            this.f51827OooO00o = i + 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('Q');
        sb.append(i);
        return new o000000(this, sb.toString());
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<o0oooO00.oo0o0Oo>] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList, java.util.List<o0oooO00.o000000>] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.ArrayList, java.util.List, java.util.List<o0oooO00.o000000>] */
    public final void OooO0o0(@NotNull o000000 taskQueue) {
        Intrinsics.checkNotNullParameter(taskQueue, "taskQueue");
        byte[] bArr = o00OOO00.f51183OooO00o;
        if (taskQueue.f51819OooO0O0 == null) {
            if (!taskQueue.f51820OooO0OO.isEmpty()) {
                ?? addIfAbsent = this.f51832OooO0o0;
                Intrinsics.checkNotNullParameter(addIfAbsent, "$this$addIfAbsent");
                if (!addIfAbsent.contains(taskQueue)) {
                    addIfAbsent.add(taskQueue);
                }
            } else {
                this.f51832OooO0o0.remove(taskQueue);
            }
        }
        if (this.f51828OooO0O0) {
            this.f51833OooO0oO.OooO0O0(this);
        } else {
            this.f51833OooO0oO.execute(this.f51831OooO0o);
        }
    }
}

package p639o0ooOO0o;

import androidx.compose.animation.core.AnimationKt;
import com.qiniu.android.http.ResponseInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p635o0ooO0oo.o0O000o0;
import p635o0ooO0oo.o0OoOoOo;

/* JADX INFO: loaded from: classes5.dex */
public final class o00OO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public static final Logger f57440OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o00OO0O0 f57441OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooO00o f57442OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f57443OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f57444OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f57445OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final ArrayList f57446OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final ArrayList f57447OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final o00OO0OO f57448OooO0oO;

    public interface OooO00o {
        void OooO00o(@NotNull o00OO0O0 o00oo0o1, long j);

        void OooO0O0(@NotNull o00OO0O0 o00oo0o1);

        void execute(@NotNull Runnable runnable);

        long nanoTime();
    }

    public static final class OooO0O0 implements OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final ThreadPoolExecutor f57449OooO00o;

        public OooO0O0(@NotNull o0OoOoOo threadFactory) {
            Intrinsics.checkNotNullParameter(threadFactory, "threadFactory");
            this.f57449OooO00o = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // o0ooOO0o.o00OO0O0.OooO00o
        public final void OooO00o(@NotNull o00OO0O0 taskRunner, long j) throws InterruptedException {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            long j2 = j / AnimationKt.MillisToNanos;
            long j3 = j - (AnimationKt.MillisToNanos * j2);
            if (j2 > 0 || j > 0) {
                taskRunner.wait(j2, (int) j3);
            }
        }

        @Override // o0ooOO0o.o00OO0O0.OooO00o
        public final void OooO0O0(@NotNull o00OO0O0 taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // o0ooOO0o.o00OO0O0.OooO00o
        public final void execute(@NotNull Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.f57449OooO00o.execute(runnable);
        }

        @Override // o0ooOO0o.o00OO0O0.OooO00o
        public final long nanoTime() {
            return System.nanoTime();
        }
    }

    static {
        String name = Intrinsics.stringPlus(o0O000o0.f57392OooO0oO, " TaskRunner");
        Intrinsics.checkNotNullParameter(name, "name");
        f57441OooO0oo = new o00OO0O0(new OooO0O0(new o0OoOoOo(name, true)));
        Logger logger = Logger.getLogger(o00OO0O0.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(TaskRunner::class.java.name)");
        f57440OooO = logger;
    }

    public o00OO0O0(@NotNull OooO0O0 backend) {
        Intrinsics.checkNotNullParameter(backend, "backend");
        this.f57442OooO00o = backend;
        this.f57443OooO0O0 = ResponseInfo.UnknownError;
        this.f57447OooO0o0 = new ArrayList();
        this.f57446OooO0o = new ArrayList();
        this.f57448OooO0oO = new o00OO0OO(this);
    }

    public static final void OooO00o(o00OO0O0 o00oo0o1, oo0oOO0 oo0ooo0) {
        o00oo0o1.getClass();
        byte[] bArr = o0O000o0.f57386OooO00o;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(oo0ooo0.f57451OooO00o);
        try {
            long jOooO00o = oo0ooo0.OooO00o();
            synchronized (o00oo0o1) {
                o00oo0o1.OooO0O0(oo0ooo0, jOooO00o);
                Unit unit = Unit.INSTANCE;
            }
        } finally {
            synchronized (o00oo0o1) {
                o00oo0o1.OooO0O0(oo0ooo0, -1L);
                Unit unit2 = Unit.INSTANCE;
                threadCurrentThread.setName(name);
            }
        }
    }

    public final void OooO0O0(oo0oOO0 oo0ooo0, long j) {
        byte[] bArr = o0O000o0.f57386OooO00o;
        o00OO00O o00oo00o = oo0ooo0.f57453OooO0OO;
        Intrinsics.checkNotNull(o00oo00o);
        if (!(o00oo00o.f57437OooO0Oo == oo0ooo0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        boolean z = o00oo00o.f57438OooO0o;
        o00oo00o.f57438OooO0o = false;
        o00oo00o.f57437OooO0Oo = null;
        this.f57447OooO0o0.remove(o00oo00o);
        if (j != -1 && !z && !o00oo00o.f57436OooO0OO) {
            o00oo00o.OooO0Oo(oo0ooo0, j, true);
        }
        if (!o00oo00o.f57439OooO0o0.isEmpty()) {
            this.f57446OooO0o.add(o00oo00o);
        }
    }

    @Nullable
    public final oo0oOO0 OooO0OO() {
        long j;
        boolean z;
        byte[] bArr = o0O000o0.f57386OooO00o;
        while (true) {
            ArrayList arrayList = this.f57446OooO0o;
            if (arrayList.isEmpty()) {
                return null;
            }
            OooO00o oooO00o = this.f57442OooO00o;
            long jNanoTime = oooO00o.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = LongCompanionObject.MAX_VALUE;
            oo0oOO0 oo0ooo0 = null;
            while (true) {
                if (!it.hasNext()) {
                    j = jNanoTime;
                    z = false;
                    break;
                }
                oo0oOO0 oo0ooo1 = (oo0oOO0) ((o00OO00O) it.next()).f57439OooO0o0.get(0);
                j = jNanoTime;
                long jMax = Math.max(0L, oo0ooo1.f57454OooO0Oo - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (oo0ooo0 != null) {
                        z = true;
                        break;
                    }
                    oo0ooo0 = oo0ooo1;
                }
                jNanoTime = j;
            }
            if (oo0ooo0 != null) {
                byte[] bArr2 = o0O000o0.f57386OooO00o;
                oo0ooo0.f57454OooO0Oo = -1L;
                o00OO00O o00oo00o = oo0ooo0.f57453OooO0OO;
                Intrinsics.checkNotNull(o00oo00o);
                o00oo00o.f57439OooO0o0.remove(oo0ooo0);
                arrayList.remove(o00oo00o);
                o00oo00o.f57437OooO0Oo = oo0ooo0;
                this.f57447OooO0o0.add(o00oo00o);
                if (z || (!this.f57444OooO0OO && (!arrayList.isEmpty()))) {
                    oooO00o.execute(this.f57448OooO0oO);
                }
                return oo0ooo0;
            }
            if (this.f57444OooO0OO) {
                if (jMin >= this.f57445OooO0Oo - j) {
                    return null;
                }
                oooO00o.OooO0O0(this);
                return null;
            }
            this.f57444OooO0OO = true;
            this.f57445OooO0Oo = j + jMin;
            try {
                try {
                    oooO00o.OooO00o(this, jMin);
                } catch (InterruptedException unused) {
                    OooO0Oo();
                }
                this.f57444OooO0OO = false;
            } catch (Throwable th) {
                this.f57444OooO0OO = false;
                throw th;
            }
        }
    }

    public final void OooO0Oo() {
        ArrayList arrayList = this.f57447OooO0o0;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                ((o00OO00O) arrayList.get(size)).OooO0O0();
                if (i < 0) {
                    break;
                } else {
                    size = i;
                }
            }
        }
        ArrayList arrayList2 = this.f57446OooO0o;
        int size2 = arrayList2.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i2 = size2 - 1;
            o00OO00O o00oo00o = (o00OO00O) arrayList2.get(size2);
            o00oo00o.OooO0O0();
            if (o00oo00o.f57439OooO0o0.isEmpty()) {
                arrayList2.remove(size2);
            }
            if (i2 < 0) {
                return;
            } else {
                size2 = i2;
            }
        }
    }

    @NotNull
    public final o00OO00O OooO0o() {
        int i;
        synchronized (this) {
            i = this.f57443OooO0O0;
            this.f57443OooO0O0 = i + 1;
        }
        return new o00OO00O(this, Intrinsics.stringPlus("Q", Integer.valueOf(i)));
    }

    public final void OooO0o0(@NotNull o00OO00O taskQueue) {
        Intrinsics.checkNotNullParameter(taskQueue, "taskQueue");
        byte[] bArr = o0O000o0.f57386OooO00o;
        if (taskQueue.f57437OooO0Oo == null) {
            boolean z = !taskQueue.f57439OooO0o0.isEmpty();
            ArrayList arrayList = this.f57446OooO0o;
            if (z) {
                Intrinsics.checkNotNullParameter(arrayList, "<this>");
                if (!arrayList.contains(taskQueue)) {
                    arrayList.add(taskQueue);
                }
            } else {
                arrayList.remove(taskQueue);
            }
        }
        boolean z2 = this.f57444OooO0OO;
        OooO00o oooO00o = this.f57442OooO00o;
        if (z2) {
            oooO00o.OooO0O0(this);
        } else {
            oooO00o.execute(this.f57448OooO0oO);
        }
    }
}

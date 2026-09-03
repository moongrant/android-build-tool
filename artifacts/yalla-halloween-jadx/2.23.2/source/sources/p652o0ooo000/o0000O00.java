package p652o0ooo000;

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
import p648o0ooOoo.oO000Oo0;
import p648o0ooOoo.oO000o00;

/* JADX INFO: loaded from: classes5.dex */
public final class o0000O00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public static final Logger f59286OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o0000O00 f59287OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooO00o f59288OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f59289OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f59290OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f59291OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final ArrayList f59292OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final ArrayList f59293OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final o0000oo f59294OooO0oO;

    public interface OooO00o {
        void OooO00o(@NotNull o0000O00 o0000o00);

        void OooO0O0(@NotNull o0000O00 o0000o00, long j);

        void execute(@NotNull Runnable runnable);

        long nanoTime();
    }

    public static final class OooO0O0 implements OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final ThreadPoolExecutor f59295OooO00o;

        public OooO0O0(@NotNull oO000Oo0 threadFactory) {
            Intrinsics.checkNotNullParameter(threadFactory, "threadFactory");
            this.f59295OooO00o = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // o0ooo000.o0000O00.OooO00o
        public final void OooO00o(@NotNull o0000O00 taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // o0ooo000.o0000O00.OooO00o
        public final void OooO0O0(@NotNull o0000O00 taskRunner, long j) throws InterruptedException {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            long j2 = j / AnimationKt.MillisToNanos;
            long j3 = j - (AnimationKt.MillisToNanos * j2);
            if (j2 > 0 || j > 0) {
                taskRunner.wait(j2, (int) j3);
            }
        }

        @Override // o0ooo000.o0000O00.OooO00o
        public final void execute(@NotNull Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.f59295OooO00o.execute(runnable);
        }

        @Override // o0ooo000.o0000O00.OooO00o
        public final long nanoTime() {
            return System.nanoTime();
        }
    }

    static {
        String name = Intrinsics.stringPlus(oO000o00.f58130OooO0oO, " TaskRunner");
        Intrinsics.checkNotNullParameter(name, "name");
        f59287OooO0oo = new o0000O00(new OooO0O0(new oO000Oo0(name, true)));
        Logger logger = Logger.getLogger(o0000O00.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(TaskRunner::class.java.name)");
        f59286OooO = logger;
    }

    public o0000O00(@NotNull OooO0O0 backend) {
        Intrinsics.checkNotNullParameter(backend, "backend");
        this.f59288OooO00o = backend;
        this.f59289OooO0O0 = ResponseInfo.UnknownError;
        this.f59293OooO0o0 = new ArrayList();
        this.f59292OooO0o = new ArrayList();
        this.f59294OooO0oO = new o0000oo(this);
    }

    public static final void OooO00o(o0000O00 o0000o00, o00000O o00000o) {
        o0000o00.getClass();
        byte[] bArr = oO000o00.f58124OooO00o;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(o00000o.f59282OooO00o);
        try {
            long jOooO00o = o00000o.OooO00o();
            synchronized (o0000o00) {
                o0000o00.OooO0O0(o00000o, jOooO00o);
                Unit unit = Unit.INSTANCE;
            }
        } finally {
            synchronized (o0000o00) {
                o0000o00.OooO0O0(o00000o, -1L);
                Unit unit2 = Unit.INSTANCE;
                threadCurrentThread.setName(name);
            }
        }
    }

    public final void OooO0O0(o00000O o00000o, long j) {
        byte[] bArr = oO000o00.f58124OooO00o;
        o0000 o0000Var = o00000o.f59284OooO0OO;
        Intrinsics.checkNotNull(o0000Var);
        if (!(o0000Var.f59279OooO0Oo == o00000o)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        boolean z = o0000Var.f59280OooO0o;
        o0000Var.f59280OooO0o = false;
        o0000Var.f59279OooO0Oo = null;
        this.f59293OooO0o0.remove(o0000Var);
        if (j != -1 && !z && !o0000Var.f59278OooO0OO) {
            o0000Var.OooO0Oo(o00000o, j, true);
        }
        if (!o0000Var.f59281OooO0o0.isEmpty()) {
            this.f59292OooO0o.add(o0000Var);
        }
    }

    @Nullable
    public final o00000O OooO0OO() {
        long j;
        boolean z;
        byte[] bArr = oO000o00.f58124OooO00o;
        while (true) {
            ArrayList arrayList = this.f59292OooO0o;
            if (arrayList.isEmpty()) {
                return null;
            }
            OooO00o oooO00o = this.f59288OooO00o;
            long jNanoTime = oooO00o.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = LongCompanionObject.MAX_VALUE;
            o00000O o00000o = null;
            while (true) {
                if (!it.hasNext()) {
                    j = jNanoTime;
                    z = false;
                    break;
                }
                o00000O o00000o2 = (o00000O) ((o0000) it.next()).f59281OooO0o0.get(0);
                j = jNanoTime;
                long jMax = Math.max(0L, o00000o2.f59285OooO0Oo - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (o00000o != null) {
                        z = true;
                        break;
                    }
                    o00000o = o00000o2;
                }
                jNanoTime = j;
            }
            if (o00000o != null) {
                byte[] bArr2 = oO000o00.f58124OooO00o;
                o00000o.f59285OooO0Oo = -1L;
                o0000 o0000Var = o00000o.f59284OooO0OO;
                Intrinsics.checkNotNull(o0000Var);
                o0000Var.f59281OooO0o0.remove(o00000o);
                arrayList.remove(o0000Var);
                o0000Var.f59279OooO0Oo = o00000o;
                this.f59293OooO0o0.add(o0000Var);
                if (z || (!this.f59290OooO0OO && (!arrayList.isEmpty()))) {
                    oooO00o.execute(this.f59294OooO0oO);
                }
                return o00000o;
            }
            if (this.f59290OooO0OO) {
                if (jMin >= this.f59291OooO0Oo - j) {
                    return null;
                }
                oooO00o.OooO00o(this);
                return null;
            }
            this.f59290OooO0OO = true;
            this.f59291OooO0Oo = j + jMin;
            try {
                try {
                    oooO00o.OooO0O0(this, jMin);
                } catch (InterruptedException unused) {
                    OooO0Oo();
                }
                this.f59290OooO0OO = false;
            } catch (Throwable th) {
                this.f59290OooO0OO = false;
                throw th;
            }
        }
    }

    public final void OooO0Oo() {
        ArrayList arrayList = this.f59293OooO0o0;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                ((o0000) arrayList.get(size)).OooO0O0();
                if (i < 0) {
                    break;
                } else {
                    size = i;
                }
            }
        }
        ArrayList arrayList2 = this.f59292OooO0o;
        int size2 = arrayList2.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i2 = size2 - 1;
            o0000 o0000Var = (o0000) arrayList2.get(size2);
            o0000Var.OooO0O0();
            if (o0000Var.f59281OooO0o0.isEmpty()) {
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
    public final o0000 OooO0o() {
        int i;
        synchronized (this) {
            i = this.f59289OooO0O0;
            this.f59289OooO0O0 = i + 1;
        }
        return new o0000(this, Intrinsics.stringPlus("Q", Integer.valueOf(i)));
    }

    public final void OooO0o0(@NotNull o0000 taskQueue) {
        Intrinsics.checkNotNullParameter(taskQueue, "taskQueue");
        byte[] bArr = oO000o00.f58124OooO00o;
        if (taskQueue.f59279OooO0Oo == null) {
            boolean z = !taskQueue.f59281OooO0o0.isEmpty();
            ArrayList arrayList = this.f59292OooO0o;
            if (z) {
                Intrinsics.checkNotNullParameter(arrayList, "<this>");
                if (!arrayList.contains(taskQueue)) {
                    arrayList.add(taskQueue);
                }
            } else {
                arrayList.remove(taskQueue);
            }
        }
        boolean z2 = this.f59290OooO0OO;
        OooO00o oooO00o = this.f59288OooO00o;
        if (z2) {
            oooO00o.OooO00o(this);
        } else {
            oooO00o.execute(this.f59294OooO0oO);
        }
    }
}

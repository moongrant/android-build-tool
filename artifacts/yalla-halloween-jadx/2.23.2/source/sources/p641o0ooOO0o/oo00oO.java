package p641o0ooOO0o;

import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p648o0ooOoo.oO000Oo0;
import p648o0ooOoo.oO000o00;
import p653o0ooo00O.o0000O0;

/* JADX INFO: loaded from: classes5.dex */
public final class oo00oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public ExecutorService f57965OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ArrayDeque<o0000O0.OooO00o> f57966OooO0O0 = new ArrayDeque<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final ArrayDeque<o0000O0.OooO00o> f57967OooO0OO = new ArrayDeque<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final ArrayDeque<o0000O0> f57968OooO0Oo = new ArrayDeque<>();

    public final synchronized int OooO() {
        return this.f57967OooO0OO.size() + this.f57968OooO0Oo.size();
    }

    @JvmName(name = "executorService")
    @NotNull
    public final synchronized ExecutorService OooO00o() {
        ExecutorService executorService;
        if (this.f57965OooO00o == null) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            SynchronousQueue synchronousQueue = new SynchronousQueue();
            String name = Intrinsics.stringPlus(oO000o00.f58130OooO0oO, " Dispatcher");
            Intrinsics.checkNotNullParameter(name, "name");
            this.f57965OooO00o = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new oO000Oo0(name, false));
        }
        executorService = this.f57965OooO00o;
        Intrinsics.checkNotNull(executorService);
        return executorService;
    }

    public final void OooO0O0(@NotNull o0000O0.OooO00o call) {
        Intrinsics.checkNotNullParameter(call, "call");
        call.f59324OooO0o0.decrementAndGet();
        ArrayDeque<o0000O0.OooO00o> arrayDeque = this.f57967OooO0OO;
        synchronized (this) {
            if (!arrayDeque.remove(call)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            OooO0Oo();
            Unit unit = Unit.INSTANCE;
        }
        OooO0oO();
    }

    public final void OooO0OO(@NotNull o0000O0 call) {
        Intrinsics.checkNotNullParameter(call, "call");
        ArrayDeque<o0000O0> arrayDeque = this.f57968OooO0Oo;
        synchronized (this) {
            if (!arrayDeque.remove(call)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            OooO0Oo();
            Unit unit = Unit.INSTANCE;
        }
        OooO0oO();
    }

    @Nullable
    public final synchronized void OooO0Oo() {
    }

    public final synchronized int OooO0o() {
        return 5;
    }

    public final synchronized int OooO0o0() {
        return 64;
    }

    public final void OooO0oO() {
        byte[] bArr = oO000o00.f58124OooO00o;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<o0000O0.OooO00o> it = this.f57966OooO0O0.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "readyAsyncCalls.iterator()");
            while (it.hasNext()) {
                o0000O0.OooO00o asyncCall = it.next();
                int size = this.f57967OooO0OO.size();
                OooO0o0();
                if (size >= 64) {
                    break;
                }
                int i = asyncCall.f59324OooO0o0.get();
                OooO0o();
                if (i < 5) {
                    it.remove();
                    asyncCall.f59324OooO0o0.incrementAndGet();
                    Intrinsics.checkNotNullExpressionValue(asyncCall, "asyncCall");
                    arrayList.add(asyncCall);
                    this.f57967OooO0OO.add(asyncCall);
                }
            }
            OooO();
            Unit unit = Unit.INSTANCE;
        }
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            int i3 = i2 + 1;
            o0000O0.OooO00o oooO00o = (o0000O0.OooO00o) arrayList.get(i2);
            ExecutorService executorService = OooO00o();
            oooO00o.getClass();
            Intrinsics.checkNotNullParameter(executorService, "executorService");
            o0000O0 o0000o1 = oooO00o.f59323OooO0o;
            oo00oO oo00oo = o0000o1.f59305OooO0Oo.f57885OooO0Oo;
            byte[] bArr2 = oO000o00.f58124OooO00o;
            try {
                try {
                    executorService.execute(oooO00o);
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e);
                    o0000o1.OooO(interruptedIOException);
                    oooO00o.f59322OooO0Oo.onFailure(o0000o1, interruptedIOException);
                    o0000o1.f59305OooO0Oo.f57885OooO0Oo.OooO0O0(oooO00o);
                }
                i2 = i3;
            } catch (Throwable th) {
                o0000o1.f59305OooO0Oo.f57885OooO0Oo.OooO0O0(oooO00o);
                throw th;
            }
        }
    }

    @NotNull
    public final synchronized List<o00OO> OooO0oo() {
        List<o00OO> listUnmodifiableList;
        ArrayDeque<o0000O0> arrayDeque = this.f57968OooO0Oo;
        ArrayDeque<o0000O0.OooO00o> arrayDeque2 = this.f57967OooO0OO;
        ArrayList arrayList = new ArrayList(CollectionsKt.OooO0oo(arrayDeque2));
        Iterator<o0000O0.OooO00o> it = arrayDeque2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f59323OooO0o);
        }
        listUnmodifiableList = Collections.unmodifiableList(CollectionsKt.plus((Collection) arrayDeque, (Iterable) arrayList));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(running…yncCalls.map { it.call })");
        return listUnmodifiableList;
    }
}

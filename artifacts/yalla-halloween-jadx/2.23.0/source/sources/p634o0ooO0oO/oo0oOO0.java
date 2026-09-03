package p634o0ooO0oO;

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
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p635o0ooO0oo.o0O000o0;
import p635o0ooO0oo.o0OoOoOo;
import p646o0ooOoo.oO0Oo0oo;

/* JADX INFO: loaded from: classes5.dex */
public final class oo0oOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public ExecutorService f57381OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ArrayDeque<oO0Oo0oo.OooO00o> f57382OooO0O0 = new ArrayDeque<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final ArrayDeque<oO0Oo0oo.OooO00o> f57383OooO0OO = new ArrayDeque<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final ArrayDeque<oO0Oo0oo> f57384OooO0Oo = new ArrayDeque<>();

    public final synchronized int OooO() {
        return this.f57383OooO0OO.size() + this.f57384OooO0Oo.size();
    }

    @JvmName(name = "executorService")
    @NotNull
    public final synchronized ExecutorService OooO00o() {
        ExecutorService executorService;
        if (this.f57381OooO00o == null) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            SynchronousQueue synchronousQueue = new SynchronousQueue();
            String name = Intrinsics.stringPlus(o0O000o0.f57392OooO0oO, " Dispatcher");
            Intrinsics.checkNotNullParameter(name, "name");
            this.f57381OooO00o = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new o0OoOoOo(name, false));
        }
        executorService = this.f57381OooO00o;
        Intrinsics.checkNotNull(executorService);
        return executorService;
    }

    public final void OooO0O0(@NotNull oO0Oo0oo.OooO00o call) {
        Intrinsics.checkNotNullParameter(call, "call");
        call.f59672OooO0o0.decrementAndGet();
        ArrayDeque<oO0Oo0oo.OooO00o> arrayDeque = this.f57383OooO0OO;
        synchronized (this) {
            if (!arrayDeque.remove(call)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            OooO0Oo();
            Unit unit = Unit.INSTANCE;
        }
        OooO0oO();
    }

    public final void OooO0OO(@NotNull oO0Oo0oo call) {
        Intrinsics.checkNotNullParameter(call, "call");
        ArrayDeque<oO0Oo0oo> arrayDeque = this.f57384OooO0Oo;
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
        byte[] bArr = o0O000o0.f57386OooO00o;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<oO0Oo0oo.OooO00o> it = this.f57382OooO0O0.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "readyAsyncCalls.iterator()");
            while (it.hasNext()) {
                oO0Oo0oo.OooO00o asyncCall = it.next();
                int size = this.f57383OooO0OO.size();
                OooO0o0();
                if (size >= 64) {
                    break;
                }
                int i = asyncCall.f59672OooO0o0.get();
                OooO0o();
                if (i < 5) {
                    it.remove();
                    asyncCall.f59672OooO0o0.incrementAndGet();
                    Intrinsics.checkNotNullExpressionValue(asyncCall, "asyncCall");
                    arrayList.add(asyncCall);
                    this.f57383OooO0OO.add(asyncCall);
                }
            }
            OooO();
            Unit unit = Unit.INSTANCE;
        }
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            int i3 = i2 + 1;
            oO0Oo0oo.OooO00o oooO00o = (oO0Oo0oo.OooO00o) arrayList.get(i2);
            ExecutorService executorService = OooO00o();
            oooO00o.getClass();
            Intrinsics.checkNotNullParameter(executorService, "executorService");
            oO0Oo0oo oo0oo0oo = oooO00o.f59671OooO0o;
            oo0oOO0 oo0ooo0 = oo0oo0oo.f59653OooO0Oo.f57256OooO0Oo;
            byte[] bArr2 = o0O000o0.f57386OooO00o;
            try {
                try {
                    executorService.execute(oooO00o);
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e);
                    oo0oo0oo.OooO(interruptedIOException);
                    oooO00o.f59670OooO0Oo.onFailure(oo0oo0oo, interruptedIOException);
                    oo0oo0oo.f59653OooO0Oo.f57256OooO0Oo.OooO0O0(oooO00o);
                }
                i2 = i3;
            } catch (Throwable th) {
                oo0oo0oo.f59653OooO0Oo.f57256OooO0Oo.OooO0O0(oooO00o);
                throw th;
            }
        }
    }

    @NotNull
    public final synchronized List<o00O00o0> OooO0oo() {
        List<o00O00o0> listUnmodifiableList;
        ArrayDeque<oO0Oo0oo> arrayDeque = this.f57384OooO0Oo;
        ArrayDeque<oO0Oo0oo.OooO00o> arrayDeque2 = this.f57383OooO0OO;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayDeque2, 10));
        Iterator<oO0Oo0oo.OooO00o> it = arrayDeque2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f59671OooO0o);
        }
        listUnmodifiableList = Collections.unmodifiableList(CollectionsKt.plus((Collection) arrayDeque, (Iterable) arrayList));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(running…yncCalls.map { it.call })");
        return listUnmodifiableList;
    }
}

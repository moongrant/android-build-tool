package p660o0ooo0o0;

import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p659o0ooo0o.o00OO;
import p659o0ooo0o.o00OOO00;
import p663o0oooO0.o00O0OO;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public ThreadPoolExecutor f51304OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ArrayDeque<o00O0OO.OooO00o> f51305OooO0O0 = new ArrayDeque<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayDeque<o00O0OO.OooO00o> f51306OooO0OO = new ArrayDeque<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ArrayDeque<o00O0OO> f51307OooO0Oo = new ArrayDeque<>();

    public final <T> void OooO00o(Deque<T> deque, T t) {
        synchronized (this) {
            if (!deque.remove(t)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            Unit unit = Unit.INSTANCE;
        }
        OooO0OO();
    }

    public final void OooO0O0(@NotNull o00O0OO.OooO00o call) {
        Intrinsics.checkNotNullParameter(call, "call");
        call.f51744Oooo0o.decrementAndGet();
        OooO00o(this.f51306OooO0OO, call);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0069  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074 A[Catch: all -> 0x00ef, TryCatch #4 {, blocks: (B:28:0x0070, B:30:0x0074, B:31:0x00a6), top: B:59:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x0074, please report this as an issue */
    public final boolean OooO0OO() {
        int size;
        int size2;
        int i;
        o00O0OO.OooO00o oooO00o;
        byte[] bArr = o00OOO00.f51183OooO00o;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<o00O0OO.OooO00o> it = this.f51305OooO0O0.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "readyAsyncCalls.iterator()");
            while (it.hasNext()) {
                o00O0OO.OooO00o asyncCall = it.next();
                if (this.f51306OooO0OO.size() >= 64) {
                    break;
                }
                if (asyncCall.f51744Oooo0o.get() < 5) {
                    it.remove();
                    asyncCall.f51744Oooo0o.incrementAndGet();
                    Intrinsics.checkNotNullExpressionValue(asyncCall, "asyncCall");
                    arrayList.add(asyncCall);
                    this.f51306OooO0OO.add(asyncCall);
                }
            }
            synchronized (this) {
                size = this.f51306OooO0OO.size() + this.f51307OooO0Oo.size();
            }
            size2 = arrayList.size();
            for (i = 0; i < size2; i++) {
                oooO00o = (o00O0OO.OooO00o) arrayList.get(i);
                synchronized (this) {
                    if (this.f51304OooO00o == null) {
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        SynchronousQueue synchronousQueue = new SynchronousQueue();
                        String name = o00OOO00.f51189OooO0oO + " Dispatcher";
                        Intrinsics.checkNotNullParameter(name, "name");
                        this.f51304OooO00o = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new o00OO(name, false));
                    }
                    ThreadPoolExecutor executorService = this.f51304OooO00o;
                    Intrinsics.checkNotNull(executorService);
                }
                Objects.requireNonNull(oooO00o);
                Intrinsics.checkNotNullParameter(executorService, "executorService");
                o00O0O0 o00o0o0 = oooO00o.f51746Oooo0oo.f51740Ooooo00.f51320Oooo0o;
                byte[] bArr2 = o00OOO00.f51183OooO00o;
                try {
                    try {
                        executorService.execute(oooO00o);
                    } catch (RejectedExecutionException e) {
                        InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                        interruptedIOException.initCause(e);
                        oooO00o.f51746Oooo0oo.OooOO0(interruptedIOException);
                        oooO00o.f51745Oooo0oO.onFailure(oooO00o.f51746Oooo0oo, interruptedIOException);
                        oooO00o.f51746Oooo0oo.f51740Ooooo00.f51320Oooo0o.OooO0O0(oooO00o);
                    }
                } catch (Throwable th) {
                    oooO00o.f51746Oooo0oo.f51740Ooooo00.f51320Oooo0o.OooO0O0(oooO00o);
                    throw th;
                }
            }
            return z;
        }
        boolean z = size > 0;
        Unit unit = Unit.INSTANCE;
        size2 = arrayList.size();
        while (i < size2) {
            oooO00o = (o00O0OO.OooO00o) arrayList.get(i);
            synchronized (this) {
                if (this.f51304OooO00o == null) {
                    TimeUnit timeUnit2 = TimeUnit.SECONDS;
                    SynchronousQueue synchronousQueue2 = new SynchronousQueue();
                    String name2 = o00OOO00.f51189OooO0oO + " Dispatcher";
                    Intrinsics.checkNotNullParameter(name2, "name");
                    this.f51304OooO00o = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit2, synchronousQueue2, new o00OO(name2, false));
                }
                ThreadPoolExecutor executorService2 = this.f51304OooO00o;
                Intrinsics.checkNotNull(executorService2);
                Objects.requireNonNull(oooO00o);
                Intrinsics.checkNotNullParameter(executorService2, "executorService");
                o00O0O0 o00o0o1 = oooO00o.f51746Oooo0oo.f51740Ooooo00.f51320Oooo0o;
                byte[] bArr3 = o00OOO00.f51183OooO00o;
                executorService2.execute(oooO00o);
            }
        }
        return z;
    }

    @NotNull
    public final synchronized List<o0O0ooO> OooO0Oo() {
        List<o0O0ooO> listUnmodifiableList;
        ArrayDeque<o00O0OO.OooO00o> arrayDeque = this.f51305OooO0O0;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayDeque, 10));
        Iterator<o00O0OO.OooO00o> it = arrayDeque.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f51746Oooo0oo);
        }
        listUnmodifiableList = Collections.unmodifiableList(arrayList);
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "Collections.unmodifiable…yncCalls.map { it.call })");
        return listUnmodifiableList;
    }

    @NotNull
    public final synchronized List<o0O0ooO> OooO0o0() {
        List<o0O0ooO> listUnmodifiableList;
        ArrayDeque<o00O0OO> arrayDeque = this.f51307OooO0Oo;
        ArrayDeque<o00O0OO.OooO00o> arrayDeque2 = this.f51306OooO0OO;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayDeque2, 10));
        Iterator<o00O0OO.OooO00o> it = arrayDeque2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f51746Oooo0oo);
        }
        listUnmodifiableList = Collections.unmodifiableList(CollectionsKt.plus((Collection) arrayDeque, (Iterable) arrayList));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "Collections.unmodifiable…yncCalls.map { it.call })");
        return listUnmodifiableList;
    }
}

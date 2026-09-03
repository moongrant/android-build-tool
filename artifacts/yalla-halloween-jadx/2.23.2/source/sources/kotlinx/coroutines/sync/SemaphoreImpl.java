package kotlinx.coroutines.sync;

import android.support.v4.media.OooO00o;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.internal.ConcurrentLinkedListKt;
import kotlinx.coroutines.internal.ConcurrentLinkedListNode;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.SegmentOrClosed;
import kotlinx.coroutines.internal.Symbol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0002\u0018\u00002\u00020\u001eB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u00060\nH\u0002¢\u0006\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0017\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00060\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lkotlinx/coroutines/sync/SemaphoreImpl;", "", "permits", "acquiredPermits", "<init>", "(II)V", "", "acquire", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "acquireSlowPath", "Lkotlinx/coroutines/CancellableContinuation;", "cont", "", "addAcquireToQueue", "(Lkotlinx/coroutines/CancellableContinuation;)Z", "release", "()V", "tryAcquire", "()Z", "tryResumeNextFromQueue", "tryResumeAcquire", "getAvailablePermits", "()I", "availablePermits", "Lkotlin/Function1;", "", "onCancellationRelease", "Lkotlin/jvm/functions/Function1;", "I", "kotlinx-coroutines-core", "Lkotlinx/coroutines/sync/Semaphore;"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class SemaphoreImpl implements Semaphore {

    @NotNull
    volatile /* synthetic */ int _availablePermits;

    @NotNull
    private volatile /* synthetic */ long deqIdx = 0;

    @NotNull
    private volatile /* synthetic */ long enqIdx = 0;

    @NotNull
    private volatile /* synthetic */ Object head;

    @NotNull
    private final Function1<Throwable, Unit> onCancellationRelease;
    private final int permits;

    @NotNull
    private volatile /* synthetic */ Object tail;
    private static final /* synthetic */ AtomicReferenceFieldUpdater head$FU = AtomicReferenceFieldUpdater.newUpdater(SemaphoreImpl.class, Object.class, "head");
    private static final /* synthetic */ AtomicLongFieldUpdater deqIdx$FU = AtomicLongFieldUpdater.newUpdater(SemaphoreImpl.class, "deqIdx");
    private static final /* synthetic */ AtomicReferenceFieldUpdater tail$FU = AtomicReferenceFieldUpdater.newUpdater(SemaphoreImpl.class, Object.class, "tail");
    private static final /* synthetic */ AtomicLongFieldUpdater enqIdx$FU = AtomicLongFieldUpdater.newUpdater(SemaphoreImpl.class, "enqIdx");
    static final /* synthetic */ AtomicIntegerFieldUpdater _availablePermits$FU = AtomicIntegerFieldUpdater.newUpdater(SemaphoreImpl.class, "_availablePermits");

    public SemaphoreImpl(int i, int i2) {
        this.permits = i;
        if (!(i > 0)) {
            throw new IllegalArgumentException(OooO00o.OooO00o("Semaphore should have at least 1 permit, but had ", i).toString());
        }
        if (!(i2 >= 0 && i2 <= i)) {
            throw new IllegalArgumentException(OooO00o.OooO00o("The number of acquired permits should be in 0..", i).toString());
        }
        SemaphoreSegment semaphoreSegment = new SemaphoreSegment(0L, null, 2);
        this.head = semaphoreSegment;
        this.tail = semaphoreSegment;
        this._availablePermits = i - i2;
        this.onCancellationRelease = new Function1<Throwable, Unit>() { // from class: kotlinx.coroutines.sync.SemaphoreImpl$onCancellationRelease$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Throwable th) {
                this.this$0.release();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object acquireSlowPath(Continuation<? super Unit> continuation) throws Throwable {
        CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuationKt.getOrCreateCancellableContinuation(IntrinsicsKt.intercepted(continuation));
        while (!addAcquireToQueue(orCreateCancellableContinuation)) {
            if (_availablePermits$FU.getAndDecrement(this) > 0) {
                orCreateCancellableContinuation.resume(Unit.INSTANCE, this.onCancellationRelease);
                break;
            }
        }
        Object result = orCreateCancellableContinuation.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean addAcquireToQueue(CancellableContinuation<? super Unit> cont) {
        Object objM5781constructorimpl;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        SemaphoreSegment semaphoreSegment = (SemaphoreSegment) this.tail;
        long andIncrement = enqIdx$FU.getAndIncrement(this);
        long j = andIncrement / ((long) SemaphoreKt.SEGMENT_SIZE);
        do {
            Segment segment = semaphoreSegment;
            while (true) {
                if (segment.getId() >= j && !segment.getRemoved()) {
                    objM5781constructorimpl = SegmentOrClosed.m5781constructorimpl(segment);
                    break;
                }
                Object obj = segment.get_next();
                if (obj == ConcurrentLinkedListKt.CLOSED) {
                    objM5781constructorimpl = SegmentOrClosed.m5781constructorimpl(ConcurrentLinkedListKt.CLOSED);
                    break;
                }
                Segment segmentCreateSegment = (Segment) ((ConcurrentLinkedListNode) obj);
                if (segmentCreateSegment == null) {
                    segmentCreateSegment = SemaphoreKt.createSegment(segment.getId() + 1, (SemaphoreSegment) segment);
                    if (segment.trySetNext(segmentCreateSegment)) {
                        if (segment.getRemoved()) {
                            segment.remove();
                        }
                    }
                }
                segment = segmentCreateSegment;
            }
            if (!SegmentOrClosed.m5786isClosedimpl(objM5781constructorimpl)) {
                Segment segmentM5784getSegmentimpl = SegmentOrClosed.m5784getSegmentimpl(objM5781constructorimpl);
                while (true) {
                    Segment segment2 = (Segment) this.tail;
                    if (segment2.getId() < segmentM5784getSegmentimpl.getId()) {
                        if (!segmentM5784getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                            z3 = false;
                            break;
                        }
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = tail$FU;
                        while (true) {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, segment2, segmentM5784getSegmentimpl)) {
                                z4 = true;
                                break;
                            }
                            if (atomicReferenceFieldUpdater.get(this) != segment2) {
                                z4 = false;
                                break;
                            }
                        }
                        if (z4) {
                            if (segment2.decPointers$kotlinx_coroutines_core()) {
                                segment2.remove();
                            }
                        } else if (segmentM5784getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                            segmentM5784getSegmentimpl.remove();
                        }
                    }
                    z3 = true;
                    break;
                }
            } else {
                break;
            }
        } while (!z3);
        SemaphoreSegment semaphoreSegment2 = (SemaphoreSegment) SegmentOrClosed.m5784getSegmentimpl(objM5781constructorimpl);
        int i = (int) (andIncrement % ((long) SemaphoreKt.SEGMENT_SIZE));
        AtomicReferenceArray atomicReferenceArray = semaphoreSegment2.acquirers;
        while (true) {
            if (atomicReferenceArray.compareAndSet(i, null, cont)) {
                z = true;
                break;
            }
            if (atomicReferenceArray.get(i) != null) {
                z = false;
                break;
            }
        }
        if (z) {
            cont.invokeOnCancellation(new CancelSemaphoreAcquisitionHandler(semaphoreSegment2, i));
            return true;
        }
        Symbol symbol = SemaphoreKt.PERMIT;
        Symbol symbol2 = SemaphoreKt.TAKEN;
        AtomicReferenceArray atomicReferenceArray2 = semaphoreSegment2.acquirers;
        while (true) {
            if (atomicReferenceArray2.compareAndSet(i, symbol, symbol2)) {
                z2 = true;
                break;
            }
            if (atomicReferenceArray2.get(i) != symbol) {
                z2 = false;
                break;
            }
        }
        if (!z2) {
            return false;
        }
        cont.resume(Unit.INSTANCE, this.onCancellationRelease);
        return true;
    }

    private final boolean tryResumeAcquire(CancellableContinuation<? super Unit> cancellableContinuation) {
        Object objTryResume = cancellableContinuation.tryResume(Unit.INSTANCE, null, this.onCancellationRelease);
        if (objTryResume == null) {
            return false;
        }
        cancellableContinuation.completeResume(objTryResume);
        return true;
    }

    private final boolean tryResumeNextFromQueue() {
        Object objM5781constructorimpl;
        boolean z;
        boolean z2;
        boolean z3;
        SemaphoreSegment semaphoreSegment = (SemaphoreSegment) this.head;
        long andIncrement = deqIdx$FU.getAndIncrement(this);
        long j = andIncrement / ((long) SemaphoreKt.SEGMENT_SIZE);
        do {
            Segment segment = semaphoreSegment;
            while (true) {
                if (segment.getId() >= j && !segment.getRemoved()) {
                    objM5781constructorimpl = SegmentOrClosed.m5781constructorimpl(segment);
                    break;
                }
                Object obj = segment.get_next();
                if (obj == ConcurrentLinkedListKt.CLOSED) {
                    objM5781constructorimpl = SegmentOrClosed.m5781constructorimpl(ConcurrentLinkedListKt.CLOSED);
                    break;
                }
                Segment segmentCreateSegment = (Segment) ((ConcurrentLinkedListNode) obj);
                if (segmentCreateSegment == null) {
                    segmentCreateSegment = SemaphoreKt.createSegment(segment.getId() + 1, (SemaphoreSegment) segment);
                    if (segment.trySetNext(segmentCreateSegment)) {
                        if (segment.getRemoved()) {
                            segment.remove();
                        }
                    }
                }
                segment = segmentCreateSegment;
            }
            z = false;
            if (SegmentOrClosed.m5786isClosedimpl(objM5781constructorimpl)) {
                break;
            }
            Segment segmentM5784getSegmentimpl = SegmentOrClosed.m5784getSegmentimpl(objM5781constructorimpl);
            while (true) {
                Segment segment2 = (Segment) this.head;
                if (segment2.getId() < segmentM5784getSegmentimpl.getId()) {
                    if (!segmentM5784getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        z2 = false;
                        break;
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = head$FU;
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, segment2, segmentM5784getSegmentimpl)) {
                            z3 = true;
                            break;
                        }
                        if (atomicReferenceFieldUpdater.get(this) != segment2) {
                            z3 = false;
                            break;
                        }
                    }
                    if (z3) {
                        if (segment2.decPointers$kotlinx_coroutines_core()) {
                            segment2.remove();
                        }
                    } else if (segmentM5784getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        segmentM5784getSegmentimpl.remove();
                    }
                }
                z2 = true;
                break;
            }
        } while (!z2);
        SemaphoreSegment semaphoreSegment2 = (SemaphoreSegment) SegmentOrClosed.m5784getSegmentimpl(objM5781constructorimpl);
        semaphoreSegment2.cleanPrev();
        if (semaphoreSegment2.getId() > j) {
            return false;
        }
        int i = (int) (andIncrement % ((long) SemaphoreKt.SEGMENT_SIZE));
        Object andSet = semaphoreSegment2.acquirers.getAndSet(i, SemaphoreKt.PERMIT);
        if (andSet != null) {
            if (andSet == SemaphoreKt.CANCELLED) {
                return false;
            }
            return tryResumeAcquire((CancellableContinuation) andSet);
        }
        int i2 = SemaphoreKt.MAX_SPIN_CYCLES;
        for (int i3 = 0; i3 < i2; i3++) {
            if (semaphoreSegment2.acquirers.get(i) == SemaphoreKt.TAKEN) {
                return true;
            }
        }
        Symbol symbol = SemaphoreKt.PERMIT;
        Symbol symbol2 = SemaphoreKt.BROKEN;
        AtomicReferenceArray atomicReferenceArray = semaphoreSegment2.acquirers;
        while (!atomicReferenceArray.compareAndSet(i, symbol, symbol2)) {
            if (atomicReferenceArray.get(i) != symbol) {
                return !z;
            }
        }
        z = true;
        return !z;
    }

    @Override // kotlinx.coroutines.sync.Semaphore
    @Nullable
    public Object acquire(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        if (_availablePermits$FU.getAndDecrement(this) > 0) {
            return Unit.INSTANCE;
        }
        Object objAcquireSlowPath = acquireSlowPath(continuation);
        return objAcquireSlowPath == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAcquireSlowPath : Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.sync.Semaphore
    public int getAvailablePermits() {
        return Math.max(this._availablePermits, 0);
    }

    @Override // kotlinx.coroutines.sync.Semaphore
    public void release() {
        while (true) {
            int i = this._availablePermits;
            if (!(i < this.permits)) {
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.permits).toString());
            }
            if (_availablePermits$FU.compareAndSet(this, i, i + 1) && (i >= 0 || tryResumeNextFromQueue())) {
                return;
            }
        }
    }

    @Override // kotlinx.coroutines.sync.Semaphore
    public boolean tryAcquire() {
        int i;
        do {
            i = this._availablePermits;
            if (i <= 0) {
                return false;
            }
        } while (!_availablePermits$FU.compareAndSet(this, i, i - 1));
        return true;
    }
}

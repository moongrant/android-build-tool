package org.jctools.queues.atomic;

import java.util.concurrent.atomic.AtomicReferenceArray;
import org.jctools.util.Pow2;
import org.jctools.util.RangeUtil;

/* JADX INFO: loaded from: classes5.dex */
public class MpscGrowableAtomicArrayQueue<E> extends MpscChunkedAtomicArrayQueue<E> {
    public MpscGrowableAtomicArrayQueue(int i) {
        super(Math.max(2, Pow2.roundToPowerOfTwo(i / 8)), i);
    }

    @Override // org.jctools.queues.atomic.MpscChunkedAtomicArrayQueue, org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueue
    public long getCurrentBufferCapacity(long j) {
        long j2 = 2 + j;
        long j3 = this.maxQueueCapacity;
        return j2 == j3 ? j3 : j;
    }

    @Override // org.jctools.queues.atomic.MpscChunkedAtomicArrayQueue, org.jctools.queues.atomic.BaseMpscLinkedAtomicArrayQueue
    public int getNextBufferSize(AtomicReferenceArray<E> atomicReferenceArray) {
        RangeUtil.checkLessThanOrEqual(AtomicQueueUtil.length(atomicReferenceArray), this.maxQueueCapacity / 2, "buffer.length");
        return ((AtomicQueueUtil.length(atomicReferenceArray) - 1) * 2) + 1;
    }

    public MpscGrowableAtomicArrayQueue(int i, int i2) {
        super(i, i2);
    }
}

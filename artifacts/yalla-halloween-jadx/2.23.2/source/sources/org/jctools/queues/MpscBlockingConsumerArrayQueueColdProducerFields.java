package org.jctools.queues;

import org.jctools.util.UnsafeAccess;

/* JADX INFO: loaded from: classes5.dex */
abstract class MpscBlockingConsumerArrayQueueColdProducerFields<E> extends MpscBlockingConsumerArrayQueuePad1<E> {
    private static final long P_LIMIT_OFFSET = UnsafeAccess.fieldOffset(MpscBlockingConsumerArrayQueueColdProducerFields.class, "producerLimit");
    protected final E[] producerBuffer;
    private volatile long producerLimit;
    protected final long producerMask;

    public MpscBlockingConsumerArrayQueueColdProducerFields(long j, E[] eArr) {
        this.producerMask = j;
        this.producerBuffer = eArr;
    }

    final boolean casProducerLimit(long j, long j2) {
        return UnsafeAccess.UNSAFE.compareAndSwapLong(this, P_LIMIT_OFFSET, j, j2);
    }

    final long lvProducerLimit() {
        return this.producerLimit;
    }

    final void soProducerLimit(long j) {
        UnsafeAccess.UNSAFE.putOrderedLong(this, P_LIMIT_OFFSET, j);
    }
}

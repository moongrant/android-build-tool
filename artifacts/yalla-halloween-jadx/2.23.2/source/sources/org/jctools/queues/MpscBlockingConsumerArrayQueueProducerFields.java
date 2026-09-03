package org.jctools.queues;

import org.jctools.util.UnsafeAccess;

/* JADX INFO: loaded from: classes5.dex */
abstract class MpscBlockingConsumerArrayQueueProducerFields<E> extends MpscBlockingConsumerArrayQueuePad2<E> {
    private static final long P_INDEX_OFFSET = UnsafeAccess.fieldOffset(MpscBlockingConsumerArrayQueueProducerFields.class, "producerIndex");
    private volatile long producerIndex;

    public MpscBlockingConsumerArrayQueueProducerFields(long j, E[] eArr) {
        super(j, eArr);
    }

    final boolean casProducerIndex(long j, long j2) {
        return UnsafeAccess.UNSAFE.compareAndSwapLong(this, P_INDEX_OFFSET, j, j2);
    }

    @Override // org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue
    public final long lvProducerIndex() {
        return this.producerIndex;
    }

    final void soProducerIndex(long j) {
        UnsafeAccess.UNSAFE.putOrderedLong(this, P_INDEX_OFFSET, j);
    }
}

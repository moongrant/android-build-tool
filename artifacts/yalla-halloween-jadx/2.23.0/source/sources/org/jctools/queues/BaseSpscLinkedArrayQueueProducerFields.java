package org.jctools.queues;

import org.jctools.util.UnsafeAccess;

/* JADX INFO: loaded from: classes5.dex */
abstract class BaseSpscLinkedArrayQueueProducerFields<E> extends BaseSpscLinkedArrayQueueL2Pad<E> {
    private static final long P_INDEX_OFFSET = UnsafeAccess.fieldOffset(BaseSpscLinkedArrayQueueProducerFields.class, "producerIndex");
    private volatile long producerIndex;

    final long lpProducerIndex() {
        return UnsafeAccess.UNSAFE.getLong(this, P_INDEX_OFFSET);
    }

    @Override // org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue
    public final long lvProducerIndex() {
        return this.producerIndex;
    }

    final void soProducerIndex(long j) {
        UnsafeAccess.UNSAFE.putOrderedLong(this, P_INDEX_OFFSET, j);
    }
}

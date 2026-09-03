package org.jctools.queues;

import org.jctools.util.UnsafeAccess;

/* JADX INFO: loaded from: classes5.dex */
abstract class SpmcArrayQueueProducerIndexField<E> extends SpmcArrayQueueL1Pad<E> {
    protected static final long P_INDEX_OFFSET = UnsafeAccess.fieldOffset(SpmcArrayQueueProducerIndexField.class, "producerIndex");
    private volatile long producerIndex;

    public SpmcArrayQueueProducerIndexField(int i) {
        super(i);
    }

    public final long lpProducerIndex() {
        return UnsafeAccess.UNSAFE.getLong(this, P_INDEX_OFFSET);
    }

    @Override // org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue
    public final long lvProducerIndex() {
        return this.producerIndex;
    }

    public final void soProducerIndex(long j) {
        UnsafeAccess.UNSAFE.putOrderedLong(this, P_INDEX_OFFSET, j);
    }
}

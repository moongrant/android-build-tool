package org.jctools.queues.atomic;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* JADX INFO: loaded from: classes5.dex */
abstract class SpmcAtomicArrayQueueProducerIndexField<E> extends SpmcAtomicArrayQueueL1Pad<E> {
    private static final AtomicLongFieldUpdater<SpmcAtomicArrayQueueProducerIndexField> P_INDEX_UPDATER = AtomicLongFieldUpdater.newUpdater(SpmcAtomicArrayQueueProducerIndexField.class, "producerIndex");
    private volatile long producerIndex;

    public SpmcAtomicArrayQueueProducerIndexField(int i) {
        super(i);
    }

    public final long lpProducerIndex() {
        return this.producerIndex;
    }

    @Override // org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue
    public final long lvProducerIndex() {
        return this.producerIndex;
    }

    public final void soProducerIndex(long j) {
        P_INDEX_UPDATER.lazySet(this, j);
    }
}

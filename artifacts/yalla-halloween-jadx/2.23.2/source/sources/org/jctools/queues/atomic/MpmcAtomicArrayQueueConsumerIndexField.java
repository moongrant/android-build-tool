package org.jctools.queues.atomic;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* JADX INFO: loaded from: classes5.dex */
abstract class MpmcAtomicArrayQueueConsumerIndexField<E> extends MpmcAtomicArrayQueueL2Pad<E> {
    private static final AtomicLongFieldUpdater<MpmcAtomicArrayQueueConsumerIndexField> C_INDEX_UPDATER = AtomicLongFieldUpdater.newUpdater(MpmcAtomicArrayQueueConsumerIndexField.class, "consumerIndex");
    private volatile long consumerIndex;

    public MpmcAtomicArrayQueueConsumerIndexField(int i) {
        super(i);
    }

    public final boolean casConsumerIndex(long j, long j2) {
        return C_INDEX_UPDATER.compareAndSet(this, j, j2);
    }

    @Override // org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue
    public final long lvConsumerIndex() {
        return this.consumerIndex;
    }
}

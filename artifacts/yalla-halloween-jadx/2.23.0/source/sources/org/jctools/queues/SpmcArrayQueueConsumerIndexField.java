package org.jctools.queues;

import org.jctools.util.UnsafeAccess;

/* JADX INFO: loaded from: classes5.dex */
abstract class SpmcArrayQueueConsumerIndexField<E> extends SpmcArrayQueueL2Pad<E> {
    protected static final long C_INDEX_OFFSET = UnsafeAccess.fieldOffset(SpmcArrayQueueConsumerIndexField.class, "consumerIndex");
    private volatile long consumerIndex;

    public SpmcArrayQueueConsumerIndexField(int i) {
        super(i);
    }

    public final boolean casConsumerIndex(long j, long j2) {
        return UnsafeAccess.UNSAFE.compareAndSwapLong(this, C_INDEX_OFFSET, j, j2);
    }

    @Override // org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue
    public final long lvConsumerIndex() {
        return this.consumerIndex;
    }
}

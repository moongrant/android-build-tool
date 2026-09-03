package org.jctools.queues.atomic;

/* JADX INFO: loaded from: classes5.dex */
abstract class SpmcAtomicArrayQueueProducerIndexCacheField<E> extends SpmcAtomicArrayQueueMidPad<E> {
    private volatile long producerIndexCache;

    public SpmcAtomicArrayQueueProducerIndexCacheField(int i) {
        super(i);
    }

    public final long lvProducerIndexCache() {
        return this.producerIndexCache;
    }

    public final void svProducerIndexCache(long j) {
        this.producerIndexCache = j;
    }
}

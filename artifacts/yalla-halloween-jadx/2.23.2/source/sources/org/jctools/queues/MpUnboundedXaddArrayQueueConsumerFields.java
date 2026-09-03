package org.jctools.queues;

import org.jctools.queues.MpUnboundedXaddChunk;
import org.jctools.util.UnsafeAccess;

/* JADX INFO: loaded from: classes5.dex */
abstract class MpUnboundedXaddArrayQueueConsumerFields<R extends MpUnboundedXaddChunk<R, E>, E> extends MpUnboundedXaddArrayQueuePad3<R, E> {
    private volatile R consumerChunk;
    private volatile long consumerIndex;
    private static final long C_INDEX_OFFSET = UnsafeAccess.fieldOffset(MpUnboundedXaddArrayQueueConsumerFields.class, "consumerIndex");
    private static final long C_CHUNK_OFFSET = UnsafeAccess.fieldOffset(MpUnboundedXaddArrayQueueConsumerFields.class, "consumerChunk");

    final boolean casConsumerIndex(long j, long j2) {
        return UnsafeAccess.UNSAFE.compareAndSwapLong(this, C_INDEX_OFFSET, j, j2);
    }

    public final R lpConsumerChunk() {
        return (R) UnsafeAccess.UNSAFE.getObject(this, C_CHUNK_OFFSET);
    }

    final long lpConsumerIndex() {
        return UnsafeAccess.UNSAFE.getLong(this, C_INDEX_OFFSET);
    }

    public final R lvConsumerChunk() {
        return this.consumerChunk;
    }

    @Override // org.jctools.queues.IndexedQueueSizeUtil.IndexedQueue
    public final long lvConsumerIndex() {
        return this.consumerIndex;
    }

    public final void soConsumerChunk(R r) {
        UnsafeAccess.UNSAFE.putOrderedObject(this, C_CHUNK_OFFSET, r);
    }

    final void soConsumerIndex(long j) {
        UnsafeAccess.UNSAFE.putOrderedLong(this, C_INDEX_OFFSET, j);
    }
}

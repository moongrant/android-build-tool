package org.jctools.queues;

import org.jctools.queues.MpUnboundedXaddChunk;
import org.jctools.util.UnsafeAccess;

/* JADX INFO: loaded from: classes5.dex */
abstract class MpUnboundedXaddArrayQueueProducerChunk<R extends MpUnboundedXaddChunk<R, E>, E> extends MpUnboundedXaddArrayQueuePad2<E> {
    private volatile R producerChunk;
    private volatile long producerChunkIndex;
    private static final long P_CHUNK_OFFSET = UnsafeAccess.fieldOffset(MpUnboundedXaddArrayQueueProducerChunk.class, "producerChunk");
    private static final long P_CHUNK_INDEX_OFFSET = UnsafeAccess.fieldOffset(MpUnboundedXaddArrayQueueProducerChunk.class, "producerChunkIndex");

    public final boolean casProducerChunkIndex(long j, long j2) {
        return UnsafeAccess.UNSAFE.compareAndSwapLong(this, P_CHUNK_INDEX_OFFSET, j, j2);
    }

    public final R lvProducerChunk() {
        return this.producerChunk;
    }

    public final long lvProducerChunkIndex() {
        return this.producerChunkIndex;
    }

    public final void soProducerChunk(R r) {
        UnsafeAccess.UNSAFE.putOrderedObject(this, P_CHUNK_OFFSET, r);
    }

    public final void soProducerChunkIndex(long j) {
        UnsafeAccess.UNSAFE.putOrderedLong(this, P_CHUNK_INDEX_OFFSET, j);
    }
}

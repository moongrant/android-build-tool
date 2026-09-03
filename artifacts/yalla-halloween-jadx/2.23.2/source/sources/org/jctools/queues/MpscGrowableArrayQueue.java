package org.jctools.queues;

import org.jctools.util.Pow2;
import org.jctools.util.RangeUtil;

/* JADX INFO: loaded from: classes5.dex */
public class MpscGrowableArrayQueue<E> extends MpscChunkedArrayQueue<E> {
    public MpscGrowableArrayQueue(int i) {
        super(Math.max(2, Pow2.roundToPowerOfTwo(i / 8)), i);
    }

    @Override // org.jctools.queues.MpscChunkedArrayQueue, org.jctools.queues.BaseMpscLinkedArrayQueue
    public long getCurrentBufferCapacity(long j) {
        long j2 = 2 + j;
        long j3 = this.maxQueueCapacity;
        return j2 == j3 ? j3 : j;
    }

    @Override // org.jctools.queues.MpscChunkedArrayQueue, org.jctools.queues.BaseMpscLinkedArrayQueue
    public int getNextBufferSize(E[] eArr) {
        RangeUtil.checkLessThanOrEqual(LinkedArrayQueueUtil.length(eArr), this.maxQueueCapacity / 2, "buffer.length");
        return ((LinkedArrayQueueUtil.length(eArr) - 1) * 2) + 1;
    }

    public MpscGrowableArrayQueue(int i, int i2) {
        super(i, i2);
    }
}

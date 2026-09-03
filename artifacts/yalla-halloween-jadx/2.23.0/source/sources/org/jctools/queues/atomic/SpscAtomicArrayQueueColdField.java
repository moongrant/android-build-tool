package org.jctools.queues.atomic;

/* JADX INFO: loaded from: classes5.dex */
abstract class SpscAtomicArrayQueueColdField<E> extends AtomicReferenceArrayQueue<E> {
    public static final int MAX_LOOK_AHEAD_STEP = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    final int lookAheadStep;

    public SpscAtomicArrayQueueColdField(int i) {
        super(i);
        this.lookAheadStep = Math.min(capacity() / 4, MAX_LOOK_AHEAD_STEP);
    }
}

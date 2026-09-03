package org.jctools.queues.atomic;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes5.dex */
abstract class BaseSpscLinkedAtomicArrayQueueProducerColdFields<E> extends BaseSpscLinkedAtomicArrayQueueProducerFields<E> {
    protected AtomicReferenceArray<E> producerBuffer;
    protected long producerBufferLimit;
    protected long producerMask;
}

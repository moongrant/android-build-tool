package org.jctools.queues;

/* JADX INFO: loaded from: classes5.dex */
abstract class BaseSpscLinkedArrayQueueConsumerColdFields<E> extends BaseSpscLinkedArrayQueuePrePad<E> {
    protected E[] consumerBuffer;
    protected long consumerMask;
}

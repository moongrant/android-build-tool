package org.jctools.queues.atomic;

import android.support.v4.media.OooO00o;
import org.jctools.queues.MessagePassingQueue;
import org.jctools.queues.MessagePassingQueueUtil;

/* JADX INFO: loaded from: classes5.dex */
public class SpscLinkedAtomicQueue<E> extends BaseLinkedAtomicQueue<E> {
    public SpscLinkedAtomicQueue() {
        LinkedQueueAtomicNode<E> linkedQueueAtomicNodeNewNode = newNode();
        spProducerNode(linkedQueueAtomicNodeNewNode);
        spConsumerNode(linkedQueueAtomicNodeNewNode);
        linkedQueueAtomicNodeNewNode.soNext(null);
    }

    @Override // org.jctools.queues.atomic.BaseLinkedAtomicQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ int capacity() {
        return super.capacity();
    }

    @Override // org.jctools.queues.atomic.BaseLinkedAtomicQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ int drain(MessagePassingQueue.Consumer consumer) {
        return super.drain(consumer);
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public int fill(MessagePassingQueue.Supplier<E> supplier) {
        return MessagePassingQueueUtil.fillUnbounded(this, supplier);
    }

    @Override // org.jctools.queues.atomic.BaseLinkedAtomicQueue, java.util.AbstractCollection, java.util.Collection, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public boolean offer(E e) {
        e.getClass();
        LinkedQueueAtomicNode<E> linkedQueueAtomicNodeNewNode = newNode(e);
        LinkedQueueAtomicNode<E> linkedQueueAtomicNodeLpProducerNode = lpProducerNode();
        soProducerNode(linkedQueueAtomicNodeNewNode);
        linkedQueueAtomicNodeLpProducerNode.soNext(linkedQueueAtomicNodeNewNode);
        return true;
    }

    @Override // org.jctools.queues.atomic.BaseLinkedAtomicQueue, java.util.Queue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ Object peek() {
        return super.peek();
    }

    @Override // org.jctools.queues.atomic.BaseLinkedAtomicQueue, java.util.Queue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ Object poll() {
        return super.poll();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.jctools.queues.atomic.BaseLinkedAtomicQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ boolean relaxedOffer(Object obj) {
        return super.relaxedOffer(obj);
    }

    @Override // org.jctools.queues.atomic.BaseLinkedAtomicQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ Object relaxedPeek() {
        return super.relaxedPeek();
    }

    @Override // org.jctools.queues.atomic.BaseLinkedAtomicQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ Object relaxedPoll() {
        return super.relaxedPoll();
    }

    @Override // org.jctools.queues.atomic.BaseLinkedAtomicQueue, java.util.AbstractCollection
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // org.jctools.queues.atomic.BaseLinkedAtomicQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ int drain(MessagePassingQueue.Consumer consumer, int i) {
        return super.drain(consumer, i);
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public int fill(MessagePassingQueue.Supplier<E> supplier, int i) {
        if (supplier == null) {
            throw new IllegalArgumentException("supplier is null");
        }
        if (i < 0) {
            throw new IllegalArgumentException(OooO00o.OooO00o("limit is negative:", i));
        }
        if (i == 0) {
            return 0;
        }
        LinkedQueueAtomicNode<E> linkedQueueAtomicNodeNewNode = newNode(supplier.get());
        int i2 = 1;
        LinkedQueueAtomicNode<E> linkedQueueAtomicNode = linkedQueueAtomicNodeNewNode;
        while (i2 < i) {
            LinkedQueueAtomicNode<E> linkedQueueAtomicNodeNewNode2 = newNode(supplier.get());
            linkedQueueAtomicNode.spNext(linkedQueueAtomicNodeNewNode2);
            i2++;
            linkedQueueAtomicNode = linkedQueueAtomicNodeNewNode2;
        }
        LinkedQueueAtomicNode<E> linkedQueueAtomicNodeLpProducerNode = lpProducerNode();
        soProducerNode(linkedQueueAtomicNode);
        linkedQueueAtomicNodeLpProducerNode.soNext(linkedQueueAtomicNodeNewNode);
        return i;
    }

    @Override // org.jctools.queues.atomic.BaseLinkedAtomicQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ void drain(MessagePassingQueue.Consumer consumer, MessagePassingQueue.WaitStrategy waitStrategy, MessagePassingQueue.ExitCondition exitCondition) {
        super.drain(consumer, waitStrategy, exitCondition);
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public void fill(MessagePassingQueue.Supplier<E> supplier, MessagePassingQueue.WaitStrategy waitStrategy, MessagePassingQueue.ExitCondition exitCondition) {
        MessagePassingQueueUtil.fill(this, supplier, waitStrategy, exitCondition);
    }
}

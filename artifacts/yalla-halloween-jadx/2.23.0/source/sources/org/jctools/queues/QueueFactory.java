package org.jctools.queues;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.jctools.queues.spec.ConcurrentQueueSpec;
import org.jctools.queues.spec.Ordering;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class QueueFactory {
    public static <E> Queue<E> newQueue(ConcurrentQueueSpec concurrentQueueSpec) {
        if (!concurrentQueueSpec.isBounded()) {
            if (concurrentQueueSpec.isSpsc()) {
                return new SpscLinkedQueue();
            }
            return concurrentQueueSpec.isMpsc() ? new MpscLinkedQueue() : new ConcurrentLinkedQueue();
        }
        if (concurrentQueueSpec.isSpsc()) {
            return new SpscArrayQueue(concurrentQueueSpec.capacity);
        }
        if (concurrentQueueSpec.isMpsc()) {
            return concurrentQueueSpec.ordering != Ordering.NONE ? new MpscArrayQueue(concurrentQueueSpec.capacity) : new MpscCompoundQueue(concurrentQueueSpec.capacity);
        }
        return concurrentQueueSpec.isSpmc() ? new SpmcArrayQueue(concurrentQueueSpec.capacity) : new MpmcArrayQueue(concurrentQueueSpec.capacity);
    }
}

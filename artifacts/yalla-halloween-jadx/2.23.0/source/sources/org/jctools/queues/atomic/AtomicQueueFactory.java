package org.jctools.queues.atomic;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.jctools.queues.spec.ConcurrentQueueSpec;

/* JADX INFO: loaded from: classes5.dex */
public class AtomicQueueFactory {
    public static <E> Queue<E> newQueue(ConcurrentQueueSpec concurrentQueueSpec) {
        if (!concurrentQueueSpec.isBounded()) {
            if (concurrentQueueSpec.isSpsc()) {
                return new SpscLinkedAtomicQueue();
            }
            return concurrentQueueSpec.isMpsc() ? new MpscLinkedAtomicQueue() : new ConcurrentLinkedQueue();
        }
        if (concurrentQueueSpec.isSpsc()) {
            return new SpscAtomicArrayQueue(concurrentQueueSpec.capacity);
        }
        if (concurrentQueueSpec.isMpsc()) {
            return new MpscAtomicArrayQueue(concurrentQueueSpec.capacity);
        }
        return concurrentQueueSpec.isSpmc() ? new SpmcAtomicArrayQueue(concurrentQueueSpec.capacity) : new MpmcAtomicArrayQueue(concurrentQueueSpec.capacity);
    }
}

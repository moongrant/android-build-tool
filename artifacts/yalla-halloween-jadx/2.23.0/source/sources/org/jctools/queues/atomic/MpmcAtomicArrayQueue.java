package org.jctools.queues.atomic;

import android.support.v4.media.OooO00o;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.jctools.queues.MessagePassingQueue;
import org.jctools.queues.MessagePassingQueueUtil;
import org.jctools.util.RangeUtil;

/* JADX INFO: loaded from: classes5.dex */
public class MpmcAtomicArrayQueue<E> extends MpmcAtomicArrayQueueL3Pad<E> {
    public static final int MAX_LOOK_AHEAD_STEP = Integer.getInteger("jctools.mpmc.max.lookahead.step", 4096).intValue();
    private final int lookAheadStep;

    public MpmcAtomicArrayQueue(int i) {
        super(RangeUtil.checkGreaterThanOrEqual(i, 2, "capacity"));
        this.lookAheadStep = Math.max(2, Math.min(capacity() / 4, MAX_LOOK_AHEAD_STEP));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int drainOneByOne(MessagePassingQueue.Consumer<E> consumer, int i) {
        long jLvConsumerIndex;
        int iCalcCircularLongElementOffset;
        AtomicLongArray atomicLongArray = this.sequenceBuffer;
        int i2 = this.mask;
        AtomicReferenceArray<E> atomicReferenceArray = this.buffer;
        for (int i3 = 0; i3 < i; i3++) {
            while (true) {
                jLvConsumerIndex = lvConsumerIndex();
                iCalcCircularLongElementOffset = AtomicQueueUtil.calcCircularLongElementOffset(jLvConsumerIndex, i2);
                long jLvLongElement = AtomicQueueUtil.lvLongElement(atomicLongArray, iCalcCircularLongElementOffset);
                long j = jLvConsumerIndex + 1;
                if (jLvLongElement < j) {
                    return i3;
                }
                if (jLvLongElement > j || !casConsumerIndex(jLvConsumerIndex, j)) {
                }
            }
            long j2 = i2;
            int iCalcCircularRefElementOffset = AtomicQueueUtil.calcCircularRefElementOffset(jLvConsumerIndex, j2);
            Object objLpRefElement = AtomicQueueUtil.lpRefElement(atomicReferenceArray, iCalcCircularRefElementOffset);
            AtomicQueueUtil.spRefElement(atomicReferenceArray, iCalcCircularRefElementOffset, null);
            AtomicQueueUtil.soLongElement(atomicLongArray, iCalcCircularLongElementOffset, jLvConsumerIndex + j2 + 1);
            consumer.accept(objLpRefElement);
        }
        return i;
    }

    private int fillOneByOne(MessagePassingQueue.Supplier<E> supplier, int i) {
        long jLvProducerIndex;
        int iCalcCircularLongElementOffset;
        long j;
        AtomicLongArray atomicLongArray = this.sequenceBuffer;
        int i2 = this.mask;
        AtomicReferenceArray<E> atomicReferenceArray = this.buffer;
        for (int i3 = 0; i3 < i; i3++) {
            while (true) {
                jLvProducerIndex = lvProducerIndex();
                iCalcCircularLongElementOffset = AtomicQueueUtil.calcCircularLongElementOffset(jLvProducerIndex, i2);
                long jLvLongElement = AtomicQueueUtil.lvLongElement(atomicLongArray, iCalcCircularLongElementOffset);
                if (jLvLongElement < jLvProducerIndex) {
                    return i3;
                }
                if (jLvLongElement <= jLvProducerIndex) {
                    j = 1 + jLvProducerIndex;
                    if (casProducerIndex(jLvProducerIndex, j)) {
                        break;
                    }
                }
            }
            AtomicQueueUtil.soRefElement(atomicReferenceArray, AtomicQueueUtil.calcCircularRefElementOffset(jLvProducerIndex, i2), supplier.get());
            AtomicQueueUtil.soLongElement(atomicLongArray, iCalcCircularLongElementOffset, j);
        }
        return i;
    }

    private boolean notAvailable(long j, int i, AtomicLongArray atomicLongArray, long j2) {
        return AtomicQueueUtil.lvLongElement(atomicLongArray, AtomicQueueUtil.calcCircularLongElementOffset(j, i)) < j2;
    }

    @Override // org.jctools.queues.atomic.AtomicReferenceArrayQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.jctools.queues.MessagePassingQueue
    public int drain(MessagePassingQueue.Consumer<E> consumer, int i) {
        int i2 = i;
        if (consumer == 0) {
            throw new IllegalArgumentException("c is null");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(OooO00o.OooO00o("limit is negative: ", i2));
        }
        if (i2 == 0) {
            return 0;
        }
        AtomicLongArray atomicLongArray = this.sequenceBuffer;
        int i3 = this.mask;
        AtomicReferenceArray<E> atomicReferenceArray = this.buffer;
        int iMin = Math.min(this.lookAheadStep, i2);
        int i4 = 0;
        while (i4 < i2) {
            int i5 = i2 - i4;
            int iMin2 = Math.min(i5, iMin);
            long jLvConsumerIndex = lvConsumerIndex();
            long j = 1;
            long j2 = (((long) iMin2) + jLvConsumerIndex) - 1;
            long jLvLongElement = AtomicQueueUtil.lvLongElement(atomicLongArray, AtomicQueueUtil.calcCircularLongElementOffset(j2, i3));
            long j3 = j2 + 1;
            if (jLvLongElement != j3 || !casConsumerIndex(jLvConsumerIndex, j3)) {
                return (jLvLongElement >= j3 || !notAvailable(jLvConsumerIndex, i3, atomicLongArray, jLvConsumerIndex + 1)) ? i4 + drainOneByOne(consumer, i5) : i4;
            }
            int i6 = 0;
            while (i6 < iMin2) {
                long j4 = ((long) i6) + jLvConsumerIndex;
                int iCalcCircularLongElementOffset = AtomicQueueUtil.calcCircularLongElementOffset(j4, i3);
                long j5 = jLvConsumerIndex;
                long j6 = i3;
                int i7 = iMin;
                int iCalcCircularRefElementOffset = AtomicQueueUtil.calcCircularRefElementOffset(j4, j6);
                while (AtomicQueueUtil.lvLongElement(atomicLongArray, iCalcCircularLongElementOffset) != j + j4) {
                }
                Object objLpRefElement = AtomicQueueUtil.lpRefElement(atomicReferenceArray, iCalcCircularRefElementOffset);
                AtomicQueueUtil.spRefElement(atomicReferenceArray, iCalcCircularRefElementOffset, null);
                AtomicQueueUtil.soLongElement(atomicLongArray, iCalcCircularLongElementOffset, j4 + j6 + 1);
                consumer.accept(objLpRefElement);
                i6++;
                j = 1;
                jLvConsumerIndex = j5;
                iMin = i7;
            }
            i4 += iMin2;
            i2 = i;
        }
        return i2;
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public int fill(MessagePassingQueue.Supplier<E> supplier, int i) {
        MpmcAtomicArrayQueue<E> mpmcAtomicArrayQueue = this;
        if (supplier == null) {
            throw new IllegalArgumentException("supplier is null");
        }
        if (i < 0) {
            throw new IllegalArgumentException(OooO00o.OooO00o("limit is negative:", i));
        }
        if (i == 0) {
            return 0;
        }
        AtomicLongArray atomicLongArray = mpmcAtomicArrayQueue.sequenceBuffer;
        int i2 = mpmcAtomicArrayQueue.mask;
        AtomicReferenceArray<E> atomicReferenceArray = mpmcAtomicArrayQueue.buffer;
        int iMin = Math.min(mpmcAtomicArrayQueue.lookAheadStep, i);
        int i3 = 0;
        while (i3 < i) {
            int i4 = i - i3;
            int iMin2 = Math.min(i4, iMin);
            long jLvProducerIndex = lvProducerIndex();
            long j = (((long) iMin2) + jLvProducerIndex) - 1;
            long jLvLongElement = AtomicQueueUtil.lvLongElement(atomicLongArray, AtomicQueueUtil.calcCircularLongElementOffset(j, i2));
            if (jLvLongElement != j || !mpmcAtomicArrayQueue.casProducerIndex(jLvProducerIndex, j + 1)) {
                return (jLvLongElement >= j || !notAvailable(jLvProducerIndex, i2, atomicLongArray, jLvProducerIndex)) ? i3 + fillOneByOne(supplier, i4) : i3;
            }
            for (int i5 = 0; i5 < iMin2; i5++) {
                long j2 = ((long) i5) + jLvProducerIndex;
                int iCalcCircularLongElementOffset = AtomicQueueUtil.calcCircularLongElementOffset(j2, i2);
                int iCalcCircularRefElementOffset = AtomicQueueUtil.calcCircularRefElementOffset(j2, i2);
                while (AtomicQueueUtil.lvLongElement(atomicLongArray, iCalcCircularLongElementOffset) != j2) {
                }
                AtomicQueueUtil.soRefElement(atomicReferenceArray, iCalcCircularRefElementOffset, supplier.get());
                AtomicQueueUtil.soLongElement(atomicLongArray, iCalcCircularLongElementOffset, j2 + 1);
            }
            i3 += iMin2;
            mpmcAtomicArrayQueue = this;
        }
        return i;
    }

    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public boolean offer(E e) {
        e.getClass();
        int i = this.mask;
        long j = i + 1;
        AtomicLongArray atomicLongArray = this.sequenceBuffer;
        long jLvConsumerIndex = Long.MIN_VALUE;
        while (true) {
            long jLvProducerIndex = lvProducerIndex();
            int iCalcCircularLongElementOffset = AtomicQueueUtil.calcCircularLongElementOffset(jLvProducerIndex, i);
            long jLvLongElement = AtomicQueueUtil.lvLongElement(atomicLongArray, iCalcCircularLongElementOffset);
            if (jLvLongElement < jLvProducerIndex) {
                long j2 = jLvProducerIndex - j;
                if (j2 >= jLvConsumerIndex) {
                    jLvConsumerIndex = lvConsumerIndex();
                    if (j2 >= jLvConsumerIndex) {
                        return false;
                    }
                }
                jLvLongElement = jLvProducerIndex + 1;
            }
            if (jLvLongElement <= jLvProducerIndex) {
                long j3 = 1 + jLvProducerIndex;
                if (casProducerIndex(jLvProducerIndex, j3)) {
                    AtomicQueueUtil.spRefElement(this.buffer, AtomicQueueUtil.calcCircularRefElementOffset(jLvProducerIndex, i), e);
                    AtomicQueueUtil.soLongElement(atomicLongArray, iCalcCircularLongElementOffset, j3);
                    return true;
                }
            }
        }
    }

    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public E peek() {
        AtomicLongArray atomicLongArray = this.sequenceBuffer;
        int i = this.mask;
        long jLvProducerIndex = -1;
        while (true) {
            long jLvConsumerIndex = lvConsumerIndex();
            long jLvLongElement = AtomicQueueUtil.lvLongElement(atomicLongArray, AtomicQueueUtil.calcCircularLongElementOffset(jLvConsumerIndex, i));
            long j = 1 + jLvConsumerIndex;
            if (jLvLongElement < j) {
                if (jLvConsumerIndex >= jLvProducerIndex) {
                    jLvProducerIndex = lvProducerIndex();
                    if (jLvConsumerIndex == jLvProducerIndex) {
                        return null;
                    }
                } else {
                    continue;
                }
            } else if (jLvLongElement == j) {
                E e = (E) AtomicQueueUtil.lvRefElement(this.buffer, AtomicQueueUtil.calcCircularRefElementOffset(jLvConsumerIndex, i));
                if (lvConsumerIndex() == jLvConsumerIndex) {
                    return e;
                }
            } else {
                continue;
            }
        }
    }

    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public E poll() {
        AtomicLongArray atomicLongArray = this.sequenceBuffer;
        int i = this.mask;
        long jLvProducerIndex = -1;
        while (true) {
            long jLvConsumerIndex = lvConsumerIndex();
            int iCalcCircularLongElementOffset = AtomicQueueUtil.calcCircularLongElementOffset(jLvConsumerIndex, i);
            long jLvLongElement = AtomicQueueUtil.lvLongElement(atomicLongArray, iCalcCircularLongElementOffset);
            long j = jLvConsumerIndex + 1;
            if (jLvLongElement < j) {
                if (jLvConsumerIndex >= jLvProducerIndex) {
                    jLvProducerIndex = lvProducerIndex();
                    if (jLvConsumerIndex == jLvProducerIndex) {
                        return null;
                    }
                }
                jLvLongElement = j + 1;
            }
            if (jLvLongElement <= j && casConsumerIndex(jLvConsumerIndex, j)) {
                long j2 = i;
                int iCalcCircularRefElementOffset = AtomicQueueUtil.calcCircularRefElementOffset(jLvConsumerIndex, j2);
                E e = (E) AtomicQueueUtil.lpRefElement(this.buffer, iCalcCircularRefElementOffset);
                AtomicQueueUtil.spRefElement(this.buffer, iCalcCircularRefElementOffset, null);
                AtomicQueueUtil.soLongElement(atomicLongArray, iCalcCircularLongElementOffset, jLvConsumerIndex + j2 + 1);
                return e;
            }
        }
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public boolean relaxedOffer(E e) {
        e.getClass();
        int i = this.mask;
        AtomicLongArray atomicLongArray = this.sequenceBuffer;
        while (true) {
            long jLvProducerIndex = lvProducerIndex();
            int iCalcCircularLongElementOffset = AtomicQueueUtil.calcCircularLongElementOffset(jLvProducerIndex, i);
            long jLvLongElement = AtomicQueueUtil.lvLongElement(atomicLongArray, iCalcCircularLongElementOffset);
            if (jLvLongElement < jLvProducerIndex) {
                return false;
            }
            if (jLvLongElement <= jLvProducerIndex) {
                long j = 1 + jLvProducerIndex;
                if (casProducerIndex(jLvProducerIndex, j)) {
                    AtomicQueueUtil.spRefElement(this.buffer, AtomicQueueUtil.calcCircularRefElementOffset(jLvProducerIndex, i), e);
                    AtomicQueueUtil.soLongElement(atomicLongArray, iCalcCircularLongElementOffset, j);
                    return true;
                }
            }
        }
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public E relaxedPeek() {
        AtomicLongArray atomicLongArray = this.sequenceBuffer;
        int i = this.mask;
        while (true) {
            long jLvConsumerIndex = lvConsumerIndex();
            long jLvLongElement = AtomicQueueUtil.lvLongElement(atomicLongArray, AtomicQueueUtil.calcCircularLongElementOffset(jLvConsumerIndex, i));
            long j = 1 + jLvConsumerIndex;
            if (jLvLongElement < j) {
                return null;
            }
            if (jLvLongElement == j) {
                E e = (E) AtomicQueueUtil.lvRefElement(this.buffer, AtomicQueueUtil.calcCircularRefElementOffset(jLvConsumerIndex, i));
                if (lvConsumerIndex() == jLvConsumerIndex) {
                    return e;
                }
            }
        }
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public E relaxedPoll() {
        AtomicLongArray atomicLongArray = this.sequenceBuffer;
        int i = this.mask;
        while (true) {
            long jLvConsumerIndex = lvConsumerIndex();
            int iCalcCircularLongElementOffset = AtomicQueueUtil.calcCircularLongElementOffset(jLvConsumerIndex, i);
            long jLvLongElement = AtomicQueueUtil.lvLongElement(atomicLongArray, iCalcCircularLongElementOffset);
            long j = jLvConsumerIndex + 1;
            if (jLvLongElement < j) {
                return null;
            }
            if (jLvLongElement <= j && casConsumerIndex(jLvConsumerIndex, j)) {
                long j2 = i;
                int iCalcCircularRefElementOffset = AtomicQueueUtil.calcCircularRefElementOffset(jLvConsumerIndex, j2);
                E e = (E) AtomicQueueUtil.lpRefElement(this.buffer, iCalcCircularRefElementOffset);
                AtomicQueueUtil.spRefElement(this.buffer, iCalcCircularRefElementOffset, null);
                AtomicQueueUtil.soLongElement(atomicLongArray, iCalcCircularLongElementOffset, jLvConsumerIndex + j2 + 1);
                return e;
            }
        }
    }

    @Override // org.jctools.queues.atomic.AtomicReferenceArrayQueue, java.util.AbstractCollection
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public int fill(MessagePassingQueue.Supplier<E> supplier) {
        return MessagePassingQueueUtil.fillBounded(this, supplier);
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public void fill(MessagePassingQueue.Supplier<E> supplier, MessagePassingQueue.WaitStrategy waitStrategy, MessagePassingQueue.ExitCondition exitCondition) {
        MessagePassingQueueUtil.fill(this, supplier, waitStrategy, exitCondition);
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public int drain(MessagePassingQueue.Consumer<E> consumer) {
        return MessagePassingQueueUtil.drain(this, consumer);
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public void drain(MessagePassingQueue.Consumer<E> consumer, MessagePassingQueue.WaitStrategy waitStrategy, MessagePassingQueue.ExitCondition exitCondition) {
        MessagePassingQueueUtil.drain(this, consumer, waitStrategy, exitCondition);
    }
}

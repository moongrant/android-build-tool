package org.jctools.queues;

import android.support.v4.media.OooO00o;
import java.util.Iterator;
import org.jctools.util.RangeUtil;
import org.jctools.util.UnsafeLongArrayAccess;
import org.jctools.util.UnsafeRefArrayAccess;

/* JADX INFO: loaded from: classes5.dex */
public class MpmcArrayQueue<E> extends MpmcArrayQueueL3Pad<E> {
    public static final int MAX_LOOK_AHEAD_STEP = Integer.getInteger("jctools.mpmc.max.lookahead.step", 4096).intValue();
    private final int lookAheadStep;

    public MpmcArrayQueue(int i) {
        super(RangeUtil.checkGreaterThanOrEqual(i, 2, "capacity"));
        this.lookAheadStep = Math.max(2, Math.min(capacity() / 4, MAX_LOOK_AHEAD_STEP));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int drainOneByOne(MessagePassingQueue.Consumer<E> consumer, int i) {
        long jLvConsumerIndex;
        long jCalcCircularLongElementOffset;
        long[] jArr;
        long[] jArr2 = this.sequenceBuffer;
        long j = this.mask;
        E[] eArr = this.buffer;
        int i2 = 0;
        while (i2 < i) {
            while (true) {
                jLvConsumerIndex = lvConsumerIndex();
                jCalcCircularLongElementOffset = UnsafeLongArrayAccess.calcCircularLongElementOffset(jLvConsumerIndex, j);
                long jLvLongElement = UnsafeLongArrayAccess.lvLongElement(jArr2, jCalcCircularLongElementOffset);
                jArr = jArr2;
                long j2 = jLvConsumerIndex + 1;
                if (jLvLongElement < j2) {
                    return i2;
                }
                if (jLvLongElement > j2 || !casConsumerIndex(jLvConsumerIndex, j2)) {
                    jArr2 = jArr;
                }
            }
            long jCalcCircularRefElementOffset = UnsafeRefArrayAccess.calcCircularRefElementOffset(jLvConsumerIndex, j);
            Object objLpRefElement = UnsafeRefArrayAccess.lpRefElement(eArr, jCalcCircularRefElementOffset);
            UnsafeRefArrayAccess.spRefElement(eArr, jCalcCircularRefElementOffset, null);
            UnsafeLongArrayAccess.soLongElement(jArr, jCalcCircularLongElementOffset, jLvConsumerIndex + j + 1);
            consumer.accept(objLpRefElement);
            i2++;
            jArr2 = jArr;
        }
        return i;
    }

    private int fillOneByOne(MessagePassingQueue.Supplier<E> supplier, int i) {
        long jLvProducerIndex;
        long jCalcCircularLongElementOffset;
        long j;
        long[] jArr = this.sequenceBuffer;
        long j2 = this.mask;
        E[] eArr = this.buffer;
        for (int i2 = 0; i2 < i; i2++) {
            while (true) {
                jLvProducerIndex = lvProducerIndex();
                jCalcCircularLongElementOffset = UnsafeLongArrayAccess.calcCircularLongElementOffset(jLvProducerIndex, j2);
                long jLvLongElement = UnsafeLongArrayAccess.lvLongElement(jArr, jCalcCircularLongElementOffset);
                if (jLvLongElement < jLvProducerIndex) {
                    return i2;
                }
                if (jLvLongElement <= jLvProducerIndex) {
                    j = 1 + jLvProducerIndex;
                    if (casProducerIndex(jLvProducerIndex, j)) {
                        break;
                    }
                }
            }
            UnsafeRefArrayAccess.soRefElement(eArr, UnsafeRefArrayAccess.calcCircularRefElementOffset(jLvProducerIndex, j2), supplier.get());
            UnsafeLongArrayAccess.soLongElement(jArr, jCalcCircularLongElementOffset, j);
        }
        return i;
    }

    private boolean notAvailable(long j, long j2, long[] jArr, long j3) {
        return UnsafeLongArrayAccess.lvLongElement(jArr, UnsafeLongArrayAccess.calcCircularLongElementOffset(j, j2)) < j3;
    }

    @Override // org.jctools.queues.ConcurrentCircularArrayQueue, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ int capacity() {
        return super.capacity();
    }

    @Override // org.jctools.queues.ConcurrentCircularArrayQueue, java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // org.jctools.queues.ConcurrentCircularArrayQueue, org.jctools.queues.QueueProgressIndicators
    public /* bridge */ /* synthetic */ long currentConsumerIndex() {
        return super.currentConsumerIndex();
    }

    @Override // org.jctools.queues.ConcurrentCircularArrayQueue, org.jctools.queues.QueueProgressIndicators
    public /* bridge */ /* synthetic */ long currentProducerIndex() {
        return super.currentProducerIndex();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.jctools.queues.MessagePassingQueue
    public int drain(MessagePassingQueue.Consumer<E> consumer, int i) {
        MpmcArrayQueue<E> mpmcArrayQueue = this;
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
        long[] jArr = mpmcArrayQueue.sequenceBuffer;
        long j = mpmcArrayQueue.mask;
        E[] eArr = mpmcArrayQueue.buffer;
        int iMin = Math.min(mpmcArrayQueue.lookAheadStep, i2);
        int i3 = 0;
        while (i3 < i2) {
            int i4 = i2 - i3;
            int iMin2 = Math.min(i4, iMin);
            long jLvConsumerIndex = lvConsumerIndex();
            long j2 = (((long) iMin2) + jLvConsumerIndex) - 1;
            int i5 = iMin;
            long jLvLongElement = UnsafeLongArrayAccess.lvLongElement(jArr, UnsafeLongArrayAccess.calcCircularLongElementOffset(j2, j));
            long j3 = j2 + 1;
            if (jLvLongElement != j3 || !mpmcArrayQueue.casConsumerIndex(jLvConsumerIndex, j3)) {
                return (jLvLongElement >= j3 || !notAvailable(jLvConsumerIndex, j, jArr, jLvConsumerIndex + 1)) ? i3 + drainOneByOne(consumer, i4) : i3;
            }
            int i6 = 0;
            while (i6 < iMin2) {
                long j4 = ((long) i6) + jLvConsumerIndex;
                long jCalcCircularLongElementOffset = UnsafeLongArrayAccess.calcCircularLongElementOffset(j4, j);
                long j5 = jLvConsumerIndex;
                long jCalcCircularRefElementOffset = UnsafeRefArrayAccess.calcCircularRefElementOffset(j4, j);
                while (UnsafeLongArrayAccess.lvLongElement(jArr, jCalcCircularLongElementOffset) != j4 + 1) {
                }
                Object objLpRefElement = UnsafeRefArrayAccess.lpRefElement(eArr, jCalcCircularRefElementOffset);
                UnsafeRefArrayAccess.spRefElement(eArr, jCalcCircularRefElementOffset, null);
                UnsafeLongArrayAccess.soLongElement(jArr, jCalcCircularLongElementOffset, j4 + j + 1);
                consumer.accept(objLpRefElement);
                i6++;
                jLvConsumerIndex = j5;
            }
            i3 += iMin2;
            mpmcArrayQueue = this;
            i2 = i;
            iMin = i5;
        }
        return i2;
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public int fill(MessagePassingQueue.Supplier<E> supplier, int i) {
        MpmcArrayQueue<E> mpmcArrayQueue = this;
        if (supplier == null) {
            throw new IllegalArgumentException("supplier is null");
        }
        if (i < 0) {
            throw new IllegalArgumentException(OooO00o.OooO00o("limit is negative:", i));
        }
        if (i == 0) {
            return 0;
        }
        long[] jArr = mpmcArrayQueue.sequenceBuffer;
        long j = mpmcArrayQueue.mask;
        E[] eArr = mpmcArrayQueue.buffer;
        int iMin = Math.min(mpmcArrayQueue.lookAheadStep, i);
        int i2 = 0;
        while (i2 < i) {
            int i3 = i - i2;
            int iMin2 = Math.min(i3, iMin);
            long jLvProducerIndex = lvProducerIndex();
            long j2 = (((long) iMin2) + jLvProducerIndex) - 1;
            int i4 = iMin;
            long jLvLongElement = UnsafeLongArrayAccess.lvLongElement(jArr, UnsafeLongArrayAccess.calcCircularLongElementOffset(j2, j));
            if (jLvLongElement != j2 || !mpmcArrayQueue.casProducerIndex(jLvProducerIndex, j2 + 1)) {
                return (jLvLongElement >= j2 || !notAvailable(jLvProducerIndex, j, jArr, jLvProducerIndex)) ? i2 + fillOneByOne(supplier, i3) : i2;
            }
            int i5 = 0;
            while (i5 < iMin2) {
                long j3 = ((long) i5) + jLvProducerIndex;
                long jCalcCircularLongElementOffset = UnsafeLongArrayAccess.calcCircularLongElementOffset(j3, j);
                long j4 = jLvProducerIndex;
                long jCalcCircularRefElementOffset = UnsafeRefArrayAccess.calcCircularRefElementOffset(j3, j);
                while (UnsafeLongArrayAccess.lvLongElement(jArr, jCalcCircularLongElementOffset) != j3) {
                }
                UnsafeRefArrayAccess.soRefElement(eArr, jCalcCircularRefElementOffset, supplier.get());
                UnsafeLongArrayAccess.soLongElement(jArr, jCalcCircularLongElementOffset, j3 + 1);
                i5++;
                jLvProducerIndex = j4;
            }
            i2 += iMin2;
            mpmcArrayQueue = this;
            iMin = i4;
        }
        return i;
    }

    @Override // org.jctools.queues.ConcurrentCircularArrayQueue, java.util.AbstractCollection, java.util.Collection, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // org.jctools.queues.ConcurrentCircularArrayQueue, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public boolean offer(E e) {
        e.getClass();
        long j = this.mask;
        long j2 = j + 1;
        long[] jArr = this.sequenceBuffer;
        long jLvConsumerIndex = Long.MIN_VALUE;
        while (true) {
            long jLvProducerIndex = lvProducerIndex();
            long jCalcCircularLongElementOffset = UnsafeLongArrayAccess.calcCircularLongElementOffset(jLvProducerIndex, j);
            long jLvLongElement = UnsafeLongArrayAccess.lvLongElement(jArr, jCalcCircularLongElementOffset);
            if (jLvLongElement < jLvProducerIndex) {
                long j3 = jLvProducerIndex - j2;
                if (j3 >= jLvConsumerIndex) {
                    jLvConsumerIndex = lvConsumerIndex();
                    if (j3 >= jLvConsumerIndex) {
                        return false;
                    }
                }
                jLvLongElement = jLvProducerIndex + 1;
            }
            if (jLvLongElement <= jLvProducerIndex) {
                long j4 = jLvProducerIndex + 1;
                if (casProducerIndex(jLvProducerIndex, j4)) {
                    UnsafeRefArrayAccess.spRefElement(this.buffer, UnsafeRefArrayAccess.calcCircularRefElementOffset(jLvProducerIndex, j), e);
                    UnsafeLongArrayAccess.soLongElement(jArr, jCalcCircularLongElementOffset, j4);
                    return true;
                }
            }
        }
    }

    @Override // java.util.Queue, org.jctools.queues.MessagePassingQueue
    public E peek() {
        long[] jArr = this.sequenceBuffer;
        long j = this.mask;
        long jLvProducerIndex = -1;
        while (true) {
            long jLvConsumerIndex = lvConsumerIndex();
            long jLvLongElement = UnsafeLongArrayAccess.lvLongElement(jArr, UnsafeLongArrayAccess.calcCircularLongElementOffset(jLvConsumerIndex, j));
            long j2 = 1 + jLvConsumerIndex;
            if (jLvLongElement < j2) {
                if (jLvConsumerIndex >= jLvProducerIndex) {
                    jLvProducerIndex = lvProducerIndex();
                    if (jLvConsumerIndex == jLvProducerIndex) {
                        return null;
                    }
                } else {
                    continue;
                }
            } else if (jLvLongElement == j2) {
                E e = (E) UnsafeRefArrayAccess.lvRefElement(this.buffer, UnsafeRefArrayAccess.calcCircularRefElementOffset(jLvConsumerIndex, j));
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
        long[] jArr = this.sequenceBuffer;
        long j = this.mask;
        long jLvProducerIndex = -1;
        while (true) {
            long jLvConsumerIndex = lvConsumerIndex();
            long jCalcCircularLongElementOffset = UnsafeLongArrayAccess.calcCircularLongElementOffset(jLvConsumerIndex, j);
            long jLvLongElement = UnsafeLongArrayAccess.lvLongElement(jArr, jCalcCircularLongElementOffset);
            long j2 = jLvConsumerIndex + 1;
            if (jLvLongElement < j2) {
                if (jLvConsumerIndex >= jLvProducerIndex) {
                    jLvProducerIndex = lvProducerIndex();
                    if (jLvConsumerIndex == jLvProducerIndex) {
                        return null;
                    }
                }
                jLvLongElement = j2 + 1;
            }
            if (jLvLongElement <= j2 && casConsumerIndex(jLvConsumerIndex, j2)) {
                long jCalcCircularRefElementOffset = UnsafeRefArrayAccess.calcCircularRefElementOffset(jLvConsumerIndex, j);
                E e = (E) UnsafeRefArrayAccess.lpRefElement(this.buffer, jCalcCircularRefElementOffset);
                UnsafeRefArrayAccess.spRefElement(this.buffer, jCalcCircularRefElementOffset, null);
                UnsafeLongArrayAccess.soLongElement(jArr, jCalcCircularLongElementOffset, jLvConsumerIndex + j + 1);
                return e;
            }
        }
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public boolean relaxedOffer(E e) {
        e.getClass();
        long j = this.mask;
        long[] jArr = this.sequenceBuffer;
        while (true) {
            long jLvProducerIndex = lvProducerIndex();
            long jCalcCircularLongElementOffset = UnsafeLongArrayAccess.calcCircularLongElementOffset(jLvProducerIndex, j);
            long jLvLongElement = UnsafeLongArrayAccess.lvLongElement(jArr, jCalcCircularLongElementOffset);
            if (jLvLongElement < jLvProducerIndex) {
                return false;
            }
            if (jLvLongElement <= jLvProducerIndex) {
                long j2 = 1 + jLvProducerIndex;
                if (casProducerIndex(jLvProducerIndex, j2)) {
                    UnsafeRefArrayAccess.spRefElement(this.buffer, UnsafeRefArrayAccess.calcCircularRefElementOffset(jLvProducerIndex, j), e);
                    UnsafeLongArrayAccess.soLongElement(jArr, jCalcCircularLongElementOffset, j2);
                    return true;
                }
            }
        }
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public E relaxedPeek() {
        long[] jArr = this.sequenceBuffer;
        long j = this.mask;
        while (true) {
            long jLvConsumerIndex = lvConsumerIndex();
            long jLvLongElement = UnsafeLongArrayAccess.lvLongElement(jArr, UnsafeLongArrayAccess.calcCircularLongElementOffset(jLvConsumerIndex, j));
            long j2 = 1 + jLvConsumerIndex;
            if (jLvLongElement < j2) {
                return null;
            }
            if (jLvLongElement == j2) {
                E e = (E) UnsafeRefArrayAccess.lvRefElement(this.buffer, UnsafeRefArrayAccess.calcCircularRefElementOffset(jLvConsumerIndex, j));
                if (lvConsumerIndex() == jLvConsumerIndex) {
                    return e;
                }
            }
        }
    }

    @Override // org.jctools.queues.MessagePassingQueue
    public E relaxedPoll() {
        long[] jArr = this.sequenceBuffer;
        long j = this.mask;
        while (true) {
            long jLvConsumerIndex = lvConsumerIndex();
            long jCalcCircularLongElementOffset = UnsafeLongArrayAccess.calcCircularLongElementOffset(jLvConsumerIndex, j);
            long jLvLongElement = UnsafeLongArrayAccess.lvLongElement(jArr, jCalcCircularLongElementOffset);
            long j2 = jLvConsumerIndex + 1;
            if (jLvLongElement < j2) {
                return null;
            }
            if (jLvLongElement <= j2 && casConsumerIndex(jLvConsumerIndex, j2)) {
                long jCalcCircularRefElementOffset = UnsafeRefArrayAccess.calcCircularRefElementOffset(jLvConsumerIndex, j);
                E e = (E) UnsafeRefArrayAccess.lpRefElement(this.buffer, jCalcCircularRefElementOffset);
                UnsafeRefArrayAccess.spRefElement(this.buffer, jCalcCircularRefElementOffset, null);
                UnsafeLongArrayAccess.soLongElement(jArr, jCalcCircularLongElementOffset, jLvConsumerIndex + j + 1);
                return e;
            }
        }
    }

    @Override // org.jctools.queues.ConcurrentCircularArrayQueue, java.util.AbstractCollection, java.util.Collection, org.jctools.queues.MessagePassingQueue
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // org.jctools.queues.ConcurrentCircularArrayQueue, java.util.AbstractCollection
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

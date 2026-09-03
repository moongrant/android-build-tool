package org.jctools.queues;

import java.util.Arrays;
import org.jctools.util.UnsafeLongArrayAccess;

/* JADX INFO: loaded from: classes5.dex */
final class MpmcUnboundedXaddChunk<E> extends MpUnboundedXaddChunk<MpmcUnboundedXaddChunk<E>, E> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final long[] sequence;

    public MpmcUnboundedXaddChunk(long j, MpmcUnboundedXaddChunk<E> mpmcUnboundedXaddChunk, int i, boolean z) {
        super(j, mpmcUnboundedXaddChunk, i, z);
        if (!z) {
            this.sequence = null;
            return;
        }
        long[] jArrAllocateLongArray = UnsafeLongArrayAccess.allocateLongArray(i);
        this.sequence = jArrAllocateLongArray;
        Arrays.fill(jArrAllocateLongArray, -1L);
    }

    public long lvSequence(int i) {
        return UnsafeLongArrayAccess.lvLongElement(this.sequence, UnsafeLongArrayAccess.calcLongElementOffset(i));
    }

    public void soSequence(int i, long j) {
        UnsafeLongArrayAccess.soLongElement(this.sequence, UnsafeLongArrayAccess.calcLongElementOffset(i), j);
    }

    public void spinForSequence(int i, long j) {
        while (UnsafeLongArrayAccess.lvLongElement(this.sequence, UnsafeLongArrayAccess.calcLongElementOffset(i)) != j) {
        }
    }
}

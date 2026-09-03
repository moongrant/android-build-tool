package org.jctools.queues;

import org.jctools.util.UnsafeRefArrayAccess;

/* JADX INFO: loaded from: classes5.dex */
final class LinkedArrayQueueUtil {
    public static int length(Object[] objArr) {
        return objArr.length;
    }

    public static long modifiedCalcCircularRefElementOffset(long j, long j2) {
        return UnsafeRefArrayAccess.REF_ARRAY_BASE + ((j & j2) << (UnsafeRefArrayAccess.REF_ELEMENT_SHIFT - 1));
    }

    public static long nextArrayOffset(Object[] objArr) {
        return UnsafeRefArrayAccess.REF_ARRAY_BASE + (((long) (length(objArr) - 1)) << UnsafeRefArrayAccess.REF_ELEMENT_SHIFT);
    }
}

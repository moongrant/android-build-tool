package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Comparator;
import java.util.Objects;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
public final class o0oO0Ooo {
    public static boolean OooO00o(Comparator<?> comparator, Iterable<?> iterable) {
        Object objComparator;
        Objects.requireNonNull(comparator);
        Objects.requireNonNull(iterable);
        if (iterable instanceof SortedSet) {
            objComparator = ((SortedSet) iterable).comparator();
            if (objComparator == null) {
                objComparator = o0o0Oo.f18676Oooo0o;
            }
        } else {
            if (!(iterable instanceof o0O00OOO)) {
                return false;
            }
            objComparator = ((o0O00OOO) iterable).comparator();
        }
        return comparator.equals(objComparator);
    }
}

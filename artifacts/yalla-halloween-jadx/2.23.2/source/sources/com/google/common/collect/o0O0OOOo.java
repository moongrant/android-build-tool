package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class o0O0OOOo {
    public static boolean OooO00o(Iterable iterable, Comparator comparator) {
        Object objComparator;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            objComparator = ((SortedSet) iterable).comparator();
            if (objComparator == null) {
                objComparator = o0O0o.f19109OooO0Oo;
            }
        } else {
            if (!(iterable instanceof o0O0OOO0)) {
                return false;
            }
            objComparator = ((o0O0OOO0) iterable).comparator();
        }
        return comparator.equals(objComparator);
    }
}

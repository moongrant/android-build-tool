package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
public final class o0oO0Ooo extends o0O000<Comparable<?>> implements Serializable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0oO0Ooo f19647OooO0Oo = new o0oO0Ooo();

    private Object readResolve() {
        return f19647OooO0Oo;
    }

    @Override // com.google.common.collect.o0O000
    public final <S extends Comparable<?>> o0O000<S> OooO0O0() {
        return o0O0o.f19585OooO0Oo;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}

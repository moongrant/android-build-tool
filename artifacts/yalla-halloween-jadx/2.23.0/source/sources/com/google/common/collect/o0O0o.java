package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
public final class o0O0o extends o0O000<Comparable<?>> implements Serializable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0O0o f19585OooO0Oo = new o0O0o();

    private Object readResolve() {
        return f19585OooO0Oo;
    }

    @Override // com.google.common.collect.o0O000
    public final <S extends Comparable<?>> o0O000<S> OooO0O0() {
        return o0oO0Ooo.f19647OooO0Oo;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}

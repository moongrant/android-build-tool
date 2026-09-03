package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(serializable = true)
public final class o0O000Oo extends o0oOO<Comparable> implements Serializable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final o0O000Oo f18601Oooo0o = new o0O000Oo();

    private Object readResolve() {
        return f18601Oooo0o;
    }

    @Override // com.google.common.collect.o0oOO
    public final <S extends Comparable> o0oOO<S> OooO0O0() {
        return o0o0Oo.f18676Oooo0o;
    }

    @Override // com.google.common.collect.o0oOO, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        Objects.requireNonNull(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}

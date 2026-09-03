package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
public abstract class o000O000<E> extends o000OO<E> implements o00OO<E> {
    @Override // com.google.common.collect.o00OO
    @CanIgnoreReturnValue
    public final int OooOOO(Object obj, int i) {
        return ((Oooo000) ((o0000) this)).f18367Oooo.OooOOO(obj, i);
    }

    @Override // com.google.common.collect.o00OO
    @CanIgnoreReturnValue
    public final int OooOOo(E e, int i) {
        return ((Oooo000) ((o0000) this)).f18367Oooo.OooOOo(e, i);
    }

    @Override // com.google.common.collect.o00OO
    @CanIgnoreReturnValue
    public final boolean Oooo0(Object obj, int i) {
        return ((Oooo000) ((o0000) this)).f18367Oooo.Oooo0(obj, i);
    }

    @Override // com.google.common.collect.o00OO
    public final int Ooooo0o(Object obj) {
        return ((TreeMultiset) ((Oooo000) ((o0000) this)).f18367Oooo).Ooooo0o(obj);
    }

    @Override // java.util.Collection, com.google.common.collect.o00OO
    public final boolean equals(@NullableDecl Object obj) {
        return obj == this || ((Oooo000) ((o0000) this)).f18367Oooo.equals(obj);
    }

    @Override // java.util.Collection, com.google.common.collect.o00OO
    public final int hashCode() {
        return ((Oooo000) ((o0000) this)).f18367Oooo.hashCode();
    }

    @Override // com.google.common.collect.o00OO
    @CanIgnoreReturnValue
    public final int o0000O0O(Object obj) {
        return ((Oooo000) ((o0000) this)).f18367Oooo.o0000O0O(obj);
    }
}

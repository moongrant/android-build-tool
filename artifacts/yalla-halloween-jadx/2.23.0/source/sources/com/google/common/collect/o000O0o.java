package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class o000O0o<E> extends o0000O<E> implements o0oOO<E> {
    @Override // com.google.common.collect.o0oOO
    @CanIgnoreReturnValue
    public final int Oooo00o(int i, @CheckForNull Object obj) {
        return ((Oooo000) ((o0000oo) this)).f19361OooO0oO.Oooo00o(i, obj);
    }

    @Override // com.google.common.collect.o0oOO
    @CanIgnoreReturnValue
    public final int Oooooo(@ParametricNullness E e, int i) {
        return ((Oooo000) ((o0000oo) this)).f19361OooO0oO.Oooooo(e, i);
    }

    @Override // java.util.Collection, com.google.common.collect.o0oOO
    public final boolean equals(@CheckForNull Object obj) {
        return obj == this || ((Oooo000) ((o0000oo) this)).f19361OooO0oO.equals(obj);
    }

    @Override // java.util.Collection, com.google.common.collect.o0oOO
    public final int hashCode() {
        return ((Oooo000) ((o0000oo) this)).f19361OooO0oO.hashCode();
    }

    @Override // com.google.common.collect.o0oOO
    @CanIgnoreReturnValue
    public final int o0000OOo(@ParametricNullness Object obj) {
        return ((Oooo000) ((o0000oo) this)).f19361OooO0oO.o0000OOo(obj);
    }

    @Override // com.google.common.collect.o0oOO
    public final int o000OOo(@CheckForNull Object obj) {
        return ((TreeMultiset) ((Oooo000) ((o0000oo) this)).f19361OooO0oO).o000OOo(obj);
    }

    @Override // com.google.common.collect.o0oOO
    @CanIgnoreReturnValue
    public final boolean o00Oo0(int i, @ParametricNullness Object obj) {
        return ((Oooo000) ((o0000oo) this)).f19361OooO0oO.o00Oo0(i, obj);
    }
}

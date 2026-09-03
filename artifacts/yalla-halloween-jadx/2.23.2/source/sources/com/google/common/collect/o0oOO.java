package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CompatibleWith;
import java.util.Collection;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public interface o0oOO<E> extends Collection<E> {

    public interface OooO00o<E> {
        int getCount();

        @ParametricNullness
        E getElement();
    }

    Set<E> OooO0oO();

    @CanIgnoreReturnValue
    int Oooo00o(int i, @CheckForNull @CompatibleWith("E") Object obj);

    @CanIgnoreReturnValue
    int Oooooo(@ParametricNullness E e, int i);

    Set<OooO00o<E>> entrySet();

    boolean equals(@CheckForNull Object obj);

    int hashCode();

    int o000000O(@CheckForNull @CompatibleWith("E") Object obj);

    @CanIgnoreReturnValue
    int o0000OOo(@ParametricNullness Object obj);

    @CanIgnoreReturnValue
    boolean o00o0O(int i, @ParametricNullness Object obj);
}

package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public interface oo0OOoo<E> extends o0oOO, o0O0OOO0<E> {
    @Override // com.google.common.collect.o0oOO
    NavigableSet<E> OooO0oO();

    oo0OOoo<E> OoooOoo(@ParametricNullness E e, BoundType boundType, @ParametricNullness E e2, BoundType boundType2);

    Comparator<? super E> comparator();

    @Override // com.google.common.collect.o0oOO
    Set<o0oOO.OooO00o<E>> entrySet();

    @CheckForNull
    o0oOO.OooO00o<E> firstEntry();

    @CheckForNull
    o0oOO.OooO00o<E> lastEntry();

    oo0OOoo<E> o000000(@ParametricNullness E e, BoundType boundType);

    oo0OOoo<E> o00000OO(@ParametricNullness E e, BoundType boundType);

    oo0OOoo<E> o00Ooo();

    @CheckForNull
    o0oOO.OooO00o<E> pollFirstEntry();

    @CheckForNull
    o0oOO.OooO00o<E> pollLastEntry();
}

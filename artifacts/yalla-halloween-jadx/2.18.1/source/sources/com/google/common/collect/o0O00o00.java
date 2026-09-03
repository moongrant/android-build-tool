package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true)
public interface o0O00o00<E> extends o00OO, o0O00OOO<E> {
    @Override // com.google.common.collect.o00OO
    NavigableSet<E> OooO0Oo();

    o0O00o00<E> OooOoOO();

    o0O00o00<E> OoooOOo(E e, BoundType boundType);

    Comparator<? super E> comparator();

    @Override // com.google.common.collect.o00OO
    Set<o00OO.OooO00o<E>> entrySet();

    o00OO.OooO00o<E> firstEntry();

    o00OO.OooO00o<E> lastEntry();

    o0O00o00<E> o0000oO(E e, BoundType boundType, E e2, BoundType boundType2);

    o0O00o00<E> o0OoOo0(E e, BoundType boundType);

    o00OO.OooO00o<E> pollFirstEntry();

    o00OO.OooO00o<E> pollLastEntry();
}

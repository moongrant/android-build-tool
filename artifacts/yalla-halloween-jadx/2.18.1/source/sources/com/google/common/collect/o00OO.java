package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CompatibleWith;
import java.util.Collection;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
public interface o00OO<E> extends Collection<E> {

    public interface OooO00o<E> {
        int getCount();

        E getElement();
    }

    Set<E> OooO0Oo();

    @CanIgnoreReturnValue
    int OooOOO(@NullableDecl @CompatibleWith("E") Object obj, int i);

    @CanIgnoreReturnValue
    int OooOOo(@NullableDecl E e, int i);

    @CanIgnoreReturnValue
    boolean Oooo0(Object obj, int i);

    int Ooooo0o(@NullableDecl @CompatibleWith("E") Object obj);

    boolean contains(@NullableDecl Object obj);

    @Override // java.util.Collection
    boolean containsAll(Collection<?> collection);

    Set<OooO00o<E>> entrySet();

    boolean equals(@NullableDecl Object obj);

    int hashCode();

    @CanIgnoreReturnValue
    int o0000O0O(Object obj);

    @CanIgnoreReturnValue
    boolean remove(@NullableDecl Object obj);

    int size();
}

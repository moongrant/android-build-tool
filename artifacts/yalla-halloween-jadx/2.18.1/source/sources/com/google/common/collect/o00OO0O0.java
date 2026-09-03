package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CompatibleWith;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
public interface o00OO0O0<K, V> {
    @CanIgnoreReturnValue
    Collection<V> OooO00o(@NullableDecl @CompatibleWith("K") Object obj);

    Map<K, Collection<V>> OooO0O0();

    void clear();

    boolean containsKey(@NullableDecl @CompatibleWith("K") Object obj);

    Collection<V> get(@NullableDecl K k);

    boolean isEmpty();

    Set<K> keySet();

    @CanIgnoreReturnValue
    boolean remove(@NullableDecl @CompatibleWith("K") Object obj, @NullableDecl @CompatibleWith("V") Object obj2);

    int size();
}

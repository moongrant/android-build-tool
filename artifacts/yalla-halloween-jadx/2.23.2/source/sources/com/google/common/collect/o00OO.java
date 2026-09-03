package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CompatibleWith;
import com.google.errorprone.annotations.DoNotMock;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@DoNotMock("Use ImmutableMultimap, HashMultimap, or another implementation")
@GwtCompatible
@ElementTypesAreNonnullByDefault
public interface o00OO<K, V> {
    Map<K, Collection<V>> OooO0Oo();

    @CanIgnoreReturnValue
    Collection<V> OooO0o0(@CheckForNull @CompatibleWith("K") Object obj);

    void clear();

    boolean containsKey(@CheckForNull @CompatibleWith("K") Object obj);

    Collection<V> get(@ParametricNullness K k);

    boolean isEmpty();

    Set<K> keySet();

    @CanIgnoreReturnValue
    boolean remove(@CheckForNull @CompatibleWith("K") Object obj, @CheckForNull @CompatibleWith("V") Object obj2);

    int size();
}

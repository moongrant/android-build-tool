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
    @CanIgnoreReturnValue
    Collection<V> OooO00o(@CheckForNull @CompatibleWith("K") Object obj);

    Map<K, Collection<V>> OooO0O0();

    void clear();

    boolean containsKey(@CheckForNull @CompatibleWith("K") Object obj);

    Collection<V> get(@ParametricNullness K k);

    boolean isEmpty();

    Set<K> keySet();

    @CanIgnoreReturnValue
    boolean remove(@CheckForNull @CompatibleWith("K") Object obj, @CheckForNull @CompatibleWith("V") Object obj2);

    int size();
}

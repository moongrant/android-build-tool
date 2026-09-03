package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class o000<K, V> extends o000Oo0 implements Map<K, V> {
    @Override // com.google.common.collect.o000Oo0
    /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
    public abstract Map<K, V> OooO00o();

    public void clear() {
        OooO00o().clear();
    }

    public boolean containsKey(@CheckForNull Object obj) {
        return OooO00o().containsKey(obj);
    }

    public boolean containsValue(@CheckForNull Object obj) {
        return OooO00o().containsValue(obj);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return OooO00o().entrySet();
    }

    public boolean equals(@CheckForNull Object obj) {
        return obj == this || OooO00o().equals(obj);
    }

    @CheckForNull
    public V get(@CheckForNull Object obj) {
        return OooO00o().get(obj);
    }

    public int hashCode() {
        return OooO00o().hashCode();
    }

    public boolean isEmpty() {
        return OooO00o().isEmpty();
    }

    public Set<K> keySet() {
        return OooO00o().keySet();
    }

    @CanIgnoreReturnValue
    @CheckForNull
    public V put(@ParametricNullness K k, @ParametricNullness V v) {
        return OooO00o().put(k, v);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        OooO00o().putAll(map);
    }

    @CanIgnoreReturnValue
    @CheckForNull
    public V remove(@CheckForNull Object obj) {
        return OooO00o().remove(obj);
    }

    public int size() {
        return OooO00o().size();
    }

    public Collection<V> values() {
        return OooO00o().values();
    }
}

package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
public abstract class o0000OO0<K, V> extends o000O0o implements Map<K, V> {
    @Override // com.google.common.collect.o000O0o
    /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
    public abstract Map<K, V> OooO00o();

    public void clear() {
        OooO00o().clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(@NullableDecl Object obj) {
        return OooO00o().containsKey(obj);
    }

    public boolean containsValue(@NullableDecl Object obj) {
        return OooO00o().containsValue(obj);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return OooO00o().entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(@NullableDecl Object obj) {
        return obj == this || OooO00o().equals(obj);
    }

    @Override // java.util.Map
    public final V get(@NullableDecl Object obj) {
        return OooO00o().get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return OooO00o().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return OooO00o().isEmpty();
    }

    public Set<K> keySet() {
        return OooO00o().keySet();
    }

    @CanIgnoreReturnValue
    public V put(K k, V v) {
        return OooO00o().put(k, v);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        OooO00o().putAll(map);
    }

    @CanIgnoreReturnValue
    public V remove(Object obj) {
        return OooO00o().remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return OooO00o().size();
    }

    public Collection<V> values() {
        return OooO00o().values();
    }
}

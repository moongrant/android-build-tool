package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
public abstract class OooO<K, V> extends OooOO0<K, V> {
    public OooO(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // com.google.common.collect.OooOO0, com.google.common.collect.o00OO0O0
    @CanIgnoreReturnValue
    public final Collection OooO00o(@NullableDecl Object obj) {
        return (List) super.OooO00o(obj);
    }

    @Override // com.google.common.collect.OooOOO, com.google.common.collect.o00OO0O0
    public final Map<K, Collection<V>> OooO0O0() {
        return super.OooO0O0();
    }

    @Override // com.google.common.collect.OooOO0
    public final Collection OooOO0o() {
        return Collections.emptyList();
    }

    @Override // com.google.common.collect.OooOO0
    public final <E> Collection<E> OooOOO(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // com.google.common.collect.OooOO0
    public final Collection<V> OooOOOO(K k, Collection<V> collection) {
        List list = (List) collection;
        return list instanceof RandomAccess ? new OooOO0.OooOO0O(this, k, list, null) : new OooOO0.OooOo00(k, list, null);
    }

    @Override // com.google.common.collect.OooOOO
    public final boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.o00OO0O0
    public final Collection get(@NullableDecl Object obj) {
        Collection<V> collectionOooO = this.f18314Oooo.get(obj);
        if (collectionOooO == null) {
            collectionOooO = OooO();
        }
        return (List) OooOOOO(obj, collectionOooO);
    }
}

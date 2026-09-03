package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
public abstract class OooOo<K, V> extends OooOO0<K, V> implements o0OoO00O<K, V> {
    public OooOo(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // com.google.common.collect.OooOOO, com.google.common.collect.o00OO0O0
    public Map<K, Collection<V>> OooO0O0() {
        return super.OooO0O0();
    }

    @Override // com.google.common.collect.OooOO0
    public <E> Collection<E> OooOOO(Collection<E> collection) {
        return Collections.unmodifiableSet((Set) collection);
    }

    @Override // com.google.common.collect.OooOO0
    public Collection<V> OooOOOO(K k, Collection<V> collection) {
        return new OooOO0.Oooo000(k, (Set) collection);
    }

    @Override // com.google.common.collect.OooOO0
    /* JADX INFO: renamed from: OooOOOo, reason: merged with bridge method [inline-methods] */
    public Set<V> OooOO0o() {
        return Collections.emptySet();
    }

    @Override // com.google.common.collect.OooOO0, com.google.common.collect.o00OO0O0
    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: OooOOo, reason: merged with bridge method [inline-methods] */
    public Set<V> OooO00o(@NullableDecl Object obj) {
        return (Set) super.OooO00o(obj);
    }

    @Override // com.google.common.collect.o00OO0O0
    /* JADX INFO: renamed from: OooOOo0, reason: merged with bridge method [inline-methods] */
    public Set<V> get(@NullableDecl K k) {
        Collection<V> collectionOooOO0 = this.f18314Oooo.get(k);
        if (collectionOooOO0 == null) {
            collectionOooOO0 = OooOO0(k);
        }
        return (Set) OooOOOO(k, collectionOooOO0);
    }

    @Override // com.google.common.collect.OooOOO
    public final boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }
}

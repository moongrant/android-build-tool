package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class OooOo<K, V> extends OooOO0<K, V> implements o0O0O0O<K, V> {
    public OooOo(o0OO00O o0oo00o2) {
        super(o0oo00o2);
    }

    @Override // com.google.common.collect.OooOOO, com.google.common.collect.o00OO
    public Map<K, Collection<V>> OooO0O0() {
        return super.OooO0O0();
    }

    @Override // com.google.common.collect.OooOO0
    public <E> Collection<E> OooOOoo(Collection<E> collection) {
        return Collections.unmodifiableSet((Set) collection);
    }

    @Override // com.google.common.collect.o00OO
    /* JADX INFO: renamed from: OooOo, reason: merged with bridge method [inline-methods] */
    public Set<V> get(@ParametricNullness K k) {
        Collection<V> collectionOooOO0o = this.f19307OooO0oo.get(k);
        if (collectionOooOO0o == null) {
            collectionOooOO0o = OooOO0o(k);
        }
        return (Set) OooOo0(collectionOooOO0o, k);
    }

    @Override // com.google.common.collect.OooOO0
    public Collection OooOo0(Collection collection, @ParametricNullness Object obj) {
        return new OooOO0.Oooo0(obj, (Set) collection);
    }

    @Override // com.google.common.collect.OooOO0
    /* JADX INFO: renamed from: OooOo0O, reason: merged with bridge method [inline-methods] */
    public Set<V> OooOOOO() {
        return Collections.emptySet();
    }

    @Override // com.google.common.collect.OooOO0, com.google.common.collect.OooOOO
    /* JADX INFO: renamed from: OooOo0o, reason: merged with bridge method [inline-methods] */
    public Set<Map.Entry<K, V>> OooO0oo() {
        return (Set) super.OooO0oo();
    }

    @Override // com.google.common.collect.OooOO0, com.google.common.collect.o00OO
    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: OooOoO0, reason: merged with bridge method [inline-methods] */
    public Set<V> OooO00o(@CheckForNull Object obj) {
        return (Set) super.OooO00o(obj);
    }

    @Override // com.google.common.collect.OooOOO
    public final boolean equals(@CheckForNull Object obj) {
        return super.equals(obj);
    }
}

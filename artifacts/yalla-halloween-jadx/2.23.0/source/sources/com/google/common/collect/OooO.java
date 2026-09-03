package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class OooO<K, V> extends OooOO0<K, V> {
    @Override // com.google.common.collect.OooOO0, com.google.common.collect.o00OO
    @CanIgnoreReturnValue
    public final Collection OooO00o(@CheckForNull Object obj) {
        return (List) super.OooO00o(obj);
    }

    @Override // com.google.common.collect.OooOOO, com.google.common.collect.o00OO
    public final Map<K, Collection<V>> OooO0O0() {
        return super.OooO0O0();
    }

    @Override // com.google.common.collect.OooOO0
    public final Collection OooOOOO() {
        return Collections.emptyList();
    }

    @Override // com.google.common.collect.OooOO0
    @CanIgnoreReturnValue
    public final boolean OooOOo0(@ParametricNullness K k, @ParametricNullness V v) {
        return super.OooOOo0(k, v);
    }

    @Override // com.google.common.collect.OooOO0
    public final <E> Collection<E> OooOOoo(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // com.google.common.collect.OooOO0
    public final Collection OooOo0(Collection collection, @ParametricNullness Object obj) {
        List list = (List) collection;
        return list instanceof RandomAccess ? new OooOO0.OooOOO0(obj, list, null) : new OooOO0.OooOo(obj, list, null);
    }

    @Override // com.google.common.collect.OooOOO
    public final boolean equals(@CheckForNull Object obj) {
        return super.equals(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.o00OO
    public final Collection get(@ParametricNullness Object obj) {
        Collection<V> collectionOooOO0o = this.f19307OooO0oo.get(obj);
        if (collectionOooOO0o == null) {
            collectionOooOO0o = OooOO0o(obj);
        }
        return (List) OooOo0(collectionOooOO0o, obj);
    }
}

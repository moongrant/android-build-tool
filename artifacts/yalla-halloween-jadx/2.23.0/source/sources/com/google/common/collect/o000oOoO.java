package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class o000oOoO<K, V> extends OooOo<K, V> {
    @Override // com.google.common.collect.OooOo, com.google.common.collect.OooOO0, com.google.common.collect.o00OO
    @CanIgnoreReturnValue
    public final Collection OooO00o(@CheckForNull Object obj) {
        return (SortedSet) super.OooO00o(obj);
    }

    @Override // com.google.common.collect.OooOo, com.google.common.collect.OooOOO, com.google.common.collect.o00OO
    public Map<K, Collection<V>> OooO0O0() {
        return super.OooO0O0();
    }

    @Override // com.google.common.collect.OooOo, com.google.common.collect.OooOO0
    public final Collection OooOOOO() {
        return o0O0O0Oo.OooO0oO(new TreeSet(((TreeMultimap) this).f19371OooOO0O));
    }

    @Override // com.google.common.collect.OooOo, com.google.common.collect.OooOO0
    public final Collection OooOOoo(Collection collection) {
        return collection instanceof NavigableSet ? o0O0O0Oo.OooO0oO((NavigableSet) collection) : Collections.unmodifiableSortedSet((SortedSet) collection);
    }

    @Override // com.google.common.collect.OooOo, com.google.common.collect.OooOO0
    public final Collection OooOo0(Collection collection, @ParametricNullness Object obj) {
        return collection instanceof NavigableSet ? new OooOO0.Oooo000(obj, (NavigableSet) collection, null) : new OooOO0.o000oOoO(obj, (SortedSet) collection, null);
    }

    @Override // com.google.common.collect.OooOO0
    public final Collection<V> OooOo00() {
        return super.OooOo00();
    }

    @Override // com.google.common.collect.OooOo
    /* JADX INFO: renamed from: OooOo0O */
    public final Set OooOOOO() {
        return o0O0O0Oo.OooO0oO(new TreeSet(((TreeMultimap) this).f19371OooOO0O));
    }

    public final SortedSet<V> OooOoO(@ParametricNullness K k) {
        return (SortedSet) super.get(k);
    }

    @Override // com.google.common.collect.OooOo
    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: OooOoO0 */
    public final Set OooO00o(@CheckForNull Object obj) {
        return (SortedSet) super.OooO00o(obj);
    }
}

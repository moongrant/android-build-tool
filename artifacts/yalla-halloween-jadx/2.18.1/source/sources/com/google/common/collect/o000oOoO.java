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
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
public abstract class o000oOoO<K, V> extends OooOo<K, V> {
    @Override // com.google.common.collect.OooOo, com.google.common.collect.OooOO0, com.google.common.collect.o00OO0O0
    @CanIgnoreReturnValue
    public final Collection OooO00o(@NullableDecl Object obj) {
        return (SortedSet) super.OooO00o(obj);
    }

    @Override // com.google.common.collect.OooOo, com.google.common.collect.OooOOO, com.google.common.collect.o00OO0O0
    public Map<K, Collection<V>> OooO0O0() {
        return super.OooO0O0();
    }

    @Override // com.google.common.collect.OooOo, com.google.common.collect.OooOO0
    public final Collection OooOO0o() {
        return o0O00O0o.OooO0o0(new TreeSet(((TreeMultimap) this).f18377OoooO0O));
    }

    @Override // com.google.common.collect.OooOo, com.google.common.collect.OooOO0
    public final Collection OooOOO(Collection collection) {
        return collection instanceof NavigableSet ? o0O00O0o.OooO0o0((NavigableSet) collection) : Collections.unmodifiableSortedSet((SortedSet) collection);
    }

    @Override // com.google.common.collect.OooOo, com.google.common.collect.OooOO0
    public final Collection<V> OooOOOO(K k, Collection<V> collection) {
        return collection instanceof NavigableSet ? new OooOO0.OooOo(k, (NavigableSet) collection, null) : new OooOO0.Oooo0(k, (SortedSet) collection, null);
    }

    @Override // com.google.common.collect.OooOo
    /* JADX INFO: renamed from: OooOOOo */
    public final Set OooOO0o() {
        return o0O00O0o.OooO0o0(new TreeSet(((TreeMultimap) this).f18377OoooO0O));
    }

    @Override // com.google.common.collect.OooOo
    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: OooOOo */
    public final Set OooO00o(@NullableDecl Object obj) {
        return (SortedSet) super.OooO00o(obj);
    }

    public final SortedSet<V> OooOOoo(@NullableDecl K k) {
        return (SortedSet) super.get(k);
    }
}

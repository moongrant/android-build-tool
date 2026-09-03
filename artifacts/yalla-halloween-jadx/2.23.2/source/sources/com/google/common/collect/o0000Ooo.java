package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public final class o0000Ooo<E> extends ImmutableSortedMultiset<E> {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final transient ImmutableSortedMultiset<E> f18954OooO0oo;

    public o0000Ooo(ImmutableSortedMultiset<E> immutableSortedMultiset) {
        this.f18954OooO0oo = immutableSortedMultiset;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean OooO0o() {
        return this.f18954OooO0oo.OooO0o();
    }

    @Override // com.google.common.collect.ImmutableMultiset
    public final o0oOO.OooO00o<E> OooOO0O(int i) {
        return this.f18954OooO0oo.entrySet().OooO00o().OooOOo0().get(i);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset
    /* JADX INFO: renamed from: OooOO0o */
    public final ImmutableSortedMultiset<E> o00Ooo() {
        return this.f18954OooO0oo;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.o0oOO
    /* JADX INFO: renamed from: OooOOO0, reason: merged with bridge method [inline-methods] */
    public final ImmutableSortedSet<E> OooO0oO() {
        return this.f18954OooO0oo.OooO0oO().descendingSet();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.oo0OOoo
    /* JADX INFO: renamed from: OooOOOO, reason: merged with bridge method [inline-methods] */
    public final ImmutableSortedMultiset<E> o000000(E e, BoundType boundType) {
        return this.f18954OooO0oo.o00000OO(e, boundType).o00Ooo();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.oo0OOoo
    /* JADX INFO: renamed from: OooOOOo, reason: merged with bridge method [inline-methods] */
    public final ImmutableSortedMultiset<E> o00000OO(E e, BoundType boundType) {
        return this.f18954OooO0oo.o000000(e, boundType).o00Ooo();
    }

    @Override // com.google.common.collect.oo0OOoo
    @CheckForNull
    public final o0oOO.OooO00o<E> firstEntry() {
        return this.f18954OooO0oo.lastEntry();
    }

    @Override // com.google.common.collect.oo0OOoo
    @CheckForNull
    public final o0oOO.OooO00o<E> lastEntry() {
        return this.f18954OooO0oo.firstEntry();
    }

    @Override // com.google.common.collect.o0oOO
    public final int o000000O(@CheckForNull Object obj) {
        return this.f18954OooO0oo.o000000O(obj);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.oo0OOoo
    public final oo0OOoo o00Ooo() {
        return this.f18954OooO0oo;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f18954OooO0oo.size();
    }
}

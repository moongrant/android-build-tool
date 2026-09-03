package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtIncompatible
public final class o00000O<E> extends ImmutableSortedMultiset<E> {

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final transient ImmutableSortedMultiset<E> f18416OoooO00;

    public o00000O(ImmutableSortedMultiset<E> immutableSortedMultiset) {
        this.f18416OoooO00 = immutableSortedMultiset;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean OooO0oo() {
        return this.f18416OoooO00.OooO0oo();
    }

    @Override // com.google.common.collect.ImmutableMultiset
    public final o00OO.OooO00o<E> OooOO0o(int i) {
        return this.f18416OoooO00.entrySet().OooO00o().OooOOoo().get(i);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset
    /* JADX INFO: renamed from: OooOOO0 */
    public final ImmutableSortedMultiset<E> OooOoOO() {
        return this.f18416OoooO00;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset
    /* JADX INFO: renamed from: OooOOOO, reason: merged with bridge method [inline-methods] */
    public final ImmutableSortedSet<E> OooO0Oo() {
        return this.f18416OoooO00.OooO0Oo().descendingSet();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.o0O00o00
    /* JADX INFO: renamed from: OooOOo0, reason: merged with bridge method [inline-methods] */
    public final ImmutableSortedMultiset<E> OoooOOo(E e, BoundType boundType) {
        return this.f18416OoooO00.o0OoOo0(e, boundType).OooOoOO();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.o0O00o00
    /* JADX INFO: renamed from: OooOOoo, reason: merged with bridge method [inline-methods] */
    public final ImmutableSortedMultiset<E> o0OoOo0(E e, BoundType boundType) {
        return this.f18416OoooO00.OoooOOo(e, boundType).OooOoOO();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.o0O00o00
    public final o0O00o00 OooOoOO() {
        return this.f18416OoooO00;
    }

    @Override // com.google.common.collect.o00OO
    public final int Ooooo0o(@NullableDecl Object obj) {
        return this.f18416OoooO00.Ooooo0o(obj);
    }

    @Override // com.google.common.collect.o0O00o00
    public final o00OO.OooO00o<E> firstEntry() {
        return this.f18416OoooO00.lastEntry();
    }

    @Override // com.google.common.collect.o0O00o00
    public final o00OO.OooO00o<E> lastEntry() {
        return this.f18416OoooO00.firstEntry();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o00OO
    public final int size() {
        return this.f18416OoooO00.size();
    }
}

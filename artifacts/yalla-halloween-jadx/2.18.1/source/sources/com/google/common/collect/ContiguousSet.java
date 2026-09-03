package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.lang.Comparable;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true)
public abstract class ContiguousSet<C extends Comparable> extends ImmutableSortedSet<C> {
    @Override // com.google.common.collect.ImmutableSortedSet
    @GwtIncompatible
    public final ImmutableSortedSet<C> OooOOo0() {
        return new o00000OO(this);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final /* bridge */ /* synthetic */ ImmutableSortedSet OooOo(Object obj, boolean z) {
        return Oooo00O();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: OooOo0O */
    public final ImmutableSortedSet headSet(Object obj) {
        Objects.requireNonNull((Comparable) obj);
        return Oooo00O();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    @GwtIncompatible
    /* JADX INFO: renamed from: OooOo0o */
    public final ImmutableSortedSet headSet(Object obj, boolean z) {
        Objects.requireNonNull((Comparable) obj);
        return Oooo00O();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final /* bridge */ /* synthetic */ ImmutableSortedSet OooOoo(Object obj, boolean z, Object obj2, boolean z2) {
        return Oooo0o0();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: OooOooO */
    public final ImmutableSortedSet tailSet(Object obj) {
        Objects.requireNonNull((Comparable) obj);
        return Oooo0o();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    @GwtIncompatible
    /* JADX INFO: renamed from: OooOooo */
    public final ImmutableSortedSet tailSet(Object obj, boolean z) {
        Objects.requireNonNull((Comparable) obj);
        return Oooo0o();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final /* bridge */ /* synthetic */ ImmutableSortedSet Oooo000(Object obj, boolean z) {
        return Oooo0o();
    }

    public abstract ContiguousSet Oooo00O();

    public abstract Range<C> Oooo00o();

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: Oooo0O0, reason: merged with bridge method [inline-methods] */
    public final ContiguousSet<C> subSet(C c, C c2) {
        Objects.requireNonNull(c);
        Objects.requireNonNull(c2);
        o0OOOO0o.OooOOOO.OooO0O0(comparator().compare(c, c2) <= 0);
        return Oooo0o0();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @GwtIncompatible
    /* JADX INFO: renamed from: Oooo0OO, reason: merged with bridge method [inline-methods] */
    public final ContiguousSet<C> subSet(C c, boolean z, C c2, boolean z2) {
        Objects.requireNonNull(c);
        Objects.requireNonNull(c2);
        o0OOOO0o.OooOOOO.OooO0O0(comparator().compare(c, c2) <= 0);
        return Oooo0o0();
    }

    public abstract ContiguousSet Oooo0o();

    public abstract ContiguousSet Oooo0o0();

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @GwtIncompatible
    public final NavigableSet headSet(Object obj, boolean z) {
        Objects.requireNonNull((Comparable) obj);
        return Oooo00O();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @GwtIncompatible
    public final NavigableSet tailSet(Object obj, boolean z) {
        Objects.requireNonNull((Comparable) obj);
        return Oooo0o();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return Oooo00o().toString();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        Objects.requireNonNull((Comparable) obj);
        return Oooo00O();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        Objects.requireNonNull((Comparable) obj);
        return Oooo0o();
    }
}

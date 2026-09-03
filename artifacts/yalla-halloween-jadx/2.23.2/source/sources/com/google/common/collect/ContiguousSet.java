package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.lang.Comparable;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public abstract class ContiguousSet<C extends Comparable> extends ImmutableSortedSet<C> {
    @Override // com.google.common.collect.ImmutableSortedSet
    @GwtIncompatible
    public final ImmutableSortedSet<C> OooOOo0() {
        return new o0000(this);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: OooOo0 */
    public final ImmutableSortedSet headSet(Object obj) {
        ((Comparable) obj).getClass();
        return OooOooO();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    @GwtIncompatible
    /* JADX INFO: renamed from: OooOo0O */
    public final ImmutableSortedSet headSet(Object obj, boolean z) {
        ((Comparable) obj).getClass();
        return OooOooO();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final /* bridge */ /* synthetic */ ImmutableSortedSet OooOo0o(Object obj, boolean z) {
        return OooOooO();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final /* bridge */ /* synthetic */ ImmutableSortedSet OooOoO(Object obj, boolean z, Object obj2, boolean z2) {
        return Oooo00O();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    @GwtIncompatible
    /* JADX INFO: renamed from: OooOoO0 */
    public final ImmutableSortedSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        com.google.common.base.o0OoOo0.OooO0Oo(comparator().compare(comparable, comparable2) <= 0);
        return Oooo00O();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: OooOoOO */
    public final ImmutableSortedSet tailSet(Object obj) {
        ((Comparable) obj).getClass();
        return Oooo0();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final /* bridge */ /* synthetic */ ImmutableSortedSet OooOoo(Object obj, boolean z) {
        return Oooo0();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    @GwtIncompatible
    /* JADX INFO: renamed from: OooOoo0 */
    public final ImmutableSortedSet tailSet(Object obj, boolean z) {
        ((Comparable) obj).getClass();
        return Oooo0();
    }

    public abstract ContiguousSet OooOooO();

    public abstract Range<C> OooOooo();

    public abstract ContiguousSet Oooo0();

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: Oooo000, reason: merged with bridge method [inline-methods] */
    public final ContiguousSet<C> subSet(C c, C c2) {
        c.getClass();
        c2.getClass();
        com.google.common.base.o0OoOo0.OooO0Oo(comparator().compare(c, c2) <= 0);
        return Oooo00O();
    }

    public abstract ContiguousSet Oooo00O();

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @GwtIncompatible
    public final NavigableSet headSet(Object obj, boolean z) {
        ((Comparable) obj).getClass();
        return OooOooO();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @GwtIncompatible
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        com.google.common.base.o0OoOo0.OooO0Oo(comparator().compare(comparable, comparable2) <= 0);
        return Oooo00O();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @GwtIncompatible
    public final NavigableSet tailSet(Object obj, boolean z) {
        ((Comparable) obj).getClass();
        return Oooo0();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return OooOooo().toString();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        ((Comparable) obj).getClass();
        return OooOooO();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        ((Comparable) obj).getClass();
        return Oooo0();
    }
}

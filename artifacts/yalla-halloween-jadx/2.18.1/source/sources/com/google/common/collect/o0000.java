package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true)
public abstract class o0000<E> extends o000O000<E> implements o0O00o00<E> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @MonotonicNonNullDecl
    public transient Comparator<? super E> f18405Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @MonotonicNonNullDecl
    public transient NavigableSet<E> f18406Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @MonotonicNonNullDecl
    public transient Set<o00OO.OooO00o<E>> f18407Oooo0oo;

    @Override // com.google.common.collect.o000OO, com.google.common.collect.o000O0o
    public final Object OooO00o() {
        return ((Oooo000) this).f18367Oooo;
    }

    @Override // com.google.common.collect.o000OO
    /* JADX INFO: renamed from: OooO0O0 */
    public final Collection OooO00o() {
        return ((Oooo000) this).f18367Oooo;
    }

    @Override // com.google.common.collect.o0O00o00
    public final o0O00o00<E> OooOoOO() {
        return ((Oooo000) this).f18367Oooo;
    }

    @Override // com.google.common.collect.o0O00o00
    public final o0O00o00<E> OoooOOo(E e, BoundType boundType) {
        return ((Oooo0) ((TreeMultiset) ((Oooo000) this).f18367Oooo).o0OoOo0(e, boundType)).OooOoOO();
    }

    @Override // com.google.common.collect.o0O00o00, com.google.common.collect.o0O00OOO
    public final Comparator<? super E> comparator() {
        Comparator<? super E> comparator = this.f18405Oooo0o;
        if (comparator != null) {
            return comparator;
        }
        o0oOO o0oooOooO0O0 = o0oOO.OooO00o(((Oooo000) this).f18367Oooo.comparator()).OooO0O0();
        this.f18405Oooo0o = o0oooOooO0O0;
        return o0oooOooO0O0;
    }

    @Override // com.google.common.collect.o00OO
    public final Set<o00OO.OooO00o<E>> entrySet() {
        Set<o00OO.OooO00o<E>> set = this.f18407Oooo0oo;
        if (set != null) {
            return set;
        }
        o0000Ooo o0000ooo = new o0000Ooo(this);
        this.f18407Oooo0oo = o0000ooo;
        return o0000ooo;
    }

    @Override // com.google.common.collect.o0O00o00
    public final o00OO.OooO00o<E> firstEntry() {
        return ((Oooo000) this).f18367Oooo.lastEntry();
    }

    @Override // com.google.common.collect.o0O00o00
    public final o00OO.OooO00o<E> lastEntry() {
        return ((Oooo000) this).f18367Oooo.firstEntry();
    }

    @Override // com.google.common.collect.o0O00o00
    public final o0O00o00<E> o0000oO(E e, BoundType boundType, E e2, BoundType boundType2) {
        return ((Oooo0) ((Oooo000) this).f18367Oooo.o0000oO(e2, boundType2, e, boundType)).OooOoOO();
    }

    @Override // com.google.common.collect.o0O00o00
    public final o0O00o00<E> o0OoOo0(E e, BoundType boundType) {
        return ((Oooo0) ((TreeMultiset) ((Oooo000) this).f18367Oooo).OoooOOo(e, boundType)).OooOoOO();
    }

    @Override // com.google.common.collect.o0O00o00
    public final o00OO.OooO00o<E> pollFirstEntry() {
        return ((Oooo000) this).f18367Oooo.pollLastEntry();
    }

    @Override // com.google.common.collect.o0O00o00
    public final o00OO.OooO00o<E> pollLastEntry() {
        return ((Oooo000) this).f18367Oooo.pollFirstEntry();
    }

    @Override // com.google.common.collect.o000OO, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return OooO0oO();
    }

    @Override // com.google.common.collect.o000O0o
    public final String toString() {
        return entrySet().toString();
    }

    @Override // com.google.common.collect.o00OO
    public final NavigableSet<E> OooO0Oo() {
        NavigableSet<E> navigableSet = this.f18406Oooo0oO;
        if (navigableSet != null) {
            return navigableSet;
        }
        o0O00oO0.OooO0O0 oooO0O0 = new o0O00oO0.OooO0O0(this);
        this.f18406Oooo0oO = oooO0O0;
        return oooO0O0;
    }

    @Override // com.google.common.collect.o000OO, java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) o00OOOO0.OooO0o0(this, tArr);
    }
}

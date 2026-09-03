package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public abstract class o0000oo<E> extends o000O0o<E> implements oo0OOoo<E> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @CheckForNull
    public transient o0O000 f18955OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @CheckForNull
    public transient o0000O00 f18956OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @CheckForNull
    public transient o0O0o000.OooO0O0 f18957OooO0o0;

    @Override // com.google.common.collect.o0000O, com.google.common.collect.o000Oo0
    public final Object OooO00o() {
        return ((Oooo000) this).f18885OooO0oO;
    }

    @Override // com.google.common.collect.o0000O
    /* JADX INFO: renamed from: OooO0O0 */
    public final Collection OooO00o() {
        return ((Oooo000) this).f18885OooO0oO;
    }

    @Override // com.google.common.collect.oo0OOoo
    public final oo0OOoo<E> OoooOoo(@ParametricNullness E e, BoundType boundType, @ParametricNullness E e2, BoundType boundType2) {
        return ((Oooo0) ((Oooo000) this).f18885OooO0oO.OoooOoo(e2, boundType2, e, boundType)).o00Ooo();
    }

    @Override // com.google.common.collect.oo0OOoo, com.google.common.collect.o0O0OOO0
    public final Comparator<? super E> comparator() {
        o0O000 o0o001 = this.f18955OooO0Oo;
        if (o0o001 != null) {
            return o0o001;
        }
        o0O000 o0o000OooO0O0 = o0O000.OooO00o(((Oooo000) this).f18885OooO0oO.comparator()).OooO0O0();
        this.f18955OooO0Oo = o0o000OooO0O0;
        return o0o000OooO0O0;
    }

    @Override // com.google.common.collect.o0oOO
    public final Set<o0oOO.OooO00o<E>> entrySet() {
        o0000O00 o0000o00 = this.f18956OooO0o;
        if (o0000o00 != null) {
            return o0000o00;
        }
        o0000O00 o0000o01 = new o0000O00(this);
        this.f18956OooO0o = o0000o01;
        return o0000o01;
    }

    @Override // com.google.common.collect.oo0OOoo
    @CheckForNull
    public final o0oOO.OooO00o<E> firstEntry() {
        return ((Oooo000) this).f18885OooO0oO.lastEntry();
    }

    @Override // com.google.common.collect.oo0OOoo
    @CheckForNull
    public final o0oOO.OooO00o<E> lastEntry() {
        return ((Oooo000) this).f18885OooO0oO.firstEntry();
    }

    @Override // com.google.common.collect.oo0OOoo
    public final oo0OOoo<E> o000000(@ParametricNullness E e, BoundType boundType) {
        return ((TreeMultiset) ((Oooo000) this).f18885OooO0oO).o00000OO(e, boundType).o00Ooo();
    }

    @Override // com.google.common.collect.oo0OOoo
    public final oo0OOoo<E> o00000OO(@ParametricNullness E e, BoundType boundType) {
        return ((TreeMultiset) ((Oooo000) this).f18885OooO0oO).o000000(e, boundType).o00Ooo();
    }

    @Override // com.google.common.collect.oo0OOoo
    public final oo0OOoo<E> o00Ooo() {
        return ((Oooo000) this).f18885OooO0oO;
    }

    @Override // com.google.common.collect.oo0OOoo
    @CheckForNull
    public final o0oOO.OooO00o<E> pollFirstEntry() {
        return ((Oooo000) this).f18885OooO0oO.pollLastEntry();
    }

    @Override // com.google.common.collect.oo0OOoo
    @CheckForNull
    public final o0oOO.OooO00o<E> pollLastEntry() {
        return ((Oooo000) this).f18885OooO0oO.pollFirstEntry();
    }

    @Override // com.google.common.collect.o0000O, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override // com.google.common.collect.o000Oo0
    public final String toString() {
        return entrySet().toString();
    }

    @Override // com.google.common.collect.o0oOO
    public final NavigableSet<E> OooO0oO() {
        o0O0o000.OooO0O0 oooO0O0 = this.f18957OooO0o0;
        if (oooO0O0 != null) {
            return oooO0O0;
        }
        o0O0o000.OooO0O0 oooO0O1 = new o0O0o000.OooO0O0(this);
        this.f18957OooO0o0 = oooO0O1;
        return oooO0O1;
    }

    @Override // com.google.common.collect.o0000O, java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) o0.OooO0O0(this, tArr);
    }
}

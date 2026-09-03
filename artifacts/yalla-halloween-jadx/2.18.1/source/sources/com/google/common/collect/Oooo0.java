package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true)
public abstract class Oooo0<E> extends OooOOOO<E> implements o0O00o00<E> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @MonotonicNonNullDecl
    public transient o0O00o00<E> f18365Oooo;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @GwtTransient
    public final Comparator<? super E> f18366Oooo0oo;

    public Oooo0() {
        this.f18366Oooo0oo = o0o0Oo.f18676Oooo0o;
    }

    @Override // com.google.common.collect.OooOOOO
    public final Set OooO00o() {
        return new o0O00oO0.OooO0O0(this);
    }

    public abstract Iterator<o00OO.OooO00o<E>> OooO0oo();

    @Override // com.google.common.collect.o0O00o00
    public final o0O00o00<E> OooOoOO() {
        o0O00o00<E> o0o00o01 = this.f18365Oooo;
        if (o0o00o01 != null) {
            return o0o00o01;
        }
        Oooo000 oooo000 = new Oooo000(this);
        this.f18365Oooo = oooo000;
        return oooo000;
    }

    @Override // com.google.common.collect.o0O00o00, com.google.common.collect.o0O00OOO
    public final Comparator<? super E> comparator() {
        return this.f18366Oooo0oo;
    }

    @Override // com.google.common.collect.o0O00o00
    public final o00OO.OooO00o<E> firstEntry() {
        Iterator<o00OO.OooO00o<E>> itOooO0oO = OooO0oO();
        if (itOooO0oO.hasNext()) {
            return itOooO0oO.next();
        }
        return null;
    }

    @Override // com.google.common.collect.o0O00o00
    public final o00OO.OooO00o<E> lastEntry() {
        Iterator<o00OO.OooO00o<E>> itOooO0oo = OooO0oo();
        if (itOooO0oo.hasNext()) {
            return itOooO0oo.next();
        }
        return null;
    }

    @Override // com.google.common.collect.o0O00o00
    public final o0O00o00<E> o0000oO(@NullableDecl E e, BoundType boundType, @NullableDecl E e2, BoundType boundType2) {
        Objects.requireNonNull(boundType);
        Objects.requireNonNull(boundType2);
        return ((TreeMultiset) ((TreeMultiset) this).o0OoOo0(e, boundType)).OoooOOo(e2, boundType2);
    }

    @Override // com.google.common.collect.o0O00o00
    public final o00OO.OooO00o<E> pollFirstEntry() {
        Iterator<o00OO.OooO00o<E>> itOooO0oO = OooO0oO();
        if (!itOooO0oO.hasNext()) {
            return null;
        }
        o00OO.OooO00o<E> next = itOooO0oO.next();
        o00OOO0.OooO0o oooO0o = new o00OOO0.OooO0o(next.getElement(), next.getCount());
        itOooO0oO.remove();
        return oooO0o;
    }

    @Override // com.google.common.collect.o0O00o00
    public final o00OO.OooO00o<E> pollLastEntry() {
        Iterator<o00OO.OooO00o<E>> itOooO0oo = OooO0oo();
        if (!itOooO0oo.hasNext()) {
            return null;
        }
        o00OO.OooO00o<E> next = itOooO0oo.next();
        o00OOO0.OooO0o oooO0o = new o00OOO0.OooO0o(next.getElement(), next.getCount());
        itOooO0oo.remove();
        return oooO0o;
    }

    @Override // com.google.common.collect.OooOOOO, com.google.common.collect.o00OO
    public final NavigableSet<E> OooO0Oo() {
        return (NavigableSet) super.OooO0Oo();
    }

    public Oooo0(Comparator<? super E> comparator) {
        Objects.requireNonNull(comparator);
        this.f18366Oooo0oo = comparator;
    }
}

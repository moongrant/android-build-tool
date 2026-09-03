package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public abstract class Oooo0<E> extends OooOOOO<E> implements oo0OOoo<E> {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @GwtTransient
    public final Comparator<? super E> f19359OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @CheckForNull
    public transient Oooo000 f19360OooO0oO;

    public Oooo0(Comparator<? super E> comparator) {
        comparator.getClass();
        this.f19359OooO0o = comparator;
    }

    @Override // com.google.common.collect.OooOOOO
    public final Set OooO00o() {
        return new o0O0o000.OooO0O0(this);
    }

    public abstract o0OO00o0 OooO0o();

    @Override // com.google.common.collect.oo0OOoo
    public final oo0OOoo<E> OoooOoo(@ParametricNullness E e, BoundType boundType, @ParametricNullness E e2, BoundType boundType2) {
        boundType.getClass();
        boundType2.getClass();
        return ((TreeMultiset) ((TreeMultiset) this).o00000O(e, boundType)).o0O0O00(e2, boundType2);
    }

    @Override // com.google.common.collect.oo0OOoo, com.google.common.collect.o0O0OOO0
    public final Comparator<? super E> comparator() {
        return this.f19359OooO0o;
    }

    @Override // com.google.common.collect.oo0OOoo
    @CheckForNull
    public final o0oOO.OooO00o<E> firstEntry() {
        Iterator<o0oOO.OooO00o<E>> itOooO0o0 = OooO0o0();
        if (itOooO0o0.hasNext()) {
            return itOooO0o0.next();
        }
        return null;
    }

    @Override // com.google.common.collect.oo0OOoo
    @CheckForNull
    public final o0oOO.OooO00o<E> lastEntry() {
        o0OO00o0 o0oo00o0OooO0o = OooO0o();
        if (o0oo00o0OooO0o.hasNext()) {
            return (o0oOO.OooO00o) o0oo00o0OooO0o.next();
        }
        return null;
    }

    @Override // com.google.common.collect.oo0OOoo
    public final oo0OOoo<E> o00O0O() {
        Oooo000 oooo000 = this.f19360OooO0oO;
        if (oooo000 != null) {
            return oooo000;
        }
        Oooo000 oooo001 = new Oooo000(this);
        this.f19360OooO0oO = oooo001;
        return oooo001;
    }

    @Override // com.google.common.collect.oo0OOoo
    @CheckForNull
    public final o0oOO.OooO00o<E> pollFirstEntry() {
        Iterator<o0oOO.OooO00o<E>> itOooO0o0 = OooO0o0();
        if (!itOooO0o0.hasNext()) {
            return null;
        }
        o0oOO.OooO00o<E> next = itOooO0o0.next();
        oo00oO.OooO0o oooO0o = new oo00oO.OooO0o(next.getElement(), next.getCount());
        itOooO0o0.remove();
        return oooO0o;
    }

    @Override // com.google.common.collect.oo0OOoo
    @CheckForNull
    public final o0oOO.OooO00o<E> pollLastEntry() {
        o0OO00o0 o0oo00o0OooO0o = OooO0o();
        if (!o0oo00o0OooO0o.hasNext()) {
            return null;
        }
        o0oOO.OooO00o<Object> next = o0oo00o0OooO0o.next();
        oo00oO.OooO0o oooO0o = new oo00oO.OooO0o(next.getElement(), next.getCount());
        o0oo00o0OooO0o.remove();
        return oooO0o;
    }

    @Override // com.google.common.collect.OooOOOO, com.google.common.collect.o0oOO
    public final NavigableSet<E> OooO0oO() {
        return (NavigableSet) super.OooO0oO();
    }

    public Oooo0() {
        this(o0O0o.f19585OooO0Oo);
    }
}

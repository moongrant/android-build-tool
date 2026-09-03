package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Optional;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true)
public abstract class o0000O0O<E> implements Iterable<E> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Optional<Iterable<E>> f18439Oooo0o;

    public o0000O0O() {
        this.f18439Oooo0o = o0OOOO0o.OooO00o.f38222Oooo0o;
    }

    public final Iterable<E> OooO00o() {
        return this.f18439Oooo0o.OooO00o(this);
    }

    public final ImmutableSet<E> OooO0O0() {
        ImmutableSet<E> immutableSetOooO0o;
        Iterable<E> iterableOooO00o = OooO00o();
        int i = ImmutableSet.f18204Oooo0oo;
        if (iterableOooO00o instanceof Collection) {
            Collection collection = (Collection) iterableOooO00o;
            if ((collection instanceof ImmutableSet) && !(collection instanceof SortedSet)) {
                ImmutableSet<E> immutableSet = (ImmutableSet) collection;
                if (!immutableSet.OooO0oo()) {
                    return immutableSet;
                }
            }
            Object[] array = collection.toArray();
            return ImmutableSet.OooOO0O(array.length, array);
        }
        Iterator<E> it = iterableOooO00o.iterator();
        if (it.hasNext()) {
            E next = it.next();
            if (it.hasNext()) {
                ImmutableSet.OooO00o oooO00o = new ImmutableSet.OooO00o();
                oooO00o.OooO0Oo(next);
                oooO00o.OooO0o0(it);
                immutableSetOooO0o = oooO00o.OooO0o();
            } else {
                immutableSetOooO0o = new o0O00O<>(next);
            }
        } else {
            immutableSetOooO0o = o0O0000O.f18593OoooOO0;
        }
        return immutableSetOooO0o;
    }

    public final String toString() {
        return oOO00O.OooO00o(OooO00o());
    }

    public o0000O0O(Iterable<E> iterable) {
        Optional<Iterable<E>> oooo0;
        Objects.requireNonNull(iterable);
        iterable = this == iterable ? null : iterable;
        if (iterable == null) {
            oooo0 = o0OOOO0o.OooO00o.f38222Oooo0o;
        } else {
            oooo0 = new o0OOOO0o.Oooo0(iterable);
        }
        this.f18439Oooo0o = oooo0;
    }
}

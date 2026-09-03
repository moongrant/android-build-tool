package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class OooOOOO<E> extends AbstractCollection<E> implements o0oOO<E> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @CheckForNull
    @LazyInit
    public transient Set<E> f19355OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @CheckForNull
    @LazyInit
    public transient Set<o0oOO.OooO00o<E>> f19356OooO0o0;

    public class OooO00o extends oo00oO.OooO0O0<E> {
        public OooO00o() {
        }

        @Override // com.google.common.collect.oo00oO.OooO0O0
        public final o0oOO<E> OooO0Oo() {
            return OooOOOO.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<E> iterator() {
            return OooOOOO.this.OooO0Oo();
        }
    }

    public class OooO0O0 extends oo00oO.OooO0OO<E> {
        public OooO0O0() {
        }

        @Override // com.google.common.collect.oo00oO.OooO0OO
        public o0oOO<E> OooO0Oo() {
            return OooOOOO.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<o0oOO.OooO00o<E>> iterator() {
            return OooOOOO.this.OooO0o0();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return OooOOOO.this.OooO0OO();
        }
    }

    public Set<E> OooO00o() {
        return new OooO00o();
    }

    public Set<o0oOO.OooO00o<E>> OooO0O0() {
        return new OooO0O0();
    }

    public abstract int OooO0OO();

    public abstract Iterator<E> OooO0Oo();

    public abstract Iterator<o0oOO.OooO00o<E>> OooO0o0();

    @Override // com.google.common.collect.o0oOO
    public Set<E> OooO0oO() {
        Set<E> set = this.f19355OooO0Oo;
        if (set != null) {
            return set;
        }
        Set<E> setOooO00o = OooO00o();
        this.f19355OooO0Oo = setOooO00o;
        return setOooO00o;
    }

    @CanIgnoreReturnValue
    public int Oooo00o(int i, @CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    public int Oooooo(@ParametricNullness E e, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public final boolean add(@ParametricNullness E e) {
        Oooooo(e, 1);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public final boolean addAll(Collection<? extends E> collection) {
        collection.getClass();
        if (collection instanceof o0oOO) {
            o0oOO o0ooo2 = (o0oOO) collection;
            if (o0ooo2 instanceof OooOO0O) {
                OooOO0O oooOO0O = (OooOO0O) o0ooo2;
                if (!oooOO0O.isEmpty()) {
                    for (int iOooO0O0 = oooOO0O.f19341OooO0o.OooO0O0(); iOooO0O0 >= 0; iOooO0O0 = oooOO0O.f19341OooO0o.OooO0oO(iOooO0O0)) {
                        o0O00000<E> o0o00000 = oooOO0O.f19341OooO0o;
                        com.google.common.base.o000oOoO.OooO0oo(iOooO0O0, o0o00000.f19541OooO0OO);
                        Object obj = o0o00000.f19539OooO00o[iOooO0O0];
                        o0O00000<E> o0o00001 = oooOO0O.f19341OooO0o;
                        com.google.common.base.o000oOoO.OooO0oo(iOooO0O0, o0o00001.f19541OooO0OO);
                        Oooooo(obj, o0o00001.f19540OooO0O0[iOooO0O0]);
                    }
                    return true;
                }
            } else if (!o0ooo2.isEmpty()) {
                for (o0oOO.OooO00o<E> oooO00o : o0ooo2.entrySet()) {
                    Oooooo(oooO00o.getElement(), oooO00o.getCount());
                }
                return true;
            }
        } else if (!collection.isEmpty()) {
            return o00O0O0O.OooO00o(this, collection.iterator());
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return o000OOo(obj) > 0;
    }

    @Override // com.google.common.collect.o0oOO
    public final Set<o0oOO.OooO00o<E>> entrySet() {
        Set<o0oOO.OooO00o<E>> set = this.f19356OooO0o0;
        if (set != null) {
            return set;
        }
        Set<o0oOO.OooO00o<E>> setOooO0O0 = OooO0O0();
        this.f19356OooO0o0 = setOooO0O0;
        return setOooO0O0;
    }

    @Override // java.util.Collection, com.google.common.collect.o0oOO
    public final boolean equals(@CheckForNull Object obj) {
        return oo00oO.OooO00o(this, obj);
    }

    @Override // java.util.Collection, com.google.common.collect.o0oOO
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CanIgnoreReturnValue
    public int o0000OOo(@ParametricNullness Object obj) {
        oo000o.OooO0O0(0, "count");
        int iO000OOo = o000OOo(obj);
        int i = 0 - iO000OOo;
        if (i > 0) {
            Oooooo(obj, i);
        } else if (i < 0) {
            Oooo00o(-i, obj);
        }
        return iO000OOo;
    }

    @CanIgnoreReturnValue
    public boolean o00Oo0(int i, @ParametricNullness Object obj) {
        oo000o.OooO0O0(i, "oldCount");
        oo000o.OooO0O0(0, "newCount");
        if (o000OOo(obj) != i) {
            return false;
        }
        o0000OOo(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public final boolean remove(@CheckForNull Object obj) {
        return Oooo00o(1, obj) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public final boolean removeAll(Collection<?> collection) {
        if (collection instanceof o0oOO) {
            collection = ((o0oOO) collection).OooO0oO();
        }
        return OooO0oO().removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public final boolean retainAll(Collection<?> collection) {
        collection.getClass();
        if (collection instanceof o0oOO) {
            collection = ((o0oOO) collection).OooO0oO();
        }
        return OooO0oO().retainAll(collection);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return entrySet().toString();
    }
}

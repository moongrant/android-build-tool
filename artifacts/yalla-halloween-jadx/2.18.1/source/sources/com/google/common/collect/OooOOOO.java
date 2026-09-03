package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
public abstract class OooOOOO<E> extends AbstractCollection<E> implements o00OO<E> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @MonotonicNonNullDecl
    public transient Set<E> f18361Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @MonotonicNonNullDecl
    public transient Set<o00OO.OooO00o<E>> f18362Oooo0oO;

    public class OooO00o extends o00OOO0.OooO0O0<E> {
        public OooO00o() {
        }

        @Override // com.google.common.collect.o00OOO0.OooO0O0
        public final o00OO<E> OooO0o0() {
            return OooOOOO.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<E> iterator() {
            return OooOOOO.this.OooO0o0();
        }
    }

    public class OooO0O0 extends o00OOO0.OooO0OO<E> {
        public OooO0O0() {
        }

        @Override // com.google.common.collect.o00OOO0.OooO0OO
        public o00OO<E> OooO0o0() {
            return OooOOOO.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<o00OO.OooO00o<E>> iterator() {
            return OooOOOO.this.OooO0oO();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return OooOOOO.this.OooO0OO();
        }
    }

    public Set<E> OooO00o() {
        return new OooO00o();
    }

    public Set<o00OO.OooO00o<E>> OooO0O0() {
        return new OooO0O0();
    }

    public abstract int OooO0OO();

    @Override // com.google.common.collect.o00OO
    public Set<E> OooO0Oo() {
        Set<E> set = this.f18361Oooo0o;
        if (set != null) {
            return set;
        }
        Set<E> setOooO00o = OooO00o();
        this.f18361Oooo0o = setOooO00o;
        return setOooO00o;
    }

    public abstract Iterator<E> OooO0o0();

    public abstract Iterator<o00OO.OooO00o<E>> OooO0oO();

    @CanIgnoreReturnValue
    public int OooOOO(@NullableDecl Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    public int OooOOo(@NullableDecl E e, int i) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    public boolean Oooo0(@NullableDecl Object obj, int i) {
        oo000o.OooO0O0(i, "oldCount");
        oo000o.OooO0O0(0, "newCount");
        if (Ooooo0o(obj) != i) {
            return false;
        }
        o0000O0O(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public final boolean add(@NullableDecl E e) {
        OooOOo(e, 1);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public final boolean addAll(Collection<? extends E> collection) {
        Objects.requireNonNull(collection);
        if (!(collection instanceof o00OO)) {
            if (collection.isEmpty()) {
                return false;
            }
            return o00O0.OooO00o(this, collection.iterator());
        }
        o00OO o00oo2 = (o00OO) collection;
        if (o00oo2 instanceof OooOO0O) {
            OooOO0O oooOO0O = (OooOO0O) o00oo2;
            if (oooOO0O.isEmpty()) {
                return false;
            }
            for (int iOooO0O0 = oooOO0O.f18350Oooo0oo.OooO0O0(); iOooO0O0 >= 0; iOooO0O0 = oooOO0O.f18350Oooo0oo.OooO0oo(iOooO0O0)) {
                o00OOOOo<E> o00ooooo2 = oooOO0O.f18350Oooo0oo;
                o0OOOO0o.OooOOOO.OooO(iOooO0O0, o00ooooo2.f18558OooO0OO);
                OooOOo(o00ooooo2.f18556OooO00o[iOooO0O0], oooOO0O.f18350Oooo0oo.OooO0OO(iOooO0O0));
            }
        } else {
            if (o00oo2.isEmpty()) {
                return false;
            }
            for (o00OO.OooO00o<E> oooO00o : o00oo2.entrySet()) {
                OooOOo(oooO00o.getElement(), oooO00o.getCount());
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o00OO
    public final boolean contains(@NullableDecl Object obj) {
        return Ooooo0o(obj) > 0;
    }

    @Override // com.google.common.collect.o00OO
    public final Set<o00OO.OooO00o<E>> entrySet() {
        Set<o00OO.OooO00o<E>> set = this.f18362Oooo0oO;
        if (set != null) {
            return set;
        }
        Set<o00OO.OooO00o<E>> setOooO0O0 = OooO0O0();
        this.f18362Oooo0oO = setOooO0O0;
        return setOooO0O0;
    }

    @Override // java.util.Collection, com.google.common.collect.o00OO
    public final boolean equals(@NullableDecl Object obj) {
        return o00OOO0.OooO00o(this, obj);
    }

    @Override // java.util.Collection, com.google.common.collect.o00OO
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CanIgnoreReturnValue
    public int o0000O0O(@NullableDecl Object obj) {
        oo000o.OooO0O0(0, "count");
        int iOoooo0o = Ooooo0o(obj);
        int i = 0 - iOoooo0o;
        if (i > 0) {
            OooOOo(obj, i);
        } else if (i < 0) {
            OooOOO(obj, -i);
        }
        return iOoooo0o;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o00OO
    @CanIgnoreReturnValue
    public final boolean remove(@NullableDecl Object obj) {
        return OooOOO(obj, 1) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public final boolean removeAll(Collection<?> collection) {
        if (collection instanceof o00OO) {
            collection = ((o00OO) collection).OooO0Oo();
        }
        return OooO0Oo().removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public final boolean retainAll(Collection<?> collection) {
        Objects.requireNonNull(collection);
        if (collection instanceof o00OO) {
            collection = ((o00OO) collection).OooO0Oo();
        }
        return OooO0Oo().retainAll(collection);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return entrySet().toString();
    }
}

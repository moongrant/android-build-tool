package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true, serializable = true)
public abstract class ImmutableMultiset<E> extends o00O0000<E> implements o00OO<E> {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @LazyInit
    public transient ImmutableList<E> f18189Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @LazyInit
    public transient ImmutableSet<o00OO.OooO00o<E>> f18190Oooo0oo;

    public class OooO00o extends o0O0o000<E> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f18191Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        @MonotonicNonNullDecl
        public E f18192Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Iterator f18193Oooo0oo;

        public OooO00o(Iterator it) {
            this.f18193Oooo0oo = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f18191Oooo0o > 0 || this.f18193Oooo0oo.hasNext();
        }

        @Override // java.util.Iterator
        public final E next() {
            if (this.f18191Oooo0o <= 0) {
                o00OO.OooO00o oooO00o = (o00OO.OooO00o) this.f18193Oooo0oo.next();
                this.f18192Oooo0oO = (E) oooO00o.getElement();
                this.f18191Oooo0o = oooO00o.getCount();
            }
            this.f18191Oooo0o--;
            return this.f18192Oooo0oO;
        }
    }

    public static class OooO0O0<E> extends ImmutableCollection.OooO0O0<E> {
    }

    public final class OooO0OO extends o00O000o<o00OO.OooO00o<E>> {
        public OooO0OO() {
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean OooO0oo() {
            return ImmutableMultiset.this.OooO0oo();
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public final boolean contains(Object obj) {
            if (!(obj instanceof o00OO.OooO00o)) {
                return false;
            }
            o00OO.OooO00o oooO00o = (o00OO.OooO00o) obj;
            return oooO00o.getCount() > 0 && ImmutableMultiset.this.Ooooo0o(oooO00o.getElement()) == oooO00o.getCount();
        }

        @Override // com.google.common.collect.o00O000o
        public final Object get(int i) {
            return ImmutableMultiset.this.OooOO0o(i);
        }

        @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
        public final int hashCode() {
            return ImmutableMultiset.this.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return ImmutableMultiset.this.OooO0Oo().size();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        @GwtIncompatible
        public Object writeReplace() {
            return new OooO0o(ImmutableMultiset.this);
        }
    }

    @GwtIncompatible
    public static class OooO0o<E> implements Serializable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final ImmutableMultiset<E> f18195Oooo0o;

        public OooO0o(ImmutableMultiset<E> immutableMultiset) {
            this.f18195Oooo0o = immutableMultiset;
        }

        public Object readResolve() {
            return this.f18195Oooo0o.entrySet();
        }
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: OooO */
    public final o0O0o000<E> iterator() {
        return new OooO00o(entrySet().iterator());
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final ImmutableList<E> OooO00o() {
        ImmutableList<E> immutableList = this.f18189Oooo0oO;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList<E> immutableListOooO00o = super.OooO00o();
        this.f18189Oooo0oO = (o0) immutableListOooO00o;
        return immutableListOooO00o;
    }

    @Override // com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    public final int OooO0O0(Object[] objArr) {
        o0O0o000<o00OO.OooO00o<E>> it = entrySet().iterator();
        int count = 0;
        while (it.hasNext()) {
            o00OO.OooO00o<E> next = it.next();
            Arrays.fill(objArr, count, next.getCount() + count, next.getElement());
            count += next.getCount();
        }
        return count;
    }

    @Override // com.google.common.collect.o00OO
    /* JADX INFO: renamed from: OooOO0, reason: merged with bridge method [inline-methods] */
    public abstract ImmutableSet<E> OooO0Oo();

    @Override // com.google.common.collect.o00OO
    /* JADX INFO: renamed from: OooOO0O, reason: merged with bridge method [inline-methods] */
    public final ImmutableSet<o00OO.OooO00o<E>> entrySet() {
        ImmutableSet<o00OO.OooO00o<E>> oooO0OO = this.f18190Oooo0oo;
        if (oooO0OO == null) {
            oooO0OO = isEmpty() ? o0O0000O.f18593OoooOO0 : new OooO0OO();
            this.f18190Oooo0oo = oooO0OO;
        }
        return oooO0OO;
    }

    public abstract o00OO.OooO00o<E> OooOO0o(int i);

    @Override // com.google.common.collect.o00OO
    @CanIgnoreReturnValue
    @Deprecated
    public final int OooOOO(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.o00OO
    @CanIgnoreReturnValue
    @Deprecated
    public final int OooOOo(E e, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.o00OO
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean Oooo0(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@NullableDecl Object obj) {
        return Ooooo0o(obj) > 0;
    }

    @Override // java.util.Collection, com.google.common.collect.o00OO
    public final boolean equals(@NullableDecl Object obj) {
        return o00OOO0.OooO00o(this, obj);
    }

    @Override // java.util.Collection, com.google.common.collect.o00OO
    public final int hashCode() {
        return o0O00O0o.OooO0O0(entrySet());
    }

    @Override // com.google.common.collect.o00OO
    @CanIgnoreReturnValue
    @Deprecated
    public final int o0000O0O(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return entrySet().toString();
    }

    @Override // com.google.common.collect.ImmutableCollection
    @GwtIncompatible
    abstract Object writeReplace();
}

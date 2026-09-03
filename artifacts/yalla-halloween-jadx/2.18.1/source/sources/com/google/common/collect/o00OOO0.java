package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
public final class o00OOO0 {

    public static final class OooO<E> implements Iterator<E> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f18547Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final o00OO<E> f18548Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final Iterator<o00OO.OooO00o<E>> f18549Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        @MonotonicNonNullDecl
        public o00OO.OooO00o<E> f18550Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public boolean f18551OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int f18552OoooO00;

        public OooO(o00OO<E> o00oo2, Iterator<o00OO.OooO00o<E>> it) {
            this.f18548Oooo0o = o00oo2;
            this.f18549Oooo0oO = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f18547Oooo > 0 || this.f18549Oooo0oO.hasNext();
        }

        @Override // java.util.Iterator
        public final E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            if (this.f18547Oooo == 0) {
                o00OO.OooO00o<E> next = this.f18549Oooo0oO.next();
                this.f18550Oooo0oo = next;
                int count = next.getCount();
                this.f18547Oooo = count;
                this.f18552OoooO00 = count;
            }
            this.f18547Oooo--;
            this.f18551OoooO0 = true;
            return this.f18550Oooo0oo.getElement();
        }

        @Override // java.util.Iterator
        public final void remove() {
            oo000o.OooO0Oo(this.f18551OoooO0);
            if (this.f18552OoooO00 == 1) {
                this.f18549Oooo0oO.remove();
            } else {
                this.f18548Oooo0o.remove(this.f18550Oooo0oo.getElement());
            }
            this.f18552OoooO00--;
            this.f18551OoooO0 = false;
        }
    }

    public static abstract class OooO00o<E> implements o00OO.OooO00o<E> {
        public final boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof o00OO.OooO00o)) {
                return false;
            }
            o00OO.OooO00o oooO00o = (o00OO.OooO00o) obj;
            return getCount() == oooO00o.getCount() && o0OOOO0o.OooOOO.OooO00o(getElement(), oooO00o.getElement());
        }

        public final int hashCode() {
            E element = getElement();
            return (element == null ? 0 : element.hashCode()) ^ getCount();
        }

        public final String toString() {
            String strValueOf = String.valueOf(getElement());
            int count = getCount();
            if (count == 1) {
                return strValueOf;
            }
            return strValueOf + " x " + count;
        }
    }

    public static abstract class OooO0O0<E> extends o0O00O0o.OooO00o<E> {
        public abstract o00OO<E> OooO0o0();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            OooO0o0().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return OooO0o0().contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean containsAll(Collection<?> collection) {
            return OooO0o0().containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return OooO0o0().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            return OooO0o0().OooOOO(obj, Integer.MAX_VALUE) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return OooO0o0().entrySet().size();
        }
    }

    public static abstract class OooO0OO<E> extends o0O00O0o.OooO00o<o00OO.OooO00o<E>> {
        public abstract o00OO<E> OooO0o0();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            OooO0o0().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof o00OO.OooO00o)) {
                return false;
            }
            o00OO.OooO00o oooO00o = (o00OO.OooO00o) obj;
            return oooO00o.getCount() > 0 && OooO0o0().Ooooo0o(oooO00o.getElement()) == oooO00o.getCount();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            if (!(obj instanceof o00OO.OooO00o)) {
                return false;
            }
            o00OO.OooO00o oooO00o = (o00OO.OooO00o) obj;
            Object element = oooO00o.getElement();
            int count = oooO00o.getCount();
            if (count != 0) {
                return OooO0o0().Oooo0(element, count);
            }
            return false;
        }
    }

    public static class OooO0o<E> extends OooO00o<E> implements Serializable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @NullableDecl
        public final E f18553Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final int f18554Oooo0oO;

        public OooO0o(@NullableDecl E e, int i) {
            this.f18553Oooo0o = e;
            this.f18554Oooo0oO = i;
            oo000o.OooO0O0(i, "count");
        }

        @Override // com.google.common.collect.o00OO.OooO00o
        public final int getCount() {
            return this.f18554Oooo0oO;
        }

        @Override // com.google.common.collect.o00OO.OooO00o
        @NullableDecl
        public final E getElement() {
            return this.f18553Oooo0o;
        }
    }

    public static boolean OooO00o(o00OO<?> o00oo2, @NullableDecl Object obj) {
        if (obj == o00oo2) {
            return true;
        }
        if (obj instanceof o00OO) {
            o00OO o00oo3 = (o00OO) obj;
            if (o00oo2.size() == o00oo3.size() && o00oo2.entrySet().size() == o00oo3.entrySet().size()) {
                for (o00OO.OooO00o oooO00o : o00oo3.entrySet()) {
                    if (o00oo2.Ooooo0o(oooO00o.getElement()) != oooO00o.getCount()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static <E> Iterator<E> OooO0O0(o00OO<E> o00oo2) {
        return new OooO(o00oo2, o00oo2.entrySet().iterator());
    }
}

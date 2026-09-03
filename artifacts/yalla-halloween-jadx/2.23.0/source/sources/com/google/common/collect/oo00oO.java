package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class oo00oO {

    public static final class OooO<E> implements Iterator<E> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public boolean f19668OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final o0oOO<E> f19669OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @CheckForNull
        public o0oOO.OooO00o<E> f19670OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final Iterator<o0oOO.OooO00o<E>> f19671OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f19672OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f19673OooO0oo;

        public OooO(o0oOO<E> o0ooo2, Iterator<o0oOO.OooO00o<E>> it) {
            this.f19669OooO0Oo = o0ooo2;
            this.f19671OooO0o0 = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f19672OooO0oO > 0 || this.f19671OooO0o0.hasNext();
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public final E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            if (this.f19672OooO0oO == 0) {
                o0oOO.OooO00o<E> next = this.f19671OooO0o0.next();
                this.f19670OooO0o = next;
                int count = next.getCount();
                this.f19672OooO0oO = count;
                this.f19673OooO0oo = count;
            }
            this.f19672OooO0oO--;
            this.f19668OooO = true;
            o0oOO.OooO00o<E> oooO00o = this.f19670OooO0o;
            Objects.requireNonNull(oooO00o);
            return oooO00o.getElement();
        }

        @Override // java.util.Iterator
        public final void remove() {
            oo000o.OooO0Oo(this.f19668OooO);
            if (this.f19673OooO0oo == 1) {
                this.f19671OooO0o0.remove();
            } else {
                o0oOO.OooO00o<E> oooO00o = this.f19670OooO0o;
                Objects.requireNonNull(oooO00o);
                this.f19669OooO0Oo.remove(oooO00o.getElement());
            }
            this.f19673OooO0oo--;
            this.f19668OooO = false;
        }
    }

    public static abstract class OooO00o<E> implements o0oOO.OooO00o<E> {
        public final boolean equals(@CheckForNull Object obj) {
            if (!(obj instanceof o0oOO.OooO00o)) {
                return false;
            }
            o0oOO.OooO00o oooO00o = (o0oOO.OooO00o) obj;
            return getCount() == oooO00o.getCount() && com.google.common.base.Oooo000.OooO00o(getElement(), oooO00o.getElement());
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
            StringBuilder sb = new StringBuilder(strValueOf.length() + 14);
            sb.append(strValueOf);
            sb.append(" x ");
            sb.append(count);
            return sb.toString();
        }
    }

    public static abstract class OooO0O0<E> extends o0O0O0Oo.OooO0OO<E> {
        public abstract o0oOO<E> OooO0Oo();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            OooO0Oo().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@CheckForNull Object obj) {
            return OooO0Oo().contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean containsAll(Collection<?> collection) {
            return OooO0Oo().containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean isEmpty() {
            return OooO0Oo().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(@CheckForNull Object obj) {
            return OooO0Oo().Oooo00o(Integer.MAX_VALUE, obj) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return OooO0Oo().entrySet().size();
        }
    }

    public static abstract class OooO0OO<E> extends o0O0O0Oo.OooO0OO<o0oOO.OooO00o<E>> {
        public abstract o0oOO<E> OooO0Oo();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            OooO0Oo().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(@CheckForNull Object obj) {
            if (!(obj instanceof o0oOO.OooO00o)) {
                return false;
            }
            o0oOO.OooO00o oooO00o = (o0oOO.OooO00o) obj;
            return oooO00o.getCount() > 0 && OooO0Oo().o000OOo(oooO00o.getElement()) == oooO00o.getCount();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(@CheckForNull Object obj) {
            if (!(obj instanceof o0oOO.OooO00o)) {
                return false;
            }
            o0oOO.OooO00o oooO00o = (o0oOO.OooO00o) obj;
            Object element = oooO00o.getElement();
            int count = oooO00o.getCount();
            if (count != 0) {
                return OooO0Oo().o00Oo0(count, element);
            }
            return false;
        }
    }

    public static class OooO0o<E> extends OooO00o<E> implements Serializable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @ParametricNullness
        public final E f19674OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f19675OooO0o0;

        public OooO0o(@ParametricNullness E e, int i) {
            this.f19674OooO0Oo = e;
            this.f19675OooO0o0 = i;
            oo000o.OooO0O0(i, "count");
        }

        @Override // com.google.common.collect.o0oOO.OooO00o
        public final int getCount() {
            return this.f19675OooO0o0;
        }

        @Override // com.google.common.collect.o0oOO.OooO00o
        @ParametricNullness
        public final E getElement() {
            return this.f19674OooO0Oo;
        }
    }

    public static boolean OooO00o(o0oOO<?> o0ooo2, @CheckForNull Object obj) {
        if (obj == o0ooo2) {
            return true;
        }
        if (obj instanceof o0oOO) {
            o0oOO o0ooo3 = (o0oOO) obj;
            if (o0ooo2.size() == o0ooo3.size() && o0ooo2.entrySet().size() == o0ooo3.entrySet().size()) {
                for (o0oOO.OooO00o oooO00o : o0ooo3.entrySet()) {
                    if (o0ooo2.o000OOo(oooO00o.getElement()) != oooO00o.getCount()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static OooO0o OooO0O0(int i, @ParametricNullness Object obj) {
        return new OooO0o(obj, i);
    }

    public static OooO OooO0OO(o0oOO o0ooo2) {
        return new OooO(o0ooo2, o0ooo2.entrySet().iterator());
    }
}

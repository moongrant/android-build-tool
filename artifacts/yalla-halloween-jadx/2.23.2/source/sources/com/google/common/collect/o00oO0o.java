package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class o00oO0o {
    public static boolean OooO00o(Collection<?> collection, Collection<?> collection2) {
        Iterator<?> it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static class OooO00o<E> extends AbstractCollection<E> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Collection<E> f19058OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final com.google.common.base.o00O0O<? super E> f19059OooO0o0;

        public OooO00o(Collection<E> collection, com.google.common.base.o00O0O<? super E> o00o0o2) {
            this.f19058OooO0Oo = collection;
            this.f19059OooO0o0 = o00o0o2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean add(@ParametricNullness E e) {
            com.google.common.base.o0OoOo0.OooO0Oo(this.f19059OooO0o0.apply(e));
            return this.f19058OooO0Oo.add(e);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean addAll(Collection<? extends E> collection) {
            Iterator<? extends E> it = collection.iterator();
            while (it.hasNext()) {
                com.google.common.base.o0OoOo0.OooO0Oo(this.f19059OooO0o0.apply(it.next()));
            }
            return this.f19058OooO0Oo.addAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final void clear() {
            Collection<E> collection = this.f19058OooO0Oo;
            boolean z = collection instanceof RandomAccess;
            com.google.common.base.o00O0O<? super E> o00o0o2 = this.f19059OooO0o0;
            if (!z || !(collection instanceof List)) {
                Iterator<T> it = collection.iterator();
                o00o0o2.getClass();
                while (it.hasNext()) {
                    if (o00o0o2.apply((Object) it.next())) {
                        it.remove();
                    }
                }
                return;
            }
            List list = (List) collection;
            o00o0o2.getClass();
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                OooO00o.OooO00o.OooO00o.OooO00o.OooOOO.OooO0OO oooO0OO = (Object) list.get(i2);
                if (!o00o0o2.apply(oooO0OO)) {
                    if (i2 > i) {
                        try {
                            list.set(i, oooO0OO);
                        } catch (IllegalArgumentException unused) {
                            o00O00o0.OooO00o(list, o00o0o2, i, i2);
                            return;
                        } catch (UnsupportedOperationException unused2) {
                            o00O00o0.OooO00o(list, o00o0o2, i, i2);
                            return;
                        }
                    }
                    i++;
                }
            }
            list.subList(i, list.size()).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean contains(@CheckForNull Object obj) {
            boolean zContains;
            Collection<E> collection = this.f19058OooO0Oo;
            collection.getClass();
            try {
                zContains = collection.contains(obj);
            } catch (ClassCastException | NullPointerException unused) {
                zContains = false;
            }
            if (zContains) {
                return this.f19059OooO0o0.apply(obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            return o00oO0o.OooO00o(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean isEmpty() {
            Iterator<T> it = this.f19058OooO0Oo.iterator();
            com.google.common.base.o00O0O<? super E> o00o0o2 = this.f19059OooO0o0;
            com.google.common.base.o0OoOo0.OooO(o00o0o2, "predicate");
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (o00o0o2.apply((Object) it.next())) {
                    break;
                }
                i++;
            }
            return true ^ (i != -1);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public final Iterator<E> iterator() {
            Iterator<E> it = this.f19058OooO0Oo.iterator();
            it.getClass();
            com.google.common.base.o00O0O<? super E> o00o0o2 = this.f19059OooO0o0;
            o00o0o2.getClass();
            return new o00O0(it, o00o0o2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean remove(@CheckForNull Object obj) {
            return contains(obj) && this.f19058OooO0Oo.remove(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            Iterator<E> it = this.f19058OooO0Oo.iterator();
            boolean z = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f19059OooO0o0.apply(next) && collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            Iterator<E> it = this.f19058OooO0Oo.iterator();
            boolean z = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f19059OooO0o0.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final int size() {
            Iterator<E> it = this.f19058OooO0Oo.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (this.f19059OooO0o0.apply(it.next())) {
                    i++;
                }
            }
            return i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final Object[] toArray() {
            Iterator<E> it = iterator();
            ArrayList arrayList = new ArrayList();
            o00O0O0O.OooO00o(arrayList, it);
            return arrayList.toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            Iterator<E> it = iterator();
            ArrayList arrayList = new ArrayList();
            o00O0O0O.OooO00o(arrayList, it);
            return (T[]) arrayList.toArray(tArr);
        }
    }
}

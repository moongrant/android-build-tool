package p287o0O0Oo0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0<E> implements List<E>, RandomAccess {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<E> f42268OooO0Oo;

    public OooOO0(List<E> list) {
        this.f42268OooO0Oo = Collections.unmodifiableList(list);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(@NonNull E e) {
        return this.f42268OooO0Oo.add(e);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(@NonNull Collection<? extends E> collection) {
        return this.f42268OooO0Oo.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f42268OooO0Oo.clear();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(@Nullable Object obj) {
        return this.f42268OooO0Oo.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(@NonNull Collection<?> collection) {
        return this.f42268OooO0Oo.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(@Nullable Object obj) {
        return this.f42268OooO0Oo.equals(obj);
    }

    @Override // java.util.List
    @NonNull
    public final E get(int i) {
        return this.f42268OooO0Oo.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f42268OooO0Oo.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(@Nullable Object obj) {
        return this.f42268OooO0Oo.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f42268OooO0Oo.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @NonNull
    public final Iterator<E> iterator() {
        return this.f42268OooO0Oo.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(@Nullable Object obj) {
        return this.f42268OooO0Oo.lastIndexOf(obj);
    }

    @Override // java.util.List
    @NonNull
    public final ListIterator<E> listIterator() {
        return this.f42268OooO0Oo.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(@Nullable Object obj) {
        return this.f42268OooO0Oo.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(@NonNull Collection<?> collection) {
        return this.f42268OooO0Oo.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(@NonNull Collection<?> collection) {
        return this.f42268OooO0Oo.retainAll(collection);
    }

    @Override // java.util.List
    @NonNull
    public final E set(int i, @NonNull E e) {
        return this.f42268OooO0Oo.set(i, e);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f42268OooO0Oo.size();
    }

    @Override // java.util.List
    @NonNull
    public final List<E> subList(int i, int i2) {
        return this.f42268OooO0Oo.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    @Nullable
    public final Object[] toArray() {
        return this.f42268OooO0Oo.toArray();
    }

    @Override // java.util.List
    public final void add(int i, @NonNull E e) {
        this.f42268OooO0Oo.add(i, e);
    }

    @Override // java.util.List
    public final boolean addAll(int i, @NonNull Collection<? extends E> collection) {
        return this.f42268OooO0Oo.addAll(i, collection);
    }

    @Override // java.util.List
    @NonNull
    public final ListIterator<E> listIterator(int i) {
        return this.f42268OooO0Oo.listIterator(i);
    }

    @Override // java.util.List
    public final E remove(int i) {
        return this.f42268OooO0Oo.remove(i);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(@Nullable T[] tArr) {
        return (T[]) this.f42268OooO0Oo.toArray(tArr);
    }
}

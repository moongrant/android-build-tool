package p362o0OOOoo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class o00oO0o<E> implements List<E>, RandomAccess {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final List<E> f38540Oooo0o;

    public o00oO0o(List<E> list) {
        this.f38540Oooo0o = Collections.unmodifiableList(list);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(@NonNull E e) {
        return this.f38540Oooo0o.add(e);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(@NonNull Collection<? extends E> collection) {
        return this.f38540Oooo0o.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f38540Oooo0o.clear();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(@Nullable Object obj) {
        return this.f38540Oooo0o.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(@NonNull Collection<?> collection) {
        return this.f38540Oooo0o.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(@Nullable Object obj) {
        return this.f38540Oooo0o.equals(obj);
    }

    @Override // java.util.List
    @NonNull
    public final E get(int i) {
        return this.f38540Oooo0o.get(i);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f38540Oooo0o.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(@Nullable Object obj) {
        return this.f38540Oooo0o.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f38540Oooo0o.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @NonNull
    public final Iterator<E> iterator() {
        return this.f38540Oooo0o.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(@Nullable Object obj) {
        return this.f38540Oooo0o.lastIndexOf(obj);
    }

    @Override // java.util.List
    @NonNull
    public final ListIterator<E> listIterator() {
        return this.f38540Oooo0o.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(@Nullable Object obj) {
        return this.f38540Oooo0o.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(@NonNull Collection<?> collection) {
        return this.f38540Oooo0o.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(@NonNull Collection<?> collection) {
        return this.f38540Oooo0o.retainAll(collection);
    }

    @Override // java.util.List
    @NonNull
    public final E set(int i, @NonNull E e) {
        return this.f38540Oooo0o.set(i, e);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f38540Oooo0o.size();
    }

    @Override // java.util.List
    @NonNull
    public final List<E> subList(int i, int i2) {
        return this.f38540Oooo0o.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    @Nullable
    public final Object[] toArray() {
        return this.f38540Oooo0o.toArray();
    }

    @Override // java.util.List
    public final void add(int i, @NonNull E e) {
        this.f38540Oooo0o.add(i, e);
    }

    @Override // java.util.List
    public final boolean addAll(int i, @NonNull Collection<? extends E> collection) {
        return this.f38540Oooo0o.addAll(i, collection);
    }

    @Override // java.util.List
    @NonNull
    public final ListIterator<E> listIterator(int i) {
        return this.f38540Oooo0o.listIterator(i);
    }

    @Override // java.util.List
    public final E remove(int i) {
        return this.f38540Oooo0o.remove(i);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(@Nullable T[] tArr) {
        return (T[]) this.f38540Oooo0o.toArray(tArr);
    }
}

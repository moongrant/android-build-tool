package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
public abstract class o000OO<E> extends o000O0o implements Collection<E> {
    @Override // com.google.common.collect.o000O0o
    /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
    public abstract Collection<E> OooO00o();

    public final boolean OooO0OO(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean OooO0o0(Collection<?> collection) {
        Iterator<E> it = iterator();
        Objects.requireNonNull(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public final Object[] OooO0oO() {
        return toArray(new Object[size()]);
    }

    @CanIgnoreReturnValue
    public boolean add(E e) {
        return OooO00o().add(e);
    }

    @CanIgnoreReturnValue
    public boolean addAll(Collection<? extends E> collection) {
        return OooO00o().addAll(collection);
    }

    public void clear() {
        OooO00o().clear();
    }

    public boolean contains(Object obj) {
        return OooO00o().contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return OooO00o().containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return OooO00o().isEmpty();
    }

    public Iterator<E> iterator() {
        return OooO00o().iterator();
    }

    @CanIgnoreReturnValue
    public boolean remove(Object obj) {
        return OooO00o().remove(obj);
    }

    @CanIgnoreReturnValue
    public boolean removeAll(Collection<?> collection) {
        return OooO00o().removeAll(collection);
    }

    @CanIgnoreReturnValue
    public boolean retainAll(Collection<?> collection) {
        return OooO00o().retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return OooO00o().size();
    }

    public Object[] toArray() {
        return OooO00o().toArray();
    }

    @CanIgnoreReturnValue
    public <T> T[] toArray(T[] tArr) {
        return (T[]) OooO00o().toArray(tArr);
    }
}

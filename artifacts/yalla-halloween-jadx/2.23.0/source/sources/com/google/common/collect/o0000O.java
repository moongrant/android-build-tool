package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class o0000O<E> extends o000Oo0 implements Collection<E> {
    @Override // com.google.common.collect.o000Oo0
    /* JADX INFO: renamed from: OooO0O0, reason: merged with bridge method [inline-methods] */
    public abstract Collection<E> OooO00o();

    public final boolean OooO0OO(Collection<?> collection) {
        Iterator<E> it = iterator();
        collection.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @CanIgnoreReturnValue
    public boolean add(@ParametricNullness E e) {
        return OooO00o().add(e);
    }

    @CanIgnoreReturnValue
    public boolean addAll(Collection<? extends E> collection) {
        return OooO00o().addAll(collection);
    }

    public void clear() {
        OooO00o().clear();
    }

    public boolean contains(@CheckForNull Object obj) {
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
    public boolean remove(@CheckForNull Object obj) {
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

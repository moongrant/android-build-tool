package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.Collection;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
@Beta
@GwtCompatible
public final class EvictingQueue<E> extends o000Oo0<E> implements Serializable {
    @Override // com.google.common.collect.o000Oo0, com.google.common.collect.o000OO, com.google.common.collect.o000O0o
    public final /* bridge */ /* synthetic */ Object OooO00o() {
        return null;
    }

    @Override // com.google.common.collect.o000Oo0, com.google.common.collect.o000OO
    /* JADX INFO: renamed from: OooO0O0 */
    public final /* bridge */ /* synthetic */ Collection OooO00o() {
        return null;
    }

    /* JADX WARN: Incorrect return type in method signature: ()Ljava/util/Queue<TE;>; */
    @Override // com.google.common.collect.o000Oo0
    public final void OooO0oo() {
    }

    @Override // com.google.common.collect.o000OO, java.util.Collection, java.util.Queue
    @CanIgnoreReturnValue
    public final boolean add(E e) {
        Objects.requireNonNull(e);
        return true;
    }

    @Override // com.google.common.collect.o000OO, java.util.Collection
    @CanIgnoreReturnValue
    public final boolean addAll(Collection<? extends E> collection) {
        int size = collection.size();
        if (size < 0) {
            return o00O0.OooO00o(this, collection.iterator());
        }
        clear();
        int i = size - 0;
        o0OOOO0o.OooOOOO.OooO0Oo(i >= 0, "number to skip cannot be negative");
        Iterable o00o00o2 = new o00O00O(collection, i);
        return o00o00o2 instanceof Collection ? addAll((Collection) o00o00o2) : o00O0.OooO00o(this, o00o00o2.iterator());
    }

    @Override // com.google.common.collect.o000OO, java.util.Collection
    public final boolean contains(Object obj) {
        Objects.requireNonNull(obj);
        throw null;
    }

    @Override // com.google.common.collect.o000Oo0, java.util.Queue
    @CanIgnoreReturnValue
    public final boolean offer(E e) {
        Objects.requireNonNull(e);
        return true;
    }

    @Override // com.google.common.collect.o000OO, java.util.Collection
    @CanIgnoreReturnValue
    public final boolean remove(Object obj) {
        Objects.requireNonNull(obj);
        throw null;
    }
}

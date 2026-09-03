package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
@Beta
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class EvictingQueue<E> extends o000O00<E> implements Serializable {
    @Override // com.google.common.collect.o000O00, com.google.common.collect.o0000O, com.google.common.collect.o000Oo0
    public final /* bridge */ /* synthetic */ Object OooO00o() {
        return null;
    }

    @Override // com.google.common.collect.o000O00, com.google.common.collect.o0000O
    /* JADX INFO: renamed from: OooO0O0 */
    public final /* bridge */ /* synthetic */ Collection OooO00o() {
        return null;
    }

    @Override // com.google.common.collect.o000O00
    public final void OooO0Oo() {
    }

    @Override // com.google.common.collect.o0000O, java.util.Collection, java.util.Queue
    @CanIgnoreReturnValue
    public final boolean add(E e) {
        e.getClass();
        return true;
    }

    @Override // com.google.common.collect.o0000O, java.util.Collection
    @CanIgnoreReturnValue
    public final boolean addAll(Collection<? extends E> collection) {
        int size = collection.size();
        if (size < 0) {
            return o00O0O0O.OooO00o(this, collection.iterator());
        }
        clear();
        int i = size - 0;
        com.google.common.base.o000oOoO.OooO0o0(i >= 0, "number to skip cannot be negative");
        Iterable o00o00oo2 = new o00O00OO(collection, i);
        return o00o00oo2 instanceof Collection ? addAll((Collection) o00o00oo2) : o00O0O0O.OooO00o(this, o00o00oo2.iterator());
    }

    @Override // com.google.common.collect.o000O00, java.util.Queue
    @CanIgnoreReturnValue
    public final boolean offer(E e) {
        e.getClass();
        return true;
    }

    @Override // com.google.common.collect.o0000O, java.util.Collection
    public final Object[] toArray() {
        return super.toArray();
    }
}

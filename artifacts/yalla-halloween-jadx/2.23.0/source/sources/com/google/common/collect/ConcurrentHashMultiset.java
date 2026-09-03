package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public final class ConcurrentHashMultiset<E> extends OooOOOO<E> implements Serializable {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final /* synthetic */ int f19107OooO0o = 0;

    public class OooO00o extends OooO0o<o0oOO.OooO00o<E>> {
        public OooO00o(ConcurrentHashMultiset concurrentHashMultiset) {
            int i = ConcurrentHashMultiset.f19107OooO0o;
            concurrentHashMultiset.getClass();
            throw null;
        }

        @Override // com.google.common.collect.OooO0o
        @CheckForNull
        public final Object OooO00o() {
            throw null;
        }
    }

    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final o0O00oO0.OooO00o<ConcurrentHashMultiset> f19109OooO00o = o0O00oO0.OooO00o(ConcurrentHashMultiset.class, "countMap");
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        OooO0OO.f19109OooO00o.OooO00o(this, (ConcurrentMap) objectInputStream.readObject());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(null);
    }

    @Override // com.google.common.collect.OooOOOO
    public final Set<E> OooO00o() {
        throw null;
    }

    @Override // com.google.common.collect.OooOOOO
    @Deprecated
    public final Set<o0oOO.OooO00o<E>> OooO0O0() {
        return new OooO0O0();
    }

    @Override // com.google.common.collect.OooOOOO
    public final int OooO0OO() {
        throw null;
    }

    @Override // com.google.common.collect.OooOOOO
    public final Iterator<E> OooO0Oo() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.OooOOOO
    public final Iterator<o0oOO.OooO00o<E>> OooO0o0() {
        new OooO00o(this);
        throw null;
    }

    @Override // com.google.common.collect.OooOOOO, com.google.common.collect.o0oOO
    @CanIgnoreReturnValue
    public final int Oooo00o(int i, @CheckForNull Object obj) {
        if (i == 0) {
            oo0O.OooO0OO(obj, null);
            throw null;
        }
        oo000o.OooO0OO(i, "occurrences");
        oo0O.OooO0OO(obj, null);
        throw null;
    }

    @Override // com.google.common.collect.OooOOOO, com.google.common.collect.o0oOO
    @CanIgnoreReturnValue
    public final int Oooooo(E e, int i) {
        e.getClass();
        if (i == 0) {
            oo0O.OooO0OO(e, null);
            throw null;
        }
        oo000o.OooO0OO(i, "occurrences");
        oo0O.OooO0OO(e, null);
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw null;
    }

    @Override // com.google.common.collect.OooOOOO, java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return oo00oO.OooO0OO(this);
    }

    @Override // com.google.common.collect.OooOOOO, com.google.common.collect.o0oOO
    @CanIgnoreReturnValue
    public final int o0000OOo(Object obj) {
        obj.getClass();
        oo000o.OooO0O0(0, "count");
        oo0O.OooO0OO(obj, null);
        throw null;
    }

    @Override // com.google.common.collect.o0oOO
    public final int o000OOo(@CheckForNull Object obj) {
        oo0O.OooO0OO(obj, null);
        throw null;
    }

    @Override // com.google.common.collect.OooOOOO, com.google.common.collect.o0oOO
    @CanIgnoreReturnValue
    public final boolean o00Oo0(int i, Object obj) {
        obj.getClass();
        oo000o.OooO0O0(i, "oldCount");
        oo000o.OooO0O0(0, "newCount");
        oo0O.OooO0OO(obj, null);
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        throw null;
    }

    public class OooO0O0 extends OooOOOO<E>.OooO0O0 {
        public OooO0O0() {
            super();
        }

        @Override // com.google.common.collect.OooOOOO.OooO0O0, com.google.common.collect.oo00oO.OooO0OO
        public final o0oOO OooO0Oo() {
            return ConcurrentHashMultiset.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final Object[] toArray() {
            int size = size();
            oo000o.OooO0O0(size, "arraySize");
            ArrayList arrayList = new ArrayList(com.google.common.primitives.OooO0o.OooO0OO(((long) size) + 5 + ((long) (size / 10))));
            o00O0O0O.OooO00o(arrayList, iterator());
            return arrayList.toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final <T> T[] toArray(T[] tArr) {
            int size = size();
            oo000o.OooO0O0(size, "arraySize");
            ArrayList arrayList = new ArrayList(com.google.common.primitives.OooO0o.OooO0OO(((long) size) + 5 + ((long) (size / 10))));
            o00O0O0O.OooO00o(arrayList, iterator());
            return (T[]) arrayList.toArray(tArr);
        }
    }
}

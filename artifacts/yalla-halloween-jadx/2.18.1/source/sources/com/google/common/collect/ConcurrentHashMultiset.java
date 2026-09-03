package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtIncompatible
public final class ConcurrentHashMultiset<E> extends OooOOOO<E> implements Serializable {

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final o0O00.OooO00o<ConcurrentHashMultiset> f18121OooO00o = o0O00.OooO00o(ConcurrentHashMultiset.class, "countMap");
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        OooO0O0.f18121OooO00o.OooO00o(this, (ConcurrentMap) objectInputStream.readObject());
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
    public final Set<o00OO.OooO00o<E>> OooO0O0() {
        return new OooO00o();
    }

    @Override // com.google.common.collect.OooOOOO
    public final int OooO0OO() {
        throw null;
    }

    @Override // com.google.common.collect.OooOOOO
    public final Iterator<E> OooO0o0() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.OooOOOO
    public final Iterator<o00OO.OooO00o<E>> OooO0oO() {
        Objects.requireNonNull(this);
        throw null;
    }

    @Override // com.google.common.collect.OooOOOO, com.google.common.collect.o00OO
    @CanIgnoreReturnValue
    public final int OooOOO(@NullableDecl Object obj, int i) {
        if (i == 0) {
            o00OO00O.OooO0Oo(null, obj);
            throw null;
        }
        oo000o.OooO0OO(i, "occurences");
        o00OO00O.OooO0Oo(null, obj);
        throw null;
    }

    @Override // com.google.common.collect.OooOOOO, com.google.common.collect.o00OO
    @CanIgnoreReturnValue
    public final int OooOOo(E e, int i) {
        Objects.requireNonNull(e);
        if (i == 0) {
            o00OO00O.OooO0Oo(null, e);
            throw null;
        }
        oo000o.OooO0OO(i, "occurences");
        o00OO00O.OooO0Oo(null, e);
        throw null;
    }

    @Override // com.google.common.collect.OooOOOO, com.google.common.collect.o00OO
    @CanIgnoreReturnValue
    public final boolean Oooo0(Object obj, int i) {
        Objects.requireNonNull(obj);
        oo000o.OooO0O0(i, "oldCount");
        oo000o.OooO0O0(0, "newCount");
        o00OO00O.OooO0Oo(null, obj);
        throw null;
    }

    @Override // com.google.common.collect.o00OO
    public final int Ooooo0o(@NullableDecl Object obj) {
        o00OO00O.OooO0Oo(null, obj);
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
        return o00OOO0.OooO0O0(this);
    }

    @Override // com.google.common.collect.OooOOOO, com.google.common.collect.o00OO
    @CanIgnoreReturnValue
    public final int o0000O0O(Object obj) {
        Objects.requireNonNull(obj);
        oo000o.OooO0O0(0, "count");
        o00OO00O.OooO0Oo(null, obj);
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o00OO
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

    public class OooO00o extends OooOOOO<E>.OooO0O0 {
        public OooO00o() {
            super();
        }

        @Override // com.google.common.collect.OooOOOO.OooO0O0, com.google.common.collect.o00OOO0.OooO0OO
        public final o00OO OooO0o0() {
            return ConcurrentHashMultiset.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final Object[] toArray() {
            ArrayList arrayListOooO00o = o00O0OO0.OooO00o(size());
            o00O0.OooO00o(arrayListOooO00o, iterator());
            return arrayListOooO00o.toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final <T> T[] toArray(T[] tArr) {
            ArrayList arrayListOooO00o = o00O0OO0.OooO00o(size());
            o00O0.OooO00o(arrayListOooO00o, iterator());
            return (T[]) arrayListOooO00o.toArray(tArr);
        }
    }
}

package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true)
public abstract class OooOO0O<E> extends OooOOOO<E> implements Serializable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public transient long f18349Oooo;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public transient o00OOOOo<E> f18350Oooo0oo;

    public class OooO00o extends OooOO0O<E>.OooO0OO<E> {
        public OooO00o() {
            super();
        }

        @Override // com.google.common.collect.OooOO0O.OooO0OO
        public final E OooO00o(int i) {
            o00OOOOo<E> o00ooooo2 = OooOO0O.this.f18350Oooo0oo;
            o0OOOO0o.OooOOOO.OooO(i, o00ooooo2.f18558OooO0OO);
            return (E) o00ooooo2.f18556OooO00o[i];
        }
    }

    public class OooO0O0 extends OooOO0O<E>.OooO0OO<o00OO.OooO00o<E>> {
        public OooO0O0() {
            super();
        }

        @Override // com.google.common.collect.OooOO0O.OooO0OO
        public final Object OooO00o(int i) {
            o00OOOOo<E> o00ooooo2 = OooOO0O.this.f18350Oooo0oo;
            o0OOOO0o.OooOOOO.OooO(i, o00ooooo2.f18558OooO0OO);
            return new o00OOOOo.OooO00o(i);
        }
    }

    public abstract class OooO0OO<T> implements Iterator<T> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f18354Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f18355Oooo0oO = -1;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f18356Oooo0oo;

        public OooO0OO() {
            this.f18354Oooo0o = OooOO0O.this.f18350Oooo0oo.OooO0O0();
            this.f18356Oooo0oo = OooOO0O.this.f18350Oooo0oo.f18559OooO0Oo;
        }

        public abstract T OooO00o(int i);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (OooOO0O.this.f18350Oooo0oo.f18559OooO0Oo == this.f18356Oooo0oo) {
                return this.f18354Oooo0o >= 0;
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T tOooO00o = OooO00o(this.f18354Oooo0o);
            int i = this.f18354Oooo0o;
            this.f18355Oooo0oO = i;
            this.f18354Oooo0o = OooOO0O.this.f18350Oooo0oo.OooO0oo(i);
            return tOooO00o;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (OooOO0O.this.f18350Oooo0oo.f18559OooO0Oo != this.f18356Oooo0oo) {
                throw new ConcurrentModificationException();
            }
            oo000o.OooO0Oo(this.f18355Oooo0oO != -1);
            OooOO0O oooOO0O = OooOO0O.this;
            oooOO0O.f18349Oooo -= (long) oooOO0O.f18350Oooo0oo.OooOO0o(this.f18355Oooo0oO);
            this.f18354Oooo0o = OooOO0O.this.f18350Oooo0oo.OooO(this.f18354Oooo0o, this.f18355Oooo0oO);
            this.f18355Oooo0oO = -1;
            this.f18356Oooo0oo = OooOO0O.this.f18350Oooo0oo.f18559OooO0Oo;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        OooO0oo(3);
        for (int i2 = 0; i2 < i; i2++) {
            OooOOo(objectInputStream.readObject(), objectInputStream.readInt());
        }
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        o0O00.OooO0oO(this, objectOutputStream);
    }

    @Override // com.google.common.collect.OooOOOO
    public final int OooO0OO() {
        return this.f18350Oooo0oo.f18558OooO0OO;
    }

    @Override // com.google.common.collect.OooOOOO
    public final Iterator<E> OooO0o0() {
        return new OooO00o();
    }

    @Override // com.google.common.collect.OooOOOO
    public final Iterator<o00OO.OooO00o<E>> OooO0oO() {
        return new OooO0O0();
    }

    public abstract void OooO0oo(int i);

    @Override // com.google.common.collect.OooOOOO, com.google.common.collect.o00OO
    @CanIgnoreReturnValue
    public final int OooOOO(@NullableDecl Object obj, int i) {
        if (i == 0) {
            return Ooooo0o(obj);
        }
        o0OOOO0o.OooOOOO.OooO0o(i > 0, "occurrences cannot be negative: %s", i);
        int iOooO0Oo = this.f18350Oooo0oo.OooO0Oo(obj);
        if (iOooO0Oo == -1) {
            return 0;
        }
        int iOooO0OO = this.f18350Oooo0oo.OooO0OO(iOooO0Oo);
        if (iOooO0OO > i) {
            this.f18350Oooo0oo.OooOOO(iOooO0Oo, iOooO0OO - i);
        } else {
            this.f18350Oooo0oo.OooOO0o(iOooO0Oo);
            i = iOooO0OO;
        }
        this.f18349Oooo -= (long) i;
        return iOooO0OO;
    }

    @Override // com.google.common.collect.OooOOOO, com.google.common.collect.o00OO
    @CanIgnoreReturnValue
    public final int OooOOo(@NullableDecl E e, int i) {
        if (i == 0) {
            return Ooooo0o(e);
        }
        o0OOOO0o.OooOOOO.OooO0o(i > 0, "occurrences cannot be negative: %s", i);
        int iOooO0Oo = this.f18350Oooo0oo.OooO0Oo(e);
        if (iOooO0Oo == -1) {
            this.f18350Oooo0oo.OooOO0(e, i);
            this.f18349Oooo += (long) i;
            return 0;
        }
        int iOooO0OO = this.f18350Oooo0oo.OooO0OO(iOooO0Oo);
        long j = i;
        long j2 = ((long) iOooO0OO) + j;
        o0OOOO0o.OooOOOO.OooO0OO(j2 <= 2147483647L, j2);
        this.f18350Oooo0oo.OooOOO(iOooO0Oo, (int) j2);
        this.f18349Oooo += j;
        return iOooO0OO;
    }

    @Override // com.google.common.collect.OooOOOO, com.google.common.collect.o00OO
    public final boolean Oooo0(@NullableDecl Object obj, int i) {
        oo000o.OooO0O0(i, "oldCount");
        oo000o.OooO0O0(0, "newCount");
        int iOooO0Oo = this.f18350Oooo0oo.OooO0Oo(obj);
        if (iOooO0Oo == -1) {
            return i == 0;
        }
        if (this.f18350Oooo0oo.OooO0OO(iOooO0Oo) != i) {
            return false;
        }
        this.f18350Oooo0oo.OooOO0o(iOooO0Oo);
        this.f18349Oooo -= (long) i;
        return true;
    }

    @Override // com.google.common.collect.o00OO
    public final int Ooooo0o(@NullableDecl Object obj) {
        o00OOOOo<E> o00ooooo2 = this.f18350Oooo0oo;
        int iOooO0Oo = o00ooooo2.OooO0Oo(obj);
        if (iOooO0Oo == -1) {
            return 0;
        }
        return o00ooooo2.f18557OooO0O0[iOooO0Oo];
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f18350Oooo0oo.OooO00o();
        this.f18349Oooo = 0L;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return o00OOO0.OooO0O0(this);
    }

    @Override // com.google.common.collect.OooOOOO, com.google.common.collect.o00OO
    @CanIgnoreReturnValue
    public final int o0000O0O(@NullableDecl Object obj) {
        oo000o.OooO0O0(0, "count");
        o00OOOOo<E> o00ooooo2 = this.f18350Oooo0oo;
        Objects.requireNonNull(o00ooooo2);
        int iOooOO0O = o00ooooo2.OooOO0O(obj, o000O0Oo.OooO0OO(obj));
        this.f18349Oooo += (long) (0 - iOooOO0O);
        return iOooOO0O;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o00OO
    public final int size() {
        return o0OOOOO.OooO0OO.OooO00o(this.f18349Oooo);
    }
}

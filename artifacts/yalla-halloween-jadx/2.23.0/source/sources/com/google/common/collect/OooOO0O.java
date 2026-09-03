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
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public abstract class OooOO0O<E> extends OooOOOO<E> implements Serializable {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public transient o0O00000<E> f19341OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public transient long f19342OooO0oO;

    public class OooO00o extends OooOO0O<E>.OooO0OO<E> {
        public OooO00o() {
            super();
        }

        @Override // com.google.common.collect.OooOO0O.OooO0OO
        @ParametricNullness
        public final E OooO00o(int i) {
            o0O00000<E> o0o00000 = OooOO0O.this.f19341OooO0o;
            com.google.common.base.o000oOoO.OooO0oo(i, o0o00000.f19541OooO0OO);
            return (E) o0o00000.f19539OooO00o[i];
        }
    }

    public class OooO0O0 extends OooOO0O<E>.OooO0OO<o0oOO.OooO00o<E>> {
        public OooO0O0() {
            super();
        }

        @Override // com.google.common.collect.OooOO0O.OooO0OO
        public final Object OooO00o(int i) {
            o0O00000<E> o0o00000 = OooOO0O.this.f19341OooO0o;
            com.google.common.base.o000oOoO.OooO0oo(i, o0o00000.f19541OooO0OO);
            return new o0O00000.OooO00o(i);
        }
    }

    public abstract class OooO0OO<T> implements Iterator<T> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f19345OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f19346OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f19347OooO0o0 = -1;

        public OooO0OO() {
            this.f19345OooO0Oo = OooOO0O.this.f19341OooO0o.OooO0O0();
            this.f19346OooO0o = OooOO0O.this.f19341OooO0o.f19542OooO0Oo;
        }

        @ParametricNullness
        public abstract T OooO00o(int i);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (OooOO0O.this.f19341OooO0o.f19542OooO0Oo == this.f19346OooO0o) {
                return this.f19345OooO0Oo >= 0;
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public final T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T tOooO00o = OooO00o(this.f19345OooO0Oo);
            int i = this.f19345OooO0Oo;
            this.f19347OooO0o0 = i;
            this.f19345OooO0Oo = OooOO0O.this.f19341OooO0o.OooO0oO(i);
            return tOooO00o;
        }

        @Override // java.util.Iterator
        public final void remove() {
            OooOO0O oooOO0O = OooOO0O.this;
            if (oooOO0O.f19341OooO0o.f19542OooO0Oo != this.f19346OooO0o) {
                throw new ConcurrentModificationException();
            }
            oo000o.OooO0Oo(this.f19347OooO0o0 != -1);
            oooOO0O.f19342OooO0oO -= (long) oooOO0O.f19341OooO0o.OooOO0O(this.f19347OooO0o0);
            this.f19345OooO0Oo = oooOO0O.f19341OooO0o.OooO0oo(this.f19345OooO0Oo, this.f19347OooO0o0);
            this.f19347OooO0o0 = -1;
            this.f19346OooO0o = oooOO0O.f19341OooO0o.f19542OooO0Oo;
        }
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        this.f19341OooO0o = OooO0o();
        o0O00oO0.OooO0Oo(this, objectInputStream, i);
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        o0O00oO0.OooO0oO(this, objectOutputStream);
    }

    @Override // com.google.common.collect.OooOOOO
    public final int OooO0OO() {
        return this.f19341OooO0o.f19541OooO0OO;
    }

    @Override // com.google.common.collect.OooOOOO
    public final Iterator<E> OooO0Oo() {
        return new OooO00o();
    }

    public abstract o0O00000 OooO0o();

    @Override // com.google.common.collect.OooOOOO
    public final Iterator<o0oOO.OooO00o<E>> OooO0o0() {
        return new OooO0O0();
    }

    @Override // com.google.common.collect.OooOOOO, com.google.common.collect.o0oOO
    @CanIgnoreReturnValue
    public final int Oooo00o(int i, @CheckForNull Object obj) {
        if (i == 0) {
            return o000OOo(obj);
        }
        com.google.common.base.o000oOoO.OooO0OO("occurrences cannot be negative: %s", i, i > 0);
        int iOooO0OO = this.f19341OooO0o.OooO0OO(obj);
        if (iOooO0OO == -1) {
            return 0;
        }
        o0O00000<E> o0o00000 = this.f19341OooO0o;
        com.google.common.base.o000oOoO.OooO0oo(iOooO0OO, o0o00000.f19541OooO0OO);
        int i2 = o0o00000.f19540OooO0O0[iOooO0OO];
        if (i2 > i) {
            o0O00000<E> o0o00001 = this.f19341OooO0o;
            com.google.common.base.o000oOoO.OooO0oo(iOooO0OO, o0o00001.f19541OooO0OO);
            o0o00001.f19540OooO0O0[iOooO0OO] = i2 - i;
        } else {
            this.f19341OooO0o.OooOO0O(iOooO0OO);
            i = i2;
        }
        this.f19342OooO0oO -= (long) i;
        return i2;
    }

    @Override // com.google.common.collect.OooOOOO, com.google.common.collect.o0oOO
    @CanIgnoreReturnValue
    public final int Oooooo(@ParametricNullness E e, int i) {
        if (i == 0) {
            return o000OOo(e);
        }
        com.google.common.base.o000oOoO.OooO0OO("occurrences cannot be negative: %s", i, i > 0);
        int iOooO0OO = this.f19341OooO0o.OooO0OO(e);
        if (iOooO0OO == -1) {
            this.f19341OooO0o.OooO(i, e);
            this.f19342OooO0oO += (long) i;
            return 0;
        }
        o0O00000<E> o0o00000 = this.f19341OooO0o;
        com.google.common.base.o000oOoO.OooO0oo(iOooO0OO, o0o00000.f19541OooO0OO);
        int i2 = o0o00000.f19540OooO0O0[iOooO0OO];
        long j = i;
        long j2 = ((long) i2) + j;
        com.google.common.base.o000oOoO.OooO0O0(j2, "too many occurrences: %s", j2 <= 2147483647L);
        o0O00000<E> o0o00001 = this.f19341OooO0o;
        com.google.common.base.o000oOoO.OooO0oo(iOooO0OO, o0o00001.f19541OooO0OO);
        o0o00001.f19540OooO0O0[iOooO0OO] = (int) j2;
        this.f19342OooO0oO += j;
        return i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f19341OooO0o.OooO00o();
        this.f19342OooO0oO = 0L;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return oo00oO.OooO0OO(this);
    }

    @Override // com.google.common.collect.OooOOOO, com.google.common.collect.o0oOO
    @CanIgnoreReturnValue
    public final int o0000OOo(@ParametricNullness Object obj) {
        oo000o.OooO0O0(0, "count");
        o0O00000<E> o0o00000 = this.f19341OooO0o;
        o0o00000.getClass();
        int iOooOO0 = o0o00000.OooOO0(o000OO0O.OooO0OO(obj), obj);
        this.f19342OooO0oO += (long) (0 - iOooOO0);
        return iOooOO0;
    }

    @Override // com.google.common.collect.o0oOO
    public final int o000OOo(@CheckForNull Object obj) {
        o0O00000<E> o0o00000 = this.f19341OooO0o;
        int iOooO0OO = o0o00000.OooO0OO(obj);
        if (iOooO0OO == -1) {
            return 0;
        }
        return o0o00000.f19540OooO0O0[iOooO0OO];
    }

    @Override // com.google.common.collect.OooOOOO, com.google.common.collect.o0oOO
    public final boolean o00Oo0(int i, @ParametricNullness Object obj) {
        oo000o.OooO0O0(i, "oldCount");
        oo000o.OooO0O0(0, "newCount");
        int iOooO0OO = this.f19341OooO0o.OooO0OO(obj);
        if (iOooO0OO == -1) {
            return i == 0;
        }
        o0O00000<E> o0o00000 = this.f19341OooO0o;
        com.google.common.base.o000oOoO.OooO0oo(iOooO0OO, o0o00000.f19541OooO0OO);
        if (o0o00000.f19540OooO0O0[iOooO0OO] != i) {
            return false;
        }
        this.f19341OooO0o.OooOO0O(iOooO0OO);
        this.f19342OooO0oO -= (long) i;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return com.google.common.primitives.OooO0o.OooO0OO(this.f19342OooO0oO);
    }
}

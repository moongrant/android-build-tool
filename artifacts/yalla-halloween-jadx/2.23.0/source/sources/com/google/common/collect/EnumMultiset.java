package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.Enum;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class EnumMultiset<E extends Enum<E>> extends OooOOOO<E> implements Serializable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public transient int f19113OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public transient Class<E> f19114OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public transient E[] f19115OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public transient int[] f19116OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public transient long f19117OooOO0;

    public class OooO00o extends EnumMultiset<E>.OooO0OO<E> {
        public OooO00o() {
            super();
        }

        @Override // com.google.common.collect.EnumMultiset.OooO0OO
        public final Object OooO00o(int i) {
            return EnumMultiset.this.f19115OooO0oO[i];
        }
    }

    public class OooO0O0 extends EnumMultiset<E>.OooO0OO<o0oOO.OooO00o<E>> {
        public OooO0O0() {
            super();
        }

        @Override // com.google.common.collect.EnumMultiset.OooO0OO
        public final Object OooO00o(int i) {
            return new o0000O0(this, i);
        }
    }

    public abstract class OooO0OO<T> implements Iterator<T> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f19120OooO0Oo = 0;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f19122OooO0o0 = -1;

        public OooO0OO() {
        }

        public abstract T OooO00o(int i);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            while (true) {
                int i = this.f19120OooO0Oo;
                EnumMultiset enumMultiset = EnumMultiset.this;
                if (i >= enumMultiset.f19115OooO0oO.length) {
                    return false;
                }
                if (enumMultiset.f19116OooO0oo[i] > 0) {
                    return true;
                }
                this.f19120OooO0Oo = i + 1;
            }
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T tOooO00o = OooO00o(this.f19120OooO0Oo);
            int i = this.f19120OooO0Oo;
            this.f19122OooO0o0 = i;
            this.f19120OooO0Oo = i + 1;
            return tOooO00o;
        }

        @Override // java.util.Iterator
        public final void remove() {
            oo000o.OooO0Oo(this.f19122OooO0o0 >= 0);
            EnumMultiset enumMultiset = EnumMultiset.this;
            int[] iArr = enumMultiset.f19116OooO0oo;
            int i = this.f19122OooO0o0;
            int i2 = iArr[i];
            if (i2 > 0) {
                enumMultiset.f19113OooO--;
                enumMultiset.f19117OooOO0 -= (long) i2;
                iArr[i] = 0;
            }
            this.f19122OooO0o0 = -1;
        }
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Class<E> cls = (Class) objectInputStream.readObject();
        this.f19114OooO0o = cls;
        E[] enumConstants = cls.getEnumConstants();
        this.f19115OooO0oO = enumConstants;
        this.f19116OooO0oo = new int[enumConstants.length];
        o0O00oO0.OooO0Oo(this, objectInputStream, objectInputStream.readInt());
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f19114OooO0o);
        o0O00oO0.OooO0oO(this, objectOutputStream);
    }

    @Override // com.google.common.collect.OooOOOO
    public final int OooO0OO() {
        return this.f19113OooO;
    }

    @Override // com.google.common.collect.OooOOOO
    public final Iterator<E> OooO0Oo() {
        return new OooO00o();
    }

    public final void OooO0o(Object obj) {
        obj.getClass();
        if (OooO0oo(obj)) {
            return;
        }
        String strValueOf = String.valueOf(this.f19114OooO0o);
        String strValueOf2 = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(strValueOf2.length() + strValueOf.length() + 21);
        sb.append("Expected an ");
        sb.append(strValueOf);
        sb.append(" but got ");
        sb.append(strValueOf2);
        throw new ClassCastException(sb.toString());
    }

    @Override // com.google.common.collect.OooOOOO
    public final Iterator<o0oOO.OooO00o<E>> OooO0o0() {
        return new OooO0O0();
    }

    public final boolean OooO0oo(@CheckForNull Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r5 = (Enum) obj;
        int iOrdinal = r5.ordinal();
        E[] eArr = this.f19115OooO0oO;
        return iOrdinal < eArr.length && eArr[iOrdinal] == r5;
    }

    @Override // com.google.common.collect.OooOOOO, com.google.common.collect.o0oOO
    @CanIgnoreReturnValue
    public final int Oooo00o(int i, @CheckForNull Object obj) {
        if (obj == null || !OooO0oo(obj)) {
            return 0;
        }
        Enum r1 = (Enum) obj;
        oo000o.OooO0O0(i, "occurrences");
        if (i == 0) {
            return o000OOo(obj);
        }
        int iOrdinal = r1.ordinal();
        int[] iArr = this.f19116OooO0oo;
        int i2 = iArr[iOrdinal];
        if (i2 == 0) {
            return 0;
        }
        if (i2 <= i) {
            iArr[iOrdinal] = 0;
            this.f19113OooO--;
            this.f19117OooOO0 -= (long) i2;
        } else {
            iArr[iOrdinal] = i2 - i;
            this.f19117OooOO0 -= (long) i;
        }
        return i2;
    }

    @Override // com.google.common.collect.OooOOOO, com.google.common.collect.o0oOO
    @CanIgnoreReturnValue
    public final int Oooooo(Object obj, int i) {
        Enum r8 = (Enum) obj;
        OooO0o(r8);
        oo000o.OooO0O0(i, "occurrences");
        if (i == 0) {
            return o000OOo(r8);
        }
        int iOrdinal = r8.ordinal();
        int i2 = this.f19116OooO0oo[iOrdinal];
        long j = i;
        long j2 = ((long) i2) + j;
        com.google.common.base.o000oOoO.OooO0O0(j2, "too many occurrences: %s", j2 <= 2147483647L);
        this.f19116OooO0oo[iOrdinal] = (int) j2;
        if (i2 == 0) {
            this.f19113OooO++;
        }
        this.f19117OooOO0 += j;
        return i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        Arrays.fill(this.f19116OooO0oo, 0);
        this.f19117OooOO0 = 0L;
        this.f19113OooO = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return oo00oO.OooO0OO(this);
    }

    @Override // com.google.common.collect.OooOOOO, com.google.common.collect.o0oOO
    @CanIgnoreReturnValue
    public final int o0000OOo(Object obj) {
        Enum r6 = (Enum) obj;
        OooO0o(r6);
        oo000o.OooO0O0(0, "count");
        int iOrdinal = r6.ordinal();
        int[] iArr = this.f19116OooO0oo;
        int i = iArr[iOrdinal];
        iArr[iOrdinal] = 0;
        this.f19117OooOO0 += (long) (0 - i);
        if (i > 0) {
            this.f19113OooO--;
        }
        return i;
    }

    @Override // com.google.common.collect.o0oOO
    public final int o000OOo(@CheckForNull Object obj) {
        if (obj == null || !OooO0oo(obj)) {
            return 0;
        }
        return this.f19116OooO0oo[((Enum) obj).ordinal()];
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return com.google.common.primitives.OooO0o.OooO0OO(this.f19117OooOO0);
    }
}

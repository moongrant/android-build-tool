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
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true)
public final class EnumMultiset<E extends Enum<E>> extends OooOOOO<E> implements Serializable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public transient E[] f18125Oooo;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public transient Class<E> f18126Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public transient int f18127OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public transient int[] f18128OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public transient long f18129OoooO0O;

    public class OooO00o extends EnumMultiset<E>.OooO0OO<E> {
        public OooO00o() {
            super();
        }

        @Override // com.google.common.collect.EnumMultiset.OooO0OO
        public final Object OooO00o(int i) {
            return EnumMultiset.this.f18125Oooo[i];
        }
    }

    public class OooO0O0 extends EnumMultiset<E>.OooO0OO<o00OO.OooO00o<E>> {
        public OooO0O0() {
            super();
        }

        @Override // com.google.common.collect.EnumMultiset.OooO0OO
        public final Object OooO00o(int i) {
            return new o0000oo(this, i);
        }
    }

    public abstract class OooO0OO<T> implements Iterator<T> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f18132Oooo0o = 0;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f18133Oooo0oO = -1;

        public OooO0OO() {
        }

        public abstract T OooO00o(int i);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            while (true) {
                int i = this.f18132Oooo0o;
                EnumMultiset enumMultiset = EnumMultiset.this;
                if (i >= enumMultiset.f18125Oooo.length) {
                    return false;
                }
                if (enumMultiset.f18128OoooO00[i] > 0) {
                    return true;
                }
                this.f18132Oooo0o = i + 1;
            }
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T tOooO00o = OooO00o(this.f18132Oooo0o);
            int i = this.f18132Oooo0o;
            this.f18133Oooo0oO = i;
            this.f18132Oooo0o = i + 1;
            return tOooO00o;
        }

        @Override // java.util.Iterator
        public final void remove() {
            oo000o.OooO0Oo(this.f18133Oooo0oO >= 0);
            EnumMultiset enumMultiset = EnumMultiset.this;
            int[] iArr = enumMultiset.f18128OoooO00;
            int i = this.f18133Oooo0oO;
            if (iArr[i] > 0) {
                enumMultiset.f18127OoooO0--;
                enumMultiset.f18129OoooO0O -= (long) iArr[i];
                iArr[i] = 0;
            }
            this.f18133Oooo0oO = -1;
        }
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Class<E> cls = (Class) objectInputStream.readObject();
        this.f18126Oooo0oo = cls;
        E[] enumConstants = cls.getEnumConstants();
        this.f18125Oooo = enumConstants;
        this.f18128OoooO00 = new int[enumConstants.length];
        o0O00.OooO0Oo(this, objectInputStream);
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f18126Oooo0oo);
        o0O00.OooO0oO(this, objectOutputStream);
    }

    public final boolean OooO(@NullableDecl Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r5 = (Enum) obj;
        int iOrdinal = r5.ordinal();
        E[] eArr = this.f18125Oooo;
        return iOrdinal < eArr.length && eArr[iOrdinal] == r5;
    }

    @Override // com.google.common.collect.OooOOOO
    public final int OooO0OO() {
        return this.f18127OoooO0;
    }

    @Override // com.google.common.collect.OooOOOO
    public final Iterator<E> OooO0o0() {
        return new OooO00o();
    }

    @Override // com.google.common.collect.OooOOOO
    public final Iterator<o00OO.OooO00o<E>> OooO0oO() {
        return new OooO0O0();
    }

    public final void OooO0oo(@NullableDecl Object obj) {
        Objects.requireNonNull(obj);
        if (OooO(obj)) {
            return;
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Expected an ");
        sbOooO0o0.append(this.f18126Oooo0oo);
        sbOooO0o0.append(" but got ");
        sbOooO0o0.append(obj);
        throw new ClassCastException(sbOooO0o0.toString());
    }

    @Override // com.google.common.collect.OooOOOO, com.google.common.collect.o00OO
    @CanIgnoreReturnValue
    public final int OooOOO(@NullableDecl Object obj, int i) {
        if (obj == null || !OooO(obj)) {
            return 0;
        }
        Enum r1 = (Enum) obj;
        oo000o.OooO0O0(i, "occurrences");
        if (i == 0) {
            return Ooooo0o(obj);
        }
        int iOrdinal = r1.ordinal();
        int[] iArr = this.f18128OoooO00;
        int i2 = iArr[iOrdinal];
        if (i2 == 0) {
            return 0;
        }
        if (i2 <= i) {
            iArr[iOrdinal] = 0;
            this.f18127OoooO0--;
            this.f18129OoooO0O -= (long) i2;
        } else {
            iArr[iOrdinal] = i2 - i;
            this.f18129OoooO0O -= (long) i;
        }
        return i2;
    }

    @Override // com.google.common.collect.OooOOOO, com.google.common.collect.o00OO
    @CanIgnoreReturnValue
    public final int OooOOo(Object obj, int i) {
        Enum r9 = (Enum) obj;
        OooO0oo(r9);
        oo000o.OooO0O0(i, "occurrences");
        if (i == 0) {
            return Ooooo0o(r9);
        }
        int iOrdinal = r9.ordinal();
        int i2 = this.f18128OoooO00[iOrdinal];
        long j = i;
        long j2 = ((long) i2) + j;
        o0OOOO0o.OooOOOO.OooO0OO(j2 <= 2147483647L, j2);
        this.f18128OoooO00[iOrdinal] = (int) j2;
        if (i2 == 0) {
            this.f18127OoooO0++;
        }
        this.f18129OoooO0O += j;
        return i2;
    }

    @Override // com.google.common.collect.o00OO
    public final int Ooooo0o(@NullableDecl Object obj) {
        if (obj == null || !OooO(obj)) {
            return 0;
        }
        return this.f18128OoooO00[((Enum) obj).ordinal()];
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        Arrays.fill(this.f18128OoooO00, 0);
        this.f18129OoooO0O = 0L;
        this.f18127OoooO0 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return o00OOO0.OooO0O0(this);
    }

    @Override // com.google.common.collect.OooOOOO, com.google.common.collect.o00OO
    @CanIgnoreReturnValue
    public final int o0000O0O(Object obj) {
        Enum r6 = (Enum) obj;
        OooO0oo(r6);
        oo000o.OooO0O0(0, "count");
        int iOrdinal = r6.ordinal();
        int[] iArr = this.f18128OoooO00;
        int i = iArr[iOrdinal];
        iArr[iOrdinal] = 0;
        this.f18129OoooO0O += (long) (0 - i);
        if (i > 0) {
            this.f18127OoooO0--;
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o00OO
    public final int size() {
        return o0OOOOO.OooO0OO.OooO00o(this.f18129OoooO0O);
    }
}

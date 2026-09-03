package com.google.protobuf;

import androidx.appcompat.widget.o00000O0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Ooo extends OooO0OO<Long> implements o000oOoO.OooOO0O, RandomAccess {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static final o00Ooo f19398Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public long[] f19399Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f19400Oooo0oo;

    static {
        o00Ooo o00ooo2 = new o00Ooo();
        f19398Oooo = o00ooo2;
        o00ooo2.f19351Oooo0o = false;
    }

    public o00Ooo() {
        this.f19399Oooo0oO = new long[10];
        this.f19400Oooo0oo = 0;
    }

    @Override // com.google.protobuf.o000oOoO.OooOOO0
    /* JADX INFO: renamed from: OooO, reason: merged with bridge method [inline-methods] */
    public final o000oOoO.OooOO0O OooOoO(int i) {
        if (i >= this.f19400Oooo0oo) {
            return new o00Ooo(Arrays.copyOf(this.f19399Oooo0oO, i), this.f19400Oooo0oo);
        }
        throw new IllegalArgumentException();
    }

    public final void OooO0O0(int i, long j) {
        int i2;
        OooO00o();
        if (i < 0 || i > (i2 = this.f19400Oooo0oo)) {
            throw new IndexOutOfBoundsException(OooO0oo(i));
        }
        long[] jArr = this.f19399Oooo0oO;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[com.app.base.protobuf.OooO00o.OooO00o(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f19399Oooo0oO, i, jArr2, i + 1, this.f19400Oooo0oo - i);
            this.f19399Oooo0oO = jArr2;
        }
        this.f19399Oooo0oO[i] = j;
        this.f19400Oooo0oo++;
        ((AbstractList) this).modCount++;
    }

    public final void OooO0OO(long j) {
        OooO0O0(this.f19400Oooo0oo, j);
    }

    public final void OooO0o0(int i) {
        if (i < 0 || i >= this.f19400Oooo0oo) {
            throw new IndexOutOfBoundsException(OooO0oo(i));
        }
    }

    public final long OooO0oO(int i) {
        OooO0o0(i);
        return this.f19399Oooo0oO[i];
    }

    public final String OooO0oo(int i) {
        StringBuilder sbOooO00o = o00000O0.OooO00o("Index:", i, ", Size:");
        sbOooO00o.append(this.f19400Oooo0oo);
        return sbOooO00o.toString();
    }

    public final long OooOO0(int i, long j) {
        OooO00o();
        OooO0o0(i);
        long[] jArr = this.f19399Oooo0oO;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        OooO0O0(i, ((Long) obj).longValue());
    }

    @Override // com.google.protobuf.OooO0OO, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        OooO00o();
        Objects.requireNonNull(collection);
        if (!(collection instanceof o00Ooo)) {
            return super.addAll(collection);
        }
        o00Ooo o00ooo2 = (o00Ooo) collection;
        int i = o00ooo2.f19400Oooo0oo;
        if (i == 0) {
            return false;
        }
        int i2 = this.f19400Oooo0oo;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.f19399Oooo0oO;
        if (i3 > jArr.length) {
            this.f19399Oooo0oO = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(o00ooo2.f19399Oooo0oO, 0, this.f19399Oooo0oO, this.f19400Oooo0oo, o00ooo2.f19400Oooo0oo);
        this.f19400Oooo0oo = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.OooO0OO, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00Ooo)) {
            return super.equals(obj);
        }
        o00Ooo o00ooo2 = (o00Ooo) obj;
        if (this.f19400Oooo0oo != o00ooo2.f19400Oooo0oo) {
            return false;
        }
        long[] jArr = o00ooo2.f19399Oooo0oO;
        for (int i = 0; i < this.f19400Oooo0oo; i++) {
            if (this.f19399Oooo0oO[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Long.valueOf(OooO0oO(i));
    }

    @Override // com.google.protobuf.OooO0OO, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iOooO0O0 = 1;
        for (int i = 0; i < this.f19400Oooo0oo; i++) {
            iOooO0O0 = (iOooO0O0 * 31) + o000oOoO.OooO0O0(this.f19399Oooo0oO[i]);
        }
        return iOooO0O0;
    }

    @Override // com.google.protobuf.OooO0OO, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        OooO00o();
        for (int i = 0; i < this.f19400Oooo0oo; i++) {
            if (obj.equals(Long.valueOf(this.f19399Oooo0oO[i]))) {
                long[] jArr = this.f19399Oooo0oO;
                System.arraycopy(jArr, i + 1, jArr, i, this.f19400Oooo0oo - i);
                this.f19400Oooo0oo--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return Long.valueOf(OooOO0(i, ((Long) obj).longValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19400Oooo0oo;
    }

    public o00Ooo(long[] jArr, int i) {
        this.f19399Oooo0oO = jArr;
        this.f19400Oooo0oo = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        OooO00o();
        OooO0o0(i);
        long[] jArr = this.f19399Oooo0oO;
        long j = jArr[i];
        System.arraycopy(jArr, i + 1, jArr, i, this.f19400Oooo0oo - i);
        this.f19400Oooo0oo--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }
}

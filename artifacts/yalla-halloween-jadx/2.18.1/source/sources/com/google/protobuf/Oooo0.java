package com.google.protobuf;

import androidx.appcompat.widget.o00000O0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 extends OooO0OO<Integer> implements o000oOoO.OooOO0, RandomAccess {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static final Oooo0 f19379Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int[] f19380Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f19381Oooo0oo;

    static {
        Oooo0 oooo0 = new Oooo0();
        f19379Oooo = oooo0;
        oooo0.f19351Oooo0o = false;
    }

    public Oooo0() {
        this.f19380Oooo0oO = new int[10];
        this.f19381Oooo0oo = 0;
    }

    public final void OooO0O0(int i) {
        if (i < 0 || i >= this.f19381Oooo0oo) {
            throw new IndexOutOfBoundsException(OooO0OO(i));
        }
    }

    public final String OooO0OO(int i) {
        StringBuilder sbOooO00o = o00000O0.OooO00o("Index:", i, ", Size:");
        sbOooO00o.append(this.f19381Oooo0oo);
        return sbOooO00o.toString();
    }

    @Override // com.google.protobuf.o000oOoO.OooOOO0
    /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
    public final o000oOoO.OooOO0 OooOoO(int i) {
        if (i >= this.f19381Oooo0oo) {
            return new Oooo0(Arrays.copyOf(this.f19380Oooo0oO, i), this.f19381Oooo0oo);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        OooO00o();
        if (i < 0 || i > (i2 = this.f19381Oooo0oo)) {
            throw new IndexOutOfBoundsException(OooO0OO(i));
        }
        int[] iArr = this.f19380Oooo0oO;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[com.app.base.protobuf.OooO00o.OooO00o(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f19380Oooo0oO, i, iArr2, i + 1, this.f19381Oooo0oo - i);
            this.f19380Oooo0oO = iArr2;
        }
        this.f19380Oooo0oO[i] = iIntValue;
        this.f19381Oooo0oo++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.OooO0OO, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        OooO00o();
        Objects.requireNonNull(collection);
        if (!(collection instanceof Oooo0)) {
            return super.addAll(collection);
        }
        Oooo0 oooo0 = (Oooo0) collection;
        int i = oooo0.f19381Oooo0oo;
        if (i == 0) {
            return false;
        }
        int i2 = this.f19381Oooo0oo;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f19380Oooo0oO;
        if (i3 > iArr.length) {
            this.f19380Oooo0oO = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(oooo0.f19380Oooo0oO, 0, this.f19380Oooo0oO, this.f19381Oooo0oo, oooo0.f19381Oooo0oo);
        this.f19381Oooo0oo = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.OooO0OO, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Oooo0)) {
            return super.equals(obj);
        }
        Oooo0 oooo0 = (Oooo0) obj;
        if (this.f19381Oooo0oo != oooo0.f19381Oooo0oo) {
            return false;
        }
        int[] iArr = oooo0.f19380Oooo0oO;
        for (int i = 0; i < this.f19381Oooo0oo; i++) {
            if (this.f19380Oooo0oO[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        OooO0O0(i);
        return Integer.valueOf(this.f19380Oooo0oO[i]);
    }

    @Override // com.google.protobuf.OooO0OO, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f19381Oooo0oo; i2++) {
            i = (i * 31) + this.f19380Oooo0oO[i2];
        }
        return i;
    }

    @Override // com.google.protobuf.OooO0OO, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        OooO00o();
        for (int i = 0; i < this.f19381Oooo0oo; i++) {
            if (obj.equals(Integer.valueOf(this.f19380Oooo0oO[i]))) {
                int[] iArr = this.f19380Oooo0oO;
                System.arraycopy(iArr, i + 1, iArr, i, this.f19381Oooo0oo - i);
                this.f19381Oooo0oo--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        OooO00o();
        OooO0O0(i);
        int[] iArr = this.f19380Oooo0oO;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19381Oooo0oo;
    }

    public Oooo0(int[] iArr, int i) {
        this.f19380Oooo0oO = iArr;
        this.f19381Oooo0oo = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        OooO00o();
        OooO0O0(i);
        int[] iArr = this.f19380Oooo0oO;
        int i2 = iArr[i];
        System.arraycopy(iArr, i + 1, iArr, i, this.f19381Oooo0oo - i);
        this.f19381Oooo0oo--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }
}

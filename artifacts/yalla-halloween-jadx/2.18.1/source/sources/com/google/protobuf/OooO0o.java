package com.google.protobuf;

import androidx.appcompat.widget.o00000O0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o extends OooO0OO<Boolean> implements o000oOoO.OooO00o, RandomAccess {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static final OooO0o f19352Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean[] f19353Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f19354Oooo0oo;

    static {
        OooO0o oooO0o = new OooO0o();
        f19352Oooo = oooO0o;
        oooO0o.f19351Oooo0o = false;
    }

    public OooO0o() {
        this.f19353Oooo0oO = new boolean[10];
        this.f19354Oooo0oo = 0;
    }

    public final void OooO0O0(int i) {
        if (i < 0 || i >= this.f19354Oooo0oo) {
            throw new IndexOutOfBoundsException(OooO0OO(i));
        }
    }

    public final String OooO0OO(int i) {
        StringBuilder sbOooO00o = o00000O0.OooO00o("Index:", i, ", Size:");
        sbOooO00o.append(this.f19354Oooo0oo);
        return sbOooO00o.toString();
    }

    @Override // com.google.protobuf.o000oOoO.OooOOO0
    /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
    public final o000oOoO.OooO00o OooOoO(int i) {
        if (i >= this.f19354Oooo0oo) {
            return new OooO0o(Arrays.copyOf(this.f19353Oooo0oO, i), this.f19354Oooo0oo);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        OooO00o();
        if (i < 0 || i > (i2 = this.f19354Oooo0oo)) {
            throw new IndexOutOfBoundsException(OooO0OO(i));
        }
        boolean[] zArr = this.f19353Oooo0oO;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[com.app.base.protobuf.OooO00o.OooO00o(i2, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f19353Oooo0oO, i, zArr2, i + 1, this.f19354Oooo0oo - i);
            this.f19353Oooo0oO = zArr2;
        }
        this.f19353Oooo0oO[i] = zBooleanValue;
        this.f19354Oooo0oo++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.OooO0OO, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        OooO00o();
        Objects.requireNonNull(collection);
        if (!(collection instanceof OooO0o)) {
            return super.addAll(collection);
        }
        OooO0o oooO0o = (OooO0o) collection;
        int i = oooO0o.f19354Oooo0oo;
        if (i == 0) {
            return false;
        }
        int i2 = this.f19354Oooo0oo;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.f19353Oooo0oO;
        if (i3 > zArr.length) {
            this.f19353Oooo0oO = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(oooO0o.f19353Oooo0oO, 0, this.f19353Oooo0oO, this.f19354Oooo0oo, oooO0o.f19354Oooo0oo);
        this.f19354Oooo0oo = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.OooO0OO, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooO0o)) {
            return super.equals(obj);
        }
        OooO0o oooO0o = (OooO0o) obj;
        if (this.f19354Oooo0oo != oooO0o.f19354Oooo0oo) {
            return false;
        }
        boolean[] zArr = oooO0o.f19353Oooo0oO;
        for (int i = 0; i < this.f19354Oooo0oo; i++) {
            if (this.f19353Oooo0oO[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        OooO0O0(i);
        return Boolean.valueOf(this.f19353Oooo0oO[i]);
    }

    @Override // com.google.protobuf.OooO0OO, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iOooO00o = 1;
        for (int i = 0; i < this.f19354Oooo0oo; i++) {
            iOooO00o = (iOooO00o * 31) + o000oOoO.OooO00o(this.f19353Oooo0oO[i]);
        }
        return iOooO00o;
    }

    @Override // com.google.protobuf.OooO0OO, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        OooO00o();
        for (int i = 0; i < this.f19354Oooo0oo; i++) {
            if (obj.equals(Boolean.valueOf(this.f19353Oooo0oO[i]))) {
                boolean[] zArr = this.f19353Oooo0oO;
                System.arraycopy(zArr, i + 1, zArr, i, this.f19354Oooo0oo - i);
                this.f19354Oooo0oo--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        OooO00o();
        OooO0O0(i);
        boolean[] zArr = this.f19353Oooo0oO;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19354Oooo0oo;
    }

    public OooO0o(boolean[] zArr, int i) {
        this.f19353Oooo0oO = zArr;
        this.f19354Oooo0oo = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        OooO00o();
        OooO0O0(i);
        boolean[] zArr = this.f19353Oooo0oO;
        boolean z = zArr[i];
        System.arraycopy(zArr, i + 1, zArr, i, this.f19354Oooo0oo - i);
        this.f19354Oooo0oo--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }
}

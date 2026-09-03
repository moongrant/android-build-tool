package com.google.protobuf;

import androidx.appcompat.widget.o00000O0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 extends OooO0OO<Double> implements o000oOoO.OooO0O0, RandomAccess {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static final OooOOO0 f19368Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public double[] f19369Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f19370Oooo0oo;

    static {
        OooOOO0 oooOOO0 = new OooOOO0();
        f19368Oooo = oooOOO0;
        oooOOO0.f19351Oooo0o = false;
    }

    public OooOOO0() {
        this.f19369Oooo0oO = new double[10];
        this.f19370Oooo0oo = 0;
    }

    public final void OooO0O0(int i) {
        if (i < 0 || i >= this.f19370Oooo0oo) {
            throw new IndexOutOfBoundsException(OooO0OO(i));
        }
    }

    public final String OooO0OO(int i) {
        StringBuilder sbOooO00o = o00000O0.OooO00o("Index:", i, ", Size:");
        sbOooO00o.append(this.f19370Oooo0oo);
        return sbOooO00o.toString();
    }

    @Override // com.google.protobuf.o000oOoO.OooOOO0
    /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
    public final o000oOoO.OooO0O0 OooOoO(int i) {
        if (i >= this.f19370Oooo0oo) {
            return new OooOOO0(Arrays.copyOf(this.f19369Oooo0oO, i), this.f19370Oooo0oo);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        double dDoubleValue = ((Double) obj).doubleValue();
        OooO00o();
        if (i < 0 || i > (i2 = this.f19370Oooo0oo)) {
            throw new IndexOutOfBoundsException(OooO0OO(i));
        }
        double[] dArr = this.f19369Oooo0oO;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[com.app.base.protobuf.OooO00o.OooO00o(i2, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f19369Oooo0oO, i, dArr2, i + 1, this.f19370Oooo0oo - i);
            this.f19369Oooo0oO = dArr2;
        }
        this.f19369Oooo0oO[i] = dDoubleValue;
        this.f19370Oooo0oo++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.OooO0OO, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        OooO00o();
        Objects.requireNonNull(collection);
        if (!(collection instanceof OooOOO0)) {
            return super.addAll(collection);
        }
        OooOOO0 oooOOO0 = (OooOOO0) collection;
        int i = oooOOO0.f19370Oooo0oo;
        if (i == 0) {
            return false;
        }
        int i2 = this.f19370Oooo0oo;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.f19369Oooo0oO;
        if (i3 > dArr.length) {
            this.f19369Oooo0oO = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(oooOOO0.f19369Oooo0oO, 0, this.f19369Oooo0oO, this.f19370Oooo0oo, oooOOO0.f19370Oooo0oo);
        this.f19370Oooo0oo = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.OooO0OO, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOOO0)) {
            return super.equals(obj);
        }
        OooOOO0 oooOOO0 = (OooOOO0) obj;
        if (this.f19370Oooo0oo != oooOOO0.f19370Oooo0oo) {
            return false;
        }
        double[] dArr = oooOOO0.f19369Oooo0oO;
        for (int i = 0; i < this.f19370Oooo0oo; i++) {
            if (this.f19369Oooo0oO[i] != dArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        OooO0O0(i);
        return Double.valueOf(this.f19369Oooo0oO[i]);
    }

    @Override // com.google.protobuf.OooO0OO, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iOooO0O0 = 1;
        for (int i = 0; i < this.f19370Oooo0oo; i++) {
            iOooO0O0 = (iOooO0O0 * 31) + o000oOoO.OooO0O0(Double.doubleToLongBits(this.f19369Oooo0oO[i]));
        }
        return iOooO0O0;
    }

    @Override // com.google.protobuf.OooO0OO, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        OooO00o();
        for (int i = 0; i < this.f19370Oooo0oo; i++) {
            if (obj.equals(Double.valueOf(this.f19369Oooo0oO[i]))) {
                double[] dArr = this.f19369Oooo0oO;
                System.arraycopy(dArr, i + 1, dArr, i, this.f19370Oooo0oo - i);
                this.f19370Oooo0oo--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        OooO00o();
        OooO0O0(i);
        double[] dArr = this.f19369Oooo0oO;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19370Oooo0oo;
    }

    public OooOOO0(double[] dArr, int i) {
        this.f19369Oooo0oO = dArr;
        this.f19370Oooo0oo = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        OooO00o();
        OooO0O0(i);
        double[] dArr = this.f19369Oooo0oO;
        double d = dArr[i];
        System.arraycopy(dArr, i + 1, dArr, i, this.f19370Oooo0oo - i);
        this.f19370Oooo0oo--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }
}

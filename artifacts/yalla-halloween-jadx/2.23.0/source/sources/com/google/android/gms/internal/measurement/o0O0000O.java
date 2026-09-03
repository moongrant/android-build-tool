package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0000O extends o00OOO0O implements RandomAccess, o0oOo0O0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f15525OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public double[] f15526OooO0o0;

    static {
        new o0O0000O(new double[0], 0, false);
    }

    public o0O0000O() {
        this(new double[10], 0, true);
    }

    public final void OooO0O0(double d) {
        OooO00o();
        int i = this.f15525OooO0o;
        double[] dArr = this.f15526OooO0o0;
        if (i == dArr.length) {
            double[] dArr2 = new double[androidx.compose.ui.focus.OooO00o.OooO00o(i, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f15526OooO0o0 = dArr2;
        }
        double[] dArr3 = this.f15526OooO0o0;
        int i2 = this.f15525OooO0o;
        this.f15525OooO0o = i2 + 1;
        dArr3[i2] = d;
    }

    public final void OooO0OO(int i) {
        if (i < 0 || i >= this.f15525OooO0o) {
            throw new IndexOutOfBoundsException(p022Oooo00O.OooOO0.OooO00o("Index:", i, ", Size:", this.f15525OooO0o));
        }
    }

    @Override // com.google.android.gms.internal.measurement.o00OOO0O, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        double dDoubleValue = ((Double) obj).doubleValue();
        OooO00o();
        if (i < 0 || i > (i2 = this.f15525OooO0o)) {
            throw new IndexOutOfBoundsException(p022Oooo00O.OooOO0.OooO00o("Index:", i, ", Size:", this.f15525OooO0o));
        }
        double[] dArr = this.f15526OooO0o0;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[androidx.compose.ui.focus.OooO00o.OooO00o(i2, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f15526OooO0o0, i, dArr2, i + 1, this.f15525OooO0o - i);
            this.f15526OooO0o0 = dArr2;
        }
        this.f15526OooO0o0[i] = dDoubleValue;
        this.f15525OooO0o++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.o00OOO0O, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        OooO00o();
        Charset charset = zzlj.f15753OooO00o;
        collection.getClass();
        if (!(collection instanceof o0O0000O)) {
            return super.addAll(collection);
        }
        o0O0000O o0o0000o2 = (o0O0000O) collection;
        int i = o0o0000o2.f15525OooO0o;
        if (i == 0) {
            return false;
        }
        int i2 = this.f15525OooO0o;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.f15526OooO0o0;
        if (i3 > dArr.length) {
            this.f15526OooO0o0 = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(o0o0000o2.f15526OooO0o0, 0, this.f15526OooO0o0, this.f15525OooO0o, o0o0000o2.f15525OooO0o);
        this.f15525OooO0o = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.o00OOO0O, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0O0000O)) {
            return super.equals(obj);
        }
        o0O0000O o0o0000o2 = (o0O0000O) obj;
        if (this.f15525OooO0o != o0o0000o2.f15525OooO0o) {
            return false;
        }
        double[] dArr = o0o0000o2.f15526OooO0o0;
        for (int i = 0; i < this.f15525OooO0o; i++) {
            if (Double.doubleToLongBits(this.f15526OooO0o0[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        OooO0OO(i);
        return Double.valueOf(this.f15526OooO0o0[i]);
    }

    @Override // com.google.android.gms.internal.measurement.o00OOO0O, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f15525OooO0o; i2++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.f15526OooO0o0[i2]);
            Charset charset = zzlj.f15753OooO00o;
            i = (i * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i = this.f15525OooO0o;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f15526OooO0o0[i2] == dDoubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.o00OOO0O, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        OooO00o();
        OooO0OO(i);
        double[] dArr = this.f15526OooO0o0;
        double d = dArr[i];
        int i2 = this.f15525OooO0o;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f15525OooO0o--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        OooO00o();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f15526OooO0o0;
        System.arraycopy(dArr, i2, dArr, i, this.f15525OooO0o - i2);
        this.f15525OooO0o -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.o00OOO0O, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        OooO00o();
        OooO0OO(i);
        double[] dArr = this.f15526OooO0o0;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15525OooO0o;
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final /* bridge */ /* synthetic */ zzli zzd(int i) {
        if (i >= this.f15525OooO0o) {
            return new o0O0000O(Arrays.copyOf(this.f15526OooO0o0, i), this.f15525OooO0o, true);
        }
        throw new IllegalArgumentException();
    }

    public o0O0000O(double[] dArr, int i, boolean z) {
        super(z);
        this.f15526OooO0o0 = dArr;
        this.f15525OooO0o = i;
    }

    @Override // com.google.android.gms.internal.measurement.o00OOO0O, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        OooO0O0(((Double) obj).doubleValue());
        return true;
    }
}

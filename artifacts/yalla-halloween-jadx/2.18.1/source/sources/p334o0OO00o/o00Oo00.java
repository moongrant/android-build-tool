package p334o0OO00o;

import com.app.base.protobuf.OooO00o;
import com.google.android.gms.internal.measurement.zzkl;
import com.google.android.gms.internal.measurement.zzkm;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;
import p100o000oOoO.o00O00OO;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Oo00 extends o00OO000 implements RandomAccess, o0O0O0Oo {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public double[] f37341Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f37342Oooo0oo;

    static {
        new o00Oo00(new double[0], 0).zzb();
    }

    public o00Oo00() {
        this(new double[10], 0);
    }

    public final void OooO0O0(double d) {
        OooO00o();
        int i = this.f37342Oooo0oo;
        double[] dArr = this.f37341Oooo0oO;
        if (i == dArr.length) {
            double[] dArr2 = new double[OooO00o.OooO00o(i, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f37341Oooo0oO = dArr2;
        }
        double[] dArr3 = this.f37341Oooo0oO;
        int i2 = this.f37342Oooo0oo;
        this.f37342Oooo0oo = i2 + 1;
        dArr3[i2] = d;
    }

    public final String OooO0OO(int i) {
        return o00O00OO.OooO00o("Index:", i, ", Size:", this.f37342Oooo0oo);
    }

    public final void OooO0o0(int i) {
        if (i < 0 || i >= this.f37342Oooo0oo) {
            throw new IndexOutOfBoundsException(OooO0OO(i));
        }
    }

    @Override // p334o0OO00o.o00OO000, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double dDoubleValue = ((Double) obj).doubleValue();
        OooO00o();
        if (i < 0 || i > (i2 = this.f37342Oooo0oo)) {
            throw new IndexOutOfBoundsException(OooO0OO(i));
        }
        double[] dArr = this.f37341Oooo0oO;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[OooO00o.OooO00o(i2, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f37341Oooo0oO, i, dArr2, i + 1, this.f37342Oooo0oo - i);
            this.f37341Oooo0oO = dArr2;
        }
        this.f37341Oooo0oO[i] = dDoubleValue;
        this.f37342Oooo0oo++;
        ((AbstractList) this).modCount++;
    }

    @Override // p334o0OO00o.o00OO000, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        OooO00o();
        Charset charset = zzkm.f15980OooO00o;
        Objects.requireNonNull(collection);
        if (!(collection instanceof o00Oo00)) {
            return super.addAll(collection);
        }
        o00Oo00 o00oo00 = (o00Oo00) collection;
        int i = o00oo00.f37342Oooo0oo;
        if (i == 0) {
            return false;
        }
        int i2 = this.f37342Oooo0oo;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.f37341Oooo0oO;
        if (i3 > dArr.length) {
            this.f37341Oooo0oO = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(o00oo00.f37341Oooo0oO, 0, this.f37341Oooo0oO, this.f37342Oooo0oo, o00oo00.f37342Oooo0oo);
        this.f37342Oooo0oo = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p334o0OO00o.o00OO000, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o00Oo00)) {
            return super.equals(obj);
        }
        o00Oo00 o00oo00 = (o00Oo00) obj;
        if (this.f37342Oooo0oo != o00oo00.f37342Oooo0oo) {
            return false;
        }
        double[] dArr = o00oo00.f37341Oooo0oO;
        for (int i = 0; i < this.f37342Oooo0oo; i++) {
            if (Double.doubleToLongBits(this.f37341Oooo0oO[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        OooO0o0(i);
        return Double.valueOf(this.f37341Oooo0oO[i]);
    }

    @Override // p334o0OO00o.o00OO000, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZzc = 1;
        for (int i = 0; i < this.f37342Oooo0oo; i++) {
            iZzc = (iZzc * 31) + zzkm.zzc(Double.doubleToLongBits(this.f37341Oooo0oO[i]));
        }
        return iZzc;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i = this.f37342Oooo0oo;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f37341Oooo0oO[i2] == dDoubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p334o0OO00o.o00OO000, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        OooO00o();
        OooO0o0(i);
        double[] dArr = this.f37341Oooo0oO;
        double d = dArr[i];
        int i2 = this.f37342Oooo0oo;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f37342Oooo0oo--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        OooO00o();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f37341Oooo0oO;
        System.arraycopy(dArr, i2, dArr, i, this.f37342Oooo0oo - i2);
        this.f37342Oooo0oo -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // p334o0OO00o.o00OO000, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        OooO00o();
        OooO0o0(i);
        double[] dArr = this.f37341Oooo0oO;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f37342Oooo0oo;
    }

    @Override // com.google.android.gms.internal.measurement.zzkl
    public final /* bridge */ /* synthetic */ zzkl zzd(int i) {
        if (i >= this.f37342Oooo0oo) {
            return new o00Oo00(Arrays.copyOf(this.f37341Oooo0oO, i), this.f37342Oooo0oo);
        }
        throw new IllegalArgumentException();
    }

    public o00Oo00(double[] dArr, int i) {
        this.f37341Oooo0oO = dArr;
        this.f37342Oooo0oo = i;
    }

    @Override // p334o0OO00o.o00OO000, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        OooO0O0(((Double) obj).doubleValue());
        return true;
    }
}

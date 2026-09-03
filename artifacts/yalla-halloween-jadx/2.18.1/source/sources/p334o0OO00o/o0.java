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
public final class o0 extends o00OO000 implements RandomAccess, o0O0O0Oo {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public float[] f37231Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f37232Oooo0oo;

    static {
        new o0(new float[0], 0).zzb();
    }

    public o0() {
        this(new float[10], 0);
    }

    public final void OooO0O0(float f) {
        OooO00o();
        int i = this.f37232Oooo0oo;
        float[] fArr = this.f37231Oooo0oO;
        if (i == fArr.length) {
            float[] fArr2 = new float[OooO00o.OooO00o(i, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f37231Oooo0oO = fArr2;
        }
        float[] fArr3 = this.f37231Oooo0oO;
        int i2 = this.f37232Oooo0oo;
        this.f37232Oooo0oo = i2 + 1;
        fArr3[i2] = f;
    }

    public final String OooO0OO(int i) {
        return o00O00OO.OooO00o("Index:", i, ", Size:", this.f37232Oooo0oo);
    }

    public final void OooO0o0(int i) {
        if (i < 0 || i >= this.f37232Oooo0oo) {
            throw new IndexOutOfBoundsException(OooO0OO(i));
        }
    }

    @Override // p334o0OO00o.o00OO000, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float fFloatValue = ((Float) obj).floatValue();
        OooO00o();
        if (i < 0 || i > (i2 = this.f37232Oooo0oo)) {
            throw new IndexOutOfBoundsException(OooO0OO(i));
        }
        float[] fArr = this.f37231Oooo0oO;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[OooO00o.OooO00o(i2, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f37231Oooo0oO, i, fArr2, i + 1, this.f37232Oooo0oo - i);
            this.f37231Oooo0oO = fArr2;
        }
        this.f37231Oooo0oO[i] = fFloatValue;
        this.f37232Oooo0oo++;
        ((AbstractList) this).modCount++;
    }

    @Override // p334o0OO00o.o00OO000, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        OooO00o();
        Charset charset = zzkm.f15980OooO00o;
        Objects.requireNonNull(collection);
        if (!(collection instanceof o0)) {
            return super.addAll(collection);
        }
        o0 o0Var = (o0) collection;
        int i = o0Var.f37232Oooo0oo;
        if (i == 0) {
            return false;
        }
        int i2 = this.f37232Oooo0oo;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.f37231Oooo0oO;
        if (i3 > fArr.length) {
            this.f37231Oooo0oO = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(o0Var.f37231Oooo0oO, 0, this.f37231Oooo0oO, this.f37232Oooo0oo, o0Var.f37232Oooo0oo);
        this.f37232Oooo0oo = i3;
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
        if (!(obj instanceof o0)) {
            return super.equals(obj);
        }
        o0 o0Var = (o0) obj;
        if (this.f37232Oooo0oo != o0Var.f37232Oooo0oo) {
            return false;
        }
        float[] fArr = o0Var.f37231Oooo0oO;
        for (int i = 0; i < this.f37232Oooo0oo; i++) {
            if (Float.floatToIntBits(this.f37231Oooo0oO[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        OooO0o0(i);
        return Float.valueOf(this.f37231Oooo0oO[i]);
    }

    @Override // p334o0OO00o.o00OO000, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.f37232Oooo0oo; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f37231Oooo0oO[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i = this.f37232Oooo0oo;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f37231Oooo0oO[i2] == fFloatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p334o0OO00o.o00OO000, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        OooO00o();
        OooO0o0(i);
        float[] fArr = this.f37231Oooo0oO;
        float f = fArr[i];
        int i2 = this.f37232Oooo0oo;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f37232Oooo0oo--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        OooO00o();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f37231Oooo0oO;
        System.arraycopy(fArr, i2, fArr, i, this.f37232Oooo0oo - i2);
        this.f37232Oooo0oo -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // p334o0OO00o.o00OO000, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        OooO00o();
        OooO0o0(i);
        float[] fArr = this.f37231Oooo0oO;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f37232Oooo0oo;
    }

    @Override // com.google.android.gms.internal.measurement.zzkl
    public final /* bridge */ /* synthetic */ zzkl zzd(int i) {
        if (i >= this.f37232Oooo0oo) {
            return new o0(Arrays.copyOf(this.f37231Oooo0oO, i), this.f37232Oooo0oo);
        }
        throw new IllegalArgumentException();
    }

    public o0(float[] fArr, int i) {
        this.f37231Oooo0oO = fArr;
        this.f37232Oooo0oo = i;
    }

    @Override // p334o0OO00o.o00OO000, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        OooO0O0(((Float) obj).floatValue());
        return true;
    }
}

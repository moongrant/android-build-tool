package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O00 extends o00OOO0O implements RandomAccess, o0oOo0O0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f15520OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float[] f15521OooO0o0;

    static {
        new o0O00(0, false, new float[0]);
    }

    public o0O00() {
        this(0, true, new float[10]);
    }

    public final void OooO0O0(float f) {
        OooO00o();
        int i = this.f15520OooO0o;
        float[] fArr = this.f15521OooO0o0;
        if (i == fArr.length) {
            float[] fArr2 = new float[androidx.compose.ui.focus.OooO00o.OooO00o(i, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f15521OooO0o0 = fArr2;
        }
        float[] fArr3 = this.f15521OooO0o0;
        int i2 = this.f15520OooO0o;
        this.f15520OooO0o = i2 + 1;
        fArr3[i2] = f;
    }

    public final void OooO0OO(int i) {
        if (i < 0 || i >= this.f15520OooO0o) {
            throw new IndexOutOfBoundsException(p022Oooo00O.OooOO0.OooO00o("Index:", i, ", Size:", this.f15520OooO0o));
        }
    }

    @Override // com.google.android.gms.internal.measurement.o00OOO0O, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        float fFloatValue = ((Float) obj).floatValue();
        OooO00o();
        if (i < 0 || i > (i2 = this.f15520OooO0o)) {
            throw new IndexOutOfBoundsException(p022Oooo00O.OooOO0.OooO00o("Index:", i, ", Size:", this.f15520OooO0o));
        }
        float[] fArr = this.f15521OooO0o0;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[androidx.compose.ui.focus.OooO00o.OooO00o(i2, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f15521OooO0o0, i, fArr2, i + 1, this.f15520OooO0o - i);
            this.f15521OooO0o0 = fArr2;
        }
        this.f15521OooO0o0[i] = fFloatValue;
        this.f15520OooO0o++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.o00OOO0O, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        OooO00o();
        Charset charset = zzlj.f15753OooO00o;
        collection.getClass();
        if (!(collection instanceof o0O00)) {
            return super.addAll(collection);
        }
        o0O00 o0o01 = (o0O00) collection;
        int i = o0o01.f15520OooO0o;
        if (i == 0) {
            return false;
        }
        int i2 = this.f15520OooO0o;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.f15521OooO0o0;
        if (i3 > fArr.length) {
            this.f15521OooO0o0 = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(o0o01.f15521OooO0o0, 0, this.f15521OooO0o0, this.f15520OooO0o, o0o01.f15520OooO0o);
        this.f15520OooO0o = i3;
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
        if (!(obj instanceof o0O00)) {
            return super.equals(obj);
        }
        o0O00 o0o01 = (o0O00) obj;
        if (this.f15520OooO0o != o0o01.f15520OooO0o) {
            return false;
        }
        float[] fArr = o0o01.f15521OooO0o0;
        for (int i = 0; i < this.f15520OooO0o; i++) {
            if (Float.floatToIntBits(this.f15521OooO0o0[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        OooO0OO(i);
        return Float.valueOf(this.f15521OooO0o0[i]);
    }

    @Override // com.google.android.gms.internal.measurement.o00OOO0O, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.f15520OooO0o; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f15521OooO0o0[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i = this.f15520OooO0o;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f15521OooO0o0[i2] == fFloatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.o00OOO0O, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        OooO00o();
        OooO0OO(i);
        float[] fArr = this.f15521OooO0o0;
        float f = fArr[i];
        int i2 = this.f15520OooO0o;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f15520OooO0o--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        OooO00o();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f15521OooO0o0;
        System.arraycopy(fArr, i2, fArr, i, this.f15520OooO0o - i2);
        this.f15520OooO0o -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.o00OOO0O, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        OooO00o();
        OooO0OO(i);
        float[] fArr = this.f15521OooO0o0;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15520OooO0o;
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final /* bridge */ /* synthetic */ zzli zzd(int i) {
        if (i < this.f15520OooO0o) {
            throw new IllegalArgumentException();
        }
        return new o0O00(this.f15520OooO0o, true, Arrays.copyOf(this.f15521OooO0o0, i));
    }

    public o0O00(int i, boolean z, float[] fArr) {
        super(z);
        this.f15521OooO0o0 = fArr;
        this.f15520OooO0o = i;
    }

    @Override // com.google.android.gms.internal.measurement.o00OOO0O, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        OooO0O0(((Float) obj).floatValue());
        return true;
    }
}

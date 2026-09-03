package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OoO00O extends o0o0Oo implements RandomAccess, o0O0oo00 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f15133OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float[] f15134OooO0o0;

    static {
        new o0OoO00O(0, false, new float[0]);
    }

    public o0OoO00O() {
        this(0, true, new float[10]);
    }

    public final void OooO0O0(float f) {
        OooO00o();
        int i = this.f15133OooO0o;
        float[] fArr = this.f15134OooO0o0;
        if (i == fArr.length) {
            float[] fArr2 = new float[o000OOoO.o0OO00O.OooO00o(i, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f15134OooO0o0 = fArr2;
        }
        float[] fArr3 = this.f15134OooO0o0;
        int i2 = this.f15133OooO0o;
        this.f15133OooO0o = i2 + 1;
        fArr3[i2] = f;
    }

    public final void OooO0OO(int i) {
        if (i < 0 || i >= this.f15133OooO0o) {
            throw new IndexOutOfBoundsException(androidx.compose.compiler.plugins.kotlin.lower.OooO0O0.OooO0O0("Index:", i, ", Size:", this.f15133OooO0o));
        }
    }

    @Override // com.google.android.gms.internal.measurement.o0o0Oo, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        float fFloatValue = ((Float) obj).floatValue();
        OooO00o();
        if (i < 0 || i > (i2 = this.f15133OooO0o)) {
            throw new IndexOutOfBoundsException(androidx.compose.compiler.plugins.kotlin.lower.OooO0O0.OooO0O0("Index:", i, ", Size:", this.f15133OooO0o));
        }
        float[] fArr = this.f15134OooO0o0;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[o000OOoO.o0OO00O.OooO00o(i2, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f15134OooO0o0, i, fArr2, i + 1, this.f15133OooO0o - i);
            this.f15134OooO0o0 = fArr2;
        }
        this.f15134OooO0o0[i] = fFloatValue;
        this.f15133OooO0o++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.o0o0Oo, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        OooO00o();
        Charset charset = zzlj.f15277OooO00o;
        collection.getClass();
        if (!(collection instanceof o0OoO00O)) {
            return super.addAll(collection);
        }
        o0OoO00O o0ooo00o2 = (o0OoO00O) collection;
        int i = o0ooo00o2.f15133OooO0o;
        if (i == 0) {
            return false;
        }
        int i2 = this.f15133OooO0o;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.f15134OooO0o0;
        if (i3 > fArr.length) {
            this.f15134OooO0o0 = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(o0ooo00o2.f15134OooO0o0, 0, this.f15134OooO0o0, this.f15133OooO0o, o0ooo00o2.f15133OooO0o);
        this.f15133OooO0o = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.o0o0Oo, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0OoO00O)) {
            return super.equals(obj);
        }
        o0OoO00O o0ooo00o2 = (o0OoO00O) obj;
        if (this.f15133OooO0o != o0ooo00o2.f15133OooO0o) {
            return false;
        }
        float[] fArr = o0ooo00o2.f15134OooO0o0;
        for (int i = 0; i < this.f15133OooO0o; i++) {
            if (Float.floatToIntBits(this.f15134OooO0o0[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        OooO0OO(i);
        return Float.valueOf(this.f15134OooO0o0[i]);
    }

    @Override // com.google.android.gms.internal.measurement.o0o0Oo, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.f15133OooO0o; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f15134OooO0o0[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i = this.f15133OooO0o;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f15134OooO0o0[i2] == fFloatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.o0o0Oo, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        OooO00o();
        OooO0OO(i);
        float[] fArr = this.f15134OooO0o0;
        float f = fArr[i];
        int i2 = this.f15133OooO0o;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f15133OooO0o--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        OooO00o();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f15134OooO0o0;
        System.arraycopy(fArr, i2, fArr, i, this.f15133OooO0o - i2);
        this.f15133OooO0o -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.o0o0Oo, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        OooO00o();
        OooO0OO(i);
        float[] fArr = this.f15134OooO0o0;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15133OooO0o;
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final /* bridge */ /* synthetic */ zzli zzd(int i) {
        if (i < this.f15133OooO0o) {
            throw new IllegalArgumentException();
        }
        return new o0OoO00O(this.f15133OooO0o, true, Arrays.copyOf(this.f15134OooO0o0, i));
    }

    public o0OoO00O(int i, boolean z, float[] fArr) {
        super(z);
        this.f15134OooO0o0 = fArr;
        this.f15133OooO0o = i;
    }

    @Override // com.google.android.gms.internal.measurement.o0o0Oo, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        OooO0O0(((Float) obj).floatValue());
        return true;
    }
}

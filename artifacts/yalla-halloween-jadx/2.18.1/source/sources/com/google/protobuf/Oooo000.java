package com.google.protobuf;

import androidx.appcompat.widget.o00000O0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo000 extends OooO0OO<Float> implements o000oOoO.OooO, RandomAccess {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static final Oooo000 f19382Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public float[] f19383Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f19384Oooo0oo;

    static {
        Oooo000 oooo000 = new Oooo000();
        f19382Oooo = oooo000;
        oooo000.f19351Oooo0o = false;
    }

    public Oooo000() {
        this.f19383Oooo0oO = new float[10];
        this.f19384Oooo0oo = 0;
    }

    public final void OooO0O0(int i) {
        if (i < 0 || i >= this.f19384Oooo0oo) {
            throw new IndexOutOfBoundsException(OooO0OO(i));
        }
    }

    public final String OooO0OO(int i) {
        StringBuilder sbOooO00o = o00000O0.OooO00o("Index:", i, ", Size:");
        sbOooO00o.append(this.f19384Oooo0oo);
        return sbOooO00o.toString();
    }

    @Override // com.google.protobuf.o000oOoO.OooOOO0
    /* JADX INFO: renamed from: OooO0o0, reason: merged with bridge method [inline-methods] */
    public final o000oOoO.OooO OooOoO(int i) {
        if (i >= this.f19384Oooo0oo) {
            return new Oooo000(Arrays.copyOf(this.f19383Oooo0oO, i), this.f19384Oooo0oo);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        float fFloatValue = ((Float) obj).floatValue();
        OooO00o();
        if (i < 0 || i > (i2 = this.f19384Oooo0oo)) {
            throw new IndexOutOfBoundsException(OooO0OO(i));
        }
        float[] fArr = this.f19383Oooo0oO;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[com.app.base.protobuf.OooO00o.OooO00o(i2, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f19383Oooo0oO, i, fArr2, i + 1, this.f19384Oooo0oo - i);
            this.f19383Oooo0oO = fArr2;
        }
        this.f19383Oooo0oO[i] = fFloatValue;
        this.f19384Oooo0oo++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.OooO0OO, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        OooO00o();
        Objects.requireNonNull(collection);
        if (!(collection instanceof Oooo000)) {
            return super.addAll(collection);
        }
        Oooo000 oooo000 = (Oooo000) collection;
        int i = oooo000.f19384Oooo0oo;
        if (i == 0) {
            return false;
        }
        int i2 = this.f19384Oooo0oo;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.f19383Oooo0oO;
        if (i3 > fArr.length) {
            this.f19383Oooo0oO = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(oooo000.f19383Oooo0oO, 0, this.f19383Oooo0oO, this.f19384Oooo0oo, oooo000.f19384Oooo0oo);
        this.f19384Oooo0oo = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.protobuf.OooO0OO, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Oooo000)) {
            return super.equals(obj);
        }
        Oooo000 oooo000 = (Oooo000) obj;
        if (this.f19384Oooo0oo != oooo000.f19384Oooo0oo) {
            return false;
        }
        float[] fArr = oooo000.f19383Oooo0oO;
        for (int i = 0; i < this.f19384Oooo0oo; i++) {
            if (this.f19383Oooo0oO[i] != fArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        OooO0O0(i);
        return Float.valueOf(this.f19383Oooo0oO[i]);
    }

    @Override // com.google.protobuf.OooO0OO, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.f19384Oooo0oo; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f19383Oooo0oO[i]);
        }
        return iFloatToIntBits;
    }

    @Override // com.google.protobuf.OooO0OO, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        OooO00o();
        for (int i = 0; i < this.f19384Oooo0oo; i++) {
            if (obj.equals(Float.valueOf(this.f19383Oooo0oO[i]))) {
                float[] fArr = this.f19383Oooo0oO;
                System.arraycopy(fArr, i + 1, fArr, i, this.f19384Oooo0oo - i);
                this.f19384Oooo0oo--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        OooO00o();
        OooO0O0(i);
        float[] fArr = this.f19383Oooo0oO;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19384Oooo0oo;
    }

    public Oooo000(float[] fArr, int i) {
        this.f19383Oooo0oO = fArr;
        this.f19384Oooo0oo = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        OooO00o();
        OooO0O0(i);
        float[] fArr = this.f19383Oooo0oO;
        float f = fArr[i];
        System.arraycopy(fArr, i + 1, fArr, i, this.f19384Oooo0oo - i);
        this.f19384Oooo0oo--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }
}

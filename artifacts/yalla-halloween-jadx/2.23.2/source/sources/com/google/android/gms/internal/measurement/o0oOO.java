package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class o0oOO extends o0o0Oo implements RandomAccess, o0O0oo00 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f15139OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean[] f15140OooO0o0;

    static {
        new o0oOO(new boolean[0], 0, false);
    }

    public o0oOO() {
        this(new boolean[10], 0, true);
    }

    public final void OooO0O0(boolean z) {
        OooO00o();
        int i = this.f15139OooO0o;
        boolean[] zArr = this.f15140OooO0o0;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[o000OOoO.o0OO00O.OooO00o(i, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f15140OooO0o0 = zArr2;
        }
        boolean[] zArr3 = this.f15140OooO0o0;
        int i2 = this.f15139OooO0o;
        this.f15139OooO0o = i2 + 1;
        zArr3[i2] = z;
    }

    public final void OooO0OO(int i) {
        if (i < 0 || i >= this.f15139OooO0o) {
            throw new IndexOutOfBoundsException(androidx.compose.compiler.plugins.kotlin.lower.OooO0O0.OooO0O0("Index:", i, ", Size:", this.f15139OooO0o));
        }
    }

    @Override // com.google.android.gms.internal.measurement.o0o0Oo, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        OooO00o();
        if (i < 0 || i > (i2 = this.f15139OooO0o)) {
            throw new IndexOutOfBoundsException(androidx.compose.compiler.plugins.kotlin.lower.OooO0O0.OooO0O0("Index:", i, ", Size:", this.f15139OooO0o));
        }
        boolean[] zArr = this.f15140OooO0o0;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[o000OOoO.o0OO00O.OooO00o(i2, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f15140OooO0o0, i, zArr2, i + 1, this.f15139OooO0o - i);
            this.f15140OooO0o0 = zArr2;
        }
        this.f15140OooO0o0[i] = zBooleanValue;
        this.f15139OooO0o++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.o0o0Oo, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        OooO00o();
        Charset charset = zzlj.f15277OooO00o;
        collection.getClass();
        if (!(collection instanceof o0oOO)) {
            return super.addAll(collection);
        }
        o0oOO o0ooo2 = (o0oOO) collection;
        int i = o0ooo2.f15139OooO0o;
        if (i == 0) {
            return false;
        }
        int i2 = this.f15139OooO0o;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.f15140OooO0o0;
        if (i3 > zArr.length) {
            this.f15140OooO0o0 = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(o0ooo2.f15140OooO0o0, 0, this.f15140OooO0o0, this.f15139OooO0o, o0ooo2.f15139OooO0o);
        this.f15139OooO0o = i3;
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
        if (!(obj instanceof o0oOO)) {
            return super.equals(obj);
        }
        o0oOO o0ooo2 = (o0oOO) obj;
        if (this.f15139OooO0o != o0ooo2.f15139OooO0o) {
            return false;
        }
        boolean[] zArr = o0ooo2.f15140OooO0o0;
        for (int i = 0; i < this.f15139OooO0o; i++) {
            if (this.f15140OooO0o0[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        OooO0OO(i);
        return Boolean.valueOf(this.f15140OooO0o0[i]);
    }

    @Override // com.google.android.gms.internal.measurement.o0o0Oo, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZza = 1;
        for (int i = 0; i < this.f15139OooO0o; i++) {
            iZza = (iZza * 31) + zzlj.zza(this.f15140OooO0o0[i]);
        }
        return iZza;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i = this.f15139OooO0o;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f15140OooO0o0[i2] == zBooleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.o0o0Oo, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        OooO00o();
        OooO0OO(i);
        boolean[] zArr = this.f15140OooO0o0;
        boolean z = zArr[i];
        int i2 = this.f15139OooO0o;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f15139OooO0o--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        OooO00o();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f15140OooO0o0;
        System.arraycopy(zArr, i2, zArr, i, this.f15139OooO0o - i2);
        this.f15139OooO0o -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.o0o0Oo, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        OooO00o();
        OooO0OO(i);
        boolean[] zArr = this.f15140OooO0o0;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15139OooO0o;
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final /* bridge */ /* synthetic */ zzli zzd(int i) {
        if (i >= this.f15139OooO0o) {
            return new o0oOO(Arrays.copyOf(this.f15140OooO0o0, i), this.f15139OooO0o, true);
        }
        throw new IllegalArgumentException();
    }

    public o0oOO(boolean[] zArr, int i, boolean z) {
        super(z);
        this.f15140OooO0o0 = zArr;
        this.f15139OooO0o = i;
    }

    @Override // com.google.android.gms.internal.measurement.o0o0Oo, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        OooO0O0(((Boolean) obj).booleanValue());
        return true;
    }
}

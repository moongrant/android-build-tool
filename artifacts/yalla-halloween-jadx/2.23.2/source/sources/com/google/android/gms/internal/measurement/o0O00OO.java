package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O00OO extends o0o0Oo implements RandomAccess, zzlg, o0O0oo00 {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final o0O00OO f15060OooO0oO = new o0O00OO(new int[0], 0, false);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f15061OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int[] f15062OooO0o0;

    public o0O00OO() {
        this(new int[10], 0, true);
    }

    public final void OooO0O0(int i) {
        OooO00o();
        int i2 = this.f15061OooO0o;
        int[] iArr = this.f15062OooO0o0;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[o000OOoO.o0OO00O.OooO00o(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f15062OooO0o0 = iArr2;
        }
        int[] iArr3 = this.f15062OooO0o0;
        int i3 = this.f15061OooO0o;
        this.f15061OooO0o = i3 + 1;
        iArr3[i3] = i;
    }

    public final void OooO0OO(int i) {
        if (i < 0 || i >= this.f15061OooO0o) {
            throw new IndexOutOfBoundsException(androidx.compose.compiler.plugins.kotlin.lower.OooO0O0.OooO0O0("Index:", i, ", Size:", this.f15061OooO0o));
        }
    }

    @Override // com.google.android.gms.internal.measurement.o0o0Oo, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        OooO00o();
        if (i < 0 || i > (i2 = this.f15061OooO0o)) {
            throw new IndexOutOfBoundsException(androidx.compose.compiler.plugins.kotlin.lower.OooO0O0.OooO0O0("Index:", i, ", Size:", this.f15061OooO0o));
        }
        int[] iArr = this.f15062OooO0o0;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[o000OOoO.o0OO00O.OooO00o(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f15062OooO0o0, i, iArr2, i + 1, this.f15061OooO0o - i);
            this.f15062OooO0o0 = iArr2;
        }
        this.f15062OooO0o0[i] = iIntValue;
        this.f15061OooO0o++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.o0o0Oo, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        OooO00o();
        Charset charset = zzlj.f15277OooO00o;
        collection.getClass();
        if (!(collection instanceof o0O00OO)) {
            return super.addAll(collection);
        }
        o0O00OO o0o00oo2 = (o0O00OO) collection;
        int i = o0o00oo2.f15061OooO0o;
        if (i == 0) {
            return false;
        }
        int i2 = this.f15061OooO0o;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f15062OooO0o0;
        if (i3 > iArr.length) {
            this.f15062OooO0o0 = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(o0o00oo2.f15062OooO0o0, 0, this.f15062OooO0o0, this.f15061OooO0o, o0o00oo2.f15061OooO0o);
        this.f15061OooO0o = i3;
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
        if (!(obj instanceof o0O00OO)) {
            return super.equals(obj);
        }
        o0O00OO o0o00oo2 = (o0O00OO) obj;
        if (this.f15061OooO0o != o0o00oo2.f15061OooO0o) {
            return false;
        }
        int[] iArr = o0o00oo2.f15062OooO0o0;
        for (int i = 0; i < this.f15061OooO0o; i++) {
            if (this.f15062OooO0o0[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        OooO0OO(i);
        return Integer.valueOf(this.f15062OooO0o0[i]);
    }

    @Override // com.google.android.gms.internal.measurement.o0o0Oo, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f15061OooO0o; i2++) {
            i = (i * 31) + this.f15062OooO0o0[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f15061OooO0o;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f15062OooO0o0[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.o0o0Oo, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        OooO00o();
        OooO0OO(i);
        int[] iArr = this.f15062OooO0o0;
        int i2 = iArr[i];
        int i3 = this.f15061OooO0o;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f15061OooO0o--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        OooO00o();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f15062OooO0o0;
        System.arraycopy(iArr, i2, iArr, i, this.f15061OooO0o - i2);
        this.f15061OooO0o -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.o0o0Oo, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        OooO00o();
        OooO0OO(i);
        int[] iArr = this.f15062OooO0o0;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15061OooO0o;
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzlg zzd(int i) {
        if (i >= this.f15061OooO0o) {
            return new o0O00OO(Arrays.copyOf(this.f15062OooO0o0, i), this.f15061OooO0o, true);
        }
        throw new IllegalArgumentException();
    }

    public o0O00OO(int[] iArr, int i, boolean z) {
        super(z);
        this.f15062OooO0o0 = iArr;
        this.f15061OooO0o = i;
    }

    @Override // com.google.android.gms.internal.measurement.o0o0Oo, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        OooO0O0(((Integer) obj).intValue());
        return true;
    }
}

package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Oo00 extends o00OOO0O implements RandomAccess, o0oOo0O0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f15511OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean[] f15512OooO0o0;

    static {
        new o00Oo00(new boolean[0], 0, false);
    }

    public o00Oo00() {
        this(new boolean[10], 0, true);
    }

    public final void OooO0O0(boolean z) {
        OooO00o();
        int i = this.f15511OooO0o;
        boolean[] zArr = this.f15512OooO0o0;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[androidx.compose.ui.focus.OooO00o.OooO00o(i, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f15512OooO0o0 = zArr2;
        }
        boolean[] zArr3 = this.f15512OooO0o0;
        int i2 = this.f15511OooO0o;
        this.f15511OooO0o = i2 + 1;
        zArr3[i2] = z;
    }

    public final void OooO0OO(int i) {
        if (i < 0 || i >= this.f15511OooO0o) {
            throw new IndexOutOfBoundsException(p022Oooo00O.OooOO0.OooO00o("Index:", i, ", Size:", this.f15511OooO0o));
        }
    }

    @Override // com.google.android.gms.internal.measurement.o00OOO0O, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        OooO00o();
        if (i < 0 || i > (i2 = this.f15511OooO0o)) {
            throw new IndexOutOfBoundsException(p022Oooo00O.OooOO0.OooO00o("Index:", i, ", Size:", this.f15511OooO0o));
        }
        boolean[] zArr = this.f15512OooO0o0;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[androidx.compose.ui.focus.OooO00o.OooO00o(i2, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f15512OooO0o0, i, zArr2, i + 1, this.f15511OooO0o - i);
            this.f15512OooO0o0 = zArr2;
        }
        this.f15512OooO0o0[i] = zBooleanValue;
        this.f15511OooO0o++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.o00OOO0O, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        OooO00o();
        Charset charset = zzlj.f15753OooO00o;
        collection.getClass();
        if (!(collection instanceof o00Oo00)) {
            return super.addAll(collection);
        }
        o00Oo00 o00oo00 = (o00Oo00) collection;
        int i = o00oo00.f15511OooO0o;
        if (i == 0) {
            return false;
        }
        int i2 = this.f15511OooO0o;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.f15512OooO0o0;
        if (i3 > zArr.length) {
            this.f15512OooO0o0 = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(o00oo00.f15512OooO0o0, 0, this.f15512OooO0o0, this.f15511OooO0o, o00oo00.f15511OooO0o);
        this.f15511OooO0o = i3;
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
        if (!(obj instanceof o00Oo00)) {
            return super.equals(obj);
        }
        o00Oo00 o00oo00 = (o00Oo00) obj;
        if (this.f15511OooO0o != o00oo00.f15511OooO0o) {
            return false;
        }
        boolean[] zArr = o00oo00.f15512OooO0o0;
        for (int i = 0; i < this.f15511OooO0o; i++) {
            if (this.f15512OooO0o0[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        OooO0OO(i);
        return Boolean.valueOf(this.f15512OooO0o0[i]);
    }

    @Override // com.google.android.gms.internal.measurement.o00OOO0O, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZza = 1;
        for (int i = 0; i < this.f15511OooO0o; i++) {
            iZza = (iZza * 31) + zzlj.zza(this.f15512OooO0o0[i]);
        }
        return iZza;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i = this.f15511OooO0o;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f15512OooO0o0[i2] == zBooleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.o00OOO0O, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        OooO00o();
        OooO0OO(i);
        boolean[] zArr = this.f15512OooO0o0;
        boolean z = zArr[i];
        int i2 = this.f15511OooO0o;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f15511OooO0o--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        OooO00o();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f15512OooO0o0;
        System.arraycopy(zArr, i2, zArr, i, this.f15511OooO0o - i2);
        this.f15511OooO0o -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.o00OOO0O, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        OooO00o();
        OooO0OO(i);
        boolean[] zArr = this.f15512OooO0o0;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15511OooO0o;
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final /* bridge */ /* synthetic */ zzli zzd(int i) {
        if (i >= this.f15511OooO0o) {
            return new o00Oo00(Arrays.copyOf(this.f15512OooO0o0, i), this.f15511OooO0o, true);
        }
        throw new IllegalArgumentException();
    }

    public o00Oo00(boolean[] zArr, int i, boolean z) {
        super(z);
        this.f15512OooO0o0 = zArr;
        this.f15511OooO0o = i;
    }

    @Override // com.google.android.gms.internal.measurement.o00OOO0O, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        OooO0O0(((Boolean) obj).booleanValue());
        return true;
    }
}

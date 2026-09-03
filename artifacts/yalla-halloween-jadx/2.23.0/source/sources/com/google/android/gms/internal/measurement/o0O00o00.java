package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O00o00 extends o00OOO0O implements RandomAccess, zzlh, o0oOo0O0 {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final o0O00o00 f15538OooO0oO = new o0O00o00(new long[0], 0, false);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f15539OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long[] f15540OooO0o0;

    public o0O00o00() {
        this(new long[10], 0, true);
    }

    public final void OooO0O0(long j) {
        OooO00o();
        int i = this.f15539OooO0o;
        long[] jArr = this.f15540OooO0o0;
        if (i == jArr.length) {
            long[] jArr2 = new long[androidx.compose.ui.focus.OooO00o.OooO00o(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f15540OooO0o0 = jArr2;
        }
        long[] jArr3 = this.f15540OooO0o0;
        int i2 = this.f15539OooO0o;
        this.f15539OooO0o = i2 + 1;
        jArr3[i2] = j;
    }

    public final void OooO0OO(int i) {
        if (i < 0 || i >= this.f15539OooO0o) {
            throw new IndexOutOfBoundsException(p022Oooo00O.OooOO0.OooO00o("Index:", i, ", Size:", this.f15539OooO0o));
        }
    }

    @Override // com.google.android.gms.internal.measurement.o00OOO0O, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        OooO00o();
        if (i < 0 || i > (i2 = this.f15539OooO0o)) {
            throw new IndexOutOfBoundsException(p022Oooo00O.OooOO0.OooO00o("Index:", i, ", Size:", this.f15539OooO0o));
        }
        long[] jArr = this.f15540OooO0o0;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[androidx.compose.ui.focus.OooO00o.OooO00o(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f15540OooO0o0, i, jArr2, i + 1, this.f15539OooO0o - i);
            this.f15540OooO0o0 = jArr2;
        }
        this.f15540OooO0o0[i] = jLongValue;
        this.f15539OooO0o++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.o00OOO0O, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        OooO00o();
        Charset charset = zzlj.f15753OooO00o;
        collection.getClass();
        if (!(collection instanceof o0O00o00)) {
            return super.addAll(collection);
        }
        o0O00o00 o0o00o01 = (o0O00o00) collection;
        int i = o0o00o01.f15539OooO0o;
        if (i == 0) {
            return false;
        }
        int i2 = this.f15539OooO0o;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.f15540OooO0o0;
        if (i3 > jArr.length) {
            this.f15540OooO0o0 = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(o0o00o01.f15540OooO0o0, 0, this.f15540OooO0o0, this.f15539OooO0o, o0o00o01.f15539OooO0o);
        this.f15539OooO0o = i3;
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
        if (!(obj instanceof o0O00o00)) {
            return super.equals(obj);
        }
        o0O00o00 o0o00o01 = (o0O00o00) obj;
        if (this.f15539OooO0o != o0o00o01.f15539OooO0o) {
            return false;
        }
        long[] jArr = o0o00o01.f15540OooO0o0;
        for (int i = 0; i < this.f15539OooO0o; i++) {
            if (this.f15540OooO0o0[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        OooO0OO(i);
        return Long.valueOf(this.f15540OooO0o0[i]);
    }

    @Override // com.google.android.gms.internal.measurement.o00OOO0O, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f15539OooO0o; i2++) {
            long j = this.f15540OooO0o0[i2];
            Charset charset = zzlj.f15753OooO00o;
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.f15539OooO0o;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f15540OooO0o0[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.o00OOO0O, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        OooO00o();
        OooO0OO(i);
        long[] jArr = this.f15540OooO0o0;
        long j = jArr[i];
        int i2 = this.f15539OooO0o;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f15539OooO0o--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        OooO00o();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f15540OooO0o0;
        System.arraycopy(jArr, i2, jArr, i, this.f15539OooO0o - i2);
        this.f15539OooO0o -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.o00OOO0O, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        OooO00o();
        OooO0OO(i);
        long[] jArr = this.f15540OooO0o0;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15539OooO0o;
    }

    @Override // com.google.android.gms.internal.measurement.zzlh
    public final long zza(int i) {
        OooO0OO(i);
        return this.f15540OooO0o0[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzlh zzd(int i) {
        if (i >= this.f15539OooO0o) {
            return new o0O00o00(Arrays.copyOf(this.f15540OooO0o0, i), this.f15539OooO0o, true);
        }
        throw new IllegalArgumentException();
    }

    public o0O00o00(long[] jArr, int i, boolean z) {
        super(z);
        this.f15540OooO0o0 = jArr;
        this.f15539OooO0o = i;
    }

    @Override // com.google.android.gms.internal.measurement.o00OOO0O, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        OooO0O0(((Long) obj).longValue());
        return true;
    }
}

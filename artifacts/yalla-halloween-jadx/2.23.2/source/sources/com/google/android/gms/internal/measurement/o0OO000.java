package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OO000 extends o0o0Oo implements RandomAccess {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final o0OO000 f15098OooO0oO = new o0OO000(new Object[0], 0, false);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f15099OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Object[] f15100OooO0o0;

    public o0OO000(Object[] objArr, int i, boolean z) {
        super(z);
        this.f15100OooO0o0 = objArr;
        this.f15099OooO0o = i;
    }

    public final void OooO0O0(int i) {
        if (i < 0 || i >= this.f15099OooO0o) {
            throw new IndexOutOfBoundsException(androidx.compose.compiler.plugins.kotlin.lower.OooO0O0.OooO0O0("Index:", i, ", Size:", this.f15099OooO0o));
        }
    }

    @Override // com.google.android.gms.internal.measurement.o0o0Oo, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        OooO00o();
        if (i < 0 || i > (i2 = this.f15099OooO0o)) {
            throw new IndexOutOfBoundsException(androidx.compose.compiler.plugins.kotlin.lower.OooO0O0.OooO0O0("Index:", i, ", Size:", this.f15099OooO0o));
        }
        Object[] objArr = this.f15100OooO0o0;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[o000OOoO.o0OO00O.OooO00o(i2, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f15100OooO0o0, i, objArr2, i + 1, this.f15099OooO0o - i);
            this.f15100OooO0o0 = objArr2;
        }
        this.f15100OooO0o0[i] = obj;
        this.f15099OooO0o++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        OooO0O0(i);
        return this.f15100OooO0o0[i];
    }

    @Override // com.google.android.gms.internal.measurement.o0o0Oo, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        OooO00o();
        OooO0O0(i);
        Object[] objArr = this.f15100OooO0o0;
        Object obj = objArr[i];
        int i2 = this.f15099OooO0o;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f15099OooO0o--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.measurement.o0o0Oo, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        OooO00o();
        OooO0O0(i);
        Object[] objArr = this.f15100OooO0o0;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15099OooO0o;
    }

    @Override // com.google.android.gms.internal.measurement.zzli
    public final /* bridge */ /* synthetic */ zzli zzd(int i) {
        if (i >= this.f15099OooO0o) {
            return new o0OO000(Arrays.copyOf(this.f15100OooO0o0, i), this.f15099OooO0o, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.o0o0Oo, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        OooO00o();
        int i = this.f15099OooO0o;
        Object[] objArr = this.f15100OooO0o0;
        if (i == objArr.length) {
            this.f15100OooO0o0 = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f15100OooO0o0;
        int i2 = this.f15099OooO0o;
        this.f15099OooO0o = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}

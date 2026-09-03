package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
public final class o0O00O0o<E> extends ImmutableSet<E> {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final Object[] f19089OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final o0O00O0o<Object> f19090OooOOO0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @VisibleForTesting
    public final transient Object[] f19091OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @VisibleForTesting
    public final transient Object[] f19092OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final transient int f19093OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final transient int f19094OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final transient int f19095OooOO0O;

    static {
        Object[] objArr = new Object[0];
        f19089OooOO0o = objArr;
        f19090OooOOO0 = new o0O00O0o<>(objArr, objArr, 0, 0, 0);
    }

    public o0O00O0o(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        this.f19092OooO0oO = objArr;
        this.f19093OooO0oo = i;
        this.f19091OooO = objArr2;
        this.f19094OooOO0 = i2;
        this.f19095OooOO0O = i3;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int OooO0O0(int i, Object[] objArr) {
        Object[] objArr2 = this.f19092OooO0oO;
        int i2 = this.f19095OooOO0O;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final Object[] OooO0OO() {
        return this.f19092OooO0oO;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int OooO0Oo() {
        return this.f19095OooOO0O;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean OooO0o() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int OooO0o0() {
        return 0;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: OooO0oo */
    public final o0OO0<E> iterator() {
        return OooO00o().listIterator(0);
    }

    @Override // com.google.common.collect.ImmutableSet
    public final ImmutableList<E> OooOOO0() {
        return ImmutableList.OooO(this.f19095OooOO0O, this.f19092OooO0oO);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        if (obj != null) {
            Object[] objArr = this.f19091OooO;
            if (objArr.length != 0) {
                int iOooO0OO = o000OO0O.OooO0OO(obj);
                while (true) {
                    int i = iOooO0OO & this.f19094OooOO0;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iOooO0OO = i + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f19093OooO0oo;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f19095OooOO0O;
    }
}

package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtIncompatible
public final class o000OOo<E> extends oo0o0Oo<E> {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @MonotonicNonNullDecl
    public transient int[] f18456OoooO;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @MonotonicNonNullDecl
    public transient int[] f18457OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public transient int f18458OoooOOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public transient int f18459o000oOoO;

    public o000OOo() {
    }

    @Override // com.google.common.collect.oo0o0Oo
    public final int OooO00o(int i, int i2) {
        return i == this.f18695OoooO0O ? i2 : i;
    }

    @Override // com.google.common.collect.oo0o0Oo
    public final int OooO0O0() {
        return this.f18459o000oOoO;
    }

    @Override // com.google.common.collect.oo0o0Oo
    public final int OooO0OO(int i) {
        return this.f18457OoooOO0[i];
    }

    @Override // com.google.common.collect.oo0o0Oo
    public final void OooO0o0(int i) {
        super.OooO0o0(i);
        int[] iArr = new int[i];
        this.f18456OoooO = iArr;
        this.f18457OoooOO0 = new int[i];
        Arrays.fill(iArr, -1);
        Arrays.fill(this.f18457OoooOO0, -1);
        this.f18459o000oOoO = -2;
        this.f18458OoooOOO = -2;
    }

    @Override // com.google.common.collect.oo0o0Oo
    public final void OooO0oO(int i, E e, int i2) {
        this.f18691Oooo0oO[i] = (((long) i2) << 32) | 4294967295L;
        this.f18692Oooo0oo[i] = e;
        OooOO0o(this.f18458OoooOOO, i);
        OooOO0o(i, -2);
    }

    @Override // com.google.common.collect.oo0o0Oo
    public final void OooO0oo(int i) {
        int i2 = this.f18695OoooO0O - 1;
        super.OooO0oo(i);
        OooOO0o(this.f18456OoooO[i], this.f18457OoooOO0[i]);
        if (i2 != i) {
            OooOO0o(this.f18456OoooO[i2], i);
            OooOO0o(i, this.f18457OoooOO0[i2]);
        }
        this.f18456OoooO[i2] = -1;
        this.f18457OoooOO0[i2] = -1;
    }

    @Override // com.google.common.collect.oo0o0Oo
    public final void OooOO0(int i) {
        super.OooOO0(i);
        int[] iArr = this.f18456OoooO;
        int length = iArr.length;
        this.f18456OoooO = Arrays.copyOf(iArr, i);
        this.f18457OoooOO0 = Arrays.copyOf(this.f18457OoooOO0, i);
        if (length < i) {
            Arrays.fill(this.f18456OoooO, length, i, -1);
            Arrays.fill(this.f18457OoooOO0, length, i, -1);
        }
    }

    public final void OooOO0o(int i, int i2) {
        if (i == -2) {
            this.f18459o000oOoO = i2;
        } else {
            this.f18457OoooOO0[i] = i2;
        }
        if (i2 == -2) {
            this.f18458OoooOOO = i;
        } else {
            this.f18456OoooO[i2] = i;
        }
    }

    @Override // com.google.common.collect.oo0o0Oo, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        super.clear();
        this.f18459o000oOoO = -2;
        this.f18458OoooOOO = -2;
        Arrays.fill(this.f18456OoooO, -1);
        Arrays.fill(this.f18457OoooOO0, -1);
    }

    @Override // com.google.common.collect.oo0o0Oo, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr = new Object[size()];
        o00OOOO0.OooO0OO(this, objArr);
        return objArr;
    }

    public o000OOo(int i) {
        super(i);
    }

    @Override // com.google.common.collect.oo0o0Oo, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) o00OOOO0.OooO0o0(this, tArr);
    }
}

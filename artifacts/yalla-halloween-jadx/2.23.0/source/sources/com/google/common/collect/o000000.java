package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public final class o000000<E> extends oo0o0Oo<E> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @CheckForNull
    public transient int[] f19399OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @CheckForNull
    public transient int[] f19400OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public transient int f19401OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public transient int f19402OooOO0o;

    @Override // com.google.common.collect.oo0o0Oo
    public final void OooO(int i, int i2, int i3, @ParametricNullness Object obj) {
        super.OooO(i, i2, i3, obj);
        OooOOOo(this.f19402OooOO0o, i);
        OooOOOo(i, -2);
    }

    @Override // com.google.common.collect.oo0o0Oo
    public final int OooO00o(int i, int i2) {
        return i >= size() ? i2 : i;
    }

    @Override // com.google.common.collect.oo0o0Oo
    public final int OooO0O0() {
        int iOooO0O0 = super.OooO0O0();
        this.f19399OooO = new int[iOooO0O0];
        this.f19400OooOO0 = new int[iOooO0O0];
        return iOooO0O0;
    }

    @Override // com.google.common.collect.oo0o0Oo
    @CanIgnoreReturnValue
    public final LinkedHashSet OooO0OO() {
        LinkedHashSet linkedHashSetOooO0OO = super.OooO0OO();
        this.f19399OooO = null;
        this.f19400OooOO0 = null;
        return linkedHashSetOooO0OO;
    }

    @Override // com.google.common.collect.oo0o0Oo
    public final int OooO0o(int i) {
        int[] iArr = this.f19400OooOO0;
        Objects.requireNonNull(iArr);
        return iArr[i] - 1;
    }

    @Override // com.google.common.collect.oo0o0Oo
    public final int OooO0o0() {
        return this.f19401OooOO0O;
    }

    @Override // com.google.common.collect.oo0o0Oo
    public final void OooO0oo(int i) {
        super.OooO0oo(i);
        this.f19401OooOO0O = -2;
        this.f19402OooOO0o = -2;
    }

    @Override // com.google.common.collect.oo0o0Oo
    public final void OooOO0(int i, int i2) {
        int size = size() - 1;
        super.OooOO0(i, i2);
        int[] iArr = this.f19399OooO;
        Objects.requireNonNull(iArr);
        OooOOOo(iArr[i] - 1, OooO0o(i));
        if (i < size) {
            int[] iArr2 = this.f19399OooO;
            Objects.requireNonNull(iArr2);
            OooOOOo(iArr2[size] - 1, i);
            OooOOOo(i, OooO0o(size));
        }
        int[] iArr3 = this.f19399OooO;
        Objects.requireNonNull(iArr3);
        iArr3[size] = 0;
        int[] iArr4 = this.f19400OooOO0;
        Objects.requireNonNull(iArr4);
        iArr4[size] = 0;
    }

    @Override // com.google.common.collect.oo0o0Oo
    public final void OooOOO(int i) {
        super.OooOOO(i);
        int[] iArr = this.f19399OooO;
        Objects.requireNonNull(iArr);
        this.f19399OooO = Arrays.copyOf(iArr, i);
        int[] iArr2 = this.f19400OooOO0;
        Objects.requireNonNull(iArr2);
        this.f19400OooOO0 = Arrays.copyOf(iArr2, i);
    }

    public final void OooOOOo(int i, int i2) {
        if (i == -2) {
            this.f19401OooOO0O = i2;
        } else {
            int[] iArr = this.f19400OooOO0;
            Objects.requireNonNull(iArr);
            iArr[i] = i2 + 1;
        }
        if (i2 == -2) {
            this.f19402OooOO0o = i;
            return;
        }
        int[] iArr2 = this.f19399OooO;
        Objects.requireNonNull(iArr2);
        iArr2[i2] = i + 1;
    }

    @Override // com.google.common.collect.oo0o0Oo, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        if (OooOO0O()) {
            return;
        }
        this.f19401OooOO0O = -2;
        this.f19402OooOO0o = -2;
        int[] iArr = this.f19399OooO;
        if (iArr != null && this.f19400OooOO0 != null) {
            Arrays.fill(iArr, 0, size(), 0);
            Arrays.fill(this.f19400OooOO0, 0, size(), 0);
        }
        super.clear();
    }

    @Override // com.google.common.collect.oo0o0Oo, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr = new Object[size()];
        Iterator<E> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return objArr;
    }

    @Override // com.google.common.collect.oo0o0Oo, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) o0.OooO0O0(this, tArr);
    }
}

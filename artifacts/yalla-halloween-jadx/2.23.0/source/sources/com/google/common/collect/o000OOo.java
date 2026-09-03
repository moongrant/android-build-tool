package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public final class o000OOo<K, V> extends o0OO00O<K, V> {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @VisibleForTesting
    @CheckForNull
    public transient long[] f19446OooOOO;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public transient int f19447OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public transient int f19448OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final boolean f19449OooOOo0;

    public o000OOo(int i) {
        super(i);
        this.f19449OooOOo0 = false;
    }

    @Override // com.google.common.collect.o0OO00O
    public final void OooO00o(int i) {
        if (this.f19449OooOOo0) {
            long[] jArr = this.f19446OooOOO;
            Objects.requireNonNull(jArr);
            OooOo0o(((int) (jArr[i] >>> 32)) - 1, OooO0oo(i));
            OooOo0o(this.f19448OooOOOo, i);
            OooOo0o(i, -2);
            OooO();
        }
    }

    @Override // com.google.common.collect.o0OO00O
    public final int OooO0O0(int i, int i2) {
        return i >= size() ? i2 : i;
    }

    @Override // com.google.common.collect.o0OO00O
    public final int OooO0OO() {
        int iOooO0OO = super.OooO0OO();
        this.f19446OooOOO = new long[iOooO0OO];
        return iOooO0OO;
    }

    @Override // com.google.common.collect.o0OO00O
    @CanIgnoreReturnValue
    public final Map<K, V> OooO0Oo() {
        Map<K, V> mapOooO0Oo = super.OooO0Oo();
        this.f19446OooOOO = null;
        return mapOooO0Oo;
    }

    @Override // com.google.common.collect.o0OO00O
    public final LinkedHashMap OooO0o0(int i) {
        return new LinkedHashMap(i, 1.0f, this.f19449OooOOo0);
    }

    @Override // com.google.common.collect.o0OO00O
    public final int OooO0oO() {
        return this.f19447OooOOOO;
    }

    @Override // com.google.common.collect.o0OO00O
    public final int OooO0oo(int i) {
        long[] jArr = this.f19446OooOOO;
        Objects.requireNonNull(jArr);
        return ((int) jArr[i]) - 1;
    }

    @Override // com.google.common.collect.o0OO00O
    public final void OooOO0O(int i) {
        super.OooOO0O(i);
        this.f19447OooOOOO = -2;
        this.f19448OooOOOo = -2;
    }

    @Override // com.google.common.collect.o0OO00O
    public final void OooOO0o(int i, int i2, int i3, @ParametricNullness Object obj, @ParametricNullness Object obj2) {
        super.OooOO0o(i, i2, i3, obj, obj2);
        OooOo0o(this.f19448OooOOOo, i);
        OooOo0o(i, -2);
    }

    @Override // com.google.common.collect.o0OO00O
    public final void OooOOO(int i, int i2) {
        int size = size() - 1;
        super.OooOOO(i, i2);
        long[] jArr = this.f19446OooOOO;
        Objects.requireNonNull(jArr);
        OooOo0o(((int) (jArr[i] >>> 32)) - 1, OooO0oo(i));
        if (i < size) {
            long[] jArr2 = this.f19446OooOOO;
            Objects.requireNonNull(jArr2);
            OooOo0o(((int) (jArr2[size] >>> 32)) - 1, i);
            OooOo0o(i, OooO0oo(size));
        }
        long[] jArr3 = this.f19446OooOOO;
        Objects.requireNonNull(jArr3);
        jArr3[size] = 0;
    }

    @Override // com.google.common.collect.o0OO00O
    public final void OooOo00(int i) {
        super.OooOo00(i);
        long[] jArr = this.f19446OooOOO;
        Objects.requireNonNull(jArr);
        this.f19446OooOOO = Arrays.copyOf(jArr, i);
    }

    public final void OooOo0o(int i, int i2) {
        if (i == -2) {
            this.f19447OooOOOO = i2;
        } else {
            long[] jArr = this.f19446OooOOO;
            Objects.requireNonNull(jArr);
            long j = (jArr[i] & (-4294967296L)) | (((long) (i2 + 1)) & 4294967295L);
            long[] jArr2 = this.f19446OooOOO;
            Objects.requireNonNull(jArr2);
            jArr2[i] = j;
        }
        if (i2 == -2) {
            this.f19448OooOOOo = i;
            return;
        }
        long[] jArr3 = this.f19446OooOOO;
        Objects.requireNonNull(jArr3);
        long j2 = (4294967295L & jArr3[i2]) | (((long) (i + 1)) << 32);
        long[] jArr4 = this.f19446OooOOO;
        Objects.requireNonNull(jArr4);
        jArr4[i2] = j2;
    }

    @Override // com.google.common.collect.o0OO00O, java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (OooOOOO()) {
            return;
        }
        this.f19447OooOOOO = -2;
        this.f19448OooOOOo = -2;
        long[] jArr = this.f19446OooOOO;
        if (jArr != null) {
            Arrays.fill(jArr, 0, size(), 0L);
        }
        super.clear();
    }
}

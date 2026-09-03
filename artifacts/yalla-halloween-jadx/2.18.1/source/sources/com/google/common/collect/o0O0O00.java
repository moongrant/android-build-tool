package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtIncompatible
public final class o0O0O00<K, V> extends o0OO00O<K, V> {

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @VisibleForTesting
    @MonotonicNonNullDecl
    public transient long[] f18612OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public transient int f18613OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public transient int f18614OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public final boolean f18615Ooooo00;

    public o0O0O00() {
        super(3, 1.0f);
        this.f18615Ooooo00 = false;
    }

    @Override // com.google.common.collect.o0OO00O
    public final void OooO(int i, K k, V v, int i2) {
        super.OooO(i, k, v, i2);
        OooOOOO(this.f18614OoooOoo, i);
        OooOOOO(i, -2);
    }

    @Override // com.google.common.collect.o0OO00O
    public final void OooO0O0(int i) {
        if (this.f18615Ooooo00) {
            OooOOOO(OooOOO(i), (int) this.f18612OoooOo0[i]);
            OooOOOO(this.f18614OoooOoo, i);
            OooOOOO(i, -2);
            this.f18653OoooO0++;
        }
    }

    @Override // com.google.common.collect.o0OO00O
    public final int OooO0OO(int i, int i2) {
        return i >= this.f18652OoooO ? i2 : i;
    }

    @Override // com.google.common.collect.o0OO00O
    public final int OooO0Oo() {
        return this.f18613OoooOoO;
    }

    @Override // com.google.common.collect.o0OO00O
    public final int OooO0o0(int i) {
        return (int) this.f18612OoooOo0[i];
    }

    @Override // com.google.common.collect.o0OO00O
    public final void OooO0oo(int i) {
        super.OooO0oo(i);
        this.f18613OoooOoO = -2;
        this.f18614OoooOoo = -2;
        long[] jArr = new long[i];
        this.f18612OoooOo0 = jArr;
        Arrays.fill(jArr, -1L);
    }

    @Override // com.google.common.collect.o0OO00O
    public final void OooOO0(int i) {
        int i2 = this.f18652OoooO - 1;
        OooOOOO(OooOOO(i), (int) this.f18612OoooOo0[i]);
        if (i < i2) {
            OooOOOO(OooOOO(i2), i);
            OooOOOO(i, (int) this.f18612OoooOo0[i2]);
        }
        super.OooOO0(i);
    }

    @Override // com.google.common.collect.o0OO00O
    public final void OooOO0o(int i) {
        super.OooOO0o(i);
        this.f18612OoooOo0 = Arrays.copyOf(this.f18612OoooOo0, i);
    }

    public final int OooOOO(int i) {
        return (int) (this.f18612OoooOo0[i] >>> 32);
    }

    public final void OooOOOO(int i, int i2) {
        if (i == -2) {
            this.f18613OoooOoO = i2;
        } else {
            long[] jArr = this.f18612OoooOo0;
            jArr[i] = (jArr[i] & (-4294967296L)) | (((long) i2) & 4294967295L);
        }
        if (i2 == -2) {
            this.f18614OoooOoo = i;
        } else {
            long[] jArr2 = this.f18612OoooOo0;
            jArr2[i2] = (4294967295L & jArr2[i2]) | (((long) i) << 32);
        }
    }

    @Override // com.google.common.collect.o0OO00O, java.util.AbstractMap, java.util.Map
    public final void clear() {
        super.clear();
        this.f18613OoooOoO = -2;
        this.f18614OoooOoo = -2;
    }

    public o0O0O00(int i) {
        super(12, 1.0f);
        this.f18615Ooooo00 = false;
    }
}

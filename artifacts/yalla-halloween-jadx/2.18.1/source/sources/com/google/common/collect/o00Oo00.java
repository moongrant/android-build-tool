package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true, serializable = true)
public final class o00Oo00<K> extends o00OOOOo<K> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @VisibleForTesting
    public transient long[] f18567OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public transient int f18568OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public transient int f18569OooOO0O;

    public o00Oo00() {
        super(3, 1.0f);
    }

    @Override // com.google.common.collect.o00OOOOo
    public final int OooO(int i, int i2) {
        return i == this.f18558OooO0OO ? i2 : i;
    }

    @Override // com.google.common.collect.o00OOOOo
    public final void OooO00o() {
        super.OooO00o();
        this.f18568OooOO0 = -2;
        this.f18569OooOO0O = -2;
    }

    @Override // com.google.common.collect.o00OOOOo
    public final int OooO0O0() {
        int i = this.f18568OooOO0;
        if (i == -2) {
            return -1;
        }
        return i;
    }

    @Override // com.google.common.collect.o00OOOOo
    public final void OooO0o(int i, K k, int i2, int i3) {
        super.OooO0o(i, k, i2, i3);
        OooOOOo(this.f18569OooOO0O, i);
        OooOOOo(i, -2);
    }

    @Override // com.google.common.collect.o00OOOOo
    public final void OooO0o0() {
        super.OooO0o0();
        this.f18568OooOO0 = -2;
        this.f18569OooOO0O = -2;
        long[] jArr = new long[3];
        this.f18567OooO = jArr;
        Arrays.fill(jArr, -1L);
    }

    @Override // com.google.common.collect.o00OOOOo
    public final void OooO0oO(int i) {
        int i2 = this.f18558OooO0OO - 1;
        long[] jArr = this.f18567OooO;
        OooOOOo((int) (jArr[i] >>> 32), (int) jArr[i]);
        if (i < i2) {
            OooOOOo((int) (this.f18567OooO[i2] >>> 32), i);
            OooOOOo(i, (int) this.f18567OooO[i2]);
        }
        super.OooO0oO(i);
    }

    @Override // com.google.common.collect.o00OOOOo
    public final int OooO0oo(int i) {
        int i2 = (int) this.f18567OooO[i];
        if (i2 == -2) {
            return -1;
        }
        return i2;
    }

    @Override // com.google.common.collect.o00OOOOo
    public final void OooOOO0(int i) {
        super.OooOOO0(i);
        long[] jArr = this.f18567OooO;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i);
        this.f18567OooO = jArrCopyOf;
        Arrays.fill(jArrCopyOf, length, i, -1L);
    }

    public final void OooOOOo(int i, int i2) {
        if (i == -2) {
            this.f18568OooOO0 = i2;
        } else {
            long[] jArr = this.f18567OooO;
            jArr[i] = (jArr[i] & (-4294967296L)) | (((long) i2) & 4294967295L);
        }
        if (i2 == -2) {
            this.f18569OooOO0O = i;
        } else {
            long[] jArr2 = this.f18567OooO;
            jArr2[i2] = (4294967295L & jArr2[i2]) | (((long) i) << 32);
        }
    }
}

package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
public final class o0O0000O<K> extends o0O00000<K> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @VisibleForTesting
    public transient long[] f19550OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public transient int f19551OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public transient int f19552OooOO0O;

    @Override // com.google.common.collect.o0O00000
    public final void OooO00o() {
        super.OooO00o();
        this.f19551OooOO0 = -2;
        this.f19552OooOO0O = -2;
    }

    @Override // com.google.common.collect.o0O00000
    public final int OooO0O0() {
        int i = this.f19551OooOO0;
        if (i == -2) {
            return -1;
        }
        return i;
    }

    @Override // com.google.common.collect.o0O00000
    public final void OooO0Oo() {
        super.OooO0Oo();
        this.f19551OooOO0 = -2;
        this.f19552OooOO0O = -2;
        long[] jArr = new long[3];
        this.f19550OooO = jArr;
        Arrays.fill(jArr, -1L);
    }

    @Override // com.google.common.collect.o0O00000
    public final void OooO0o(int i) {
        int i2 = this.f19541OooO0OO - 1;
        long j = this.f19550OooO[i];
        OooOOO0((int) (j >>> 32), (int) j);
        if (i < i2) {
            OooOOO0((int) (this.f19550OooO[i2] >>> 32), i);
            OooOOO0(i, (int) this.f19550OooO[i2]);
        }
        super.OooO0o(i);
    }

    @Override // com.google.common.collect.o0O00000
    public final void OooO0o0(int i, int i2, int i3, @ParametricNullness Object obj) {
        super.OooO0o0(i, i2, i3, obj);
        OooOOO0(this.f19552OooOO0O, i);
        OooOOO0(i, -2);
    }

    @Override // com.google.common.collect.o0O00000
    public final int OooO0oO(int i) {
        int i2 = (int) this.f19550OooO[i];
        if (i2 == -2) {
            return -1;
        }
        return i2;
    }

    @Override // com.google.common.collect.o0O00000
    public final int OooO0oo(int i, int i2) {
        return i == this.f19541OooO0OO ? i2 : i;
    }

    @Override // com.google.common.collect.o0O00000
    public final void OooOO0o(int i) {
        super.OooOO0o(i);
        long[] jArr = this.f19550OooO;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i);
        this.f19550OooO = jArrCopyOf;
        Arrays.fill(jArrCopyOf, length, i, -1L);
    }

    public final void OooOOO0(int i, int i2) {
        if (i == -2) {
            this.f19551OooOO0 = i2;
        } else {
            long[] jArr = this.f19550OooO;
            jArr[i] = (jArr[i] & (-4294967296L)) | (((long) i2) & 4294967295L);
        }
        if (i2 == -2) {
            this.f19552OooOO0O = i;
        } else {
            long[] jArr2 = this.f19550OooO;
            jArr2[i2] = (4294967295L & jArr2[i2]) | (((long) i) << 32);
        }
    }
}

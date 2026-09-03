package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
public class o0O00000<K> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public transient Object[] f19539OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public transient int[] f19540OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public transient int f19541OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public transient int f19542OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @VisibleForTesting
    public transient long[] f19543OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public transient int[] f19544OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public transient float f19545OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public transient int f19546OooO0oo;

    public class OooO00o extends oo00oO.OooO00o<K> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @ParametricNullness
        public final K f19547OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f19549OooO0o0;

        public OooO00o(int i) {
            this.f19547OooO0Oo = (K) o0O00000.this.f19539OooO00o[i];
            this.f19549OooO0o0 = i;
        }

        @Override // com.google.common.collect.o0oOO.OooO00o
        public final int getCount() {
            int i = this.f19549OooO0o0;
            o0O00000 o0o00000 = o0O00000.this;
            K k = this.f19547OooO0Oo;
            if (i == -1 || i >= o0o00000.f19541OooO0OO || !com.google.common.base.Oooo000.OooO00o(k, o0o00000.f19539OooO00o[i])) {
                this.f19549OooO0o0 = o0o00000.OooO0OO(k);
            }
            int i2 = this.f19549OooO0o0;
            if (i2 == -1) {
                return 0;
            }
            return o0o00000.f19540OooO0O0[i2];
        }

        @Override // com.google.common.collect.o0oOO.OooO00o
        @ParametricNullness
        public final K getElement() {
            return this.f19547OooO0Oo;
        }
    }

    public o0O00000() {
        OooO0Oo();
    }

    @CanIgnoreReturnValue
    public final int OooO(int i, @ParametricNullness Object obj) {
        oo000o.OooO0OO(i, "count");
        long[] jArr = this.f19543OooO0o;
        Object[] objArr = this.f19539OooO00o;
        int[] iArr = this.f19540OooO0O0;
        int iOooO0OO = o000OO0O.OooO0OO(obj);
        int[] iArr2 = this.f19544OooO0o0;
        int length = (iArr2.length - 1) & iOooO0OO;
        int i2 = this.f19541OooO0OO;
        int i3 = iArr2[length];
        if (i3 == -1) {
            iArr2[length] = i2;
        } else {
            while (true) {
                long j = jArr[i3];
                if (((int) (j >>> 32)) == iOooO0OO && com.google.common.base.Oooo000.OooO00o(obj, objArr[i3])) {
                    int i4 = iArr[i3];
                    iArr[i3] = i;
                    return i4;
                }
                int i5 = (int) j;
                if (i5 == -1) {
                    jArr[i3] = ((-4294967296L) & j) | (((long) i2) & 4294967295L);
                    break;
                }
                i3 = i5;
            }
        }
        if (i2 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i6 = i2 + 1;
        int length2 = this.f19543OooO0o.length;
        if (i6 > length2) {
            int iMax = Math.max(1, length2 >>> 1) + length2;
            if (iMax < 0) {
                iMax = Integer.MAX_VALUE;
            }
            if (iMax != length2) {
                OooOO0o(iMax);
            }
        }
        OooO0o0(i2, i, iOooO0OO, obj);
        this.f19541OooO0OO = i6;
        if (i2 >= this.f19546OooO0oo) {
            int[] iArr3 = this.f19544OooO0o0;
            int length3 = iArr3.length * 2;
            if (iArr3.length >= 1073741824) {
                this.f19546OooO0oo = Integer.MAX_VALUE;
            } else {
                int i7 = ((int) (length3 * this.f19545OooO0oO)) + 1;
                int[] iArr4 = new int[length3];
                Arrays.fill(iArr4, -1);
                long[] jArr2 = this.f19543OooO0o;
                int i8 = length3 - 1;
                for (int i9 = 0; i9 < this.f19541OooO0OO; i9++) {
                    int i10 = (int) (jArr2[i9] >>> 32);
                    int i11 = i10 & i8;
                    int i12 = iArr4[i11];
                    iArr4[i11] = i9;
                    jArr2[i9] = (((long) i10) << 32) | (((long) i12) & 4294967295L);
                }
                this.f19546OooO0oo = i7;
                this.f19544OooO0o0 = iArr4;
            }
        }
        this.f19542OooO0Oo++;
        return 0;
    }

    public void OooO00o() {
        this.f19542OooO0Oo++;
        Arrays.fill(this.f19539OooO00o, 0, this.f19541OooO0OO, (Object) null);
        Arrays.fill(this.f19540OooO0O0, 0, this.f19541OooO0OO, 0);
        Arrays.fill(this.f19544OooO0o0, -1);
        Arrays.fill(this.f19543OooO0o, -1L);
        this.f19541OooO0OO = 0;
    }

    public int OooO0O0() {
        return this.f19541OooO0OO == 0 ? -1 : 0;
    }

    public final int OooO0OO(@CheckForNull Object obj) {
        int iOooO0OO = o000OO0O.OooO0OO(obj);
        int[] iArr = this.f19544OooO0o0;
        int i = iArr[(iArr.length - 1) & iOooO0OO];
        while (i != -1) {
            long j = this.f19543OooO0o[i];
            if (((int) (j >>> 32)) == iOooO0OO && com.google.common.base.Oooo000.OooO00o(obj, this.f19539OooO00o[i])) {
                return i;
            }
            i = (int) j;
        }
        return -1;
    }

    public void OooO0Oo() {
        int iOooO00o = o000OO0O.OooO00o(1.0f, 3);
        int[] iArr = new int[iOooO00o];
        Arrays.fill(iArr, -1);
        this.f19544OooO0o0 = iArr;
        this.f19545OooO0oO = 1.0f;
        this.f19539OooO00o = new Object[3];
        this.f19540OooO0O0 = new int[3];
        long[] jArr = new long[3];
        Arrays.fill(jArr, -1L);
        this.f19543OooO0o = jArr;
        this.f19546OooO0oo = Math.max(1, (int) (iOooO00o * 1.0f));
    }

    public void OooO0o(int i) {
        int i2 = this.f19541OooO0OO - 1;
        if (i >= i2) {
            this.f19539OooO00o[i] = null;
            this.f19540OooO0O0[i] = 0;
            this.f19543OooO0o[i] = -1;
            return;
        }
        Object[] objArr = this.f19539OooO00o;
        objArr[i] = objArr[i2];
        int[] iArr = this.f19540OooO0O0;
        iArr[i] = iArr[i2];
        objArr[i2] = null;
        iArr[i2] = 0;
        long[] jArr = this.f19543OooO0o;
        long j = jArr[i2];
        jArr[i] = j;
        jArr[i2] = -1;
        int[] iArr2 = this.f19544OooO0o0;
        int length = ((int) (j >>> 32)) & (iArr2.length - 1);
        int i3 = iArr2[length];
        if (i3 == i2) {
            iArr2[length] = i;
            return;
        }
        while (true) {
            long[] jArr2 = this.f19543OooO0o;
            long j2 = jArr2[i3];
            int i4 = (int) j2;
            if (i4 == i2) {
                jArr2[i3] = (j2 & (-4294967296L)) | (4294967295L & ((long) i));
                return;
            }
            i3 = i4;
        }
    }

    public void OooO0o0(int i, int i2, int i3, @ParametricNullness Object obj) {
        this.f19543OooO0o[i] = (((long) i3) << 32) | 4294967295L;
        this.f19539OooO00o[i] = obj;
        this.f19540OooO0O0[i] = i2;
    }

    public int OooO0oO(int i) {
        int i2 = i + 1;
        if (i2 < this.f19541OooO0OO) {
            return i2;
        }
        return -1;
    }

    public int OooO0oo(int i, int i2) {
        return i - 1;
    }

    public final int OooOO0(int i, @CheckForNull Object obj) {
        int[] iArr = this.f19544OooO0o0;
        int length = (iArr.length - 1) & i;
        int i2 = iArr[length];
        if (i2 == -1) {
            return 0;
        }
        int i3 = -1;
        while (true) {
            if (((int) (this.f19543OooO0o[i2] >>> 32)) == i && com.google.common.base.Oooo000.OooO00o(obj, this.f19539OooO00o[i2])) {
                int i4 = this.f19540OooO0O0[i2];
                if (i3 == -1) {
                    this.f19544OooO0o0[length] = (int) this.f19543OooO0o[i2];
                } else {
                    long[] jArr = this.f19543OooO0o;
                    jArr[i3] = (jArr[i3] & (-4294967296L)) | (4294967295L & ((long) ((int) jArr[i2])));
                }
                OooO0o(i2);
                this.f19541OooO0OO--;
                this.f19542OooO0Oo++;
                return i4;
            }
            int i5 = (int) this.f19543OooO0o[i2];
            if (i5 == -1) {
                return 0;
            }
            i3 = i2;
            i2 = i5;
        }
    }

    @CanIgnoreReturnValue
    public final int OooOO0O(int i) {
        return OooOO0((int) (this.f19543OooO0o[i] >>> 32), this.f19539OooO00o[i]);
    }

    public void OooOO0o(int i) {
        this.f19539OooO00o = Arrays.copyOf(this.f19539OooO00o, i);
        this.f19540OooO0O0 = Arrays.copyOf(this.f19540OooO0O0, i);
        long[] jArr = this.f19543OooO0o;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(jArrCopyOf, length, i, -1L);
        }
        this.f19543OooO0o = jArrCopyOf;
    }
}

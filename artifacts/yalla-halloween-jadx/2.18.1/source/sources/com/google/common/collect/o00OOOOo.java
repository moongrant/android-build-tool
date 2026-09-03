package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible(emulated = true, serializable = true)
public class o00OOOOo<K> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public transient Object[] f18556OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public transient int[] f18557OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public transient int f18558OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public transient int f18559OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @VisibleForTesting
    public transient long[] f18560OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public transient int[] f18561OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public transient float f18562OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public transient int f18563OooO0oo;

    public class OooO00o extends o00OOO0.OooO00o<K> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @NullableDecl
        public final K f18564Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f18565Oooo0oO;

        public OooO00o(int i) {
            this.f18564Oooo0o = (K) o00OOOOo.this.f18556OooO00o[i];
            this.f18565Oooo0oO = i;
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0017  */
        @Override // com.google.common.collect.o00OO.OooO00o
        public final int getCount() {
            int i = this.f18565Oooo0oO;
            if (i != -1) {
                o00OOOOo o00ooooo2 = o00OOOOo.this;
                if (i >= o00ooooo2.f18558OooO0OO || !o0OOOO0o.OooOOO.OooO00o(this.f18564Oooo0o, o00ooooo2.f18556OooO00o[i])) {
                    this.f18565Oooo0oO = o00OOOOo.this.OooO0Oo(this.f18564Oooo0o);
                }
            } else {
                this.f18565Oooo0oO = o00OOOOo.this.OooO0Oo(this.f18564Oooo0o);
            }
            int i2 = this.f18565Oooo0oO;
            if (i2 == -1) {
                return 0;
            }
            return o00OOOOo.this.f18557OooO0O0[i2];
        }

        @Override // com.google.common.collect.o00OO.OooO00o
        public final K getElement() {
            return this.f18564Oooo0o;
        }
    }

    public o00OOOOo() {
        OooO0o0();
    }

    public static long OooOOOO(long j, int i) {
        return (j & (-4294967296L)) | (((long) i) & 4294967295L);
    }

    public int OooO(int i, int i2) {
        return i - 1;
    }

    public void OooO00o() {
        this.f18559OooO0Oo++;
        Arrays.fill(this.f18556OooO00o, 0, this.f18558OooO0OO, (Object) null);
        Arrays.fill(this.f18557OooO0O0, 0, this.f18558OooO0OO, 0);
        Arrays.fill(this.f18561OooO0o0, -1);
        Arrays.fill(this.f18560OooO0o, -1L);
        this.f18558OooO0OO = 0;
    }

    public int OooO0O0() {
        return this.f18558OooO0OO == 0 ? -1 : 0;
    }

    public final int OooO0OO(int i) {
        o0OOOO0o.OooOOOO.OooO(i, this.f18558OooO0OO);
        return this.f18557OooO0O0[i];
    }

    public final int OooO0Oo(@NullableDecl Object obj) {
        int iOooO0OO = o000O0Oo.OooO0OO(obj);
        int[] iArr = this.f18561OooO0o0;
        int i = iArr[(iArr.length - 1) & iOooO0OO];
        while (i != -1) {
            long j = this.f18560OooO0o[i];
            if (((int) (j >>> 32)) == iOooO0OO && o0OOOO0o.OooOOO.OooO00o(obj, this.f18556OooO00o[i])) {
                return i;
            }
            i = (int) j;
        }
        return -1;
    }

    public void OooO0o(int i, @NullableDecl K k, int i2, int i3) {
        this.f18560OooO0o[i] = (((long) i3) << 32) | 4294967295L;
        this.f18556OooO00o[i] = k;
        this.f18557OooO0O0[i] = i2;
    }

    public void OooO0o0() {
        int iOooO00o = o000O0Oo.OooO00o(3, 1.0f);
        int[] iArr = new int[iOooO00o];
        Arrays.fill(iArr, -1);
        this.f18561OooO0o0 = iArr;
        this.f18562OooO0oO = 1.0f;
        this.f18556OooO00o = new Object[3];
        this.f18557OooO0O0 = new int[3];
        long[] jArr = new long[3];
        Arrays.fill(jArr, -1L);
        this.f18560OooO0o = jArr;
        this.f18563OooO0oo = Math.max(1, (int) (iOooO00o * 1.0f));
    }

    public void OooO0oO(int i) {
        int i2 = this.f18558OooO0OO - 1;
        if (i >= i2) {
            this.f18556OooO00o[i] = null;
            this.f18557OooO0O0[i] = 0;
            this.f18560OooO0o[i] = -1;
            return;
        }
        Object[] objArr = this.f18556OooO00o;
        objArr[i] = objArr[i2];
        int[] iArr = this.f18557OooO0O0;
        iArr[i] = iArr[i2];
        objArr[i2] = null;
        iArr[i2] = 0;
        long[] jArr = this.f18560OooO0o;
        long j = jArr[i2];
        jArr[i] = j;
        jArr[i2] = -1;
        int[] iArr2 = this.f18561OooO0o0;
        int length = ((int) (j >>> 32)) & (iArr2.length - 1);
        int i3 = iArr2[length];
        if (i3 == i2) {
            iArr2[length] = i;
            return;
        }
        while (true) {
            long[] jArr2 = this.f18560OooO0o;
            long j2 = jArr2[i3];
            int i4 = (int) j2;
            if (i4 == i2) {
                jArr2[i3] = OooOOOO(j2, i);
                return;
            }
            i3 = i4;
        }
    }

    public int OooO0oo(int i) {
        int i2 = i + 1;
        if (i2 < this.f18558OooO0OO) {
            return i2;
        }
        return -1;
    }

    @CanIgnoreReturnValue
    public final int OooOO0(@NullableDecl K k, int i) {
        oo000o.OooO0OO(i, "count");
        long[] jArr = this.f18560OooO0o;
        Object[] objArr = this.f18556OooO00o;
        int[] iArr = this.f18557OooO0O0;
        int iOooO0OO = o000O0Oo.OooO0OO(k);
        int[] iArr2 = this.f18561OooO0o0;
        int length = (iArr2.length - 1) & iOooO0OO;
        int i2 = this.f18558OooO0OO;
        int i3 = iArr2[length];
        if (i3 == -1) {
            iArr2[length] = i2;
        } else {
            while (true) {
                long j = jArr[i3];
                if (((int) (j >>> 32)) == iOooO0OO && o0OOOO0o.OooOOO.OooO00o(k, objArr[i3])) {
                    int i4 = iArr[i3];
                    iArr[i3] = i;
                    return i4;
                }
                int i5 = (int) j;
                if (i5 == -1) {
                    jArr[i3] = OooOOOO(j, i2);
                    break;
                }
                i3 = i5;
            }
        }
        if (i2 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i6 = i2 + 1;
        int length2 = this.f18560OooO0o.length;
        if (i6 > length2) {
            int iMax = Math.max(1, length2 >>> 1) + length2;
            if (iMax < 0) {
                iMax = Integer.MAX_VALUE;
            }
            if (iMax != length2) {
                OooOOO0(iMax);
            }
        }
        OooO0o(i2, k, i, iOooO0OO);
        this.f18558OooO0OO = i6;
        if (i2 >= this.f18563OooO0oo) {
            int[] iArr3 = this.f18561OooO0o0;
            int length3 = iArr3.length * 2;
            if (iArr3.length >= 1073741824) {
                this.f18563OooO0oo = Integer.MAX_VALUE;
            } else {
                int i7 = ((int) (length3 * this.f18562OooO0oO)) + 1;
                int[] iArr4 = new int[length3];
                Arrays.fill(iArr4, -1);
                long[] jArr2 = this.f18560OooO0o;
                int i8 = length3 - 1;
                for (int i9 = 0; i9 < this.f18558OooO0OO; i9++) {
                    int i10 = (int) (jArr2[i9] >>> 32);
                    int i11 = i10 & i8;
                    int i12 = iArr4[i11];
                    iArr4[i11] = i9;
                    jArr2[i9] = (((long) i10) << 32) | (((long) i12) & 4294967295L);
                }
                this.f18563OooO0oo = i7;
                this.f18561OooO0o0 = iArr4;
            }
        }
        this.f18559OooO0Oo++;
        return 0;
    }

    public final int OooOO0O(@NullableDecl Object obj, int i) {
        int[] iArr = this.f18561OooO0o0;
        int length = (iArr.length - 1) & i;
        int i2 = iArr[length];
        if (i2 == -1) {
            return 0;
        }
        int i3 = -1;
        while (true) {
            if (((int) (this.f18560OooO0o[i2] >>> 32)) == i && o0OOOO0o.OooOOO.OooO00o(obj, this.f18556OooO00o[i2])) {
                int i4 = this.f18557OooO0O0[i2];
                if (i3 == -1) {
                    this.f18561OooO0o0[length] = (int) this.f18560OooO0o[i2];
                } else {
                    long[] jArr = this.f18560OooO0o;
                    jArr[i3] = OooOOOO(jArr[i3], (int) jArr[i2]);
                }
                OooO0oO(i2);
                this.f18558OooO0OO--;
                this.f18559OooO0Oo++;
                return i4;
            }
            int i5 = (int) this.f18560OooO0o[i2];
            if (i5 == -1) {
                return 0;
            }
            i3 = i2;
            i2 = i5;
        }
    }

    @CanIgnoreReturnValue
    public final int OooOO0o(int i) {
        return OooOO0O(this.f18556OooO00o[i], (int) (this.f18560OooO0o[i] >>> 32));
    }

    public final void OooOOO(int i, int i2) {
        o0OOOO0o.OooOOOO.OooO(i, this.f18558OooO0OO);
        this.f18557OooO0O0[i] = i2;
    }

    public void OooOOO0(int i) {
        this.f18556OooO00o = Arrays.copyOf(this.f18556OooO00o, i);
        this.f18557OooO0O0 = Arrays.copyOf(this.f18557OooO0O0, i);
        long[] jArr = this.f18560OooO0o;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(jArrCopyOf, length, i, -1L);
        }
        this.f18560OooO0o = jArrCopyOf;
    }

    public o00OOOOo(int i, float f) {
        OooO0o0();
    }
}

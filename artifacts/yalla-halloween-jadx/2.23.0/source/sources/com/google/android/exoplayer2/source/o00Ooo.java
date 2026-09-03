package com.google.android.exoplayer2.source;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface o00Ooo {

    public static class OooO00o implements o00Ooo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Random f13336OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int[] f13337OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int[] f13338OooO0OO;

        public OooO00o() {
            this(new Random());
        }

        @Override // com.google.android.exoplayer2.source.o00Ooo
        public final o00Ooo OooO00o(int i) {
            int i2 = i + 0;
            int[] iArr = this.f13337OooO0O0;
            int[] iArr2 = new int[iArr.length - i2];
            int i3 = 0;
            for (int i4 = 0; i4 < iArr.length; i4++) {
                int i5 = iArr[i4];
                if (i5 < 0 || i5 >= i) {
                    int i6 = i4 - i3;
                    if (i5 >= 0) {
                        i5 -= i2;
                    }
                    iArr2[i6] = i5;
                } else {
                    i3++;
                }
            }
            return new OooO00o(iArr2, new Random(this.f13336OooO00o.nextLong()));
        }

        @Override // com.google.android.exoplayer2.source.o00Ooo
        public final int OooO0O0(int i) {
            int i2 = this.f13338OooO0OO[i] - 1;
            if (i2 >= 0) {
                return this.f13337OooO0O0[i2];
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.o00Ooo
        public final int OooO0OO(int i) {
            int i2 = this.f13338OooO0OO[i] + 1;
            int[] iArr = this.f13337OooO0O0;
            if (i2 < iArr.length) {
                return iArr[i2];
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.o00Ooo
        public final int OooO0Oo() {
            int[] iArr = this.f13337OooO0O0;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.o00Ooo
        public final int OooO0o() {
            int[] iArr = this.f13337OooO0O0;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.o00Ooo
        public final o00Ooo OooO0o0() {
            return new OooO00o(new Random(this.f13336OooO00o.nextLong()));
        }

        @Override // com.google.android.exoplayer2.source.o00Ooo
        public final o00Ooo OooO0oO(int i) {
            Random random;
            int[] iArr;
            int[] iArr2 = new int[i];
            int[] iArr3 = new int[i];
            int i2 = 0;
            while (true) {
                random = this.f13336OooO00o;
                iArr = this.f13337OooO0O0;
                if (i2 >= i) {
                    break;
                }
                iArr2[i2] = random.nextInt(iArr.length + 1);
                int i3 = i2 + 1;
                int iNextInt = random.nextInt(i3);
                iArr3[i2] = iArr3[iNextInt];
                iArr3[iNextInt] = i2 + 0;
                i2 = i3;
            }
            Arrays.sort(iArr2);
            int[] iArr4 = new int[iArr.length + i];
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < iArr.length + i; i6++) {
                if (i4 >= i || i5 != iArr2[i4]) {
                    int i7 = i5 + 1;
                    int i8 = iArr[i5];
                    iArr4[i6] = i8;
                    if (i8 >= 0) {
                        iArr4[i6] = i8 + i;
                    }
                    i5 = i7;
                } else {
                    iArr4[i6] = iArr3[i4];
                    i4++;
                }
            }
            return new OooO00o(iArr4, new Random(random.nextLong()));
        }

        @Override // com.google.android.exoplayer2.source.o00Ooo
        public final int getLength() {
            return this.f13337OooO0O0.length;
        }

        public OooO00o(Random random) {
            this(new int[0], random);
        }

        public OooO00o(int[] iArr, Random random) {
            this.f13337OooO0O0 = iArr;
            this.f13336OooO00o = random;
            this.f13338OooO0OO = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.f13338OooO0OO[iArr[i]] = i;
            }
        }
    }

    public static final class OooO0O0 implements o00Ooo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f13339OooO00o;

        public OooO0O0(int i) {
            this.f13339OooO00o = i;
        }

        @Override // com.google.android.exoplayer2.source.o00Ooo
        public final o00Ooo OooO00o(int i) {
            return new OooO0O0((this.f13339OooO00o - i) + 0);
        }

        @Override // com.google.android.exoplayer2.source.o00Ooo
        public final int OooO0O0(int i) {
            int i2 = i - 1;
            if (i2 >= 0) {
                return i2;
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.o00Ooo
        public final int OooO0OO(int i) {
            int i2 = i + 1;
            if (i2 < this.f13339OooO00o) {
                return i2;
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.o00Ooo
        public final int OooO0Oo() {
            int i = this.f13339OooO00o;
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.source.o00Ooo
        public final int OooO0o() {
            return this.f13339OooO00o > 0 ? 0 : -1;
        }

        @Override // com.google.android.exoplayer2.source.o00Ooo
        public final o00Ooo OooO0o0() {
            return new OooO0O0(0);
        }

        @Override // com.google.android.exoplayer2.source.o00Ooo
        public final o00Ooo OooO0oO(int i) {
            return new OooO0O0(this.f13339OooO00o + i);
        }

        @Override // com.google.android.exoplayer2.source.o00Ooo
        public final int getLength() {
            return this.f13339OooO00o;
        }
    }

    o00Ooo OooO00o(int i);

    int OooO0O0(int i);

    int OooO0OO(int i);

    int OooO0Oo();

    int OooO0o();

    o00Ooo OooO0o0();

    o00Ooo OooO0oO(int i);

    int getLength();
}

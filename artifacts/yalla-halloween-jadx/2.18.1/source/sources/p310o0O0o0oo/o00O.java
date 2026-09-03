package p310o0O0o0oo;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public interface o00O {

    public static class OooO00o implements o00O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Random f36297OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int[] f36298OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int[] f36299OooO0OO;

        public OooO00o(Random random) {
            this(new int[0], random);
        }

        @Override // p310o0O0o0oo.o00O
        public final int OooO00o() {
            return this.f36298OooO0O0.length;
        }

        @Override // p310o0O0o0oo.o00O
        public final int OooO0O0() {
            int[] iArr = this.f36298OooO0O0;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // p310o0O0o0oo.o00O
        public final o00O OooO0OO(int i) {
            int i2 = i + 0;
            int[] iArr = new int[this.f36298OooO0O0.length - i2];
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int[] iArr2 = this.f36298OooO0O0;
                if (i3 >= iArr2.length) {
                    return new OooO00o(iArr, new Random(this.f36297OooO00o.nextLong()));
                }
                if (iArr2[i3] < 0 || iArr2[i3] >= i) {
                    iArr[i3 - i4] = iArr2[i3] >= 0 ? iArr2[i3] - i2 : iArr2[i3];
                } else {
                    i4++;
                }
                i3++;
            }
        }

        @Override // p310o0O0o0oo.o00O
        public final int OooO0Oo(int i) {
            int i2 = this.f36299OooO0OO[i] - 1;
            if (i2 >= 0) {
                return this.f36298OooO0O0[i2];
            }
            return -1;
        }

        @Override // p310o0O0o0oo.o00O
        public final o00O OooO0o(int i) {
            int[] iArr = new int[i];
            int[] iArr2 = new int[i];
            int i2 = 0;
            int i3 = 0;
            while (i3 < i) {
                iArr[i3] = this.f36297OooO00o.nextInt(this.f36298OooO0O0.length + 1);
                int i4 = i3 + 1;
                int iNextInt = this.f36297OooO00o.nextInt(i4);
                iArr2[i3] = iArr2[iNextInt];
                iArr2[iNextInt] = i3 + 0;
                i3 = i4;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f36298OooO0O0.length + i];
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int[] iArr4 = this.f36298OooO0O0;
                if (i2 >= iArr4.length + i) {
                    return new OooO00o(iArr3, new Random(this.f36297OooO00o.nextLong()));
                }
                if (i5 >= i || i6 != iArr[i5]) {
                    int i7 = i6 + 1;
                    iArr3[i2] = iArr4[i6];
                    if (iArr3[i2] >= 0) {
                        iArr3[i2] = iArr3[i2] + i;
                    }
                    i6 = i7;
                } else {
                    iArr3[i2] = iArr2[i5];
                    i5++;
                }
                i2++;
            }
        }

        @Override // p310o0O0o0oo.o00O
        public final int OooO0o0(int i) {
            int i2 = this.f36299OooO0OO[i] + 1;
            int[] iArr = this.f36298OooO0O0;
            if (i2 < iArr.length) {
                return iArr[i2];
            }
            return -1;
        }

        @Override // p310o0O0o0oo.o00O
        public final int OooO0oO() {
            int[] iArr = this.f36298OooO0O0;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // p310o0O0o0oo.o00O
        public final o00O OooO0oo() {
            return new OooO00o(new Random(this.f36297OooO00o.nextLong()));
        }

        public OooO00o(int[] iArr, Random random) {
            this.f36298OooO0O0 = iArr;
            this.f36297OooO00o = random;
            this.f36299OooO0OO = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.f36299OooO0OO[iArr[i]] = i;
            }
        }
    }

    public static final class OooO0O0 implements o00O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f36300OooO00o;

        public OooO0O0(int i) {
            this.f36300OooO00o = i;
        }

        @Override // p310o0O0o0oo.o00O
        public final int OooO00o() {
            return this.f36300OooO00o;
        }

        @Override // p310o0O0o0oo.o00O
        public final int OooO0O0() {
            return this.f36300OooO00o > 0 ? 0 : -1;
        }

        @Override // p310o0O0o0oo.o00O
        public final o00O OooO0OO(int i) {
            return new OooO0O0((this.f36300OooO00o - i) + 0);
        }

        @Override // p310o0O0o0oo.o00O
        public final int OooO0Oo(int i) {
            int i2 = i - 1;
            if (i2 >= 0) {
                return i2;
            }
            return -1;
        }

        @Override // p310o0O0o0oo.o00O
        public final o00O OooO0o(int i) {
            return new OooO0O0(this.f36300OooO00o + i);
        }

        @Override // p310o0O0o0oo.o00O
        public final int OooO0o0(int i) {
            int i2 = i + 1;
            if (i2 < this.f36300OooO00o) {
                return i2;
            }
            return -1;
        }

        @Override // p310o0O0o0oo.o00O
        public final int OooO0oO() {
            int i = this.f36300OooO00o;
            if (i > 0) {
                return i - 1;
            }
            return -1;
        }

        @Override // p310o0O0o0oo.o00O
        public final o00O OooO0oo() {
            return new OooO0O0(0);
        }
    }

    int OooO00o();

    int OooO0O0();

    o00O OooO0OO(int i);

    int OooO0Oo(int i);

    o00O OooO0o(int i);

    int OooO0o0(int i);

    int OooO0oO();

    o00O OooO0oo();
}

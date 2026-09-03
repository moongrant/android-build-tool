package p696oO0OO0oo;

import java.math.BigInteger;
import java.util.Random;
import p399o0Oo00oo.o00000OO;
import p697oO0OOo0o.Oooo000;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OooOOO0 implements OooOO0 {

    public static class OooO00o extends OooOOO0 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f52775OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int[] f52776OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f52777OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public OooOo f52778OooO0oO;

        public OooO00o(int i, int i2, int i3, int i4, BigInteger bigInteger) {
            if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > i) {
                throw new IllegalArgumentException("x value invalid in F2m field element");
            }
            if (i3 == 0 && i4 == 0) {
                this.f52775OooO0Oo = 2;
                this.f52776OooO0o = new int[]{i2};
            } else {
                if (i3 >= i4) {
                    throw new IllegalArgumentException("k2 must be smaller than k3");
                }
                if (i3 <= 0) {
                    throw new IllegalArgumentException("k2 must be larger than 0");
                }
                this.f52775OooO0Oo = 3;
                this.f52776OooO0o = new int[]{i2, i3, i4};
            }
            this.f52777OooO0o0 = i;
            this.f52778OooO0oO = new OooOo(bigInteger);
        }

        public OooO00o(int i, int[] iArr, OooOo oooOo) {
            this.f52777OooO0o0 = i;
            this.f52775OooO0Oo = iArr.length == 1 ? 2 : 3;
            this.f52776OooO0o = iArr;
            this.f52778OooO0oO = oooOo;
        }

        public static void OooOo00(OooOOO0 oooOOO0, OooOOO0 oooOOO1) {
            if (!(oooOOO0 instanceof OooO00o) || !(oooOOO1 instanceof OooO00o)) {
                throw new IllegalArgumentException("Field elements are not both instances of ECFieldElement.F2m");
            }
            OooO00o oooO00o = (OooO00o) oooOOO0;
            OooO00o oooO00o2 = (OooO00o) oooOOO1;
            if (oooO00o.f52775OooO0Oo != oooO00o2.f52775OooO0Oo) {
                throw new IllegalArgumentException("One of the F2m field elements has incorrect representation");
            }
            if (oooO00o.f52777OooO0o0 != oooO00o2.f52777OooO0o0 || !oO000Oo.OooO00o.OooO0O0(oooO00o.f52776OooO0o, oooO00o2.f52776OooO0o)) {
                throw new IllegalArgumentException("Field elements are not elements of the same field F2m");
            }
        }

        @Override // p696oO0OO0oo.OooOOO0
        public final boolean OooO() {
            return this.f52778OooO0oO.OooOOo();
        }

        @Override // p696oO0OO0oo.OooOOO0
        public final OooOOO0 OooO00o(OooOOO0 oooOOO0) {
            OooOo oooOo = (OooOo) this.f52778OooO0oO.clone();
            oooOo.OooO0o(((OooO00o) oooOOO0).f52778OooO0oO);
            return new OooO00o(this.f52777OooO0o0, this.f52776OooO0o, oooOo);
        }

        @Override // p696oO0OO0oo.OooOOO0
        public final OooOOO0 OooO0O0() {
            OooOo oooOo;
            int i = this.f52777OooO0o0;
            int[] iArr = this.f52776OooO0o;
            OooOo oooOo2 = this.f52778OooO0oO;
            if (oooOo2.f52784Oooo0o.length == 0) {
                oooOo = new OooOo(new long[]{1});
            } else {
                int iMax = Math.max(1, oooOo2.OooOOOO());
                long[] jArr = new long[iMax];
                long[] jArr2 = oooOo2.f52784Oooo0o;
                System.arraycopy(jArr2, 0, jArr, 0, Math.min(jArr2.length, iMax));
                jArr[0] = jArr[0] ^ 1;
                oooOo = new OooOo(jArr);
            }
            return new OooO00o(i, iArr, oooOo);
        }

        @Override // p696oO0OO0oo.OooOOO0
        public final int OooO0OO() {
            return this.f52778OooO0oO.OooOO0();
        }

        @Override // p696oO0OO0oo.OooOOO0
        public final OooOOO0 OooO0Oo(OooOOO0 oooOOO0) {
            return OooOO0(oooOOO0.OooO0oO());
        }

        @Override // p696oO0OO0oo.OooOOO0
        public final int OooO0o() {
            return this.f52777OooO0o0;
        }

        @Override // p696oO0OO0oo.OooOOO0
        public final OooOOO0 OooO0oO() {
            int i;
            int i2 = this.f52777OooO0o0;
            int[] iArr = this.f52776OooO0o;
            OooOo oooOo = this.f52778OooO0oO;
            int iOooOO0 = oooOo.OooOO0();
            if (iOooOO0 == 0) {
                throw new IllegalStateException();
            }
            int i3 = 1;
            if (iOooOO0 != 1) {
                OooOo oooOo2 = (OooOo) oooOo.clone();
                int i4 = (i2 + 63) >>> 6;
                OooOo oooOo3 = new OooOo(i4);
                long[] jArr = oooOo3.f52784Oooo0o;
                OooOo.OooOO0o(jArr, i2);
                int i5 = i2 - i2;
                int length = iArr.length;
                while (true) {
                    length--;
                    if (length < 0) {
                        break;
                    }
                    OooOo.OooOO0o(jArr, iArr[length] + i5);
                }
                OooOo.OooOO0o(jArr, i5);
                OooOo oooOo4 = new OooOo(i4);
                oooOo4.f52784Oooo0o[0] = 1;
                OooOo oooOo5 = new OooOo(i4);
                int[] iArr2 = new int[2];
                iArr2[0] = iOooOO0;
                iArr2[1] = i2 + 1;
                OooOo[] oooOoArr = {oooOo2, oooOo3};
                int[] iArr3 = {1, 0};
                OooOo[] oooOoArr2 = {oooOo4, oooOo5};
                int i6 = iArr2[1];
                int iOooOO0O = iArr3[1];
                int i7 = i6 - iArr2[0];
                while (true) {
                    if (i7 < 0) {
                        i7 = -i7;
                        iArr2[i3] = i6;
                        iArr3[i3] = iOooOO0O;
                        i3 = 1 - i3;
                        i6 = iArr2[i3];
                        iOooOO0O = iArr3[i3];
                    }
                    i = 1 - i3;
                    oooOoArr[i3].OooO0o0(oooOoArr[i], iArr2[i], i7);
                    int iOooOO0O2 = oooOoArr[i3].OooOO0O(i6);
                    if (iOooOO0O2 == 0) {
                        break;
                    }
                    int i8 = iArr3[i];
                    oooOoArr2[i3].OooO0o0(oooOoArr2[i], i8, i7);
                    int i9 = i8 + i7;
                    if (i9 > iOooOO0O) {
                        iOooOO0O = i9;
                    } else if (i9 == iOooOO0O) {
                        iOooOO0O = oooOoArr2[i3].OooOO0O(iOooOO0O);
                    }
                    i7 += iOooOO0O2 - i6;
                    i6 = iOooOO0O2;
                }
                oooOo = oooOoArr2[i];
            }
            return new OooO00o(i2, iArr, oooOo);
        }

        @Override // p696oO0OO0oo.OooOOO0
        public final boolean OooO0oo() {
            return this.f52778OooO0oO.OooOOo0();
        }

        @Override // p696oO0OO0oo.OooOOO0
        public final OooOOO0 OooOO0(OooOOO0 oooOOO0) {
            int i;
            long[] jArr;
            int i2 = this.f52777OooO0o0;
            int[] iArr = this.f52776OooO0o;
            OooOo oooOo = this.f52778OooO0oO;
            OooOo oooOo2 = ((OooO00o) oooOOO0).f52778OooO0oO;
            int iOooOO0 = oooOo.OooOO0();
            if (iOooOO0 != 0) {
                int iOooOO1 = oooOo2.OooOO0();
                if (iOooOO1 != 0) {
                    if (iOooOO0 > iOooOO1) {
                        iOooOO1 = iOooOO0;
                        iOooOO0 = iOooOO1;
                    } else {
                        oooOo2 = oooOo;
                        oooOo = oooOo2;
                    }
                    int i3 = (iOooOO0 + 63) >>> 6;
                    int i4 = (iOooOO1 + 63) >>> 6;
                    int i5 = ((iOooOO0 + iOooOO1) + 62) >>> 6;
                    if (i3 == 1) {
                        long j = oooOo2.f52784Oooo0o[0];
                        if (j != 1) {
                            long[] jArr2 = new long[i5];
                            OooOo.OooOo00(j, oooOo.f52784Oooo0o, i4, jArr2);
                            oooOo = new OooOo(jArr2, OooOo.OooOo0(jArr2, i5, i2, iArr));
                        }
                    } else {
                        int i6 = ((iOooOO1 + 7) + 63) >>> 6;
                        int[] iArr2 = new int[16];
                        int i7 = i6 << 4;
                        long[] jArr3 = new long[i7];
                        iArr2[1] = i6;
                        System.arraycopy(oooOo.f52784Oooo0o, 0, jArr3, i6, i4);
                        int i8 = 2;
                        int i9 = i6;
                        for (int i10 = 16; i8 < i10; i10 = 16) {
                            i9 += i6;
                            iArr2[i8] = i9;
                            if ((i8 & 1) == 0) {
                                jArr = jArr3;
                                OooOo.OooOo0O(jArr3, i9 >>> 1, jArr, i9, i6, 1);
                            } else {
                                jArr = jArr3;
                                int i11 = i9 - i6;
                                for (int i12 = 0; i12 < i6; i12++) {
                                    jArr[i9 + i12] = jArr[i6 + i12] ^ jArr[i11 + i12];
                                }
                            }
                            i8++;
                            i7 = i7;
                            iArr2 = iArr2;
                            jArr3 = jArr;
                        }
                        long[] jArr4 = jArr3;
                        int i13 = i7;
                        int[] iArr3 = iArr2;
                        long[] jArr5 = new long[i13];
                        OooOo.OooOo0O(jArr4, 0, jArr5, 0, i13, 4);
                        long[] jArr6 = oooOo2.f52784Oooo0o;
                        int i14 = i5 << 3;
                        long[] jArr7 = new long[i14];
                        int i15 = 0;
                        while (i15 < i3) {
                            long j2 = jArr6[i15];
                            int i16 = i15;
                            while (true) {
                                int i17 = ((int) j2) & 15;
                                long j3 = j2 >>> 4;
                                i = i15;
                                OooOo.OooO0Oo(jArr7, i16, jArr4, iArr3[i17], jArr5, iArr3[((int) j3) & 15], i6);
                                j2 = j3 >>> 4;
                                if (j2 == 0) {
                                    break;
                                }
                                i16 += i5;
                                i15 = i;
                            }
                            i15 = i + 1;
                        }
                        while (true) {
                            i14 -= i5;
                            if (i14 == 0) {
                                break;
                            }
                            OooOo.OooO0oO(jArr7, i14 - i5, jArr7, i14, i5, 8);
                        }
                        oooOo2 = new OooOo(jArr7, OooOo.OooOo0(jArr7, i5, i2, iArr));
                        oooOo = oooOo2;
                    }
                } else {
                    oooOo = oooOo2;
                }
            }
            return new OooO00o(i2, iArr, oooOo);
        }

        @Override // p696oO0OO0oo.OooOOO0
        public final OooOOO0 OooOO0O(OooOOO0 oooOOO0, OooOOO0 oooOOO1, OooOOO0 oooOOO2) {
            return OooOO0o(oooOOO0, oooOOO1, oooOOO2);
        }

        @Override // p696oO0OO0oo.OooOOO0
        public final OooOOO0 OooOO0o(OooOOO0 oooOOO0, OooOOO0 oooOOO1, OooOOO0 oooOOO2) {
            OooOo oooOo = this.f52778OooO0oO;
            OooOo oooOo2 = ((OooO00o) oooOOO0).f52778OooO0oO;
            OooOo oooOo3 = ((OooO00o) oooOOO1).f52778OooO0oO;
            OooOo oooOo4 = ((OooO00o) oooOOO2).f52778OooO0oO;
            OooOo oooOoOooOOoo = oooOo.OooOOoo(oooOo2);
            OooOo oooOoOooOOoo2 = oooOo3.OooOOoo(oooOo4);
            if (oooOoOooOOoo == oooOo || oooOoOooOOoo == oooOo2) {
                oooOoOooOOoo = (OooOo) oooOoOooOOoo.clone();
            }
            oooOoOooOOoo.OooO0o(oooOoOooOOoo2);
            int i = this.f52777OooO0o0;
            int[] iArr = this.f52776OooO0o;
            long[] jArr = oooOoOooOOoo.f52784Oooo0o;
            int iOooOo0 = OooOo.OooOo0(jArr, jArr.length, i, iArr);
            if (iOooOo0 < jArr.length) {
                long[] jArr2 = new long[iOooOo0];
                oooOoOooOOoo.f52784Oooo0o = jArr2;
                System.arraycopy(jArr, 0, jArr2, 0, iOooOo0);
            }
            return new OooO00o(this.f52777OooO0o0, this.f52776OooO0o, oooOoOooOOoo);
        }

        @Override // p696oO0OO0oo.OooOOO0
        public final OooOOO0 OooOOO() {
            int i;
            if (this.f52778OooO0oO.OooOOo() || this.f52778OooO0oO.OooOOo0() || (i = (i = this.f52777OooO0o0) - 1) < 1) {
                return this;
            }
            int[] iArr = this.f52776OooO0o;
            OooOo oooOo = this.f52778OooO0oO;
            int iOooOOOO = oooOo.OooOOOO();
            if (iOooOOOO != 0) {
                int i2 = ((i + 63) >>> 6) << 1;
                long[] jArr = new long[i2];
                System.arraycopy(oooOo.f52784Oooo0o, 0, jArr, 0, iOooOOOO);
                while (true) {
                    int i3 = i3 - 1;
                    if (i3 < 0) {
                        break;
                    }
                    int i4 = iOooOOOO << 1;
                    while (true) {
                        iOooOOOO--;
                        if (iOooOOOO >= 0) {
                            long j = jArr[iOooOOOO];
                            int i5 = i4 - 1;
                            jArr[i5] = OooOo.OooOOOo((int) (j >>> 32));
                            i4 = i5 - 1;
                            jArr[i4] = OooOo.OooOOOo((int) j);
                        }
                    }
                    iOooOOOO = OooOo.OooOo0(jArr, i2, i, iArr);
                }
                oooOo = new OooOo(jArr, iOooOOOO);
            }
            return new OooO00o(i, iArr, oooOo);
        }

        @Override // p696oO0OO0oo.OooOOO0
        public final OooOOO0 OooOOO0() {
            return this;
        }

        @Override // p696oO0OO0oo.OooOOO0
        public final OooOOO0 OooOOOO() {
            int i = this.f52777OooO0o0;
            int[] iArr = this.f52776OooO0o;
            OooOo oooOo = this.f52778OooO0oO;
            int iOooOOOO = oooOo.OooOOOO();
            if (iOooOOOO != 0) {
                int i2 = iOooOOOO << 1;
                long[] jArr = new long[i2];
                int i3 = 0;
                while (i3 < i2) {
                    long j = oooOo.f52784Oooo0o[i3 >>> 1];
                    int i4 = i3 + 1;
                    jArr[i3] = OooOo.OooOOOo((int) j);
                    i3 = i4 + 1;
                    jArr[i4] = OooOo.OooOOOo((int) (j >>> 32));
                }
                oooOo = new OooOo(jArr, OooOo.OooOo0(jArr, i2, i, iArr));
            }
            return new OooO00o(i, iArr, oooOo);
        }

        @Override // p696oO0OO0oo.OooOOO0
        public final OooOOO0 OooOOOo(OooOOO0 oooOOO0, OooOOO0 oooOOO1) {
            OooOo oooOo;
            OooOo oooOo2 = this.f52778OooO0oO;
            OooOo oooOo3 = ((OooO00o) oooOOO0).f52778OooO0oO;
            OooOo oooOo4 = ((OooO00o) oooOOO1).f52778OooO0oO;
            int iOooOOOO = oooOo2.OooOOOO();
            if (iOooOOOO == 0) {
                oooOo = oooOo2;
            } else {
                int i = iOooOOOO << 1;
                long[] jArr = new long[i];
                int i2 = 0;
                while (i2 < i) {
                    long j = oooOo2.f52784Oooo0o[i2 >>> 1];
                    int i3 = i2 + 1;
                    jArr[i2] = OooOo.OooOOOo((int) j);
                    i2 = i3 + 1;
                    jArr[i3] = OooOo.OooOOOo((int) (j >>> 32));
                }
                oooOo = new OooOo(jArr, i);
            }
            OooOo oooOoOooOOoo = oooOo3.OooOOoo(oooOo4);
            if (oooOo == oooOo2) {
                oooOo = (OooOo) oooOo.clone();
            }
            oooOo.OooO0o(oooOoOooOOoo);
            int i4 = this.f52777OooO0o0;
            int[] iArr = this.f52776OooO0o;
            long[] jArr2 = oooOo.f52784Oooo0o;
            int iOooOo0 = OooOo.OooOo0(jArr2, jArr2.length, i4, iArr);
            if (iOooOo0 < jArr2.length) {
                long[] jArr3 = new long[iOooOo0];
                oooOo.f52784Oooo0o = jArr3;
                System.arraycopy(jArr2, 0, jArr3, 0, iOooOo0);
            }
            return new OooO00o(this.f52777OooO0o0, this.f52776OooO0o, oooOo);
        }

        @Override // p696oO0OO0oo.OooOOO0
        public final boolean OooOOo() {
            long[] jArr = this.f52778OooO0oO.f52784Oooo0o;
            return jArr.length > 0 && (1 & jArr[0]) != 0;
        }

        @Override // p696oO0OO0oo.OooOOO0
        public final OooOOO0 OooOOo0(OooOOO0 oooOOO0) {
            return OooO00o(oooOOO0);
        }

        @Override // p696oO0OO0oo.OooOOO0
        public final BigInteger OooOOoo() {
            OooOo oooOo = this.f52778OooO0oO;
            int iOooOOOO = oooOo.OooOOOO();
            if (iOooOOOO == 0) {
                return OooOO0.f52756OooO00o;
            }
            int i = iOooOOOO - 1;
            long j = oooOo.f52784Oooo0o[i];
            byte[] bArr = new byte[8];
            int i2 = 0;
            boolean z = false;
            for (int i3 = 7; i3 >= 0; i3--) {
                byte b = (byte) (j >>> (i3 * 8));
                if (z || b != 0) {
                    bArr[i2] = b;
                    i2++;
                    z = true;
                }
            }
            byte[] bArr2 = new byte[(i * 8) + i2];
            for (int i4 = 0; i4 < i2; i4++) {
                bArr2[i4] = bArr[i4];
            }
            for (int i5 = iOooOOOO - 2; i5 >= 0; i5--) {
                long j2 = oooOo.f52784Oooo0o[i5];
                int i6 = 7;
                while (i6 >= 0) {
                    bArr2[i2] = (byte) (j2 >>> (i6 * 8));
                    i6--;
                    i2++;
                }
            }
            return new BigInteger(1, bArr2);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f52777OooO0o0 == oooO00o.f52777OooO0o0 && this.f52775OooO0Oo == oooO00o.f52775OooO0Oo && oO000Oo.OooO00o.OooO0O0(this.f52776OooO0o, oooO00o.f52776OooO0o) && this.f52778OooO0oO.equals(oooO00o.f52778OooO0oO);
        }

        public final int hashCode() {
            return (this.f52778OooO0oO.hashCode() ^ this.f52777OooO0o0) ^ oO000Oo.OooO00o.OooO0oo(this.f52776OooO0o);
        }
    }

    public static class OooO0O0 extends OooOOO0 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public BigInteger f52779OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public BigInteger f52780OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public BigInteger f52781OooO0o0;

        public OooO0O0(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            if (bigInteger3 == null || bigInteger3.signum() < 0 || bigInteger3.compareTo(bigInteger) >= 0) {
                throw new IllegalArgumentException("x value invalid in Fp field element");
            }
            this.f52779OooO0Oo = bigInteger;
            this.f52781OooO0o0 = bigInteger2;
            this.f52780OooO0o = bigInteger3;
        }

        public static BigInteger OooOo00(BigInteger bigInteger) {
            int iBitLength = bigInteger.bitLength();
            if (iBitLength < 96 || bigInteger.shiftRight(iBitLength - 64).longValue() != -1) {
                return null;
            }
            return OooOO0.f52757OooO0O0.shiftLeft(iBitLength).subtract(bigInteger);
        }

        @Override // p696oO0OO0oo.OooOOO0
        public final OooOOO0 OooO00o(OooOOO0 oooOOO0) {
            BigInteger bigInteger = this.f52779OooO0Oo;
            BigInteger bigInteger2 = this.f52781OooO0o0;
            BigInteger bigIntegerAdd = this.f52780OooO0o.add(oooOOO0.OooOOoo());
            if (bigIntegerAdd.compareTo(this.f52779OooO0Oo) >= 0) {
                bigIntegerAdd = bigIntegerAdd.subtract(this.f52779OooO0Oo);
            }
            return new OooO0O0(bigInteger, bigInteger2, bigIntegerAdd);
        }

        @Override // p696oO0OO0oo.OooOOO0
        public final OooOOO0 OooO0O0() {
            BigInteger bigIntegerAdd = this.f52780OooO0o.add(OooOO0.f52757OooO0O0);
            if (bigIntegerAdd.compareTo(this.f52779OooO0Oo) == 0) {
                bigIntegerAdd = OooOO0.f52756OooO00o;
            }
            return new OooO0O0(this.f52779OooO0Oo, this.f52781OooO0o0, bigIntegerAdd);
        }

        @Override // p696oO0OO0oo.OooOOO0
        public final OooOOO0 OooO0Oo(OooOOO0 oooOOO0) {
            return new OooO0O0(this.f52779OooO0Oo, this.f52781OooO0o0, OooOo0o(this.f52780OooO0o, OooOo0O(oooOOO0.OooOOoo())));
        }

        @Override // p696oO0OO0oo.OooOOO0
        public final int OooO0o() {
            return this.f52779OooO0Oo.bitLength();
        }

        @Override // p696oO0OO0oo.OooOOO0
        public final OooOOO0 OooO0oO() {
            return new OooO0O0(this.f52779OooO0Oo, this.f52781OooO0o0, OooOo0O(this.f52780OooO0o));
        }

        @Override // p696oO0OO0oo.OooOOO0
        public final OooOOO0 OooOO0(OooOOO0 oooOOO0) {
            return new OooO0O0(this.f52779OooO0Oo, this.f52781OooO0o0, OooOo0o(this.f52780OooO0o, oooOOO0.OooOOoo()));
        }

        @Override // p696oO0OO0oo.OooOOO0
        public final OooOOO0 OooOO0O(OooOOO0 oooOOO0, OooOOO0 oooOOO1, OooOOO0 oooOOO2) {
            BigInteger bigInteger = this.f52780OooO0o;
            BigInteger bigIntegerOooOOoo = oooOOO0.OooOOoo();
            BigInteger bigIntegerOooOOoo2 = oooOOO1.OooOOoo();
            BigInteger bigIntegerOooOOoo3 = oooOOO2.OooOOoo();
            return new OooO0O0(this.f52779OooO0Oo, this.f52781OooO0o0, OooOo(bigInteger.multiply(bigIntegerOooOOoo).subtract(bigIntegerOooOOoo2.multiply(bigIntegerOooOOoo3))));
        }

        @Override // p696oO0OO0oo.OooOOO0
        public final OooOOO0 OooOO0o(OooOOO0 oooOOO0, OooOOO0 oooOOO1, OooOOO0 oooOOO2) {
            BigInteger bigInteger = this.f52780OooO0o;
            BigInteger bigIntegerOooOOoo = oooOOO0.OooOOoo();
            BigInteger bigIntegerOooOOoo2 = oooOOO1.OooOOoo();
            BigInteger bigIntegerOooOOoo3 = oooOOO2.OooOOoo();
            return new OooO0O0(this.f52779OooO0Oo, this.f52781OooO0o0, OooOo(bigInteger.multiply(bigIntegerOooOOoo).add(bigIntegerOooOOoo2.multiply(bigIntegerOooOOoo3))));
        }

        @Override // p696oO0OO0oo.OooOOO0
        public final OooOOO0 OooOOO() {
            BigInteger bigInteger;
            Object obj;
            if (OooO() || OooO0oo()) {
                return this;
            }
            if (!this.f52779OooO0Oo.testBit(0)) {
                throw new RuntimeException("not done yet");
            }
            int i = 1;
            if (this.f52779OooO0Oo.testBit(1)) {
                BigInteger bigIntegerAdd = this.f52779OooO0Oo.shiftRight(2).add(OooOO0.f52757OooO0O0);
                BigInteger bigInteger2 = this.f52779OooO0Oo;
                return OooOo0(new OooO0O0(bigInteger2, this.f52781OooO0o0, this.f52780OooO0o.modPow(bigIntegerAdd, bigInteger2)));
            }
            if (this.f52779OooO0Oo.testBit(2)) {
                BigInteger bigIntegerModPow = this.f52780OooO0o.modPow(this.f52779OooO0Oo.shiftRight(3), this.f52779OooO0Oo);
                BigInteger bigIntegerOooOo0o = OooOo0o(bigIntegerModPow, this.f52780OooO0o);
                return OooOo0o(bigIntegerOooOo0o, bigIntegerModPow).equals(OooOO0.f52757OooO0O0) ? OooOo0(new OooO0O0(this.f52779OooO0Oo, this.f52781OooO0o0, bigIntegerOooOo0o)) : OooOo0(new OooO0O0(this.f52779OooO0Oo, this.f52781OooO0o0, OooOo(bigIntegerOooOo0o.multiply(OooOO0.f52758OooO0OO.modPow(this.f52779OooO0Oo.shiftRight(2), this.f52779OooO0Oo)))));
            }
            BigInteger bigIntegerShiftRight = this.f52779OooO0Oo.shiftRight(1);
            BigInteger bigIntegerModPow2 = this.f52780OooO0o.modPow(bigIntegerShiftRight, this.f52779OooO0Oo);
            BigInteger bigInteger3 = OooOO0.f52757OooO0O0;
            Object obj2 = null;
            if (!bigIntegerModPow2.equals(bigInteger3)) {
                return null;
            }
            BigInteger bigInteger4 = this.f52780OooO0o;
            BigInteger bigIntegerShiftLeft = bigInteger4.shiftLeft(1);
            if (bigIntegerShiftLeft.compareTo(this.f52779OooO0Oo) >= 0) {
                bigIntegerShiftLeft = bigIntegerShiftLeft.subtract(this.f52779OooO0Oo);
            }
            BigInteger bigIntegerShiftLeft2 = bigIntegerShiftLeft.shiftLeft(1);
            if (bigIntegerShiftLeft2.compareTo(this.f52779OooO0Oo) >= 0) {
                bigIntegerShiftLeft2 = bigIntegerShiftLeft2.subtract(this.f52779OooO0Oo);
            }
            BigInteger bigIntegerAdd2 = bigIntegerShiftRight.add(bigInteger3);
            BigInteger bigIntegerSubtract = this.f52779OooO0Oo.subtract(bigInteger3);
            Random random = new Random();
            while (true) {
                BigInteger bigInteger5 = new BigInteger(this.f52779OooO0Oo.bitLength(), random);
                if (bigInteger5.compareTo(this.f52779OooO0Oo) >= 0 || !OooOo(bigInteger5.multiply(bigInteger5).subtract(bigIntegerShiftLeft2)).modPow(bigIntegerShiftRight, this.f52779OooO0Oo).equals(bigIntegerSubtract)) {
                    bigInteger = bigIntegerShiftRight;
                    obj = obj2;
                } else {
                    int iBitLength = bigIntegerAdd2.bitLength();
                    int lowestSetBit = bigIntegerAdd2.getLowestSetBit();
                    BigInteger bigIntegerOooOo0o2 = OooOO0.f52757OooO0O0;
                    int i2 = iBitLength - i;
                    BigInteger bigIntegerOooOo = bigInteger5;
                    BigInteger bigIntegerOooOo0o3 = bigIntegerOooOo0o2;
                    BigInteger bigIntegerOooOo2 = OooOO0.f52758OooO0OO;
                    BigInteger bigInteger6 = bigIntegerOooOo0o3;
                    while (i2 >= lowestSetBit + 1) {
                        bigIntegerOooOo0o2 = OooOo0o(bigIntegerOooOo0o2, bigInteger6);
                        if (bigIntegerAdd2.testBit(i2)) {
                            BigInteger bigIntegerOooOo0o4 = OooOo0o(bigIntegerOooOo0o2, bigInteger4);
                            bigIntegerOooOo0o3 = OooOo0o(bigIntegerOooOo0o3, bigIntegerOooOo);
                            bigIntegerOooOo2 = OooOo(bigIntegerOooOo.multiply(bigIntegerOooOo2).subtract(bigInteger5.multiply(bigIntegerOooOo0o2)));
                            bigIntegerOooOo = OooOo(bigIntegerOooOo.multiply(bigIntegerOooOo).subtract(bigIntegerOooOo0o4.shiftLeft(1)));
                            bigInteger6 = bigIntegerOooOo0o4;
                        } else {
                            BigInteger bigIntegerOooOo3 = OooOo(bigIntegerOooOo0o3.multiply(bigIntegerOooOo2).subtract(bigIntegerOooOo0o2));
                            BigInteger bigIntegerOooOo4 = OooOo(bigIntegerOooOo.multiply(bigIntegerOooOo2).subtract(bigInteger5.multiply(bigIntegerOooOo0o2)));
                            bigIntegerOooOo2 = OooOo(bigIntegerOooOo2.multiply(bigIntegerOooOo2).subtract(bigIntegerOooOo0o2.shiftLeft(1)));
                            bigIntegerOooOo0o3 = bigIntegerOooOo3;
                            bigIntegerOooOo = bigIntegerOooOo4;
                            bigInteger6 = bigIntegerOooOo0o2;
                        }
                        i2--;
                        bigIntegerShiftRight = bigIntegerShiftRight;
                    }
                    bigInteger = bigIntegerShiftRight;
                    BigInteger bigIntegerOooOo0o5 = OooOo0o(bigIntegerOooOo0o2, bigInteger6);
                    BigInteger bigIntegerOooOo0o6 = OooOo0o(bigIntegerOooOo0o5, bigInteger4);
                    BigInteger bigIntegerOooOo5 = OooOo(bigIntegerOooOo0o3.multiply(bigIntegerOooOo2).subtract(bigIntegerOooOo0o5));
                    BigInteger bigIntegerOooOo6 = OooOo(bigIntegerOooOo.multiply(bigIntegerOooOo2).subtract(bigInteger5.multiply(bigIntegerOooOo0o5)));
                    BigInteger bigIntegerOooOo7 = OooOo(bigIntegerOooOo0o5.multiply(bigIntegerOooOo0o6));
                    for (int i3 = 1; i3 <= lowestSetBit; i3++) {
                        bigIntegerOooOo5 = OooOo0o(bigIntegerOooOo5, bigIntegerOooOo6);
                        bigIntegerOooOo6 = OooOo(bigIntegerOooOo6.multiply(bigIntegerOooOo6).subtract(bigIntegerOooOo7.shiftLeft(1)));
                        bigIntegerOooOo7 = OooOo(bigIntegerOooOo7.multiply(bigIntegerOooOo7));
                    }
                    BigInteger[] bigIntegerArr = {bigIntegerOooOo5, bigIntegerOooOo6};
                    BigInteger bigInteger7 = bigIntegerArr[0];
                    BigInteger bigIntegerSubtract2 = bigIntegerArr[1];
                    if (OooOo0o(bigIntegerSubtract2, bigIntegerSubtract2).equals(bigIntegerShiftLeft2)) {
                        BigInteger bigInteger8 = this.f52779OooO0Oo;
                        BigInteger bigInteger9 = this.f52781OooO0o0;
                        if (bigIntegerSubtract2.testBit(0)) {
                            bigIntegerSubtract2 = this.f52779OooO0Oo.subtract(bigIntegerSubtract2);
                        }
                        return new OooO0O0(bigInteger8, bigInteger9, bigIntegerSubtract2.shiftRight(1));
                    }
                    if (!bigInteger7.equals(OooOO0.f52757OooO0O0) && !bigInteger7.equals(bigIntegerSubtract)) {
                        return null;
                    }
                    obj = null;
                }
                obj2 = obj;
                bigIntegerShiftRight = bigInteger;
                i = 1;
            }
        }

        @Override // p696oO0OO0oo.OooOOO0
        public final OooOOO0 OooOOO0() {
            if (this.f52780OooO0o.signum() == 0) {
                return this;
            }
            BigInteger bigInteger = this.f52779OooO0Oo;
            return new OooO0O0(bigInteger, this.f52781OooO0o0, bigInteger.subtract(this.f52780OooO0o));
        }

        @Override // p696oO0OO0oo.OooOOO0
        public final OooOOO0 OooOOOO() {
            BigInteger bigInteger = this.f52779OooO0Oo;
            BigInteger bigInteger2 = this.f52781OooO0o0;
            BigInteger bigInteger3 = this.f52780OooO0o;
            return new OooO0O0(bigInteger, bigInteger2, OooOo0o(bigInteger3, bigInteger3));
        }

        @Override // p696oO0OO0oo.OooOOO0
        public final OooOOO0 OooOOOo(OooOOO0 oooOOO0, OooOOO0 oooOOO1) {
            BigInteger bigInteger = this.f52780OooO0o;
            BigInteger bigIntegerOooOOoo = oooOOO0.OooOOoo();
            BigInteger bigIntegerOooOOoo2 = oooOOO1.OooOOoo();
            return new OooO0O0(this.f52779OooO0Oo, this.f52781OooO0o0, OooOo(bigInteger.multiply(bigInteger).add(bigIntegerOooOOoo.multiply(bigIntegerOooOOoo2))));
        }

        @Override // p696oO0OO0oo.OooOOO0
        public final OooOOO0 OooOOo0(OooOOO0 oooOOO0) {
            BigInteger bigInteger = this.f52779OooO0Oo;
            BigInteger bigInteger2 = this.f52781OooO0o0;
            BigInteger bigIntegerSubtract = this.f52780OooO0o.subtract(oooOOO0.OooOOoo());
            if (bigIntegerSubtract.signum() < 0) {
                bigIntegerSubtract = bigIntegerSubtract.add(this.f52779OooO0Oo);
            }
            return new OooO0O0(bigInteger, bigInteger2, bigIntegerSubtract);
        }

        @Override // p696oO0OO0oo.OooOOO0
        public final BigInteger OooOOoo() {
            return this.f52780OooO0o;
        }

        public final BigInteger OooOo(BigInteger bigInteger) {
            if (this.f52781OooO0o0 == null) {
                return bigInteger.mod(this.f52779OooO0Oo);
            }
            boolean z = bigInteger.signum() < 0;
            if (z) {
                bigInteger = bigInteger.abs();
            }
            int iBitLength = this.f52779OooO0Oo.bitLength();
            boolean zEquals = this.f52781OooO0o0.equals(OooOO0.f52757OooO0O0);
            while (bigInteger.bitLength() > iBitLength + 1) {
                BigInteger bigIntegerShiftRight = bigInteger.shiftRight(iBitLength);
                BigInteger bigIntegerSubtract = bigInteger.subtract(bigIntegerShiftRight.shiftLeft(iBitLength));
                if (!zEquals) {
                    bigIntegerShiftRight = bigIntegerShiftRight.multiply(this.f52781OooO0o0);
                }
                bigInteger = bigIntegerShiftRight.add(bigIntegerSubtract);
            }
            while (bigInteger.compareTo(this.f52779OooO0Oo) >= 0) {
                bigInteger = bigInteger.subtract(this.f52779OooO0Oo);
            }
            return (!z || bigInteger.signum() == 0) ? bigInteger : this.f52779OooO0Oo.subtract(bigInteger);
        }

        public final OooOOO0 OooOo0(OooOOO0 oooOOO0) {
            if (oooOOO0.OooOOOO().equals(this)) {
                return oooOOO0;
            }
            return null;
        }

        public final BigInteger OooOo0O(BigInteger bigInteger) {
            int iOooO0o = OooO0o();
            int i = (iOooO0o + 31) >> 5;
            int[] iArrOooOO0 = o00000OO.OooOO0(iOooO0o, this.f52779OooO0Oo);
            int[] iArrOooOO1 = o00000OO.OooOO0(iOooO0o, bigInteger);
            int[] iArr = new int[i];
            Oooo000.OooO0OO(iArrOooOO0, iArrOooOO1, iArr);
            return o00000OO.OooOoO(i, iArr);
        }

        public final BigInteger OooOo0o(BigInteger bigInteger, BigInteger bigInteger2) {
            return OooOo(bigInteger.multiply(bigInteger2));
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return this.f52779OooO0Oo.equals(oooO0O0.f52779OooO0Oo) && this.f52780OooO0o.equals(oooO0O0.f52780OooO0o);
        }

        public final int hashCode() {
            return this.f52779OooO0Oo.hashCode() ^ this.f52780OooO0o.hashCode();
        }
    }

    public boolean OooO() {
        return OooOOoo().signum() == 0;
    }

    public abstract OooOOO0 OooO00o(OooOOO0 oooOOO0);

    public abstract OooOOO0 OooO0O0();

    public int OooO0OO() {
        return OooOOoo().bitLength();
    }

    public abstract OooOOO0 OooO0Oo(OooOOO0 oooOOO0);

    public abstract int OooO0o();

    public final byte[] OooO0o0() {
        return oO000Oo.OooO0O0.OooO00o((OooO0o() + 7) / 8, OooOOoo());
    }

    public abstract OooOOO0 OooO0oO();

    public boolean OooO0oo() {
        return OooO0OO() == 1;
    }

    public abstract OooOOO0 OooOO0(OooOOO0 oooOOO0);

    public OooOOO0 OooOO0O(OooOOO0 oooOOO0, OooOOO0 oooOOO1, OooOOO0 oooOOO2) {
        return OooOO0(oooOOO0).OooOOo0(oooOOO1.OooOO0(oooOOO2));
    }

    public OooOOO0 OooOO0o(OooOOO0 oooOOO0, OooOOO0 oooOOO1, OooOOO0 oooOOO2) {
        return OooOO0(oooOOO0).OooO00o(oooOOO1.OooOO0(oooOOO2));
    }

    public abstract OooOOO0 OooOOO();

    public abstract OooOOO0 OooOOO0();

    public abstract OooOOO0 OooOOOO();

    public OooOOO0 OooOOOo(OooOOO0 oooOOO0, OooOOO0 oooOOO1) {
        return OooOOOO().OooO00o(oooOOO0.OooOO0(oooOOO1));
    }

    public boolean OooOOo() {
        return OooOOoo().testBit(0);
    }

    public abstract OooOOO0 OooOOo0(OooOOO0 oooOOO0);

    public abstract BigInteger OooOOoo();

    public final String toString() {
        return OooOOoo().toString(16);
    }
}

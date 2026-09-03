package p696oO0OO0oo;

import com.facebook.appevents.AppEventsConstants;
import com.umeng.analytics.pro.bz;
import java.math.BigInteger;
import kotlin.KotlinVersion;
import kotlin.UByte;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOo implements Cloneable {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static final short[] f52782Oooo0oO = {0, 1, 4, 5, 16, 17, 20, 21, 64, 65, 68, 69, 80, 81, 84, 85, 256, 257, 260, 261, 272, 273, 276, 277, 320, 321, 324, 325, 336, 337, 340, 341, 1024, 1025, 1028, 1029, 1040, 1041, 1044, 1045, 1088, 1089, 1092, 1093, 1104, 1105, 1108, 1109, 1280, 1281, 1284, 1285, 1296, 1297, 1300, 1301, 1344, 1345, 1348, 1349, 1360, 1361, 1364, 1365, 4096, 4097, 4100, 4101, 4112, 4113, 4116, 4117, 4160, 4161, 4164, 4165, 4176, 4177, 4180, 4181, 4352, 4353, 4356, 4357, 4368, 4369, 4372, 4373, 4416, 4417, 4420, 4421, 4432, 4433, 4436, 4437, 5120, 5121, 5124, 5125, 5136, 5137, 5140, 5141, 5184, 5185, 5188, 5189, 5200, 5201, 5204, 5205, 5376, 5377, 5380, 5381, 5392, 5393, 5396, 5397, 5440, 5441, 5444, 5445, 5456, 5457, 5460, 5461, 16384, 16385, 16388, 16389, 16400, 16401, 16404, 16405, 16448, 16449, 16452, 16453, 16464, 16465, 16468, 16469, 16640, 16641, 16644, 16645, 16656, 16657, 16660, 16661, 16704, 16705, 16708, 16709, 16720, 16721, 16724, 16725, 17408, 17409, 17412, 17413, 17424, 17425, 17428, 17429, 17472, 17473, 17476, 17477, 17488, 17489, 17492, 17493, 17664, 17665, 17668, 17669, 17680, 17681, 17684, 17685, 17728, 17729, 17732, 17733, 17744, 17745, 17748, 17749, 20480, 20481, 20484, 20485, 20496, 20497, 20500, 20501, 20544, 20545, 20548, 20549, 20560, 20561, 20564, 20565, 20736, 20737, 20740, 20741, 20752, 20753, 20756, 20757, 20800, 20801, 20804, 20805, 20816, 20817, 20820, 20821, 21504, 21505, 21508, 21509, 21520, 21521, 21524, 21525, 21568, 21569, 21572, 21573, 21584, 21585, 21588, 21589, 21760, 21761, 21764, 21765, 21776, 21777, 21780, 21781, 21824, 21825, 21828, 21829, 21840, 21841, 21844, 21845};

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static final byte[] f52783Oooo0oo = {0, 1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public long[] f52784Oooo0o;

    public OooOo(int i) {
        this.f52784Oooo0o = new long[i];
    }

    public OooOo(BigInteger bigInteger) {
        int i;
        if (bigInteger == null || bigInteger.signum() < 0) {
            throw new IllegalArgumentException("invalid F2m field value");
        }
        if (bigInteger.signum() == 0) {
            this.f52784Oooo0o = new long[]{0};
            return;
        }
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        if (byteArray[0] == 0) {
            length--;
            i = 1;
        } else {
            i = 0;
        }
        int i2 = (length + 7) / 8;
        this.f52784Oooo0o = new long[i2];
        int i3 = i2 - 1;
        int i4 = (length % 8) + i;
        if (i < i4) {
            long j = 0;
            while (i < i4) {
                j = (j << 8) | ((long) (byteArray[i] & UByte.MAX_VALUE));
                i++;
            }
            this.f52784Oooo0o[i3] = j;
            i3--;
        }
        while (i3 >= 0) {
            long j2 = 0;
            int i5 = 0;
            while (i5 < 8) {
                j2 = (j2 << 8) | ((long) (byteArray[i] & UByte.MAX_VALUE));
                i5++;
                i++;
            }
            this.f52784Oooo0o[i3] = j2;
            i3--;
        }
    }

    public OooOo(long[] jArr) {
        this.f52784Oooo0o = jArr;
    }

    public OooOo(long[] jArr, int i) {
        if (i == jArr.length) {
            this.f52784Oooo0o = jArr;
            return;
        }
        long[] jArr2 = new long[i];
        this.f52784Oooo0o = jArr2;
        System.arraycopy(jArr, 0, jArr2, 0, i);
    }

    public static int OooO(long j) {
        int i;
        int i2 = 32;
        int i3 = (int) (j >>> 32);
        if (i3 == 0) {
            i3 = (int) j;
            i2 = 0;
        }
        int i4 = i3 >>> 16;
        if (i4 == 0) {
            int i5 = i3 >>> 8;
            i = i5 == 0 ? f52783Oooo0oo[i3] : f52783Oooo0oo[i5] + 8;
        } else {
            int i6 = i4 >>> 8;
            i = i6 == 0 ? f52783Oooo0oo[i4] + bz.n : f52783Oooo0oo[i6] + 24;
        }
        return i2 + i;
    }

    public static void OooO0OO(long[] jArr, int i, long[] jArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i + i4;
            jArr[i5] = jArr[i5] ^ jArr2[i2 + i4];
        }
    }

    public static void OooO0Oo(long[] jArr, int i, long[] jArr2, int i2, long[] jArr3, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = i + i5;
            jArr[i6] = jArr[i6] ^ (jArr2[i2 + i5] ^ jArr3[i3 + i5]);
        }
    }

    public static long OooO0oO(long[] jArr, int i, long[] jArr2, int i2, int i3, int i4) {
        int i5 = 64 - i4;
        long j = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            long j2 = jArr2[i2 + i6];
            int i7 = i + i6;
            jArr[i7] = (j | (j2 << i4)) ^ jArr[i7];
            j = j2 >>> i5;
        }
        return j;
    }

    public static void OooOO0o(long[] jArr, int i) {
        int i2 = (i >>> 6) + 0;
        jArr[i2] = (1 << (i & 63)) ^ jArr[i2];
    }

    public static void OooOOO(long[] jArr, int i, long j) {
        int i2 = (i >>> 6) + 0;
        int i3 = i & 63;
        if (i3 == 0) {
            jArr[i2] = jArr[i2] ^ j;
            return;
        }
        jArr[i2] = jArr[i2] ^ (j << i3);
        long j2 = j >>> (64 - i3);
        if (j2 != 0) {
            int i4 = i2 + 1;
            jArr[i4] = j2 ^ jArr[i4];
        }
    }

    public static void OooOOO0(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        int i4 = (i3 >>> 6) + 0;
        int i5 = i3 & 63;
        int i6 = i2;
        if (i5 == 0) {
            OooO0OO(jArr, i4, jArr2, i, i6);
            return;
        }
        int i7 = i4 + 1;
        int i8 = 64 - i5;
        int i9 = 64 - i8;
        long j = 0;
        while (true) {
            i6--;
            if (i6 < 0) {
                jArr[i4] = jArr[i4] ^ j;
                return;
            }
            long j2 = jArr2[i + i6];
            int i10 = i7 + i6;
            jArr[i10] = (j | (j2 >>> i8)) ^ jArr[i10];
            j = j2 << i9;
        }
    }

    public static long OooOOOo(int i) {
        short[] sArr = f52782Oooo0oO;
        int i2 = sArr[i & KotlinVersion.MAX_COMPONENT_VALUE] | (sArr[(i >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE] << 16);
        return (((long) i2) & 4294967295L) | ((((long) ((sArr[i >>> 24] << 16) | sArr[(i >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE])) & 4294967295L) << 32);
    }

    public static int OooOo0(long[] jArr, int i, int i2, int[] iArr) {
        int i3 = i;
        int i4 = (i2 + 63) >>> 6;
        if (i3 < i4) {
            return i3;
        }
        int i5 = i3 << 6;
        int iMin = Math.min(i5, (i2 << 1) - 1);
        int i6 = i5 - iMin;
        while (i6 >= 64) {
            i3--;
            i6 -= 64;
        }
        int length = iArr.length;
        int i7 = iArr[length - 1];
        int i8 = length > 1 ? iArr[length - 2] : 0;
        int iMax = Math.max(i2, i7 + 64);
        int iMin2 = (Math.min(iMin - iMax, i2 - i8) + i6) >> 6;
        if (iMin2 > 1) {
            int i9 = i3 - iMin2;
            iMin = i9 << 6;
            int i10 = iMin - i2;
            int length2 = iArr.length;
            while (true) {
                length2--;
                if (length2 < 0) {
                    break;
                }
                OooOOO0(jArr, jArr, 0 + i9, i3 - i9, i10 + iArr[length2]);
            }
            OooOOO0(jArr, jArr, 0 + i9, i3 - i9, i10);
            while (i3 > i9) {
                i3--;
                jArr[0 + i3] = 0;
            }
        }
        if (iMin > iMax) {
            int i11 = iMax >>> 6;
            while (true) {
                i3--;
                if (i3 <= i11) {
                    break;
                }
                int i12 = 0 + i3;
                long j = jArr[i12];
                if (j != 0) {
                    jArr[i12] = 0;
                    int i13 = (i3 << 6) - i2;
                    int length3 = iArr.length;
                    while (true) {
                        length3--;
                        if (length3 < 0) {
                            break;
                        }
                        OooOOO(jArr, iArr[length3] + i13, j);
                    }
                    OooOOO(jArr, i13, j);
                }
            }
            int i14 = iMax & 63;
            int i15 = i11 + 0;
            long j2 = jArr[i15] >>> i14;
            if (j2 != 0) {
                jArr[i15] = jArr[i15] ^ (j2 << i14);
                int i16 = iMax - i2;
                int length4 = iArr.length;
                while (true) {
                    length4--;
                    if (length4 < 0) {
                        break;
                    }
                    OooOOO(jArr, iArr[length4] + i16, j2);
                }
                OooOOO(jArr, i16, j2);
            }
        } else {
            iMax = iMin;
        }
        if (iMax > i2) {
            while (true) {
                iMax--;
                if (iMax < i2) {
                    break;
                }
                if (((1 << (iMax & 63)) & jArr[(iMax >>> 6) + 0]) != 0) {
                    OooOO0o(jArr, iMax);
                    int i17 = iMax - i2;
                    int length5 = iArr.length;
                    while (true) {
                        length5--;
                        if (length5 < 0) {
                            break;
                        }
                        OooOO0o(jArr, iArr[length5] + i17);
                    }
                    OooOO0o(jArr, i17);
                }
            }
        }
        return i4;
    }

    public static void OooOo00(long j, long[] jArr, int i, long[] jArr2) {
        if ((j & 1) != 0) {
            OooO0OO(jArr2, 0, jArr, 0, i);
        }
        int i2 = 1;
        long j2 = j;
        while (true) {
            long j3 = j2 >>> 1;
            if (j3 == 0) {
                return;
            }
            if ((j3 & 1) != 0) {
                long jOooO0oO = OooO0oO(jArr2, 0, jArr, 0, i, i2);
                if (jOooO0oO != 0) {
                    int i3 = 0 + i;
                    jArr2[i3] = jOooO0oO ^ jArr2[i3];
                }
            }
            i2++;
            j2 = j3;
        }
    }

    public static long OooOo0O(long[] jArr, int i, long[] jArr2, int i2, int i3, int i4) {
        int i5 = 64 - i4;
        long j = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            long j2 = jArr[i + i6];
            jArr2[i2 + i6] = j | (j2 << i4);
            j = j2 >>> i5;
        }
        return j;
    }

    public final void OooO0o(OooOo oooOo) {
        int iOooOOOO = oooOo.OooOOOO();
        if (iOooOOOO == 0) {
            return;
        }
        int i = iOooOOOO + 0;
        long[] jArr = this.f52784Oooo0o;
        if (i > jArr.length) {
            long[] jArr2 = new long[i];
            System.arraycopy(jArr, 0, jArr2, 0, Math.min(jArr.length, i));
            this.f52784Oooo0o = jArr2;
        }
        OooO0OO(this.f52784Oooo0o, 0, oooOo.f52784Oooo0o, 0, iOooOOOO);
    }

    public final void OooO0o0(OooOo oooOo, int i, int i2) {
        int i3 = (i + 63) >>> 6;
        int i4 = i2 >>> 6;
        int i5 = i2 & 63;
        if (i5 == 0) {
            OooO0OO(this.f52784Oooo0o, i4, oooOo.f52784Oooo0o, 0, i3);
            return;
        }
        long jOooO0oO = OooO0oO(this.f52784Oooo0o, i4, oooOo.f52784Oooo0o, 0, i3, i5);
        if (jOooO0oO != 0) {
            long[] jArr = this.f52784Oooo0o;
            int i6 = i3 + i4;
            jArr[i6] = jOooO0oO ^ jArr[i6];
        }
    }

    public final int OooOO0() {
        int length = this.f52784Oooo0o.length;
        while (length != 0) {
            length--;
            long j = this.f52784Oooo0o[length];
            if (j != 0) {
                return OooO(j) + (length << 6);
            }
        }
        return 0;
    }

    public final int OooOO0O(int i) {
        int i2 = (i + 62) >>> 6;
        while (i2 != 0) {
            i2--;
            long j = this.f52784Oooo0o[i2];
            if (j != 0) {
                return OooO(j) + (i2 << 6);
            }
        }
        return 0;
    }

    public final int OooOOOO() {
        long[] jArr = this.f52784Oooo0o;
        int iMin = Math.min(jArr.length, jArr.length);
        if (iMin < 1) {
            return 0;
        }
        if (jArr[0] == 0) {
            do {
                iMin--;
                if (jArr[iMin] != 0) {
                }
            } while (iMin > 0);
            return 0;
        }
        do {
            iMin--;
        } while (jArr[iMin] == 0);
        return iMin + 1;
    }

    public final boolean OooOOo() {
        for (long j : this.f52784Oooo0o) {
            if (j != 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean OooOOo0() {
        long[] jArr = this.f52784Oooo0o;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < jArr.length; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public final OooOo OooOOoo(OooOo oooOo) {
        int i;
        int i2;
        OooOo oooOo2;
        OooOo oooOo3;
        long[] jArr;
        int iOooOO0 = OooOO0();
        if (iOooOO0 == 0) {
            return this;
        }
        int iOooOO1 = oooOo.OooOO0();
        if (iOooOO1 == 0) {
            return oooOo;
        }
        if (iOooOO0 > iOooOO1) {
            i2 = iOooOO0;
            i = iOooOO1;
            oooOo3 = this;
            oooOo2 = oooOo;
        } else {
            i = iOooOO0;
            i2 = iOooOO1;
            oooOo2 = this;
            oooOo3 = oooOo;
        }
        int i3 = (i + 63) >>> 6;
        int i4 = (i2 + 63) >>> 6;
        int i5 = ((i + i2) + 62) >>> 6;
        if (i3 == 1) {
            long j = oooOo2.f52784Oooo0o[0];
            if (j == 1) {
                return oooOo3;
            }
            long[] jArr2 = new long[i5];
            OooOo00(j, oooOo3.f52784Oooo0o, i4, jArr2);
            return new OooOo(jArr2, i5);
        }
        int i6 = ((i2 + 7) + 63) >>> 6;
        int[] iArr = new int[16];
        int i7 = i6 << 4;
        long[] jArr3 = new long[i7];
        iArr[1] = i6;
        System.arraycopy(oooOo3.f52784Oooo0o, 0, jArr3, i6, i4);
        int i8 = 2;
        int i9 = i6;
        while (i8 < 16) {
            i9 += i6;
            iArr[i8] = i9;
            if ((i8 & 1) == 0) {
                jArr = jArr3;
                OooOo0O(jArr3, i9 >>> 1, jArr3, i9, i6, 1);
            } else {
                jArr = jArr3;
                int i10 = i9 - i6;
                for (int i11 = 0; i11 < i6; i11++) {
                    jArr[i9 + i11] = jArr[i6 + i11] ^ jArr[i10 + i11];
                }
            }
            i8++;
            i7 = i7;
            jArr3 = jArr;
        }
        long[] jArr4 = jArr3;
        int i12 = i7;
        long[] jArr5 = new long[i12];
        OooOo0O(jArr4, 0, jArr5, 0, i12, 4);
        long[] jArr6 = oooOo2.f52784Oooo0o;
        int i13 = i5 << 3;
        long[] jArr7 = new long[i13];
        for (int i14 = 0; i14 < i3; i14++) {
            long j2 = jArr6[i14];
            int i15 = i14;
            while (true) {
                long j3 = j2 >>> 4;
                int i16 = i15;
                OooO0Oo(jArr7, i16, jArr4, iArr[((int) j2) & 15], jArr5, iArr[((int) j3) & 15], i6);
                j2 = j3 >>> 4;
                if (j2 == 0) {
                    break;
                }
                i15 += i5;
            }
        }
        while (true) {
            i13 -= i5;
            if (i13 == 0) {
                return new OooOo(jArr7, i5);
            }
            long[] jArr8 = jArr7;
            OooO0oO(jArr7, i13 - i5, jArr8, i13, i5, 8);
            jArr7 = jArr8;
        }
    }

    public final Object clone() {
        long[] jArr;
        long[] jArr2 = this.f52784Oooo0o;
        if (jArr2 == null) {
            jArr = null;
        } else {
            long[] jArr3 = new long[jArr2.length];
            System.arraycopy(jArr2, 0, jArr3, 0, jArr2.length);
            jArr = jArr3;
        }
        return new OooOo(jArr);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof OooOo)) {
            return false;
        }
        OooOo oooOo = (OooOo) obj;
        int iOooOOOO = OooOOOO();
        if (oooOo.OooOOOO() != iOooOOOO) {
            return false;
        }
        for (int i = 0; i < iOooOOOO; i++) {
            if (this.f52784Oooo0o[i] != oooOo.f52784Oooo0o[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iOooOOOO = OooOOOO();
        int i = 1;
        for (int i2 = 0; i2 < iOooOOOO; i2++) {
            long j = this.f52784Oooo0o[i2];
            i = (((i * 31) ^ ((int) j)) * 31) ^ ((int) (j >>> 32));
        }
        return i;
    }

    public final String toString() {
        int iOooOOOO = OooOOOO();
        if (iOooOOOO == 0) {
            return AppEventsConstants.EVENT_PARAM_VALUE_NO;
        }
        int i = iOooOOOO - 1;
        StringBuffer stringBuffer = new StringBuffer(Long.toBinaryString(this.f52784Oooo0o[i]));
        while (true) {
            i--;
            if (i < 0) {
                return stringBuffer.toString();
            }
            String binaryString = Long.toBinaryString(this.f52784Oooo0o[i]);
            int length = binaryString.length();
            if (length < 64) {
                stringBuffer.append("0000000000000000000000000000000000000000000000000000000000000000".substring(length));
            }
            stringBuffer.append(binaryString);
        }
    }
}

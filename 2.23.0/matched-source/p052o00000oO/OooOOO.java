package p052o00000oO;

import android.graphics.Path;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import p004OooO0oO.o000oOoO;
import p022Oooo00O.o00O00OO;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO {
    public static boolean OooO00o(@Nullable OooO00o[] oooO00oArr, @Nullable OooO00o[] oooO00oArr2) {
        if (oooO00oArr == null || oooO00oArr2 == null || oooO00oArr.length != oooO00oArr2.length) {
            return false;
        }
        for (int i = 0; i < oooO00oArr.length; i++) {
            OooO00o oooO00o = oooO00oArr[i];
            char c = oooO00o.f33993OooO00o;
            OooO00o oooO00o2 = oooO00oArr2[i];
            if (c != oooO00o2.f33993OooO00o || oooO00o.f33994OooO0O0.length != oooO00o2.f33994OooO0O0.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] OooO0O0(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i2 = i - 0;
        int iMin = Math.min(i2, length - 0);
        float[] fArr2 = new float[i2];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    /* JADX WARN: Code duplicated, block: B:49:0x0097 A[Catch: NumberFormatException -> 0x00bc, LOOP:3: B:29:0x006c->B:49:0x0097, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00bc, blocks: (B:26:0x0059, B:29:0x006c, B:31:0x0072, B:36:0x0080, B:49:0x0097, B:51:0x009c, B:54:0x00ac, B:56:0x00b1), top: B:71:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x009c A[Catch: NumberFormatException -> 0x00bc, TryCatch #0 {NumberFormatException -> 0x00bc, blocks: (B:26:0x0059, B:29:0x006c, B:31:0x0072, B:36:0x0080, B:49:0x0097, B:51:0x009c, B:54:0x00ac, B:56:0x00b1), top: B:71:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ac A[Catch: NumberFormatException -> 0x00bc, TryCatch #0 {NumberFormatException -> 0x00bc, blocks: (B:26:0x0059, B:29:0x006c, B:31:0x0072, B:36:0x0080, B:49:0x0097, B:51:0x009c, B:54:0x00ac, B:56:0x00b1), top: B:71:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008a, code lost:
    
        if (r13 == 0) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static OooO00o[] OooO0OO(String str) {
        String strTrim;
        float[] fArrOooO0O0;
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (i2 < str.length()) {
            while (i2 < str.length()) {
                char cCharAt = str.charAt(i2);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    } else if (cCharAt != 'e' && cCharAt != 'E') {
                        strTrim = str.substring(i, i2).trim();
                        if (strTrim.length() <= 0) {
                            if (strTrim.charAt(i3) != 'z' || strTrim.charAt(i3) == 'Z') {
                                fArrOooO0O0 = new float[i3];
                            } else {
                                try {
                                    float[] fArr = new float[strTrim.length()];
                                    int length = strTrim.length();
                                    int i4 = 1;
                                    int i5 = i3;
                                    while (i4 < length) {
                                        int i6 = i5;
                                        int i7 = i6;
                                        int i8 = i7;
                                        int i9 = i4;
                                        while (i9 < strTrim.length()) {
                                            char cCharAt2 = strTrim.charAt(i9);
                                            if (cCharAt2 != ' ') {
                                                if (cCharAt2 == 'E' || cCharAt2 == 'e') {
                                                    i8 = 1;
                                                } else {
                                                    switch (cCharAt2) {
                                                        case '-':
                                                            if (i9 != i4) {
                                                            }
                                                            break;
                                                        case '.':
                                                            if (i7 != 0) {
                                                                i6 = 1;
                                                            } else {
                                                                i7 = 1;
                                                            }
                                                            break;
                                                    }
                                                    i8 = 0;
                                                }
                                                if (i5 != 0) {
                                                    if (i4 < i9) {
                                                        fArr[i3] = Float.parseFloat(strTrim.substring(i4, i9));
                                                        i3++;
                                                    }
                                                    if (i6 == 0) {
                                                        i9++;
                                                    }
                                                    i4 = i9;
                                                    i5 = 0;
                                                } else {
                                                    i9++;
                                                }
                                            }
                                            i5 = 1;
                                            i8 = 0;
                                            if (i5 != 0) {
                                                if (i4 < i9) {
                                                    fArr[i3] = Float.parseFloat(strTrim.substring(i4, i9));
                                                    i3++;
                                                }
                                                if (i6 == 0) {
                                                    i9++;
                                                }
                                                i4 = i9;
                                                i5 = 0;
                                            } else {
                                                i9++;
                                            }
                                        }
                                        if (i4 < i9) {
                                            fArr[i3] = Float.parseFloat(strTrim.substring(i4, i9));
                                            i3++;
                                        }
                                        if (i6 == 0) {
                                            i9++;
                                        }
                                        i4 = i9;
                                        i5 = 0;
                                    }
                                    fArrOooO0O0 = OooO0O0(fArr, i3);
                                    i3 = 0;
                                } catch (NumberFormatException e) {
                                    throw new RuntimeException(o000oOoO.OooO00o("error in parsing \"", strTrim, "\""), e);
                                }
                            }
                            arrayList.add(new OooO00o(strTrim.charAt(i3), fArrOooO0O0));
                        }
                        i3 = 0;
                        int i10 = i2;
                        i2++;
                        i = i10;
                    }
                } else if (cCharAt != 'e') {
                    continue;
                }
                i2++;
            }
            strTrim = str.substring(i, i2).trim();
            if (strTrim.length() <= 0) {
                if (strTrim.charAt(i3) != 'z') {
                    fArrOooO0O0 = new float[i3];
                } else {
                    fArrOooO0O0 = new float[i3];
                }
                arrayList.add(new OooO00o(strTrim.charAt(i3), fArrOooO0O0));
            }
            i3 = 0;
            int i11 = i2;
            i2++;
            i = i11;
        }
        if (i2 - i == 1 && i < str.length()) {
            arrayList.add(new OooO00o(str.charAt(i), new float[0]));
        }
        return (OooO00o[]) arrayList.toArray(new OooO00o[arrayList.size()]);
    }

    public static Path OooO0Oo(String str) {
        Path path = new Path();
        OooO00o[] oooO00oArrOooO0OO = OooO0OO(str);
        if (oooO00oArrOooO0OO == null) {
            return null;
        }
        try {
            OooO00o.OooO0O0(oooO00oArrOooO0OO, path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException(o00O00OO.OooO00o("Error in parsing ", str), e);
        }
    }

    public static OooO00o[] OooO0o0(OooO00o[] oooO00oArr) {
        if (oooO00oArr == null) {
            return null;
        }
        OooO00o[] oooO00oArr2 = new OooO00o[oooO00oArr.length];
        for (int i = 0; i < oooO00oArr.length; i++) {
            oooO00oArr2[i] = new OooO00o(oooO00oArr[i]);
        }
        return oooO00oArr2;
    }

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public char f33993OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final float[] f33994OooO0O0;

        public OooO00o(char c, float[] fArr) {
            this.f33993OooO00o = c;
            this.f33994OooO0O0 = fArr;
        }

        public static void OooO00o(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            double d;
            double d2;
            double radians = Math.toRadians(f7);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d3 = f;
            double d4 = f2;
            double d5 = (d4 * dSin) + (d3 * dCos);
            double d6 = d3;
            double d7 = f5;
            double d8 = d5 / d7;
            double d9 = f6;
            double d10 = ((d4 * dCos) + (((double) (-f)) * dSin)) / d9;
            double d11 = d4;
            double d12 = f4;
            double d13 = ((d12 * dSin) + (((double) f3) * dCos)) / d7;
            double d14 = ((d12 * dCos) + (((double) (-f3)) * dSin)) / d9;
            double d15 = d8 - d13;
            double d16 = d10 - d14;
            double d17 = (d8 + d13) / 2.0d;
            double d18 = (d10 + d14) / 2.0d;
            double d19 = (d16 * d16) + (d15 * d15);
            if (d19 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d20 = (1.0d / d19) - 0.25d;
            if (d20 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d19);
                float fSqrt = (float) (Math.sqrt(d19) / 1.99999d);
                OooO00o(path, f, f2, f3, f4, f5 * fSqrt, f6 * fSqrt, f7, z, z2);
                return;
            }
            double dSqrt = Math.sqrt(d20);
            double d21 = d15 * dSqrt;
            double d22 = dSqrt * d16;
            if (z == z2) {
                d = d17 - d22;
                d2 = d18 + d21;
            } else {
                d = d17 + d22;
                d2 = d18 - d21;
            }
            double dAtan2 = Math.atan2(d10 - d2, d8 - d);
            double dAtan3 = Math.atan2(d14 - d2, d13 - d) - dAtan2;
            if (z2 != (dAtan3 >= 0.0d)) {
                dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
            }
            double d23 = d * d7;
            double d24 = d2 * d9;
            double d25 = (d23 * dCos) - (d24 * dSin);
            double d26 = (d24 * dCos) + (d23 * dSin);
            int iCeil = (int) Math.ceil(Math.abs((dAtan3 * 4.0d) / 3.141592653589793d));
            double dCos2 = Math.cos(radians);
            double dSin2 = Math.sin(radians);
            double dCos3 = Math.cos(dAtan2);
            double dSin3 = Math.sin(dAtan2);
            double d27 = -d7;
            double d28 = d27 * dCos2;
            double d29 = d9 * dSin2;
            double d30 = (d28 * dSin3) - (d29 * dCos3);
            double d31 = d27 * dSin2;
            double d32 = d9 * dCos2;
            double d33 = (dCos3 * d32) + (dSin3 * d31);
            double d34 = d32;
            double d35 = dAtan3 / ((double) iCeil);
            int i = 0;
            while (i < iCeil) {
                double d36 = dAtan2 + d35;
                double dSin4 = Math.sin(d36);
                double dCos4 = Math.cos(d36);
                double d37 = d35;
                double d38 = (((d7 * dCos2) * dCos4) + d25) - (d29 * dSin4);
                double d39 = d34;
                double d40 = d25;
                double d41 = (d39 * dSin4) + (d7 * dSin2 * dCos4) + d26;
                double d42 = (d28 * dSin4) - (d29 * dCos4);
                double d43 = (dCos4 * d39) + (dSin4 * d31);
                double d44 = d36 - dAtan2;
                double dTan = Math.tan(d44 / 2.0d);
                double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d44)) / 3.0d;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) ((d30 * dSqrt2) + d6), (float) ((d33 * dSqrt2) + d11), (float) (d38 - (dSqrt2 * d42)), (float) (d41 - (dSqrt2 * d43)), (float) d38, (float) d41);
                i++;
                dAtan2 = d36;
                d31 = d31;
                dCos2 = dCos2;
                iCeil = iCeil;
                d33 = d43;
                d7 = d7;
                d30 = d42;
                d6 = d38;
                d11 = d41;
                d25 = d40;
                d35 = d37;
                d34 = d39;
            }
        }

        public static void OooO0O0(OooO00o[] oooO00oArr, Path path) {
            int i;
            int i2;
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            float f9;
            float f10;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            float f19;
            float f20;
            int i3 = 6;
            float[] fArr = new float[6];
            char c = 'm';
            int i4 = 0;
            char c2 = 'm';
            int i5 = 0;
            while (i5 < oooO00oArr.length) {
                OooO00o oooO00o = oooO00oArr[i5];
                char c3 = oooO00o.f33993OooO00o;
                float f21 = fArr[i4];
                float f22 = fArr[1];
                float f23 = fArr[2];
                float f24 = fArr[3];
                float f25 = fArr[4];
                float f26 = fArr[5];
                switch (c3) {
                    case 'A':
                    case 'a':
                        i = 7;
                        break;
                    case 'C':
                    case 'c':
                        i = i3;
                        break;
                    case 'H':
                    case 'V':
                    case 'h':
                    case 'v':
                        i = 1;
                        break;
                    case 'Q':
                    case 'S':
                    case 'q':
                    case 's':
                        i = 4;
                        break;
                    case 'Z':
                    case 'z':
                        path.close();
                        path.moveTo(f25, f26);
                        f21 = f25;
                        f23 = f21;
                        f22 = f26;
                        f24 = f22;
                    default:
                        i = 2;
                        break;
                }
                float f27 = f25;
                float f28 = f26;
                float f29 = f21;
                float f30 = f22;
                int i6 = i4;
                while (true) {
                    float[] fArr2 = oooO00o.f33994OooO0O0;
                    if (i6 < fArr2.length) {
                        if (c3 != 'A') {
                            if (c3 != 'C') {
                                if (c3 == 'H') {
                                    i2 = i6;
                                    c3 = c3;
                                    oooO00o = oooO00o;
                                    i5 = i5;
                                    int i7 = i2 + 0;
                                    path.lineTo(fArr2[i7], f30);
                                    f29 = fArr2[i7];
                                } else if (c3 == 'Q') {
                                    i2 = i6;
                                    int i8 = i2 + 0;
                                    int i9 = i2 + 1;
                                    int i10 = i2 + 2;
                                    int i11 = i2 + 3;
                                    path.quadTo(fArr2[i8], fArr2[i9], fArr2[i10], fArr2[i11]);
                                    f = fArr2[i8];
                                    f2 = fArr2[i9];
                                    f29 = fArr2[i10];
                                    f30 = fArr2[i11];
                                } else if (c3 == 'V') {
                                    i2 = i6;
                                    c3 = c3;
                                    oooO00o = oooO00o;
                                    i5 = i5;
                                    int i12 = i2 + 0;
                                    path.lineTo(f29, fArr2[i12]);
                                    f30 = fArr2[i12];
                                } else if (c3 != 'a') {
                                    if (c3 != 'c') {
                                        if (c3 == 'h') {
                                            i2 = i6;
                                            int i13 = i2 + 0;
                                            path.rLineTo(fArr2[i13], 0.0f);
                                            f29 += fArr2[i13];
                                        } else if (c3 != 'q') {
                                            if (c3 != 'v') {
                                                if (c3 != 'L') {
                                                    if (c3 == 'M') {
                                                        i2 = i6;
                                                        f11 = fArr2[i2 + 0];
                                                        f12 = fArr2[i2 + 1];
                                                        if (i2 > 0) {
                                                            path.lineTo(f11, f12);
                                                        } else {
                                                            path.moveTo(f11, f12);
                                                            f27 = f11;
                                                            f28 = f12;
                                                        }
                                                    } else if (c3 == 'S') {
                                                        i2 = i6;
                                                        float f31 = f30;
                                                        float f32 = f29;
                                                        if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                                            f13 = (f31 * 2.0f) - f24;
                                                            f14 = (f32 * 2.0f) - f23;
                                                        } else {
                                                            f14 = f32;
                                                            f13 = f31;
                                                        }
                                                        int i14 = i2 + 0;
                                                        int i15 = i2 + 1;
                                                        int i16 = i2 + 2;
                                                        int i17 = i2 + 3;
                                                        path.cubicTo(f14, f13, fArr2[i14], fArr2[i15], fArr2[i16], fArr2[i17]);
                                                        float f33 = fArr2[i14];
                                                        float f34 = fArr2[i15];
                                                        f9 = fArr2[i16];
                                                        f8 = fArr2[i17];
                                                        f23 = f33;
                                                        f24 = f34;
                                                        f29 = f9;
                                                        f30 = f8;
                                                    } else if (c3 == 'T') {
                                                        i2 = i6;
                                                        float f35 = f30;
                                                        float f36 = f29;
                                                        if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                                            f15 = (f36 * 2.0f) - f23;
                                                            f16 = (f35 * 2.0f) - f24;
                                                        } else {
                                                            f15 = f36;
                                                            f16 = f35;
                                                        }
                                                        int i18 = i2 + 0;
                                                        int i19 = i2 + 1;
                                                        path.quadTo(f15, f16, fArr2[i18], fArr2[i19]);
                                                        f24 = f16;
                                                        f23 = f15;
                                                        c3 = c3;
                                                        oooO00o = oooO00o;
                                                        i5 = i5;
                                                        f29 = fArr2[i18];
                                                        f30 = fArr2[i19];
                                                    } else if (c3 == 'l') {
                                                        i2 = i6;
                                                        int i20 = i2 + 0;
                                                        float f37 = fArr2[i20];
                                                        int i21 = i2 + 1;
                                                        path.rLineTo(f37, fArr2[i21]);
                                                        f29 += fArr2[i20];
                                                        f10 = fArr2[i21];
                                                    } else if (c3 == c) {
                                                        i2 = i6;
                                                        float f38 = fArr2[i2 + 0];
                                                        f29 += f38;
                                                        float f39 = fArr2[i2 + 1];
                                                        f30 += f39;
                                                        if (i2 > 0) {
                                                            path.rLineTo(f38, f39);
                                                        } else {
                                                            path.rMoveTo(f38, f39);
                                                            f28 = f30;
                                                            f27 = f29;
                                                        }
                                                    } else if (c3 != 's') {
                                                        if (c3 == 't') {
                                                            if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                                                f19 = f29 - f23;
                                                                f20 = f30 - f24;
                                                            } else {
                                                                f20 = 0.0f;
                                                                f19 = 0.0f;
                                                            }
                                                            int i22 = i6 + 0;
                                                            int i23 = i6 + 1;
                                                            path.rQuadTo(f19, f20, fArr2[i22], fArr2[i23]);
                                                            float f40 = f19 + f29;
                                                            float f41 = f20 + f30;
                                                            f29 += fArr2[i22];
                                                            f30 += fArr2[i23];
                                                            f24 = f41;
                                                            f23 = f40;
                                                        }
                                                        i2 = i6;
                                                    } else {
                                                        if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                                            float f42 = f29 - f23;
                                                            f17 = f30 - f24;
                                                            f18 = f42;
                                                        } else {
                                                            f17 = 0.0f;
                                                            f18 = 0.0f;
                                                        }
                                                        int i24 = i6 + 0;
                                                        int i25 = i6 + 1;
                                                        int i26 = i6 + 2;
                                                        int i27 = i6 + 3;
                                                        i2 = i6;
                                                        f3 = f30;
                                                        float f43 = f29;
                                                        path.rCubicTo(f18, f17, fArr2[i24], fArr2[i25], fArr2[i26], fArr2[i27]);
                                                        f4 = fArr2[i24] + f43;
                                                        f5 = fArr2[i25] + f3;
                                                        f6 = f43 + fArr2[i26];
                                                        f7 = fArr2[i27];
                                                    }
                                                    f29 = f27;
                                                    f30 = f28;
                                                } else {
                                                    i2 = i6;
                                                    int i28 = i2 + 0;
                                                    int i29 = i2 + 1;
                                                    path.lineTo(fArr2[i28], fArr2[i29]);
                                                    f11 = fArr2[i28];
                                                    f12 = fArr2[i29];
                                                }
                                                f29 = f11;
                                                f30 = f12;
                                            } else {
                                                i2 = i6;
                                                int i30 = i2 + 0;
                                                path.rLineTo(0.0f, fArr2[i30]);
                                                f10 = fArr2[i30];
                                            }
                                            f30 += f10;
                                        } else {
                                            i2 = i6;
                                            f3 = f30;
                                            float f44 = f29;
                                            int i31 = i2 + 0;
                                            float f45 = fArr2[i31];
                                            int i32 = i2 + 1;
                                            int i33 = i2 + 2;
                                            int i34 = i2 + 3;
                                            path.rQuadTo(f45, fArr2[i32], fArr2[i33], fArr2[i34]);
                                            f4 = fArr2[i31] + f44;
                                            f5 = fArr2[i32] + f3;
                                            float f46 = f44 + fArr2[i33];
                                            float f47 = fArr2[i34];
                                            f6 = f46;
                                            f7 = f47;
                                        }
                                        c3 = c3;
                                        oooO00o = oooO00o;
                                        i5 = i5;
                                    } else {
                                        i2 = i6;
                                        f3 = f30;
                                        float f48 = f29;
                                        int i35 = i2 + 2;
                                        int i36 = i2 + 3;
                                        int i37 = i2 + 4;
                                        int i38 = i2 + 5;
                                        path.rCubicTo(fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i35], fArr2[i36], fArr2[i37], fArr2[i38]);
                                        f4 = fArr2[i35] + f48;
                                        f5 = fArr2[i36] + f3;
                                        f6 = f48 + fArr2[i37];
                                        f7 = fArr2[i38];
                                    }
                                    f8 = f3 + f7;
                                    f23 = f4;
                                    f24 = f5;
                                    f9 = f6;
                                    f29 = f9;
                                    f30 = f8;
                                    c3 = c3;
                                    oooO00o = oooO00o;
                                    i5 = i5;
                                } else {
                                    i2 = i6;
                                    float f49 = f30;
                                    float f50 = f29;
                                    int i39 = i2 + 5;
                                    int i40 = i2 + 6;
                                    OooO00o(path, f50, f49, fArr2[i39] + f50, fArr2[i40] + f49, fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3] != 0.0f, fArr2[i2 + 4] != 0.0f);
                                    f29 = f50 + fArr2[i39];
                                    f30 = f49 + fArr2[i40];
                                }
                                i6 = i2 + i;
                                oooO00o = oooO00o;
                                c2 = c3;
                                c3 = c2;
                                i5 = i5;
                                c = 'm';
                                i4 = 0;
                            } else {
                                i2 = i6;
                                int i41 = i2 + 2;
                                int i42 = i2 + 3;
                                int i43 = i2 + 4;
                                int i44 = i2 + 5;
                                path.cubicTo(fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i41], fArr2[i42], fArr2[i43], fArr2[i44]);
                                float f51 = fArr2[i43];
                                float f52 = fArr2[i44];
                                f = fArr2[i41];
                                f29 = f51;
                                f30 = f52;
                                f2 = fArr2[i42];
                            }
                            f23 = f;
                            f24 = f2;
                            i6 = i2 + i;
                            oooO00o = oooO00o;
                            c2 = c3;
                            c3 = c2;
                            i5 = i5;
                            c = 'm';
                            i4 = 0;
                        } else {
                            i2 = i6;
                            int i45 = i2 + 5;
                            int i46 = i2 + 6;
                            OooO00o(path, f29, f30, fArr2[i45], fArr2[i46], fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3] != 0.0f, fArr2[i2 + 4] != 0.0f);
                            f29 = fArr2[i45];
                            f30 = fArr2[i46];
                        }
                        f24 = f30;
                        f23 = f29;
                        i6 = i2 + i;
                        oooO00o = oooO00o;
                        c2 = c3;
                        c3 = c2;
                        i5 = i5;
                        c = 'm';
                        i4 = 0;
                    }
                }
                int i47 = i5;
                int i48 = i4;
                fArr[i48] = f29;
                fArr[1] = f30;
                fArr[2] = f23;
                fArr[3] = f24;
                fArr[4] = f27;
                fArr[5] = f28;
                i5 = i47 + 1;
                i3 = 6;
                c = 'm';
                i4 = i48;
                c2 = oooO00oArr[i47].f33993OooO00o;
            }
        }

        public OooO00o(OooO00o oooO00o) {
            this.f33993OooO00o = oooO00o.f33993OooO00o;
            float[] fArr = oooO00o.f33994OooO0O0;
            this.f33994OooO0O0 = OooOOO.OooO0O0(fArr, fArr.length);
        }
    }
}

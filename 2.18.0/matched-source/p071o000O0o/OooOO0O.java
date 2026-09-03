package p071o000O0o;

import OooO0o.OooO0OO;
import android.graphics.Path;
import android.util.Log;
import androidx.annotation.Nullable;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import p016OooOoO0.OooOo00;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O {
    public static boolean OooO00o(@Nullable OooO00o[] oooO00oArr, @Nullable OooO00o[] oooO00oArr2) {
        if (oooO00oArr == null || oooO00oArr2 == null || oooO00oArr.length != oooO00oArr2.length) {
            return false;
        }
        for (int i = 0; i < oooO00oArr.length; i++) {
            if (oooO00oArr[i].f28188OooO00o != oooO00oArr2[i].f28188OooO00o || oooO00oArr[i].f28189OooO0O0.length != oooO00oArr2[i].f28189OooO0O0.length) {
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

    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    /* JADX WARN: Code duplicated, block: B:21:0x0048  */
    /* JADX WARN: Code duplicated, block: B:49:0x0098 A[Catch: NumberFormatException -> 0x00b9, LOOP:3: B:29:0x006d->B:49:0x0098, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00b9, blocks: (B:26:0x005a, B:29:0x006d, B:31:0x0073, B:36:0x0081, B:49:0x0098, B:51:0x009d, B:54:0x00ad, B:56:0x00b1), top: B:71:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:51:0x009d A[Catch: NumberFormatException -> 0x00b9, TryCatch #0 {NumberFormatException -> 0x00b9, blocks: (B:26:0x005a, B:29:0x006d, B:31:0x0073, B:36:0x0081, B:49:0x0098, B:51:0x009d, B:54:0x00ad, B:56:0x00b1), top: B:71:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ad A[Catch: NumberFormatException -> 0x00b9, TryCatch #0 {NumberFormatException -> 0x00b9, blocks: (B:26:0x005a, B:29:0x006d, B:31:0x0073, B:36:0x0081, B:49:0x0098, B:51:0x009d, B:54:0x00ad, B:56:0x00b1), top: B:71:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008b, code lost:
    
        if (r13 == false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static OooO00o[] OooO0OO(String str) {
        String strTrim;
        float[] fArrOooO0O0;
        int i;
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i3 < str.length()) {
            while (i3 < str.length()) {
                char cCharAt = str.charAt(i3);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    } else if (cCharAt != 'e' && cCharAt != 'E') {
                        strTrim = str.substring(i4, i3).trim();
                        if (strTrim.length() <= 0) {
                            if (strTrim.charAt(i2) != 'z' || strTrim.charAt(i2) == 'Z') {
                                fArrOooO0O0 = new float[i2];
                            } else {
                                try {
                                    float[] fArr = new float[strTrim.length()];
                                    int length = strTrim.length();
                                    int i5 = 0;
                                    for (int i6 = 1; i6 < length; i6 = i) {
                                        boolean z = false;
                                        boolean z2 = false;
                                        boolean z3 = false;
                                        boolean z4 = false;
                                        i = i6;
                                        while (i < strTrim.length()) {
                                            char cCharAt2 = strTrim.charAt(i);
                                            if (cCharAt2 != ' ') {
                                                if (cCharAt2 == 'E' || cCharAt2 == 'e') {
                                                    z4 = true;
                                                } else {
                                                    switch (cCharAt2) {
                                                        case '-':
                                                            if (i != i6) {
                                                            }
                                                            break;
                                                        case '.':
                                                            if (z3) {
                                                                z2 = true;
                                                            } else {
                                                                z3 = true;
                                                            }
                                                            break;
                                                    }
                                                    z4 = false;
                                                }
                                                if (z) {
                                                    if (i6 < i) {
                                                        fArr[i5] = Float.parseFloat(strTrim.substring(i6, i));
                                                        i5++;
                                                    }
                                                    if (!z2) {
                                                        i++;
                                                    }
                                                } else {
                                                    i++;
                                                }
                                            }
                                            z = true;
                                            z4 = false;
                                            if (z) {
                                                if (i6 < i) {
                                                    fArr[i5] = Float.parseFloat(strTrim.substring(i6, i));
                                                    i5++;
                                                }
                                                if (!z2) {
                                                    i++;
                                                }
                                            } else {
                                                i++;
                                            }
                                        }
                                        if (i6 < i) {
                                            fArr[i5] = Float.parseFloat(strTrim.substring(i6, i));
                                            i5++;
                                        }
                                        if (!z2) {
                                            i++;
                                        }
                                    }
                                    fArrOooO0O0 = OooO0O0(fArr, i5);
                                    i2 = 0;
                                } catch (NumberFormatException e) {
                                    throw new RuntimeException(OooO0OO.OooO00o("error in parsing \"", strTrim, "\""), e);
                                }
                            }
                            arrayList.add(new OooO00o(strTrim.charAt(i2), fArrOooO0O0));
                        }
                        i4 = i3;
                        i3++;
                        i2 = 0;
                    }
                } else if (cCharAt != 'e') {
                    continue;
                }
                i3++;
            }
            strTrim = str.substring(i4, i3).trim();
            if (strTrim.length() <= 0) {
                if (strTrim.charAt(i2) != 'z') {
                    fArrOooO0O0 = new float[i2];
                } else {
                    fArrOooO0O0 = new float[i2];
                }
                arrayList.add(new OooO00o(strTrim.charAt(i2), fArrOooO0O0));
            }
            i4 = i3;
            i3++;
            i2 = 0;
        }
        if (i3 - i4 == 1 && i4 < str.length()) {
            arrayList.add(new OooO00o(str.charAt(i4), new float[0]));
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
            throw new RuntimeException(OooOo00.OooO00o("Error in parsing ", str), e);
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
        public char f28188OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float[] f28189OooO0O0;

        public OooO00o(char c, float[] fArr) {
            this.f28188OooO00o = c;
            this.f28189OooO0O0 = fArr;
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
            int i = 0;
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
            double d34 = dAtan3 / ((double) iCeil);
            double d35 = dAtan2;
            while (i < iCeil) {
                double d36 = d35 + d34;
                double dSin4 = Math.sin(d36);
                double dCos4 = Math.cos(d36);
                double d37 = d34;
                double d38 = (((d7 * dCos2) * dCos4) + d25) - (d29 * dSin4);
                double d39 = d25;
                double d40 = (d32 * dSin4) + (d7 * dSin2 * dCos4) + d26;
                double d41 = (d28 * dSin4) - (d29 * dCos4);
                double d42 = (dCos4 * d32) + (dSin4 * d31);
                double d43 = d36 - d35;
                double dTan = Math.tan(d43 / 2.0d);
                double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d43)) / 3.0d;
                path.rLineTo(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                path.cubicTo((float) ((d30 * dSqrt2) + d6), (float) ((d33 * dSqrt2) + d11), (float) (d38 - (dSqrt2 * d41)), (float) (d40 - (dSqrt2 * d42)), (float) d38, (float) d40);
                i++;
                d32 = d32;
                d31 = d31;
                iCeil = iCeil;
                dCos2 = dCos2;
                d35 = d36;
                d7 = d7;
                d33 = d42;
                d30 = d41;
                d6 = d38;
                d11 = d40;
                d34 = d37;
                d25 = d39;
            }
        }

        public static void OooO0O0(OooO00o[] oooO00oArr, Path path) {
            int i;
            int i2;
            float[] fArr;
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
            float[] fArr2 = new float[6];
            char c = 'm';
            char c2 = 0;
            char c3 = 'm';
            int i3 = 0;
            while (i3 < oooO00oArr.length) {
                char c4 = oooO00oArr[i3].f28188OooO00o;
                float[] fArr3 = oooO00oArr[i3].f28189OooO0O0;
                float f19 = fArr2[c2];
                float f20 = fArr2[1];
                float f21 = fArr2[2];
                float f22 = fArr2[3];
                float f23 = fArr2[4];
                float f24 = fArr2[5];
                switch (c4) {
                    case 'A':
                    case 'a':
                        i = 7;
                        break;
                    case 'C':
                    case 'c':
                        i = 6;
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
                        path.moveTo(f23, f24);
                        f19 = f23;
                        f21 = f19;
                        f20 = f24;
                        f22 = f20;
                    default:
                        i = 2;
                        break;
                }
                float f25 = f23;
                float f26 = f24;
                float f27 = f19;
                float f28 = f20;
                int i4 = 0;
                while (i4 < fArr3.length) {
                    if (c4 != 'A') {
                        if (c4 != 'C') {
                            if (c4 == 'H') {
                                i2 = i4;
                                fArr = fArr3;
                                c4 = c4;
                                i3 = i3;
                                int i5 = i2 + 0;
                                path.lineTo(fArr[i5], f28);
                                f27 = fArr[i5];
                            } else if (c4 == 'Q') {
                                i2 = i4;
                                fArr = fArr3;
                                int i6 = i2 + 0;
                                int i7 = i2 + 1;
                                int i8 = i2 + 2;
                                int i9 = i2 + 3;
                                path.quadTo(fArr[i6], fArr[i7], fArr[i8], fArr[i9]);
                                f = fArr[i6];
                                f2 = fArr[i7];
                                f27 = fArr[i8];
                                f28 = fArr[i9];
                            } else if (c4 == 'V') {
                                i2 = i4;
                                fArr = fArr3;
                                c4 = c4;
                                i3 = i3;
                                int i10 = i2 + 0;
                                path.lineTo(f27, fArr[i10]);
                                f28 = fArr[i10];
                            } else if (c4 != 'a') {
                                if (c4 != 'c') {
                                    if (c4 == 'h') {
                                        i2 = i4;
                                        int i11 = i2 + 0;
                                        path.rLineTo(fArr3[i11], ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                                        f27 += fArr3[i11];
                                    } else if (c4 != 'q') {
                                        if (c4 == 'v') {
                                            i2 = i4;
                                            int i12 = i2 + 0;
                                            path.rLineTo(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, fArr3[i12]);
                                            f10 = fArr3[i12];
                                        } else if (c4 == 'L') {
                                            i2 = i4;
                                            int i13 = i2 + 0;
                                            int i14 = i2 + 1;
                                            path.lineTo(fArr3[i13], fArr3[i14]);
                                            f27 = fArr3[i13];
                                            f28 = fArr3[i14];
                                        } else if (c4 == 'M') {
                                            i2 = i4;
                                            int i15 = i2 + 0;
                                            float f29 = fArr3[i15];
                                            int i16 = i2 + 1;
                                            float f30 = fArr3[i16];
                                            if (i2 > 0) {
                                                path.lineTo(fArr3[i15], fArr3[i16]);
                                                f27 = f29;
                                                f28 = f30;
                                            } else {
                                                path.moveTo(fArr3[i15], fArr3[i16]);
                                                f25 = f29;
                                                f26 = f30;
                                                f27 = f25;
                                                f28 = f26;
                                            }
                                        } else if (c4 == 'S') {
                                            i2 = i4;
                                            float f31 = f28;
                                            float f32 = f27;
                                            if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                                f11 = (f31 * 2.0f) - f22;
                                                f12 = (f32 * 2.0f) - f21;
                                            } else {
                                                f12 = f32;
                                                f11 = f31;
                                            }
                                            int i17 = i2 + 0;
                                            int i18 = i2 + 1;
                                            int i19 = i2 + 2;
                                            int i20 = i2 + 3;
                                            path.cubicTo(f12, f11, fArr3[i17], fArr3[i18], fArr3[i19], fArr3[i20]);
                                            float f33 = fArr3[i17];
                                            float f34 = fArr3[i18];
                                            f9 = fArr3[i19];
                                            f8 = fArr3[i20];
                                            f21 = f33;
                                            f22 = f34;
                                            f27 = f9;
                                            f28 = f8;
                                        } else if (c4 == 'T') {
                                            i2 = i4;
                                            float f35 = f28;
                                            float f36 = f27;
                                            if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                                f13 = (f36 * 2.0f) - f21;
                                                f14 = (f35 * 2.0f) - f22;
                                            } else {
                                                f13 = f36;
                                                f14 = f35;
                                            }
                                            int i21 = i2 + 0;
                                            int i22 = i2 + 1;
                                            path.quadTo(f13, f14, fArr3[i21], fArr3[i22]);
                                            f22 = f14;
                                            f21 = f13;
                                            fArr = fArr3;
                                            c4 = c4;
                                            i3 = i3;
                                            f27 = fArr3[i21];
                                            f28 = fArr3[i22];
                                        } else if (c4 == 'l') {
                                            i2 = i4;
                                            int i23 = i2 + 0;
                                            int i24 = i2 + 1;
                                            path.rLineTo(fArr3[i23], fArr3[i24]);
                                            f27 += fArr3[i23];
                                            f10 = fArr3[i24];
                                        } else if (c4 == c) {
                                            i2 = i4;
                                            int i25 = i2 + 0;
                                            f27 += fArr3[i25];
                                            int i26 = i2 + 1;
                                            f28 += fArr3[i26];
                                            if (i2 > 0) {
                                                path.rLineTo(fArr3[i25], fArr3[i26]);
                                            } else {
                                                path.rMoveTo(fArr3[i25], fArr3[i26]);
                                                f26 = f28;
                                                f25 = f27;
                                                f27 = f25;
                                                f28 = f26;
                                            }
                                        } else if (c4 != 's') {
                                            if (c4 == 't') {
                                                if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                                    f17 = f27 - f21;
                                                    f18 = f28 - f22;
                                                } else {
                                                    f18 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                                                    f17 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                                                }
                                                int i27 = i4 + 0;
                                                int i28 = i4 + 1;
                                                path.rQuadTo(f17, f18, fArr3[i27], fArr3[i28]);
                                                float f37 = f17 + f27;
                                                float f38 = f18 + f28;
                                                f27 += fArr3[i27];
                                                f28 += fArr3[i28];
                                                f22 = f38;
                                                f21 = f37;
                                            }
                                            i2 = i4;
                                        } else {
                                            if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                                f15 = f28 - f22;
                                                f16 = f27 - f21;
                                            } else {
                                                f16 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                                                f15 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                                            }
                                            int i29 = i4 + 0;
                                            int i30 = i4 + 1;
                                            int i31 = i4 + 2;
                                            int i32 = i4 + 3;
                                            i2 = i4;
                                            f3 = f28;
                                            float f39 = f27;
                                            path.rCubicTo(f16, f15, fArr3[i29], fArr3[i30], fArr3[i31], fArr3[i32]);
                                            f4 = fArr3[i29] + f39;
                                            f5 = fArr3[i30] + f3;
                                            f6 = f39 + fArr3[i31];
                                            f7 = fArr3[i32];
                                        }
                                        f28 += f10;
                                    } else {
                                        i2 = i4;
                                        f3 = f28;
                                        float f40 = f27;
                                        int i33 = i2 + 0;
                                        int i34 = i2 + 1;
                                        int i35 = i2 + 2;
                                        int i36 = i2 + 3;
                                        path.rQuadTo(fArr3[i33], fArr3[i34], fArr3[i35], fArr3[i36]);
                                        f4 = fArr3[i33] + f40;
                                        f5 = fArr3[i34] + f3;
                                        float f41 = f40 + fArr3[i35];
                                        float f42 = fArr3[i36];
                                        f6 = f41;
                                        f7 = f42;
                                    }
                                    fArr = fArr3;
                                    c4 = c4;
                                    i3 = i3;
                                } else {
                                    i2 = i4;
                                    f3 = f28;
                                    float f43 = f27;
                                    int i37 = i2 + 2;
                                    int i38 = i2 + 3;
                                    int i39 = i2 + 4;
                                    int i40 = i2 + 5;
                                    path.rCubicTo(fArr3[i2 + 0], fArr3[i2 + 1], fArr3[i37], fArr3[i38], fArr3[i39], fArr3[i40]);
                                    f4 = fArr3[i37] + f43;
                                    f5 = fArr3[i38] + f3;
                                    f6 = f43 + fArr3[i39];
                                    f7 = fArr3[i40];
                                }
                                f8 = f3 + f7;
                                f21 = f4;
                                f22 = f5;
                                f9 = f6;
                                f27 = f9;
                                f28 = f8;
                                fArr = fArr3;
                                c4 = c4;
                                i3 = i3;
                            } else {
                                i2 = i4;
                                float f44 = f28;
                                float f45 = f27;
                                int i41 = i2 + 5;
                                int i42 = i2 + 6;
                                fArr = fArr3;
                                OooO00o(path, f45, f44, fArr3[i41] + f45, fArr3[i42] + f44, fArr3[i2 + 0], fArr3[i2 + 1], fArr3[i2 + 2], fArr3[i2 + 3] != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, fArr3[i2 + 4] != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                                f27 = f45 + fArr[i41];
                                f28 = f44 + fArr[i42];
                            }
                            i4 = i2 + i;
                            c3 = c4;
                            c4 = c3;
                            fArr3 = fArr;
                            i3 = i3;
                            c = 'm';
                        } else {
                            i2 = i4;
                            fArr = fArr3;
                            int i43 = i2 + 2;
                            int i44 = i2 + 3;
                            int i45 = i2 + 4;
                            int i46 = i2 + 5;
                            path.cubicTo(fArr[i2 + 0], fArr[i2 + 1], fArr[i43], fArr[i44], fArr[i45], fArr[i46]);
                            float f46 = fArr[i45];
                            float f47 = fArr[i46];
                            f = fArr[i43];
                            f27 = f46;
                            f28 = f47;
                            f2 = fArr[i44];
                        }
                        f21 = f;
                        f22 = f2;
                        i4 = i2 + i;
                        c3 = c4;
                        c4 = c3;
                        fArr3 = fArr;
                        i3 = i3;
                        c = 'm';
                    } else {
                        i2 = i4;
                        fArr = fArr3;
                        int i47 = i2 + 5;
                        int i48 = i2 + 6;
                        OooO00o(path, f27, f28, fArr[i47], fArr[i48], fArr[i2 + 0], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3] != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, fArr[i2 + 4] != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                        f27 = fArr[i47];
                        f28 = fArr[i48];
                    }
                    f22 = f28;
                    f21 = f27;
                    i4 = i2 + i;
                    c3 = c4;
                    c4 = c3;
                    fArr3 = fArr;
                    i3 = i3;
                    c = 'm';
                }
                int i49 = i3;
                fArr2[0] = f27;
                fArr2[1] = f28;
                fArr2[2] = f21;
                fArr2[3] = f22;
                fArr2[4] = f25;
                fArr2[5] = f26;
                i3 = i49 + 1;
                c3 = oooO00oArr[i49].f28188OooO00o;
                c = 'm';
                c2 = 0;
            }
        }

        public OooO00o(OooO00o oooO00o) {
            this.f28188OooO00o = oooO00o.f28188OooO00o;
            float[] fArr = oooO00o.f28189OooO0O0;
            this.f28189OooO0O0 = OooOO0O.OooO0O0(fArr, fArr.length);
        }
    }
}

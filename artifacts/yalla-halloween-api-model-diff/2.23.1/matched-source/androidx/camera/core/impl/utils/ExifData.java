package androidx.camera.core.impl.utils;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.CameraCaptureMetaData$FlashState;
import com.facebook.internal.security.CertificateUtil;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o000OO.OooOOO0;
import org.conscrypt.PSKKeyManager;
import p028Oooo0oO.o00O0O0;
import p031OoooO0.o00Oo0;
import p031OoooO0.o00Ooo;
import p031OoooO0.o00oO0o;
import p031OoooO0.oo000o;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class ExifData {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final oo000o[] f3789OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final oo000o[][] f3790OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final HashSet<String> f3791OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<Map<String, o00Oo0>> f3792OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ByteOrder f3793OooO0O0;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f3794OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final /* synthetic */ int[] f3795OooO0O0;

        static {
            int[] iArr = new int[WhiteBalanceMode.values().length];
            f3795OooO0O0 = iArr;
            try {
                iArr[WhiteBalanceMode.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3795OooO0O0[WhiteBalanceMode.MANUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[CameraCaptureMetaData$FlashState.values().length];
            f3794OooO00o = iArr2;
            try {
                iArr2[CameraCaptureMetaData$FlashState.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3794OooO00o[CameraCaptureMetaData$FlashState.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3794OooO00o[CameraCaptureMetaData$FlashState.FIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList f3800OooO00o = Collections.list(new C0015OooO0O0());

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ByteOrder f3801OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final Pattern f3796OooO0OO = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final Pattern f3797OooO0Oo = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final Pattern f3799OooO0o0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final ArrayList f3798OooO0o = Collections.list(new OooO00o());

        public class OooO00o implements Enumeration<HashMap<String, oo000o>> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f3802OooO0Oo = 0;

            @Override // java.util.Enumeration
            public final boolean hasMoreElements() {
                int i = this.f3802OooO0Oo;
                oo000o[] oo000oVarArr = ExifData.f3789OooO0OO;
                return i < 4;
            }

            @Override // java.util.Enumeration
            public final HashMap<String, oo000o> nextElement() {
                HashMap<String, oo000o> map = new HashMap<>();
                for (oo000o oo000oVar : ExifData.f3790OooO0Oo[this.f3802OooO0Oo]) {
                    map.put(oo000oVar.f1390OooO0O0, oo000oVar);
                }
                this.f3802OooO0Oo++;
                return map;
            }
        }

        /* JADX INFO: renamed from: androidx.camera.core.impl.utils.ExifData$OooO0O0$OooO0O0, reason: collision with other inner class name */
        public class C0015OooO0O0 implements Enumeration<Map<String, o00Oo0>> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f3803OooO0Oo = 0;

            @Override // java.util.Enumeration
            public final boolean hasMoreElements() {
                int i = this.f3803OooO0Oo;
                oo000o[] oo000oVarArr = ExifData.f3789OooO0OO;
                return i < 4;
            }

            @Override // java.util.Enumeration
            public final Map<String, o00Oo0> nextElement() {
                this.f3803OooO0Oo++;
                return new HashMap();
            }
        }

        public OooO0O0(@NonNull ByteOrder byteOrder) {
            this.f3801OooO0O0 = byteOrder;
        }

        public static Pair<Integer, Integer> OooO00o(String str) {
            if (str.contains(",")) {
                String[] strArrSplit = str.split(",", -1);
                Pair<Integer, Integer> pairOooO00o = OooO00o(strArrSplit[0]);
                if (((Integer) pairOooO00o.first).intValue() == 2) {
                    return pairOooO00o;
                }
                for (int i = 1; i < strArrSplit.length; i++) {
                    Pair<Integer, Integer> pairOooO00o2 = OooO00o(strArrSplit[i]);
                    int iIntValue = (((Integer) pairOooO00o2.first).equals(pairOooO00o.first) || ((Integer) pairOooO00o2.second).equals(pairOooO00o.first)) ? ((Integer) pairOooO00o.first).intValue() : -1;
                    int iIntValue2 = (((Integer) pairOooO00o.second).intValue() == -1 || !(((Integer) pairOooO00o2.first).equals(pairOooO00o.second) || ((Integer) pairOooO00o2.second).equals(pairOooO00o.second))) ? -1 : ((Integer) pairOooO00o.second).intValue();
                    if (iIntValue == -1 && iIntValue2 == -1) {
                        return new Pair<>(2, -1);
                    }
                    if (iIntValue == -1) {
                        pairOooO00o = new Pair<>(Integer.valueOf(iIntValue2), -1);
                    } else if (iIntValue2 == -1) {
                        pairOooO00o = new Pair<>(Integer.valueOf(iIntValue), -1);
                    }
                }
                return pairOooO00o;
            }
            if (!str.contains("/")) {
                try {
                    try {
                        long j = Long.parseLong(str);
                        if (j < 0 || j > 65535) {
                            return j < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1);
                        }
                        return new Pair<>(3, 4);
                    } catch (NumberFormatException unused) {
                        return new Pair<>(2, -1);
                    }
                } catch (NumberFormatException unused2) {
                    Double.parseDouble(str);
                    return new Pair<>(12, -1);
                }
            }
            String[] strArrSplit2 = str.split("/", -1);
            if (strArrSplit2.length == 2) {
                try {
                    long j2 = (long) Double.parseDouble(strArrSplit2[0]);
                    long j3 = (long) Double.parseDouble(strArrSplit2[1]);
                    if (j2 >= 0 && j3 >= 0) {
                        if (j2 <= 2147483647L && j3 <= 2147483647L) {
                            return new Pair<>(10, 5);
                        }
                        return new Pair<>(5, -1);
                    }
                    return new Pair<>(10, -1);
                } catch (NumberFormatException unused3) {
                }
            }
            return new Pair<>(2, -1);
        }

        public final void OooO0O0(@NonNull String str, @NonNull String str2, @NonNull ArrayList arrayList) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((Map) it.next()).containsKey(str)) {
                    return;
                }
            }
            OooO0OO(str, str2, arrayList);
        }

        public final void OooO0OO(@NonNull String str, @Nullable String str2, @NonNull ArrayList arrayList) {
            int i;
            o00Oo0 o00oo1;
            String str3 = str;
            String strReplaceAll = str2;
            if (("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) && strReplaceAll != null) {
                boolean zFind = f3797OooO0Oo.matcher(strReplaceAll).find();
                boolean zFind2 = f3799OooO0o0.matcher(strReplaceAll).find();
                if (str2.length() != 19 || (!zFind && !zFind2)) {
                    o00O0O0.OooO0oo("ExifData", "Invalid value for " + str3 + " : " + strReplaceAll);
                    return;
                }
                if (zFind2) {
                    strReplaceAll = strReplaceAll.replaceAll("-", CertificateUtil.DELIMITER);
                }
            }
            if ("ISOSpeedRatings".equals(str3)) {
                str3 = "PhotographicSensitivity";
            }
            String str4 = str3;
            int i2 = 2;
            int i3 = 1;
            if (strReplaceAll != null && ExifData.f3791OooO0o0.contains(str4)) {
                if (str4.equals("GPSTimeStamp")) {
                    Matcher matcher = f3796OooO0OO.matcher(strReplaceAll);
                    if (!matcher.find()) {
                        o00O0O0.OooO0oo("ExifData", "Invalid value for " + str4 + " : " + strReplaceAll);
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    String strGroup = matcher.group(1);
                    strGroup.getClass();
                    sb.append(Integer.parseInt(strGroup));
                    sb.append("/1,");
                    String strGroup2 = matcher.group(2);
                    strGroup2.getClass();
                    sb.append(Integer.parseInt(strGroup2));
                    sb.append("/1,");
                    String strGroup3 = matcher.group(3);
                    strGroup3.getClass();
                    sb.append(Integer.parseInt(strGroup3));
                    sb.append("/1");
                    strReplaceAll = sb.toString();
                } else {
                    try {
                        strReplaceAll = ((long) (Double.parseDouble(strReplaceAll) * 10000.0d)) + "/10000";
                    } catch (NumberFormatException e) {
                        o00O0O0.OooO("ExifData", o00Ooo.OooO0O0("Invalid value for ", str4, " : ", strReplaceAll), e);
                        return;
                    }
                }
            }
            int i4 = 0;
            int i5 = 0;
            while (true) {
                oo000o[] oo000oVarArr = ExifData.f3789OooO0OO;
                if (i4 >= 4) {
                    return;
                }
                oo000o oo000oVar = (oo000o) ((HashMap) f3798OooO0o.get(i4)).get(str4);
                if (oo000oVar != null) {
                    if (strReplaceAll == null) {
                        ((Map) arrayList.get(i4)).remove(str4);
                    } else {
                        Pair<Integer, Integer> pairOooO00o = OooO00o(strReplaceAll);
                        int iIntValue = ((Integer) pairOooO00o.first).intValue();
                        int i6 = -1;
                        int i7 = oo000oVar.f1391OooO0OO;
                        if (i7 != iIntValue && i7 != ((Integer) pairOooO00o.second).intValue()) {
                            int i8 = oo000oVar.f1392OooO0Oo;
                            if (i8 != -1 && (i8 == ((Integer) pairOooO00o.first).intValue() || i8 == ((Integer) pairOooO00o.second).intValue())) {
                                i7 = i8;
                            } else if (i7 == i3 || i7 == 7 || i7 == i2) {
                            }
                        }
                        String str5 = "/";
                        ByteOrder byteOrder = this.f3801OooO0O0;
                        switch (i7) {
                            case 1:
                                Map map = (Map) arrayList.get(i4);
                                Charset charset = o00Oo0.f1379OooO0Oo;
                                if (strReplaceAll.length() == 1) {
                                    i = 0;
                                    if (strReplaceAll.charAt(0) >= '0' && strReplaceAll.charAt(0) <= '1') {
                                        o00oo1 = new o00Oo0(1, 1, new byte[]{(byte) (strReplaceAll.charAt(0) - '0')});
                                    }
                                    map.put(str4, o00oo1);
                                    i5 = i;
                                    i3 = 1;
                                    continue;
                                } else {
                                    i = 0;
                                }
                                byte[] bytes = strReplaceAll.getBytes(o00Oo0.f1379OooO0Oo);
                                o00oo1 = new o00Oo0(1, bytes.length, bytes);
                                map.put(str4, o00oo1);
                                i5 = i;
                                i3 = 1;
                                continue;
                            case 2:
                            case 7:
                                Map map2 = (Map) arrayList.get(i4);
                                Charset charset2 = o00Oo0.f1379OooO0Oo;
                                byte[] bytes2 = strReplaceAll.concat("\u0000").getBytes(o00Oo0.f1379OooO0Oo);
                                map2.put(str4, new o00Oo0(2, bytes2.length, bytes2));
                                i5 = 0;
                                i2 = 2;
                                i3 = 1;
                                continue;
                            case 3:
                                String[] strArrSplit = strReplaceAll.split(",", -1);
                                int length = strArrSplit.length;
                                int[] iArr = new int[length];
                                for (int i9 = 0; i9 < strArrSplit.length; i9++) {
                                    iArr[i9] = Integer.parseInt(strArrSplit[i9]);
                                }
                                Map map3 = (Map) arrayList.get(i4);
                                ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[o00Oo0.f1380OooO0o[3] * length]);
                                byteBufferWrap.order(byteOrder);
                                for (int i10 = 0; i10 < length; i10++) {
                                    byteBufferWrap.putShort((short) iArr[i10]);
                                }
                                map3.put(str4, new o00Oo0(3, length, byteBufferWrap.array()));
                                break;
                            case 4:
                                String[] strArrSplit2 = strReplaceAll.split(",", -1);
                                long[] jArr = new long[strArrSplit2.length];
                                for (int i11 = 0; i11 < strArrSplit2.length; i11++) {
                                    jArr[i11] = Long.parseLong(strArrSplit2[i11]);
                                }
                                ((Map) arrayList.get(i4)).put(str4, o00Oo0.OooO0O0(jArr, byteOrder));
                                break;
                            case 5:
                                String[] strArrSplit3 = strReplaceAll.split(",", -1);
                                int length2 = strArrSplit3.length;
                                o00oO0o[] o00oo0oArr = new o00oO0o[length2];
                                int i12 = 0;
                                int i13 = -1;
                                while (i12 < strArrSplit3.length) {
                                    String[] strArrSplit4 = strArrSplit3[i12].split(str5, i13);
                                    o00oo0oArr[i12] = new o00oO0o((long) Double.parseDouble(strArrSplit4[0]), (long) Double.parseDouble(strArrSplit4[1]));
                                    i12++;
                                    i13 = -1;
                                    str5 = str5;
                                    strArrSplit3 = strArrSplit3;
                                }
                                Map map4 = (Map) arrayList.get(i4);
                                ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(new byte[o00Oo0.f1380OooO0o[5] * length2]);
                                byteBufferWrap2.order(byteOrder);
                                for (int i14 = 0; i14 < length2; i14++) {
                                    o00oO0o o00oo0o2 = o00oo0oArr[i14];
                                    byteBufferWrap2.putInt((int) o00oo0o2.f1385OooO00o);
                                    byteBufferWrap2.putInt((int) o00oo0o2.f1386OooO0O0);
                                }
                                map4.put(str4, new o00Oo0(5, length2, byteBufferWrap2.array()));
                                break;
                            case 6:
                            case 8:
                            case 11:
                            default:
                                continue;
                            case 9:
                                String[] strArrSplit5 = strReplaceAll.split(",", -1);
                                int length3 = strArrSplit5.length;
                                int[] iArr2 = new int[length3];
                                for (int i15 = 0; i15 < strArrSplit5.length; i15++) {
                                    iArr2[i15] = Integer.parseInt(strArrSplit5[i15]);
                                }
                                Map map5 = (Map) arrayList.get(i4);
                                ByteBuffer byteBufferWrap3 = ByteBuffer.wrap(new byte[o00Oo0.f1380OooO0o[9] * length3]);
                                byteBufferWrap3.order(byteOrder);
                                for (int i16 = 0; i16 < length3; i16++) {
                                    byteBufferWrap3.putInt(iArr2[i16]);
                                }
                                map5.put(str4, new o00Oo0(9, length3, byteBufferWrap3.array()));
                                break;
                            case 10:
                                String[] strArrSplit6 = strReplaceAll.split(",", -1);
                                int length4 = strArrSplit6.length;
                                o00oO0o[] o00oo0oArr2 = new o00oO0o[length4];
                                int i17 = i5;
                                while (i5 < strArrSplit6.length) {
                                    String[] strArrSplit7 = strArrSplit6[i5].split("/", i6);
                                    o00oO0o[] o00oo0oArr3 = o00oo0oArr2;
                                    o00oo0oArr3[i5] = new o00oO0o((long) Double.parseDouble(strArrSplit7[i17]), (long) Double.parseDouble(strArrSplit7[1]));
                                    i5++;
                                    i17 = 0;
                                    o00oo0oArr2 = o00oo0oArr3;
                                    i6 = -1;
                                }
                                o00oO0o[] o00oo0oArr4 = o00oo0oArr2;
                                Map map6 = (Map) arrayList.get(i4);
                                ByteBuffer byteBufferWrap4 = ByteBuffer.wrap(new byte[o00Oo0.f1380OooO0o[10] * length4]);
                                byteBufferWrap4.order(byteOrder);
                                for (int i18 = 0; i18 < length4; i18++) {
                                    o00oO0o o00oo0o3 = o00oo0oArr4[i18];
                                    byteBufferWrap4.putInt((int) o00oo0o3.f1385OooO00o);
                                    byteBufferWrap4.putInt((int) o00oo0o3.f1386OooO0O0);
                                }
                                map6.put(str4, new o00Oo0(10, length4, byteBufferWrap4.array()));
                                break;
                            case 12:
                                String[] strArrSplit8 = strReplaceAll.split(",", -1);
                                int length5 = strArrSplit8.length;
                                double[] dArr = new double[length5];
                                for (int i19 = i5; i19 < strArrSplit8.length; i19++) {
                                    dArr[i19] = Double.parseDouble(strArrSplit8[i19]);
                                }
                                Map map7 = (Map) arrayList.get(i4);
                                ByteBuffer byteBufferWrap5 = ByteBuffer.wrap(new byte[o00Oo0.f1380OooO0o[12] * length5]);
                                byteBufferWrap5.order(byteOrder);
                                for (int i20 = i5; i20 < length5; i20++) {
                                    byteBufferWrap5.putDouble(dArr[i20]);
                                }
                                map7.put(str4, new o00Oo0(12, length5, byteBufferWrap5.array()));
                                i3 = 1;
                                continue;
                        }
                        i3 = 1;
                        i5 = 0;
                        i2 = 2;
                    }
                }
                i4++;
            }
        }

        @NonNull
        public final void OooO0Oo(int i) {
            int i2;
            if (i == 0) {
                i2 = 1;
            } else if (i == 90) {
                i2 = 6;
            } else if (i == 180) {
                i2 = 3;
            } else if (i != 270) {
                o00O0O0.OooO0oo("ExifData", "Unexpected orientation value: " + i + ". Must be one of 0, 90, 180, 270.");
                i2 = 0;
            } else {
                i2 = 8;
            }
            OooO0OO("Orientation", String.valueOf(i2), this.f3800OooO00o);
        }
    }

    public enum WhiteBalanceMode {
        AUTO,
        MANUAL
    }

    static {
        oo000o[] oo000oVarArr = {new oo000o("ImageWidth", PSKKeyManager.MAX_KEY_LENGTH_BYTES, 3, 4), new oo000o("ImageLength", 257, 3, 4), new oo000o("Make", 271, 2), new oo000o("Model", 272, 2), new oo000o("Orientation", 274, 3), new oo000o("XResolution", 282, 5), new oo000o("YResolution", 283, 5), new oo000o("ResolutionUnit", 296, 3), new oo000o("Software", 305, 2), new oo000o("DateTime", 306, 2), new oo000o("YCbCrPositioning", 531, 3), new oo000o("SubIFDPointer", 330, 4), new oo000o("ExifIFDPointer", 34665, 4), new oo000o("GPSInfoIFDPointer", 34853, 4)};
        oo000o[] oo000oVarArr2 = {new oo000o("ExposureTime", 33434, 5), new oo000o("FNumber", 33437, 5), new oo000o("ExposureProgram", 34850, 3), new oo000o("PhotographicSensitivity", 34855, 3), new oo000o("SensitivityType", 34864, 3), new oo000o("ExifVersion", 36864, 2), new oo000o("DateTimeOriginal", 36867, 2), new oo000o("DateTimeDigitized", 36868, 2), new oo000o("ComponentsConfiguration", 37121, 7), new oo000o("ShutterSpeedValue", 37377, 10), new oo000o("ApertureValue", 37378, 5), new oo000o("BrightnessValue", 37379, 10), new oo000o("ExposureBiasValue", 37380, 10), new oo000o("MaxApertureValue", 37381, 5), new oo000o("MeteringMode", 37383, 3), new oo000o("LightSource", 37384, 3), new oo000o("Flash", 37385, 3), new oo000o("FocalLength", 37386, 5), new oo000o("SubSecTime", 37520, 2), new oo000o("SubSecTimeOriginal", 37521, 2), new oo000o("SubSecTimeDigitized", 37522, 2), new oo000o("FlashpixVersion", 40960, 7), new oo000o("ColorSpace", 40961, 3), new oo000o("PixelXDimension", 40962, 3, 4), new oo000o("PixelYDimension", 40963, 3, 4), new oo000o("InteroperabilityIFDPointer", 40965, 4), new oo000o("FocalPlaneResolutionUnit", 41488, 3), new oo000o("SensingMethod", 41495, 3), new oo000o("FileSource", 41728, 7), new oo000o("SceneType", 41729, 7), new oo000o("CustomRendered", 41985, 3), new oo000o("ExposureMode", 41986, 3), new oo000o("WhiteBalance", 41987, 3), new oo000o("SceneCaptureType", 41990, 3), new oo000o("Contrast", 41992, 3), new oo000o("Saturation", 41993, 3), new oo000o("Sharpness", 41994, 3)};
        oo000o[] oo000oVarArr3 = {new oo000o("GPSVersionID", 0, 1), new oo000o("GPSLatitudeRef", 1, 2), new oo000o("GPSLatitude", 2, 5, 10), new oo000o("GPSLongitudeRef", 3, 2), new oo000o("GPSLongitude", 4, 5, 10), new oo000o("GPSAltitudeRef", 5, 1), new oo000o("GPSAltitude", 6, 5), new oo000o("GPSTimeStamp", 7, 5), new oo000o("GPSSpeedRef", 12, 2), new oo000o("GPSTrackRef", 14, 2), new oo000o("GPSImgDirectionRef", 16, 2), new oo000o("GPSDestBearingRef", 23, 2), new oo000o("GPSDestDistanceRef", 25, 2)};
        f3789OooO0OO = new oo000o[]{new oo000o("SubIFDPointer", 330, 4), new oo000o("ExifIFDPointer", 34665, 4), new oo000o("GPSInfoIFDPointer", 34853, 4), new oo000o("InteroperabilityIFDPointer", 40965, 4)};
        f3790OooO0Oo = new oo000o[][]{oo000oVarArr, oo000oVarArr2, oo000oVarArr3, new oo000o[]{new oo000o("InteroperabilityIndex", 1, 2)}};
        f3791OooO0o0 = new HashSet<>(Arrays.asList("FNumber", "ExposureTime", "GPSTimeStamp"));
    }

    public ExifData(ByteOrder byteOrder, ArrayList arrayList) {
        OooOOO0.OooO0o("Malformed attributes list. Number of IFDs mismatch.", arrayList.size() == 4);
        this.f3793OooO0O0 = byteOrder;
        this.f3792OooO00o = arrayList;
    }

    @NonNull
    public final Map<String, o00Oo0> OooO00o(int i) {
        OooOOO0.OooO0OO(i, 0, 4, OooO0OO.OooO00o.OooO00o("Invalid IFD index: ", i, ". Index should be between [0, EXIF_TAGS.length] "));
        return this.f3792OooO00o.get(i);
    }
}

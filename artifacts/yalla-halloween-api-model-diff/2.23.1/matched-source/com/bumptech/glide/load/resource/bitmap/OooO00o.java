package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.PreferredColorSpace;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import o000O0Oo.OooOO0O;
import p041Ooooo0o.o00000;
import p153o00Oo0oo.o0OO00O;
import p153o00Oo0oo.oo0o0Oo;
import p156o00OoO00.OooO0o;
import p156o00OoO00.OooOO0;
import p160o00OoOOO.o000000O;
import p160o00OoOOO.o0000O00;
import p160o00OoOOO.oo000o;
import p174o00OooOo.o00OO0O0;
import p174o00OooOo.o00OO0OO;
import p174o00OooOo.oo0oOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final o0OO00O<Boolean> f13092OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final o0OO00O<DecodeFormat> f13093OooO0o = o0OO00O.OooO00o(DecodeFormat.DEFAULT, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final o0OO00O<PreferredColorSpace> f13094OooO0oO = new o0OO00O<>("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, o0OO00O.f37823OooO0o0);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final o0OO00O<Boolean> f13095OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final Set<String> f13096OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final C0192OooO00o f13097OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final Set<ImageHeaderParser.ImageType> f13098OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final ArrayDeque f13099OooOOO0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOO0 f13100OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final DisplayMetrics f13101OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0o f13102OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<ImageHeaderParser> f13103OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o000000O f13104OooO0o0 = o000000O.OooO00o();

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.OooO00o$OooO00o, reason: collision with other inner class name */
    public class C0192OooO00o implements OooO0O0 {
        @Override // com.bumptech.glide.load.resource.bitmap.OooO00o.OooO0O0
        public final void OooO00o(Bitmap bitmap, OooOO0 oooOO1) {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.OooO00o.OooO0O0
        public final void OooO0O0() {
        }
    }

    public interface OooO0O0 {
        void OooO00o(Bitmap bitmap, OooOO0 oooOO1) throws IOException;

        void OooO0O0();
    }

    static {
        DownsampleStrategy.OooO oooO = DownsampleStrategy.f13085OooO00o;
        Boolean bool = Boolean.FALSE;
        f13095OooO0oo = o0OO00O.OooO00o(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        f13092OooO = o0OO00O.OooO00o(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        f13096OooOO0 = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f13097OooOO0O = new C0192OooO00o();
        f13098OooOO0o = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        char[] cArr = o00OO0OO.f38349OooO00o;
        f13099OooOOO0 = new ArrayDeque(0);
    }

    public OooO00o(ArrayList arrayList, DisplayMetrics displayMetrics, OooOO0 oooOO1, OooO0o oooO0o) {
        this.f13103OooO0Oo = arrayList;
        o00OO0O0.OooO0O0(displayMetrics);
        this.f13101OooO0O0 = displayMetrics;
        o00OO0O0.OooO0O0(oooOO1);
        this.f13100OooO00o = oooOO1;
        o00OO0O0.OooO0O0(oooO0o);
        this.f13102OooO0OO = oooO0o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap OooO0OO(com.bumptech.glide.load.resource.bitmap.OooO0O0 oooO0O0, BitmapFactory.Options options, OooO0O0 oooO0O1, OooOO0 oooOO1) throws IOException {
        if (!options.inJustDecodeBounds) {
            oooO0O1.OooO0O0();
            oooO0O0.OooO0O0();
        }
        int i = options.outWidth;
        int i2 = options.outHeight;
        String str = options.outMimeType;
        Lock lock = o0000O00.f38064OooO0O0;
        lock.lock();
        try {
            try {
                Bitmap bitmapOooO00o = oooO0O0.OooO00o(options);
                lock.unlock();
                return bitmapOooO00o;
            } catch (IllegalArgumentException e) {
                IOException iOExceptionOooO0o0 = OooO0o0(e, i, i2, str, options);
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", iOExceptionOooO0o0);
                }
                Bitmap bitmap = options.inBitmap;
                if (bitmap == null) {
                    throw iOExceptionOooO0o0;
                }
                try {
                    oooOO1.OooO0Oo(bitmap);
                    options.inBitmap = null;
                    Bitmap bitmapOooO0OO = OooO0OO(oooO0O0, options, oooO0O1, oooOO1);
                    o0000O00.f38064OooO0O0.unlock();
                    return bitmapOooO0OO;
                } catch (IOException unused) {
                    throw iOExceptionOooO0o0;
                }
            }
        } catch (Throwable th) {
            o0000O00.f38064OooO0O0.unlock();
            throw th;
        }
    }

    @Nullable
    @TargetApi(19)
    public static String OooO0Oo(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static void OooO0o(BitmapFactory.Options options) {
        OooO0oO(options);
        ArrayDeque arrayDeque = f13099OooOOO0;
        synchronized (arrayDeque) {
            arrayDeque.offer(options);
        }
    }

    public static IOException OooO0o0(IllegalArgumentException illegalArgumentException, int i, int i2, String str, BitmapFactory.Options options) {
        StringBuilder sbOooO00o = o00000.OooO00o("Exception decoding bitmap, outWidth: ", i, ", outHeight: ", i2, ", outMimeType: ");
        sbOooO00o.append(str);
        sbOooO00o.append(", inBitmap: ");
        sbOooO00o.append(OooO0Oo(options.inBitmap));
        return new IOException(sbOooO00o.toString(), illegalArgumentException);
    }

    public static void OooO0oO(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final oo000o OooO00o(com.bumptech.glide.load.resource.bitmap.OooO0O0 oooO0O0, int i, int i2, oo0o0Oo oo0o0oo, OooO0O0 oooO0O1) throws IOException {
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        byte[] bArr = (byte[]) this.f13102OooO0OO.OooO0OO(65536, byte[].class);
        synchronized (OooO00o.class) {
            ArrayDeque arrayDeque = f13099OooOOO0;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                OooO0oO(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) oo0o0oo.OooO0OO(f13093OooO0o);
        PreferredColorSpace preferredColorSpace = (PreferredColorSpace) oo0o0oo.OooO0OO(f13094OooO0oO);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) oo0o0oo.OooO0OO(DownsampleStrategy.f13089OooO0o);
        boolean zBooleanValue = ((Boolean) oo0o0oo.OooO0OO(f13095OooO0oo)).booleanValue();
        o0OO00O<Boolean> o0oo00o2 = f13092OooO;
        try {
            return oo000o.OooO0O0(OooO0O0(oooO0O0, options2, downsampleStrategy, decodeFormat, preferredColorSpace, oo0o0oo.OooO0OO(o0oo00o2) != null && ((Boolean) oo0o0oo.OooO0OO(o0oo00o2)).booleanValue(), i, i2, zBooleanValue, oooO0O1), this.f13100OooO00o);
        } finally {
            OooO0o(options2);
            this.f13102OooO0OO.put(bArr);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x019f  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:106:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:109:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:110:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:118:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:119:0x0200  */
    /* JADX WARN: Code duplicated, block: B:122:0x020e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0266  */
    /* JADX WARN: Code duplicated, block: B:158:0x0350  */
    /* JADX WARN: Code duplicated, block: B:160:0x0354  */
    /* JADX WARN: Code duplicated, block: B:164:0x035b  */
    /* JADX WARN: Code duplicated, block: B:166:0x035e  */
    /* JADX WARN: Code duplicated, block: B:167:0x0364  */
    /* JADX WARN: Code duplicated, block: B:170:0x038b  */
    /* JADX WARN: Code duplicated, block: B:183:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:186:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:188:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:195:0x0400  */
    /* JADX WARN: Code duplicated, block: B:197:0x0403  */
    /* JADX WARN: Code duplicated, block: B:198:0x0408  */
    /* JADX WARN: Code duplicated, block: B:200:0x0414 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:201:0x0416  */
    /* JADX WARN: Code duplicated, block: B:204:0x0433  */
    /* JADX WARN: Code duplicated, block: B:206:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:208:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:209:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:211:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:212:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:215:0x04db  */
    /* JADX WARN: Code duplicated, block: B:216:0x04df  */
    /* JADX WARN: Code duplicated, block: B:217:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:218:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:219:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:220:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:221:0x0502  */
    /* JADX WARN: Code duplicated, block: B:224:0x0530  */
    /* JADX WARN: Code duplicated, block: B:225:0x0535  */
    /* JADX WARN: Code duplicated, block: B:229:0x0555  */
    /* JADX WARN: Code duplicated, block: B:79:0x0128  */
    /* JADX WARN: Code duplicated, block: B:81:0x0141  */
    /* JADX WARN: Code duplicated, block: B:82:0x0144  */
    /* JADX WARN: Instruction removed from duplicated block: B:204:0x0433, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [android.graphics.Bitmap, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [o00OoO00.OooOO0] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r45v0, types: [com.bumptech.glide.load.resource.bitmap.OooO00o$OooO0O0] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v15 */
    public final Bitmap OooO0O0(com.bumptech.glide.load.resource.bitmap.OooO0O0 oooO0O0, BitmapFactory.Options options, DownsampleStrategy downsampleStrategy, DecodeFormat decodeFormat, PreferredColorSpace preferredColorSpace, boolean z, int i, int i2, boolean z2, OooO0O0 oooO0O1) throws IOException {
        int i3;
        boolean z3;
        int i4;
        String str;
        String str2;
        String str3;
        int i5;
        int i6;
        int i7;
        int i8;
        String str4;
        boolean zHasAlpha;
        boolean z4;
        int i9;
        int i10;
        int i11;
        float f;
        OooOO0 oooOO1;
        int iRound;
        int iRound2;
        int i12;
        ?? r7;
        ?? r12;
        String str5;
        ?? OooO0OO2;
        boolean z5;
        Matrix matrix;
        Bitmap.Config config;
        boolean z6;
        ColorSpace.Named named;
        Bitmap.Config config2;
        int i13;
        int i14;
        int i15;
        int iMax;
        int iFloor;
        double dFloor;
        int iRound3;
        double dOooO0O0;
        double d;
        int i16;
        int i17;
        double d2;
        int i18;
        boolean z7;
        int i19;
        int i20 = i;
        int i21 = oo0oOO0.f38356OooO0O0;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        options.inJustDecodeBounds = true;
        OooOO0 oooOO2 = this.f13100OooO00o;
        OooO0OO(oooO0O0, options, oooO0O1, oooOO2);
        options.inJustDecodeBounds = false;
        int[] iArr = {options.outWidth, options.outHeight};
        int i22 = iArr[0];
        int i23 = iArr[1];
        String str6 = options.outMimeType;
        boolean z8 = (i22 == -1 || i23 == -1) ? false : z;
        int iOooO0OO = oooO0O0.OooO0OO();
        switch (iOooO0OO) {
            case 3:
            case 4:
                i3 = 180;
                break;
            case 5:
            case 6:
                i3 = 90;
                break;
            case 7:
            case 8:
                i3 = 270;
                break;
            default:
                i3 = 0;
                break;
        }
        int i24 = i3;
        switch (iOooO0OO) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                z3 = true;
                break;
            default:
                z3 = false;
                break;
        }
        int i25 = Integer.MIN_VALUE;
        if (i20 == Integer.MIN_VALUE) {
            i20 = i24 == 90 || i24 == 270 ? i23 : i22;
            i25 = Integer.MIN_VALUE;
        }
        if (i2 == i25) {
            i4 = i24 == 90 || i24 == 270 ? i22 : i23;
        } else {
            i4 = i2;
        }
        ImageHeaderParser.ImageType imageTypeOooO0Oo = oooO0O0.OooO0Oo();
        String str7 = ", density: ";
        boolean z9 = z3;
        boolean z10 = z8;
        if (i22 <= 0 || i23 <= 0) {
            str = ", target density: ";
            str2 = "Downsampler";
            str3 = "x";
            i5 = i22;
            i6 = i23;
            i7 = i4;
            i8 = i20;
            if (Log.isLoggable(str2, 3)) {
                Log.d(str2, "Unable to determine dimensions for: " + imageTypeOooO0Oo + " with target [" + i8 + str3 + i7 + "]");
            }
        } else {
            if (i24 == 90 || i24 == 270) {
                i14 = i23;
                i13 = i22;
            } else {
                i13 = i23;
                i14 = i22;
            }
            float fOooO0O0 = downsampleStrategy.OooO0O0(i14, i13, i20, i4);
            if (fOooO0O0 <= 0.0f) {
                StringBuilder sb = new StringBuilder("Cannot scale with factor: ");
                sb.append(fOooO0O0);
                sb.append(" from: ");
                sb.append(downsampleStrategy);
                sb.append(", source: [");
                OooOO0O.OooO00o(sb, i22, "x", i23, "], target: [");
                sb.append(i20);
                sb.append("x");
                sb.append(i4);
                sb.append("]");
                throw new IllegalArgumentException(sb.toString());
            }
            DownsampleStrategy.SampleSizeRounding sampleSizeRoundingOooO00o = downsampleStrategy.OooO00o(i14, i13, i20, i4);
            if (sampleSizeRoundingOooO00o == null) {
                throw new IllegalArgumentException("Cannot round with null rounding");
            }
            float f2 = i14;
            int i26 = i4;
            float f3 = i13;
            int i27 = i14 / ((int) (((double) (fOooO0O0 * f2)) + 0.5d));
            int i28 = i13 / ((int) (((double) (fOooO0O0 * f3)) + 0.5d));
            DownsampleStrategy.SampleSizeRounding sampleSizeRounding = DownsampleStrategy.SampleSizeRounding.MEMORY;
            int iMax2 = sampleSizeRoundingOooO00o == sampleSizeRounding ? Math.max(i27, i28) : Math.min(i27, i28);
            int i29 = Build.VERSION.SDK_INT;
            if (i29 <= 23) {
                i15 = i20;
                if (f13096OooOO0.contains(options.outMimeType)) {
                    iMax = 1;
                }
                options.inSampleSize = iMax;
                if (imageTypeOooO0Oo == ImageHeaderParser.ImageType.JPEG) {
                    float fMin = Math.min(iMax, 8);
                    iFloor = (int) Math.ceil(f2 / fMin);
                    iRound3 = (int) Math.ceil(f3 / fMin);
                    i19 = iMax / 8;
                    if (i19 > 0) {
                        iFloor /= i19;
                        iRound3 /= i19;
                    }
                } else {
                    if (imageTypeOooO0Oo != ImageHeaderParser.ImageType.PNG || imageTypeOooO0Oo == ImageHeaderParser.ImageType.PNG_A) {
                        float f4 = iMax;
                        iFloor = (int) Math.floor(f2 / f4);
                        dFloor = Math.floor(f3 / f4);
                    } else if (imageTypeOooO0Oo.isWebp()) {
                        if (i29 >= 24) {
                            float f5 = iMax;
                            iFloor = Math.round(f2 / f5);
                            iRound3 = Math.round(f3 / f5);
                        } else {
                            float f6 = iMax;
                            iFloor = (int) Math.floor(f2 / f6);
                            dFloor = Math.floor(f3 / f6);
                        }
                    } else if (i14 % iMax == 0 && i13 % iMax == 0) {
                        int i30 = i13 / iMax;
                        iFloor = i14 / iMax;
                        iRound3 = i30;
                    } else {
                        options.inJustDecodeBounds = true;
                        OooO0OO(oooO0O0, options, oooO0O1, oooOO2);
                        options.inJustDecodeBounds = false;
                        int[] iArr2 = {options.outWidth, options.outHeight};
                        iFloor = iArr2[0];
                        iRound3 = iArr2[1];
                    }
                    iRound3 = (int) dFloor;
                }
                i7 = i26;
                i8 = i15;
                dOooO0O0 = downsampleStrategy.OooO0O0(iFloor, iRound3, i8, i7);
                if (dOooO0O0 <= 1.0d) {
                    d = dOooO0O0;
                } else {
                    d = 1.0d / dOooO0O0;
                }
                int iRound4 = (int) Math.round(d * 2.147483647E9d);
                i16 = iMax;
                i17 = iRound3;
                int i31 = (int) ((((double) iRound4) * dOooO0O0) + 0.5d);
                options.inTargetDensity = (int) (((dOooO0O0 / ((double) (i31 / iRound4))) * ((double) i31)) + 0.5d);
                if (dOooO0O0 <= 1.0d) {
                    d2 = dOooO0O0;
                } else {
                    d2 = 1.0d / dOooO0O0;
                }
                int iRound5 = (int) Math.round(d2 * 2.147483647E9d);
                options.inDensity = iRound5;
                i18 = options.inTargetDensity;
                if (i18 > 0 || iRound5 <= 0 || i18 == iRound5) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                if (z7) {
                    options.inScaled = true;
                } else {
                    options.inTargetDensity = 0;
                    options.inDensity = 0;
                }
                str2 = "Downsampler";
                if (Log.isLoggable(str2, 2)) {
                    str3 = "x";
                    i6 = i23;
                    i5 = i22;
                    StringBuilder sbOooO00o = o00000.OooO00o("Calculate scaling, source: [", i5, str3, i6, "], degreesToRotate: ");
                    OooOO0O.OooO00o(sbOooO00o, i24, ", target: [", i8, str3);
                    OooOO0O.OooO00o(sbOooO00o, i7, "], power of two scaled: [", iFloor, str3);
                    sbOooO00o.append(i17);
                    sbOooO00o.append("], exact scale factor: ");
                    sbOooO00o.append(fOooO0O0);
                    sbOooO00o.append(", power of 2 sample size: ");
                    sbOooO00o.append(i16);
                    sbOooO00o.append(", adjusted scale factor: ");
                    sbOooO00o.append(dOooO0O0);
                    str = ", target density: ";
                    sbOooO00o.append(str);
                    sbOooO00o.append(options.inTargetDensity);
                    str7 = ", density: ";
                    sbOooO00o.append(str7);
                    sbOooO00o.append(options.inDensity);
                    Log.v(str2, sbOooO00o.toString());
                } else {
                    str7 = ", density: ";
                    str = ", target density: ";
                    str3 = "x";
                    i6 = i23;
                    i5 = i22;
                }
            } else {
                i15 = i20;
            }
            iMax = Math.max(1, Integer.highestOneBit(iMax2));
            if (sampleSizeRoundingOooO00o == sampleSizeRounding && iMax < 1.0f / fOooO0O0) {
                iMax <<= 1;
            }
            options.inSampleSize = iMax;
            if (imageTypeOooO0Oo == ImageHeaderParser.ImageType.JPEG) {
                float fMin2 = Math.min(iMax, 8);
                iFloor = (int) Math.ceil(f2 / fMin2);
                iRound3 = (int) Math.ceil(f3 / fMin2);
                i19 = iMax / 8;
                if (i19 > 0) {
                    iFloor /= i19;
                    iRound3 /= i19;
                }
            } else if (imageTypeOooO0Oo != ImageHeaderParser.ImageType.PNG) {
                float f7 = iMax;
                iFloor = (int) Math.floor(f2 / f7);
                dFloor = Math.floor(f3 / f7);
                iRound3 = (int) dFloor;
            } else {
                float f8 = iMax;
                iFloor = (int) Math.floor(f2 / f8);
                dFloor = Math.floor(f3 / f8);
                iRound3 = (int) dFloor;
            }
            i7 = i26;
            i8 = i15;
            dOooO0O0 = downsampleStrategy.OooO0O0(iFloor, iRound3, i8, i7);
            if (dOooO0O0 <= 1.0d) {
                d = dOooO0O0;
            } else {
                d = 1.0d / dOooO0O0;
            }
            int iRound6 = (int) Math.round(d * 2.147483647E9d);
            i16 = iMax;
            i17 = iRound3;
            int i32 = (int) ((((double) iRound6) * dOooO0O0) + 0.5d);
            options.inTargetDensity = (int) (((dOooO0O0 / ((double) (i32 / iRound6))) * ((double) i32)) + 0.5d);
            if (dOooO0O0 <= 1.0d) {
                d2 = dOooO0O0;
            } else {
                d2 = 1.0d / dOooO0O0;
            }
            int iRound7 = (int) Math.round(d2 * 2.147483647E9d);
            options.inDensity = iRound7;
            i18 = options.inTargetDensity;
            if (i18 > 0) {
                z7 = false;
            } else {
                z7 = false;
            }
            if (z7) {
                options.inScaled = true;
            } else {
                options.inTargetDensity = 0;
                options.inDensity = 0;
            }
            str2 = "Downsampler";
            if (Log.isLoggable(str2, 2)) {
                str3 = "x";
                i6 = i23;
                i5 = i22;
                StringBuilder sbOooO00o2 = o00000.OooO00o("Calculate scaling, source: [", i5, str3, i6, "], degreesToRotate: ");
                OooOO0O.OooO00o(sbOooO00o2, i24, ", target: [", i8, str3);
                OooOO0O.OooO00o(sbOooO00o2, i7, "], power of two scaled: [", iFloor, str3);
                sbOooO00o2.append(i17);
                sbOooO00o2.append("], exact scale factor: ");
                sbOooO00o2.append(fOooO0O0);
                sbOooO00o2.append(", power of 2 sample size: ");
                sbOooO00o2.append(i16);
                sbOooO00o2.append(", adjusted scale factor: ");
                sbOooO00o2.append(dOooO0O0);
                str = ", target density: ";
                sbOooO00o2.append(str);
                sbOooO00o2.append(options.inTargetDensity);
                str7 = ", density: ";
                sbOooO00o2.append(str7);
                sbOooO00o2.append(options.inDensity);
                Log.v(str2, sbOooO00o2.toString());
            } else {
                str7 = ", density: ";
                str = ", target density: ";
                str3 = "x";
                i6 = i23;
                i5 = i22;
            }
        }
        boolean zOooO0OO = this.f13104OooO0o0.OooO0OO(i8, i7, z10, z9);
        if (zOooO0OO) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        if (!zOooO0OO) {
            str4 = str7;
            if (decodeFormat != DecodeFormat.PREFER_ARGB_8888) {
                try {
                    zHasAlpha = oooO0O0.OooO0Oo().hasAlpha();
                } catch (IOException e) {
                    if (Log.isLoggable(str2, 3)) {
                        Log.d(str2, "Cannot determine whether the image has alpha or not from header, format " + decodeFormat, e);
                    }
                    zHasAlpha = false;
                }
                Bitmap.Config config3 = zHasAlpha ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                options.inPreferredConfig = config3;
                if (config3 == Bitmap.Config.RGB_565) {
                    z4 = true;
                    options.inDither = true;
                }
            } else {
                z4 = true;
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            }
            i9 = Build.VERSION.SDK_INT;
            i10 = options.inSampleSize;
            if (i5 >= 0 || i6 < 0 || !z2) {
                i11 = options.inTargetDensity;
                if (i11 > 0 || (i12 = options.inDensity) <= 0 || i11 == i12) {
                    z4 = false;
                }
                if (z4) {
                    f = i11 / options.inDensity;
                } else {
                    f = 1.0f;
                }
                float f9 = i10;
                int iCeil = (int) Math.ceil(i5 / f9);
                oooOO1 = oooOO2;
                int iCeil2 = (int) Math.ceil(i6 / f9);
                iRound = Math.round(iCeil * f);
                iRound2 = Math.round(iCeil2 * f);
                if (Log.isLoggable(str2, 2)) {
                    StringBuilder sbOooO00o3 = o00000.OooO00o("Calculated target [", iRound, str3, iRound2, "] for source [");
                    OooOO0O.OooO00o(sbOooO00o3, i5, str3, i6, "], sampleSize: ");
                    sbOooO00o3.append(i10);
                    sbOooO00o3.append(", targetDensity: ");
                    sbOooO00o3.append(options.inTargetDensity);
                    sbOooO00o3.append(str4);
                    sbOooO00o3.append(options.inDensity);
                    sbOooO00o3.append(", density multiplier: ");
                    sbOooO00o3.append(f);
                    Log.v(str2, sbOooO00o3.toString());
                }
            } else {
                iRound2 = i7;
                iRound = i8;
                oooOO1 = oooOO2;
            }
            r7 = 0;
            if (iRound > 0 || iRound2 <= 0) {
                r12 = oooOO1;
            } else {
                if (i9 < 26) {
                    config2 = null;
                } else if (options.inPreferredConfig == Bitmap.Config.HARDWARE) {
                    r12 = oooOO1;
                } else {
                    config2 = options.outConfig;
                }
                if (config2 == null) {
                    config2 = options.inPreferredConfig;
                }
                OooOO0 oooOO3 = oooOO1;
                options.inBitmap = oooOO3.OooO0OO(iRound, iRound2, config2);
                r12 = oooOO3;
            }
            str5 = str;
            if (preferredColorSpace != null) {
                if (i9 >= 28) {
                    if (preferredColorSpace == PreferredColorSpace.DISPLAY_P3 || options.outColorSpace == null || !options.outColorSpace.isWideGamut()) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    if (z6) {
                        named = ColorSpace.Named.DISPLAY_P3;
                    } else {
                        named = ColorSpace.Named.SRGB;
                    }
                    options.inPreferredColorSpace = ColorSpace.get(named);
                } else if (i9 >= 26) {
                    options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                }
            }
            OooO0OO2 = OooO0OO(oooO0O0, options, oooO0O1, r12);
            oooO0O1.OooO00o(OooO0OO2, r12);
            if (Log.isLoggable(str2, 2)) {
                Log.v(str2, "Decoded " + OooO0Oo(OooO0OO2) + " from [" + i5 + str3 + i6 + "] " + str6 + " with inBitmap " + OooO0Oo(options.inBitmap) + " for [" + i + str3 + i2 + "], sample size: " + options.inSampleSize + str4 + options.inDensity + str5 + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + oo0oOO0.OooO00o(jElapsedRealtimeNanos));
            }
            if (OooO0OO2 != 0) {
                OooO0OO2.setDensity(this.f13101OooO0O0.densityDpi);
                switch (iOooO0OO) {
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        z5 = true;
                        break;
                    default:
                        z5 = false;
                        break;
                }
                if (z5) {
                    matrix = new Matrix();
                    switch (iOooO0OO) {
                        case 2:
                            matrix.setScale(-1.0f, 1.0f);
                            break;
                        case 3:
                            matrix.setRotate(180.0f);
                            break;
                        case 4:
                            matrix.setRotate(180.0f);
                            matrix.postScale(-1.0f, 1.0f);
                            break;
                        case 5:
                            matrix.setRotate(90.0f);
                            matrix.postScale(-1.0f, 1.0f);
                            break;
                        case 6:
                            matrix.setRotate(90.0f);
                            break;
                        case 7:
                            matrix.setRotate(-90.0f);
                            matrix.postScale(-1.0f, 1.0f);
                            break;
                        case 8:
                            matrix.setRotate(-90.0f);
                            break;
                    }
                    RectF rectF = new RectF(0.0f, 0.0f, OooO0OO2.getWidth(), OooO0OO2.getHeight());
                    matrix.mapRect(rectF);
                    int iRound8 = Math.round(rectF.width());
                    int iRound9 = Math.round(rectF.height());
                    if (OooO0OO2.getConfig() != null) {
                        config = OooO0OO2.getConfig();
                    } else {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    Bitmap bitmapOooO0o0 = r12.OooO0o0(iRound8, iRound9, config);
                    matrix.postTranslate(-rectF.left, -rectF.top);
                    bitmapOooO0o0.setHasAlpha(OooO0OO2.hasAlpha());
                    o0000O00.OooO00o(OooO0OO2, bitmapOooO0o0, matrix);
                    r7 = bitmapOooO0o0;
                } else {
                    r7 = OooO0OO2;
                }
                if (!OooO0OO2.equals(r7)) {
                    r12.OooO0Oo(OooO0OO2);
                }
            }
            return r7;
        }
        str4 = str7;
        z4 = true;
        i9 = Build.VERSION.SDK_INT;
        i10 = options.inSampleSize;
        if (i5 >= 0) {
            i11 = options.inTargetDensity;
            if (i11 > 0) {
                z4 = false;
            } else {
                z4 = false;
            }
            if (z4) {
                f = i11 / options.inDensity;
            } else {
                f = 1.0f;
            }
            float f10 = i10;
            int iCeil3 = (int) Math.ceil(i5 / f10);
            oooOO1 = oooOO2;
            int iCeil4 = (int) Math.ceil(i6 / f10);
            iRound = Math.round(iCeil3 * f);
            iRound2 = Math.round(iCeil4 * f);
            if (Log.isLoggable(str2, 2)) {
                StringBuilder sbOooO00o4 = o00000.OooO00o("Calculated target [", iRound, str3, iRound2, "] for source [");
                OooOO0O.OooO00o(sbOooO00o4, i5, str3, i6, "], sampleSize: ");
                sbOooO00o4.append(i10);
                sbOooO00o4.append(", targetDensity: ");
                sbOooO00o4.append(options.inTargetDensity);
                sbOooO00o4.append(str4);
                sbOooO00o4.append(options.inDensity);
                sbOooO00o4.append(", density multiplier: ");
                sbOooO00o4.append(f);
                Log.v(str2, sbOooO00o4.toString());
            }
        } else {
            i11 = options.inTargetDensity;
            if (i11 > 0) {
                z4 = false;
            } else {
                z4 = false;
            }
            if (z4) {
                f = i11 / options.inDensity;
            } else {
                f = 1.0f;
            }
            float f11 = i10;
            int iCeil5 = (int) Math.ceil(i5 / f11);
            oooOO1 = oooOO2;
            int iCeil6 = (int) Math.ceil(i6 / f11);
            iRound = Math.round(iCeil5 * f);
            iRound2 = Math.round(iCeil6 * f);
            if (Log.isLoggable(str2, 2)) {
                StringBuilder sbOooO00o5 = o00000.OooO00o("Calculated target [", iRound, str3, iRound2, "] for source [");
                OooOO0O.OooO00o(sbOooO00o5, i5, str3, i6, "], sampleSize: ");
                sbOooO00o5.append(i10);
                sbOooO00o5.append(", targetDensity: ");
                sbOooO00o5.append(options.inTargetDensity);
                sbOooO00o5.append(str4);
                sbOooO00o5.append(options.inDensity);
                sbOooO00o5.append(", density multiplier: ");
                sbOooO00o5.append(f);
                Log.v(str2, sbOooO00o5.toString());
            }
        }
        r7 = 0;
        if (iRound > 0) {
            r12 = oooOO1;
        } else {
            r12 = oooOO1;
        }
        str5 = str;
        if (preferredColorSpace != null) {
            if (i9 >= 28) {
                if (preferredColorSpace == PreferredColorSpace.DISPLAY_P3) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                if (z6) {
                    named = ColorSpace.Named.DISPLAY_P3;
                } else {
                    named = ColorSpace.Named.SRGB;
                }
                options.inPreferredColorSpace = ColorSpace.get(named);
            } else if (i9 >= 26) {
                options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
        }
        OooO0OO2 = OooO0OO(oooO0O0, options, oooO0O1, r12);
        oooO0O1.OooO00o(OooO0OO2, r12);
        if (Log.isLoggable(str2, 2)) {
            Log.v(str2, "Decoded " + OooO0Oo(OooO0OO2) + " from [" + i5 + str3 + i6 + "] " + str6 + " with inBitmap " + OooO0Oo(options.inBitmap) + " for [" + i + str3 + i2 + "], sample size: " + options.inSampleSize + str4 + options.inDensity + str5 + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + oo0oOO0.OooO00o(jElapsedRealtimeNanos));
        }
        if (OooO0OO2 != 0) {
            OooO0OO2.setDensity(this.f13101OooO0O0.densityDpi);
            switch (iOooO0OO) {
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    z5 = true;
                    break;
                default:
                    z5 = false;
                    break;
            }
            if (z5) {
                r7 = OooO0OO2;
            } else {
                matrix = new Matrix();
                switch (iOooO0OO) {
                    case 2:
                        matrix.setScale(-1.0f, 1.0f);
                        break;
                    case 3:
                        matrix.setRotate(180.0f);
                        break;
                    case 4:
                        matrix.setRotate(180.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        break;
                    case 5:
                        matrix.setRotate(90.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        break;
                    case 6:
                        matrix.setRotate(90.0f);
                        break;
                    case 7:
                        matrix.setRotate(-90.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        break;
                    case 8:
                        matrix.setRotate(-90.0f);
                        break;
                }
                RectF rectF2 = new RectF(0.0f, 0.0f, OooO0OO2.getWidth(), OooO0OO2.getHeight());
                matrix.mapRect(rectF2);
                int iRound10 = Math.round(rectF2.width());
                int iRound11 = Math.round(rectF2.height());
                if (OooO0OO2.getConfig() != null) {
                    config = OooO0OO2.getConfig();
                } else {
                    config = Bitmap.Config.ARGB_8888;
                }
                Bitmap bitmapOooO0o1 = r12.OooO0o0(iRound10, iRound11, config);
                matrix.postTranslate(-rectF2.left, -rectF2.top);
                bitmapOooO0o1.setHasAlpha(OooO0OO2.hasAlpha());
                o0000O00.OooO00o(OooO0OO2, bitmapOooO0o1, matrix);
                r7 = bitmapOooO0o1;
            }
            if (!OooO0OO2.equals(r7)) {
                r12.OooO0Oo(OooO0OO2);
            }
        }
        return r7;
    }
}

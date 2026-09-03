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
import o00OO0O0.OooOOO0;
import o00OO0O0.o00Oo0;
import o00OO0O0.o0OO00O;
import p041Ooooo0o.o00000;
import p126o00O0oOo.o000000O;
import p129o00O0ooo.o0000;
import p129o00O0ooo.o0000oo;
import p532o0o0Oo.o00000O;
import p532o0o0Oo.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final o000000O<Boolean> f9991OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final o000000O<DecodeFormat> f9992OooO0o = o000000O.OooO00o(DecodeFormat.DEFAULT, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final o000000O<PreferredColorSpace> f9993OooO0oO = new o000000O<>("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, o000000O.f36726OooO0o0);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final o000000O<Boolean> f9994OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final Set<String> f9995OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final C0174OooO00o f9996OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final Set<ImageHeaderParser.ImageType> f9997OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final ArrayDeque f9998OooOOO0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0000oo f9999OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final DisplayMetrics f10000OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0000 f10001OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<ImageHeaderParser> f10002OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o00Oo0 f10003OooO0o0;

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.OooO00o$OooO00o, reason: collision with other inner class name */
    public class C0174OooO00o implements OooO0O0 {
        @Override // com.bumptech.glide.load.resource.bitmap.OooO00o.OooO0O0
        public final void OooO00o(Bitmap bitmap, o0000oo o0000ooVar) {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.OooO00o.OooO0O0
        public final void OooO0O0() {
        }
    }

    public interface OooO0O0 {
        void OooO00o(Bitmap bitmap, o0000oo o0000ooVar) throws IOException;

        void OooO0O0();
    }

    static {
        DownsampleStrategy.OooO oooO = DownsampleStrategy.f9984OooO00o;
        Boolean bool = Boolean.FALSE;
        f9994OooO0oo = o000000O.OooO00o(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        f9991OooO = o000000O.OooO00o(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        f9995OooOO0 = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f9996OooOO0O = new C0174OooO00o();
        f9997OooOO0o = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        char[] cArr = p532o0o0Oo.o0000oo.f54571OooO00o;
        f9998OooOOO0 = new ArrayDeque(0);
    }

    public OooO00o(ArrayList arrayList, DisplayMetrics displayMetrics, o0000oo o0000ooVar, o0000 o0000Var) {
        if (o00Oo0.f37229OooOO0 == null) {
            synchronized (o00Oo0.class) {
                if (o00Oo0.f37229OooOO0 == null) {
                    o00Oo0.f37229OooOO0 = new o00Oo0();
                }
            }
        }
        this.f10003OooO0o0 = o00Oo0.f37229OooOO0;
        this.f10002OooO0Oo = arrayList;
        o0000O00.OooO0O0(displayMetrics);
        this.f10000OooO0O0 = displayMetrics;
        o0000O00.OooO0O0(o0000ooVar);
        this.f9999OooO00o = o0000ooVar;
        o0000O00.OooO0O0(o0000Var);
        this.f10001OooO0OO = o0000Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap OooO0OO(com.bumptech.glide.load.resource.bitmap.OooO0O0 oooO0O0, BitmapFactory.Options options, OooO0O0 oooO0O1, o0000oo o0000ooVar) throws IOException {
        if (!options.inJustDecodeBounds) {
            oooO0O1.OooO0O0();
            oooO0O0.OooO0O0();
        }
        int i = options.outWidth;
        int i2 = options.outHeight;
        String str = options.outMimeType;
        Lock lock = o0OO00O.f37240OooO0O0;
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
                    o0000ooVar.OooO0Oo(bitmap);
                    options.inBitmap = null;
                    Bitmap bitmapOooO0OO = OooO0OO(oooO0O0, options, oooO0O1, o0000ooVar);
                    o0OO00O.f37240OooO0O0.unlock();
                    return bitmapOooO0OO;
                } catch (IOException unused) {
                    throw iOExceptionOooO0o0;
                }
            }
        } catch (Throwable th) {
            o0OO00O.f37240OooO0O0.unlock();
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
        ArrayDeque arrayDeque = f9998OooOOO0;
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

    public final OooOOO0 OooO00o(com.bumptech.glide.load.resource.bitmap.OooO0O0 oooO0O0, int i, int i2, p126o00O0oOo.o00000 o00000Var, OooO0O0 oooO0O1) throws IOException {
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        byte[] bArr = (byte[]) this.f10001OooO0OO.OooO0OO(65536, byte[].class);
        synchronized (OooO00o.class) {
            ArrayDeque arrayDeque = f9998OooOOO0;
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
        DecodeFormat decodeFormat = (DecodeFormat) o00000Var.OooO0OO(f9992OooO0o);
        PreferredColorSpace preferredColorSpace = (PreferredColorSpace) o00000Var.OooO0OO(f9993OooO0oO);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) o00000Var.OooO0OO(DownsampleStrategy.f9988OooO0o);
        boolean zBooleanValue = ((Boolean) o00000Var.OooO0OO(f9994OooO0oo)).booleanValue();
        o000000O<Boolean> o000000o2 = f9991OooO;
        try {
            return OooOOO0.OooO0OO(OooO0O0(oooO0O0, options2, downsampleStrategy, decodeFormat, preferredColorSpace, o00000Var.OooO0OO(o000000o2) != null && ((Boolean) o00000Var.OooO0OO(o000000o2)).booleanValue(), i, i2, zBooleanValue, oooO0O1), this.f9999OooO00o);
        } finally {
            OooO0o(options2);
            this.f10001OooO0OO.put(bArr);
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
    /* JADX WARN: Type inference failed for: r12v4, types: [o00O0ooo.o0000oo] */
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
        o0000oo o0000ooVar;
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
        int i21 = o00000O.f54564OooO0O0;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        options.inJustDecodeBounds = true;
        o0000oo o0000ooVar2 = this.f9999OooO00o;
        OooO0OO(oooO0O0, options, oooO0O1, o0000ooVar2);
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
                p082o000OoOo.OooOOO0.OooO00o(sb, i22, "x", i23, "], target: [");
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
                if (f9995OooOO0.contains(options.outMimeType)) {
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
                        OooO0OO(oooO0O0, options, oooO0O1, o0000ooVar2);
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
                    p082o000OoOo.OooOOO0.OooO00o(sbOooO00o, i24, ", target: [", i8, str3);
                    p082o000OoOo.OooOOO0.OooO00o(sbOooO00o, i7, "], power of two scaled: [", iFloor, str3);
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
                p082o000OoOo.OooOOO0.OooO00o(sbOooO00o2, i24, ", target: [", i8, str3);
                p082o000OoOo.OooOOO0.OooO00o(sbOooO00o2, i7, "], power of two scaled: [", iFloor, str3);
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
        boolean zOooO00o = this.f10003OooO0o0.OooO00o(i8, i7, z10, z9);
        if (zOooO00o) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        if (!zOooO00o) {
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
                o0000ooVar = o0000ooVar2;
                int iCeil2 = (int) Math.ceil(i6 / f9);
                iRound = Math.round(iCeil * f);
                iRound2 = Math.round(iCeil2 * f);
                if (Log.isLoggable(str2, 2)) {
                    StringBuilder sbOooO00o3 = o00000.OooO00o("Calculated target [", iRound, str3, iRound2, "] for source [");
                    p082o000OoOo.OooOOO0.OooO00o(sbOooO00o3, i5, str3, i6, "], sampleSize: ");
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
                o0000ooVar = o0000ooVar2;
            }
            r7 = 0;
            if (iRound > 0 || iRound2 <= 0) {
                r12 = o0000ooVar;
            } else {
                if (i9 < 26) {
                    config2 = null;
                } else if (options.inPreferredConfig == Bitmap.Config.HARDWARE) {
                    r12 = o0000ooVar;
                } else {
                    config2 = options.outConfig;
                }
                if (config2 == null) {
                    config2 = options.inPreferredConfig;
                }
                o0000oo o0000ooVar3 = o0000ooVar;
                options.inBitmap = o0000ooVar3.OooO0OO(iRound, iRound2, config2);
                r12 = o0000ooVar3;
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
                Log.v(str2, "Decoded " + OooO0Oo(OooO0OO2) + " from [" + i5 + str3 + i6 + "] " + str6 + " with inBitmap " + OooO0Oo(options.inBitmap) + " for [" + i + str3 + i2 + "], sample size: " + options.inSampleSize + str4 + options.inDensity + str5 + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + o00000O.OooO00o(jElapsedRealtimeNanos));
            }
            if (OooO0OO2 != 0) {
                OooO0OO2.setDensity(this.f10000OooO0O0.densityDpi);
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
                    o0OO00O.OooO00o(OooO0OO2, bitmapOooO0o0, matrix);
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
            o0000ooVar = o0000ooVar2;
            int iCeil4 = (int) Math.ceil(i6 / f10);
            iRound = Math.round(iCeil3 * f);
            iRound2 = Math.round(iCeil4 * f);
            if (Log.isLoggable(str2, 2)) {
                StringBuilder sbOooO00o4 = o00000.OooO00o("Calculated target [", iRound, str3, iRound2, "] for source [");
                p082o000OoOo.OooOOO0.OooO00o(sbOooO00o4, i5, str3, i6, "], sampleSize: ");
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
            o0000ooVar = o0000ooVar2;
            int iCeil6 = (int) Math.ceil(i6 / f11);
            iRound = Math.round(iCeil5 * f);
            iRound2 = Math.round(iCeil6 * f);
            if (Log.isLoggable(str2, 2)) {
                StringBuilder sbOooO00o5 = o00000.OooO00o("Calculated target [", iRound, str3, iRound2, "] for source [");
                p082o000OoOo.OooOOO0.OooO00o(sbOooO00o5, i5, str3, i6, "], sampleSize: ");
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
            r12 = o0000ooVar;
        } else {
            r12 = o0000ooVar;
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
            Log.v(str2, "Decoded " + OooO0Oo(OooO0OO2) + " from [" + i5 + str3 + i6 + "] " + str6 + " with inBitmap " + OooO0Oo(options.inBitmap) + " for [" + i + str3 + i2 + "], sample size: " + options.inSampleSize + str4 + options.inDensity + str5 + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + o00000O.OooO00o(jElapsedRealtimeNanos));
        }
        if (OooO0OO2 != 0) {
            OooO0OO2.setDensity(this.f10000OooO0O0.densityDpi);
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
                o0OO00O.OooO00o(OooO0OO2, bitmapOooO0o1, matrix);
                r7 = bitmapOooO0o1;
            }
            if (!OooO0OO2.equals(r7)) {
                r12.OooO0Oo(OooO0OO2);
            }
        }
        return r7;
    }
}

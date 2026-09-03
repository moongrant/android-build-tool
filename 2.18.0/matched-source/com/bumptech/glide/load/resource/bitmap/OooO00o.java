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
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import p042Ooooo0o.o000O0Oo;
import p215o00oO0.o00OOO0O;
import p218o00oO00o.o00000;
import p218o00oO00o.o000000O;
import p220o00oO0O0.o0O00o0;
import p220o00oO0O0.o0oOOo;
import p225o00oOOOo.oO;
import p225o00oOOOo.oOO00O0;
import p225o00oOOOo.oOo0o0oO;
import p244o00oo00O.o0000O0O;
import p244o00oo00O.o000O000;
import p710oo000o.Oooo0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final o000000O<Boolean> f12527OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final o000000O<DecodeFormat> f12528OooO0o = o000000O.OooO00o("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", DecodeFormat.DEFAULT);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final o000000O<PreferredColorSpace> f12529OooO0oO = o000000O.OooO00o("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", PreferredColorSpace.SRGB);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final o000000O<Boolean> f12530OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final Set<String> f12531OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final C0080OooO00o f12532OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final Set<ImageHeaderParser.ImageType> f12533OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final Queue<BitmapFactory.Options> f12534OooOOO0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0oOOo f12535OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final DisplayMetrics f12536OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0O00o0 f12537OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<ImageHeaderParser> f12538OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final oO f12539OooO0o0 = oO.OooO00o();

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.OooO00o$OooO00o, reason: collision with other inner class name */
    public class C0080OooO00o implements OooO0O0 {
        @Override // com.bumptech.glide.load.resource.bitmap.OooO00o.OooO0O0
        public final void OooO00o(o0oOOo o0oooo2, Bitmap bitmap) {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.OooO00o.OooO0O0
        public final void OooO0O0() {
        }
    }

    public interface OooO0O0 {
        void OooO00o(o0oOOo o0oooo2, Bitmap bitmap) throws IOException;

        void OooO0O0();
    }

    static {
        o000000O<DownsampleStrategy> o000000o2 = DownsampleStrategy.f12524OooO0o;
        Boolean bool = Boolean.FALSE;
        f12530OooO0oo = o000000O.OooO00o("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f12527OooO = o000000O.OooO00o("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
        f12531OooOO0 = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        f12532OooOO0O = new C0080OooO00o();
        f12533OooOO0o = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        char[] cArr = o000O000.f34199OooO00o;
        f12534OooOOO0 = new ArrayDeque(0);
    }

    public OooO00o(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, o0oOOo o0oooo2, o0O00o0 o0o00o1) {
        this.f12538OooO0Oo = list;
        Objects.requireNonNull(displayMetrics, "Argument must not be null");
        this.f12536OooO0O0 = displayMetrics;
        Objects.requireNonNull(o0oooo2, "Argument must not be null");
        this.f12535OooO00o = o0oooo2;
        Objects.requireNonNull(o0o00o1, "Argument must not be null");
        this.f12537OooO0OO = o0o00o1;
    }

    public static void OooO(BitmapFactory.Options options) {
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

    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap OooO0OO(com.bumptech.glide.load.resource.bitmap.OooO0O0 oooO0O0, BitmapFactory.Options options, OooO0O0 oooO0O1, o0oOOo o0oooo2) throws IOException {
        if (!options.inJustDecodeBounds) {
            oooO0O1.OooO0O0();
            oooO0O0.OooO0OO();
        }
        int i = options.outWidth;
        int i2 = options.outHeight;
        String str = options.outMimeType;
        Lock lock = oOO00O0.f33858OooO0OO;
        lock.lock();
        try {
            try {
                Bitmap bitmapOooO0O0 = oooO0O0.OooO0O0(options);
                lock.unlock();
                return bitmapOooO0O0;
            } catch (IllegalArgumentException e) {
                IOException iOExceptionOooO0oo = OooO0oo(e, i, i2, str, options);
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", iOExceptionOooO0oo);
                }
                Bitmap bitmap = options.inBitmap;
                if (bitmap == null) {
                    throw iOExceptionOooO0oo;
                }
                try {
                    o0oooo2.OooO0O0(bitmap);
                    options.inBitmap = null;
                    Bitmap bitmapOooO0OO = OooO0OO(oooO0O0, options, oooO0O1, o0oooo2);
                    oOO00O0.f33858OooO0OO.unlock();
                    return bitmapOooO0OO;
                } catch (IOException unused) {
                    throw iOExceptionOooO0oo;
                }
            }
        } catch (Throwable th) {
            oOO00O0.f33858OooO0OO.unlock();
            throw th;
        }
    }

    @Nullable
    @TargetApi(19)
    public static String OooO0Oo(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0(" (");
        sbOooO0O0.append(bitmap.getAllocationByteCount());
        sbOooO0O0.append(")");
        String string = sbOooO0O0.toString();
        StringBuilder sbOooO0O1 = OooO00o.OooO00o.OooO0O0("[");
        sbOooO0O1.append(bitmap.getWidth());
        sbOooO0O1.append("x");
        sbOooO0O1.append(bitmap.getHeight());
        sbOooO0O1.append("] ");
        sbOooO0O1.append(bitmap.getConfig());
        sbOooO0O1.append(string);
        return sbOooO0O1.toString();
    }

    public static int[] OooO0o(com.bumptech.glide.load.resource.bitmap.OooO0O0 oooO0O0, BitmapFactory.Options options, OooO0O0 oooO0O1, o0oOOo o0oooo2) throws IOException {
        options.inJustDecodeBounds = true;
        OooO0OO(oooO0O0, options, oooO0O1, o0oooo2);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    public static int OooO0o0(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(d * 2.147483647E9d);
    }

    public static boolean OooO0oO(int i) {
        return i == 90 || i == 270;
    }

    public static IOException OooO0oo(IllegalArgumentException illegalArgumentException, int i, int i2, String str, BitmapFactory.Options options) {
        StringBuilder sbOooO0OO = o000O0Oo.OooO0OO("Exception decoding bitmap, outWidth: ", i, ", outHeight: ", i2, ", outMimeType: ");
        sbOooO0OO.append(str);
        sbOooO0OO.append(", inBitmap: ");
        sbOooO0OO.append(OooO0Oo(options.inBitmap));
        return new IOException(sbOooO0OO.toString(), illegalArgumentException);
    }

    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.ArrayDeque, java.util.Queue<android.graphics.BitmapFactory$Options>] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayDeque, java.util.Queue<android.graphics.BitmapFactory$Options>] */
    public final o00OOO0O<Bitmap> OooO00o(com.bumptech.glide.load.resource.bitmap.OooO0O0 oooO0O0, int i, int i2, o00000 o00000Var, OooO0O0 oooO0O1) throws IOException {
        ?? r14;
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        byte[] bArr = (byte[]) this.f12537OooO0OO.OooO0oO(65536, byte[].class);
        synchronized (OooO00o.class) {
            r14 = f12534OooOOO0;
            synchronized (r14) {
                options = (BitmapFactory.Options) r14.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                OooO(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) o00000Var.OooO0OO(f12528OooO0o);
        PreferredColorSpace preferredColorSpace = (PreferredColorSpace) o00000Var.OooO0OO(f12529OooO0oO);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) o00000Var.OooO0OO(DownsampleStrategy.f12524OooO0o);
        boolean zBooleanValue = ((Boolean) o00000Var.OooO0OO(f12530OooO0oo)).booleanValue();
        o000000O<Boolean> o000000o2 = f12527OooO;
        try {
            oOo0o0oO ooo0o0ooOooO0O0 = oOo0o0oO.OooO0O0(OooO0O0(oooO0O0, options2, downsampleStrategy, decodeFormat, preferredColorSpace, o00000Var.OooO0OO(o000000o2) != null && ((Boolean) o00000Var.OooO0OO(o000000o2)).booleanValue(), i, i2, zBooleanValue, oooO0O1), this.f12535OooO00o);
            OooO(options2);
            synchronized (r14) {
                r14.offer(options2);
            }
            return ooo0o0ooOooO0O0;
        } finally {
            OooO(options2);
            ?? r2 = f12534OooOOO0;
            synchronized (r2) {
                r2.offer(options2);
                this.f12537OooO0OO.OooO0o(bArr);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x010b  */
    /* JADX WARN: Code duplicated, block: B:58:0x0124  */
    /* JADX WARN: Code duplicated, block: B:60:0x012d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0177  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:91:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:95:0x022d  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Bitmap OooO0O0(com.bumptech.glide.load.resource.bitmap.OooO0O0 oooO0O0, BitmapFactory.Options options, DownsampleStrategy downsampleStrategy, DecodeFormat decodeFormat, PreferredColorSpace preferredColorSpace, boolean z, int i, int i2, boolean z2, OooO0O0 oooO0O1) throws IOException {
        int i3;
        int i4;
        String str;
        int i5;
        String str2;
        boolean zHasAlpha;
        int iRound;
        int i6;
        int i7;
        Bitmap bitmap;
        ColorSpace colorSpace;
        Bitmap.Config config;
        int i8;
        int i9;
        String str3;
        int iMax;
        int iFloor;
        double dFloor;
        int iRound2;
        double dOooO0O0;
        int i10;
        boolean z3;
        int i11;
        int i12 = o0000O0O.f34186OooO0O0;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int[] iArrOooO0o = OooO0o(oooO0O0, options, oooO0O1, this.f12535OooO00o);
        int i13 = iArrOooO0o[0];
        int i14 = iArrOooO0o[1];
        String str4 = options.outMimeType;
        boolean z4 = (i13 == -1 || i14 == -1) ? false : z;
        int iOooO00o = oooO0O0.OooO00o();
        switch (iOooO00o) {
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
        boolean zOooO0Oo = oOO00O0.OooO0Oo(iOooO00o);
        if (i == Integer.MIN_VALUE) {
            i4 = OooO0oO(i3) ? i14 : i13;
        } else {
            i4 = i;
        }
        if (i2 == Integer.MIN_VALUE) {
            str = str4;
            i5 = OooO0oO(i3) ? i13 : i14;
        } else {
            str = str4;
            i5 = i2;
        }
        ImageHeaderParser.ImageType imageTypeOooO0Oo = oooO0O0.OooO0Oo();
        o0oOOo o0oooo2 = this.f12535OooO00o;
        String str5 = ", target density: ";
        String str6 = ", density: ";
        String str7 = "x";
        String str8 = "Downsampler";
        if (i13 <= 0 || i14 <= 0) {
            int i15 = 3;
            if (Log.isLoggable(str8, i15)) {
                Log.d(str8, "Unable to determine dimensions for: " + imageTypeOooO0Oo + " with target [" + i4 + str7 + i5 + "]");
            }
        } else {
            if (OooO0oO(i3)) {
                i9 = i14;
                i8 = i13;
            } else {
                i8 = i14;
                i9 = i13;
            }
            float fOooO0O0 = downsampleStrategy.OooO0O0(i9, i8, i4, i5);
            if (fOooO0O0 <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                throw new IllegalArgumentException("Cannot scale with factor: " + fOooO0O0 + " from: " + downsampleStrategy + ", source: [" + i13 + "x" + i14 + "], target: [" + i4 + "x" + i5 + "]");
            }
            int i16 = i3;
            DownsampleStrategy.SampleSizeRounding sampleSizeRoundingOooO00o = downsampleStrategy.OooO00o(i9, i8, i4, i5);
            if (sampleSizeRoundingOooO00o == null) {
                throw new IllegalArgumentException("Cannot round with null rounding");
            }
            float f = i9;
            float f2 = i8;
            int i17 = i5;
            int i18 = i4;
            int i19 = i9 / ((int) (((double) (fOooO0O0 * f)) + 0.5d));
            int i20 = i8 / ((int) (((double) (fOooO0O0 * f2)) + 0.5d));
            DownsampleStrategy.SampleSizeRounding sampleSizeRounding = DownsampleStrategy.SampleSizeRounding.MEMORY;
            int iMax2 = sampleSizeRoundingOooO00o == sampleSizeRounding ? Math.max(i19, i20) : Math.min(i19, i20);
            int i21 = Build.VERSION.SDK_INT;
            if (i21 <= 23) {
                str3 = "x";
                if (f12531OooOO0.contains(options.outMimeType)) {
                    iMax = 1;
                }
                options.inSampleSize = iMax;
                if (imageTypeOooO0Oo == ImageHeaderParser.ImageType.JPEG) {
                    float fMin = Math.min(iMax, 8);
                    iFloor = (int) Math.ceil(f / fMin);
                    iRound2 = (int) Math.ceil(f2 / fMin);
                    i11 = iMax / 8;
                    if (i11 > 0) {
                        iFloor /= i11;
                        iRound2 /= i11;
                    }
                } else {
                    if (imageTypeOooO0Oo != ImageHeaderParser.ImageType.PNG || imageTypeOooO0Oo == ImageHeaderParser.ImageType.PNG_A) {
                        float f3 = iMax;
                        iFloor = (int) Math.floor(f / f3);
                        dFloor = Math.floor(f2 / f3);
                    } else if (imageTypeOooO0Oo == ImageHeaderParser.ImageType.WEBP || imageTypeOooO0Oo == ImageHeaderParser.ImageType.WEBP_A) {
                        if (i21 >= 24) {
                            float f4 = iMax;
                            iFloor = Math.round(f / f4);
                            iRound2 = Math.round(f2 / f4);
                        } else {
                            float f5 = iMax;
                            iFloor = (int) Math.floor(f / f5);
                            dFloor = Math.floor(f2 / f5);
                        }
                    } else if (i9 % iMax == 0 && i8 % iMax == 0) {
                        iFloor = i9 / iMax;
                        iRound2 = i8 / iMax;
                    } else {
                        int[] iArrOooO0o2 = OooO0o(oooO0O0, options, oooO0O1, o0oooo2);
                        iFloor = iArrOooO0o2[0];
                        iRound2 = iArrOooO0o2[1];
                    }
                    iRound2 = (int) dFloor;
                }
                i4 = i18;
                i5 = i17;
                dOooO0O0 = downsampleStrategy.OooO0O0(iFloor, iRound2, i4, i5);
                int iOooO0o0 = OooO0o0(dOooO0O0);
                int i22 = (int) ((((double) iOooO0o0) * dOooO0O0) + 0.5d);
                options.inTargetDensity = (int) (((dOooO0O0 / ((double) (i22 / iOooO0o0))) * ((double) i22)) + 0.5d);
                int iOooO0o1 = OooO0o0(dOooO0O0);
                options.inDensity = iOooO0o1;
                i10 = options.inTargetDensity;
                if (i10 > 0 || iOooO0o1 <= 0 || i10 == iOooO0o1) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z3) {
                    options.inScaled = true;
                } else {
                    options.inTargetDensity = 0;
                    options.inDensity = 0;
                }
                str8 = "Downsampler";
                if (Log.isLoggable(str8, 2)) {
                    i14 = i14;
                    i13 = i13;
                    str7 = str3;
                    StringBuilder sbOooO0OO = o000O0Oo.OooO0OO("Calculate scaling, source: [", i13, str7, i14, "], degreesToRotate: ");
                    sbOooO0OO.append(i16);
                    sbOooO0OO.append(", target: [");
                    sbOooO0OO.append(i4);
                    sbOooO0OO.append(str7);
                    sbOooO0OO.append(i5);
                    sbOooO0OO.append("], power of two scaled: [");
                    sbOooO0OO.append(iFloor);
                    sbOooO0OO.append(str7);
                    sbOooO0OO.append(iRound2);
                    sbOooO0OO.append("], exact scale factor: ");
                    sbOooO0OO.append(fOooO0O0);
                    sbOooO0OO.append(", power of 2 sample size: ");
                    sbOooO0OO.append(iMax);
                    sbOooO0OO.append(", adjusted scale factor: ");
                    sbOooO0OO.append(dOooO0O0);
                    str5 = ", target density: ";
                    sbOooO0OO.append(str5);
                    sbOooO0OO.append(options.inTargetDensity);
                    str6 = ", density: ";
                    sbOooO0OO.append(str6);
                    sbOooO0OO.append(options.inDensity);
                    Log.v(str8, sbOooO0OO.toString());
                } else {
                    str6 = str6;
                    str5 = str5;
                    i14 = i14;
                    i13 = i13;
                    str7 = str3;
                }
            } else {
                str3 = "x";
            }
            iMax = Math.max(1, Integer.highestOneBit(iMax2));
            if (sampleSizeRoundingOooO00o == sampleSizeRounding && iMax < 1.0f / fOooO0O0) {
                iMax <<= 1;
            }
            options.inSampleSize = iMax;
            if (imageTypeOooO0Oo == ImageHeaderParser.ImageType.JPEG) {
                float fMin2 = Math.min(iMax, 8);
                iFloor = (int) Math.ceil(f / fMin2);
                iRound2 = (int) Math.ceil(f2 / fMin2);
                i11 = iMax / 8;
                if (i11 > 0) {
                    iFloor /= i11;
                    iRound2 /= i11;
                }
            } else if (imageTypeOooO0Oo != ImageHeaderParser.ImageType.PNG) {
                float f6 = iMax;
                iFloor = (int) Math.floor(f / f6);
                dFloor = Math.floor(f2 / f6);
                iRound2 = (int) dFloor;
            } else {
                float f7 = iMax;
                iFloor = (int) Math.floor(f / f7);
                dFloor = Math.floor(f2 / f7);
                iRound2 = (int) dFloor;
            }
            i4 = i18;
            i5 = i17;
            dOooO0O0 = downsampleStrategy.OooO0O0(iFloor, iRound2, i4, i5);
            int iOooO0o2 = OooO0o0(dOooO0O0);
            int i23 = (int) ((((double) iOooO0o2) * dOooO0O0) + 0.5d);
            options.inTargetDensity = (int) (((dOooO0O0 / ((double) (i23 / iOooO0o2))) * ((double) i23)) + 0.5d);
            int iOooO0o3 = OooO0o0(dOooO0O0);
            options.inDensity = iOooO0o3;
            i10 = options.inTargetDensity;
            if (i10 > 0) {
                z3 = false;
            } else {
                z3 = false;
            }
            if (z3) {
                options.inScaled = true;
            } else {
                options.inTargetDensity = 0;
                options.inDensity = 0;
            }
            str8 = "Downsampler";
            if (Log.isLoggable(str8, 2)) {
                i14 = i14;
                i13 = i13;
                str7 = str3;
                StringBuilder sbOooO0OO2 = o000O0Oo.OooO0OO("Calculate scaling, source: [", i13, str7, i14, "], degreesToRotate: ");
                sbOooO0OO2.append(i16);
                sbOooO0OO2.append(", target: [");
                sbOooO0OO2.append(i4);
                sbOooO0OO2.append(str7);
                sbOooO0OO2.append(i5);
                sbOooO0OO2.append("], power of two scaled: [");
                sbOooO0OO2.append(iFloor);
                sbOooO0OO2.append(str7);
                sbOooO0OO2.append(iRound2);
                sbOooO0OO2.append("], exact scale factor: ");
                sbOooO0OO2.append(fOooO0O0);
                sbOooO0OO2.append(", power of 2 sample size: ");
                sbOooO0OO2.append(iMax);
                sbOooO0OO2.append(", adjusted scale factor: ");
                sbOooO0OO2.append(dOooO0O0);
                str5 = ", target density: ";
                sbOooO0OO2.append(str5);
                sbOooO0OO2.append(options.inTargetDensity);
                str6 = ", density: ";
                sbOooO0OO2.append(str6);
                sbOooO0OO2.append(options.inDensity);
                Log.v(str8, sbOooO0OO2.toString());
            } else {
                str6 = str6;
                str5 = str5;
                i14 = i14;
                i13 = i13;
                str7 = str3;
            }
        }
        String str9 = str8;
        int i24 = i5;
        int i25 = i4;
        int i26 = i4;
        String str10 = str;
        boolean z5 = z4;
        String str11 = str5;
        if (this.f12539OooO0o0.OooO0OO(i25, i24, options, z5, zOooO0Oo)) {
            str2 = str7;
        } else {
            str2 = str7;
            if (decodeFormat != DecodeFormat.PREFER_ARGB_8888) {
                try {
                    zHasAlpha = oooO0O0.OooO0Oo().hasAlpha();
                } catch (IOException e) {
                    if (Log.isLoggable(str9, 3)) {
                        Log.d(str9, "Cannot determine whether the image has alpha or not from header, format " + decodeFormat, e);
                    }
                    zHasAlpha = false;
                }
                Bitmap.Config config2 = zHasAlpha ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                options.inPreferredConfig = config2;
                if (config2 == Bitmap.Config.RGB_565) {
                    options.inDither = true;
                }
            } else {
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            }
        }
        int i27 = Build.VERSION.SDK_INT;
        int i28 = options.inSampleSize;
        if (i13 < 0 || i14 < 0 || !z2) {
            int i29 = options.inTargetDensity;
            float f8 = i29 > 0 && (i7 = options.inDensity) > 0 && i29 != i7 ? i29 / options.inDensity : 1.0f;
            float f9 = i28;
            int iCeil = (int) Math.ceil(i13 / f9);
            int iCeil2 = (int) Math.ceil(i14 / f9);
            iRound = Math.round(iCeil * f8);
            int iRound3 = Math.round(iCeil2 * f8);
            if (Log.isLoggable(str9, 2)) {
                StringBuilder sbOooO0OO3 = o000O0Oo.OooO0OO("Calculated target [", iRound, str2, iRound3, "] for source [");
                sbOooO0OO3.append(i13);
                sbOooO0OO3.append(str2);
                sbOooO0OO3.append(i14);
                sbOooO0OO3.append("], sampleSize: ");
                sbOooO0OO3.append(i28);
                sbOooO0OO3.append(", targetDensity: ");
                sbOooO0OO3.append(options.inTargetDensity);
                sbOooO0OO3.append(str6);
                sbOooO0OO3.append(options.inDensity);
                sbOooO0OO3.append(", density multiplier: ");
                sbOooO0OO3.append(f8);
                Log.v(str9, sbOooO0OO3.toString());
            }
            i6 = iRound3;
        } else {
            i6 = i24;
            iRound = i26;
        }
        if (iRound > 0 && i6 > 0) {
            o0oOOo o0oooo3 = this.f12535OooO00o;
            if (i27 >= 26) {
                config = options.inPreferredConfig != Bitmap.Config.HARDWARE ? options.outConfig : null;
            }
            if (config == null) {
                config = options.inPreferredConfig;
            }
            options.inBitmap = o0oooo3.OooO0Oo(iRound, i6, config);
        }
        if (i27 >= 28) {
            options.inPreferredColorSpace = ColorSpace.get(preferredColorSpace == PreferredColorSpace.DISPLAY_P3 && (colorSpace = options.outColorSpace) != null && colorSpace.isWideGamut() ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
        } else if (i27 >= 26) {
            options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        Bitmap bitmapOooO0OO = OooO0OO(oooO0O0, options, oooO0O1, this.f12535OooO00o);
        oooO0O1.OooO00o(this.f12535OooO00o, bitmapOooO0OO);
        if (Log.isLoggable(str9, 2)) {
            StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0("Decoded ");
            sbOooO0O0.append(OooO0Oo(bitmapOooO0OO));
            sbOooO0O0.append(" from [");
            sbOooO0O0.append(i13);
            sbOooO0O0.append(str2);
            sbOooO0O0.append(i14);
            Oooo0.OooO00o(sbOooO0O0, "] ", str10, " with inBitmap ");
            sbOooO0O0.append(OooO0Oo(options.inBitmap));
            sbOooO0O0.append(" for [");
            sbOooO0O0.append(i);
            sbOooO0O0.append(str2);
            sbOooO0O0.append(i2);
            sbOooO0O0.append("], sample size: ");
            sbOooO0O0.append(options.inSampleSize);
            sbOooO0O0.append(str6);
            sbOooO0O0.append(options.inDensity);
            sbOooO0O0.append(str11);
            sbOooO0O0.append(options.inTargetDensity);
            sbOooO0O0.append(", thread: ");
            sbOooO0O0.append(Thread.currentThread().getName());
            sbOooO0O0.append(", duration: ");
            sbOooO0O0.append(o0000O0O.OooO00o(jElapsedRealtimeNanos));
            Log.v(str9, sbOooO0O0.toString());
        }
        if (bitmapOooO0OO == null) {
            return null;
        }
        bitmapOooO0OO.setDensity(this.f12536OooO0O0.densityDpi);
        o0oOOo o0oooo4 = this.f12535OooO00o;
        if (oOO00O0.OooO0Oo(iOooO00o)) {
            Matrix matrix = new Matrix();
            switch (iOooO00o) {
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
            RectF rectF = new RectF(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, bitmapOooO0OO.getWidth(), bitmapOooO0OO.getHeight());
            matrix.mapRect(rectF);
            Bitmap bitmapOooO0OO2 = o0oooo4.OooO0OO(Math.round(rectF.width()), Math.round(rectF.height()), oOO00O0.OooO0OO(bitmapOooO0OO));
            matrix.postTranslate(-rectF.left, -rectF.top);
            bitmapOooO0OO2.setHasAlpha(bitmapOooO0OO.hasAlpha());
            oOO00O0.OooO00o(bitmapOooO0OO, bitmapOooO0OO2, matrix);
            bitmap = bitmapOooO0OO2;
        } else {
            bitmap = bitmapOooO0OO;
        }
        if (bitmapOooO0OO.equals(bitmap)) {
            return bitmap;
        }
        this.f12535OooO00o.OooO0O0(bitmapOooO0OO);
        return bitmap;
    }
}

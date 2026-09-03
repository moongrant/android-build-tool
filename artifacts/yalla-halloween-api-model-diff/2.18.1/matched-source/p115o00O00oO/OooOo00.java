package p115o00O00oO;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import androidx.exifinterface.media.ExifInterface;
import coil.size.PixelSize;
import coil.size.Scale;
import coil.size.Size;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import o0oooo0.o0O00OO.OooO00o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p119o00O0Oo0.Oooo000;
import p674o0oooo0.o0O00000;
import p674o0oooo0.o0O000Oo;
import p674o0oooo0.o0O00OO;
import p674o0oooo0.o0O0O0O;
import p674o0oooo0.o0oOO;
import p674o0oooo0.o0oOOo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00 implements Oooo0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final String[] f30337OooO0OO = {"image/jpeg", "image/webp", "image/heic", "image/heif"};

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Context f30338OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Paint f30339OooO0O0;

    public static final class OooO00o extends o0O00000 {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        @Nullable
        public Exception f30340Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(@NotNull o0O0O0O delegate) {
            super(delegate);
            Intrinsics.checkNotNullParameter(delegate, "delegate");
        }

        @Override // p674o0oooo0.o0O00000, p674o0oooo0.o0O0O0O
        public final long Oooo0O0(@NotNull o0oOO sink, long j) throws Exception {
            Intrinsics.checkNotNullParameter(sink, "sink");
            try {
                return super.Oooo0O0(sink, j);
            } catch (Exception e) {
                this.f30340Oooo0oO = e;
                throw e;
            }
        }
    }

    public static final class OooO0O0 extends InputStream {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        @NotNull
        public final InputStream f30341Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public volatile int f30342Oooo0oO;

        public OooO0O0(@NotNull InputStream delegate) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f30341Oooo0o = delegate;
            this.f30342Oooo0oO = 1073741824;
        }

        public final int OooO00o(int i) {
            if (i == -1) {
                this.f30342Oooo0oO = 0;
            }
            return i;
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.f30342Oooo0oO;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            this.f30341Oooo0o.close();
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            int i = this.f30341Oooo0o.read();
            OooO00o(i);
            return i;
        }

        @Override // java.io.InputStream
        public final long skip(long j) {
            return this.f30341Oooo0o.skip(j);
        }

        @Override // java.io.InputStream
        public final int read(@NotNull byte[] b) throws IOException {
            Intrinsics.checkNotNullParameter(b, "b");
            int i = this.f30341Oooo0o.read(b);
            OooO00o(i);
            return i;
        }

        @Override // java.io.InputStream
        public final int read(@NotNull byte[] b, int i, int i2) throws IOException {
            Intrinsics.checkNotNullParameter(b, "b");
            int i3 = this.f30341Oooo0o.read(b, i, i2);
            OooO00o(i3);
            return i3;
        }
    }

    public OooOo00(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f30338OooO00o = context;
        this.f30339OooO0O0 = new Paint(3);
    }

    /* JADX WARN: Code duplicated, block: B:133:0x0238 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:134:0x023a  */
    /* JADX WARN: Code duplicated, block: B:136:0x0250  */
    /* JADX WARN: Code duplicated, block: B:137:0x0252  */
    /* JADX WARN: Code duplicated, block: B:141:0x025b  */
    /* JADX WARN: Code duplicated, block: B:143:0x0270  */
    /* JADX WARN: Code duplicated, block: B:145:0x0279  */
    /* JADX WARN: Code duplicated, block: B:148:0x0296  */
    /* JADX WARN: Code duplicated, block: B:149:0x0298  */
    /* JADX WARN: Code duplicated, block: B:151:0x029b  */
    /* JADX WARN: Code duplicated, block: B:153:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:154:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:156:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:159:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:162:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:170:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:173:0x0301  */
    /* JADX WARN: Code duplicated, block: B:175:0x030d A[Catch: all -> 0x030e, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x030e, blocks: (B:131:0x0234, B:175:0x030d), top: B:206:0x0234 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0093  */
    /* JADX WARN: Code duplicated, block: B:39:0x0096  */
    /* JADX WARN: Code duplicated, block: B:40:0x0099  */
    /* JADX WARN: Code duplicated, block: B:42:0x009d  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r5v2, types: [o00O00Oo.OooO0O0] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r9v7 */
    public static final OooOo OooO0OO(OooOo00 oooOo00, p113o00O00Oo.OooO0O0 oooO0O0, o0O0O0O o0o0o0o, Size size, o00oO0o o00oo0o2) throws Exception {
        boolean z;
        int i;
        boolean z2;
        int i2;
        int i3;
        Bitmap.Config inPreferredConfig;
        int i4;
        boolean z3;
        int i5;
        ?? r5;
        ?? r2;
        Bitmap bitmap;
        ?? r9;
        Bitmap bitmapDecodeStream;
        Exception exc;
        Bitmap.Config inPreferredConfig2;
        boolean z4;
        Matrix matrix;
        float width;
        float height;
        RectF rectF;
        float f;
        boolean z5;
        Bitmap bitmapOooO0OO;
        OooOo00 oooOo01;
        boolean z6;
        boolean z7;
        int i6;
        int iMin;
        double dMax;
        p113o00O00Oo.OooO0O0 oooO0O1;
        Bitmap bitmapOooO0Oo;
        p113o00O00Oo.OooO0O0 oooO0O2;
        Bitmap.Config config;
        ?? r3;
        ColorSpace colorSpace;
        p113o00O00Oo.OooO0O0 oooO0O3 = oooO0O0;
        Size size2 = size;
        Objects.requireNonNull(oooOo00);
        BitmapFactory.Options options = new BitmapFactory.Options();
        OooO00o oooO00o = new OooO00o(o0o0o0o);
        o0oOOo o0ooooOooO0OO = o0O000Oo.OooO0OO(oooO00o);
        options.inJustDecodeBounds = true;
        o0O00OO o0o00oo2 = (o0O00OO) o0ooooOooO0OO;
        BitmapFactory.decodeStream(((o0O00OO) o0o00oo2.OooO0O0()).new OooO00o(), null, options);
        Exception exc2 = oooO00o.f30340Oooo0oO;
        if (exc2 != null) {
            throw exc2;
        }
        options.inJustDecodeBounds = false;
        String str = options.outMimeType;
        try {
            try {
                try {
                    try {
                        if (str != null && ArraysKt.contains(f30337OooO0OO, str)) {
                            ExifInterface exifInterface = new ExifInterface(new OooO0O0(((o0O00OO) o0o00oo2.OooO0O0()).new OooO00o()));
                            Exception exc3 = oooO00o.f30340Oooo0oO;
                            if (exc3 != null) {
                                throw exc3;
                            }
                            int iOooO0o0 = exifInterface.OooO0o0();
                            z = iOooO0o0 == 2 || iOooO0o0 == 7 || iOooO0o0 == 4 || iOooO0o0 == 5;
                            switch (exifInterface.OooO0o0()) {
                                case 3:
                                case 4:
                                    i = 180;
                                    break;
                                case 5:
                                case 8:
                                    i = 270;
                                    break;
                                case 6:
                                case 7:
                                    i = 90;
                                    break;
                            }
                            if (i != 90 || i == 270) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                i2 = options.outHeight;
                            } else {
                                i2 = options.outWidth;
                            }
                            if (z2) {
                                i3 = options.outWidth;
                            } else {
                                i3 = options.outHeight;
                            }
                            inPreferredConfig = o00oo0o2.f30376OooO0O0;
                            if (z || i > 0) {
                                inPreferredConfig = Oooo000.OooO0o0(inPreferredConfig);
                            }
                            if (o00oo0o2.f30379OooO0o && inPreferredConfig == Bitmap.Config.ARGB_8888 && Intrinsics.areEqual(options.outMimeType, "image/jpeg")) {
                                inPreferredConfig = Bitmap.Config.RGB_565;
                            }
                            i4 = Build.VERSION.SDK_INT;
                            if (i4 >= 26 && options.outConfig == Bitmap.Config.RGBA_F16 && inPreferredConfig != Bitmap.Config.HARDWARE) {
                                inPreferredConfig = Bitmap.Config.RGBA_F16;
                            }
                            options.inPreferredConfig = inPreferredConfig;
                            if (i4 >= 26 && (colorSpace = o00oo0o2.f30377OooO0OO) != null) {
                                options.inPreferredColorSpace = colorSpace;
                            }
                            options.inPremultiplied = o00oo0o2.f30381OooO0oO;
                            if (i4 < 24) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            options.inMutable = z3;
                            options.inScaled = false;
                            i5 = options.outWidth;
                            if (i5 > 0 || (i6 = options.outHeight) <= 0) {
                                options.inSampleSize = i;
                                options.inScaled = false;
                                options.inBitmap = null;
                                r2 = size2;
                                r5 = oooO0O3;
                            } else {
                                if (size2 instanceof PixelSize) {
                                    PixelSize pixelSize = (PixelSize) size2;
                                    int i7 = pixelSize.f9946Oooo0o;
                                    int i8 = pixelSize.f9947Oooo0oO;
                                    Scale scale = o00oo0o2.f30378OooO0Oo;
                                    Oooo000 oooo000 = Oooo000.f30344OooO00o;
                                    Intrinsics.checkNotNullParameter(scale, "scale");
                                    int iCoerceAtLeast = RangesKt.coerceAtLeast(Integer.highestOneBit(i2 / i7), 1);
                                    z = z;
                                    int iCoerceAtLeast2 = RangesKt.coerceAtLeast(Integer.highestOneBit(i3 / i8), 1);
                                    int[] iArr = Oooo000.OooO00o.$EnumSwitchMapping$0;
                                    int i9 = iArr[scale.ordinal()];
                                    if (i9 == 1) {
                                        iMin = Math.min(iCoerceAtLeast, iCoerceAtLeast2);
                                    } else {
                                        if (i9 != 2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        iMin = Math.max(iCoerceAtLeast, iCoerceAtLeast2);
                                    }
                                    options.inSampleSize = iMin;
                                    double d = iMin;
                                    double d2 = ((double) i2) / d;
                                    oooO00o = oooO00o;
                                    o0ooooOooO0OO = o0ooooOooO0OO;
                                    double d3 = ((double) i3) / d;
                                    double d4 = i7;
                                    Scale scale2 = o00oo0o2.f30378OooO0Oo;
                                    Intrinsics.checkNotNullParameter(scale2, "scale");
                                    double d5 = d4 / d2;
                                    double d6 = ((double) i8) / d3;
                                    int i10 = iArr[scale2.ordinal()];
                                    if (i10 == 1) {
                                        dMax = Math.max(d5, d6);
                                    } else {
                                        if (i10 != 2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        dMax = Math.min(d5, d6);
                                    }
                                    if (o00oo0o2.f30380OooO0o0) {
                                        dMax = RangesKt___RangesKt.coerceAtMost(dMax, 1.0d);
                                    }
                                    boolean z8 = !(dMax == 1.0d);
                                    options.inScaled = z8;
                                    if (z8) {
                                        if (dMax > 1.0d) {
                                            options.inDensity = MathKt.roundToInt(((double) Integer.MAX_VALUE) / dMax);
                                            options.inTargetDensity = Integer.MAX_VALUE;
                                        } else {
                                            options.inDensity = Integer.MAX_VALUE;
                                            options.inTargetDensity = MathKt.roundToInt(((double) Integer.MAX_VALUE) * dMax);
                                        }
                                    }
                                    boolean z9 = options.inMutable;
                                    if (z9) {
                                        int i11 = options.inSampleSize;
                                        if (i11 != 1 || options.inScaled) {
                                            p113o00O00Oo.OooO0O0 oooO0O4 = oooO0O0;
                                            double d7 = i11;
                                            double d8 = ((double) options.outWidth) / d7;
                                            double d9 = ((double) options.outHeight) / d7;
                                            int iCeil = (int) Math.ceil((d8 * dMax) + 0.5d);
                                            int iCeil2 = (int) Math.ceil((dMax * d9) + 0.5d);
                                            Bitmap.Config inPreferredConfig3 = options.inPreferredConfig;
                                            Intrinsics.checkNotNullExpressionValue(inPreferredConfig3, "inPreferredConfig");
                                            bitmapOooO0Oo = oooO0O4.OooO0Oo(iCeil, iCeil2, inPreferredConfig3);
                                            config = iCeil;
                                            oooO0O2 = oooO0O4;
                                        } else {
                                            int i12 = options.outWidth;
                                            int i13 = options.outHeight;
                                            Bitmap.Config inPreferredConfig4 = options.inPreferredConfig;
                                            Intrinsics.checkNotNullExpressionValue(inPreferredConfig4, "inPreferredConfig");
                                            p113o00O00Oo.OooO0O0 oooO0O5 = oooO0O0;
                                            bitmapOooO0Oo = oooO0O5.OooO0Oo(i12, i13, inPreferredConfig4);
                                            config = inPreferredConfig4;
                                            oooO0O2 = oooO0O5;
                                        }
                                        options.inBitmap = bitmapOooO0Oo;
                                        r3 = config;
                                        oooO0O1 = oooO0O2;
                                    } else {
                                        oooO0O1 = oooO0O0;
                                        r3 = z9;
                                    }
                                } else {
                                    options.inSampleSize = 1;
                                    options.inScaled = false;
                                    if (z3) {
                                        Intrinsics.checkNotNullExpressionValue(inPreferredConfig, "inPreferredConfig");
                                        options.inBitmap = oooO0O3.OooO0Oo(i5, i6, inPreferredConfig);
                                    }
                                    oooO00o = oooO00o;
                                    o0ooooOooO0OO = o0ooooOooO0OO;
                                    z = z;
                                    oooO0O1 = oooO0O3;
                                    r3 = size2;
                                }
                                r2 = r3;
                                r5 = oooO0O1;
                            }
                            bitmap = options.inBitmap;
                            r2 = 0;
                            bitmapDecodeStream = BitmapFactory.decodeStream(((o0O00OO) o0ooooOooO0OO).new OooO00o(), null, options);
                            CloseableKt.closeFinally(o0ooooOooO0OO, null);
                            exc = oooO00o.f30340Oooo0oO;
                            if (exc == null) {
                                throw exc;
                            }
                            if (bitmapDecodeStream != null) {
                                throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.".toString());
                            }
                            bitmapDecodeStream.setDensity(o00oo0o2.f30375OooO00o.getResources().getDisplayMetrics().densityDpi);
                            inPreferredConfig2 = options.inPreferredConfig;
                            Intrinsics.checkNotNullExpressionValue(inPreferredConfig2, "inPreferredConfig");
                            if (i > 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (!z || z4) {
                                matrix = new Matrix();
                                width = bitmapDecodeStream.getWidth() / 2.0f;
                                height = bitmapDecodeStream.getHeight() / 2.0f;
                                if (z) {
                                    matrix.postScale(-1.0f, 1.0f, width, height);
                                }
                                if (z4) {
                                    matrix.postRotate(i, width, height);
                                }
                                rectF = new RectF(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                                matrix.mapRect(rectF);
                                f = rectF.left;
                                if (f == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (z5) {
                                    if (rectF.top == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (!z6) {
                                        matrix.postTranslate(-f, -rectF.top);
                                    }
                                } else {
                                    matrix.postTranslate(-f, -rectF.top);
                                }
                                if (i != 90 || i == 270) {
                                    bitmapOooO0OO = r5.OooO0OO(bitmapDecodeStream.getHeight(), bitmapDecodeStream.getWidth(), inPreferredConfig2);
                                } else {
                                    bitmapOooO0OO = r5.OooO0OO(bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), inPreferredConfig2);
                                }
                                oooOo01 = oooOo00;
                                new Canvas(bitmapOooO0OO).drawBitmap(bitmapDecodeStream, matrix, oooOo01.f30339OooO0O0);
                                r5.OooO0O0(bitmapDecodeStream);
                                bitmapDecodeStream = bitmapOooO0OO;
                            } else {
                                oooOo01 = oooOo00;
                            }
                            Resources resources = oooOo01.f30338OooO00o.getResources();
                            Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
                            BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, bitmapDecodeStream);
                            if (options.inSampleSize <= 1 || options.inScaled) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            return new OooOo(bitmapDrawable, z7);
                        }
                        z = false;
                        exc = oooO00o.f30340Oooo0oO;
                        if (exc == null) {
                            throw exc;
                        }
                        if (bitmapDecodeStream != null) {
                            throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.".toString());
                        }
                        bitmapDecodeStream.setDensity(o00oo0o2.f30375OooO00o.getResources().getDisplayMetrics().densityDpi);
                        inPreferredConfig2 = options.inPreferredConfig;
                        Intrinsics.checkNotNullExpressionValue(inPreferredConfig2, "inPreferredConfig");
                        if (i > 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z) {
                            matrix = new Matrix();
                            width = bitmapDecodeStream.getWidth() / 2.0f;
                            height = bitmapDecodeStream.getHeight() / 2.0f;
                            if (z) {
                                matrix.postScale(-1.0f, 1.0f, width, height);
                            }
                            if (z4) {
                                matrix.postRotate(i, width, height);
                            }
                            rectF = new RectF(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                            matrix.mapRect(rectF);
                            f = rectF.left;
                            if (f == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z5) {
                                matrix.postTranslate(-f, -rectF.top);
                            } else {
                                if (rectF.top == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (!z6) {
                                    matrix.postTranslate(-f, -rectF.top);
                                }
                            }
                            if (i != 90) {
                                bitmapOooO0OO = r5.OooO0OO(bitmapDecodeStream.getHeight(), bitmapDecodeStream.getWidth(), inPreferredConfig2);
                            } else {
                                bitmapOooO0OO = r5.OooO0OO(bitmapDecodeStream.getHeight(), bitmapDecodeStream.getWidth(), inPreferredConfig2);
                            }
                            oooOo01 = oooOo00;
                            new Canvas(bitmapOooO0OO).drawBitmap(bitmapDecodeStream, matrix, oooOo01.f30339OooO0O0);
                            r5.OooO0O0(bitmapDecodeStream);
                            bitmapDecodeStream = bitmapOooO0OO;
                        } else {
                            matrix = new Matrix();
                            width = bitmapDecodeStream.getWidth() / 2.0f;
                            height = bitmapDecodeStream.getHeight() / 2.0f;
                            if (z) {
                                matrix.postScale(-1.0f, 1.0f, width, height);
                            }
                            if (z4) {
                                matrix.postRotate(i, width, height);
                            }
                            rectF = new RectF(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                            matrix.mapRect(rectF);
                            f = rectF.left;
                            if (f == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z5) {
                                matrix.postTranslate(-f, -rectF.top);
                            } else {
                                if (rectF.top == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (!z6) {
                                    matrix.postTranslate(-f, -rectF.top);
                                }
                            }
                            if (i != 90) {
                                bitmapOooO0OO = r5.OooO0OO(bitmapDecodeStream.getHeight(), bitmapDecodeStream.getWidth(), inPreferredConfig2);
                            } else {
                                bitmapOooO0OO = r5.OooO0OO(bitmapDecodeStream.getHeight(), bitmapDecodeStream.getWidth(), inPreferredConfig2);
                            }
                            oooOo01 = oooOo00;
                            new Canvas(bitmapOooO0OO).drawBitmap(bitmapDecodeStream, matrix, oooOo01.f30339OooO0O0);
                            r5.OooO0O0(bitmapDecodeStream);
                            bitmapDecodeStream = bitmapOooO0OO;
                        }
                        Resources resources2 = oooOo01.f30338OooO00o.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources2, "context.resources");
                        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(resources2, bitmapDecodeStream);
                        if (options.inSampleSize <= 1) {
                            z7 = true;
                        } else {
                            z7 = true;
                        }
                        return new OooOo(bitmapDrawable2, z7);
                    } catch (Throwable th) {
                        th = th;
                        r9 = bitmapDecodeStream;
                        if (bitmap != null) {
                            r5.OooO0O0(bitmap);
                        }
                        if (r9 != bitmap && r9 != 0) {
                            r5.OooO0O0(r9);
                        }
                        throw th;
                    }
                    bitmapDecodeStream = BitmapFactory.decodeStream(((o0O00OO) o0ooooOooO0OO).new OooO00o(), null, options);
                    CloseableKt.closeFinally(o0ooooOooO0OO, null);
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        CloseableKt.closeFinally(o0ooooOooO0OO, th3);
                        throw th4;
                    }
                }
                r2 = 0;
            } catch (Throwable th5) {
                th = th5;
                r9 = r2;
            }
        } catch (Throwable th6) {
            th = th6;
            r2 = 0;
        }
        i = 0;
        if (i != 90) {
            z2 = true;
        } else {
            z2 = true;
        }
        if (z2) {
            i2 = options.outHeight;
        } else {
            i2 = options.outWidth;
        }
        if (z2) {
            i3 = options.outWidth;
        } else {
            i3 = options.outHeight;
        }
        inPreferredConfig = o00oo0o2.f30376OooO0O0;
        if (z) {
            inPreferredConfig = Oooo000.OooO0o0(inPreferredConfig);
        } else {
            inPreferredConfig = Oooo000.OooO0o0(inPreferredConfig);
        }
        if (o00oo0o2.f30379OooO0o) {
            inPreferredConfig = Bitmap.Config.RGB_565;
        }
        i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            inPreferredConfig = Bitmap.Config.RGBA_F16;
        }
        options.inPreferredConfig = inPreferredConfig;
        if (i4 >= 26) {
            options.inPreferredColorSpace = colorSpace;
        }
        options.inPremultiplied = o00oo0o2.f30381OooO0oO;
        if (i4 < 24) {
            z3 = true;
        } else {
            z3 = false;
        }
        options.inMutable = z3;
        options.inScaled = false;
        i5 = options.outWidth;
        int i14 = i5 > 0 ? 1 : 1;
        options.inSampleSize = i14;
        options.inScaled = false;
        options.inBitmap = null;
        r2 = size2;
        r5 = oooO0O3;
        bitmap = options.inBitmap;
    }

    @Override // p115o00O00oO.Oooo0
    public final boolean OooO00o(@NotNull o0oOOo source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return true;
    }

    @Override // p115o00O00oO.Oooo0
    @Nullable
    public final Object OooO0O0(@NotNull p113o00O00Oo.OooO0O0 oooO0O0, @NotNull o0oOOo o0oooo2, @NotNull Size size, @NotNull o00oO0o o00oo0o2, @NotNull Continuation<? super OooOo> continuation) throws Exception {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        try {
            oo000o oo000oVar = new oo000o(cancellableContinuationImpl, o0oooo2);
            try {
                OooOo oooOoOooO0OO = OooO0OO(this, oooO0O0, oo000oVar, size, o00oo0o2);
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuationImpl.resumeWith(Result.m502constructorimpl(oooOoOooO0OO));
                oo000oVar.OooO00o();
                Object result = cancellableContinuationImpl.getResult();
                if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return result;
            } catch (Throwable th) {
                oo000oVar.OooO00o();
                throw th;
            }
        } catch (Exception e) {
            if (!(e instanceof InterruptedException) && !(e instanceof InterruptedIOException)) {
                throw e;
            }
            Throwable thInitCause = new CancellationException("Blocking call was interrupted due to parent cancellation.").initCause(e);
            Intrinsics.checkNotNullExpressionValue(thInitCause, "CancellationException(\"B…n.\").initCause(exception)");
            throw thInitCause;
        }
    }
}

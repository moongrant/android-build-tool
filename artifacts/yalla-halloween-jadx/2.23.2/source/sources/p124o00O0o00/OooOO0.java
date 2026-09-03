package p124o00O0o00;

import android.content.Context;
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
import coil.decode.ExifOrientationPolicy;
import coil.size.Scale;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.InterruptibleKt;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreKt;
import o00OO00O.OooOo00;
import o0oooO0O.o0o0000.OooO00o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p125o00O0o0O.oo0o0Oo;
import p130o00O0oo.o000O0Oo;
import p130o00O0oo.o000O0o;
import p131o00O0oo0.o0O0O00;
import p662o0oooO0O.o0O0o0;
import p662o0oooO0O.o0OO;
import p662o0oooO0O.o0OOOO0o;
import p662o0oooO0O.o0o0000;
import p662o0oooO0O.oo0OOoo;
import p662o0oooO0O.oo0ooO;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 implements OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o000OO f36521OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0O0O00 f36522OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Semaphore f36523OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final ExifOrientationPolicy f36524OooO0Oo;

    public static final class OooO00o extends oo0ooO {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public Exception f36525OooO0o0;

        public OooO00o(@NotNull o0O0o0 o0o0o0) {
            super(o0o0o0);
        }

        @Override // p662o0oooO0O.oo0ooO, p662o0oooO0O.oO00000
        public final long OooOO0O(@NotNull oo0OOoo oo0oooo, long j) throws Exception {
            try {
                return super.OooOO0O(oo0oooo, j);
            } catch (Exception e) {
                this.f36525OooO0o0 = e;
                throw e;
            }
        }
    }

    public static final class OooO0O0 implements OooOOOO.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final ExifOrientationPolicy f36526OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final Semaphore f36527OooO0O0;

        public OooO0O0(int i, @NotNull ExifOrientationPolicy exifOrientationPolicy) {
            this.f36526OooO00o = exifOrientationPolicy;
            this.f36527OooO0O0 = SemaphoreKt.Semaphore$default(i, 0, 2, null);
        }

        @Override // o00O0o00.OooOOOO.OooO00o
        @NotNull
        public final OooOOOO OooO00o(@NotNull oo0o0Oo oo0o0oo, @NotNull o0O0O00 o0o0o00) {
            return new OooOO0(oo0o0oo.f36632OooO00o, o0o0o00, this.f36527OooO0O0, this.f36526OooO00o);
        }

        public final boolean equals(@Nullable Object obj) {
            return obj instanceof OooO0O0;
        }

        public final int hashCode() {
            return OooO0O0.class.hashCode();
        }
    }

    @DebugMetadata(c = "coil.decode.BitmapFactoryDecoder", f = "BitmapFactoryDecoder.kt", i = {0, 0, 1}, l = {232, 46}, m = "decode", n = {"this", "$this$withPermit$iv", "$this$withPermit$iv"}, s = {"L$0", "L$1", "L$0"})
    public static final class OooO0OO extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Object f36528OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Object f36529OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Semaphore f36530OooO0o0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f36532OooO0oo;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f36529OooO0o = obj;
            this.f36532OooO0oo |= Integer.MIN_VALUE;
            return OooOO0.this.OooO00o(this);
        }
    }

    public static final class OooO0o extends Lambda implements Function0<OooOOO0> {
        public OooO0o() {
            super(0);
        }

        /* JADX WARN: Code duplicated, block: B:133:0x0236 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:134:0x0238  */
        /* JADX WARN: Code duplicated, block: B:136:0x0247 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:137:0x0249  */
        /* JADX WARN: Code duplicated, block: B:138:0x024b  */
        /* JADX WARN: Code duplicated, block: B:141:0x0250  */
        /* JADX WARN: Code duplicated, block: B:143:0x0265  */
        /* JADX WARN: Code duplicated, block: B:145:0x026e  */
        /* JADX WARN: Code duplicated, block: B:146:0x0270  */
        /* JADX WARN: Code duplicated, block: B:148:0x0273  */
        /* JADX WARN: Code duplicated, block: B:151:0x0290  */
        /* JADX WARN: Code duplicated, block: B:152:0x0292  */
        /* JADX WARN: Code duplicated, block: B:154:0x0295  */
        /* JADX WARN: Code duplicated, block: B:156:0x029b  */
        /* JADX WARN: Code duplicated, block: B:157:0x029d  */
        /* JADX WARN: Code duplicated, block: B:159:0x02a0  */
        /* JADX WARN: Code duplicated, block: B:162:0x02ad  */
        /* JADX WARN: Code duplicated, block: B:166:0x02b4  */
        /* JADX WARN: Code duplicated, block: B:169:0x02b9  */
        /* JADX WARN: Code duplicated, block: B:16:0x005f  */
        /* JADX WARN: Code duplicated, block: B:171:0x02c7  */
        /* JADX WARN: Code duplicated, block: B:173:0x02d1  */
        /* JADX WARN: Code duplicated, block: B:175:0x02df  */
        /* JADX WARN: Code duplicated, block: B:184:0x030d  */
        /* JADX WARN: Code duplicated, block: B:187:0x0312  */
        /* JADX WARN: Code duplicated, block: B:189:0x031e  */
        /* JADX WARN: Code duplicated, block: B:43:0x00c4  */
        /* JADX WARN: Code duplicated, block: B:44:0x00c6  */
        /* JADX WARN: Code duplicated, block: B:48:0x00d0  */
        /* JADX WARN: Code duplicated, block: B:50:0x00d3  */
        @Override // kotlin.jvm.functions.Function0
        public final OooOOO0 invoke() throws Exception {
            boolean z;
            OooOo00 oooOo00;
            boolean z2;
            boolean z3;
            int i;
            int iMin;
            double dMax;
            Bitmap bitmapDecodeStream;
            Exception exc;
            Matrix matrix;
            float width;
            float height;
            boolean z4;
            RectF rectF;
            float f;
            boolean z5;
            int i2;
            boolean z6;
            Bitmap.Config config;
            Bitmap bitmapCreateBitmap;
            Bitmap.Config config2;
            boolean z7;
            boolean z8;
            boolean z9;
            ColorSpace colorSpace;
            BitmapFactory.Options options = new BitmapFactory.Options();
            OooOO0 oooOO1 = OooOO0.this;
            o000OO o000oo2 = oooOO1.f36521OooO00o;
            OooO00o oooO00o = new OooO00o(o000oo2.OooOOo());
            o0o0000 o0o0000VarOooO0O0 = o0OO.OooO0O0(oooO00o);
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(o0OO.OooO0O0(new o0OOOO0o(o0o0000VarOooO0O0)).new OooO00o(), null, options);
            Exception exc2 = oooO00o.f36525OooO0o0;
            if (exc2 != null) {
                throw exc2;
            }
            options.inJustDecodeBounds = false;
            Paint paint = Oooo000.f36543OooO00o;
            String str = options.outMimeType;
            Set<String> set = Oooo0.f36542OooO00o;
            int i3 = Oooo0.OooO00o.$EnumSwitchMapping$0[oooOO1.f36524OooO0Oo.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z = true;
                } else {
                    z = false;
                }
            } else if (str == null || !Oooo0.f36542OooO00o.contains(str)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                ExifInterface exifInterface = new ExifInterface(new OooOo(o0OO.OooO0O0(new o0OOOO0o(o0o0000VarOooO0O0)).new OooO00o()));
                int iOooO0o0 = exifInterface.OooO0o0(1, "Orientation");
                oooOo00 = new OooOo00(iOooO0o0 == 2 || iOooO0o0 == 7 || iOooO0o0 == 4 || iOooO0o0 == 5, exifInterface.OooOOO());
            } else {
                oooOo00 = OooOo00.f36539OooO0OO;
            }
            Exception exc3 = oooO00o.f36525OooO0o0;
            if (exc3 != null) {
                throw exc3;
            }
            options.inMutable = false;
            int i4 = Build.VERSION.SDK_INT;
            o0O0O00 o0o0o00 = oooOO1.f36522OooO0O0;
            if (i4 >= 26 && (colorSpace = o0o0o00.f36840OooO0OO) != null) {
                options.inPreferredColorSpace = colorSpace;
            }
            options.inPremultiplied = o0o0o00.f36845OooO0oo;
            Bitmap.Config config3 = o0o0o00.f36839OooO0O0;
            int i5 = oooOo00.f36541OooO0O0;
            boolean z10 = oooOo00.f36540OooO00o;
            if (!z10) {
                if (i5 > 0) {
                    if (config3 == null) {
                        config3 = Bitmap.Config.ARGB_8888;
                    } else {
                        if (i4 >= 26) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            config3 = Bitmap.Config.ARGB_8888;
                        }
                    }
                }
            } else if (config3 == null) {
                config3 = Bitmap.Config.ARGB_8888;
            } else {
                if (i4 >= 26 || config3 != Bitmap.Config.HARDWARE) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    config3 = Bitmap.Config.ARGB_8888;
                }
            }
            if (o0o0o00.f36844OooO0oO && config3 == Bitmap.Config.ARGB_8888 && Intrinsics.areEqual(options.outMimeType, "image/jpeg")) {
                config3 = Bitmap.Config.RGB_565;
            }
            if (i4 >= 26 && options.outConfig == Bitmap.Config.RGBA_F16 && config3 != Bitmap.Config.HARDWARE) {
                config3 = Bitmap.Config.RGBA_F16;
            }
            options.inPreferredConfig = config3;
            o000OO.OooO00o oooO00oOooO0oO = o000oo2.OooO0oO();
            boolean z11 = oooO00oOooO0oO instanceof o0000O;
            int i6 = oooOo00.f36541OooO0O0;
            Context context = o0o0o00.f36838OooO00o;
            o000O0Oo o000o0oo2 = o0o0o00.f36841OooO0Oo;
            try {
                if (z11 && o000O0o.OooO00o(o000o0oo2)) {
                    options.inSampleSize = 1;
                    options.inScaled = true;
                    options.inDensity = ((o0000O) oooO00oOooO0oO).f36565OooO0OO;
                    options.inTargetDensity = context.getResources().getDisplayMetrics().densityDpi;
                    i6 = i6;
                    context = context;
                    i5 = i5;
                    z10 = z10;
                } else {
                    int i7 = options.outWidth;
                    if (i7 <= 0 || (i = options.outHeight) <= 0) {
                        options.inSampleSize = 1;
                        z3 = false;
                        options.inScaled = false;
                        bitmapDecodeStream = BitmapFactory.decodeStream(o0o0000VarOooO0O0.new OooO00o(), null, options);
                        CloseableKt.closeFinally(o0o0000VarOooO0O0, null);
                        exc = oooO00o.f36525OooO0o0;
                        if (exc == null) {
                            throw exc;
                        }
                        if (bitmapDecodeStream != null) {
                            throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.".toString());
                        }
                        bitmapDecodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
                        if (z10) {
                            matrix = new Matrix();
                            width = bitmapDecodeStream.getWidth() / 2.0f;
                            height = bitmapDecodeStream.getHeight() / 2.0f;
                            if (z10) {
                                matrix.postScale(-1.0f, 1.0f, width, height);
                            }
                            if (i5 > 0) {
                                z4 = true;
                            } else {
                                z4 = z3;
                            }
                            if (z4) {
                                matrix.postRotate(i5, width, height);
                            }
                            rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                            matrix.mapRect(rectF);
                            f = rectF.left;
                            if (f == 0.0f) {
                                z5 = true;
                            } else {
                                z5 = z3;
                            }
                            if (z5) {
                                if (rectF.top == 0.0f) {
                                    z7 = true;
                                } else {
                                    z7 = z3;
                                }
                                if (!z7) {
                                    matrix.postTranslate(-f, -rectF.top);
                                }
                            } else {
                                matrix.postTranslate(-f, -rectF.top);
                            }
                            i2 = i6;
                            if (i2 != 90 || i2 == 270) {
                                z6 = true;
                            } else {
                                z6 = z3;
                            }
                            if (z6) {
                                int height2 = bitmapDecodeStream.getHeight();
                                int width2 = bitmapDecodeStream.getWidth();
                                config2 = bitmapDecodeStream.getConfig();
                                if (config2 == null) {
                                    config2 = Bitmap.Config.ARGB_8888;
                                }
                                bitmapCreateBitmap = Bitmap.createBitmap(height2, width2, config2);
                                Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(width, height, config)");
                            } else {
                                int width3 = bitmapDecodeStream.getWidth();
                                int height3 = bitmapDecodeStream.getHeight();
                                config = bitmapDecodeStream.getConfig();
                                if (config == null) {
                                    config = Bitmap.Config.ARGB_8888;
                                }
                                bitmapCreateBitmap = Bitmap.createBitmap(width3, height3, config);
                                Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(width, height, config)");
                            }
                            new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, Oooo000.f36543OooO00o);
                            bitmapDecodeStream.recycle();
                            bitmapDecodeStream = bitmapCreateBitmap;
                        } else {
                            if (i5 > 0) {
                                z9 = true;
                            } else {
                                z9 = z3;
                            }
                            if (z9) {
                                matrix = new Matrix();
                                width = bitmapDecodeStream.getWidth() / 2.0f;
                                height = bitmapDecodeStream.getHeight() / 2.0f;
                                if (z10) {
                                    matrix.postScale(-1.0f, 1.0f, width, height);
                                }
                                if (i5 > 0) {
                                    z4 = true;
                                } else {
                                    z4 = z3;
                                }
                                if (z4) {
                                    matrix.postRotate(i5, width, height);
                                }
                                rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                                matrix.mapRect(rectF);
                                f = rectF.left;
                                if (f == 0.0f) {
                                    z5 = true;
                                } else {
                                    z5 = z3;
                                }
                                if (z5) {
                                    matrix.postTranslate(-f, -rectF.top);
                                } else {
                                    if (rectF.top == 0.0f) {
                                        z7 = true;
                                    } else {
                                        z7 = z3;
                                    }
                                    if (!z7) {
                                        matrix.postTranslate(-f, -rectF.top);
                                    }
                                }
                                i2 = i6;
                                if (i2 != 90) {
                                    z6 = true;
                                } else {
                                    z6 = true;
                                }
                                if (z6) {
                                    int height4 = bitmapDecodeStream.getHeight();
                                    int width4 = bitmapDecodeStream.getWidth();
                                    config2 = bitmapDecodeStream.getConfig();
                                    if (config2 == null) {
                                        config2 = Bitmap.Config.ARGB_8888;
                                    }
                                    bitmapCreateBitmap = Bitmap.createBitmap(height4, width4, config2);
                                    Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(width, height, config)");
                                } else {
                                    int width5 = bitmapDecodeStream.getWidth();
                                    int height5 = bitmapDecodeStream.getHeight();
                                    config = bitmapDecodeStream.getConfig();
                                    if (config == null) {
                                        config = Bitmap.Config.ARGB_8888;
                                    }
                                    bitmapCreateBitmap = Bitmap.createBitmap(width5, height5, config);
                                    Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(width, height, config)");
                                }
                                new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, Oooo000.f36543OooO00o);
                                bitmapDecodeStream.recycle();
                                bitmapDecodeStream = bitmapCreateBitmap;
                            }
                        }
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), bitmapDecodeStream);
                        if (options.inSampleSize <= 1 || options.inScaled) {
                            z8 = true;
                        } else {
                            z8 = z3;
                        }
                        return new OooOOO0(bitmapDrawable, z8);
                    }
                    int i8 = i6 == 90 || i6 == 270 ? i : i7;
                    if (!(i6 == 90 || i6 == 270)) {
                        i7 = i;
                    }
                    boolean zOooO00o = o000O0o.OooO00o(o000o0oo2);
                    Scale scale = o0o0o00.f36843OooO0o0;
                    int iOooO0Oo = zOooO00o ? i8 : OooOo00.OooO0Oo(o000o0oo2.f36771OooO00o, scale);
                    int iOooO0Oo2 = o000O0o.OooO00o(o000o0oo2) ? i7 : OooOo00.OooO0Oo(o000o0oo2.f36772OooO0O0, scale);
                    int iHighestOneBit = Integer.highestOneBit(i8 / iOooO0Oo);
                    int iHighestOneBit2 = Integer.highestOneBit(i7 / iOooO0Oo2);
                    int[] iArr = OooOOO.OooO00o.$EnumSwitchMapping$0;
                    int i9 = iArr[scale.ordinal()];
                    i6 = i6;
                    if (i9 == 1) {
                        iMin = Math.min(iHighestOneBit, iHighestOneBit2);
                    } else {
                        if (i9 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iMin = Math.max(iHighestOneBit, iHighestOneBit2);
                    }
                    int iCoerceAtLeast = RangesKt.coerceAtLeast(iMin, 1);
                    options.inSampleSize = iCoerceAtLeast;
                    double d = iCoerceAtLeast;
                    double d2 = ((double) i8) / d;
                    z10 = z10;
                    context = context;
                    double d3 = ((double) i7) / d;
                    i5 = i5;
                    double d4 = ((double) iOooO0Oo) / d2;
                    double d5 = ((double) iOooO0Oo2) / d3;
                    int i10 = iArr[scale.ordinal()];
                    if (i10 == 1) {
                        dMax = Math.max(d4, d5);
                    } else {
                        if (i10 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        dMax = Math.min(d4, d5);
                    }
                    if (o0o0o00.f36842OooO0o) {
                        dMax = RangesKt___RangesKt.coerceAtMost(dMax, 1.0d);
                    }
                    boolean z12 = !(dMax == 1.0d);
                    options.inScaled = z12;
                    if (z12) {
                        if (dMax > 1.0d) {
                            options.inDensity = MathKt.roundToInt(((double) Integer.MAX_VALUE) / dMax);
                            options.inTargetDensity = Integer.MAX_VALUE;
                        } else {
                            options.inDensity = Integer.MAX_VALUE;
                            options.inTargetDensity = MathKt.roundToInt(((double) Integer.MAX_VALUE) * dMax);
                        }
                    }
                }
                bitmapDecodeStream = BitmapFactory.decodeStream(o0o0000VarOooO0O0.new OooO00o(), null, options);
                CloseableKt.closeFinally(o0o0000VarOooO0O0, null);
                exc = oooO00o.f36525OooO0o0;
                if (exc == null) {
                    throw exc;
                }
                if (bitmapDecodeStream != null) {
                    throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.".toString());
                }
                bitmapDecodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
                if (z10) {
                    matrix = new Matrix();
                    width = bitmapDecodeStream.getWidth() / 2.0f;
                    height = bitmapDecodeStream.getHeight() / 2.0f;
                    if (z10) {
                        matrix.postScale(-1.0f, 1.0f, width, height);
                    }
                    if (i5 > 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (z4) {
                        matrix.postRotate(i5, width, height);
                    }
                    rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                    matrix.mapRect(rectF);
                    f = rectF.left;
                    if (f == 0.0f) {
                        z5 = true;
                    } else {
                        z5 = z3;
                    }
                    if (z5) {
                        matrix.postTranslate(-f, -rectF.top);
                    } else {
                        if (rectF.top == 0.0f) {
                            z7 = true;
                        } else {
                            z7 = z3;
                        }
                        if (!z7) {
                            matrix.postTranslate(-f, -rectF.top);
                        }
                    }
                    i2 = i6;
                    if (i2 != 90) {
                        z6 = true;
                    } else {
                        z6 = true;
                    }
                    if (z6) {
                        int height6 = bitmapDecodeStream.getHeight();
                        int width6 = bitmapDecodeStream.getWidth();
                        config2 = bitmapDecodeStream.getConfig();
                        if (config2 == null) {
                            config2 = Bitmap.Config.ARGB_8888;
                        }
                        bitmapCreateBitmap = Bitmap.createBitmap(height6, width6, config2);
                        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(width, height, config)");
                    } else {
                        int width7 = bitmapDecodeStream.getWidth();
                        int height7 = bitmapDecodeStream.getHeight();
                        config = bitmapDecodeStream.getConfig();
                        if (config == null) {
                            config = Bitmap.Config.ARGB_8888;
                        }
                        bitmapCreateBitmap = Bitmap.createBitmap(width7, height7, config);
                        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(width, height, config)");
                    }
                    new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, Oooo000.f36543OooO00o);
                    bitmapDecodeStream.recycle();
                    bitmapDecodeStream = bitmapCreateBitmap;
                } else {
                    if (i5 > 0) {
                        z9 = true;
                    } else {
                        z9 = z3;
                    }
                    if (z9) {
                        matrix = new Matrix();
                        width = bitmapDecodeStream.getWidth() / 2.0f;
                        height = bitmapDecodeStream.getHeight() / 2.0f;
                        if (z10) {
                            matrix.postScale(-1.0f, 1.0f, width, height);
                        }
                        if (i5 > 0) {
                            z4 = true;
                        } else {
                            z4 = z3;
                        }
                        if (z4) {
                            matrix.postRotate(i5, width, height);
                        }
                        rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                        matrix.mapRect(rectF);
                        f = rectF.left;
                        if (f == 0.0f) {
                            z5 = true;
                        } else {
                            z5 = z3;
                        }
                        if (z5) {
                            matrix.postTranslate(-f, -rectF.top);
                        } else {
                            if (rectF.top == 0.0f) {
                                z7 = true;
                            } else {
                                z7 = z3;
                            }
                            if (!z7) {
                                matrix.postTranslate(-f, -rectF.top);
                            }
                        }
                        i2 = i6;
                        if (i2 != 90) {
                            z6 = true;
                        } else {
                            z6 = true;
                        }
                        if (z6) {
                            int height8 = bitmapDecodeStream.getHeight();
                            int width8 = bitmapDecodeStream.getWidth();
                            config2 = bitmapDecodeStream.getConfig();
                            if (config2 == null) {
                                config2 = Bitmap.Config.ARGB_8888;
                            }
                            bitmapCreateBitmap = Bitmap.createBitmap(height8, width8, config2);
                            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(width, height, config)");
                        } else {
                            int width9 = bitmapDecodeStream.getWidth();
                            int height9 = bitmapDecodeStream.getHeight();
                            config = bitmapDecodeStream.getConfig();
                            if (config == null) {
                                config = Bitmap.Config.ARGB_8888;
                            }
                            bitmapCreateBitmap = Bitmap.createBitmap(width9, height9, config);
                            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(width, height, config)");
                        }
                        new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, Oooo000.f36543OooO00o);
                        bitmapDecodeStream.recycle();
                        bitmapDecodeStream = bitmapCreateBitmap;
                    }
                }
                BitmapDrawable bitmapDrawable2 = new BitmapDrawable(context.getResources(), bitmapDecodeStream);
                if (options.inSampleSize <= 1) {
                    z8 = true;
                } else {
                    z8 = true;
                }
                return new OooOOO0(bitmapDrawable2, z8);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(o0o0000VarOooO0O0, th);
                    throw th2;
                }
            }
            z3 = false;
        }
    }

    public OooOO0(@NotNull o000OO o000oo2, @NotNull o0O0O00 o0o0o00, @NotNull Semaphore semaphore, @NotNull ExifOrientationPolicy exifOrientationPolicy) {
        this.f36521OooO00o = o000oo2;
        this.f36522OooO0O0 = o0o0o00;
        this.f36523OooO0OO = semaphore;
        this.f36524OooO0Oo = exifOrientationPolicy;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p124o00O0o00.OooOOOO
    @Nullable
    public final Object OooO00o(@NotNull Continuation<? super OooOOO0> continuation) throws Throwable {
        OooO0OO oooO0OO;
        Semaphore semaphore;
        OooOO0 oooOO1;
        Semaphore semaphore2;
        if (continuation instanceof OooO0OO) {
            oooO0OO = (OooO0OO) continuation;
            int i = oooO0OO.f36532OooO0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0OO.f36532OooO0oo = i - Integer.MIN_VALUE;
            } else {
                oooO0OO = new OooO0OO(continuation);
            }
        } else {
            oooO0OO = new OooO0OO(continuation);
        }
        Object objRunInterruptible$default = oooO0OO.f36529OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0OO.f36532OooO0oo;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objRunInterruptible$default);
                oooO0OO.f36528OooO0Oo = this;
                semaphore = this.f36523OooO0OO;
                oooO0OO.f36530OooO0o0 = semaphore;
                oooO0OO.f36532OooO0oo = 1;
                if (semaphore.acquire(oooO0OO) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooOO1 = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    semaphore2 = (Semaphore) oooO0OO.f36528OooO0Oo;
                    try {
                        ResultKt.throwOnFailure(objRunInterruptible$default);
                        OooOOO0 oooOOO0 = (OooOOO0) objRunInterruptible$default;
                        semaphore2.release();
                        return oooOOO0;
                    } catch (Throwable th) {
                        th = th;
                        semaphore = semaphore2;
                        semaphore.release();
                        throw th;
                    }
                }
                semaphore = oooO0OO.f36530OooO0o0;
                oooOO1 = (OooOO0) oooO0OO.f36528OooO0Oo;
                ResultKt.throwOnFailure(objRunInterruptible$default);
            }
            OooO0o oooO0o = oooOO1.new OooO0o();
            oooO0OO.f36528OooO0Oo = semaphore;
            oooO0OO.f36530OooO0o0 = null;
            oooO0OO.f36532OooO0oo = 2;
            objRunInterruptible$default = InterruptibleKt.runInterruptible$default(null, oooO0o, oooO0OO, 1, null);
            if (objRunInterruptible$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            semaphore2 = semaphore;
            OooOOO0 oooOOO1 = (OooOOO0) objRunInterruptible$default;
            semaphore2.release();
            return oooOOO1;
        } catch (Throwable th2) {
            th = th2;
            semaphore.release();
            throw th;
        }
    }
}

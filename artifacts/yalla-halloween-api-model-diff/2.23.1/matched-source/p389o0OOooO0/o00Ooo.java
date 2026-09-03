package p389o0OOooO0;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.BoringLayout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.opensource.svgaplayer.entities.SVGAVideoShapeEntity;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import o0OO0O0O.OooOO0;
import o0OO0o00.OooO0o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p334o0OO0Ooo.OooO;
import p334o0OO0Ooo.OooOO0O;
import p334o0OO0Ooo.OooOOO;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSVGACanvasDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SVGACanvasDrawer.kt\ncom/opensource/svgaplayer/drawer/SVGACanvasDrawer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,593:1\n1864#2,3:594\n1864#2,3:597\n1864#2,3:600\n1855#2,2:603\n1855#2,2:605\n*S KotlinDebug\n*F\n+ 1 SVGACanvasDrawer.kt\ncom/opensource/svgaplayer/drawer/SVGACanvasDrawer\n*L\n55#1:594,3\n105#1:597,3\n135#1:600,3\n168#1:603,2\n367#1:605,2\n*E\n"})
public final class o00Ooo extends o00Oo0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public Boolean[] f43525OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final OooOO0 f43526OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final HashMap<String, Bitmap> f43527OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f43528OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final OooO00o f43529OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public Boolean[] f43530OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final float[] f43531OooOO0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f43532OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f43533OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final HashMap<SVGAVideoShapeEntity, Path> f43534OooO0OO = new HashMap<>();
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public Bitmap f43541OooO0oO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final Paint f43535OooO00o = new Paint();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final Path f43536OooO0O0 = new Path();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final Path f43537OooO0OO = new Path();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final Matrix f43538OooO0Oo = new Matrix();

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NotNull
        public final Matrix f43540OooO0o0 = new Matrix();

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @NotNull
        public final Paint f43539OooO0o = new Paint();
    }

    public /* synthetic */ class OooO0OO {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Paint.Align.values().length];
            try {
                iArr[Paint.Align.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Paint.Align.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Ooo(@NotNull o0OO0O0O.o00Ooo videoItem, @NotNull OooOO0 dynamicItem) {
        super(videoItem);
        Intrinsics.checkNotNullParameter(videoItem, "videoItem");
        Intrinsics.checkNotNullParameter(dynamicItem, "dynamicItem");
        this.f43526OooO0Oo = dynamicItem;
        this.f43528OooO0o0 = new OooO0O0();
        this.f43527OooO0o = new HashMap<>();
        this.f43529OooO0oO = new OooO00o();
        this.f43531OooOO0 = new float[16];
    }

    /* JADX WARN: Code duplicated, block: B:204:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:206:0x0500  */
    /* JADX WARN: Code duplicated, block: B:208:0x0509  */
    /* JADX WARN: Code duplicated, block: B:212:0x0527  */
    /* JADX WARN: Code duplicated, block: B:215:0x0536  */
    /* JADX WARN: Code duplicated, block: B:21:0x008e  */
    /* JADX WARN: Code duplicated, block: B:229:0x058d  */
    /* JADX WARN: Code duplicated, block: B:232:0x0592  */
    /* JADX WARN: Code duplicated, block: B:263:0x064c  */
    /* JADX WARN: Code duplicated, block: B:270:0x0664  */
    /* JADX WARN: Code duplicated, block: B:271:0x066a  */
    /* JADX WARN: Code duplicated, block: B:273:0x0670  */
    /* JADX WARN: Code duplicated, block: B:274:0x0676  */
    /* JADX WARN: Code duplicated, block: B:276:0x067e  */
    /* JADX WARN: Code duplicated, block: B:283:0x0693  */
    /* JADX WARN: Code duplicated, block: B:284:0x0699  */
    /* JADX WARN: Code duplicated, block: B:286:0x069f  */
    /* JADX WARN: Code duplicated, block: B:287:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:289:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:292:0x06b6  */
    /* JADX WARN: Code duplicated, block: B:312:0x0708  */
    /* JADX WARN: Code duplicated, block: B:316:0x0717  */
    /* JADX WARN: Code duplicated, block: B:319:0x0723  */
    /* JADX WARN: Code duplicated, block: B:320:0x0735  */
    /* JADX WARN: Code duplicated, block: B:323:0x0744  */
    /* JADX WARN: Code duplicated, block: B:327:0x0757  */
    public final void OooO00o(o00Oo0.OooO00o oooO00o, Canvas canvas, int i) {
        Canvas canvas2;
        OooO0O0 oooO0O0;
        Canvas canvas3;
        Iterator it;
        Canvas canvas4;
        OooOO0 oooOO1;
        OooO0O0 oooO0O1;
        HashMap<SVGAVideoShapeEntity, Path> map;
        Matrix matrix;
        Matrix matrix2;
        SVGAVideoShapeEntity.OooO00o oooO00o2;
        SVGAVideoShapeEntity.OooO00o oooO00o3;
        char c;
        Matrix matrix3;
        float fAbs;
        SVGAVideoShapeEntity.OooO00o oooO00o4;
        SVGAVideoShapeEntity.OooO00o oooO00o5;
        SVGAVideoShapeEntity.OooO00o oooO00o6;
        SVGAVideoShapeEntity.OooO00o oooO00o7;
        SVGAVideoShapeEntity.OooO00o oooO00o8;
        OooOOO oooOOO;
        OooO oooO;
        OooOOO oooOOO2;
        float[] fArr;
        String str;
        String str2;
        int i2;
        Path path;
        Path path2;
        String strSubstring;
        OooO0O0 oooO0O2;
        Matrix matrix4;
        Path path3;
        double d;
        Bitmap bitmapCreateBitmap;
        int i3;
        TextPaint textPaint;
        o00Oo0.OooO00o oooO00o9 = oooO00o;
        String str3 = oooO00o9.f43523OooO0O0;
        OooO0O0 oooO0O3 = this.f43528OooO0o0;
        o0OO0O0O.o00Ooo o00ooo2 = this.f43519OooO00o;
        OooOO0 oooOO2 = this.f43526OooO0Oo;
        if (str3 == null || Intrinsics.areEqual(oooOO2.f42357OooO00o.get(str3), Boolean.TRUE)) {
            canvas2 = canvas;
            oooO0O0 = oooO0O3;
        } else {
            if (StringsKt__StringsJVMKt.endsWith$default(str3, ".matte", false, 2, null)) {
                strSubstring = str3.substring(0, str3.length() - 6);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                strSubstring = str3;
            }
            Bitmap bitmap = oooOO2.f42358OooO0O0.get(strSubstring);
            if (bitmap == null && (bitmap = o00ooo2.f42408OooOO0.get(strSubstring)) == null) {
                canvas2 = canvas;
                oooO0O0 = oooO0O3;
            } else {
                OooOOO oooOOO3 = oooO00o9.f43524OooO0OO;
                Intrinsics.checkNotNull(oooOOO3);
                Matrix matrixOooO0O0 = OooO0O0(oooOOO3.f42426OooO0OO);
                Paint paint = oooO0O3.f43535OooO00o;
                paint.reset();
                paint.setAntiAlias(o00ooo2.f42401OooO0O0);
                paint.setFilterBitmap(o00ooo2.f42401OooO0O0);
                OooOOO oooOOO4 = oooO00o9.f43524OooO0OO;
                Intrinsics.checkNotNull(oooOOO4);
                double d2 = 255;
                paint.setAlpha((int) (oooOOO4.f42424OooO00o * d2));
                OooOOO oooOOO5 = oooO00o9.f43524OooO0OO;
                Intrinsics.checkNotNull(oooOOO5);
                OooO oooO2 = oooOOO5.f42427OooO0Oo;
                Path path4 = oooO0O3.f43536OooO0O0;
                if (oooO2 != null) {
                    OooOOO oooOOO6 = oooO00o9.f43524OooO0OO;
                    Intrinsics.checkNotNull(oooOOO6);
                    OooO oooO3 = oooOOO6.f42427OooO0Oo;
                    if (oooO3 == null) {
                        canvas2 = canvas;
                        oooO0O0 = oooO0O3;
                    } else {
                        canvas.save();
                        path4.reset();
                        oooO3.OooO00o(path4);
                        path4.transform(matrixOooO0O0);
                        canvas.clipPath(path4);
                        OooOOO oooOOO7 = oooO00o9.f43524OooO0OO;
                        Intrinsics.checkNotNull(oooOOO7);
                        oooO0O2 = oooO0O3;
                        float width = (float) (oooOOO7.f42425OooO0O0.f42459OooO00o / ((double) bitmap.getWidth()));
                        OooOOO oooOOO8 = oooO00o9.f43524OooO0OO;
                        Intrinsics.checkNotNull(oooOOO8);
                        matrix4 = matrixOooO0O0;
                        matrix4.preScale(width, (float) (oooOOO8.f42425OooO0O0.f42460OooO0O0 / ((double) bitmap.getHeight())));
                        if (!bitmap.isRecycled()) {
                            canvas.drawBitmap(bitmap, matrix4, paint);
                        }
                        canvas.restore();
                        path3 = path4;
                        d = d2;
                    }
                } else {
                    oooO0O2 = oooO0O3;
                    matrix4 = matrixOooO0O0;
                    OooOOO oooOOO9 = oooO00o9.f43524OooO0OO;
                    Intrinsics.checkNotNull(oooOOO9);
                    path3 = path4;
                    float width2 = (float) (oooOOO9.f42425OooO0O0.f42459OooO00o / ((double) bitmap.getWidth()));
                    OooOOO oooOOO10 = oooO00o9.f43524OooO0OO;
                    Intrinsics.checkNotNull(oooOOO10);
                    d = d2;
                    matrix4.preScale(width2, (float) (oooOOO10.f42425OooO0O0.f42460OooO0O0 / ((double) bitmap.getHeight())));
                    if (!bitmap.isRecycled()) {
                        canvas.drawBitmap(bitmap, matrix4, paint);
                    }
                }
                o0OO0O0O.OooO00o oooO00o10 = oooOO2.f42356OooO.get(str3);
                if (oooO00o10 != null) {
                    matrix4.getValues(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
                    bitmap.getWidth();
                    bitmap.getHeight();
                    oooO00o10.OooO00o();
                }
                boolean z = oooOO2.f42366OooOO0O;
                HashMap<String, Bitmap> map2 = this.f43527OooO0o;
                if (z) {
                    map2.clear();
                    oooOO2.f42366OooOO0O = false;
                }
                String str4 = oooO00o9.f43523OooO0O0;
                if (str4 == null) {
                    canvas2 = canvas;
                } else {
                    String str5 = oooOO2.f42359OooO0OO.get(str4);
                    if (str5 == null || (textPaint = oooOO2.f42360OooO0Oo.get(str4)) == null) {
                        bitmapCreateBitmap = null;
                    } else {
                        bitmapCreateBitmap = map2.get(str4);
                        if (bitmapCreateBitmap == null) {
                            bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                            Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                            Intrinsics.checkNotNull(bitmapCreateBitmap);
                            Canvas canvas5 = new Canvas(bitmapCreateBitmap);
                            textPaint.setAntiAlias(true);
                            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
                            float f = 2;
                            float fCenterY = (rect.centerY() - (fontMetrics.top / f)) - (fontMetrics.bottom / f);
                            String string = TextUtils.ellipsize(str5, textPaint, rect.width(), TextUtils.TruncateAt.END).toString();
                            Paint.Align textAlign = textPaint.getTextAlign();
                            int i4 = textAlign == null ? -1 : OooO0OO.$EnumSwitchMapping$0[textAlign.ordinal()];
                            if (i4 == 1) {
                                canvas5.drawText(string, rect.left, fCenterY, textPaint);
                            } else if (i4 != 2) {
                                canvas5.drawText(string, rect.centerX(), fCenterY, textPaint);
                            } else {
                                canvas5.drawText(string, rect.right, fCenterY, textPaint);
                            }
                            map2.put(str4, bitmapCreateBitmap);
                        }
                    }
                    BoringLayout boringLayout = oooOO2.f42361OooO0o.get(str4);
                    if (boringLayout != null) {
                        Bitmap bitmapCreateBitmap2 = map2.get(str4);
                        if (bitmapCreateBitmap2 == null) {
                            boringLayout.getPaint().setAntiAlias(true);
                            bitmapCreateBitmap2 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                            Intrinsics.checkNotNull(bitmapCreateBitmap2);
                            Canvas canvas6 = new Canvas(bitmapCreateBitmap2);
                            canvas6.translate(0.0f, (bitmap.getHeight() - boringLayout.getHeight()) / 2);
                            boringLayout.draw(canvas6);
                            map2.put(str4, bitmapCreateBitmap2);
                        }
                        bitmapCreateBitmap = bitmapCreateBitmap2;
                    }
                    StaticLayout staticLayout = oooOO2.f42362OooO0o0.get(str4);
                    if (staticLayout != null) {
                        Bitmap bitmapCreateBitmap3 = map2.get(str4);
                        if (bitmapCreateBitmap3 == null) {
                            staticLayout.getPaint().setAntiAlias(true);
                            try {
                                Field declaredField = StaticLayout.class.getDeclaredField("mMaximumVisibleLineCount");
                                declaredField.setAccessible(true);
                                i3 = declaredField.getInt(staticLayout);
                            } catch (Exception unused) {
                                i3 = Integer.MAX_VALUE;
                            }
                            StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(staticLayout.getText(), 0, staticLayout.getText().length(), staticLayout.getPaint(), bitmap.getWidth()).setAlignment(staticLayout.getAlignment()).setMaxLines(i3).setEllipsize(TextUtils.TruncateAt.END).build();
                            Intrinsics.checkNotNullExpressionValue(staticLayoutBuild, "if (Build.VERSION.SDK_IN… false)\n                }");
                            bitmapCreateBitmap3 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                            Intrinsics.checkNotNull(bitmapCreateBitmap3);
                            Canvas canvas7 = new Canvas(bitmapCreateBitmap3);
                            canvas7.translate(0.0f, (bitmap.getHeight() - staticLayoutBuild.getHeight()) / 2);
                            staticLayoutBuild.draw(canvas7);
                            map2.put(str4, bitmapCreateBitmap3);
                        }
                        bitmapCreateBitmap = bitmapCreateBitmap3;
                    }
                    if (bitmapCreateBitmap != null) {
                        oooO0O0 = oooO0O2;
                        Paint paint2 = oooO0O0.f43535OooO00o;
                        paint2.reset();
                        paint2.setAntiAlias(o00ooo2.f42401OooO0O0);
                        OooOOO oooOOO11 = oooO00o9.f43524OooO0OO;
                        Intrinsics.checkNotNull(oooOOO11);
                        paint2.setAlpha((int) (oooOOO11.f42424OooO00o * d));
                        OooOOO oooOOO12 = oooO00o9.f43524OooO0OO;
                        Intrinsics.checkNotNull(oooOOO12);
                        if (oooOOO12.f42427OooO0Oo != null) {
                            OooOOO oooOOO13 = oooO00o9.f43524OooO0OO;
                            Intrinsics.checkNotNull(oooOOO13);
                            OooO oooO4 = oooOOO13.f42427OooO0Oo;
                            if (oooO4 == null) {
                                canvas2 = canvas;
                            } else {
                                canvas.save();
                                canvas2 = canvas;
                                canvas2.concat(matrix4);
                                canvas2.clipRect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                                paint2.setShader(new BitmapShader(bitmapCreateBitmap, tileMode, tileMode));
                                path3.reset();
                                Path path5 = path3;
                                oooO4.OooO00o(path5);
                                canvas2.drawPath(path5, paint2);
                                canvas.restore();
                            }
                        } else {
                            canvas2 = canvas;
                            paint2.setFilterBitmap(o00ooo2.f42401OooO0O0);
                            canvas2.drawBitmap(bitmapCreateBitmap, matrix4, paint2);
                        }
                    } else {
                        canvas2 = canvas;
                    }
                }
                oooO0O0 = oooO0O2;
            }
        }
        OooOOO oooOOO14 = oooO00o9.f43524OooO0OO;
        Intrinsics.checkNotNull(oooOOO14);
        Matrix matrixOooO0O1 = OooO0O0(oooOOO14.f42426OooO0OO);
        OooOOO oooOOO15 = oooO00o9.f43524OooO0OO;
        Intrinsics.checkNotNull(oooOOO15);
        Iterator it2 = oooOOO15.f42428OooO0o0.iterator();
        o00Oo0.OooO00o oooO00o11 = oooO00o9;
        Canvas canvas8 = canvas2;
        Canvas canvas9 = canvas8;
        while (it2.hasNext()) {
            SVGAVideoShapeEntity shape = (SVGAVideoShapeEntity) it2.next();
            if (shape.f20811OooO0o0 != null) {
                it = it2;
            } else {
                Path path6 = OooOO0O.f42423OooO00o;
                path6.reset();
                SVGAVideoShapeEntity.Type type = shape.f20807OooO00o;
                if (type == SVGAVideoShapeEntity.Type.shape) {
                    HashMap map3 = shape.f20808OooO0O0;
                    Object obj = map3 != null ? map3.get("d") : null;
                    String str6 = obj instanceof String ? (String) obj : null;
                    if (str6 != null) {
                        new OooO(str6).OooO00o(path6);
                    }
                    it = it2;
                    canvas4 = canvas8;
                    oooOO1 = oooOO2;
                } else {
                    it = it2;
                    if (type == SVGAVideoShapeEntity.Type.ellipse) {
                        HashMap map4 = shape.f20808OooO0O0;
                        Object obj2 = map4 != null ? map4.get("x") : null;
                        Number number = obj2 instanceof Number ? (Number) obj2 : null;
                        if (number != null) {
                            HashMap map5 = shape.f20808OooO0O0;
                            Object obj3 = map5 != null ? map5.get("y") : null;
                            Number number2 = obj3 instanceof Number ? (Number) obj3 : null;
                            if (number2 != null) {
                                HashMap map6 = shape.f20808OooO0O0;
                                Object obj4 = map6 != null ? map6.get("radiusX") : null;
                                Number number3 = obj4 instanceof Number ? (Number) obj4 : null;
                                if (number3 != null) {
                                    HashMap map7 = shape.f20808OooO0O0;
                                    canvas4 = canvas8;
                                    Object obj5 = map7 != null ? map7.get("radiusY") : null;
                                    Number number4 = obj5 instanceof Number ? (Number) obj5 : null;
                                    if (number4 != null) {
                                        float fFloatValue = number.floatValue();
                                        float fFloatValue2 = number2.floatValue();
                                        float fFloatValue3 = number3.floatValue();
                                        float fFloatValue4 = number4.floatValue();
                                        oooOO1 = oooOO2;
                                        path6.addOval(new RectF(fFloatValue - fFloatValue3, fFloatValue2 - fFloatValue4, fFloatValue + fFloatValue3, fFloatValue2 + fFloatValue4), Path.Direction.CW);
                                    }
                                    if (shape.f20811OooO0o0 != null) {
                                        Paint paint3 = oooO0O0.f43535OooO00o;
                                        paint3.reset();
                                        paint3.reset();
                                        paint3.setAntiAlias(o00ooo2.f42401OooO0O0);
                                        OooOOO oooOOO16 = oooO00o11.f43524OooO0OO;
                                        Intrinsics.checkNotNull(oooOOO16);
                                        double d3 = 255;
                                        paint3.setAlpha((int) (oooOOO16.f42424OooO00o * d3));
                                        Path path7 = oooO0O0.f43536OooO0O0;
                                        path7.reset();
                                        path7.reset();
                                        OooO00o oooO00o12 = this.f43529OooO0oO;
                                        oooO00o12.getClass();
                                        Intrinsics.checkNotNullParameter(shape, "shape");
                                        map = oooO00o12.f43534OooO0OO;
                                        if (!map.containsKey(shape)) {
                                            path = new Path();
                                            path2 = shape.f20811OooO0o0;
                                            if (path2 != null) {
                                                path.set(path2);
                                            }
                                            map.put(shape, path);
                                        }
                                        Path path8 = map.get(shape);
                                        Intrinsics.checkNotNull(path8);
                                        path7.addPath(path8);
                                        matrix = oooO0O0.f43540OooO0o0;
                                        matrix.reset();
                                        matrix.reset();
                                        matrix2 = shape.f20810OooO0Oo;
                                        if (matrix2 != null) {
                                            matrix.postConcat(matrix2);
                                        }
                                        matrix.postConcat(matrixOooO0O1);
                                        path7.transform(matrix);
                                        oooO00o2 = shape.f20809OooO0OO;
                                        Path path9 = oooO0O0.f43537OooO0OO;
                                        if (oooO00o2 != null || (i2 = oooO00o2.f20812OooO00o) == 0) {
                                            oooO0O1 = oooO0O0;
                                        } else {
                                            paint3.setStyle(Paint.Style.FILL);
                                            paint3.setColor(i2);
                                            OooOOO oooOOO17 = oooO00o11.f43524OooO0OO;
                                            Intrinsics.checkNotNull(oooOOO17);
                                            oooO0O1 = oooO0O0;
                                            int iMin = Math.min(255, Math.max(0, (int) (oooOOO17.f42424OooO00o * d3)));
                                            if (iMin != 255) {
                                                paint3.setAlpha(iMin);
                                            }
                                            OooOOO oooOOO18 = oooO00o11.f43524OooO0OO;
                                            Intrinsics.checkNotNull(oooOOO18);
                                            if (oooOOO18.f42427OooO0Oo != null) {
                                                canvas.save();
                                            }
                                            OooOOO oooOOO19 = oooO00o11.f43524OooO0OO;
                                            Intrinsics.checkNotNull(oooOOO19);
                                            OooO oooO5 = oooOOO19.f42427OooO0Oo;
                                            if (oooO5 != null) {
                                                path9.reset();
                                                oooO5.OooO00o(path9);
                                                path9.transform(matrixOooO0O1);
                                                canvas9.clipPath(path9);
                                            }
                                            canvas9.drawPath(path7, paint3);
                                            OooOOO oooOOO20 = oooO00o11.f43524OooO0OO;
                                            Intrinsics.checkNotNull(oooOOO20);
                                            if (oooOOO20.f42427OooO0Oo != null) {
                                                canvas.restore();
                                            }
                                        }
                                        oooO00o3 = shape.f20809OooO0OO;
                                        if (oooO00o3 != null || oooO00o3.f20814OooO0OO <= 0.0f) {
                                            oooO00o = oooO00o;
                                        } else {
                                            OooOOO oooOOO21 = oooO00o11.f43524OooO0OO;
                                            Intrinsics.checkNotNull(oooOOO21);
                                            paint3.setAlpha((int) (oooOOO21.f42424OooO00o * d3));
                                            paint3.setStyle(Paint.Style.STROKE);
                                            SVGAVideoShapeEntity.OooO00o oooO00o13 = shape.f20809OooO0OO;
                                            if (oooO00o13 != null) {
                                                paint3.setColor(oooO00o13.f20813OooO0O0);
                                                OooOOO oooOOO22 = oooO00o11.f43524OooO0OO;
                                                Intrinsics.checkNotNull(oooOOO22);
                                                c = 0;
                                                int iMin2 = Math.min(255, Math.max(0, (int) (oooOOO22.f42424OooO00o * d3)));
                                                if (iMin2 != 255) {
                                                    paint3.setAlpha(iMin2);
                                                }
                                            } else {
                                                c = 0;
                                            }
                                            float[] fArr2 = this.f43531OooOO0;
                                            matrixOooO0O1.getValues(fArr2);
                                            float f2 = fArr2[c];
                                            if (f2 == 0.0f) {
                                                matrix3 = matrixOooO0O1;
                                            } else {
                                                double d4 = f2;
                                                double d5 = fArr2[3];
                                                double d6 = fArr2[1];
                                                matrix3 = matrixOooO0O1;
                                                double d7 = fArr2[4];
                                                if (!(d4 * d7 == d5 * d6)) {
                                                    double dSqrt = Math.sqrt((d5 * d5) + (d4 * d4));
                                                    double d8 = d4 / dSqrt;
                                                    double d9 = d5 / dSqrt;
                                                    double d10 = (d9 * d7) + (d8 * d6);
                                                    double d11 = d6 - (d8 * d10);
                                                    double d12 = d7 - (d10 * d9);
                                                    double dSqrt2 = Math.sqrt((d12 * d12) + (d11 * d11));
                                                    if ((d12 / dSqrt2) * d8 < d9 * (d11 / dSqrt2)) {
                                                        dSqrt = -dSqrt;
                                                    }
                                                    fAbs = Math.abs(this.f43520OooO0O0.f42465OooO0o0 ? (float) dSqrt : (float) dSqrt2);
                                                }
                                                oooO00o4 = shape.f20809OooO0OO;
                                                if (oooO00o4 != null) {
                                                    paint3.setStrokeWidth(oooO00o4.f20814OooO0OO * fAbs);
                                                }
                                                oooO00o5 = shape.f20809OooO0OO;
                                                if (oooO00o5 != null && (str2 = oooO00o5.f20815OooO0Oo) != null) {
                                                    if (StringsKt__StringsJVMKt.equals(str2, "butt", true)) {
                                                        paint3.setStrokeCap(Paint.Cap.BUTT);
                                                    } else if (StringsKt__StringsJVMKt.equals(str2, "round", true)) {
                                                        paint3.setStrokeCap(Paint.Cap.ROUND);
                                                    } else if (StringsKt__StringsJVMKt.equals(str2, "square", true)) {
                                                        paint3.setStrokeCap(Paint.Cap.SQUARE);
                                                    }
                                                }
                                                oooO00o6 = shape.f20809OooO0OO;
                                                if (oooO00o6 != null && (str = oooO00o6.f20817OooO0o0) != null) {
                                                    if (StringsKt__StringsJVMKt.equals(str, "miter", true)) {
                                                        paint3.setStrokeJoin(Paint.Join.MITER);
                                                    } else if (StringsKt__StringsJVMKt.equals(str, "round", true)) {
                                                        paint3.setStrokeJoin(Paint.Join.ROUND);
                                                    } else if (StringsKt__StringsJVMKt.equals(str, "bevel", true)) {
                                                        paint3.setStrokeJoin(Paint.Join.BEVEL);
                                                    }
                                                }
                                                oooO00o7 = shape.f20809OooO0OO;
                                                if (oooO00o7 != null) {
                                                    paint3.setStrokeMiter(oooO00o7.f20816OooO0o * fAbs);
                                                }
                                                oooO00o8 = shape.f20809OooO0OO;
                                                if (oooO00o8 == null && (fArr = oooO00o8.f20818OooO0oO) != null && fArr.length == 3) {
                                                    if (fArr[0] > 0.0f || fArr[1] > 0.0f) {
                                                        float[] fArr3 = new float[2];
                                                        float f3 = fArr[0];
                                                        if (f3 < 1.0f) {
                                                            f3 = 1.0f;
                                                        }
                                                        fArr3[0] = f3 * fAbs;
                                                        float f4 = fArr[1];
                                                        if (f4 < 0.1f) {
                                                            f4 = 0.1f;
                                                        }
                                                        fArr3[1] = f4 * fAbs;
                                                        paint3.setPathEffect(new DashPathEffect(fArr3, fArr[2] * fAbs));
                                                    }
                                                    oooOOO = oooO00o.f43524OooO0OO;
                                                    Intrinsics.checkNotNull(oooOOO);
                                                    if (oooOOO.f42427OooO0Oo != null) {
                                                        canvas.save();
                                                    }
                                                    OooOOO oooOOO23 = oooO00o.f43524OooO0OO;
                                                    Intrinsics.checkNotNull(oooOOO23);
                                                    oooO = oooOOO23.f42427OooO0Oo;
                                                    if (oooO != null) {
                                                        path9.reset();
                                                        oooO.OooO00o(path9);
                                                        matrixOooO0O1 = matrix3;
                                                        path9.transform(matrixOooO0O1);
                                                        canvas = canvas;
                                                        canvas.clipPath(path9);
                                                    } else {
                                                        canvas = canvas;
                                                        matrixOooO0O1 = matrix3;
                                                    }
                                                    canvas.drawPath(path7, paint3);
                                                    oooOOO2 = oooO00o.f43524OooO0OO;
                                                    Intrinsics.checkNotNull(oooOOO2);
                                                    if (oooOOO2.f42427OooO0Oo != null) {
                                                        canvas.restore();
                                                    }
                                                    oooO00o11 = oooO00o;
                                                    canvas9 = canvas;
                                                    canvas4 = canvas9;
                                                }
                                                oooOOO = oooO00o.f43524OooO0OO;
                                                Intrinsics.checkNotNull(oooOOO);
                                                if (oooOOO.f42427OooO0Oo != null) {
                                                    canvas.save();
                                                }
                                                OooOOO oooOOO24 = oooO00o.f43524OooO0OO;
                                                Intrinsics.checkNotNull(oooOOO24);
                                                oooO = oooOOO24.f42427OooO0Oo;
                                                if (oooO != null) {
                                                    path9.reset();
                                                    oooO.OooO00o(path9);
                                                    matrixOooO0O1 = matrix3;
                                                    path9.transform(matrixOooO0O1);
                                                    canvas = canvas;
                                                    canvas.clipPath(path9);
                                                } else {
                                                    canvas = canvas;
                                                    matrixOooO0O1 = matrix3;
                                                }
                                                canvas.drawPath(path7, paint3);
                                                oooOOO2 = oooO00o.f43524OooO0OO;
                                                Intrinsics.checkNotNull(oooOOO2);
                                                if (oooOOO2.f42427OooO0Oo != null) {
                                                    canvas.restore();
                                                }
                                                oooO00o11 = oooO00o;
                                                canvas9 = canvas;
                                                canvas4 = canvas9;
                                            }
                                            fAbs = 0.0f;
                                            oooO00o4 = shape.f20809OooO0OO;
                                            if (oooO00o4 != null) {
                                                paint3.setStrokeWidth(oooO00o4.f20814OooO0OO * fAbs);
                                            }
                                            oooO00o5 = shape.f20809OooO0OO;
                                            if (oooO00o5 != null) {
                                                if (StringsKt__StringsJVMKt.equals(str2, "butt", true)) {
                                                    paint3.setStrokeCap(Paint.Cap.BUTT);
                                                } else if (StringsKt__StringsJVMKt.equals(str2, "round", true)) {
                                                    paint3.setStrokeCap(Paint.Cap.ROUND);
                                                } else if (StringsKt__StringsJVMKt.equals(str2, "square", true)) {
                                                    paint3.setStrokeCap(Paint.Cap.SQUARE);
                                                }
                                            }
                                            oooO00o6 = shape.f20809OooO0OO;
                                            if (oooO00o6 != null) {
                                                if (StringsKt__StringsJVMKt.equals(str, "miter", true)) {
                                                    paint3.setStrokeJoin(Paint.Join.MITER);
                                                } else if (StringsKt__StringsJVMKt.equals(str, "round", true)) {
                                                    paint3.setStrokeJoin(Paint.Join.ROUND);
                                                } else if (StringsKt__StringsJVMKt.equals(str, "bevel", true)) {
                                                    paint3.setStrokeJoin(Paint.Join.BEVEL);
                                                }
                                            }
                                            oooO00o7 = shape.f20809OooO0OO;
                                            if (oooO00o7 != null) {
                                                paint3.setStrokeMiter(oooO00o7.f20816OooO0o * fAbs);
                                            }
                                            oooO00o8 = shape.f20809OooO0OO;
                                            if (oooO00o8 == null) {
                                            }
                                            oooOOO = oooO00o.f43524OooO0OO;
                                            Intrinsics.checkNotNull(oooOOO);
                                            if (oooOOO.f42427OooO0Oo != null) {
                                                canvas.save();
                                            }
                                            OooOOO oooOOO25 = oooO00o.f43524OooO0OO;
                                            Intrinsics.checkNotNull(oooOOO25);
                                            oooO = oooOOO25.f42427OooO0Oo;
                                            if (oooO != null) {
                                                path9.reset();
                                                oooO.OooO00o(path9);
                                                matrixOooO0O1 = matrix3;
                                                path9.transform(matrixOooO0O1);
                                                canvas = canvas;
                                                canvas.clipPath(path9);
                                            } else {
                                                canvas = canvas;
                                                matrixOooO0O1 = matrix3;
                                            }
                                            canvas.drawPath(path7, paint3);
                                            oooOOO2 = oooO00o.f43524OooO0OO;
                                            Intrinsics.checkNotNull(oooOOO2);
                                            if (oooOOO2.f42427OooO0Oo != null) {
                                                canvas.restore();
                                            }
                                            oooO00o11 = oooO00o;
                                            canvas9 = canvas;
                                            canvas4 = canvas9;
                                        }
                                        oooO00o9 = oooO00o;
                                        canvas2 = canvas;
                                        oooO0O0 = oooO0O1;
                                        it2 = it;
                                        canvas8 = canvas4;
                                        oooOO2 = oooOO1;
                                        o00ooo2 = o00ooo2;
                                    } else {
                                        oooO0O1 = oooO0O0;
                                        oooO00o = oooO00o9;
                                    }
                                    o00ooo2 = o00ooo2;
                                    oooO00o9 = oooO00o;
                                    canvas2 = canvas;
                                    oooO0O0 = oooO0O1;
                                    it2 = it;
                                    canvas8 = canvas4;
                                    oooOO2 = oooOO1;
                                    o00ooo2 = o00ooo2;
                                }
                            }
                        }
                        oooOO1 = oooOO2;
                        if (shape.f20811OooO0o0 != null) {
                            Paint paint4 = oooO0O0.f43535OooO00o;
                            paint4.reset();
                            paint4.reset();
                            paint4.setAntiAlias(o00ooo2.f42401OooO0O0);
                            OooOOO oooOOO110 = oooO00o11.f43524OooO0OO;
                            Intrinsics.checkNotNull(oooOOO110);
                            double d13 = 255;
                            paint4.setAlpha((int) (oooOOO110.f42424OooO00o * d13));
                            Path path10 = oooO0O0.f43536OooO0O0;
                            path10.reset();
                            path10.reset();
                            OooO00o oooO00o14 = this.f43529OooO0oO;
                            oooO00o14.getClass();
                            Intrinsics.checkNotNullParameter(shape, "shape");
                            map = oooO00o14.f43534OooO0OO;
                            if (!map.containsKey(shape)) {
                                path = new Path();
                                path2 = shape.f20811OooO0o0;
                                if (path2 != null) {
                                    path.set(path2);
                                }
                                map.put(shape, path);
                            }
                            Path path11 = map.get(shape);
                            Intrinsics.checkNotNull(path11);
                            path10.addPath(path11);
                            matrix = oooO0O0.f43540OooO0o0;
                            matrix.reset();
                            matrix.reset();
                            matrix2 = shape.f20810OooO0Oo;
                            if (matrix2 != null) {
                                matrix.postConcat(matrix2);
                            }
                            matrix.postConcat(matrixOooO0O1);
                            path10.transform(matrix);
                            oooO00o2 = shape.f20809OooO0OO;
                            Path path12 = oooO0O0.f43537OooO0OO;
                            if (oooO00o2 != null) {
                                oooO0O1 = oooO0O0;
                            } else {
                                oooO0O1 = oooO0O0;
                            }
                            oooO00o3 = shape.f20809OooO0OO;
                            if (oooO00o3 != null) {
                            }
                            oooO00o = oooO00o;
                        } else {
                            oooO0O1 = oooO0O0;
                            oooO00o = oooO00o9;
                        }
                        o00ooo2 = o00ooo2;
                        oooO00o9 = oooO00o;
                        canvas2 = canvas;
                        oooO0O0 = oooO0O1;
                        it2 = it;
                        canvas8 = canvas4;
                        oooOO2 = oooOO1;
                        o00ooo2 = o00ooo2;
                    } else {
                        canvas4 = canvas8;
                        oooOO1 = oooOO2;
                        if (type == SVGAVideoShapeEntity.Type.rect) {
                            HashMap map8 = shape.f20808OooO0O0;
                            Object obj6 = map8 != null ? map8.get("x") : null;
                            Number number5 = obj6 instanceof Number ? (Number) obj6 : null;
                            if (number5 != null) {
                                HashMap map9 = shape.f20808OooO0O0;
                                Object obj7 = map9 != null ? map9.get("y") : null;
                                Number number6 = obj7 instanceof Number ? (Number) obj7 : null;
                                if (number6 != null) {
                                    HashMap map10 = shape.f20808OooO0O0;
                                    Object obj8 = map10 != null ? map10.get(ViewHierarchyConstants.DIMENSION_WIDTH_KEY) : null;
                                    Number number7 = obj8 instanceof Number ? (Number) obj8 : null;
                                    if (number7 != null) {
                                        HashMap map11 = shape.f20808OooO0O0;
                                        Object obj9 = map11 != null ? map11.get(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY) : null;
                                        Number number8 = obj9 instanceof Number ? (Number) obj9 : null;
                                        if (number8 != null) {
                                            HashMap map12 = shape.f20808OooO0O0;
                                            Object obj10 = map12 != null ? map12.get("cornerRadius") : null;
                                            Number number9 = obj10 instanceof Number ? (Number) obj10 : null;
                                            if (number9 != null) {
                                                float fFloatValue5 = number5.floatValue();
                                                float fFloatValue6 = number6.floatValue();
                                                float fFloatValue7 = number7.floatValue();
                                                float fFloatValue8 = number8.floatValue();
                                                float fFloatValue9 = number9.floatValue();
                                                path6.addRoundRect(new RectF(fFloatValue5, fFloatValue6, fFloatValue7 + fFloatValue5, fFloatValue8 + fFloatValue6), fFloatValue9, fFloatValue9, Path.Direction.CW);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (shape.f20811OooO0o0 != null) {
                            Paint paint5 = oooO0O0.f43535OooO00o;
                            paint5.reset();
                            paint5.reset();
                            paint5.setAntiAlias(o00ooo2.f42401OooO0O0);
                            OooOOO oooOOO111 = oooO00o11.f43524OooO0OO;
                            Intrinsics.checkNotNull(oooOOO111);
                            double d14 = 255;
                            paint5.setAlpha((int) (oooOOO111.f42424OooO00o * d14));
                            Path path13 = oooO0O0.f43536OooO0O0;
                            path13.reset();
                            path13.reset();
                            OooO00o oooO00o15 = this.f43529OooO0oO;
                            oooO00o15.getClass();
                            Intrinsics.checkNotNullParameter(shape, "shape");
                            map = oooO00o15.f43534OooO0OO;
                            if (!map.containsKey(shape)) {
                                path = new Path();
                                path2 = shape.f20811OooO0o0;
                                if (path2 != null) {
                                    path.set(path2);
                                }
                                map.put(shape, path);
                            }
                            Path path14 = map.get(shape);
                            Intrinsics.checkNotNull(path14);
                            path13.addPath(path14);
                            matrix = oooO0O0.f43540OooO0o0;
                            matrix.reset();
                            matrix.reset();
                            matrix2 = shape.f20810OooO0Oo;
                            if (matrix2 != null) {
                                matrix.postConcat(matrix2);
                            }
                            matrix.postConcat(matrixOooO0O1);
                            path13.transform(matrix);
                            oooO00o2 = shape.f20809OooO0OO;
                            Path path15 = oooO0O0.f43537OooO0OO;
                            if (oooO00o2 != null) {
                                oooO0O1 = oooO0O0;
                            } else {
                                oooO0O1 = oooO0O0;
                            }
                            oooO00o3 = shape.f20809OooO0OO;
                            if (oooO00o3 != null) {
                            }
                            oooO00o = oooO00o;
                        } else {
                            oooO0O1 = oooO0O0;
                            oooO00o = oooO00o9;
                        }
                        o00ooo2 = o00ooo2;
                        oooO00o9 = oooO00o;
                        canvas2 = canvas;
                        oooO0O0 = oooO0O1;
                        it2 = it;
                        canvas8 = canvas4;
                        oooOO2 = oooOO1;
                        o00ooo2 = o00ooo2;
                    }
                }
                Path path16 = new Path();
                shape.f20811OooO0o0 = path16;
                path16.set(path6);
                if (shape.f20811OooO0o0 != null) {
                    Paint paint6 = oooO0O0.f43535OooO00o;
                    paint6.reset();
                    paint6.reset();
                    paint6.setAntiAlias(o00ooo2.f42401OooO0O0);
                    OooOOO oooOOO112 = oooO00o11.f43524OooO0OO;
                    Intrinsics.checkNotNull(oooOOO112);
                    double d15 = 255;
                    paint6.setAlpha((int) (oooOOO112.f42424OooO00o * d15));
                    Path path17 = oooO0O0.f43536OooO0O0;
                    path17.reset();
                    path17.reset();
                    OooO00o oooO00o16 = this.f43529OooO0oO;
                    oooO00o16.getClass();
                    Intrinsics.checkNotNullParameter(shape, "shape");
                    map = oooO00o16.f43534OooO0OO;
                    if (!map.containsKey(shape)) {
                        path = new Path();
                        path2 = shape.f20811OooO0o0;
                        if (path2 != null) {
                            path.set(path2);
                        }
                        map.put(shape, path);
                    }
                    Path path18 = map.get(shape);
                    Intrinsics.checkNotNull(path18);
                    path17.addPath(path18);
                    matrix = oooO0O0.f43540OooO0o0;
                    matrix.reset();
                    matrix.reset();
                    matrix2 = shape.f20810OooO0Oo;
                    if (matrix2 != null) {
                        matrix.postConcat(matrix2);
                    }
                    matrix.postConcat(matrixOooO0O1);
                    path17.transform(matrix);
                    oooO00o2 = shape.f20809OooO0OO;
                    Path path19 = oooO0O0.f43537OooO0OO;
                    if (oooO00o2 != null) {
                        oooO0O1 = oooO0O0;
                    } else {
                        oooO0O1 = oooO0O0;
                    }
                    oooO00o3 = shape.f20809OooO0OO;
                    if (oooO00o3 != null) {
                    }
                    oooO00o = oooO00o;
                } else {
                    oooO0O1 = oooO0O0;
                    oooO00o = oooO00o9;
                }
                o00ooo2 = o00ooo2;
                oooO00o9 = oooO00o;
                canvas2 = canvas;
                oooO0O0 = oooO0O1;
                it2 = it;
                canvas8 = canvas4;
                oooOO2 = oooOO1;
                o00ooo2 = o00ooo2;
            }
            canvas4 = canvas8;
            oooOO1 = oooOO2;
            if (shape.f20811OooO0o0 != null) {
                Paint paint7 = oooO0O0.f43535OooO00o;
                paint7.reset();
                paint7.reset();
                paint7.setAntiAlias(o00ooo2.f42401OooO0O0);
                OooOOO oooOOO113 = oooO00o11.f43524OooO0OO;
                Intrinsics.checkNotNull(oooOOO113);
                double d16 = 255;
                paint7.setAlpha((int) (oooOOO113.f42424OooO00o * d16));
                Path path110 = oooO0O0.f43536OooO0O0;
                path110.reset();
                path110.reset();
                OooO00o oooO00o17 = this.f43529OooO0oO;
                oooO00o17.getClass();
                Intrinsics.checkNotNullParameter(shape, "shape");
                map = oooO00o17.f43534OooO0OO;
                if (!map.containsKey(shape)) {
                    path = new Path();
                    path2 = shape.f20811OooO0o0;
                    if (path2 != null) {
                        path.set(path2);
                    }
                    map.put(shape, path);
                }
                Path path111 = map.get(shape);
                Intrinsics.checkNotNull(path111);
                path110.addPath(path111);
                matrix = oooO0O0.f43540OooO0o0;
                matrix.reset();
                matrix.reset();
                matrix2 = shape.f20810OooO0Oo;
                if (matrix2 != null) {
                    matrix.postConcat(matrix2);
                }
                matrix.postConcat(matrixOooO0O1);
                path110.transform(matrix);
                oooO00o2 = shape.f20809OooO0OO;
                Path path112 = oooO0O0.f43537OooO0OO;
                if (oooO00o2 != null) {
                    oooO0O1 = oooO0O0;
                } else {
                    oooO0O1 = oooO0O0;
                }
                oooO00o3 = shape.f20809OooO0OO;
                if (oooO00o3 != null) {
                }
                oooO00o = oooO00o;
            } else {
                oooO0O1 = oooO0O0;
                oooO00o = oooO00o9;
            }
            o00ooo2 = o00ooo2;
            oooO00o9 = oooO00o;
            canvas2 = canvas;
            oooO0O0 = oooO0O1;
            it2 = it;
            canvas8 = canvas4;
            oooOO2 = oooOO1;
            o00ooo2 = o00ooo2;
        }
        Canvas canvas10 = canvas8;
        OooOO0 oooOO3 = oooOO2;
        String str7 = oooO00o11.f43523OooO0O0;
        if (str7 == null) {
            return;
        }
        Function2<Canvas, Integer, Boolean> function2 = oooOO3.f42363OooO0oO.get(str7);
        if (function2 != null) {
            OooOOO oooOOO26 = oooO00o11.f43524OooO0OO;
            Intrinsics.checkNotNull(oooOOO26);
            Matrix matrixOooO0O2 = OooO0O0(oooOOO26.f42426OooO0OO);
            canvas.save();
            canvas3 = canvas10;
            canvas3.concat(matrixOooO0O2);
            function2.invoke(canvas3, Integer.valueOf(i));
            canvas.restore();
        } else {
            canvas3 = canvas10;
        }
        Function4<Canvas, Integer, Integer, Integer, Boolean> function4 = oooOO3.f42365OooOO0.get(str7);
        if (function4 != null) {
            OooOOO oooOOO27 = oooO00o11.f43524OooO0OO;
            Intrinsics.checkNotNull(oooOOO27);
            Matrix matrixOooO0O3 = OooO0O0(oooOOO27.f42426OooO0OO);
            canvas.save();
            canvas3.concat(matrixOooO0O3);
            Integer numValueOf = Integer.valueOf(i);
            OooOOO oooOOO28 = oooO00o11.f43524OooO0OO;
            Intrinsics.checkNotNull(oooOOO28);
            Integer numValueOf2 = Integer.valueOf((int) oooOOO28.f42425OooO0O0.f42459OooO00o);
            OooOOO oooOOO29 = oooO00o11.f43524OooO0OO;
            Intrinsics.checkNotNull(oooOOO29);
            function4.invoke(canvas3, numValueOf, numValueOf2, Integer.valueOf((int) oooOOO29.f42425OooO0O0.f42460OooO0O0));
            canvas.restore();
        }
    }

    public final Matrix OooO0O0(Matrix matrix) {
        Matrix matrix2 = this.f43528OooO0o0.f43538OooO0Oo;
        matrix2.reset();
        OooO0o oooO0o = this.f43520OooO0O0;
        matrix2.postScale(oooO0o.f42463OooO0OO, oooO0o.f42464OooO0Oo);
        matrix2.postTranslate(oooO0o.f42461OooO00o, oooO0o.f42462OooO0O0);
        matrix2.preConcat(matrix);
        return matrix2;
    }
}

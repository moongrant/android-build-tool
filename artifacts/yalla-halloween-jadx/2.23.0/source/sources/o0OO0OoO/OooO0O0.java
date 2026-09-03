package o0OO0OoO;

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
import kotlin.text.StringsKt;
import o0OO0O0.OooOO0;
import o0OO0O0.oo000o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p384o0OOooO0.o00O0O;
import p384o0OOooO0.o00Ooo;
import p384o0OOooO0.o00oO0o;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nSVGACanvasDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SVGACanvasDrawer.kt\ncom/opensource/svgaplayer/drawer/SVGACanvasDrawer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,593:1\n1864#2,3:594\n1864#2,3:597\n1864#2,3:600\n1855#2,2:603\n1855#2,2:605\n*S KotlinDebug\n*F\n+ 1 SVGACanvasDrawer.kt\ncom/opensource/svgaplayer/drawer/SVGACanvasDrawer\n*L\n55#1:594,3\n105#1:597,3\n135#1:600,3\n168#1:603,2\n367#1:605,2\n*E\n"})
public final class OooO0O0 extends o0OO0OoO.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public Boolean[] f43138OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final OooOO0 f43139OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final HashMap<String, Bitmap> f43140OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final C0454OooO0O0 f43141OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final OooO00o f43142OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public Boolean[] f43143OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final float[] f43144OooOO0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f43145OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f43146OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final HashMap<SVGAVideoShapeEntity, Path> f43147OooO0OO = new HashMap<>();
    }

    /* JADX INFO: renamed from: o0OO0OoO.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static final class C0454OooO0O0 {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public Bitmap f43154OooO0oO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final Paint f43148OooO00o = new Paint();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final Path f43149OooO0O0 = new Path();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final Path f43150OooO0OO = new Path();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final Matrix f43151OooO0Oo = new Matrix();

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NotNull
        public final Matrix f43153OooO0o0 = new Matrix();

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @NotNull
        public final Paint f43152OooO0o = new Paint();
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
    public OooO0O0(@NotNull oo000o videoItem, @NotNull OooOO0 dynamicItem) {
        super(videoItem);
        Intrinsics.checkNotNullParameter(videoItem, "videoItem");
        Intrinsics.checkNotNullParameter(dynamicItem, "dynamicItem");
        this.f43139OooO0Oo = dynamicItem;
        this.f43141OooO0o0 = new C0454OooO0O0();
        this.f43140OooO0o = new HashMap<>();
        this.f43142OooO0oO = new OooO00o();
        this.f43144OooOO0 = new float[16];
    }

    /* JADX WARN: Code duplicated, block: B:204:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:206:0x0503  */
    /* JADX WARN: Code duplicated, block: B:208:0x050c  */
    /* JADX WARN: Code duplicated, block: B:212:0x052a  */
    /* JADX WARN: Code duplicated, block: B:215:0x0539  */
    /* JADX WARN: Code duplicated, block: B:21:0x008e  */
    /* JADX WARN: Code duplicated, block: B:229:0x0590  */
    /* JADX WARN: Code duplicated, block: B:232:0x0595  */
    /* JADX WARN: Code duplicated, block: B:263:0x064f  */
    /* JADX WARN: Code duplicated, block: B:270:0x0667  */
    /* JADX WARN: Code duplicated, block: B:271:0x066d  */
    /* JADX WARN: Code duplicated, block: B:273:0x0673  */
    /* JADX WARN: Code duplicated, block: B:274:0x0679  */
    /* JADX WARN: Code duplicated, block: B:276:0x0681  */
    /* JADX WARN: Code duplicated, block: B:283:0x0696  */
    /* JADX WARN: Code duplicated, block: B:284:0x069c  */
    /* JADX WARN: Code duplicated, block: B:286:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:287:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:289:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:292:0x06b9  */
    /* JADX WARN: Code duplicated, block: B:312:0x070b  */
    /* JADX WARN: Code duplicated, block: B:316:0x071a  */
    /* JADX WARN: Code duplicated, block: B:319:0x0726  */
    /* JADX WARN: Code duplicated, block: B:320:0x0738  */
    /* JADX WARN: Code duplicated, block: B:323:0x0747  */
    /* JADX WARN: Code duplicated, block: B:327:0x075a  */
    public final void OooO00o(o0OO0OoO.OooO00o.C0453OooO00o c0453OooO00o, Canvas canvas, int i) {
        Canvas canvas2;
        C0454OooO0O0 c0454OooO0O0;
        Canvas canvas3;
        Iterator it;
        Canvas canvas4;
        OooOO0 oooOO1;
        C0454OooO0O0 c0454OooO0O1;
        HashMap<SVGAVideoShapeEntity, Path> map;
        Matrix matrix;
        Matrix matrix2;
        SVGAVideoShapeEntity.OooO00o oooO00o;
        SVGAVideoShapeEntity.OooO00o oooO00o2;
        char c;
        Matrix matrix3;
        float fAbs;
        SVGAVideoShapeEntity.OooO00o oooO00o3;
        SVGAVideoShapeEntity.OooO00o oooO00o4;
        SVGAVideoShapeEntity.OooO00o oooO00o5;
        SVGAVideoShapeEntity.OooO00o oooO00o6;
        SVGAVideoShapeEntity.OooO00o oooO00o7;
        o00oO0o o00oo0o2;
        o00O0O o00o0o2;
        o00oO0o o00oo0o3;
        float[] fArr;
        String str;
        String str2;
        int i2;
        Path path;
        Path path2;
        String strSubstring;
        C0454OooO0O0 c0454OooO0O2;
        Matrix matrix4;
        Path path3;
        double d;
        Bitmap bitmapCreateBitmap;
        int i3;
        TextPaint textPaint;
        o0OO0OoO.OooO00o.C0453OooO00o c0453OooO00o2 = c0453OooO00o;
        String str3 = c0453OooO00o2.f43136OooO0O0;
        C0454OooO0O0 c0454OooO0O3 = this.f43141OooO0o0;
        oo000o oo000oVar = this.f43132OooO00o;
        OooOO0 oooOO2 = this.f43139OooO0Oo;
        if (str3 == null || Intrinsics.areEqual(oooOO2.f43071OooO00o.get(str3), Boolean.TRUE)) {
            canvas2 = canvas;
            c0454OooO0O0 = c0454OooO0O3;
        } else {
            if (StringsKt.OooOO0O(str3, ".matte")) {
                strSubstring = str3.substring(0, str3.length() - 6);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                strSubstring = str3;
            }
            Bitmap bitmap = oooOO2.f43072OooO0O0.get(strSubstring);
            if (bitmap == null && (bitmap = oo000oVar.f43125OooOO0.get(strSubstring)) == null) {
                canvas2 = canvas;
                c0454OooO0O0 = c0454OooO0O3;
            } else {
                o00oO0o o00oo0o4 = c0453OooO00o2.f43137OooO0OO;
                Intrinsics.checkNotNull(o00oo0o4);
                Matrix matrixOooO0O0 = OooO0O0(o00oo0o4.f44324OooO0OO);
                Paint paint = c0454OooO0O3.f43148OooO00o;
                paint.reset();
                paint.setAntiAlias(oo000oVar.f43118OooO0O0);
                paint.setFilterBitmap(oo000oVar.f43118OooO0O0);
                o00oO0o o00oo0o5 = c0453OooO00o2.f43137OooO0OO;
                Intrinsics.checkNotNull(o00oo0o5);
                double d2 = 255;
                paint.setAlpha((int) (o00oo0o5.f44322OooO00o * d2));
                o00oO0o o00oo0o6 = c0453OooO00o2.f43137OooO0OO;
                Intrinsics.checkNotNull(o00oo0o6);
                o00O0O o00o0o3 = o00oo0o6.f44325OooO0Oo;
                Path path4 = c0454OooO0O3.f43149OooO0O0;
                if (o00o0o3 != null) {
                    o00oO0o o00oo0o7 = c0453OooO00o2.f43137OooO0OO;
                    Intrinsics.checkNotNull(o00oo0o7);
                    o00O0O o00o0o4 = o00oo0o7.f44325OooO0Oo;
                    if (o00o0o4 == null) {
                        canvas2 = canvas;
                        c0454OooO0O0 = c0454OooO0O3;
                    } else {
                        canvas.save();
                        path4.reset();
                        o00o0o4.OooO00o(path4);
                        path4.transform(matrixOooO0O0);
                        canvas.clipPath(path4);
                        o00oO0o o00oo0o8 = c0453OooO00o2.f43137OooO0OO;
                        Intrinsics.checkNotNull(o00oo0o8);
                        c0454OooO0O2 = c0454OooO0O3;
                        float width = (float) (o00oo0o8.f44323OooO0O0.f43155OooO00o / ((double) bitmap.getWidth()));
                        o00oO0o o00oo0o9 = c0453OooO00o2.f43137OooO0OO;
                        Intrinsics.checkNotNull(o00oo0o9);
                        matrix4 = matrixOooO0O0;
                        matrix4.preScale(width, (float) (o00oo0o9.f44323OooO0O0.f43156OooO0O0 / ((double) bitmap.getHeight())));
                        if (!bitmap.isRecycled()) {
                            canvas.drawBitmap(bitmap, matrix4, paint);
                        }
                        canvas.restore();
                        path3 = path4;
                        d = d2;
                    }
                } else {
                    c0454OooO0O2 = c0454OooO0O3;
                    matrix4 = matrixOooO0O0;
                    o00oO0o o00oo0o10 = c0453OooO00o2.f43137OooO0OO;
                    Intrinsics.checkNotNull(o00oo0o10);
                    path3 = path4;
                    float width2 = (float) (o00oo0o10.f44323OooO0O0.f43155OooO00o / ((double) bitmap.getWidth()));
                    o00oO0o o00oo0o11 = c0453OooO00o2.f43137OooO0OO;
                    Intrinsics.checkNotNull(o00oo0o11);
                    d = d2;
                    matrix4.preScale(width2, (float) (o00oo0o11.f44323OooO0O0.f43156OooO0O0 / ((double) bitmap.getHeight())));
                    if (!bitmap.isRecycled()) {
                        canvas.drawBitmap(bitmap, matrix4, paint);
                    }
                }
                o0OO0O0.OooO00o oooO00o8 = oooOO2.f43070OooO.get(str3);
                if (oooO00o8 != null) {
                    matrix4.getValues(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
                    bitmap.getWidth();
                    bitmap.getHeight();
                    oooO00o8.OooO00o();
                }
                boolean z = oooOO2.f43080OooOO0O;
                HashMap<String, Bitmap> map2 = this.f43140OooO0o;
                if (z) {
                    map2.clear();
                    oooOO2.f43080OooOO0O = false;
                }
                String str4 = c0453OooO00o2.f43136OooO0O0;
                if (str4 == null) {
                    canvas2 = canvas;
                } else {
                    String str5 = oooOO2.f43073OooO0OO.get(str4);
                    if (str5 == null || (textPaint = oooOO2.f43074OooO0Oo.get(str4)) == null) {
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
                    BoringLayout boringLayout = oooOO2.f43075OooO0o.get(str4);
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
                    StaticLayout staticLayout = oooOO2.f43076OooO0o0.get(str4);
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
                        c0454OooO0O0 = c0454OooO0O2;
                        Paint paint2 = c0454OooO0O0.f43148OooO00o;
                        paint2.reset();
                        paint2.setAntiAlias(oo000oVar.f43118OooO0O0);
                        o00oO0o o00oo0o12 = c0453OooO00o2.f43137OooO0OO;
                        Intrinsics.checkNotNull(o00oo0o12);
                        paint2.setAlpha((int) (o00oo0o12.f44322OooO00o * d));
                        o00oO0o o00oo0o13 = c0453OooO00o2.f43137OooO0OO;
                        Intrinsics.checkNotNull(o00oo0o13);
                        if (o00oo0o13.f44325OooO0Oo != null) {
                            o00oO0o o00oo0o14 = c0453OooO00o2.f43137OooO0OO;
                            Intrinsics.checkNotNull(o00oo0o14);
                            o00O0O o00o0o5 = o00oo0o14.f44325OooO0Oo;
                            if (o00o0o5 == null) {
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
                                o00o0o5.OooO00o(path5);
                                canvas2.drawPath(path5, paint2);
                                canvas.restore();
                            }
                        } else {
                            canvas2 = canvas;
                            paint2.setFilterBitmap(oo000oVar.f43118OooO0O0);
                            canvas2.drawBitmap(bitmapCreateBitmap, matrix4, paint2);
                        }
                    } else {
                        canvas2 = canvas;
                    }
                }
                c0454OooO0O0 = c0454OooO0O2;
            }
        }
        o00oO0o o00oo0o15 = c0453OooO00o2.f43137OooO0OO;
        Intrinsics.checkNotNull(o00oo0o15);
        Matrix matrixOooO0O1 = OooO0O0(o00oo0o15.f44324OooO0OO);
        o00oO0o o00oo0o16 = c0453OooO00o2.f43137OooO0OO;
        Intrinsics.checkNotNull(o00oo0o16);
        Iterator it2 = o00oo0o16.f44326OooO0o0.iterator();
        o0OO0OoO.OooO00o.C0453OooO00o c0453OooO00o3 = c0453OooO00o2;
        Canvas canvas8 = canvas2;
        Canvas canvas9 = canvas8;
        while (it2.hasNext()) {
            SVGAVideoShapeEntity shape = (SVGAVideoShapeEntity) it2.next();
            if (shape.f21279OooO0o0 != null) {
                it = it2;
            } else {
                Path path6 = o00Ooo.f44321OooO00o;
                path6.reset();
                SVGAVideoShapeEntity.Type type = shape.f21275OooO00o;
                if (type == SVGAVideoShapeEntity.Type.shape) {
                    HashMap map3 = shape.f21276OooO0O0;
                    Object obj = map3 != null ? map3.get("d") : null;
                    String str6 = obj instanceof String ? (String) obj : null;
                    if (str6 != null) {
                        new o00O0O(str6).OooO00o(path6);
                    }
                    it = it2;
                    canvas4 = canvas8;
                    oooOO1 = oooOO2;
                } else {
                    it = it2;
                    if (type == SVGAVideoShapeEntity.Type.ellipse) {
                        HashMap map4 = shape.f21276OooO0O0;
                        Object obj2 = map4 != null ? map4.get("x") : null;
                        Number number = obj2 instanceof Number ? (Number) obj2 : null;
                        if (number != null) {
                            HashMap map5 = shape.f21276OooO0O0;
                            Object obj3 = map5 != null ? map5.get("y") : null;
                            Number number2 = obj3 instanceof Number ? (Number) obj3 : null;
                            if (number2 != null) {
                                HashMap map6 = shape.f21276OooO0O0;
                                Object obj4 = map6 != null ? map6.get("radiusX") : null;
                                Number number3 = obj4 instanceof Number ? (Number) obj4 : null;
                                if (number3 != null) {
                                    HashMap map7 = shape.f21276OooO0O0;
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
                                    if (shape.f21279OooO0o0 != null) {
                                        Paint paint3 = c0454OooO0O0.f43148OooO00o;
                                        paint3.reset();
                                        paint3.reset();
                                        paint3.setAntiAlias(oo000oVar.f43118OooO0O0);
                                        o00oO0o o00oo0o17 = c0453OooO00o3.f43137OooO0OO;
                                        Intrinsics.checkNotNull(o00oo0o17);
                                        double d3 = 255;
                                        paint3.setAlpha((int) (o00oo0o17.f44322OooO00o * d3));
                                        Path path7 = c0454OooO0O0.f43149OooO0O0;
                                        path7.reset();
                                        path7.reset();
                                        OooO00o oooO00o9 = this.f43142OooO0oO;
                                        oooO00o9.getClass();
                                        Intrinsics.checkNotNullParameter(shape, "shape");
                                        map = oooO00o9.f43147OooO0OO;
                                        if (!map.containsKey(shape)) {
                                            path = new Path();
                                            path2 = shape.f21279OooO0o0;
                                            if (path2 != null) {
                                                path.set(path2);
                                            }
                                            map.put(shape, path);
                                        }
                                        Path path8 = map.get(shape);
                                        Intrinsics.checkNotNull(path8);
                                        path7.addPath(path8);
                                        matrix = c0454OooO0O0.f43153OooO0o0;
                                        matrix.reset();
                                        matrix.reset();
                                        matrix2 = shape.f21278OooO0Oo;
                                        if (matrix2 != null) {
                                            matrix.postConcat(matrix2);
                                        }
                                        matrix.postConcat(matrixOooO0O1);
                                        path7.transform(matrix);
                                        oooO00o = shape.f21277OooO0OO;
                                        Path path9 = c0454OooO0O0.f43150OooO0OO;
                                        if (oooO00o != null || (i2 = oooO00o.f21280OooO00o) == 0) {
                                            c0454OooO0O1 = c0454OooO0O0;
                                        } else {
                                            paint3.setStyle(Paint.Style.FILL);
                                            paint3.setColor(i2);
                                            o00oO0o o00oo0o18 = c0453OooO00o3.f43137OooO0OO;
                                            Intrinsics.checkNotNull(o00oo0o18);
                                            c0454OooO0O1 = c0454OooO0O0;
                                            int iMin = Math.min(255, Math.max(0, (int) (o00oo0o18.f44322OooO00o * d3)));
                                            if (iMin != 255) {
                                                paint3.setAlpha(iMin);
                                            }
                                            o00oO0o o00oo0o19 = c0453OooO00o3.f43137OooO0OO;
                                            Intrinsics.checkNotNull(o00oo0o19);
                                            if (o00oo0o19.f44325OooO0Oo != null) {
                                                canvas.save();
                                            }
                                            o00oO0o o00oo0o20 = c0453OooO00o3.f43137OooO0OO;
                                            Intrinsics.checkNotNull(o00oo0o20);
                                            o00O0O o00o0o6 = o00oo0o20.f44325OooO0Oo;
                                            if (o00o0o6 != null) {
                                                path9.reset();
                                                o00o0o6.OooO00o(path9);
                                                path9.transform(matrixOooO0O1);
                                                canvas9.clipPath(path9);
                                            }
                                            canvas9.drawPath(path7, paint3);
                                            o00oO0o o00oo0o21 = c0453OooO00o3.f43137OooO0OO;
                                            Intrinsics.checkNotNull(o00oo0o21);
                                            if (o00oo0o21.f44325OooO0Oo != null) {
                                                canvas.restore();
                                            }
                                        }
                                        oooO00o2 = shape.f21277OooO0OO;
                                        if (oooO00o2 != null || oooO00o2.f21282OooO0OO <= 0.0f) {
                                            c0453OooO00o = c0453OooO00o;
                                        } else {
                                            o00oO0o o00oo0o22 = c0453OooO00o3.f43137OooO0OO;
                                            Intrinsics.checkNotNull(o00oo0o22);
                                            paint3.setAlpha((int) (o00oo0o22.f44322OooO00o * d3));
                                            paint3.setStyle(Paint.Style.STROKE);
                                            SVGAVideoShapeEntity.OooO00o oooO00o10 = shape.f21277OooO0OO;
                                            if (oooO00o10 != null) {
                                                paint3.setColor(oooO00o10.f21281OooO0O0);
                                                o00oO0o o00oo0o23 = c0453OooO00o3.f43137OooO0OO;
                                                Intrinsics.checkNotNull(o00oo0o23);
                                                c = 0;
                                                int iMin2 = Math.min(255, Math.max(0, (int) (o00oo0o23.f44322OooO00o * d3)));
                                                if (iMin2 != 255) {
                                                    paint3.setAlpha(iMin2);
                                                }
                                            } else {
                                                c = 0;
                                            }
                                            float[] fArr2 = this.f43144OooOO0;
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
                                                    fAbs = Math.abs(this.f43133OooO0O0.f43165OooO0o0 ? (float) dSqrt : (float) dSqrt2);
                                                }
                                                oooO00o3 = shape.f21277OooO0OO;
                                                if (oooO00o3 != null) {
                                                    paint3.setStrokeWidth(oooO00o3.f21282OooO0OO * fAbs);
                                                }
                                                oooO00o4 = shape.f21277OooO0OO;
                                                if (oooO00o4 != null && (str2 = oooO00o4.f21283OooO0Oo) != null) {
                                                    if (StringsKt.OooOO0o(str2, "butt")) {
                                                        paint3.setStrokeCap(Paint.Cap.BUTT);
                                                    } else if (StringsKt.OooOO0o(str2, "round")) {
                                                        paint3.setStrokeCap(Paint.Cap.ROUND);
                                                    } else if (StringsKt.OooOO0o(str2, "square")) {
                                                        paint3.setStrokeCap(Paint.Cap.SQUARE);
                                                    }
                                                }
                                                oooO00o5 = shape.f21277OooO0OO;
                                                if (oooO00o5 != null && (str = oooO00o5.f21285OooO0o0) != null) {
                                                    if (StringsKt.OooOO0o(str, "miter")) {
                                                        paint3.setStrokeJoin(Paint.Join.MITER);
                                                    } else if (StringsKt.OooOO0o(str, "round")) {
                                                        paint3.setStrokeJoin(Paint.Join.ROUND);
                                                    } else if (StringsKt.OooOO0o(str, "bevel")) {
                                                        paint3.setStrokeJoin(Paint.Join.BEVEL);
                                                    }
                                                }
                                                oooO00o6 = shape.f21277OooO0OO;
                                                if (oooO00o6 != null) {
                                                    paint3.setStrokeMiter(oooO00o6.f21284OooO0o * fAbs);
                                                }
                                                oooO00o7 = shape.f21277OooO0OO;
                                                if (oooO00o7 == null && (fArr = oooO00o7.f21286OooO0oO) != null && fArr.length == 3) {
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
                                                    o00oo0o2 = c0453OooO00o.f43137OooO0OO;
                                                    Intrinsics.checkNotNull(o00oo0o2);
                                                    if (o00oo0o2.f44325OooO0Oo != null) {
                                                        canvas.save();
                                                    }
                                                    o00oO0o o00oo0o24 = c0453OooO00o.f43137OooO0OO;
                                                    Intrinsics.checkNotNull(o00oo0o24);
                                                    o00o0o2 = o00oo0o24.f44325OooO0Oo;
                                                    if (o00o0o2 != null) {
                                                        path9.reset();
                                                        o00o0o2.OooO00o(path9);
                                                        matrixOooO0O1 = matrix3;
                                                        path9.transform(matrixOooO0O1);
                                                        canvas = canvas;
                                                        canvas.clipPath(path9);
                                                    } else {
                                                        canvas = canvas;
                                                        matrixOooO0O1 = matrix3;
                                                    }
                                                    canvas.drawPath(path7, paint3);
                                                    o00oo0o3 = c0453OooO00o.f43137OooO0OO;
                                                    Intrinsics.checkNotNull(o00oo0o3);
                                                    if (o00oo0o3.f44325OooO0Oo != null) {
                                                        canvas.restore();
                                                    }
                                                    c0453OooO00o3 = c0453OooO00o;
                                                    canvas9 = canvas;
                                                    canvas4 = canvas9;
                                                }
                                                o00oo0o2 = c0453OooO00o.f43137OooO0OO;
                                                Intrinsics.checkNotNull(o00oo0o2);
                                                if (o00oo0o2.f44325OooO0Oo != null) {
                                                    canvas.save();
                                                }
                                                o00oO0o o00oo0o25 = c0453OooO00o.f43137OooO0OO;
                                                Intrinsics.checkNotNull(o00oo0o25);
                                                o00o0o2 = o00oo0o25.f44325OooO0Oo;
                                                if (o00o0o2 != null) {
                                                    path9.reset();
                                                    o00o0o2.OooO00o(path9);
                                                    matrixOooO0O1 = matrix3;
                                                    path9.transform(matrixOooO0O1);
                                                    canvas = canvas;
                                                    canvas.clipPath(path9);
                                                } else {
                                                    canvas = canvas;
                                                    matrixOooO0O1 = matrix3;
                                                }
                                                canvas.drawPath(path7, paint3);
                                                o00oo0o3 = c0453OooO00o.f43137OooO0OO;
                                                Intrinsics.checkNotNull(o00oo0o3);
                                                if (o00oo0o3.f44325OooO0Oo != null) {
                                                    canvas.restore();
                                                }
                                                c0453OooO00o3 = c0453OooO00o;
                                                canvas9 = canvas;
                                                canvas4 = canvas9;
                                            }
                                            fAbs = 0.0f;
                                            oooO00o3 = shape.f21277OooO0OO;
                                            if (oooO00o3 != null) {
                                                paint3.setStrokeWidth(oooO00o3.f21282OooO0OO * fAbs);
                                            }
                                            oooO00o4 = shape.f21277OooO0OO;
                                            if (oooO00o4 != null) {
                                                if (StringsKt.OooOO0o(str2, "butt")) {
                                                    paint3.setStrokeCap(Paint.Cap.BUTT);
                                                } else if (StringsKt.OooOO0o(str2, "round")) {
                                                    paint3.setStrokeCap(Paint.Cap.ROUND);
                                                } else if (StringsKt.OooOO0o(str2, "square")) {
                                                    paint3.setStrokeCap(Paint.Cap.SQUARE);
                                                }
                                            }
                                            oooO00o5 = shape.f21277OooO0OO;
                                            if (oooO00o5 != null) {
                                                if (StringsKt.OooOO0o(str, "miter")) {
                                                    paint3.setStrokeJoin(Paint.Join.MITER);
                                                } else if (StringsKt.OooOO0o(str, "round")) {
                                                    paint3.setStrokeJoin(Paint.Join.ROUND);
                                                } else if (StringsKt.OooOO0o(str, "bevel")) {
                                                    paint3.setStrokeJoin(Paint.Join.BEVEL);
                                                }
                                            }
                                            oooO00o6 = shape.f21277OooO0OO;
                                            if (oooO00o6 != null) {
                                                paint3.setStrokeMiter(oooO00o6.f21284OooO0o * fAbs);
                                            }
                                            oooO00o7 = shape.f21277OooO0OO;
                                            if (oooO00o7 == null) {
                                            }
                                            o00oo0o2 = c0453OooO00o.f43137OooO0OO;
                                            Intrinsics.checkNotNull(o00oo0o2);
                                            if (o00oo0o2.f44325OooO0Oo != null) {
                                                canvas.save();
                                            }
                                            o00oO0o o00oo0o26 = c0453OooO00o.f43137OooO0OO;
                                            Intrinsics.checkNotNull(o00oo0o26);
                                            o00o0o2 = o00oo0o26.f44325OooO0Oo;
                                            if (o00o0o2 != null) {
                                                path9.reset();
                                                o00o0o2.OooO00o(path9);
                                                matrixOooO0O1 = matrix3;
                                                path9.transform(matrixOooO0O1);
                                                canvas = canvas;
                                                canvas.clipPath(path9);
                                            } else {
                                                canvas = canvas;
                                                matrixOooO0O1 = matrix3;
                                            }
                                            canvas.drawPath(path7, paint3);
                                            o00oo0o3 = c0453OooO00o.f43137OooO0OO;
                                            Intrinsics.checkNotNull(o00oo0o3);
                                            if (o00oo0o3.f44325OooO0Oo != null) {
                                                canvas.restore();
                                            }
                                            c0453OooO00o3 = c0453OooO00o;
                                            canvas9 = canvas;
                                            canvas4 = canvas9;
                                        }
                                        c0453OooO00o2 = c0453OooO00o;
                                        canvas2 = canvas;
                                        c0454OooO0O0 = c0454OooO0O1;
                                        it2 = it;
                                        canvas8 = canvas4;
                                        oooOO2 = oooOO1;
                                        oo000oVar = oo000oVar;
                                    } else {
                                        c0454OooO0O1 = c0454OooO0O0;
                                        c0453OooO00o = c0453OooO00o2;
                                    }
                                    oo000oVar = oo000oVar;
                                    c0453OooO00o2 = c0453OooO00o;
                                    canvas2 = canvas;
                                    c0454OooO0O0 = c0454OooO0O1;
                                    it2 = it;
                                    canvas8 = canvas4;
                                    oooOO2 = oooOO1;
                                    oo000oVar = oo000oVar;
                                }
                            }
                        }
                        oooOO1 = oooOO2;
                        if (shape.f21279OooO0o0 != null) {
                            Paint paint4 = c0454OooO0O0.f43148OooO00o;
                            paint4.reset();
                            paint4.reset();
                            paint4.setAntiAlias(oo000oVar.f43118OooO0O0);
                            o00oO0o o00oo0o110 = c0453OooO00o3.f43137OooO0OO;
                            Intrinsics.checkNotNull(o00oo0o110);
                            double d13 = 255;
                            paint4.setAlpha((int) (o00oo0o110.f44322OooO00o * d13));
                            Path path10 = c0454OooO0O0.f43149OooO0O0;
                            path10.reset();
                            path10.reset();
                            OooO00o oooO00o11 = this.f43142OooO0oO;
                            oooO00o11.getClass();
                            Intrinsics.checkNotNullParameter(shape, "shape");
                            map = oooO00o11.f43147OooO0OO;
                            if (!map.containsKey(shape)) {
                                path = new Path();
                                path2 = shape.f21279OooO0o0;
                                if (path2 != null) {
                                    path.set(path2);
                                }
                                map.put(shape, path);
                            }
                            Path path11 = map.get(shape);
                            Intrinsics.checkNotNull(path11);
                            path10.addPath(path11);
                            matrix = c0454OooO0O0.f43153OooO0o0;
                            matrix.reset();
                            matrix.reset();
                            matrix2 = shape.f21278OooO0Oo;
                            if (matrix2 != null) {
                                matrix.postConcat(matrix2);
                            }
                            matrix.postConcat(matrixOooO0O1);
                            path10.transform(matrix);
                            oooO00o = shape.f21277OooO0OO;
                            Path path12 = c0454OooO0O0.f43150OooO0OO;
                            if (oooO00o != null) {
                                c0454OooO0O1 = c0454OooO0O0;
                            } else {
                                c0454OooO0O1 = c0454OooO0O0;
                            }
                            oooO00o2 = shape.f21277OooO0OO;
                            if (oooO00o2 != null) {
                            }
                            c0453OooO00o = c0453OooO00o;
                        } else {
                            c0454OooO0O1 = c0454OooO0O0;
                            c0453OooO00o = c0453OooO00o2;
                        }
                        oo000oVar = oo000oVar;
                        c0453OooO00o2 = c0453OooO00o;
                        canvas2 = canvas;
                        c0454OooO0O0 = c0454OooO0O1;
                        it2 = it;
                        canvas8 = canvas4;
                        oooOO2 = oooOO1;
                        oo000oVar = oo000oVar;
                    } else {
                        canvas4 = canvas8;
                        oooOO1 = oooOO2;
                        if (type == SVGAVideoShapeEntity.Type.rect) {
                            HashMap map8 = shape.f21276OooO0O0;
                            Object obj6 = map8 != null ? map8.get("x") : null;
                            Number number5 = obj6 instanceof Number ? (Number) obj6 : null;
                            if (number5 != null) {
                                HashMap map9 = shape.f21276OooO0O0;
                                Object obj7 = map9 != null ? map9.get("y") : null;
                                Number number6 = obj7 instanceof Number ? (Number) obj7 : null;
                                if (number6 != null) {
                                    HashMap map10 = shape.f21276OooO0O0;
                                    Object obj8 = map10 != null ? map10.get(ViewHierarchyConstants.DIMENSION_WIDTH_KEY) : null;
                                    Number number7 = obj8 instanceof Number ? (Number) obj8 : null;
                                    if (number7 != null) {
                                        HashMap map11 = shape.f21276OooO0O0;
                                        Object obj9 = map11 != null ? map11.get(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY) : null;
                                        Number number8 = obj9 instanceof Number ? (Number) obj9 : null;
                                        if (number8 != null) {
                                            HashMap map12 = shape.f21276OooO0O0;
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
                        if (shape.f21279OooO0o0 != null) {
                            Paint paint5 = c0454OooO0O0.f43148OooO00o;
                            paint5.reset();
                            paint5.reset();
                            paint5.setAntiAlias(oo000oVar.f43118OooO0O0);
                            o00oO0o o00oo0o111 = c0453OooO00o3.f43137OooO0OO;
                            Intrinsics.checkNotNull(o00oo0o111);
                            double d14 = 255;
                            paint5.setAlpha((int) (o00oo0o111.f44322OooO00o * d14));
                            Path path13 = c0454OooO0O0.f43149OooO0O0;
                            path13.reset();
                            path13.reset();
                            OooO00o oooO00o12 = this.f43142OooO0oO;
                            oooO00o12.getClass();
                            Intrinsics.checkNotNullParameter(shape, "shape");
                            map = oooO00o12.f43147OooO0OO;
                            if (!map.containsKey(shape)) {
                                path = new Path();
                                path2 = shape.f21279OooO0o0;
                                if (path2 != null) {
                                    path.set(path2);
                                }
                                map.put(shape, path);
                            }
                            Path path14 = map.get(shape);
                            Intrinsics.checkNotNull(path14);
                            path13.addPath(path14);
                            matrix = c0454OooO0O0.f43153OooO0o0;
                            matrix.reset();
                            matrix.reset();
                            matrix2 = shape.f21278OooO0Oo;
                            if (matrix2 != null) {
                                matrix.postConcat(matrix2);
                            }
                            matrix.postConcat(matrixOooO0O1);
                            path13.transform(matrix);
                            oooO00o = shape.f21277OooO0OO;
                            Path path15 = c0454OooO0O0.f43150OooO0OO;
                            if (oooO00o != null) {
                                c0454OooO0O1 = c0454OooO0O0;
                            } else {
                                c0454OooO0O1 = c0454OooO0O0;
                            }
                            oooO00o2 = shape.f21277OooO0OO;
                            if (oooO00o2 != null) {
                            }
                            c0453OooO00o = c0453OooO00o;
                        } else {
                            c0454OooO0O1 = c0454OooO0O0;
                            c0453OooO00o = c0453OooO00o2;
                        }
                        oo000oVar = oo000oVar;
                        c0453OooO00o2 = c0453OooO00o;
                        canvas2 = canvas;
                        c0454OooO0O0 = c0454OooO0O1;
                        it2 = it;
                        canvas8 = canvas4;
                        oooOO2 = oooOO1;
                        oo000oVar = oo000oVar;
                    }
                }
                Path path16 = new Path();
                shape.f21279OooO0o0 = path16;
                path16.set(path6);
                if (shape.f21279OooO0o0 != null) {
                    Paint paint6 = c0454OooO0O0.f43148OooO00o;
                    paint6.reset();
                    paint6.reset();
                    paint6.setAntiAlias(oo000oVar.f43118OooO0O0);
                    o00oO0o o00oo0o112 = c0453OooO00o3.f43137OooO0OO;
                    Intrinsics.checkNotNull(o00oo0o112);
                    double d15 = 255;
                    paint6.setAlpha((int) (o00oo0o112.f44322OooO00o * d15));
                    Path path17 = c0454OooO0O0.f43149OooO0O0;
                    path17.reset();
                    path17.reset();
                    OooO00o oooO00o13 = this.f43142OooO0oO;
                    oooO00o13.getClass();
                    Intrinsics.checkNotNullParameter(shape, "shape");
                    map = oooO00o13.f43147OooO0OO;
                    if (!map.containsKey(shape)) {
                        path = new Path();
                        path2 = shape.f21279OooO0o0;
                        if (path2 != null) {
                            path.set(path2);
                        }
                        map.put(shape, path);
                    }
                    Path path18 = map.get(shape);
                    Intrinsics.checkNotNull(path18);
                    path17.addPath(path18);
                    matrix = c0454OooO0O0.f43153OooO0o0;
                    matrix.reset();
                    matrix.reset();
                    matrix2 = shape.f21278OooO0Oo;
                    if (matrix2 != null) {
                        matrix.postConcat(matrix2);
                    }
                    matrix.postConcat(matrixOooO0O1);
                    path17.transform(matrix);
                    oooO00o = shape.f21277OooO0OO;
                    Path path19 = c0454OooO0O0.f43150OooO0OO;
                    if (oooO00o != null) {
                        c0454OooO0O1 = c0454OooO0O0;
                    } else {
                        c0454OooO0O1 = c0454OooO0O0;
                    }
                    oooO00o2 = shape.f21277OooO0OO;
                    if (oooO00o2 != null) {
                    }
                    c0453OooO00o = c0453OooO00o;
                } else {
                    c0454OooO0O1 = c0454OooO0O0;
                    c0453OooO00o = c0453OooO00o2;
                }
                oo000oVar = oo000oVar;
                c0453OooO00o2 = c0453OooO00o;
                canvas2 = canvas;
                c0454OooO0O0 = c0454OooO0O1;
                it2 = it;
                canvas8 = canvas4;
                oooOO2 = oooOO1;
                oo000oVar = oo000oVar;
            }
            canvas4 = canvas8;
            oooOO1 = oooOO2;
            if (shape.f21279OooO0o0 != null) {
                Paint paint7 = c0454OooO0O0.f43148OooO00o;
                paint7.reset();
                paint7.reset();
                paint7.setAntiAlias(oo000oVar.f43118OooO0O0);
                o00oO0o o00oo0o113 = c0453OooO00o3.f43137OooO0OO;
                Intrinsics.checkNotNull(o00oo0o113);
                double d16 = 255;
                paint7.setAlpha((int) (o00oo0o113.f44322OooO00o * d16));
                Path path110 = c0454OooO0O0.f43149OooO0O0;
                path110.reset();
                path110.reset();
                OooO00o oooO00o14 = this.f43142OooO0oO;
                oooO00o14.getClass();
                Intrinsics.checkNotNullParameter(shape, "shape");
                map = oooO00o14.f43147OooO0OO;
                if (!map.containsKey(shape)) {
                    path = new Path();
                    path2 = shape.f21279OooO0o0;
                    if (path2 != null) {
                        path.set(path2);
                    }
                    map.put(shape, path);
                }
                Path path111 = map.get(shape);
                Intrinsics.checkNotNull(path111);
                path110.addPath(path111);
                matrix = c0454OooO0O0.f43153OooO0o0;
                matrix.reset();
                matrix.reset();
                matrix2 = shape.f21278OooO0Oo;
                if (matrix2 != null) {
                    matrix.postConcat(matrix2);
                }
                matrix.postConcat(matrixOooO0O1);
                path110.transform(matrix);
                oooO00o = shape.f21277OooO0OO;
                Path path112 = c0454OooO0O0.f43150OooO0OO;
                if (oooO00o != null) {
                    c0454OooO0O1 = c0454OooO0O0;
                } else {
                    c0454OooO0O1 = c0454OooO0O0;
                }
                oooO00o2 = shape.f21277OooO0OO;
                if (oooO00o2 != null) {
                }
                c0453OooO00o = c0453OooO00o;
            } else {
                c0454OooO0O1 = c0454OooO0O0;
                c0453OooO00o = c0453OooO00o2;
            }
            oo000oVar = oo000oVar;
            c0453OooO00o2 = c0453OooO00o;
            canvas2 = canvas;
            c0454OooO0O0 = c0454OooO0O1;
            it2 = it;
            canvas8 = canvas4;
            oooOO2 = oooOO1;
            oo000oVar = oo000oVar;
        }
        Canvas canvas10 = canvas8;
        OooOO0 oooOO3 = oooOO2;
        String str7 = c0453OooO00o3.f43136OooO0O0;
        if (str7 == null) {
            return;
        }
        Function2<Canvas, Integer, Boolean> function2 = oooOO3.f43077OooO0oO.get(str7);
        if (function2 != null) {
            o00oO0o o00oo0o27 = c0453OooO00o3.f43137OooO0OO;
            Intrinsics.checkNotNull(o00oo0o27);
            Matrix matrixOooO0O2 = OooO0O0(o00oo0o27.f44324OooO0OO);
            canvas.save();
            canvas3 = canvas10;
            canvas3.concat(matrixOooO0O2);
            function2.invoke(canvas3, Integer.valueOf(i));
            canvas.restore();
        } else {
            canvas3 = canvas10;
        }
        Function4<Canvas, Integer, Integer, Integer, Boolean> function4 = oooOO3.f43079OooOO0.get(str7);
        if (function4 != null) {
            o00oO0o o00oo0o28 = c0453OooO00o3.f43137OooO0OO;
            Intrinsics.checkNotNull(o00oo0o28);
            Matrix matrixOooO0O3 = OooO0O0(o00oo0o28.f44324OooO0OO);
            canvas.save();
            canvas3.concat(matrixOooO0O3);
            Integer numValueOf = Integer.valueOf(i);
            o00oO0o o00oo0o29 = c0453OooO00o3.f43137OooO0OO;
            Intrinsics.checkNotNull(o00oo0o29);
            Integer numValueOf2 = Integer.valueOf((int) o00oo0o29.f44323OooO0O0.f43155OooO00o);
            o00oO0o o00oo0o30 = c0453OooO00o3.f43137OooO0OO;
            Intrinsics.checkNotNull(o00oo0o30);
            function4.invoke(canvas3, numValueOf, numValueOf2, Integer.valueOf((int) o00oo0o30.f44323OooO0O0.f43156OooO0O0));
            canvas.restore();
        }
    }

    public final Matrix OooO0O0(Matrix matrix) {
        Matrix matrix2 = this.f43141OooO0o0.f43151OooO0Oo;
        matrix2.reset();
        p330o0OO0Ooo.OooOO0 oooOO1 = this.f43133OooO0O0;
        matrix2.postScale(oooOO1.f43163OooO0OO, oooOO1.f43164OooO0Oo);
        matrix2.postTranslate(oooOO1.f43161OooO00o, oooOO1.f43162OooO0O0);
        matrix2.preConcat(matrix);
        return matrix2;
    }
}

package p408o0Oo0OO0;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.media.SoundPool;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.ImageView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.opensource.svgaplayer.entities.SVGAVideoShapeEntity;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.KotlinVersion;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016OooOoO0.OooOo00;
import p168o00Ooo.OooOO0;
import p407o0Oo0OO.OooO0O0;
import p407o0Oo0OO.OooO0OO;
import p591o0oOooO0.o0;
import p591o0oOooO0.o0O00000;
import p591o0oOooO0.o0O0000O;
import p591o0oOooO0.o0O00o0;
import p591o0oOooO0.oo00oO;
import p649o0ooOOOO.b6;
import p649o0ooOOOO.c6;
import p649o0ooOOOO.d6;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO extends Drawable {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f39059OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f39060OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public ImageView.ScaleType f39061OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0OO f39062OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final OooOo f39063OooO0o0;

    public OooO(@NotNull OooOo oooOo, @NotNull OooOO0 oooOO1) {
        this.f39063OooO0o0 = oooOo;
        this.f39059OooO00o = true;
        this.f39061OooO0OO = ImageView.ScaleType.MATRIX;
        this.f39062OooO0Oo = new OooO0OO(oooOo, oooOO1);
    }

    public final void OooO00o(boolean z) {
        if (this.f39059OooO00o == z) {
            return;
        }
        this.f39059OooO00o = z;
        invalidateSelf();
    }

    public final void OooO0O0(int i) {
        if (this.f39060OooO0O0 == i) {
            return;
        }
        this.f39060OooO0O0 = i;
        invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0355  */
    /* JADX WARN: Code duplicated, block: B:132:0x043e  */
    /* JADX WARN: Code duplicated, block: B:288:0x070f  */
    /* JADX WARN: Code duplicated, block: B:295:0x0728  */
    /* JADX WARN: Code duplicated, block: B:296:0x072e  */
    /* JADX WARN: Code duplicated, block: B:298:0x0734  */
    /* JADX WARN: Code duplicated, block: B:299:0x073a  */
    /* JADX WARN: Code duplicated, block: B:301:0x0742  */
    /* JADX WARN: Code duplicated, block: B:308:0x0757  */
    /* JADX WARN: Code duplicated, block: B:309:0x075d  */
    /* JADX WARN: Code duplicated, block: B:311:0x0763  */
    /* JADX WARN: Code duplicated, block: B:312:0x0769  */
    /* JADX WARN: Code duplicated, block: B:314:0x0771  */
    /* JADX WARN: Code duplicated, block: B:317:0x077a  */
    /* JADX WARN: Code duplicated, block: B:330:0x07a9  */
    /* JADX WARN: Code duplicated, block: B:331:0x07ac  */
    /* JADX WARN: Code duplicated, block: B:335:0x07bd  */
    /* JADX WARN: Code duplicated, block: B:339:0x07d6  */
    /* JADX WARN: Code duplicated, block: B:342:0x07df  */
    /* JADX WARN: Code duplicated, block: B:343:0x07f6  */
    /* JADX WARN: Code duplicated, block: B:346:0x0803  */
    /* JADX WARN: Code duplicated, block: B:348:0x0809  */
    /* JADX WARN: Code duplicated, block: B:384:0x035c A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.util.HashMap, java.util.Map<java.lang.String, ? extends java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.util.HashMap, java.util.Map<java.lang.String, ? extends java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.util.HashMap, java.util.Map<java.lang.String, ? extends java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.util.HashMap, java.util.Map<java.lang.String, ? extends java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.util.HashMap, java.util.Map<java.lang.String, ? extends java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.HashMap, java.util.Map<java.lang.String, ? extends java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r3v26, types: [java.util.HashMap, java.util.Map<java.lang.String, ? extends java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.util.HashMap, java.util.Map<java.lang.String, ? extends java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r9v22, types: [java.util.HashMap, java.util.Map<java.lang.String, ? extends java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.HashMap, java.util.Map<java.lang.String, ? extends java.lang.Object>] */
    @Override // android.graphics.drawable.Drawable
    public final void draw(@Nullable Canvas canvas) {
        SoundPool soundPool;
        Integer num;
        Iterator it;
        Canvas canvas2;
        char c;
        Matrix matrix;
        Matrix matrix2;
        float fAbs;
        SVGAVideoShapeEntity.OooO00o oooO00o;
        SVGAVideoShapeEntity.OooO00o oooO00o2;
        SVGAVideoShapeEntity.OooO00o oooO00o3;
        SVGAVideoShapeEntity.OooO00o oooO00o4;
        SVGAVideoShapeEntity.OooO00o oooO00o5;
        oo00oO oo00oo;
        float[] fArr;
        float f;
        String str;
        String str2;
        int i;
        Bitmap bitmapCreateBitmap;
        TextPaint drawingTextPaint;
        float width;
        int width2;
        HashMap<String, Bitmap> map;
        Canvas canvas3 = canvas;
        if (this.f39059OooO00o || canvas3 == null) {
            return;
        }
        OooO0OO oooO0OO = this.f39062OooO0Oo;
        int i2 = this.f39060OooO0O0;
        ImageView.ScaleType scaleType = this.f39061OooO0OO;
        d6 d6Var = oooO0OO.f39042OooO00o;
        float width3 = canvas.getWidth();
        float height = canvas.getHeight();
        b6 b6Var = oooO0OO.f39043OooO0O0.f39087OooO0O0;
        float f2 = (float) b6Var.f48909OooO00o;
        float f3 = (float) b6Var.f48910OooO0O0;
        Objects.requireNonNull(d6Var);
        if (width3 != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && height != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && f2 != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && f3 != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            d6Var.f48911OooO00o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            d6Var.f48912OooO0O0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            d6Var.f48913OooO0OO = 1.0f;
            d6Var.f48914OooO0Oo = 1.0f;
            d6Var.f48915OooO0o0 = false;
            float f4 = (width3 - f2) / 2.0f;
            float f5 = (height - f3) / 2.0f;
            float f6 = f2 / f3;
            float f7 = width3 / height;
            float f8 = height / f3;
            float f9 = width3 / f2;
            switch (c6.$EnumSwitchMapping$0[scaleType.ordinal()]) {
                case 1:
                    d6Var.f48911OooO00o = f4;
                    d6Var.f48912OooO0O0 = f5;
                    break;
                case 2:
                    if (f6 > f7) {
                        d6Var.f48915OooO0o0 = false;
                        d6Var.f48913OooO0OO = f8;
                        d6Var.f48914OooO0Oo = f8;
                        d6Var.f48911OooO00o = OooOO0.OooO00o(f2, f8, width3, 2.0f);
                    } else {
                        d6Var.f48915OooO0o0 = true;
                        d6Var.f48913OooO0OO = f9;
                        d6Var.f48914OooO0Oo = f9;
                        d6Var.f48912OooO0O0 = OooOO0.OooO00o(f3, f9, height, 2.0f);
                    }
                    break;
                case 3:
                    if (f2 < width3 && f3 < height) {
                        d6Var.f48911OooO00o = f4;
                        d6Var.f48912OooO0O0 = f5;
                    } else if (f6 > f7) {
                        d6Var.f48915OooO0o0 = true;
                        d6Var.f48913OooO0OO = f9;
                        d6Var.f48914OooO0Oo = f9;
                        d6Var.f48912OooO0O0 = OooOO0.OooO00o(f3, f9, height, 2.0f);
                    } else {
                        d6Var.f48915OooO0o0 = false;
                        d6Var.f48913OooO0OO = f8;
                        d6Var.f48914OooO0Oo = f8;
                        d6Var.f48911OooO00o = OooOO0.OooO00o(f2, f8, width3, 2.0f);
                    }
                    break;
                case 4:
                    if (f6 > f7) {
                        d6Var.f48915OooO0o0 = true;
                        d6Var.f48913OooO0OO = f9;
                        d6Var.f48914OooO0Oo = f9;
                        d6Var.f48912OooO0O0 = OooOO0.OooO00o(f3, f9, height, 2.0f);
                    } else {
                        d6Var.f48915OooO0o0 = false;
                        d6Var.f48913OooO0OO = f8;
                        d6Var.f48914OooO0Oo = f8;
                        d6Var.f48911OooO00o = OooOO0.OooO00o(f2, f8, width3, 2.0f);
                    }
                    break;
                case 5:
                    if (f6 > f7) {
                        d6Var.f48915OooO0o0 = true;
                        d6Var.f48913OooO0OO = f9;
                        d6Var.f48914OooO0Oo = f9;
                    } else {
                        d6Var.f48915OooO0o0 = false;
                        d6Var.f48913OooO0OO = f8;
                        d6Var.f48914OooO0Oo = f8;
                    }
                    break;
                case 6:
                    if (f6 > f7) {
                        d6Var.f48915OooO0o0 = true;
                        d6Var.f48913OooO0OO = f9;
                        d6Var.f48914OooO0Oo = f9;
                        d6Var.f48912OooO0O0 = height - (f3 * f9);
                    } else {
                        d6Var.f48915OooO0o0 = false;
                        d6Var.f48913OooO0OO = f8;
                        d6Var.f48914OooO0Oo = f8;
                        d6Var.f48911OooO00o = width3 - (f2 * f8);
                    }
                    break;
                case 7:
                    Math.max(f9, f8);
                    d6Var.f48915OooO0o0 = f9 > f8;
                    d6Var.f48913OooO0OO = f9;
                    d6Var.f48914OooO0Oo = f8;
                    break;
                default:
                    d6Var.f48915OooO0o0 = true;
                    d6Var.f48913OooO0OO = f9;
                    d6Var.f48914OooO0Oo = f9;
                    break;
            }
        }
        OooO0OO.OooO00o oooO00o6 = oooO0OO.f39049OooO0o0;
        if (oooO00o6.f39051OooO00o != canvas.getWidth() || oooO00o6.f39052OooO0O0 != canvas.getHeight()) {
            oooO00o6.f39053OooO0OO.clear();
        }
        oooO00o6.f39051OooO00o = canvas.getWidth();
        oooO00o6.f39052OooO0O0 = canvas.getHeight();
        List<o0O00000> list = oooO0OO.f39043OooO0O0.f39091OooO0o0;
        ArrayList arrayList = new ArrayList();
        for (o0O00000 o0o00000 : list) {
            OooO0O0.OooO00o oooO00o7 = (i2 < 0 || i2 >= o0o00000.f47184OooO0O0.size() || o0o00000.f47184OooO0O0.get(i2).f47185OooO00o <= 0.0d) ? null : new OooO0O0.OooO00o(o0o00000.f47183OooO00o, o0o00000.f47184OooO0O0.get(i2));
            if (oooO00o7 != null) {
                arrayList.add(oooO00o7);
            }
        }
        Iterator it2 = arrayList.iterator();
        Canvas canvas4 = canvas3;
        while (it2.hasNext()) {
            OooO0O0.OooO00o oooO00o8 = (OooO0O0.OooO00o) it2.next();
            String str3 = oooO00o8.f39044OooO00o;
            if (str3 == null || Intrinsics.areEqual(oooO0OO.f39050OooO0oO.f39064OooO00o.get(str3), Boolean.TRUE)) {
                i2 = i2;
                it2 = it2;
            } else {
                Bitmap bitmap = oooO0OO.f39050OooO0oO.f39065OooO0O0.get(str3);
                if (bitmap == null) {
                    bitmap = oooO0OO.f39043OooO0O0.f39093OooO0oo.get(str3);
                }
                if (bitmap != null) {
                    Matrix matrixOooO00o = oooO0OO.OooO00o(oooO00o8.f39045OooO0O0.f47187OooO0OO);
                    Paint paintOooO00o = oooO0OO.f39046OooO0OO.OooO00o();
                    paintOooO00o.setAntiAlias(oooO0OO.f39043OooO0O0.f39086OooO00o);
                    paintOooO00o.setFilterBitmap(oooO0OO.f39043OooO0O0.f39086OooO00o);
                    paintOooO00o.setAlpha((int) (oooO00o8.f39045OooO0O0.f47185OooO00o * ((double) KotlinVersion.MAX_COMPONENT_VALUE)));
                    o0O0000O o0o0000o2 = oooO00o8.f39045OooO0O0;
                    oo00oO oo00oo2 = o0o0000o2.f47188OooO0Oo;
                    if (oo00oo2 != null) {
                        canvas.save();
                        paintOooO00o.reset();
                        Path pathOooO0O0 = oooO0OO.f39046OooO0OO.OooO0O0();
                        oo00oo2.OooO00o(pathOooO0O0);
                        pathOooO0O0.transform(matrixOooO00o);
                        canvas4.clipPath(pathOooO0O0);
                        matrixOooO00o.preScale((float) (oooO00o8.f39045OooO0O0.f47186OooO0O0.f48909OooO00o / ((double) bitmap.getWidth())), (float) (oooO00o8.f39045OooO0O0.f47186OooO0O0.f48909OooO00o / ((double) bitmap.getWidth())));
                        canvas4.drawBitmap(bitmap, matrixOooO00o, paintOooO00o);
                        canvas.restore();
                    } else {
                        matrixOooO00o.preScale((float) (o0o0000o2.f47186OooO0O0.f48909OooO00o / ((double) bitmap.getWidth())), (float) (oooO00o8.f39045OooO0O0.f47186OooO0O0.f48909OooO00o / ((double) bitmap.getWidth())));
                        canvas4.drawBitmap(bitmap, matrixOooO00o, paintOooO00o);
                    }
                    if (oooO0OO.f39050OooO0oO.f39071OooO0oo) {
                        oooO0OO.f39047OooO0Oo.clear();
                        oooO0OO.f39050OooO0oO.f39071OooO0oo = false;
                    }
                    String str4 = oooO00o8.f39044OooO00o;
                    if (str4 != null) {
                        String drawingText = oooO0OO.f39050OooO0oO.f39066OooO0OO.get(str4);
                        if (drawingText == null || (drawingTextPaint = oooO0OO.f39050OooO0oO.f39067OooO0Oo.get(str4)) == null) {
                            i2 = i2;
                            bitmapCreateBitmap = null;
                        } else {
                            Bitmap bitmap2 = oooO0OO.f39047OooO0Oo.get(str4);
                            if (bitmap2 != null) {
                                bitmapCreateBitmap = bitmap2;
                                i2 = i2;
                            } else {
                                Intrinsics.checkExpressionValueIsNotNull(drawingTextPaint, "drawingTextPaint");
                                drawingTextPaint.setAntiAlias(true);
                                Rect rect = new Rect();
                                Intrinsics.checkExpressionValueIsNotNull(drawingText, "drawingText");
                                if (drawingTextPaint.measureText(drawingText) > bitmap.getWidth()) {
                                    while (drawingTextPaint.measureText(drawingText) >= bitmap.getWidth() - drawingTextPaint.measureText("...")) {
                                        drawingText = drawingText.substring(0, drawingText.length() - 1);
                                        Intrinsics.checkExpressionValueIsNotNull(drawingText, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                    }
                                    drawingText = OooOo00.OooO00o(drawingText, "...");
                                }
                                bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                                Canvas canvas5 = new Canvas(bitmapCreateBitmap);
                                drawingTextPaint.getTextBounds(drawingText, 0, drawingText.length(), rect);
                                if (drawingTextPaint.getTextAlign() == Paint.Align.LEFT) {
                                    width2 = rect.left;
                                } else {
                                    if (drawingTextPaint.getTextAlign() == Paint.Align.RIGHT) {
                                        width2 = bitmap.getWidth() - 1;
                                    } else {
                                        width = (float) (((double) bitmap.getWidth()) / 2.0d);
                                    }
                                    canvas5.drawText(drawingText, width, (((bitmap.getHeight() + 0) - drawingTextPaint.getFontMetrics().bottom) - drawingTextPaint.getFontMetrics().top) / 2, drawingTextPaint);
                                    map = oooO0OO.f39047OooO0Oo;
                                    if (bitmapCreateBitmap != null) {
                                        throw new TypeCastException("null cannot be cast to non-null type android.graphics.Bitmap");
                                    }
                                    map.put(str4, bitmapCreateBitmap);
                                }
                                width = width2;
                                canvas5.drawText(drawingText, width, (((bitmap.getHeight() + 0) - drawingTextPaint.getFontMetrics().bottom) - drawingTextPaint.getFontMetrics().top) / 2, drawingTextPaint);
                                map = oooO0OO.f39047OooO0Oo;
                                if (bitmapCreateBitmap != null) {
                                    throw new TypeCastException("null cannot be cast to non-null type android.graphics.Bitmap");
                                }
                                map.put(str4, bitmapCreateBitmap);
                            }
                        }
                        StaticLayout it3 = oooO0OO.f39050OooO0oO.f39069OooO0o0.get(str4);
                        if (it3 != null && (bitmapCreateBitmap = oooO0OO.f39047OooO0Oo.get(str4)) == null) {
                            Intrinsics.checkExpressionValueIsNotNull(it3, "it");
                            TextPaint paint = it3.getPaint();
                            Intrinsics.checkExpressionValueIsNotNull(paint, "it.paint");
                            paint.setAntiAlias(true);
                            StaticLayout staticLayout = new StaticLayout(it3.getText(), 0, it3.getText().length(), it3.getPaint(), bitmap.getWidth(), it3.getAlignment(), it3.getSpacingMultiplier(), it3.getSpacingAdd(), false);
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                            Canvas canvas6 = new Canvas(bitmapCreateBitmap2);
                            canvas6.translate(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, (bitmap.getHeight() - staticLayout.getHeight()) / 2);
                            staticLayout.draw(canvas6);
                            HashMap<String, Bitmap> map2 = oooO0OO.f39047OooO0Oo;
                            if (bitmapCreateBitmap2 == null) {
                                throw new TypeCastException("null cannot be cast to non-null type android.graphics.Bitmap");
                            }
                            map2.put(str4, bitmapCreateBitmap2);
                            bitmapCreateBitmap = bitmapCreateBitmap2;
                        }
                        if (bitmapCreateBitmap != null) {
                            Paint paintOooO00o2 = oooO0OO.f39046OooO0OO.OooO00o();
                            paintOooO00o2.setAntiAlias(oooO0OO.f39043OooO0O0.f39086OooO00o);
                            oo00oO oo00oo3 = oooO00o8.f39045OooO0O0.f47188OooO0Oo;
                            if (oo00oo3 != null) {
                                canvas.save();
                                canvas4.concat(matrixOooO00o);
                                canvas4.clipRect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                                paintOooO00o2.setShader(new BitmapShader(bitmapCreateBitmap, tileMode, tileMode));
                                Path pathOooO0O1 = oooO0OO.f39046OooO0OO.OooO0O0();
                                oo00oo3.OooO00o(pathOooO0O1);
                                canvas4.drawPath(pathOooO0O1, paintOooO00o2);
                                canvas.restore();
                            } else {
                                paintOooO00o2.setFilterBitmap(oooO0OO.f39043OooO0O0.f39086OooO00o);
                                canvas4.drawBitmap(bitmapCreateBitmap, matrixOooO00o, paintOooO00o2);
                            }
                        }
                    } else {
                        i2 = i2;
                        it2 = it2;
                    }
                } else {
                    i2 = i2;
                    it2 = it2;
                }
            }
            Matrix matrixOooO00o2 = oooO0OO.OooO00o(oooO00o8.f39045OooO0O0.f47187OooO0OO);
            Canvas canvas7 = canvas4;
            for (Iterator it4 = oooO00o8.f39045OooO0O0.f47189OooO0o0.iterator(); it4.hasNext(); it4 = it) {
                SVGAVideoShapeEntity sVGAVideoShapeEntity = (SVGAVideoShapeEntity) it4.next();
                if (sVGAVideoShapeEntity.f19461OooO0o0 != null) {
                    it = it4;
                } else {
                    Path path = o0.f47182OooO00o;
                    path.reset();
                    SVGAVideoShapeEntity.Type type = sVGAVideoShapeEntity.f19457OooO00o;
                    if (type == SVGAVideoShapeEntity.Type.shape) {
                        ?? r9 = sVGAVideoShapeEntity.f19458OooO0O0;
                        Object obj = r9 != 0 ? r9.get("d") : null;
                        if (!(obj instanceof String)) {
                            obj = null;
                        }
                        String str5 = (String) obj;
                        if (str5 != null) {
                            new oo00oO(str5).OooO00o(path);
                        }
                        it = it4;
                    } else if (type == SVGAVideoShapeEntity.Type.ellipse) {
                        ?? r10 = sVGAVideoShapeEntity.f19458OooO0O0;
                        Object obj2 = r10 != 0 ? r10.get("x") : null;
                        if (!(obj2 instanceof Number)) {
                            obj2 = null;
                        }
                        Number number = (Number) obj2;
                        if (number != null) {
                            ?? r11 = sVGAVideoShapeEntity.f19458OooO0O0;
                            Object obj3 = r11 != 0 ? r11.get("y") : null;
                            if (!(obj3 instanceof Number)) {
                                obj3 = null;
                            }
                            Number number2 = (Number) obj3;
                            if (number2 != null) {
                                ?? r12 = sVGAVideoShapeEntity.f19458OooO0O0;
                                Object obj4 = r12 != 0 ? r12.get("radiusX") : null;
                                if (!(obj4 instanceof Number)) {
                                    obj4 = null;
                                }
                                Number number3 = (Number) obj4;
                                if (number3 != null) {
                                    ?? r13 = sVGAVideoShapeEntity.f19458OooO0O0;
                                    Object obj5 = r13 != 0 ? r13.get("radiusY") : null;
                                    if (!(obj5 instanceof Number)) {
                                        obj5 = null;
                                    }
                                    Number number4 = (Number) obj5;
                                    if (number4 != null) {
                                        float fFloatValue = number.floatValue();
                                        float fFloatValue2 = number2.floatValue();
                                        float fFloatValue3 = number3.floatValue();
                                        float fFloatValue4 = number4.floatValue();
                                        it = it4;
                                        path.addOval(new RectF(fFloatValue - fFloatValue3, fFloatValue2 - fFloatValue4, fFloatValue + fFloatValue3, fFloatValue2 + fFloatValue4), Path.Direction.CW);
                                    }
                                }
                            }
                        }
                        it = it4;
                    } else {
                        it = it4;
                        if (type == SVGAVideoShapeEntity.Type.rect) {
                            ?? r3 = sVGAVideoShapeEntity.f19458OooO0O0;
                            Object obj6 = r3 != 0 ? r3.get("x") : null;
                            if (!(obj6 instanceof Number)) {
                                obj6 = null;
                            }
                            Number number5 = (Number) obj6;
                            if (number5 != null) {
                                ?? r14 = sVGAVideoShapeEntity.f19458OooO0O0;
                                Object obj7 = r14 != 0 ? r14.get("y") : null;
                                if (!(obj7 instanceof Number)) {
                                    obj7 = null;
                                }
                                Number number6 = (Number) obj7;
                                if (number6 != null) {
                                    ?? r15 = sVGAVideoShapeEntity.f19458OooO0O0;
                                    Object obj8 = r15 != 0 ? r15.get(ViewHierarchyConstants.DIMENSION_WIDTH_KEY) : null;
                                    if (!(obj8 instanceof Number)) {
                                        obj8 = null;
                                    }
                                    Number number7 = (Number) obj8;
                                    if (number7 != null) {
                                        ?? r16 = sVGAVideoShapeEntity.f19458OooO0O0;
                                        Object obj9 = r16 != 0 ? r16.get(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY) : null;
                                        if (!(obj9 instanceof Number)) {
                                            obj9 = null;
                                        }
                                        Number number8 = (Number) obj9;
                                        if (number8 != null) {
                                            ?? r17 = sVGAVideoShapeEntity.f19458OooO0O0;
                                            Object obj10 = r17 != 0 ? r17.get("cornerRadius") : null;
                                            if (!(obj10 instanceof Number)) {
                                                obj10 = null;
                                            }
                                            Number number9 = (Number) obj10;
                                            if (number9 != null) {
                                                float fFloatValue5 = number5.floatValue();
                                                float fFloatValue6 = number6.floatValue();
                                                float fFloatValue7 = number7.floatValue();
                                                float fFloatValue8 = number8.floatValue();
                                                float fFloatValue9 = number9.floatValue();
                                                path.addRoundRect(new RectF(fFloatValue5, fFloatValue6, fFloatValue7 + fFloatValue5, fFloatValue8 + fFloatValue6), fFloatValue9, fFloatValue9, Path.Direction.CW);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    Path path2 = new Path();
                    sVGAVideoShapeEntity.f19461OooO0o0 = path2;
                    path2.set(path);
                }
                if (sVGAVideoShapeEntity.f19461OooO0o0 != null) {
                    Paint paintOooO00o3 = oooO0OO.f39046OooO0OO.OooO00o();
                    paintOooO00o3.reset();
                    paintOooO00o3.setAntiAlias(oooO0OO.f39043OooO0O0.f39086OooO00o);
                    double d = oooO00o8.f39045OooO0O0.f47185OooO00o;
                    double d2 = KotlinVersion.MAX_COMPONENT_VALUE;
                    paintOooO00o3.setAlpha((int) (d * d2));
                    Path pathOooO0O2 = oooO0OO.f39046OooO0OO.OooO0O0();
                    pathOooO0O2.reset();
                    OooO0OO.OooO00o oooO00o9 = oooO0OO.f39049OooO0o0;
                    if (!oooO00o9.f39053OooO0OO.containsKey(sVGAVideoShapeEntity)) {
                        Path path3 = new Path();
                        path3.set(sVGAVideoShapeEntity.f19461OooO0o0);
                        oooO00o9.f39053OooO0OO.put(sVGAVideoShapeEntity, path3);
                    }
                    Path path4 = oooO00o9.f39053OooO0OO.get(sVGAVideoShapeEntity);
                    if (path4 == null) {
                        Intrinsics.throwNpe();
                    }
                    pathOooO0O2.addPath(path4);
                    OooO0OO.OooO0O0 oooO0O0 = oooO0OO.f39046OooO0OO;
                    oooO0O0.f39058OooO0o0.reset();
                    Matrix matrix3 = oooO0O0.f39058OooO0o0;
                    matrix3.reset();
                    Matrix matrix4 = sVGAVideoShapeEntity.f19460OooO0Oo;
                    if (matrix4 != null) {
                        matrix3.postConcat(matrix4);
                    }
                    matrix3.postConcat(matrixOooO00o2);
                    pathOooO0O2.transform(matrix3);
                    SVGAVideoShapeEntity.OooO00o oooO00o10 = sVGAVideoShapeEntity.f19459OooO0OO;
                    if (oooO00o10 != null && (i = oooO00o10.f19462OooO00o) != 0) {
                        paintOooO00o3.setStyle(Paint.Style.FILL);
                        paintOooO00o3.setColor(i);
                        paintOooO00o3.setAlpha(Math.min(KotlinVersion.MAX_COMPONENT_VALUE, Math.max(0, (int) (oooO00o8.f39045OooO0O0.f47185OooO00o * d2))));
                        if (oooO00o8.f39045OooO0O0.f47188OooO0Oo != null) {
                            canvas.save();
                        }
                        oo00oO oo00oo4 = oooO00o8.f39045OooO0O0.f47188OooO0Oo;
                        if (oo00oo4 != null) {
                            OooO0OO.OooO0O0 oooO0O1 = oooO0OO.f39046OooO0OO;
                            oooO0O1.f39056OooO0OO.reset();
                            Path path5 = oooO0O1.f39056OooO0OO;
                            oo00oo4.OooO00o(path5);
                            path5.transform(matrixOooO00o2);
                            canvas7.clipPath(path5);
                        }
                        canvas7.drawPath(pathOooO0O2, paintOooO00o3);
                        if (oooO00o8.f39045OooO0O0.f47188OooO0Oo != null) {
                            canvas.restore();
                        }
                    }
                    SVGAVideoShapeEntity.OooO00o oooO00o11 = sVGAVideoShapeEntity.f19459OooO0OO;
                    if (oooO00o11 != null) {
                        float f10 = 0;
                        if (oooO00o11.f19464OooO0OO > f10) {
                            paintOooO00o3.setStyle(Paint.Style.STROKE);
                            SVGAVideoShapeEntity.OooO00o oooO00o12 = sVGAVideoShapeEntity.f19459OooO0OO;
                            if (oooO00o12 != null) {
                                paintOooO00o3.setColor(oooO00o12.f19463OooO0O0);
                                c = 0;
                                paintOooO00o3.setAlpha(Math.min(KotlinVersion.MAX_COMPONENT_VALUE, Math.max(0, (int) (oooO00o8.f39045OooO0O0.f47185OooO00o * d2))));
                            } else {
                                c = 0;
                            }
                            matrixOooO00o2.getValues(oooO0OO.f39048OooO0o);
                            float[] fArr2 = oooO0OO.f39048OooO0o;
                            if (fArr2[c] == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                                matrix = matrixOooO00o2;
                            } else {
                                double d3 = fArr2[c];
                                double d4 = fArr2[3];
                                matrix = matrixOooO00o2;
                                double d5 = fArr2[1];
                                double d6 = fArr2[4];
                                if (d3 * d6 != d4 * d5) {
                                    matrix2 = matrix;
                                    double dSqrt = Math.sqrt((d4 * d4) + (d3 * d3));
                                    double d7 = d3 / dSqrt;
                                    double d8 = d4 / dSqrt;
                                    double d9 = (d8 * d6) + (d7 * d5);
                                    double d10 = d5 - (d7 * d9);
                                    double d11 = d6 - (d9 * d8);
                                    double dSqrt2 = Math.sqrt((d11 * d11) + (d10 * d10));
                                    if ((d11 / dSqrt2) * d7 < d8 * (d10 / dSqrt2)) {
                                        dSqrt = -dSqrt;
                                    }
                                    fAbs = Math.abs(oooO0OO.f39042OooO00o.f48915OooO0o0 ? (float) dSqrt : (float) dSqrt2);
                                    sVGAVideoShapeEntity = sVGAVideoShapeEntity;
                                }
                                oooO00o = sVGAVideoShapeEntity.f19459OooO0OO;
                                if (oooO00o != null) {
                                    paintOooO00o3.setStrokeWidth(oooO00o.f19464OooO0OO * fAbs);
                                }
                                oooO00o2 = sVGAVideoShapeEntity.f19459OooO0OO;
                                if (oooO00o2 != null && (str2 = oooO00o2.f19465OooO0Oo) != null) {
                                    if (StringsKt__StringsJVMKt.equals(str2, "butt", true)) {
                                        paintOooO00o3.setStrokeCap(Paint.Cap.BUTT);
                                    } else if (StringsKt__StringsJVMKt.equals(str2, "round", true)) {
                                        paintOooO00o3.setStrokeCap(Paint.Cap.ROUND);
                                    } else if (StringsKt__StringsJVMKt.equals(str2, "square", true)) {
                                        paintOooO00o3.setStrokeCap(Paint.Cap.SQUARE);
                                    }
                                }
                                oooO00o3 = sVGAVideoShapeEntity.f19459OooO0OO;
                                if (oooO00o3 != null && (str = oooO00o3.f19467OooO0o0) != null) {
                                    if (StringsKt__StringsJVMKt.equals(str, "miter", true)) {
                                        paintOooO00o3.setStrokeJoin(Paint.Join.MITER);
                                    } else if (StringsKt__StringsJVMKt.equals(str, "round", true)) {
                                        paintOooO00o3.setStrokeJoin(Paint.Join.ROUND);
                                    } else if (StringsKt__StringsJVMKt.equals(str, "bevel", true)) {
                                        paintOooO00o3.setStrokeJoin(Paint.Join.BEVEL);
                                    }
                                }
                                oooO00o4 = sVGAVideoShapeEntity.f19459OooO0OO;
                                if (oooO00o4 != null) {
                                    paintOooO00o3.setStrokeMiter(oooO00o4.f19466OooO0o * fAbs);
                                }
                                oooO00o5 = sVGAVideoShapeEntity.f19459OooO0OO;
                                if (oooO00o5 != null && (fArr = oooO00o5.f19468OooO0oO) != null && fArr.length == 3 && (fArr[0] > f10 || fArr[1] > f10)) {
                                    float[] fArr3 = new float[2];
                                    if (fArr[0] < 1.0f) {
                                        f = 1.0f;
                                    } else {
                                        f = fArr[0];
                                    }
                                    fArr3[0] = f * fAbs;
                                    fArr3[1] = (fArr[1] >= 0.1f ? fArr[1] : 0.1f) * fAbs;
                                    paintOooO00o3.setPathEffect(new DashPathEffect(fArr3, fArr[2] * fAbs));
                                }
                                oooO00o8 = oooO00o8;
                                if (oooO00o8.f39045OooO0O0.f47188OooO0Oo != null) {
                                    canvas.save();
                                }
                                oo00oo = oooO00o8.f39045OooO0O0.f47188OooO0Oo;
                                if (oo00oo != null) {
                                    OooO0OO.OooO0O0 oooO0O2 = oooO0OO.f39046OooO0OO;
                                    oooO0O2.f39056OooO0OO.reset();
                                    Path path6 = oooO0O2.f39056OooO0OO;
                                    oo00oo.OooO00o(path6);
                                    matrixOooO00o2 = matrix2;
                                    path6.transform(matrixOooO00o2);
                                    canvas2 = canvas;
                                    canvas2.clipPath(path6);
                                } else {
                                    canvas2 = canvas;
                                    matrixOooO00o2 = matrix2;
                                }
                                canvas2.drawPath(pathOooO0O2, paintOooO00o3);
                                if (oooO00o8.f39045OooO0O0.f47188OooO0Oo != null) {
                                    canvas.restore();
                                }
                                canvas7 = canvas2;
                                canvas4 = canvas7;
                            }
                            fAbs = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
                            matrix2 = matrix;
                            oooO00o = sVGAVideoShapeEntity.f19459OooO0OO;
                            if (oooO00o != null) {
                                paintOooO00o3.setStrokeWidth(oooO00o.f19464OooO0OO * fAbs);
                            }
                            oooO00o2 = sVGAVideoShapeEntity.f19459OooO0OO;
                            if (oooO00o2 != null) {
                                if (StringsKt__StringsJVMKt.equals(str2, "butt", true)) {
                                    paintOooO00o3.setStrokeCap(Paint.Cap.BUTT);
                                } else if (StringsKt__StringsJVMKt.equals(str2, "round", true)) {
                                    paintOooO00o3.setStrokeCap(Paint.Cap.ROUND);
                                } else if (StringsKt__StringsJVMKt.equals(str2, "square", true)) {
                                    paintOooO00o3.setStrokeCap(Paint.Cap.SQUARE);
                                }
                            }
                            oooO00o3 = sVGAVideoShapeEntity.f19459OooO0OO;
                            if (oooO00o3 != null) {
                                if (StringsKt__StringsJVMKt.equals(str, "miter", true)) {
                                    paintOooO00o3.setStrokeJoin(Paint.Join.MITER);
                                } else if (StringsKt__StringsJVMKt.equals(str, "round", true)) {
                                    paintOooO00o3.setStrokeJoin(Paint.Join.ROUND);
                                } else if (StringsKt__StringsJVMKt.equals(str, "bevel", true)) {
                                    paintOooO00o3.setStrokeJoin(Paint.Join.BEVEL);
                                }
                            }
                            oooO00o4 = sVGAVideoShapeEntity.f19459OooO0OO;
                            if (oooO00o4 != null) {
                                paintOooO00o3.setStrokeMiter(oooO00o4.f19466OooO0o * fAbs);
                            }
                            oooO00o5 = sVGAVideoShapeEntity.f19459OooO0OO;
                            if (oooO00o5 != null) {
                                float[] fArr4 = new float[2];
                                if (fArr[0] < 1.0f) {
                                    f = 1.0f;
                                } else {
                                    f = fArr[0];
                                }
                                fArr4[0] = f * fAbs;
                                fArr4[1] = (fArr[1] >= 0.1f ? fArr[1] : 0.1f) * fAbs;
                                paintOooO00o3.setPathEffect(new DashPathEffect(fArr4, fArr[2] * fAbs));
                            }
                            oooO00o8 = oooO00o8;
                            if (oooO00o8.f39045OooO0O0.f47188OooO0Oo != null) {
                                canvas.save();
                            }
                            oo00oo = oooO00o8.f39045OooO0O0.f47188OooO0Oo;
                            if (oo00oo != null) {
                                OooO0OO.OooO0O0 oooO0O3 = oooO0OO.f39046OooO0OO;
                                oooO0O3.f39056OooO0OO.reset();
                                Path path7 = oooO0O3.f39056OooO0OO;
                                oo00oo.OooO00o(path7);
                                matrixOooO00o2 = matrix2;
                                path7.transform(matrixOooO00o2);
                                canvas2 = canvas;
                                canvas2.clipPath(path7);
                            } else {
                                canvas2 = canvas;
                                matrixOooO00o2 = matrix2;
                            }
                            canvas2.drawPath(pathOooO0O2, paintOooO00o3);
                            if (oooO00o8.f39045OooO0O0.f47188OooO0Oo != null) {
                                canvas.restore();
                            }
                            canvas7 = canvas2;
                            canvas4 = canvas7;
                        } else {
                            canvas2 = canvas3;
                        }
                    } else {
                        canvas2 = canvas3;
                    }
                } else {
                    canvas2 = canvas3;
                }
                canvas3 = canvas2;
            }
            Canvas canvas8 = canvas3;
            String str6 = oooO00o8.f39044OooO00o;
            if (str6 != null) {
                Function2<Canvas, Integer, Boolean> function2 = oooO0OO.f39050OooO0oO.f39068OooO0o.get(str6);
                if (function2 != null) {
                    Matrix matrixOooO00o3 = oooO0OO.OooO00o(oooO00o8.f39045OooO0O0.f47187OooO0OO);
                    canvas.save();
                    canvas4.concat(matrixOooO00o3);
                    function2.invoke(canvas4, Integer.valueOf(i2));
                    canvas.restore();
                }
                Function4<Canvas, Integer, Integer, Integer, Boolean> function4 = oooO0OO.f39050OooO0oO.f39070OooO0oO.get(str6);
                if (function4 != null) {
                    Matrix matrixOooO00o4 = oooO0OO.OooO00o(oooO00o8.f39045OooO0O0.f47187OooO0OO);
                    canvas.save();
                    canvas4.concat(matrixOooO00o4);
                    function4.invoke(canvas4, Integer.valueOf(i2), Integer.valueOf((int) oooO00o8.f39045OooO0O0.f47186OooO0O0.f48909OooO00o), Integer.valueOf((int) oooO00o8.f39045OooO0O0.f47186OooO0O0.f48910OooO0O0));
                    canvas.restore();
                }
            }
            canvas3 = canvas8;
            i2 = i2;
            it2 = it2;
        }
        int i3 = i2;
        for (o0O00o0 o0o00o1 : oooO0OO.f39043OooO0O0.f39090OooO0o) {
            if (o0o00o1.f47190OooO00o == i3 && (soundPool = oooO0OO.f39043OooO0O0.f39092OooO0oO) != null && (num = o0o00o1.f47192OooO0OO) != null) {
                o0o00o1.f47193OooO0Oo = Integer.valueOf(soundPool.play(num.intValue(), 1.0f, 1.0f, 1, 0, 1.0f));
            }
            if (o0o00o1.f47191OooO0O0 <= i3) {
                Integer num2 = o0o00o1.f47193OooO0Oo;
                if (num2 != null) {
                    int iIntValue = num2.intValue();
                    SoundPool soundPool2 = oooO0OO.f39043OooO0O0.f39092OooO0oO;
                    if (soundPool2 != null) {
                        soundPool2.stop(iIntValue);
                    }
                }
                o0o00o1.f47193OooO0Oo = null;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
    }

    public OooO(@NotNull OooOo oooOo) {
        this(oooOo, new OooOO0());
    }
}

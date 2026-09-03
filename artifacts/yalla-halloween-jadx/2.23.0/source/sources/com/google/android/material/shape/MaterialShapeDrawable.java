package com.google.android.material.shape;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.BitSet;
import kotlin.ULong;
import o0O00o00.Oooo0;
import o0O00o00.Oooo000;
import p419o0OoO00O.OooOOO0;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialShapeDrawable extends Drawable implements Oooo0 {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final Paint f17580OooOoO;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Matrix f17581OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO0O0 f17582OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO0o.OooOO0[] f17583OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO0o.OooOO0[] f17584OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final BitSet f17585OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f17586OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Path f17587OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final Path f17588OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final RectF f17589OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final Region f17590OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final RectF f17591OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final Region f17592OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public com.google.android.material.shape.OooO0O0 f17593OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final Paint f17594OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final Paint f17595OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final p275o0O00Ooo.OooO0o f17596OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NonNull
    public final RectF f17597OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final Oooo000 f17598OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NonNull
    public final OooO00o f17599OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public PorterDuffColorFilter f17600OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public PorterDuffColorFilter f17601OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f17602OooOoO0;

    @Retention(RetentionPolicy.SOURCE)
    public @interface CompatibilityShadowMode {
    }

    public class OooO00o {
        public OooO00o() {
        }
    }

    static {
        Paint paint = new Paint(1);
        f17580OooOoO = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public MaterialShapeDrawable() {
        this(new com.google.android.material.shape.OooO0O0());
    }

    public final int OooO() {
        OooO0O0 oooO0O0 = this.f17582OooO0Oo;
        return (int) (Math.cos(Math.toRadians(oooO0O0.f17622OooOOoo)) * ((double) oooO0O0.f17620OooOOo));
    }

    public void OooO00o() {
        invalidateSelf();
    }

    public final void OooO0O0(@NonNull RectF rectF, @NonNull Path path) {
        Oooo000 oooo000 = this.f17598OooOo0;
        OooO0O0 oooO0O0 = this.f17582OooO0Oo;
        oooo000.OooO00o(oooO0O0.f17605OooO00o, oooO0O0.f17613OooOO0, rectF, this.f17599OooOo00, path);
        if (this.f17582OooO0Oo.f17604OooO != 1.0f) {
            Matrix matrix = this.f17581OooO;
            matrix.reset();
            float f = this.f17582OooO0Oo.f17604OooO;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f17597OooOo, true);
    }

    @NonNull
    public final PorterDuffColorFilter OooO0OO(@Nullable ColorStateList colorStateList, @Nullable PorterDuff.Mode mode, @NonNull Paint paint, boolean z) {
        int color;
        int iOooO0Oo;
        if (colorStateList == null || mode == null) {
            return (!z || (iOooO0Oo = OooO0Oo((color = paint.getColor()))) == color) ? null : new PorterDuffColorFilter(iOooO0Oo, PorterDuff.Mode.SRC_IN);
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = OooO0Oo(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    @ColorInt
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final int OooO0Oo(@ColorInt int i) {
        OooO0O0 oooO0O0 = this.f17582OooO0Oo;
        float f = oooO0O0.f17616OooOOO + oooO0O0.f17618OooOOOO + oooO0O0.f17617OooOOO0;
        OooOOO0 oooOOO0 = oooO0O0.f17606OooO0O0;
        return oooOOO0 != null ? oooOOO0.OooO00o(f, i) : i;
    }

    public final void OooO0o(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull Path path, @NonNull com.google.android.material.shape.OooO0O0 oooO0O0, @NonNull RectF rectF) {
        if (!oooO0O0.OooO0o(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fOooO00o = oooO0O0.f17632OooO0o.OooO00o(rectF) * this.f17582OooO0Oo.f17613OooOO0;
            canvas.drawRoundRect(rectF, fOooO00o, fOooO00o, paint);
        }
    }

    public final void OooO0o0(@NonNull Canvas canvas) {
        if (this.f17585OooO0oO.cardinality() > 0) {
            Log.w("MaterialShapeDrawable", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f17582OooO0Oo.f17620OooOOo;
        Path path = this.f17587OooOO0;
        p275o0O00Ooo.OooO0o oooO0o = this.f17596OooOOoo;
        if (i != 0) {
            canvas.drawPath(path, oooO0o.f41786OooO00o);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            OooO0o.OooOO0 oooOO1 = this.f17584OooO0o0[i2];
            int i3 = this.f17582OooO0Oo.f17621OooOOo0;
            Matrix matrix = OooO0o.OooOO0.f17675OooO0O0;
            oooOO1.OooO00o(matrix, oooO0o, i3, canvas);
            this.f17583OooO0o[i2].OooO00o(matrix, oooO0o, this.f17582OooO0Oo.f17621OooOOo0, canvas);
        }
        if (this.f17602OooOoO0) {
            OooO0O0 oooO0O0 = this.f17582OooO0Oo;
            int iSin = (int) (Math.sin(Math.toRadians(oooO0O0.f17622OooOOoo)) * ((double) oooO0O0.f17620OooOOo));
            int iOooO = OooO();
            canvas.translate(-iSin, -iOooO);
            canvas.drawPath(path, f17580OooOoO);
            canvas.translate(iSin, iOooO);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void OooO0oO(@NonNull Canvas canvas) {
        Paint paint = this.f17594OooOOo;
        Path path = this.f17588OooOO0O;
        com.google.android.material.shape.OooO0O0 oooO0O0 = this.f17593OooOOOo;
        RectF rectF = this.f17591OooOOO0;
        rectF.set(OooO0oo());
        Paint.Style style = this.f17582OooO0Oo.f17623OooOo0;
        float strokeWidth = (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && (paint.getStrokeWidth() > 0.0f ? 1 : (paint.getStrokeWidth() == 0.0f ? 0 : -1)) > 0 ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        OooO0o(canvas, paint, path, oooO0O0, rectF);
    }

    @NonNull
    public final RectF OooO0oo() {
        RectF rectF = this.f17589OooOO0o;
        rectF.set(getBounds());
        return rectF;
    }

    public final float OooOO0() {
        return this.f17582OooO0Oo.f17605OooO00o.f17633OooO0o0.OooO00o(OooO0oo());
    }

    public final void OooOO0O(Context context) {
        this.f17582OooO0Oo.f17606OooO0O0 = new OooOOO0(context);
        OooOo0o();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean OooOO0o() {
        return this.f17582OooO0Oo.f17605OooO00o.OooO0o(OooO0oo());
    }

    public final void OooOOO(@Nullable ColorStateList colorStateList) {
        OooO0O0 oooO0O0 = this.f17582OooO0Oo;
        if (oooO0O0.f17607OooO0OO != colorStateList) {
            oooO0O0.f17607OooO0OO = colorStateList;
            onStateChange(getState());
        }
    }

    public final void OooOOO0(float f) {
        OooO0O0 oooO0O0 = this.f17582OooO0Oo;
        if (oooO0O0.f17616OooOOO != f) {
            oooO0O0.f17616OooOOO = f;
            OooOo0o();
        }
    }

    public final void OooOOOO(float f) {
        OooO0O0 oooO0O0 = this.f17582OooO0Oo;
        if (oooO0O0.f17613OooOO0 != f) {
            oooO0O0.f17613OooOO0 = f;
            this.f17586OooO0oo = true;
            invalidateSelf();
        }
    }

    public final void OooOOOo(Paint.Style style) {
        this.f17582OooO0Oo.f17623OooOo0 = style;
        super.invalidateSelf();
    }

    public final void OooOOo(int i) {
        OooO0O0 oooO0O0 = this.f17582OooO0Oo;
        if (oooO0O0.f17619OooOOOo != i) {
            oooO0O0.f17619OooOOOo = i;
            super.invalidateSelf();
        }
    }

    public final void OooOOo0() {
        this.f17596OooOOoo.OooO00o(-12303292);
        this.f17582OooO0Oo.f17624OooOo00 = false;
        super.invalidateSelf();
    }

    public final void OooOOoo(@Nullable ColorStateList colorStateList) {
        OooO0O0 oooO0O0 = this.f17582OooO0Oo;
        if (oooO0O0.f17608OooO0Oo != colorStateList) {
            oooO0O0.f17608OooO0Oo = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean OooOo0(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f17582OooO0Oo.f17607OooO0OO == null || color2 == (colorForState2 = this.f17582OooO0Oo.f17607OooO0OO.getColorForState(iArr, (color2 = (paint2 = this.f17595OooOOo0).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.f17582OooO0Oo.f17608OooO0Oo == null || color == (colorForState = this.f17582OooO0Oo.f17608OooO0Oo.getColorForState(iArr, (color = (paint = this.f17594OooOOo).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final void OooOo00(float f) {
        this.f17582OooO0Oo.f17614OooOO0O = f;
        invalidateSelf();
    }

    public final boolean OooOo0O() {
        PorterDuffColorFilter porterDuffColorFilter = this.f17600OooOo0O;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f17601OooOo0o;
        OooO0O0 oooO0O0 = this.f17582OooO0Oo;
        this.f17600OooOo0O = OooO0OO(oooO0O0.f17609OooO0o, oooO0O0.f17611OooO0oO, this.f17595OooOOo0, true);
        OooO0O0 oooO0O1 = this.f17582OooO0Oo;
        this.f17601OooOo0o = OooO0OO(oooO0O1.f17610OooO0o0, oooO0O1.f17611OooO0oO, this.f17594OooOOo, false);
        OooO0O0 oooO0O2 = this.f17582OooO0Oo;
        if (oooO0O2.f17624OooOo00) {
            this.f17596OooOOoo.OooO00o(oooO0O2.f17609OooO0o.getColorForState(getState(), 0));
        }
        return (o000OO.OooO0OO.OooO00o(porterDuffColorFilter, this.f17600OooOo0O) && o000OO.OooO0OO.OooO00o(porterDuffColorFilter2, this.f17601OooOo0o)) ? false : true;
    }

    public final void OooOo0o() {
        OooO0O0 oooO0O0 = this.f17582OooO0Oo;
        float f = oooO0O0.f17616OooOOO + oooO0O0.f17618OooOOOO;
        oooO0O0.f17621OooOOo0 = (int) Math.ceil(0.75f * f);
        this.f17582OooO0Oo.f17620OooOOo = (int) Math.ceil(f * 0.25f);
        OooOo0O();
        super.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00e6  */
    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        boolean z;
        Paint paint = this.f17595OooOOo0;
        paint.setColorFilter(this.f17600OooOo0O);
        int alpha = paint.getAlpha();
        int i = this.f17582OooO0Oo.f17615OooOO0o;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f17594OooOOo;
        paint2.setColorFilter(this.f17601OooOo0o);
        paint2.setStrokeWidth(this.f17582OooO0Oo.f17614OooOO0O);
        int alpha2 = paint2.getAlpha();
        int i2 = this.f17582OooO0Oo.f17615OooOO0o;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z2 = this.f17586OooO0oo;
        Path path = this.f17587OooOO0;
        if (z2) {
            Paint.Style style = this.f17582OooO0Oo.f17623OooOo0;
            com.google.android.material.shape.OooO0O0 oooO0O0OooO0oo = this.f17582OooO0Oo.f17605OooO00o.OooO0oo(new com.google.android.material.shape.OooO00o(-((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && (paint2.getStrokeWidth() > 0.0f ? 1 : (paint2.getStrokeWidth() == 0.0f ? 0 : -1)) > 0 ? paint2.getStrokeWidth() / 2.0f : 0.0f)));
            this.f17593OooOOOo = oooO0O0OooO0oo;
            float f = this.f17582OooO0Oo.f17613OooOO0;
            RectF rectF = this.f17591OooOOO0;
            rectF.set(OooO0oo());
            Paint.Style style2 = this.f17582OooO0Oo.f17623OooOo0;
            float strokeWidth = (style2 == Paint.Style.FILL_AND_STROKE || style2 == Paint.Style.STROKE) && (paint2.getStrokeWidth() > 0.0f ? 1 : (paint2.getStrokeWidth() == 0.0f ? 0 : -1)) > 0 ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.f17598OooOo0.OooO00o(oooO0O0OooO0oo, f, rectF, null, this.f17588OooOO0O);
            OooO0O0(OooO0oo(), path);
            this.f17586OooO0oo = false;
        }
        OooO0O0 oooO0O0 = this.f17582OooO0Oo;
        int i3 = oooO0O0.f17619OooOOOo;
        if (i3 == 1 || oooO0O0.f17621OooOOo0 <= 0) {
            z = false;
        } else {
            if (i3 != 2) {
                if (!((OooOO0o() || path.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true)) {
                    z = false;
                }
            }
            z = true;
        }
        if (z) {
            canvas.save();
            OooO0O0 oooO0O1 = this.f17582OooO0Oo;
            canvas.translate((int) (Math.sin(Math.toRadians(oooO0O1.f17622OooOOoo)) * ((double) oooO0O1.f17620OooOOo)), OooO());
            if (this.f17602OooOoO0) {
                RectF rectF2 = this.f17597OooOo;
                int iWidth = (int) (rectF2.width() - getBounds().width());
                int iHeight = (int) (rectF2.height() - getBounds().height());
                if (iWidth < 0 || iHeight < 0) {
                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.f17582OooO0Oo.f17621OooOOo0 * 2) + ((int) rectF2.width()) + iWidth, (this.f17582OooO0Oo.f17621OooOOo0 * 2) + ((int) rectF2.height()) + iHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                float f2 = (getBounds().left - this.f17582OooO0Oo.f17621OooOOo0) - iWidth;
                float f3 = (getBounds().top - this.f17582OooO0Oo.f17621OooOOo0) - iHeight;
                canvas2.translate(-f2, -f3);
                OooO0o0(canvas2);
                canvas.drawBitmap(bitmapCreateBitmap, f2, f3, (Paint) null);
                bitmapCreateBitmap.recycle();
                canvas.restore();
            } else {
                OooO0o0(canvas);
                canvas.restore();
            }
        }
        OooO0O0 oooO0O2 = this.f17582OooO0Oo;
        Paint.Style style3 = oooO0O2.f17623OooOo0;
        if (style3 == Paint.Style.FILL_AND_STROKE || style3 == Paint.Style.FILL) {
            OooO0o(canvas, paint, path, oooO0O2.f17605OooO00o, OooO0oo());
        }
        Paint.Style style4 = this.f17582OooO0Oo.f17623OooOo0;
        if ((style4 == Paint.Style.FILL_AND_STROKE || style4 == Paint.Style.STROKE) && paint2.getStrokeWidth() > 0.0f) {
            OooO0oO(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f17582OooO0Oo.f17615OooOO0o;
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public final Drawable.ConstantState getConstantState() {
        return this.f17582OooO0Oo;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@NonNull Outline outline) {
        if (this.f17582OooO0Oo.f17619OooOOOo == 2) {
            return;
        }
        if (OooOO0o()) {
            outline.setRoundRect(getBounds(), OooOO0() * this.f17582OooO0Oo.f17613OooOO0);
            return;
        }
        RectF rectFOooO0oo = OooO0oo();
        Path path = this.f17587OooOO0;
        OooO0O0(rectFOooO0oo, path);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            outline.setPath(path);
            return;
        }
        if (i >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            outline.setConvexPath(path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(@NonNull Rect rect) {
        Rect rect2 = this.f17582OooO0Oo.f17612OooO0oo;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f17590OooOOO;
        region.set(bounds);
        RectF rectFOooO0oo = OooO0oo();
        Path path = this.f17587OooOO0;
        OooO0O0(rectFOooO0oo, path);
        Region region2 = this.f17592OooOOOO;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f17586OooO0oo = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f17582OooO0Oo.f17609OooO0o) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f17582OooO0Oo.f17610OooO0o0) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f17582OooO0Oo.f17608OooO0Oo) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f17582OooO0Oo.f17607OooO0OO) != null && colorStateList4.isStateful())));
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        this.f17582OooO0Oo = new OooO0O0(this.f17582OooO0Oo);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f17586OooO0oo = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.o00Oo0.OooO0O0
    public boolean onStateChange(int[] iArr) {
        boolean z = OooOo0(iArr) || OooOo0O();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = ULong.MIN_VALUE, to = 255) int i) {
        OooO0O0 oooO0O0 = this.f17582OooO0Oo;
        if (oooO0O0.f17615OooOO0o != i) {
            oooO0O0.f17615OooOO0o = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f17582OooO0Oo.getClass();
        super.invalidateSelf();
    }

    @Override // o0O00o00.Oooo0
    public final void setShapeAppearanceModel(@NonNull com.google.android.material.shape.OooO0O0 oooO0O0) {
        this.f17582OooO0Oo.f17605OooO00o = oooO0O0;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(@ColorInt int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(@Nullable ColorStateList colorStateList) {
        this.f17582OooO0Oo.f17609OooO0o = colorStateList;
        OooOo0O();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(@Nullable PorterDuff.Mode mode) {
        OooO0O0 oooO0O0 = this.f17582OooO0Oo;
        if (oooO0O0.f17611OooO0oO != mode) {
            oooO0O0.f17611OooO0oO = mode;
            OooOo0O();
            super.invalidateSelf();
        }
    }

    public MaterialShapeDrawable(@NonNull com.google.android.material.shape.OooO0O0 oooO0O0) {
        this(new OooO0O0(oooO0O0));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public MaterialShapeDrawable(@NonNull OooO0O0 oooO0O0) {
        Oooo000 oooo000;
        this.f17584OooO0o0 = new OooO0o.OooOO0[4];
        this.f17583OooO0o = new OooO0o.OooOO0[4];
        this.f17585OooO0oO = new BitSet(8);
        this.f17581OooO = new Matrix();
        this.f17587OooOO0 = new Path();
        this.f17588OooOO0O = new Path();
        this.f17589OooOO0o = new RectF();
        this.f17591OooOOO0 = new RectF();
        this.f17590OooOOO = new Region();
        this.f17592OooOOOO = new Region();
        Paint paint = new Paint(1);
        this.f17595OooOOo0 = paint;
        Paint paint2 = new Paint(1);
        this.f17594OooOOo = paint2;
        this.f17596OooOOoo = new p275o0O00Ooo.OooO0o();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            oooo000 = Oooo000.OooO00o.f41818OooO00o;
        } else {
            oooo000 = new Oooo000();
        }
        this.f17598OooOo0 = oooo000;
        this.f17597OooOo = new RectF();
        this.f17602OooOoO0 = true;
        this.f17582OooO0Oo = oooO0O0;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        OooOo0O();
        OooOo0(getState());
        this.f17599OooOo00 = new OooO00o();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class OooO0O0 extends Drawable.ConstantState {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final float f17604OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public com.google.android.material.shape.OooO0O0 f17605OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public OooOOO0 f17606OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public ColorStateList f17607OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public ColorStateList f17608OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Nullable
        public ColorStateList f17609OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public final ColorStateList f17610OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public PorterDuff.Mode f17611OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @Nullable
        public Rect f17612OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public float f17613OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public float f17614OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public int f17615OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public float f17616OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public float f17617OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final float f17618OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public int f17619OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public int f17620OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public int f17621OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public int f17622OooOOoo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        public Paint.Style f17623OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public boolean f17624OooOo00;

        public OooO0O0(@NonNull com.google.android.material.shape.OooO0O0 oooO0O0) {
            this.f17607OooO0OO = null;
            this.f17608OooO0Oo = null;
            this.f17610OooO0o0 = null;
            this.f17609OooO0o = null;
            this.f17611OooO0oO = PorterDuff.Mode.SRC_IN;
            this.f17612OooO0oo = null;
            this.f17604OooO = 1.0f;
            this.f17613OooOO0 = 1.0f;
            this.f17615OooOO0o = 255;
            this.f17617OooOOO0 = 0.0f;
            this.f17616OooOOO = 0.0f;
            this.f17618OooOOOO = 0.0f;
            this.f17619OooOOOo = 0;
            this.f17621OooOOo0 = 0;
            this.f17620OooOOo = 0;
            this.f17622OooOOoo = 0;
            this.f17624OooOo00 = false;
            this.f17623OooOo0 = Paint.Style.FILL_AND_STROKE;
            this.f17605OooO00o = oooO0O0;
            this.f17606OooO0O0 = null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this);
            materialShapeDrawable.f17586OooO0oo = true;
            return materialShapeDrawable;
        }

        public OooO0O0(@NonNull OooO0O0 oooO0O0) {
            this.f17607OooO0OO = null;
            this.f17608OooO0Oo = null;
            this.f17610OooO0o0 = null;
            this.f17609OooO0o = null;
            this.f17611OooO0oO = PorterDuff.Mode.SRC_IN;
            this.f17612OooO0oo = null;
            this.f17604OooO = 1.0f;
            this.f17613OooOO0 = 1.0f;
            this.f17615OooOO0o = 255;
            this.f17617OooOOO0 = 0.0f;
            this.f17616OooOOO = 0.0f;
            this.f17618OooOOOO = 0.0f;
            this.f17619OooOOOo = 0;
            this.f17621OooOOo0 = 0;
            this.f17620OooOOo = 0;
            this.f17622OooOOoo = 0;
            this.f17624OooOo00 = false;
            this.f17623OooOo0 = Paint.Style.FILL_AND_STROKE;
            this.f17605OooO00o = oooO0O0.f17605OooO00o;
            this.f17606OooO0O0 = oooO0O0.f17606OooO0O0;
            this.f17614OooOO0O = oooO0O0.f17614OooOO0O;
            this.f17607OooO0OO = oooO0O0.f17607OooO0OO;
            this.f17608OooO0Oo = oooO0O0.f17608OooO0Oo;
            this.f17611OooO0oO = oooO0O0.f17611OooO0oO;
            this.f17609OooO0o = oooO0O0.f17609OooO0o;
            this.f17615OooOO0o = oooO0O0.f17615OooOO0o;
            this.f17604OooO = oooO0O0.f17604OooO;
            this.f17620OooOOo = oooO0O0.f17620OooOOo;
            this.f17619OooOOOo = oooO0O0.f17619OooOOOo;
            this.f17624OooOo00 = oooO0O0.f17624OooOo00;
            this.f17613OooOO0 = oooO0O0.f17613OooOO0;
            this.f17617OooOOO0 = oooO0O0.f17617OooOOO0;
            this.f17616OooOOO = oooO0O0.f17616OooOOO;
            this.f17618OooOOOO = oooO0O0.f17618OooOOOO;
            this.f17621OooOOo0 = oooO0O0.f17621OooOOo0;
            this.f17622OooOOoo = oooO0O0.f17622OooOOoo;
            this.f17610OooO0o0 = oooO0O0.f17610OooO0o0;
            this.f17623OooOo0 = oooO0O0.f17623OooOo0;
            if (oooO0O0.f17612OooO0oo != null) {
                this.f17612OooO0oo = new Rect(oooO0O0.f17612OooO0oo);
            }
        }
    }

    public MaterialShapeDrawable(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        this(new com.google.android.material.shape.OooO0O0(com.google.android.material.shape.OooO0O0.OooO0OO(context, attributeSet, i, i2)));
    }
}

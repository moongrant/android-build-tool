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
import p280o0O00o0O.o000oOoO;
import p280o0O00o0O.o0OoOo0;
import p422o0OoO00O.o00O0O;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialShapeDrawable extends Drawable implements o0OoOo0 {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final Paint f17103OooOoO;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Matrix f17104OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO0O0 f17105OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO0o.OooOO0[] f17106OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO0o.OooOO0[] f17107OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final BitSet f17108OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f17109OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Path f17110OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final Path f17111OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final RectF f17112OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final Region f17113OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final RectF f17114OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final Region f17115OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public com.google.android.material.shape.OooO0O0 f17116OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final Paint f17117OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final Paint f17118OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final o0O00o00.OooO00o f17119OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NonNull
    public final RectF f17120OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final o000oOoO f17121OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NonNull
    public final OooO00o f17122OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public PorterDuffColorFilter f17123OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public PorterDuffColorFilter f17124OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f17125OooOoO0;

    @Retention(RetentionPolicy.SOURCE)
    public @interface CompatibilityShadowMode {
    }

    public class OooO00o {
        public OooO00o() {
        }
    }

    static {
        Paint paint = new Paint(1);
        f17103OooOoO = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public MaterialShapeDrawable() {
        this(new com.google.android.material.shape.OooO0O0());
    }

    public final int OooO() {
        OooO0O0 oooO0O0 = this.f17105OooO0Oo;
        return (int) (Math.cos(Math.toRadians(oooO0O0.f17145OooOOoo)) * ((double) oooO0O0.f17143OooOOo));
    }

    public void OooO00o() {
        invalidateSelf();
    }

    public final void OooO0O0(@NonNull RectF rectF, @NonNull Path path) {
        o000oOoO o000oooo2 = this.f17121OooOo0;
        OooO0O0 oooO0O0 = this.f17105OooO0Oo;
        o000oooo2.OooO00o(oooO0O0.f17128OooO00o, oooO0O0.f17136OooOO0, rectF, this.f17122OooOo00, path);
        if (this.f17105OooO0Oo.f17127OooO != 1.0f) {
            Matrix matrix = this.f17104OooO;
            matrix.reset();
            float f = this.f17105OooO0Oo.f17127OooO;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f17120OooOo, true);
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
        OooO0O0 oooO0O0 = this.f17105OooO0Oo;
        float f = oooO0O0.f17139OooOOO + oooO0O0.f17141OooOOOO + oooO0O0.f17140OooOOO0;
        o00O0O o00o0o2 = oooO0O0.f17129OooO0O0;
        return o00o0o2 != null ? o00o0o2.OooO00o(f, i) : i;
    }

    public final void OooO0o(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull Path path, @NonNull com.google.android.material.shape.OooO0O0 oooO0O0, @NonNull RectF rectF) {
        if (!oooO0O0.OooO0o(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fOooO00o = oooO0O0.f17155OooO0o.OooO00o(rectF) * this.f17105OooO0Oo.f17136OooOO0;
            canvas.drawRoundRect(rectF, fOooO00o, fOooO00o, paint);
        }
    }

    public final void OooO0o0(@NonNull Canvas canvas) {
        if (this.f17108OooO0oO.cardinality() > 0) {
            Log.w("MaterialShapeDrawable", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f17105OooO0Oo.f17143OooOOo;
        Path path = this.f17110OooOO0;
        o0O00o00.OooO00o oooO00o = this.f17119OooOOoo;
        if (i != 0) {
            canvas.drawPath(path, oooO00o.f41055OooO00o);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            OooO0o.OooOO0 oooOO1 = this.f17107OooO0o0[i2];
            int i3 = this.f17105OooO0Oo.f17144OooOOo0;
            Matrix matrix = OooO0o.OooOO0.f17198OooO0O0;
            oooOO1.OooO00o(matrix, oooO00o, i3, canvas);
            this.f17106OooO0o[i2].OooO00o(matrix, oooO00o, this.f17105OooO0Oo.f17144OooOOo0, canvas);
        }
        if (this.f17125OooOoO0) {
            OooO0O0 oooO0O0 = this.f17105OooO0Oo;
            int iSin = (int) (Math.sin(Math.toRadians(oooO0O0.f17145OooOOoo)) * ((double) oooO0O0.f17143OooOOo));
            int iOooO = OooO();
            canvas.translate(-iSin, -iOooO);
            canvas.drawPath(path, f17103OooOoO);
            canvas.translate(iSin, iOooO);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void OooO0oO(@NonNull Canvas canvas) {
        Paint paint = this.f17117OooOOo;
        Path path = this.f17111OooOO0O;
        com.google.android.material.shape.OooO0O0 oooO0O0 = this.f17116OooOOOo;
        RectF rectF = this.f17114OooOOO0;
        rectF.set(OooO0oo());
        Paint.Style style = this.f17105OooO0Oo.f17146OooOo0;
        float strokeWidth = (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && (paint.getStrokeWidth() > 0.0f ? 1 : (paint.getStrokeWidth() == 0.0f ? 0 : -1)) > 0 ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        OooO0o(canvas, paint, path, oooO0O0, rectF);
    }

    @NonNull
    public final RectF OooO0oo() {
        RectF rectF = this.f17112OooOO0o;
        rectF.set(getBounds());
        return rectF;
    }

    public final float OooOO0() {
        return this.f17105OooO0Oo.f17128OooO00o.f17156OooO0o0.OooO00o(OooO0oo());
    }

    public final void OooOO0O(Context context) {
        this.f17105OooO0Oo.f17129OooO0O0 = new o00O0O(context);
        OooOo0o();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean OooOO0o() {
        return this.f17105OooO0Oo.f17128OooO00o.OooO0o(OooO0oo());
    }

    public final void OooOOO(@Nullable ColorStateList colorStateList) {
        OooO0O0 oooO0O0 = this.f17105OooO0Oo;
        if (oooO0O0.f17130OooO0OO != colorStateList) {
            oooO0O0.f17130OooO0OO = colorStateList;
            onStateChange(getState());
        }
    }

    public final void OooOOO0(float f) {
        OooO0O0 oooO0O0 = this.f17105OooO0Oo;
        if (oooO0O0.f17139OooOOO != f) {
            oooO0O0.f17139OooOOO = f;
            OooOo0o();
        }
    }

    public final void OooOOOO(float f) {
        OooO0O0 oooO0O0 = this.f17105OooO0Oo;
        if (oooO0O0.f17136OooOO0 != f) {
            oooO0O0.f17136OooOO0 = f;
            this.f17109OooO0oo = true;
            invalidateSelf();
        }
    }

    public final void OooOOOo(Paint.Style style) {
        this.f17105OooO0Oo.f17146OooOo0 = style;
        super.invalidateSelf();
    }

    public final void OooOOo(int i) {
        OooO0O0 oooO0O0 = this.f17105OooO0Oo;
        if (oooO0O0.f17142OooOOOo != i) {
            oooO0O0.f17142OooOOOo = i;
            super.invalidateSelf();
        }
    }

    public final void OooOOo0() {
        this.f17119OooOOoo.OooO00o(-12303292);
        this.f17105OooO0Oo.f17147OooOo00 = false;
        super.invalidateSelf();
    }

    public final void OooOOoo(@Nullable ColorStateList colorStateList) {
        OooO0O0 oooO0O0 = this.f17105OooO0Oo;
        if (oooO0O0.f17131OooO0Oo != colorStateList) {
            oooO0O0.f17131OooO0Oo = colorStateList;
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
        if (this.f17105OooO0Oo.f17130OooO0OO == null || color2 == (colorForState2 = this.f17105OooO0Oo.f17130OooO0OO.getColorForState(iArr, (color2 = (paint2 = this.f17118OooOOo0).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.f17105OooO0Oo.f17131OooO0Oo == null || color == (colorForState = this.f17105OooO0Oo.f17131OooO0Oo.getColorForState(iArr, (color = (paint = this.f17117OooOOo).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final void OooOo00(float f) {
        this.f17105OooO0Oo.f17137OooOO0O = f;
        invalidateSelf();
    }

    public final boolean OooOo0O() {
        PorterDuffColorFilter porterDuffColorFilter = this.f17123OooOo0O;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f17124OooOo0o;
        OooO0O0 oooO0O0 = this.f17105OooO0Oo;
        this.f17123OooOo0O = OooO0OO(oooO0O0.f17132OooO0o, oooO0O0.f17134OooO0oO, this.f17118OooOOo0, true);
        OooO0O0 oooO0O1 = this.f17105OooO0Oo;
        this.f17124OooOo0o = OooO0OO(oooO0O1.f17133OooO0o0, oooO0O1.f17134OooO0oO, this.f17117OooOOo, false);
        OooO0O0 oooO0O2 = this.f17105OooO0Oo;
        if (oooO0O2.f17147OooOo00) {
            this.f17119OooOOoo.OooO00o(oooO0O2.f17132OooO0o.getColorForState(getState(), 0));
        }
        return (o000OO.OooO0OO.OooO00o(porterDuffColorFilter, this.f17123OooOo0O) && o000OO.OooO0OO.OooO00o(porterDuffColorFilter2, this.f17124OooOo0o)) ? false : true;
    }

    public final void OooOo0o() {
        OooO0O0 oooO0O0 = this.f17105OooO0Oo;
        float f = oooO0O0.f17139OooOOO + oooO0O0.f17141OooOOOO;
        oooO0O0.f17144OooOOo0 = (int) Math.ceil(0.75f * f);
        this.f17105OooO0Oo.f17143OooOOo = (int) Math.ceil(f * 0.25f);
        OooOo0O();
        super.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00e6  */
    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        boolean z;
        Paint paint = this.f17118OooOOo0;
        paint.setColorFilter(this.f17123OooOo0O);
        int alpha = paint.getAlpha();
        int i = this.f17105OooO0Oo.f17138OooOO0o;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f17117OooOOo;
        paint2.setColorFilter(this.f17124OooOo0o);
        paint2.setStrokeWidth(this.f17105OooO0Oo.f17137OooOO0O);
        int alpha2 = paint2.getAlpha();
        int i2 = this.f17105OooO0Oo.f17138OooOO0o;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z2 = this.f17109OooO0oo;
        Path path = this.f17110OooOO0;
        if (z2) {
            Paint.Style style = this.f17105OooO0Oo.f17146OooOo0;
            com.google.android.material.shape.OooO0O0 oooO0O0OooO0oo = this.f17105OooO0Oo.f17128OooO00o.OooO0oo(new com.google.android.material.shape.OooO00o(-((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && (paint2.getStrokeWidth() > 0.0f ? 1 : (paint2.getStrokeWidth() == 0.0f ? 0 : -1)) > 0 ? paint2.getStrokeWidth() / 2.0f : 0.0f)));
            this.f17116OooOOOo = oooO0O0OooO0oo;
            float f = this.f17105OooO0Oo.f17136OooOO0;
            RectF rectF = this.f17114OooOOO0;
            rectF.set(OooO0oo());
            Paint.Style style2 = this.f17105OooO0Oo.f17146OooOo0;
            float strokeWidth = (style2 == Paint.Style.FILL_AND_STROKE || style2 == Paint.Style.STROKE) && (paint2.getStrokeWidth() > 0.0f ? 1 : (paint2.getStrokeWidth() == 0.0f ? 0 : -1)) > 0 ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.f17121OooOo0.OooO00o(oooO0O0OooO0oo, f, rectF, null, this.f17111OooOO0O);
            OooO0O0(OooO0oo(), path);
            this.f17109OooO0oo = false;
        }
        OooO0O0 oooO0O0 = this.f17105OooO0Oo;
        int i3 = oooO0O0.f17142OooOOOo;
        if (i3 == 1 || oooO0O0.f17144OooOOo0 <= 0) {
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
            OooO0O0 oooO0O1 = this.f17105OooO0Oo;
            canvas.translate((int) (Math.sin(Math.toRadians(oooO0O1.f17145OooOOoo)) * ((double) oooO0O1.f17143OooOOo)), OooO());
            if (this.f17125OooOoO0) {
                RectF rectF2 = this.f17120OooOo;
                int iWidth = (int) (rectF2.width() - getBounds().width());
                int iHeight = (int) (rectF2.height() - getBounds().height());
                if (iWidth < 0 || iHeight < 0) {
                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.f17105OooO0Oo.f17144OooOOo0 * 2) + ((int) rectF2.width()) + iWidth, (this.f17105OooO0Oo.f17144OooOOo0 * 2) + ((int) rectF2.height()) + iHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                float f2 = (getBounds().left - this.f17105OooO0Oo.f17144OooOOo0) - iWidth;
                float f3 = (getBounds().top - this.f17105OooO0Oo.f17144OooOOo0) - iHeight;
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
        OooO0O0 oooO0O2 = this.f17105OooO0Oo;
        Paint.Style style3 = oooO0O2.f17146OooOo0;
        if (style3 == Paint.Style.FILL_AND_STROKE || style3 == Paint.Style.FILL) {
            OooO0o(canvas, paint, path, oooO0O2.f17128OooO00o, OooO0oo());
        }
        Paint.Style style4 = this.f17105OooO0Oo.f17146OooOo0;
        if ((style4 == Paint.Style.FILL_AND_STROKE || style4 == Paint.Style.STROKE) && paint2.getStrokeWidth() > 0.0f) {
            OooO0oO(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f17105OooO0Oo.f17138OooOO0o;
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public final Drawable.ConstantState getConstantState() {
        return this.f17105OooO0Oo;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@NonNull Outline outline) {
        if (this.f17105OooO0Oo.f17142OooOOOo == 2) {
            return;
        }
        if (OooOO0o()) {
            outline.setRoundRect(getBounds(), OooOO0() * this.f17105OooO0Oo.f17136OooOO0);
            return;
        }
        RectF rectFOooO0oo = OooO0oo();
        Path path = this.f17110OooOO0;
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
        Rect rect2 = this.f17105OooO0Oo.f17135OooO0oo;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f17113OooOOO;
        region.set(bounds);
        RectF rectFOooO0oo = OooO0oo();
        Path path = this.f17110OooOO0;
        OooO0O0(rectFOooO0oo, path);
        Region region2 = this.f17115OooOOOO;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f17109OooO0oo = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f17105OooO0Oo.f17132OooO0o) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f17105OooO0Oo.f17133OooO0o0) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f17105OooO0Oo.f17131OooO0Oo) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f17105OooO0Oo.f17130OooO0OO) != null && colorStateList4.isStateful())));
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        this.f17105OooO0Oo = new OooO0O0(this.f17105OooO0Oo);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f17109OooO0oo = true;
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
        OooO0O0 oooO0O0 = this.f17105OooO0Oo;
        if (oooO0O0.f17138OooOO0o != i) {
            oooO0O0.f17138OooOO0o = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f17105OooO0Oo.getClass();
        super.invalidateSelf();
    }

    @Override // p280o0O00o0O.o0OoOo0
    public final void setShapeAppearanceModel(@NonNull com.google.android.material.shape.OooO0O0 oooO0O0) {
        this.f17105OooO0Oo.f17128OooO00o = oooO0O0;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(@ColorInt int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(@Nullable ColorStateList colorStateList) {
        this.f17105OooO0Oo.f17132OooO0o = colorStateList;
        OooOo0O();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(@Nullable PorterDuff.Mode mode) {
        OooO0O0 oooO0O0 = this.f17105OooO0Oo;
        if (oooO0O0.f17134OooO0oO != mode) {
            oooO0O0.f17134OooO0oO = mode;
            OooOo0O();
            super.invalidateSelf();
        }
    }

    public MaterialShapeDrawable(@NonNull com.google.android.material.shape.OooO0O0 oooO0O0) {
        this(new OooO0O0(oooO0O0));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public MaterialShapeDrawable(@NonNull OooO0O0 oooO0O0) {
        o000oOoO o000oooo2;
        this.f17107OooO0o0 = new OooO0o.OooOO0[4];
        this.f17106OooO0o = new OooO0o.OooOO0[4];
        this.f17108OooO0oO = new BitSet(8);
        this.f17104OooO = new Matrix();
        this.f17110OooOO0 = new Path();
        this.f17111OooOO0O = new Path();
        this.f17112OooOO0o = new RectF();
        this.f17114OooOOO0 = new RectF();
        this.f17113OooOOO = new Region();
        this.f17115OooOOOO = new Region();
        Paint paint = new Paint(1);
        this.f17118OooOOo0 = paint;
        Paint paint2 = new Paint(1);
        this.f17117OooOOo = paint2;
        this.f17119OooOOoo = new o0O00o00.OooO00o();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            o000oooo2 = o000oOoO.OooO00o.f41085OooO00o;
        } else {
            o000oooo2 = new o000oOoO();
        }
        this.f17121OooOo0 = o000oooo2;
        this.f17120OooOo = new RectF();
        this.f17125OooOoO0 = true;
        this.f17105OooO0Oo = oooO0O0;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        OooOo0O();
        OooOo0(getState());
        this.f17122OooOo00 = new OooO00o();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class OooO0O0 extends Drawable.ConstantState {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final float f17127OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public com.google.android.material.shape.OooO0O0 f17128OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public o00O0O f17129OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public ColorStateList f17130OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public ColorStateList f17131OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Nullable
        public ColorStateList f17132OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @Nullable
        public final ColorStateList f17133OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        @Nullable
        public PorterDuff.Mode f17134OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @Nullable
        public Rect f17135OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public float f17136OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public float f17137OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public int f17138OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public float f17139OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public float f17140OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final float f17141OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public int f17142OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public int f17143OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public int f17144OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public int f17145OooOOoo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        public Paint.Style f17146OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public boolean f17147OooOo00;

        public OooO0O0(@NonNull com.google.android.material.shape.OooO0O0 oooO0O0) {
            this.f17130OooO0OO = null;
            this.f17131OooO0Oo = null;
            this.f17133OooO0o0 = null;
            this.f17132OooO0o = null;
            this.f17134OooO0oO = PorterDuff.Mode.SRC_IN;
            this.f17135OooO0oo = null;
            this.f17127OooO = 1.0f;
            this.f17136OooOO0 = 1.0f;
            this.f17138OooOO0o = 255;
            this.f17140OooOOO0 = 0.0f;
            this.f17139OooOOO = 0.0f;
            this.f17141OooOOOO = 0.0f;
            this.f17142OooOOOo = 0;
            this.f17144OooOOo0 = 0;
            this.f17143OooOOo = 0;
            this.f17145OooOOoo = 0;
            this.f17147OooOo00 = false;
            this.f17146OooOo0 = Paint.Style.FILL_AND_STROKE;
            this.f17128OooO00o = oooO0O0;
            this.f17129OooO0O0 = null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this);
            materialShapeDrawable.f17109OooO0oo = true;
            return materialShapeDrawable;
        }

        public OooO0O0(@NonNull OooO0O0 oooO0O0) {
            this.f17130OooO0OO = null;
            this.f17131OooO0Oo = null;
            this.f17133OooO0o0 = null;
            this.f17132OooO0o = null;
            this.f17134OooO0oO = PorterDuff.Mode.SRC_IN;
            this.f17135OooO0oo = null;
            this.f17127OooO = 1.0f;
            this.f17136OooOO0 = 1.0f;
            this.f17138OooOO0o = 255;
            this.f17140OooOOO0 = 0.0f;
            this.f17139OooOOO = 0.0f;
            this.f17141OooOOOO = 0.0f;
            this.f17142OooOOOo = 0;
            this.f17144OooOOo0 = 0;
            this.f17143OooOOo = 0;
            this.f17145OooOOoo = 0;
            this.f17147OooOo00 = false;
            this.f17146OooOo0 = Paint.Style.FILL_AND_STROKE;
            this.f17128OooO00o = oooO0O0.f17128OooO00o;
            this.f17129OooO0O0 = oooO0O0.f17129OooO0O0;
            this.f17137OooOO0O = oooO0O0.f17137OooOO0O;
            this.f17130OooO0OO = oooO0O0.f17130OooO0OO;
            this.f17131OooO0Oo = oooO0O0.f17131OooO0Oo;
            this.f17134OooO0oO = oooO0O0.f17134OooO0oO;
            this.f17132OooO0o = oooO0O0.f17132OooO0o;
            this.f17138OooOO0o = oooO0O0.f17138OooOO0o;
            this.f17127OooO = oooO0O0.f17127OooO;
            this.f17143OooOOo = oooO0O0.f17143OooOOo;
            this.f17142OooOOOo = oooO0O0.f17142OooOOOo;
            this.f17147OooOo00 = oooO0O0.f17147OooOo00;
            this.f17136OooOO0 = oooO0O0.f17136OooOO0;
            this.f17140OooOOO0 = oooO0O0.f17140OooOOO0;
            this.f17139OooOOO = oooO0O0.f17139OooOOO;
            this.f17141OooOOOO = oooO0O0.f17141OooOOOO;
            this.f17144OooOOo0 = oooO0O0.f17144OooOOo0;
            this.f17145OooOOoo = oooO0O0.f17145OooOOoo;
            this.f17133OooO0o0 = oooO0O0.f17133OooO0o0;
            this.f17146OooOo0 = oooO0O0.f17146OooOo0;
            if (oooO0O0.f17135OooO0oo != null) {
                this.f17135OooO0oo = new Rect(oooO0O0.f17135OooO0oo);
            }
        }
    }

    public MaterialShapeDrawable(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        this(new com.google.android.material.shape.OooO0O0(com.google.android.material.shape.OooO0O0.OooO0OO(context, attributeSet, i, i2)));
    }
}

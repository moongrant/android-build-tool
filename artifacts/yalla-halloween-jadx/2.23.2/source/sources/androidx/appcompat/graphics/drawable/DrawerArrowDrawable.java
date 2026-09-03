package androidx.appcompat.graphics.drawable;

import OooOo.OooO0o;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p012OooOo0O.OooOOO0;
import p012OooOo0O.o00O0O;
import p012OooOo0O.o0OoOo0;
import p053o00000oo.o00Ooo;

/* JADX INFO: loaded from: classes.dex */
public final class DrawerArrowDrawable extends Drawable {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final float f2492OooOO0o = (float) Math.toRadians(45.0d);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f2493OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Paint f2494OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f2495OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f2496OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f2497OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f2498OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float f2499OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Path f2500OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f2501OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f2502OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final int f2503OooOO0O;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface ArrowDirection {
    }

    public DrawerArrowDrawable(Context context) {
        Paint paint = new Paint();
        this.f2494OooO00o = paint;
        this.f2500OooO0oO = new Path();
        this.f2503OooOO0O = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, o00O0O.DrawerArrowToggle, OooOOO0.drawerArrowStyle, o0OoOo0.Base_Widget_AppCompat_DrawerArrowToggle);
        int color = typedArrayObtainStyledAttributes.getColor(o00O0O.DrawerArrowToggle_color, 0);
        if (color != paint.getColor()) {
            paint.setColor(color);
            invalidateSelf();
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(o00O0O.DrawerArrowToggle_thickness, 0.0f);
        if (paint.getStrokeWidth() != dimension) {
            paint.setStrokeWidth(dimension);
            this.f2502OooOO0 = (float) (Math.cos(f2492OooOO0o) * ((double) (dimension / 2.0f)));
            invalidateSelf();
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(o00O0O.DrawerArrowToggle_spinBars, true);
        if (this.f2498OooO0o != z) {
            this.f2498OooO0o = z;
            invalidateSelf();
        }
        float fRound = Math.round(typedArrayObtainStyledAttributes.getDimension(o00O0O.DrawerArrowToggle_gapBetweenBars, 0.0f));
        if (fRound != this.f2499OooO0o0) {
            this.f2499OooO0o0 = fRound;
            invalidateSelf();
        }
        this.f2501OooO0oo = typedArrayObtainStyledAttributes.getDimensionPixelSize(o00O0O.DrawerArrowToggle_drawableSize, 0);
        this.f2496OooO0OO = Math.round(typedArrayObtainStyledAttributes.getDimension(o00O0O.DrawerArrowToggle_barLength, 0.0f));
        this.f2495OooO0O0 = Math.round(typedArrayObtainStyledAttributes.getDimension(o00O0O.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.f2497OooO0Oo = typedArrayObtainStyledAttributes.getDimension(o00O0O.DrawerArrowToggle_arrowShaftLength, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        boolean z = true;
        int i = this.f2503OooOO0O;
        if (i == 0 || (i != 1 && (i == 3 ? o00Ooo.OooO0OO.OooO00o(this) != 0 : o00Ooo.OooO0OO.OooO00o(this) != 1))) {
            z = false;
        }
        float f = this.f2495OooO0O0;
        float fSqrt = (float) Math.sqrt(f * f * 2.0f);
        float f2 = this.f2493OooO;
        float f3 = this.f2496OooO0OO;
        float fOooO00o = OooO0o.OooO00o(fSqrt, f3, f2, f3);
        float fOooO00o2 = OooO0o.OooO00o(this.f2497OooO0Oo, f3, f2, f3);
        float fRound = Math.round(((this.f2502OooOO0 - 0.0f) * f2) + 0.0f);
        float f4 = this.f2493OooO;
        float fOooO00o3 = OooO0o.OooO00o(f2492OooOO0o, 0.0f, f4, 0.0f);
        float f5 = z ? 0.0f : -180.0f;
        float fOooO00o4 = OooO0o.OooO00o(z ? 180.0f : 0.0f, f5, f4, f5);
        double d = fOooO00o;
        double d2 = fOooO00o3;
        float fRound2 = Math.round(Math.cos(d2) * d);
        float fRound3 = Math.round(Math.sin(d2) * d);
        Path path = this.f2500OooO0oO;
        path.rewind();
        float f6 = this.f2499OooO0o0;
        Paint paint = this.f2494OooO00o;
        float strokeWidth = paint.getStrokeWidth() + f6;
        float fOooO00o5 = OooO0o.OooO00o(-this.f2502OooOO0, strokeWidth, this.f2493OooO, strokeWidth);
        float f7 = (-fOooO00o2) / 2.0f;
        path.moveTo(f7 + fRound, 0.0f);
        path.rLineTo(fOooO00o2 - (fRound * 2.0f), 0.0f);
        path.moveTo(f7, fOooO00o5);
        path.rLineTo(fRound2, fRound3);
        path.moveTo(f7, -fOooO00o5);
        path.rLineTo(fRound2, -fRound3);
        path.close();
        canvas.save();
        float strokeWidth2 = paint.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth2);
        float f8 = this.f2499OooO0o0;
        canvas.translate(bounds.centerX(), (strokeWidth2 * 1.5f) + f8 + ((((int) (fHeight - (2.0f * f8))) / 4) * 2));
        if (this.f2498OooO0o) {
            canvas.rotate(fOooO00o4 * (z ^ false ? -1 : 1));
        } else if (z) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f2501OooO0oo;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f2501OooO0oo;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Paint paint = this.f2494OooO00o;
        if (i != paint.getAlpha()) {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f2494OooO00o.setColorFilter(colorFilter);
        invalidateSelf();
    }
}

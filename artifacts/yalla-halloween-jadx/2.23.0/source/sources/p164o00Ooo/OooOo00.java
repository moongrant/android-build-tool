package p164o00Ooo;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class OooOo00 extends Drawable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public PorterDuffColorFilter f38518OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public float f38519OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final RectF f38521OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Rect f38522OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float f38524OooO0o0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public ColorStateList f38526OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public ColorStateList f38527OooOO0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f38523OooO0o = false;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f38525OooO0oO = true;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public PorterDuff.Mode f38528OooOO0O = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Paint f38520OooO0O0 = new Paint(5);

    public OooOo00(float f, ColorStateList colorStateList) {
        this.f38519OooO00o = f;
        OooO0O0(colorStateList);
        this.f38521OooO0OO = new RectF();
        this.f38522OooO0Oo = new Rect();
    }

    public final PorterDuffColorFilter OooO00o(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void OooO0O0(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f38526OooO0oo = colorStateList;
        this.f38520OooO0O0.setColor(colorStateList.getColorForState(getState(), this.f38526OooO0oo.getDefaultColor()));
    }

    public final void OooO0OO(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        RectF rectF = this.f38521OooO0OO;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        Rect rect2 = this.f38522OooO0Oo;
        rect2.set(rect);
        if (this.f38523OooO0o) {
            float fOooO00o = OooOo.OooO00o(this.f38524OooO0o0, this.f38519OooO00o, this.f38525OooO0oO);
            float f = this.f38524OooO0o0;
            float f2 = this.f38519OooO00o;
            if (this.f38525OooO0oO) {
                f = (float) (((1.0d - OooOo.f38516OooO00o) * ((double) f2)) + ((double) f));
            }
            rect2.inset((int) Math.ceil(f), (int) Math.ceil(fOooO00o));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f38520OooO0O0;
        if (this.f38518OooO == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f38518OooO);
            z = true;
        }
        RectF rectF = this.f38521OooO0OO;
        float f = this.f38519OooO00o;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f38522OooO0Oo, this.f38519OooO00o);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f38527OooOO0;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f38526OooO0oo) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        OooO0OO(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f38526OooO0oo;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f38520OooO0O0;
        boolean z = colorForState != paint.getColor();
        if (z) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f38527OooOO0;
        if (colorStateList2 == null || (mode = this.f38528OooOO0O) == null) {
            return z;
        }
        this.f38518OooO = OooO00o(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f38520OooO0O0.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f38520OooO0O0.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f38527OooOO0 = colorStateList;
        this.f38518OooO = OooO00o(colorStateList, this.f38528OooOO0O);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f38528OooOO0O = mode;
        this.f38518OooO = OooO00o(this.f38527OooOO0, mode);
        invalidateSelf();
    }
}

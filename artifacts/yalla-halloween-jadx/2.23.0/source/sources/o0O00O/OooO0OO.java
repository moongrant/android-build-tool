package o0O00O;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import kotlin.ULong;
import o0O00o00.Oooo000;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO0OO extends Drawable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @ColorInt
    public int f41675OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Paint f41677OooO0O0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Dimension
    public float f41683OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @ColorInt
    public int f41684OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @ColorInt
    public int f41685OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @ColorInt
    public int f41686OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @ColorInt
    public int f41688OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public com.google.android.material.shape.OooO0O0 f41689OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public ColorStateList f41690OooOOOo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Oooo000 f41676OooO00o = Oooo000.OooO00o.f41818OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Path f41678OooO0OO = new Path();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Rect f41679OooO0Oo = new Rect();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final RectF f41681OooO0o0 = new RectF();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final RectF f41680OooO0o = new RectF();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO00o f41682OooO0oO = new OooO00o();

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f41687OooOOO = true;

    public class OooO00o extends Drawable.ConstantState {
        public OooO00o() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable() {
            return OooO0OO.this;
        }
    }

    public OooO0OO(com.google.android.material.shape.OooO0O0 oooO0O0) {
        this.f41689OooOOOO = oooO0O0;
        Paint paint = new Paint(1);
        this.f41677OooO0O0 = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        boolean z = this.f41687OooOOO;
        Paint paint = this.f41677OooO0O0;
        Rect rect = this.f41679OooO0Oo;
        if (z) {
            copyBounds(rect);
            float fHeight = this.f41683OooO0oo / rect.height();
            paint.setShader(new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{p052o00000oO.OooOO0.OooO0OO(this.f41675OooO, this.f41688OooOOO0), p052o00000oO.OooOO0.OooO0OO(this.f41684OooOO0, this.f41688OooOOO0), p052o00000oO.OooOO0.OooO0OO(p052o00000oO.OooOO0.OooO0Oo(this.f41684OooOO0, 0), this.f41688OooOOO0), p052o00000oO.OooOO0.OooO0OO(p052o00000oO.OooOO0.OooO0Oo(this.f41686OooOO0o, 0), this.f41688OooOOO0), p052o00000oO.OooOO0.OooO0OO(this.f41686OooOO0o, this.f41688OooOOO0), p052o00000oO.OooOO0.OooO0OO(this.f41685OooOO0O, this.f41688OooOOO0)}, new float[]{0.0f, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP));
            this.f41687OooOOO = false;
        }
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        copyBounds(rect);
        RectF rectF = this.f41681OooO0o0;
        rectF.set(rect);
        o0O00o00.OooO0o oooO0o = this.f41689OooOOOO.f17633OooO0o0;
        RectF rectF2 = this.f41680OooO0o;
        rectF2.set(getBounds());
        float fMin = Math.min(oooO0o.OooO00o(rectF2), rectF.width() / 2.0f);
        com.google.android.material.shape.OooO0O0 oooO0O0 = this.f41689OooOOOO;
        rectF2.set(getBounds());
        if (oooO0O0.OooO0o(rectF2)) {
            rectF.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(rectF, fMin, fMin, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public final Drawable.ConstantState getConstantState() {
        return this.f41682OooO0oO;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f41683OooO0oo > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public final void getOutline(@NonNull Outline outline) {
        com.google.android.material.shape.OooO0O0 oooO0O0 = this.f41689OooOOOO;
        RectF rectF = this.f41680OooO0o;
        rectF.set(getBounds());
        if (oooO0O0.OooO0o(rectF)) {
            o0O00o00.OooO0o oooO0o = this.f41689OooOOOO.f17633OooO0o0;
            rectF.set(getBounds());
            outline.setRoundRect(getBounds(), oooO0o.OooO00o(rectF));
            return;
        }
        Rect rect = this.f41679OooO0Oo;
        copyBounds(rect);
        RectF rectF2 = this.f41681OooO0o0;
        rectF2.set(rect);
        com.google.android.material.shape.OooO0O0 oooO0O1 = this.f41689OooOOOO;
        Path path = this.f41678OooO0OO;
        this.f41676OooO00o.OooO00o(oooO0O1, 1.0f, rectF2, null, path);
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
        com.google.android.material.shape.OooO0O0 oooO0O0 = this.f41689OooOOOO;
        RectF rectF = this.f41680OooO0o;
        rectF.set(getBounds());
        if (!oooO0O0.OooO0o(rectF)) {
            return true;
        }
        int iRound = Math.round(this.f41683OooO0oo);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f41690OooOOOo;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f41687OooOOO = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f41690OooOOOo;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f41688OooOOO0)) != this.f41688OooOOO0) {
            this.f41687OooOOO = true;
            this.f41688OooOOO0 = colorForState;
        }
        if (this.f41687OooOOO) {
            invalidateSelf();
        }
        return this.f41687OooOOO;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(@IntRange(from = ULong.MIN_VALUE, to = 255) int i) {
        this.f41677OooO0O0.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f41677OooO0O0.setColorFilter(colorFilter);
        invalidateSelf();
    }
}

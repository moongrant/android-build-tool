package p123o00O0o0;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.annotation.RequiresApi;
import coil.size.Scale;
import kotlin.Deprecated;
import kotlin.jvm.JvmOverloads;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p124o00O0o00.OooOOO;

/* JADX INFO: loaded from: classes2.dex */
public final class o000oOoO extends Drawable implements Drawable.Callback, Animatable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Drawable f36515OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f36516OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Scale f36517OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f36518OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f36519OooO0oo = 1.0f;

    @JvmOverloads
    public o000oOoO(@NotNull Drawable drawable, @NotNull Scale scale) {
        this.f36515OooO0Oo = drawable;
        this.f36517OooO0o0 = scale;
        drawable.setCallback(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NotNull Canvas canvas) {
        int iSave = canvas.save();
        try {
            canvas.translate(this.f36516OooO0o, this.f36518OooO0oO);
            float f = this.f36519OooO0oo;
            canvas.scale(f, f);
            this.f36515OooO0Oo.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f36515OooO0Oo.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public final ColorFilter getColorFilter() {
        return this.f36515OooO0Oo.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f36515OooO0Oo.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f36515OooO0Oo.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated(message = "Deprecated in Java")
    public final int getOpacity() {
        return this.f36515OooO0Oo.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(@NotNull Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Object obj = this.f36515OooO0Oo;
        return (obj instanceof Animatable) && ((Animatable) obj).isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(@NotNull Rect rect) {
        Drawable drawable = this.f36515OooO0Oo;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
            this.f36516OooO0o = 0.0f;
            this.f36518OooO0oO = 0.0f;
            this.f36519OooO0oo = 1.0f;
            return;
        }
        int iWidth = rect.width();
        int iHeight = rect.height();
        double dOooO00o = OooOOO.OooO00o(intrinsicWidth, intrinsicHeight, iWidth, iHeight, this.f36517OooO0o0);
        double d = 2;
        int iRoundToInt = MathKt.roundToInt((((double) iWidth) - (((double) intrinsicWidth) * dOooO00o)) / d);
        int iRoundToInt2 = MathKt.roundToInt((((double) iHeight) - (((double) intrinsicHeight) * dOooO00o)) / d);
        drawable.setBounds(iRoundToInt, iRoundToInt2, intrinsicWidth + iRoundToInt, intrinsicHeight + iRoundToInt2);
        this.f36516OooO0o = rect.left;
        this.f36518OooO0oO = rect.top;
        this.f36519OooO0oo = (float) dOooO00o;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        return this.f36515OooO0Oo.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(@NotNull int[] iArr) {
        return this.f36515OooO0Oo.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(@NotNull Drawable drawable, @NotNull Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f36515OooO0Oo.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f36515OooO0Oo.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        this.f36515OooO0Oo.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(29)
    public final void setTintBlendMode(@Nullable BlendMode blendMode) {
        this.f36515OooO0Oo.setTintBlendMode(blendMode);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(@Nullable ColorStateList colorStateList) {
        this.f36515OooO0Oo.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(@Nullable PorterDuff.Mode mode) {
        this.f36515OooO0Oo.setTintMode(mode);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Object obj = this.f36515OooO0Oo;
        if (obj instanceof Animatable) {
            ((Animatable) obj).start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Object obj = this.f36515OooO0Oo;
        if (obj instanceof Animatable) {
            ((Animatable) obj).stop();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(@NotNull Drawable drawable, @NotNull Runnable runnable) {
        unscheduleSelf(runnable);
    }
}

package p104o000oo0O;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.support.v4.media.OooO00o;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import coil.size.Scale;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.jvm.JvmOverloads;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p079o000Oo0o.o000OO00;
import p103o000oo00.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O00 extends Drawable implements Drawable.Callback, Animatable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f35727OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Scale f35728OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f35729OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f35730OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f35731OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final ArrayList f35732OooO0oo = new ArrayList();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f35733OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f35734OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f35735OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public Drawable f35736OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f35737OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public final Drawable f35738OooOOOO;

    @JvmOverloads
    public o00O00(@Nullable Drawable drawable, @Nullable Drawable drawable2, @NotNull Scale scale, int i, boolean z, boolean z2) {
        this.f35728OooO0Oo = scale;
        this.f35730OooO0o0 = i;
        this.f35729OooO0o = z;
        this.f35731OooO0oO = z2;
        this.f35727OooO = OooO00o(drawable != null ? Integer.valueOf(drawable.getIntrinsicWidth()) : null, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicWidth()) : null);
        this.f35733OooOO0 = OooO00o(drawable != null ? Integer.valueOf(drawable.getIntrinsicHeight()) : null, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicHeight()) : null);
        this.f35735OooOO0o = 255;
        this.f35736OooOOO = drawable != null ? drawable.mutate() : null;
        Drawable drawableMutate = drawable2 != null ? drawable2.mutate() : null;
        this.f35738OooOOOO = drawableMutate;
        if (!(i > 0)) {
            throw new IllegalArgumentException("durationMillis must be > 0.".toString());
        }
        Drawable drawable3 = this.f35736OooOOO;
        if (drawable3 != null) {
            drawable3.setCallback(this);
        }
        if (drawableMutate == null) {
            return;
        }
        drawableMutate.setCallback(this);
    }

    public final int OooO00o(Integer num, Integer num2) {
        if (this.f35731OooO0oO || ((num == null || num.intValue() != -1) && (num2 == null || num2.intValue() != -1))) {
            return Math.max(num != null ? num.intValue() : -1, num2 != null ? num2.intValue() : -1);
        }
        return -1;
    }

    public final void OooO0O0() {
        this.f35737OooOOO0 = 2;
        this.f35736OooOOO = null;
        ArrayList arrayList = this.f35732OooO0oo;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((o000OO00) arrayList.get(i)).OooO00o(this);
        }
    }

    @VisibleForTesting
    public final void OooO0OO(@NotNull Drawable drawable, @NotNull Rect rect) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
            return;
        }
        int iWidth = rect.width();
        int iHeight = rect.height();
        double dOooO00o = Oooo0.OooO00o(intrinsicWidth, intrinsicHeight, iWidth, iHeight, this.f35728OooO0Oo);
        double d = 2;
        int iRoundToInt = MathKt.roundToInt((((double) iWidth) - (((double) intrinsicWidth) * dOooO00o)) / d);
        int iRoundToInt2 = MathKt.roundToInt((((double) iHeight) - (dOooO00o * ((double) intrinsicHeight))) / d);
        drawable.setBounds(rect.left + iRoundToInt, rect.top + iRoundToInt2, rect.right - iRoundToInt, rect.bottom - iRoundToInt2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NotNull Canvas canvas) {
        Drawable drawable;
        int i = this.f35737OooOOO0;
        if (i == 0) {
            Drawable drawable2 = this.f35736OooOOO;
            if (drawable2 != null) {
                drawable2.setAlpha(this.f35735OooOO0o);
                int iSave = canvas.save();
                try {
                    drawable2.draw(canvas);
                    return;
                } finally {
                    canvas.restoreToCount(iSave);
                }
            }
            return;
        }
        Drawable drawable3 = this.f35738OooOOOO;
        if (i == 2) {
            if (drawable3 != null) {
                drawable3.setAlpha(this.f35735OooOO0o);
                int iSave2 = canvas.save();
                try {
                    drawable3.draw(canvas);
                    return;
                } finally {
                    canvas.restoreToCount(iSave2);
                }
            }
            return;
        }
        double dUptimeMillis = (SystemClock.uptimeMillis() - this.f35734OooOO0O) / ((double) this.f35730OooO0o0);
        double dCoerceIn = RangesKt.coerceIn(dUptimeMillis, 0.0d, 1.0d);
        int i2 = this.f35735OooOO0o;
        int i3 = (int) (dCoerceIn * ((double) i2));
        if (this.f35729OooO0o) {
            i2 -= i3;
        }
        boolean z = dUptimeMillis >= 1.0d;
        if (!z && (drawable = this.f35736OooOOO) != null) {
            drawable.setAlpha(i2);
            int iSave3 = canvas.save();
            try {
                drawable.draw(canvas);
                canvas.restoreToCount(iSave3);
            } catch (Throwable th) {
                canvas.restoreToCount(iSave3);
                throw th;
            }
        }
        if (drawable3 != null) {
            drawable3.setAlpha(i3);
            int iSave4 = canvas.save();
            try {
                drawable3.draw(canvas);
                canvas.restoreToCount(iSave4);
            } catch (Throwable th2) {
                canvas.restoreToCount(iSave4);
                throw th2;
            }
        }
        if (z) {
            OooO0O0();
        } else {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f35735OooOO0o;
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public final ColorFilter getColorFilter() {
        ColorFilter colorFilter;
        int i = this.f35737OooOOO0;
        if (i == 0) {
            Drawable drawable = this.f35736OooOOO;
            if (drawable != null) {
                return drawable.getColorFilter();
            }
            return null;
        }
        Drawable drawable2 = this.f35738OooOOOO;
        if (i != 1) {
            if (i == 2 && drawable2 != null) {
                return drawable2.getColorFilter();
            }
            return null;
        }
        if (drawable2 != null && (colorFilter = drawable2.getColorFilter()) != null) {
            return colorFilter;
        }
        Drawable drawable3 = this.f35736OooOOO;
        if (drawable3 != null) {
            return drawable3.getColorFilter();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f35733OooOO0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f35727OooO;
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated(message = "Deprecated in Java")
    public final int getOpacity() {
        Drawable drawable = this.f35736OooOOO;
        int i = this.f35737OooOOO0;
        if (i == 0) {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            return -2;
        }
        Drawable drawable2 = this.f35738OooOOOO;
        if (i == 2) {
            if (drawable2 != null) {
                return drawable2.getOpacity();
            }
            return -2;
        }
        if (drawable != null && drawable2 != null) {
            return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
        }
        if (drawable != null) {
            return drawable.getOpacity();
        }
        if (drawable2 != null) {
            return drawable2.getOpacity();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(@NotNull Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f35737OooOOO0 == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(@NotNull Rect rect) {
        Drawable drawable = this.f35736OooOOO;
        if (drawable != null) {
            OooO0OO(drawable, rect);
        }
        Drawable drawable2 = this.f35738OooOOOO;
        if (drawable2 != null) {
            OooO0OO(drawable2, rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f35736OooOOO;
        boolean level = drawable != null ? drawable.setLevel(i) : false;
        Drawable drawable2 = this.f35738OooOOOO;
        return level || (drawable2 != null ? drawable2.setLevel(i) : false);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(@NotNull int[] iArr) {
        Drawable drawable = this.f35736OooOOO;
        boolean state = drawable != null ? drawable.setState(iArr) : false;
        Drawable drawable2 = this.f35738OooOOOO;
        return state || (drawable2 != null ? drawable2.setState(iArr) : false);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(@NotNull Drawable drawable, @NotNull Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        boolean z = false;
        if (i >= 0 && i < 256) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(OooO00o.OooO00o("Invalid alpha: ", i).toString());
        }
        this.f35735OooOO0o = i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        Drawable drawable = this.f35736OooOOO;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.f35738OooOOOO;
        if (drawable2 == null) {
            return;
        }
        drawable2.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f35736OooOOO;
        if (drawable != null) {
            drawable.setTint(i);
        }
        Drawable drawable2 = this.f35738OooOOOO;
        if (drawable2 != null) {
            drawable2.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(29)
    public final void setTintBlendMode(@Nullable BlendMode blendMode) {
        Drawable drawable = this.f35736OooOOO;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        Drawable drawable2 = this.f35738OooOOOO;
        if (drawable2 != null) {
            drawable2.setTintBlendMode(blendMode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(@Nullable ColorStateList colorStateList) {
        Drawable drawable = this.f35736OooOOO;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
        Drawable drawable2 = this.f35738OooOOOO;
        if (drawable2 != null) {
            drawable2.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(@Nullable PorterDuff.Mode mode) {
        Drawable drawable = this.f35736OooOOO;
        if (drawable != null) {
            drawable.setTintMode(mode);
        }
        Drawable drawable2 = this.f35738OooOOOO;
        if (drawable2 != null) {
            drawable2.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Object obj = this.f35736OooOOO;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.start();
        }
        Object obj2 = this.f35738OooOOOO;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.start();
        }
        if (this.f35737OooOOO0 != 0) {
            return;
        }
        this.f35737OooOOO0 = 1;
        this.f35734OooOO0O = SystemClock.uptimeMillis();
        ArrayList arrayList = this.f35732OooO0oo;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((o000OO00) arrayList.get(i)).OooO0O0(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Object obj = this.f35736OooOOO;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.stop();
        }
        Object obj2 = this.f35738OooOOOO;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.stop();
        }
        if (this.f35737OooOOO0 != 2) {
            OooO0O0();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(@NotNull Drawable drawable, @NotNull Runnable runnable) {
        unscheduleSelf(runnable);
    }
}

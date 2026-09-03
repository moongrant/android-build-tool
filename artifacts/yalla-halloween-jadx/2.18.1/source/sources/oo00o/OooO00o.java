package oo00o;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import coil.size.Scale;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p103o000oo00.OooOO0O;
import p115o00O00oO.Oooo000;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o extends Drawable implements Drawable.Callback, Animatable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final boolean f53273Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final Scale f53274Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final int f53275Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final boolean f53276Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @Nullable
    public Drawable f53277OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final int f53278OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public final List<OooOO0O> f53279OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final int f53280OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @Nullable
    public final Drawable f53281OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public int f53282OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public int f53283OoooOOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public long f53284o000oOoO;

    public OooO00o(@Nullable Drawable drawable, @Nullable Drawable drawable2, @NotNull Scale scale, int i, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(scale, "scale");
        this.f53274Oooo0o = scale;
        this.f53275Oooo0oO = i;
        this.f53276Oooo0oo = z;
        this.f53273Oooo = z2;
        this.f53279OoooO00 = new ArrayList();
        this.f53278OoooO0 = OooO00o(drawable == null ? null : Integer.valueOf(drawable.getIntrinsicWidth()), drawable2 == null ? null : Integer.valueOf(drawable2.getIntrinsicWidth()));
        this.f53280OoooO0O = OooO00o(drawable == null ? null : Integer.valueOf(drawable.getIntrinsicHeight()), drawable2 == null ? null : Integer.valueOf(drawable2.getIntrinsicHeight()));
        this.f53277OoooO = drawable == null ? null : drawable.mutate();
        Drawable drawableMutate = drawable2 != null ? drawable2.mutate() : null;
        this.f53281OoooOO0 = drawableMutate;
        this.f53282OoooOOO = KotlinVersion.MAX_COMPONENT_VALUE;
        if (!(i > 0)) {
            throw new IllegalArgumentException("durationMillis must be > 0.".toString());
        }
        Drawable drawable3 = this.f53277OoooO;
        if (drawable3 != null) {
            drawable3.setCallback(this);
        }
        if (drawableMutate == null) {
            return;
        }
        drawableMutate.setCallback(this);
    }

    public final int OooO00o(Integer num, Integer num2) {
        if (!this.f53273Oooo) {
            if (num != null && num.intValue() == -1) {
                return -1;
            }
            if (num2 != null && num2.intValue() == -1) {
                return -1;
            }
        }
        return Math.max(num == null ? -1 : num.intValue(), num2 != null ? num2.intValue() : -1);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List, java.util.List<o000oo00.OooOO0O>] */
    public final void OooO0O0() {
        this.f53283OoooOOo = 2;
        this.f53277OoooO = null;
        ?? r0 = this.f53279OoooO00;
        int size = r0.size() - 1;
        if (size < 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            ((OooOO0O) r0.get(i)).OooO00o();
            if (i2 > size) {
                return;
            } else {
                i = i2;
            }
        }
    }

    @VisibleForTesting
    public final void OooO0OO(@NotNull Drawable drawable, @NotNull Rect targetBounds) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        Intrinsics.checkNotNullParameter(targetBounds, "targetBounds");
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(targetBounds);
            return;
        }
        int iWidth = targetBounds.width();
        int iHeight = targetBounds.height();
        double dOooO0O0 = Oooo000.OooO0O0(intrinsicWidth, intrinsicHeight, iWidth, iHeight, this.f53274Oooo0o);
        double d = 2;
        int iRoundToInt = MathKt.roundToInt((((double) iWidth) - (((double) intrinsicWidth) * dOooO0O0)) / d);
        int iRoundToInt2 = MathKt.roundToInt((((double) iHeight) - (dOooO0O0 * ((double) intrinsicHeight))) / d);
        drawable.setBounds(targetBounds.left + iRoundToInt, targetBounds.top + iRoundToInt2, targetBounds.right - iRoundToInt, targetBounds.bottom - iRoundToInt2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NotNull Canvas canvas) {
        Drawable drawable;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int i = this.f53283OoooOOo;
        if (i == 0) {
            Drawable drawable2 = this.f53277OoooO;
            if (drawable2 == null) {
                return;
            }
            drawable2.setAlpha(this.f53282OoooOOO);
            int iSave = canvas.save();
            try {
                drawable2.draw(canvas);
                return;
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
        if (i == 2) {
            Drawable drawable3 = this.f53281OoooOO0;
            if (drawable3 == null) {
                return;
            }
            drawable3.setAlpha(this.f53282OoooOOO);
            int iSave2 = canvas.save();
            try {
                drawable3.draw(canvas);
                return;
            } finally {
                canvas.restoreToCount(iSave2);
            }
        }
        double dUptimeMillis = (SystemClock.uptimeMillis() - this.f53284o000oOoO) / ((double) this.f53275Oooo0oO);
        double dCoerceIn = RangesKt.coerceIn(dUptimeMillis, 0.0d, 1.0d);
        int i2 = this.f53282OoooOOO;
        int i3 = (int) (dCoerceIn * ((double) i2));
        if (this.f53276Oooo0oo) {
            i2 -= i3;
        }
        boolean z = dUptimeMillis >= 1.0d;
        if (!z && (drawable = this.f53277OoooO) != null) {
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
        Drawable drawable4 = this.f53281OoooOO0;
        if (drawable4 != null) {
            drawable4.setAlpha(i3);
            int iSave4 = canvas.save();
            try {
                drawable4.draw(canvas);
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
    @RequiresApi(19)
    public final int getAlpha() {
        return this.f53282OoooOOO;
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(21)
    @Nullable
    public final ColorFilter getColorFilter() {
        Drawable drawable;
        int i = this.f53283OoooOOo;
        if (i == 0) {
            Drawable drawable2 = this.f53277OoooO;
            if (drawable2 == null) {
                return null;
            }
            return drawable2.getColorFilter();
        }
        if (i != 1) {
            if (i == 2 && (drawable = this.f53281OoooOO0) != null) {
                return drawable.getColorFilter();
            }
            return null;
        }
        Drawable drawable3 = this.f53281OoooOO0;
        ColorFilter colorFilter = drawable3 == null ? null : drawable3.getColorFilter();
        if (colorFilter != null) {
            return colorFilter;
        }
        Drawable drawable4 = this.f53277OoooO;
        if (drawable4 == null) {
            return null;
        }
        return drawable4.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f53280OoooO0O;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f53278OoooO0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f53277OoooO;
        Drawable drawable2 = this.f53281OoooOO0;
        int i = this.f53283OoooOOo;
        if (i == 0) {
            if (drawable == null) {
                return -2;
            }
            return drawable.getOpacity();
        }
        if (i == 2) {
            if (drawable2 == null) {
                return -2;
            }
            return drawable2.getOpacity();
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
    public final void invalidateDrawable(@NotNull Drawable who) {
        Intrinsics.checkNotNullParameter(who, "who");
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f53283OoooOOo == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(@NotNull Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Drawable drawable = this.f53277OoooO;
        if (drawable != null) {
            OooO0OO(drawable, bounds);
        }
        Drawable drawable2 = this.f53281OoooOO0;
        if (drawable2 == null) {
            return;
        }
        OooO0OO(drawable2, bounds);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f53277OoooO;
        boolean level = drawable == null ? false : drawable.setLevel(i);
        Drawable drawable2 = this.f53281OoooOO0;
        return level || (drawable2 == null ? false : drawable2.setLevel(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(@NotNull int[] state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Drawable drawable = this.f53277OoooO;
        boolean state2 = drawable == null ? false : drawable.setState(state);
        Drawable drawable2 = this.f53281OoooOO0;
        return state2 || (drawable2 == null ? false : drawable2.setState(state));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(@NotNull Drawable who, @NotNull Runnable what, long j) {
        Intrinsics.checkNotNullParameter(who, "who");
        Intrinsics.checkNotNullParameter(what, "what");
        scheduleSelf(what, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        boolean z = false;
        if (i >= 0 && i <= 255) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("Invalid alpha: ", Integer.valueOf(i)).toString());
        }
        this.f53282OoooOOO = i;
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(21)
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        Drawable drawable = this.f53277OoooO;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.f53281OoooOO0;
        if (drawable2 == null) {
            return;
        }
        drawable2.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(21)
    public final void setTint(int i) {
        Drawable drawable = this.f53277OoooO;
        if (drawable != null) {
            drawable.setTint(i);
        }
        Drawable drawable2 = this.f53281OoooOO0;
        if (drawable2 == null) {
            return;
        }
        drawable2.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(29)
    public final void setTintBlendMode(@Nullable BlendMode blendMode) {
        Drawable drawable = this.f53277OoooO;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        Drawable drawable2 = this.f53281OoooOO0;
        if (drawable2 == null) {
            return;
        }
        drawable2.setTintBlendMode(blendMode);
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(21)
    public final void setTintList(@Nullable ColorStateList colorStateList) {
        Drawable drawable = this.f53277OoooO;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
        Drawable drawable2 = this.f53281OoooOO0;
        if (drawable2 == null) {
            return;
        }
        drawable2.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(21)
    public final void setTintMode(@Nullable PorterDuff.Mode mode) {
        Drawable drawable = this.f53277OoooO;
        if (drawable != null) {
            drawable.setTintMode(mode);
        }
        Drawable drawable2 = this.f53281OoooOO0;
        if (drawable2 == null) {
            return;
        }
        drawable2.setTintMode(mode);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList, java.util.List, java.util.List<o000oo00.OooOO0O>] */
    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Object obj = this.f53277OoooO;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.start();
        }
        Object obj2 = this.f53281OoooOO0;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.start();
        }
        if (this.f53283OoooOOo != 0) {
            return;
        }
        this.f53283OoooOOo = 1;
        this.f53284o000oOoO = SystemClock.uptimeMillis();
        ?? r0 = this.f53279OoooO00;
        int i = 0;
        int size = r0.size() - 1;
        if (size >= 0) {
            while (true) {
                int i2 = i + 1;
                ((OooOO0O) r0.get(i)).OooO0O0();
                if (i2 > size) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Object obj = this.f53277OoooO;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.stop();
        }
        Object obj2 = this.f53281OoooOO0;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.stop();
        }
        if (this.f53283OoooOOo != 2) {
            OooO0O0();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(@NotNull Drawable who, @NotNull Runnable what) {
        Intrinsics.checkNotNullParameter(who, "who");
        Intrinsics.checkNotNullParameter(what, "what");
        unscheduleSelf(what);
    }
}

package oo00o;

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
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p115o00O00oO.Oooo000;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO extends Drawable implements Drawable.Callback, Animatable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public float f53307Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final Drawable f53308Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final Scale f53309Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public float f53310Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public float f53311OoooO00;

    @JvmOverloads
    public OooO0OO(@NotNull Drawable child, @NotNull Scale scale) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(scale, "scale");
        this.f53308Oooo0o = child;
        this.f53309Oooo0oO = scale;
        this.f53311OoooO00 = 1.0f;
        child.setCallback(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int iSave = canvas.save();
        try {
            canvas.translate(this.f53310Oooo0oo, this.f53307Oooo);
            float f = this.f53311OoooO00;
            canvas.scale(f, f);
            this.f53308Oooo0o.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(19)
    public final int getAlpha() {
        return this.f53308Oooo0o.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(21)
    @Nullable
    public final ColorFilter getColorFilter() {
        return this.f53308Oooo0o.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f53308Oooo0o.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f53308Oooo0o.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f53308Oooo0o.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(@NotNull Drawable who) {
        Intrinsics.checkNotNullParameter(who, "who");
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Object obj = this.f53308Oooo0o;
        return (obj instanceof Animatable) && ((Animatable) obj).isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(@NotNull Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        int intrinsicWidth = this.f53308Oooo0o.getIntrinsicWidth();
        int intrinsicHeight = this.f53308Oooo0o.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            this.f53308Oooo0o.setBounds(bounds);
            this.f53310Oooo0oo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f53307Oooo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f53311OoooO00 = 1.0f;
            return;
        }
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        double dOooO0O0 = Oooo000.OooO0O0(intrinsicWidth, intrinsicHeight, iWidth, iHeight, this.f53309Oooo0oO);
        double d = 2;
        int iRoundToInt = MathKt.roundToInt((((double) iWidth) - (((double) intrinsicWidth) * dOooO0O0)) / d);
        int iRoundToInt2 = MathKt.roundToInt((((double) iHeight) - (((double) intrinsicHeight) * dOooO0O0)) / d);
        this.f53308Oooo0o.setBounds(iRoundToInt, iRoundToInt2, intrinsicWidth + iRoundToInt, intrinsicHeight + iRoundToInt2);
        this.f53310Oooo0oo = bounds.left;
        this.f53307Oooo = bounds.top;
        this.f53311OoooO00 = (float) dOooO0O0;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        return this.f53308Oooo0o.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(@NotNull int[] state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return this.f53308Oooo0o.setState(state);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(@NotNull Drawable who, @NotNull Runnable what, long j) {
        Intrinsics.checkNotNullParameter(who, "who");
        Intrinsics.checkNotNullParameter(what, "what");
        scheduleSelf(what, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f53308Oooo0o.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(21)
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f53308Oooo0o.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(21)
    public final void setTint(int i) {
        this.f53308Oooo0o.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(29)
    public final void setTintBlendMode(@Nullable BlendMode blendMode) {
        this.f53308Oooo0o.setTintBlendMode(blendMode);
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(21)
    public final void setTintList(@Nullable ColorStateList colorStateList) {
        this.f53308Oooo0o.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(21)
    public final void setTintMode(@Nullable PorterDuff.Mode mode) {
        this.f53308Oooo0o.setTintMode(mode);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Object obj = this.f53308Oooo0o;
        if (obj instanceof Animatable) {
            ((Animatable) obj).start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Object obj = this.f53308Oooo0o;
        if (obj instanceof Animatable) {
            ((Animatable) obj).stop();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(@NotNull Drawable who, @NotNull Runnable what) {
        Intrinsics.checkNotNullParameter(who, "who");
        Intrinsics.checkNotNullParameter(what, "what");
        unscheduleSelf(what);
    }
}

package o0OO;

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
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.ULong;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO0OO extends Drawable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @ColorInt
    public int f37169OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Paint f37171OooO0O0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Dimension
    public float f37177OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @ColorInt
    public int f37178OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @ColorInt
    public int f37179OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @ColorInt
    public int f37180OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @ColorInt
    public int f37182OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public com.google.android.material.shape.OooO00o f37183OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public ColorStateList f37184OooOOOo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final com.google.android.material.shape.OooO0O0 f37170OooO00o = com.google.android.material.shape.OooO0O0.OooO00o.f17591OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Path f37172OooO0OO = new Path();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Rect f37173OooO0Oo = new Rect();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final RectF f37175OooO0o0 = new RectF();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final RectF f37174OooO0o = new RectF();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO00o f37176OooO0oO = new OooO00o();

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f37181OooOOO = true;

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

    public OooO0OO(com.google.android.material.shape.OooO00o oooO00o) {
        this.f37183OooOOOO = oooO00o;
        Paint paint = new Paint(1);
        this.f37171OooO0O0 = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @NonNull
    public final RectF OooO00o() {
        this.f37174OooO0o.set(getBounds());
        return this.f37174OooO0o;
    }

    public final void OooO0O0(@Nullable ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f37182OooOOO0 = colorStateList.getColorForState(getState(), this.f37182OooOOO0);
        }
        this.f37184OooOOOo = colorStateList;
        this.f37181OooOOO = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        if (this.f37181OooOOO) {
            Paint paint = this.f37171OooO0O0;
            Rect rect = this.f37173OooO0Oo;
            copyBounds(rect);
            float fHeight = this.f37177OooO0oo / rect.height();
            paint.setShader(new LinearGradient(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, rect.top, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, rect.bottom, new int[]{p071o000O0o.OooO0o.OooO0O0(this.f37169OooO, this.f37182OooOOO0), p071o000O0o.OooO0o.OooO0O0(this.f37178OooOO0, this.f37182OooOOO0), p071o000O0o.OooO0o.OooO0O0(p071o000O0o.OooO0o.OooO0o0(this.f37178OooOO0, 0), this.f37182OooOOO0), p071o000O0o.OooO0o.OooO0O0(p071o000O0o.OooO0o.OooO0o0(this.f37180OooOO0o, 0), this.f37182OooOOO0), p071o000O0o.OooO0o.OooO0O0(this.f37180OooOO0o, this.f37182OooOOO0), p071o000O0o.OooO0o.OooO0O0(this.f37179OooOO0O, this.f37182OooOOO0)}, new float[]{ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP));
            this.f37181OooOOO = false;
        }
        float strokeWidth = this.f37171OooO0O0.getStrokeWidth() / 2.0f;
        copyBounds(this.f37173OooO0Oo);
        this.f37175OooO0o0.set(this.f37173OooO0Oo);
        float fMin = Math.min(this.f37183OooOOOO.f17561OooO0o0.OooO00o(OooO00o()), this.f37175OooO0o0.width() / 2.0f);
        if (this.f37183OooOOOO.OooO0o(OooO00o())) {
            this.f37175OooO0o0.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f37175OooO0o0, fMin, fMin, this.f37171OooO0O0);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public final Drawable.ConstantState getConstantState() {
        return this.f37176OooO0oO;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f37177OooO0oo > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public final void getOutline(@NonNull Outline outline) {
        if (this.f37183OooOOOO.OooO0o(OooO00o())) {
            outline.setRoundRect(getBounds(), this.f37183OooOOOO.f17561OooO0o0.OooO00o(OooO00o()));
            return;
        }
        copyBounds(this.f37173OooO0Oo);
        this.f37175OooO0o0.set(this.f37173OooO0Oo);
        this.f37170OooO00o.OooO00o(this.f37183OooOOOO, 1.0f, this.f37175OooO0o0, this.f37172OooO0OO);
        if (this.f37172OooO0OO.isConvex()) {
            outline.setConvexPath(this.f37172OooO0OO);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(@NonNull Rect rect) {
        if (!this.f37183OooOOOO.OooO0o(OooO00o())) {
            return true;
        }
        int iRound = Math.round(this.f37177OooO0oo);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f37184OooOOOo;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f37181OooOOO = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f37184OooOOOo;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f37182OooOOO0)) != this.f37182OooOOO0) {
            this.f37181OooOOO = true;
            this.f37182OooOOO0 = colorForState;
        }
        if (this.f37181OooOOO) {
            invalidateSelf();
        }
        return this.f37181OooOOO;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(@IntRange(from = ULong.MIN_VALUE, to = 255) int i) {
        this.f37171OooO0O0.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f37171OooO0O0.setColorFilter(colorFilter);
        invalidateSelf();
    }
}

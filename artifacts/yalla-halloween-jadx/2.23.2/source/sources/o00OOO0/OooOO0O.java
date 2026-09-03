package o00OOO0;

import android.animation.Animator;
import android.graphics.PointF;
import android.view.Choreographer;
import androidx.annotation.FloatRange;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O extends OooO0OO implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public com.airbnb.lottie.OooOO0 f37430OooOOO0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f37423OooO0o = 1.0f;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f37424OooO0oO = false;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f37425OooO0oo = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f37422OooO = 0.0f;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f37426OooOO0 = 0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f37427OooOO0O = -2.14748365E9f;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f37428OooOO0o = 2.14748365E9f;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @VisibleForTesting
    public boolean f37429OooOOO = false;

    public final void OooO(float f) {
        if (this.f37422OooO == f) {
            return;
        }
        this.f37422OooO = OooOOO.OooO0O0(f, OooO0o(), OooO0o0());
        this.f37425OooO0oo = 0L;
        OooO0Oo();
    }

    public final float OooO0o() {
        com.airbnb.lottie.OooOO0 oooOO1 = this.f37430OooOOO0;
        if (oooOO1 == null) {
            return 0.0f;
        }
        float f = this.f37427OooOO0O;
        return f == -2.14748365E9f ? oooOO1.f11822OooOO0O : f;
    }

    public final float OooO0o0() {
        com.airbnb.lottie.OooOO0 oooOO1 = this.f37430OooOOO0;
        if (oooOO1 == null) {
            return 0.0f;
        }
        float f = this.f37428OooOO0o;
        return f == 2.14748365E9f ? oooOO1.f11823OooOO0o : f;
    }

    public final boolean OooO0oO() {
        return this.f37423OooO0o < 0.0f;
    }

    @MainThread
    public final void OooO0oo(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.f37429OooOOO = false;
        }
    }

    public final void OooOO0(float f, float f2) {
        if (f > f2) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
        }
        com.airbnb.lottie.OooOO0 oooOO1 = this.f37430OooOOO0;
        float f3 = oooOO1 == null ? -3.4028235E38f : oooOO1.f11822OooOO0O;
        float f4 = oooOO1 == null ? Float.MAX_VALUE : oooOO1.f11823OooOO0o;
        float fOooO0O0 = OooOOO.OooO0O0(f, f3, f4);
        float fOooO0O1 = OooOOO.OooO0O0(f2, f3, f4);
        if (fOooO0O0 == this.f37427OooOO0O && fOooO0O1 == this.f37428OooOO0o) {
            return;
        }
        this.f37427OooOO0O = fOooO0O0;
        this.f37428OooOO0o = fOooO0O1;
        OooO((int) OooOOO.OooO0O0(this.f37422OooO, fOooO0O0, fOooO0O1));
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    @MainThread
    public final void cancel() {
        Iterator it = this.f37420OooO0o0.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        OooO0oo(true);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.f37429OooOOO) {
            OooO0oo(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        com.airbnb.lottie.OooOO0 oooOO1 = this.f37430OooOOO0;
        if (oooOO1 == null || !this.f37429OooOOO) {
            return;
        }
        long j2 = this.f37425OooO0oo;
        float fAbs = (j2 != 0 ? j - j2 : 0L) / ((1.0E9f / oooOO1.f11825OooOOO0) / Math.abs(this.f37423OooO0o));
        float f = this.f37422OooO;
        if (OooO0oO()) {
            fAbs = -fAbs;
        }
        float f2 = f + fAbs;
        this.f37422OooO = f2;
        float fOooO0o = OooO0o();
        float fOooO0o0 = OooO0o0();
        PointF pointF = OooOOO.f37431OooO00o;
        boolean z = !(f2 >= fOooO0o && f2 <= fOooO0o0);
        this.f37422OooO = OooOOO.OooO0O0(this.f37422OooO, OooO0o(), OooO0o0());
        this.f37425OooO0oo = j;
        OooO0Oo();
        if (z) {
            if (getRepeatCount() == -1 || this.f37426OooOO0 < getRepeatCount()) {
                Iterator it = this.f37420OooO0o0.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
                }
                this.f37426OooOO0++;
                if (getRepeatMode() == 2) {
                    this.f37424OooO0oO = !this.f37424OooO0oO;
                    this.f37423OooO0o = -this.f37423OooO0o;
                } else {
                    this.f37422OooO = OooO0oO() ? OooO0o0() : OooO0o();
                }
                this.f37425OooO0oo = j;
            } else {
                this.f37422OooO = this.f37423OooO0o < 0.0f ? OooO0o() : OooO0o0();
                OooO0oo(true);
                OooO0O0(OooO0oO());
            }
        }
        if (this.f37430OooOOO0 != null) {
            float f3 = this.f37422OooO;
            if (f3 < this.f37427OooOO0O || f3 > this.f37428OooOO0o) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f37427OooOO0O), Float.valueOf(this.f37428OooOO0o), Float.valueOf(this.f37422OooO)));
            }
        }
        com.airbnb.lottie.OooO0OO.OooO00o();
    }

    @Override // android.animation.ValueAnimator
    @FloatRange(from = 0.0d, to = 1.0d)
    public final float getAnimatedFraction() {
        float fOooO0o;
        float fOooO0o0;
        float fOooO0o2;
        if (this.f37430OooOOO0 == null) {
            return 0.0f;
        }
        if (OooO0oO()) {
            fOooO0o = OooO0o0() - this.f37422OooO;
            fOooO0o0 = OooO0o0();
            fOooO0o2 = OooO0o();
        } else {
            fOooO0o = this.f37422OooO - OooO0o();
            fOooO0o0 = OooO0o0();
            fOooO0o2 = OooO0o();
        }
        return fOooO0o / (fOooO0o0 - fOooO0o2);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        float f;
        com.airbnb.lottie.OooOO0 oooOO1 = this.f37430OooOOO0;
        if (oooOO1 == null) {
            f = 0.0f;
        } else {
            float f2 = this.f37422OooO;
            float f3 = oooOO1.f11822OooOO0O;
            f = (f2 - f3) / (oooOO1.f11823OooOO0o - f3);
        }
        return Float.valueOf(f);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        com.airbnb.lottie.OooOO0 oooOO1 = this.f37430OooOOO0;
        if (oooOO1 == null) {
            return 0L;
        }
        return (long) oooOO1.OooO0O0();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.f37429OooOOO;
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.f37424OooO0oO) {
            return;
        }
        this.f37424OooO0oO = false;
        this.f37423OooO0o = -this.f37423OooO0o;
    }
}

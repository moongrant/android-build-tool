package p129o00O0oOo;

import android.animation.Animator;
import android.graphics.PointF;
import android.view.Choreographer;
import androidx.annotation.FloatRange;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.airbnb.lottie.OooO0o;
import com.airbnb.lottie.OooOO0O;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class o000O00 extends o000O000 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @Nullable
    public OooOO0O f31137o000oOoO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public float f31130Oooo0oo = 1.0f;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f31129Oooo = false;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public long f31133OoooO00 = 0;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public float f31132OoooO0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f31134OoooO0O = 0;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public float f31131OoooO = -2.14748365E9f;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public float f31135OoooOO0 = 2.14748365E9f;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @VisibleForTesting
    public boolean f31136OoooOOO = false;

    public final float OooO() {
        OooOO0O oooOO0O = this.f31137o000oOoO;
        if (oooOO0O == null) {
            return ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }
        float f = this.f31135OoooOO0;
        return f == 2.14748365E9f ? oooOO0O.f10051OooOO0o : f;
    }

    @MainThread
    public final void OooO0o() {
        OooOOO0();
        OooO0OO(OooOO0O());
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public final float OooO0oO() {
        OooOO0O oooOO0O = this.f31137o000oOoO;
        if (oooOO0O == null) {
            return ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }
        float f = this.f31132OoooO0;
        float f2 = oooOO0O.f10050OooOO0O;
        return (f - f2) / (oooOO0O.f10051OooOO0o - f2);
    }

    public final float OooOO0() {
        OooOO0O oooOO0O = this.f31137o000oOoO;
        if (oooOO0O == null) {
            return ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }
        float f = this.f31131OoooO;
        return f == -2.14748365E9f ? oooOO0O.f10050OooOO0O : f;
    }

    public final boolean OooOO0O() {
        return this.f31130Oooo0oo < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    public final void OooOO0o() {
        if (this.f31136OoooOOO) {
            Choreographer.getInstance().removeFrameCallback(this);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public final void OooOOO(float f) {
        if (this.f31132OoooO0 == f) {
            return;
        }
        this.f31132OoooO0 = o000O0.OooO0O0(f, OooOO0(), OooO());
        this.f31133OoooO00 = 0L;
        OooO0o0();
    }

    @MainThread
    public final void OooOOO0() {
        Choreographer.getInstance().removeFrameCallback(this);
        this.f31136OoooOOO = false;
    }

    public final void OooOOOO(float f, float f2) {
        if (f > f2) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
        }
        OooOO0O oooOO0O = this.f31137o000oOoO;
        float f3 = oooOO0O == null ? -3.4028235E38f : oooOO0O.f10050OooOO0O;
        float f4 = oooOO0O == null ? Float.MAX_VALUE : oooOO0O.f10051OooOO0o;
        float fOooO0O0 = o000O0.OooO0O0(f, f3, f4);
        float fOooO0O1 = o000O0.OooO0O0(f2, f3, f4);
        if (fOooO0O0 == this.f31131OoooO && fOooO0O1 == this.f31135OoooOO0) {
            return;
        }
        this.f31131OoooO = fOooO0O0;
        this.f31135OoooOO0 = fOooO0O1;
        OooOOO((int) o000O0.OooO0O0(this.f31132OoooO0, fOooO0O0, fOooO0O1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set<android.animation.Animator$AnimatorListener>, java.util.concurrent.CopyOnWriteArraySet] */
    @Override // android.animation.ValueAnimator, android.animation.Animator
    @MainThread
    public final void cancel() {
        Iterator it = this.f31139Oooo0oO.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        OooOOO0();
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.Set<android.animation.Animator$AnimatorListener>, java.util.concurrent.CopyOnWriteArraySet] */
    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        OooOO0o();
        OooOO0O oooOO0O = this.f31137o000oOoO;
        if (oooOO0O == null || !this.f31136OoooOOO) {
            return;
        }
        long j2 = this.f31133OoooO00;
        float fAbs = (j2 != 0 ? j - j2 : 0L) / ((1.0E9f / oooOO0O.f10053OooOOO0) / Math.abs(this.f31130Oooo0oo));
        float f = this.f31132OoooO0;
        if (OooOO0O()) {
            fAbs = -fAbs;
        }
        float f2 = f + fAbs;
        this.f31132OoooO0 = f2;
        float fOooOO0 = OooOO0();
        float fOooO = OooO();
        PointF pointF = o000O0.f31128OooO00o;
        boolean z = !(f2 >= fOooOO0 && f2 <= fOooO);
        this.f31132OoooO0 = o000O0.OooO0O0(this.f31132OoooO0, OooOO0(), OooO());
        this.f31133OoooO00 = j;
        OooO0o0();
        if (z) {
            if (getRepeatCount() == -1 || this.f31134OoooO0O < getRepeatCount()) {
                Iterator it = this.f31139Oooo0oO.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
                }
                this.f31134OoooO0O++;
                if (getRepeatMode() == 2) {
                    this.f31129Oooo = !this.f31129Oooo;
                    this.f31130Oooo0oo = -this.f31130Oooo0oo;
                } else {
                    this.f31132OoooO0 = OooOO0O() ? OooO() : OooOO0();
                }
                this.f31133OoooO00 = j;
            } else {
                this.f31132OoooO0 = this.f31130Oooo0oo < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? OooOO0() : OooO();
                OooOOO0();
                OooO0OO(OooOO0O());
            }
        }
        if (this.f31137o000oOoO != null) {
            float f3 = this.f31132OoooO0;
            if (f3 < this.f31131OoooO || f3 > this.f31135OoooOO0) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f31131OoooO), Float.valueOf(this.f31135OoooOO0), Float.valueOf(this.f31132OoooO0)));
            }
        }
        OooO0o.OooO00o();
    }

    @Override // android.animation.ValueAnimator
    @FloatRange(from = 0.0d, to = 1.0d)
    public final float getAnimatedFraction() {
        float fOooOO0;
        float fOooO;
        float fOooOO1;
        if (this.f31137o000oOoO == null) {
            return ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }
        if (OooOO0O()) {
            fOooOO0 = OooO() - this.f31132OoooO0;
            fOooO = OooO();
            fOooOO1 = OooOO0();
        } else {
            fOooOO0 = this.f31132OoooO0 - OooOO0();
            fOooO = OooO();
            fOooOO1 = OooOO0();
        }
        return fOooOO0 / (fOooO - fOooOO1);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(OooO0oO());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        OooOO0O oooOO0O = this.f31137o000oOoO;
        if (oooOO0O == null) {
            return 0L;
        }
        return (long) oooOO0O.OooO0O0();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.f31136OoooOOO;
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.f31129Oooo) {
            return;
        }
        this.f31129Oooo = false;
        this.f31130Oooo0oo = -this.f31130Oooo0oo;
    }
}

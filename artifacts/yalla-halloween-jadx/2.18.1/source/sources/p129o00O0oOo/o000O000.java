package p129o00O0oOo;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public abstract class o000O000 extends ValueAnimator {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Set<ValueAnimator.AnimatorUpdateListener> f31138Oooo0o = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final Set<Animator.AnimatorListener> f31139Oooo0oO = new CopyOnWriteArraySet();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set<android.animation.Animator$AnimatorListener>, java.util.concurrent.CopyOnWriteArraySet] */
    public final void OooO0OO(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.f31139Oooo0oO) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set<android.animation.Animator$AnimatorListener>, java.util.concurrent.CopyOnWriteArraySet] */
    public final void OooO0Oo(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.f31139Oooo0oO) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set<android.animation.ValueAnimator$AnimatorUpdateListener>, java.util.concurrent.CopyOnWriteArraySet] */
    public final void OooO0o0() {
        Iterator it = this.f31138Oooo0o.iterator();
        while (it.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it.next()).onAnimationUpdate(this);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set<android.animation.Animator$AnimatorListener>, java.util.concurrent.CopyOnWriteArraySet] */
    @Override // android.animation.Animator
    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.f31139Oooo0oO.add(animatorListener);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set<android.animation.ValueAnimator$AnimatorUpdateListener>, java.util.concurrent.CopyOnWriteArraySet] */
    @Override // android.animation.ValueAnimator
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f31138Oooo0o.add(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set<android.animation.Animator$AnimatorListener>, java.util.concurrent.CopyOnWriteArraySet] */
    @Override // android.animation.Animator
    public final void removeAllListeners() {
        this.f31139Oooo0oO.clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set<android.animation.ValueAnimator$AnimatorUpdateListener>, java.util.concurrent.CopyOnWriteArraySet] */
    @Override // android.animation.ValueAnimator
    public final void removeAllUpdateListeners() {
        this.f31138Oooo0o.clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set<android.animation.Animator$AnimatorListener>, java.util.concurrent.CopyOnWriteArraySet] */
    @Override // android.animation.Animator
    public final void removeListener(Animator.AnimatorListener animatorListener) {
        this.f31139Oooo0oO.remove(animatorListener);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set<android.animation.ValueAnimator$AnimatorUpdateListener>, java.util.concurrent.CopyOnWriteArraySet] */
    @Override // android.animation.ValueAnimator
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f31138Oooo0o.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ Animator setDuration(long j) {
        setDuration(j);
        throw null;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
}

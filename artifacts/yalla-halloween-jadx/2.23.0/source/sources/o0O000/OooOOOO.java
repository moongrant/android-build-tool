package o0O000;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f41584OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f41585OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final TimeInterpolator f41586OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f41587OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f41588OooO0o0;

    public OooOOOO(long j) {
        this.f41584OooO00o = 0L;
        this.f41585OooO0O0 = 300L;
        this.f41586OooO0OO = null;
        this.f41587OooO0Oo = 0;
        this.f41588OooO0o0 = 1;
        this.f41584OooO00o = j;
        this.f41585OooO0O0 = 150L;
    }

    public final void OooO00o(@NonNull Animator animator) {
        animator.setStartDelay(this.f41584OooO00o);
        animator.setDuration(this.f41585OooO0O0);
        animator.setInterpolator(OooO0O0());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f41587OooO0Oo);
            valueAnimator.setRepeatMode(this.f41588OooO0o0);
        }
    }

    @Nullable
    public final TimeInterpolator OooO0O0() {
        TimeInterpolator timeInterpolator = this.f41586OooO0OO;
        return timeInterpolator != null ? timeInterpolator : OooO0O0.f41572OooO0O0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOOOO)) {
            return false;
        }
        OooOOOO oooOOOO = (OooOOOO) obj;
        if (this.f41584OooO00o == oooOOOO.f41584OooO00o && this.f41585OooO0O0 == oooOOOO.f41585OooO0O0 && this.f41587OooO0Oo == oooOOOO.f41587OooO0Oo && this.f41588OooO0o0 == oooOOOO.f41588OooO0o0) {
            return OooO0O0().getClass().equals(oooOOOO.OooO0O0().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f41584OooO00o;
        long j2 = this.f41585OooO0O0;
        return ((((OooO0O0().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31)) * 31) + this.f41587OooO0Oo) * 31) + this.f41588OooO0o0;
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(OooOOOO.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.f41584OooO00o);
        sb.append(" duration: ");
        sb.append(this.f41585OooO0O0);
        sb.append(" interpolator: ");
        sb.append(OooO0O0().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.f41587OooO0Oo);
        sb.append(" repeatMode: ");
        return p022Oooo00O.OooOO0.OooO0O0(sb, this.f41588OooO0o0, "}\n");
    }

    public OooOOOO(long j, long j2, @NonNull TimeInterpolator timeInterpolator) {
        this.f41584OooO00o = 0L;
        this.f41585OooO0O0 = 300L;
        this.f41586OooO0OO = null;
        this.f41587OooO0Oo = 0;
        this.f41588OooO0o0 = 1;
        this.f41584OooO00o = j;
        this.f41585OooO0O0 = j2;
        this.f41586OooO0OO = timeInterpolator;
    }
}

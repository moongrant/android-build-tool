package o0O000;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f40893OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f40894OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final TimeInterpolator f40895OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f40896OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f40897OooO0o0;

    public OooOOOO(long j) {
        this.f40893OooO00o = 0L;
        this.f40894OooO0O0 = 300L;
        this.f40895OooO0OO = null;
        this.f40896OooO0Oo = 0;
        this.f40897OooO0o0 = 1;
        this.f40893OooO00o = j;
        this.f40894OooO0O0 = 150L;
    }

    public final void OooO00o(@NonNull Animator animator) {
        animator.setStartDelay(this.f40893OooO00o);
        animator.setDuration(this.f40894OooO0O0);
        animator.setInterpolator(OooO0O0());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f40896OooO0Oo);
            valueAnimator.setRepeatMode(this.f40897OooO0o0);
        }
    }

    @Nullable
    public final TimeInterpolator OooO0O0() {
        TimeInterpolator timeInterpolator = this.f40895OooO0OO;
        return timeInterpolator != null ? timeInterpolator : OooO0O0.f40881OooO0O0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOOOO)) {
            return false;
        }
        OooOOOO oooOOOO = (OooOOOO) obj;
        if (this.f40893OooO00o == oooOOOO.f40893OooO00o && this.f40894OooO0O0 == oooOOOO.f40894OooO0O0 && this.f40896OooO0Oo == oooOOOO.f40896OooO0Oo && this.f40897OooO0o0 == oooOOOO.f40897OooO0o0) {
            return OooO0O0().getClass().equals(oooOOOO.OooO0O0().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f40893OooO00o;
        long j2 = this.f40894OooO0O0;
        return ((((OooO0O0().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31)) * 31) + this.f40896OooO0Oo) * 31) + this.f40897OooO0o0;
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(OooOOOO.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.f40893OooO00o);
        sb.append(" duration: ");
        sb.append(this.f40894OooO0O0);
        sb.append(" interpolator: ");
        sb.append(OooO0O0().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.f40896OooO0Oo);
        sb.append(" repeatMode: ");
        return p022Oooo00O.OooOO0.OooO00o(sb, this.f40897OooO0o0, "}\n");
    }

    public OooOOOO(long j, long j2, @NonNull TimeInterpolator timeInterpolator) {
        this.f40893OooO00o = 0L;
        this.f40894OooO0O0 = 300L;
        this.f40895OooO0OO = null;
        this.f40896OooO0Oo = 0;
        this.f40897OooO0o0 = 1;
        this.f40893OooO00o = j;
        this.f40894OooO0O0 = j2;
        this.f40895OooO0OO = timeInterpolator;
    }
}

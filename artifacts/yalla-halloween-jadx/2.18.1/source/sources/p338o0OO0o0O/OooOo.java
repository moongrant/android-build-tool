package p338o0OO0o0O;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import o0O0O00.o0ooOOo;
import p028Oooo0o0.o00O0O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public long f37984OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public long f37985OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public TimeInterpolator f37986OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f37987OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f37988OooO0o0;

    public OooOo(long j) {
        this.f37986OooO0OO = null;
        this.f37987OooO0Oo = 0;
        this.f37988OooO0o0 = 1;
        this.f37984OooO00o = j;
        this.f37985OooO0O0 = 150L;
    }

    public final void OooO00o(@NonNull Animator animator) {
        animator.setStartDelay(this.f37984OooO00o);
        animator.setDuration(this.f37985OooO0O0);
        animator.setInterpolator(OooO0O0());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f37987OooO0Oo);
            valueAnimator.setRepeatMode(this.f37988OooO0o0);
        }
    }

    @Nullable
    public final TimeInterpolator OooO0O0() {
        TimeInterpolator timeInterpolator = this.f37986OooO0OO;
        return timeInterpolator != null ? timeInterpolator : OooO0o.f37973OooO0O0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOo)) {
            return false;
        }
        OooOo oooOo = (OooOo) obj;
        if (this.f37984OooO00o == oooOo.f37984OooO00o && this.f37985OooO0O0 == oooOo.f37985OooO0O0 && this.f37987OooO0Oo == oooOo.f37987OooO0Oo && this.f37988OooO0o0 == oooOo.f37988OooO0o0) {
            return OooO0O0().getClass().equals(oooOo.OooO0O0().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f37984OooO00o;
        long j2 = this.f37985OooO0O0;
        return ((((OooO0O0().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31) + this.f37987OooO0Oo) * 31) + this.f37988OooO0o0;
    }

    @NonNull
    public final String toString() {
        StringBuilder sbOooO00o = o00O0O0O.OooO00o('\n');
        sbOooO00o.append(OooOo.class.getName());
        sbOooO00o.append('{');
        sbOooO00o.append(Integer.toHexString(System.identityHashCode(this)));
        sbOooO00o.append(" delay: ");
        sbOooO00o.append(this.f37984OooO00o);
        sbOooO00o.append(" duration: ");
        sbOooO00o.append(this.f37985OooO0O0);
        sbOooO00o.append(" interpolator: ");
        sbOooO00o.append(OooO0O0().getClass());
        sbOooO00o.append(" repeatCount: ");
        sbOooO00o.append(this.f37987OooO0Oo);
        sbOooO00o.append(" repeatMode: ");
        return o0ooOOo.OooO00o(sbOooO00o, this.f37988OooO0o0, "}\n");
    }

    public OooOo(long j, long j2, @NonNull TimeInterpolator timeInterpolator) {
        this.f37987OooO0Oo = 0;
        this.f37988OooO0o0 = 1;
        this.f37984OooO00o = j;
        this.f37985OooO0O0 = j2;
        this.f37986OooO0OO = timeInterpolator;
    }
}

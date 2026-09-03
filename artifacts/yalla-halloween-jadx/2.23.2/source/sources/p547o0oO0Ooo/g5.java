package p547o0oO0Ooo;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import com.google.android.material.progressindicator.BaseProgressIndicator;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import java.util.Arrays;
import o00O00OO.OooO0OO;
import p272o0O0000o.o000000;
import p274o0O000oo.OooOOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class g5 extends z4<ObjectAnimator> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f55797OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ObjectAnimator f55798OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Interpolator[] f55799OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ObjectAnimator f55800OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final LinearProgressIndicatorSpec f55801OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f55802OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f55803OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public OooO0OO f55804OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final int[] f55794OooOO0o = {533, 567, 850, 750};

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final int[] f55796OooOOO0 = {1267, 1000, 333, 0};

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final OooO00o f55795OooOOO = new OooO00o();

    public class OooO00o extends Property<g5, Float> {
        public OooO00o() {
            super(Float.class, "animationFraction");
        }

        @Override // android.util.Property
        public final Float get(g5 g5Var) {
            return Float.valueOf(g5Var.f55803OooOO0);
        }

        @Override // android.util.Property
        public final void set(g5 g5Var, Float f) {
            g5 g5Var2 = g5Var;
            float fFloatValue = f.floatValue();
            g5Var2.f55803OooOO0 = fFloatValue;
            int i = (int) (fFloatValue * 1800.0f);
            for (int i2 = 0; i2 < 4; i2++) {
                g5Var2.f55852OooO0O0[i2] = Math.max(0.0f, Math.min(1.0f, g5Var2.f55799OooO0o[i2].getInterpolation((i - g5.f55796OooOOO0[i2]) / g5.f55794OooOO0o[i2])));
            }
            if (g5Var2.f55797OooO) {
                Arrays.fill(g5Var2.f55853OooO0OO, OooOOO0.OooO00o(g5Var2.f55801OooO0oO.f55807OooO0OO[g5Var2.f55802OooO0oo], g5Var2.f55851OooO00o.f55848OooOOO0));
                g5Var2.f55797OooO = false;
            }
            g5Var2.f55851OooO00o.invalidateSelf();
        }
    }

    public g5(@NonNull Context context, @NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(2);
        this.f55802OooO0oo = 0;
        this.f55804OooOO0O = null;
        this.f55801OooO0oO = linearProgressIndicatorSpec;
        this.f55799OooO0o = new Interpolator[]{AnimationUtils.loadInterpolator(context, o000000.linear_indeterminate_line1_head_interpolator), AnimationUtils.loadInterpolator(context, o000000.linear_indeterminate_line1_tail_interpolator), AnimationUtils.loadInterpolator(context, o000000.linear_indeterminate_line2_head_interpolator), AnimationUtils.loadInterpolator(context, o000000.linear_indeterminate_line2_tail_interpolator)};
    }

    @Override // p547o0oO0Ooo.z4
    public final void OooO00o() {
        ObjectAnimator objectAnimator = this.f55798OooO0Oo;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // p547o0oO0Ooo.z4
    public final void OooO0O0() {
        this.f55802OooO0oo = 0;
        int iOooO00o = OooOOO0.OooO00o(this.f55801OooO0oO.f55807OooO0OO[0], this.f55851OooO00o.f55848OooOOO0);
        int[] iArr = this.f55853OooO0OO;
        iArr[0] = iOooO00o;
        iArr[1] = iOooO00o;
    }

    @Override // p547o0oO0Ooo.z4
    public final void OooO0OO(@NonNull BaseProgressIndicator.OooO0OO oooO0OO) {
        this.f55804OooOO0O = oooO0OO;
    }

    @Override // p547o0oO0Ooo.z4
    public final void OooO0Oo() {
        ObjectAnimator objectAnimator = this.f55800OooO0o0;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        OooO00o();
        if (this.f55851OooO00o.isVisible()) {
            this.f55800OooO0o0.setFloatValues(this.f55803OooOO0, 1.0f);
            this.f55800OooO0o0.setDuration((long) ((1.0f - this.f55803OooOO0) * 1800.0f));
            this.f55800OooO0o0.start();
        }
    }

    @Override // p547o0oO0Ooo.z4
    public final void OooO0o() {
        this.f55804OooOO0O = null;
    }

    @Override // p547o0oO0Ooo.z4
    public final void OooO0o0() {
        ObjectAnimator objectAnimator = this.f55798OooO0Oo;
        OooO00o oooO00o = f55795OooOOO;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, oooO00o, 0.0f, 1.0f);
            this.f55798OooO0Oo = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(1800L);
            this.f55798OooO0Oo.setInterpolator(null);
            this.f55798OooO0Oo.setRepeatCount(-1);
            this.f55798OooO0Oo.addListener(new e5(this));
        }
        if (this.f55800OooO0o0 == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, oooO00o, 1.0f);
            this.f55800OooO0o0 = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(1800L);
            this.f55800OooO0o0.setInterpolator(null);
            this.f55800OooO0o0.addListener(new f5(this));
        }
        this.f55802OooO0oo = 0;
        int iOooO00o = OooOOO0.OooO00o(this.f55801OooO0oO.f55807OooO0OO[0], this.f55851OooO00o.f55848OooOOO0);
        int[] iArr = this.f55853OooO0OO;
        iArr[0] = iOooO00o;
        iArr[1] = iOooO00o;
        this.f55798OooO0Oo.start();
    }
}

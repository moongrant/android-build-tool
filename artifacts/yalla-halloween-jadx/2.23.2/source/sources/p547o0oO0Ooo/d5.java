package p547o0oO0Ooo;

import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.progressindicator.BaseProgressIndicator;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import java.util.Arrays;
import p064o0000oO0.OooOO0;
import p274o0O000oo.OooOOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class d5 extends z4<ObjectAnimator> {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final OooO00o f55785OooOO0 = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f55786OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ObjectAnimator f55787OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final LinearProgressIndicatorSpec f55788OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooOO0 f55789OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f55790OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f55791OooO0oo;

    public class OooO00o extends Property<d5, Float> {
        public OooO00o() {
            super(Float.class, "animationFraction");
        }

        @Override // android.util.Property
        public final Float get(d5 d5Var) {
            return Float.valueOf(d5Var.f55786OooO);
        }

        @Override // android.util.Property
        public final void set(d5 d5Var, Float f) {
            d5 d5Var2 = d5Var;
            float fFloatValue = f.floatValue();
            d5Var2.f55786OooO = fFloatValue;
            float[] fArr = d5Var2.f55852OooO0O0;
            fArr[0] = 0.0f;
            float f2 = (((int) (fFloatValue * 333.0f)) - 0) / 667;
            OooOO0 oooOO1 = d5Var2.f55789OooO0o0;
            float interpolation = oooOO1.getInterpolation(f2);
            fArr[2] = interpolation;
            fArr[1] = interpolation;
            float interpolation2 = oooOO1.getInterpolation(f2 + 0.49925038f);
            fArr[4] = interpolation2;
            fArr[3] = interpolation2;
            fArr[5] = 1.0f;
            if (d5Var2.f55791OooO0oo && interpolation2 < 1.0f) {
                int[] iArr = d5Var2.f55853OooO0OO;
                iArr[2] = iArr[1];
                iArr[1] = iArr[0];
                iArr[0] = OooOOO0.OooO00o(d5Var2.f55788OooO0o.f55807OooO0OO[d5Var2.f55790OooO0oO], d5Var2.f55851OooO00o.f55848OooOOO0);
                d5Var2.f55791OooO0oo = false;
            }
            d5Var2.f55851OooO00o.invalidateSelf();
        }
    }

    public d5(@NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(3);
        this.f55790OooO0oO = 1;
        this.f55788OooO0o = linearProgressIndicatorSpec;
        this.f55789OooO0o0 = new OooOO0();
    }

    @Override // p547o0oO0Ooo.z4
    public final void OooO00o() {
        ObjectAnimator objectAnimator = this.f55787OooO0Oo;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // p547o0oO0Ooo.z4
    public final void OooO0O0() {
        this.f55791OooO0oo = true;
        this.f55790OooO0oO = 1;
        Arrays.fill(this.f55853OooO0OO, OooOOO0.OooO00o(this.f55788OooO0o.f55807OooO0OO[0], this.f55851OooO00o.f55848OooOOO0));
    }

    @Override // p547o0oO0Ooo.z4
    public final void OooO0OO(@Nullable BaseProgressIndicator.OooO0OO oooO0OO) {
    }

    @Override // p547o0oO0Ooo.z4
    public final void OooO0Oo() {
    }

    @Override // p547o0oO0Ooo.z4
    public final void OooO0o() {
    }

    @Override // p547o0oO0Ooo.z4
    public final void OooO0o0() {
        if (this.f55787OooO0Oo == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f55785OooOO0, 0.0f, 1.0f);
            this.f55787OooO0Oo = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(333L);
            this.f55787OooO0Oo.setInterpolator(null);
            this.f55787OooO0Oo.setRepeatCount(-1);
            this.f55787OooO0Oo.addListener(new c5(this));
        }
        this.f55791OooO0oo = true;
        this.f55790OooO0oO = 1;
        Arrays.fill(this.f55853OooO0OO, OooOOO0.OooO00o(this.f55788OooO0o.f55807OooO0OO[0], this.f55851OooO00o.f55848OooOOO0));
        this.f55787OooO0Oo.start();
    }
}

package p547o0oO0Ooo;

import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.annotation.NonNull;
import com.google.android.material.progressindicator.BaseProgressIndicator;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import o00O00OO.OooO0OO;
import o0O000.OooO0o;
import p064o0000oO0.OooOO0;
import p274o0O000oo.OooOOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class t4 extends z4<ObjectAnimator> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f55822OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ObjectAnimator f55823OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooOO0 f55824OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ObjectAnimator f55825OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final CircularProgressIndicatorSpec f55826OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f55827OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f55828OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public OooO0OO f55829OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final int[] f55817OooOO0o = {0, 1350, 2700, 4050};

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final int[] f55819OooOOO0 = {667, 2017, 3367, 4717};

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final int[] f55818OooOOO = {1000, 2350, 3700, 5050};

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final OooO00o f55820OooOOOO = new OooO00o();

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final OooO0O0 f55821OooOOOo = new OooO0O0();

    public class OooO00o extends Property<t4, Float> {
        public OooO00o() {
            super(Float.class, "animationFraction");
        }

        @Override // android.util.Property
        public final Float get(t4 t4Var) {
            return Float.valueOf(t4Var.f55822OooO);
        }

        @Override // android.util.Property
        public final void set(t4 t4Var, Float f) {
            OooOO0 oooOO1;
            t4 t4Var2 = t4Var;
            float fFloatValue = f.floatValue();
            t4Var2.f55822OooO = fFloatValue;
            int i = (int) (5400.0f * fFloatValue);
            float f2 = fFloatValue * 1520.0f;
            float[] fArr = t4Var2.f55852OooO0O0;
            fArr[0] = (-20.0f) + f2;
            fArr[1] = f2;
            int i2 = 0;
            while (true) {
                oooOO1 = t4Var2.f55824OooO0o;
                if (i2 >= 4) {
                    break;
                }
                float f3 = 667;
                fArr[1] = (oooOO1.getInterpolation((i - t4.f55817OooOO0o[i2]) / f3) * 250.0f) + fArr[1];
                fArr[0] = (oooOO1.getInterpolation((i - t4.f55819OooOOO0[i2]) / f3) * 250.0f) + fArr[0];
                i2++;
            }
            float f4 = fArr[0];
            float f5 = fArr[1];
            float f6 = ((f5 - f4) * t4Var2.f55828OooOO0) + f4;
            fArr[0] = f6;
            fArr[0] = f6 / 360.0f;
            fArr[1] = f5 / 360.0f;
            for (int i3 = 0; i3 < 4; i3++) {
                float f7 = (i - t4.f55818OooOOO[i3]) / 333;
                if (f7 >= 0.0f && f7 <= 1.0f) {
                    int i4 = i3 + t4Var2.f55827OooO0oo;
                    CircularProgressIndicatorSpec circularProgressIndicatorSpec = t4Var2.f55826OooO0oO;
                    int[] iArr = circularProgressIndicatorSpec.f55807OooO0OO;
                    int length = i4 % iArr.length;
                    t4Var2.f55853OooO0OO[0] = OooO0o.OooO00o(oooOO1.getInterpolation(f7), Integer.valueOf(OooOOO0.OooO00o(iArr[length], t4Var2.f55851OooO00o.f55848OooOOO0)), Integer.valueOf(OooOOO0.OooO00o(circularProgressIndicatorSpec.f55807OooO0OO[(length + 1) % iArr.length], t4Var2.f55851OooO00o.f55848OooOOO0))).intValue();
                    break;
                }
            }
            t4Var2.f55851OooO00o.invalidateSelf();
        }
    }

    public class OooO0O0 extends Property<t4, Float> {
        public OooO0O0() {
            super(Float.class, "completeEndFraction");
        }

        @Override // android.util.Property
        public final Float get(t4 t4Var) {
            return Float.valueOf(t4Var.f55828OooOO0);
        }

        @Override // android.util.Property
        public final void set(t4 t4Var, Float f) {
            t4Var.f55828OooOO0 = f.floatValue();
        }
    }

    public t4(@NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(1);
        this.f55827OooO0oo = 0;
        this.f55829OooOO0O = null;
        this.f55826OooO0oO = circularProgressIndicatorSpec;
        this.f55824OooO0o = new OooOO0();
    }

    @Override // p547o0oO0Ooo.z4
    public final void OooO00o() {
        ObjectAnimator objectAnimator = this.f55823OooO0Oo;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // p547o0oO0Ooo.z4
    public final void OooO0O0() {
        this.f55827OooO0oo = 0;
        this.f55853OooO0OO[0] = OooOOO0.OooO00o(this.f55826OooO0oO.f55807OooO0OO[0], this.f55851OooO00o.f55848OooOOO0);
        this.f55828OooOO0 = 0.0f;
    }

    @Override // p547o0oO0Ooo.z4
    public final void OooO0OO(@NonNull BaseProgressIndicator.OooO0OO oooO0OO) {
        this.f55829OooOO0O = oooO0OO;
    }

    @Override // p547o0oO0Ooo.z4
    public final void OooO0Oo() {
        ObjectAnimator objectAnimator = this.f55825OooO0o0;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.f55851OooO00o.isVisible()) {
            this.f55825OooO0o0.start();
        } else {
            OooO00o();
        }
    }

    @Override // p547o0oO0Ooo.z4
    public final void OooO0o() {
        this.f55829OooOO0O = null;
    }

    @Override // p547o0oO0Ooo.z4
    public final void OooO0o0() {
        if (this.f55823OooO0Oo == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f55820OooOOOO, 0.0f, 1.0f);
            this.f55823OooO0Oo = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(5400L);
            this.f55823OooO0Oo.setInterpolator(null);
            this.f55823OooO0Oo.setRepeatCount(-1);
            this.f55823OooO0Oo.addListener(new r4(this));
        }
        if (this.f55825OooO0o0 == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f55821OooOOOo, 0.0f, 1.0f);
            this.f55825OooO0o0 = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(333L);
            this.f55825OooO0o0.setInterpolator(this.f55824OooO0o);
            this.f55825OooO0o0.addListener(new s4(this));
        }
        this.f55827OooO0oo = 0;
        this.f55853OooO0OO[0] = OooOOO0.OooO00o(this.f55826OooO0oO.f55807OooO0OO[0], this.f55851OooO00o.f55848OooOOO0);
        this.f55828OooOO0 = 0.0f;
        this.f55823OooO0Oo.start();
    }
}

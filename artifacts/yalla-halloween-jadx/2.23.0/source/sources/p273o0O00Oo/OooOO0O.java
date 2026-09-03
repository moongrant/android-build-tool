package p273o0O00Oo;

import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.annotation.NonNull;
import com.google.android.material.progressindicator.BaseProgressIndicator;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import o0O000.OooO0o;
import p064o0000oO0.OooOO0;
import p079o000Oo0o.o000OO00;
import p272o0O000oo.OooOOO;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0O extends Oooo000<ObjectAnimator> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f41717OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ObjectAnimator f41718OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooOO0 f41719OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ObjectAnimator f41720OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final CircularProgressIndicatorSpec f41721OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f41722OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f41723OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public o000OO00 f41724OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final int[] f41712OooOO0o = {0, 1350, 2700, 4050};

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final int[] f41714OooOOO0 = {667, 2017, 3367, 4717};

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final int[] f41713OooOOO = {1000, 2350, 3700, 5050};

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final OooO00o f41715OooOOOO = new OooO00o();

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final OooO0O0 f41716OooOOOo = new OooO0O0();

    public class OooO00o extends Property<OooOO0O, Float> {
        public OooO00o() {
            super(Float.class, "animationFraction");
        }

        @Override // android.util.Property
        public final Float get(OooOO0O oooOO0O) {
            return Float.valueOf(oooOO0O.f41717OooO);
        }

        @Override // android.util.Property
        public final void set(OooOO0O oooOO0O, Float f) {
            OooOO0 oooOO1;
            OooOO0O oooOO0O2 = oooOO0O;
            float fFloatValue = f.floatValue();
            oooOO0O2.f41717OooO = fFloatValue;
            int i = (int) (5400.0f * fFloatValue);
            float f2 = fFloatValue * 1520.0f;
            float[] fArr = oooOO0O2.f41749OooO0O0;
            fArr[0] = (-20.0f) + f2;
            fArr[1] = f2;
            int i2 = 0;
            while (true) {
                oooOO1 = oooOO0O2.f41719OooO0o;
                if (i2 >= 4) {
                    break;
                }
                float f3 = 667;
                fArr[1] = (oooOO1.getInterpolation((i - OooOO0O.f41712OooOO0o[i2]) / f3) * 250.0f) + fArr[1];
                fArr[0] = (oooOO1.getInterpolation((i - OooOO0O.f41714OooOOO0[i2]) / f3) * 250.0f) + fArr[0];
                i2++;
            }
            float f4 = fArr[0];
            float f5 = fArr[1];
            float f6 = ((f5 - f4) * oooOO0O2.f41723OooOO0) + f4;
            fArr[0] = f6;
            fArr[0] = f6 / 360.0f;
            fArr[1] = f5 / 360.0f;
            for (int i3 = 0; i3 < 4; i3++) {
                float f7 = (i - OooOO0O.f41713OooOOO[i3]) / 333;
                if (f7 >= 0.0f && f7 <= 1.0f) {
                    int i4 = i3 + oooOO0O2.f41722OooO0oo;
                    CircularProgressIndicatorSpec circularProgressIndicatorSpec = oooOO0O2.f41721OooO0oO;
                    int[] iArr = circularProgressIndicatorSpec.f41703OooO0OO;
                    int length = i4 % iArr.length;
                    oooOO0O2.f41750OooO0OO[0] = OooO0o.OooO00o(oooOO1.getInterpolation(f7), Integer.valueOf(OooOOO.OooO00o(iArr[length], oooOO0O2.f41748OooO00o.f41745OooOOO0)), Integer.valueOf(OooOOO.OooO00o(circularProgressIndicatorSpec.f41703OooO0OO[(length + 1) % iArr.length], oooOO0O2.f41748OooO00o.f41745OooOOO0))).intValue();
                    break;
                }
            }
            oooOO0O2.f41748OooO00o.invalidateSelf();
        }
    }

    public class OooO0O0 extends Property<OooOO0O, Float> {
        public OooO0O0() {
            super(Float.class, "completeEndFraction");
        }

        @Override // android.util.Property
        public final Float get(OooOO0O oooOO0O) {
            return Float.valueOf(oooOO0O.f41723OooOO0);
        }

        @Override // android.util.Property
        public final void set(OooOO0O oooOO0O, Float f) {
            oooOO0O.f41723OooOO0 = f.floatValue();
        }
    }

    public OooOO0O(@NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(1);
        this.f41722OooO0oo = 0;
        this.f41724OooOO0O = null;
        this.f41721OooO0oO = circularProgressIndicatorSpec;
        this.f41719OooO0o = new OooOO0();
    }

    @Override // p273o0O00Oo.Oooo000
    public final void OooO00o() {
        ObjectAnimator objectAnimator = this.f41718OooO0Oo;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // p273o0O00Oo.Oooo000
    public final void OooO0O0() {
        this.f41722OooO0oo = 0;
        this.f41750OooO0OO[0] = OooOOO.OooO00o(this.f41721OooO0oO.f41703OooO0OO[0], this.f41748OooO00o.f41745OooOOO0);
        this.f41723OooOO0 = 0.0f;
    }

    @Override // p273o0O00Oo.Oooo000
    public final void OooO0OO(@NonNull BaseProgressIndicator.OooO0OO oooO0OO) {
        this.f41724OooOO0O = oooO0OO;
    }

    @Override // p273o0O00Oo.Oooo000
    public final void OooO0Oo() {
        ObjectAnimator objectAnimator = this.f41720OooO0o0;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.f41748OooO00o.isVisible()) {
            this.f41720OooO0o0.start();
        } else {
            OooO00o();
        }
    }

    @Override // p273o0O00Oo.Oooo000
    public final void OooO0o() {
        this.f41724OooOO0O = null;
    }

    @Override // p273o0O00Oo.Oooo000
    public final void OooO0o0() {
        if (this.f41718OooO0Oo == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f41715OooOOOO, 0.0f, 1.0f);
            this.f41718OooO0Oo = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(5400L);
            this.f41718OooO0Oo.setInterpolator(null);
            this.f41718OooO0Oo.setRepeatCount(-1);
            this.f41718OooO0Oo.addListener(new OooO(this));
        }
        if (this.f41720OooO0o0 == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f41716OooOOOo, 0.0f, 1.0f);
            this.f41720OooO0o0 = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(333L);
            this.f41720OooO0o0.setInterpolator(this.f41719OooO0o);
            this.f41720OooO0o0.addListener(new OooOO0(this));
        }
        this.f41722OooO0oo = 0;
        this.f41750OooO0OO[0] = OooOOO.OooO00o(this.f41721OooO0oO.f41703OooO0OO[0], this.f41748OooO00o.f41745OooOOO0);
        this.f41723OooOO0 = 0.0f;
        this.f41718OooO0Oo.start();
    }
}

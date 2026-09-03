package o0OOO0O0;

import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import p394o0OOoooO.o0O0000O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 extends OooOo<ObjectAnimator> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f38068OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ObjectAnimator f38069OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final p077o000Oo.OooO0OO f38070OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ObjectAnimator f38071OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final CircularProgressIndicatorSpec f38072OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f38073OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f38074OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public p103o000oo00.OooOO0O f38075OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final int[] f38063OooOO0o = {0, 1350, 2700, 4050};

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final int[] f38065OooOOO0 = {667, 2017, 3367, 4717};

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final int[] f38064OooOOO = {1000, 2350, 3700, 5050};

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final Property<OooOO0, Float> f38066OooOOOO = new OooO00o();

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final Property<OooOO0, Float> f38067OooOOOo = new OooO0O0();

    public class OooO00o extends Property<OooOO0, Float> {
        public OooO00o() {
            super(Float.class, "animationFraction");
        }

        @Override // android.util.Property
        public final Float get(OooOO0 oooOO1) {
            return Float.valueOf(oooOO1.f38068OooO);
        }

        @Override // android.util.Property
        public final void set(OooOO0 oooOO1, Float f) {
            OooOO0 oooOO2 = oooOO1;
            float fFloatValue = f.floatValue();
            oooOO2.f38068OooO = fFloatValue;
            int i = (int) (5400.0f * fFloatValue);
            float[] fArr = oooOO2.f38096OooO0O0;
            float f2 = fFloatValue * 1520.0f;
            fArr[0] = (-20.0f) + f2;
            fArr[1] = f2;
            for (int i2 = 0; i2 < 4; i2++) {
                float f3 = 667;
                float f4 = (i - OooOO0.f38063OooOO0o[i2]) / f3;
                float[] fArr2 = oooOO2.f38096OooO0O0;
                fArr2[1] = (oooOO2.f38070OooO0o.getInterpolation(f4) * 250.0f) + fArr2[1];
                float f5 = (i - OooOO0.f38065OooOOO0[i2]) / f3;
                float[] fArr3 = oooOO2.f38096OooO0O0;
                fArr3[0] = (oooOO2.f38070OooO0o.getInterpolation(f5) * 250.0f) + fArr3[0];
            }
            float[] fArr4 = oooOO2.f38096OooO0O0;
            fArr4[0] = ((fArr4[1] - fArr4[0]) * oooOO2.f38074OooOO0) + fArr4[0];
            fArr4[0] = fArr4[0] / 360.0f;
            fArr4[1] = fArr4[1] / 360.0f;
            for (int i3 = 0; i3 < 4; i3++) {
                float f6 = (i - OooOO0.f38064OooOOO[i3]) / 333;
                if (f6 >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && f6 <= 1.0f) {
                    int i4 = i3 + oooOO2.f38073OooO0oo;
                    int[] iArr = oooOO2.f38072OooO0oO.f38054OooO0OO;
                    int length = i4 % iArr.length;
                    int length2 = (length + 1) % iArr.length;
                    oooOO2.f38097OooO0OO[0] = p338o0OO0o0O.OooOO0.f37977OooO00o.evaluate(oooOO2.f38070OooO0o.getInterpolation(f6), Integer.valueOf(o0O0000O.OooO00o(iArr[length], oooOO2.f38095OooO00o.f38094o000oOoO)), Integer.valueOf(o0O0000O.OooO00o(oooOO2.f38072OooO0oO.f38054OooO0OO[length2], oooOO2.f38095OooO00o.f38094o000oOoO))).intValue();
                    break;
                }
            }
            oooOO2.f38095OooO00o.invalidateSelf();
        }
    }

    public class OooO0O0 extends Property<OooOO0, Float> {
        public OooO0O0() {
            super(Float.class, "completeEndFraction");
        }

        @Override // android.util.Property
        public final Float get(OooOO0 oooOO1) {
            return Float.valueOf(oooOO1.f38074OooOO0);
        }

        @Override // android.util.Property
        public final void set(OooOO0 oooOO1, Float f) {
            oooOO1.f38074OooOO0 = f.floatValue();
        }
    }

    public OooOO0(@NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(1);
        this.f38073OooO0oo = 0;
        this.f38075OooOO0O = null;
        this.f38072OooO0oO = circularProgressIndicatorSpec;
        this.f38070OooO0o = new p077o000Oo.OooO0OO();
    }

    @Override // o0OOO0O0.OooOo
    public final void OooO00o() {
        ObjectAnimator objectAnimator = this.f38069OooO0Oo;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // o0OOO0O0.OooOo
    public final void OooO0O0() {
        OooO0oO();
    }

    @Override // o0OOO0O0.OooOo
    public final void OooO0OO(@NonNull p103o000oo00.OooOO0O oooOO0O) {
        this.f38075OooOO0O = oooOO0O;
    }

    @Override // o0OOO0O0.OooOo
    public final void OooO0Oo() {
        ObjectAnimator objectAnimator = this.f38071OooO0o0;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.f38095OooO00o.isVisible()) {
            this.f38071OooO0o0.start();
        } else {
            OooO00o();
        }
    }

    @Override // o0OOO0O0.OooOo
    public final void OooO0o() {
        this.f38075OooOO0O = null;
    }

    @Override // o0OOO0O0.OooOo
    public final void OooO0o0() {
        if (this.f38069OooO0Oo == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f38066OooOOOO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f);
            this.f38069OooO0Oo = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(5400L);
            this.f38069OooO0Oo.setInterpolator(null);
            this.f38069OooO0Oo.setRepeatCount(-1);
            this.f38069OooO0Oo.addListener(new OooO0o(this));
        }
        if (this.f38071OooO0o0 == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f38067OooOOOo, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f);
            this.f38071OooO0o0 = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(333L);
            this.f38071OooO0o0.setInterpolator(this.f38070OooO0o);
            this.f38071OooO0o0.addListener(new OooO(this));
        }
        OooO0oO();
        this.f38069OooO0Oo.start();
    }

    @VisibleForTesting
    public final void OooO0oO() {
        this.f38073OooO0oo = 0;
        this.f38097OooO0OO[0] = o0O0000O.OooO00o(this.f38072OooO0oO.f38054OooO0OO[0], this.f38095OooO00o.f38094o000oOoO);
        this.f38074OooOO0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }
}

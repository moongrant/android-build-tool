package p273o0O00Oo;

import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.progressindicator.BaseProgressIndicator;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import java.util.Arrays;
import p064o0000oO0.OooOO0;
import p272o0O000oo.OooOOO;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0O extends Oooo000<ObjectAnimator> {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final OooO00o f41755OooOO0 = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f41756OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ObjectAnimator f41757OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final LinearProgressIndicatorSpec f41758OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooOO0 f41759OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f41760OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f41761OooO0oo;

    public class OooO00o extends Property<o00O0O, Float> {
        public OooO00o() {
            super(Float.class, "animationFraction");
        }

        @Override // android.util.Property
        public final Float get(o00O0O o00o0o2) {
            return Float.valueOf(o00o0o2.f41756OooO);
        }

        @Override // android.util.Property
        public final void set(o00O0O o00o0o2, Float f) {
            o00O0O o00o0o3 = o00o0o2;
            float fFloatValue = f.floatValue();
            o00o0o3.f41756OooO = fFloatValue;
            float[] fArr = o00o0o3.f41749OooO0O0;
            fArr[0] = 0.0f;
            float f2 = (((int) (fFloatValue * 333.0f)) - 0) / 667;
            OooOO0 oooOO1 = o00o0o3.f41759OooO0o0;
            float interpolation = oooOO1.getInterpolation(f2);
            fArr[2] = interpolation;
            fArr[1] = interpolation;
            float interpolation2 = oooOO1.getInterpolation(f2 + 0.49925038f);
            fArr[4] = interpolation2;
            fArr[3] = interpolation2;
            fArr[5] = 1.0f;
            if (o00o0o3.f41761OooO0oo && interpolation2 < 1.0f) {
                int[] iArr = o00o0o3.f41750OooO0OO;
                iArr[2] = iArr[1];
                iArr[1] = iArr[0];
                iArr[0] = OooOOO.OooO00o(o00o0o3.f41758OooO0o.f41703OooO0OO[o00o0o3.f41760OooO0oO], o00o0o3.f41748OooO00o.f41745OooOOO0);
                o00o0o3.f41761OooO0oo = false;
            }
            o00o0o3.f41748OooO00o.invalidateSelf();
        }
    }

    public o00O0O(@NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(3);
        this.f41760OooO0oO = 1;
        this.f41758OooO0o = linearProgressIndicatorSpec;
        this.f41759OooO0o0 = new OooOO0();
    }

    @Override // p273o0O00Oo.Oooo000
    public final void OooO00o() {
        ObjectAnimator objectAnimator = this.f41757OooO0Oo;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // p273o0O00Oo.Oooo000
    public final void OooO0O0() {
        this.f41761OooO0oo = true;
        this.f41760OooO0oO = 1;
        Arrays.fill(this.f41750OooO0OO, OooOOO.OooO00o(this.f41758OooO0o.f41703OooO0OO[0], this.f41748OooO00o.f41745OooOOO0));
    }

    @Override // p273o0O00Oo.Oooo000
    public final void OooO0OO(@Nullable BaseProgressIndicator.OooO0OO oooO0OO) {
    }

    @Override // p273o0O00Oo.Oooo000
    public final void OooO0Oo() {
    }

    @Override // p273o0O00Oo.Oooo000
    public final void OooO0o() {
    }

    @Override // p273o0O00Oo.Oooo000
    public final void OooO0o0() {
        if (this.f41757OooO0Oo == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f41755OooOO0, 0.0f, 1.0f);
            this.f41757OooO0Oo = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(333L);
            this.f41757OooO0Oo.setInterpolator(null);
            this.f41757OooO0Oo.setRepeatCount(-1);
            this.f41757OooO0Oo.addListener(new o0OoOo0(this));
        }
        this.f41761OooO0oo = true;
        this.f41760OooO0oO = 1;
        Arrays.fill(this.f41750OooO0OO, OooOOO.OooO00o(this.f41758OooO0o.f41703OooO0OO[0], this.f41748OooO00o.f41745OooOOO0));
        this.f41757OooO0Oo.start();
    }
}

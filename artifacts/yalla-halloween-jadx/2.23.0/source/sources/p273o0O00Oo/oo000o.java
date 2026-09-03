package p273o0O00Oo;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import com.google.android.material.progressindicator.BaseProgressIndicator;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import java.util.Arrays;
import p079o000Oo0o.o000OO00;
import p270o0O0000o.o000000;
import p272o0O000oo.OooOOO;

/* JADX INFO: loaded from: classes3.dex */
public final class oo000o extends Oooo000<ObjectAnimator> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f41768OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ObjectAnimator f41769OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Interpolator[] f41770OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ObjectAnimator f41771OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final LinearProgressIndicatorSpec f41772OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f41773OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f41774OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public o000OO00 f41775OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final int[] f41765OooOO0o = {533, 567, 850, 750};

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final int[] f41767OooOOO0 = {1267, 1000, 333, 0};

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final OooO00o f41766OooOOO = new OooO00o();

    public class OooO00o extends Property<oo000o, Float> {
        public OooO00o() {
            super(Float.class, "animationFraction");
        }

        @Override // android.util.Property
        public final Float get(oo000o oo000oVar) {
            return Float.valueOf(oo000oVar.f41774OooOO0);
        }

        @Override // android.util.Property
        public final void set(oo000o oo000oVar, Float f) {
            oo000o oo000oVar2 = oo000oVar;
            float fFloatValue = f.floatValue();
            oo000oVar2.f41774OooOO0 = fFloatValue;
            int i = (int) (fFloatValue * 1800.0f);
            for (int i2 = 0; i2 < 4; i2++) {
                oo000oVar2.f41749OooO0O0[i2] = Math.max(0.0f, Math.min(1.0f, oo000oVar2.f41770OooO0o[i2].getInterpolation((i - oo000o.f41767OooOOO0[i2]) / oo000o.f41765OooOO0o[i2])));
            }
            if (oo000oVar2.f41768OooO) {
                Arrays.fill(oo000oVar2.f41750OooO0OO, OooOOO.OooO00o(oo000oVar2.f41772OooO0oO.f41703OooO0OO[oo000oVar2.f41773OooO0oo], oo000oVar2.f41748OooO00o.f41745OooOOO0));
                oo000oVar2.f41768OooO = false;
            }
            oo000oVar2.f41748OooO00o.invalidateSelf();
        }
    }

    public oo000o(@NonNull Context context, @NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(2);
        this.f41773OooO0oo = 0;
        this.f41775OooOO0O = null;
        this.f41772OooO0oO = linearProgressIndicatorSpec;
        this.f41770OooO0o = new Interpolator[]{AnimationUtils.loadInterpolator(context, o000000.linear_indeterminate_line1_head_interpolator), AnimationUtils.loadInterpolator(context, o000000.linear_indeterminate_line1_tail_interpolator), AnimationUtils.loadInterpolator(context, o000000.linear_indeterminate_line2_head_interpolator), AnimationUtils.loadInterpolator(context, o000000.linear_indeterminate_line2_tail_interpolator)};
    }

    @Override // p273o0O00Oo.Oooo000
    public final void OooO00o() {
        ObjectAnimator objectAnimator = this.f41769OooO0Oo;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // p273o0O00Oo.Oooo000
    public final void OooO0O0() {
        this.f41773OooO0oo = 0;
        int iOooO00o = OooOOO.OooO00o(this.f41772OooO0oO.f41703OooO0OO[0], this.f41748OooO00o.f41745OooOOO0);
        int[] iArr = this.f41750OooO0OO;
        iArr[0] = iOooO00o;
        iArr[1] = iOooO00o;
    }

    @Override // p273o0O00Oo.Oooo000
    public final void OooO0OO(@NonNull BaseProgressIndicator.OooO0OO oooO0OO) {
        this.f41775OooOO0O = oooO0OO;
    }

    @Override // p273o0O00Oo.Oooo000
    public final void OooO0Oo() {
        ObjectAnimator objectAnimator = this.f41771OooO0o0;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        OooO00o();
        if (this.f41748OooO00o.isVisible()) {
            this.f41771OooO0o0.setFloatValues(this.f41774OooOO0, 1.0f);
            this.f41771OooO0o0.setDuration((long) ((1.0f - this.f41774OooOO0) * 1800.0f));
            this.f41771OooO0o0.start();
        }
    }

    @Override // p273o0O00Oo.Oooo000
    public final void OooO0o() {
        this.f41775OooOO0O = null;
    }

    @Override // p273o0O00Oo.Oooo000
    public final void OooO0o0() {
        ObjectAnimator objectAnimator = this.f41769OooO0Oo;
        OooO00o oooO00o = f41766OooOOO;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, oooO00o, 0.0f, 1.0f);
            this.f41769OooO0Oo = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(1800L);
            this.f41769OooO0Oo.setInterpolator(null);
            this.f41769OooO0Oo.setRepeatCount(-1);
            this.f41769OooO0Oo.addListener(new o00Oo0(this));
        }
        if (this.f41771OooO0o0 == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, oooO00o, 1.0f);
            this.f41771OooO0o0 = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(1800L);
            this.f41771OooO0o0.setInterpolator(null);
            this.f41771OooO0o0.addListener(new o00Ooo(this));
        }
        this.f41773OooO0oo = 0;
        int iOooO00o = OooOOO.OooO00o(this.f41772OooO0oO.f41703OooO0OO[0], this.f41748OooO00o.f41745OooOOO0);
        int[] iArr = this.f41750OooO0OO;
        iArr[0] = iOooO00o;
        iArr[1] = iOooO00o;
        this.f41769OooO0Oo.start();
    }
}

package o0OOO0O0;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Arrays;
import p394o0OOoooO.o0O0000O;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Ooo extends OooOo<ObjectAnimator> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f38111OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ObjectAnimator f38112OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Interpolator[] f38113OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public ObjectAnimator f38114OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final LinearProgressIndicatorSpec f38115OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f38116OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f38117OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public p103o000oo00.OooOO0O f38118OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final int[] f38108OooOO0o = {533, 567, 850, 750};

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final int[] f38110OooOOO0 = {1267, 1000, 333, 0};

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final Property<o00Ooo, Float> f38109OooOOO = new OooO00o();

    public class OooO00o extends Property<o00Ooo, Float> {
        public OooO00o() {
            super(Float.class, "animationFraction");
        }

        @Override // android.util.Property
        public final Float get(o00Ooo o00ooo2) {
            return Float.valueOf(o00ooo2.f38117OooOO0);
        }

        @Override // android.util.Property
        public final void set(o00Ooo o00ooo2, Float f) {
            o00Ooo o00ooo3 = o00ooo2;
            float fFloatValue = f.floatValue();
            o00ooo3.f38117OooOO0 = fFloatValue;
            int i = (int) (fFloatValue * 1800.0f);
            for (int i2 = 0; i2 < 4; i2++) {
                o00ooo3.f38096OooO0O0[i2] = Math.max(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, Math.min(1.0f, o00ooo3.f38113OooO0o[i2].getInterpolation((i - o00Ooo.f38110OooOOO0[i2]) / o00Ooo.f38108OooOO0o[i2])));
            }
            if (o00ooo3.f38111OooO) {
                Arrays.fill(o00ooo3.f38097OooO0OO, o0O0000O.OooO00o(o00ooo3.f38115OooO0oO.f38054OooO0OO[o00ooo3.f38116OooO0oo], o00ooo3.f38095OooO00o.f38094o000oOoO));
                o00ooo3.f38111OooO = false;
            }
            o00ooo3.f38095OooO00o.invalidateSelf();
        }
    }

    public o00Ooo(@NonNull Context context, @NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(2);
        this.f38116OooO0oo = 0;
        this.f38118OooOO0O = null;
        this.f38115OooO0oO = linearProgressIndicatorSpec;
        this.f38113OooO0o = new Interpolator[]{AnimationUtils.loadInterpolator(context, p337o0OO0o0.OooO0OO.linear_indeterminate_line1_head_interpolator), AnimationUtils.loadInterpolator(context, p337o0OO0o0.OooO0OO.linear_indeterminate_line1_tail_interpolator), AnimationUtils.loadInterpolator(context, p337o0OO0o0.OooO0OO.linear_indeterminate_line2_head_interpolator), AnimationUtils.loadInterpolator(context, p337o0OO0o0.OooO0OO.linear_indeterminate_line2_tail_interpolator)};
    }

    @Override // o0OOO0O0.OooOo
    public final void OooO00o() {
        ObjectAnimator objectAnimator = this.f38112OooO0Oo;
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
        this.f38118OooOO0O = oooOO0O;
    }

    @Override // o0OOO0O0.OooOo
    public final void OooO0Oo() {
        ObjectAnimator objectAnimator = this.f38114OooO0o0;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        OooO00o();
        if (this.f38095OooO00o.isVisible()) {
            this.f38114OooO0o0.setFloatValues(this.f38117OooOO0, 1.0f);
            this.f38114OooO0o0.setDuration((long) ((1.0f - this.f38117OooOO0) * 1800.0f));
            this.f38114OooO0o0.start();
        }
    }

    @Override // o0OOO0O0.OooOo
    public final void OooO0o() {
        this.f38118OooOO0O = null;
    }

    @Override // o0OOO0O0.OooOo
    public final void OooO0o0() {
        if (this.f38112OooO0Oo == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f38109OooOOO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f);
            this.f38112OooO0Oo = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(1800L);
            this.f38112OooO0Oo.setInterpolator(null);
            this.f38112OooO0Oo.setRepeatCount(-1);
            this.f38112OooO0Oo.addListener(new o00O0O(this));
        }
        if (this.f38114OooO0o0 == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f38109OooOOO, 1.0f);
            this.f38114OooO0o0 = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(1800L);
            this.f38114OooO0o0.setInterpolator(null);
            this.f38114OooO0o0.addListener(new o00Oo0(this));
        }
        OooO0oO();
        this.f38112OooO0Oo.start();
    }

    @VisibleForTesting
    public final void OooO0oO() {
        this.f38116OooO0oo = 0;
        int iOooO00o = o0O0000O.OooO00o(this.f38115OooO0oO.f38054OooO0OO[0], this.f38095OooO00o.f38094o000oOoO);
        int[] iArr = this.f38097OooO0OO;
        iArr[0] = iOooO00o;
        iArr[1] = iOooO00o;
    }
}

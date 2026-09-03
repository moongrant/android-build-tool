package o0OOO0O0;

import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Arrays;
import p394o0OOoooO.o0O0000O;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OoOo0 extends OooOo<ObjectAnimator> {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final Property<o0OoOo0, Float> f38119OooOO0 = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f38120OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ObjectAnimator f38121OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final LinearProgressIndicatorSpec f38122OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public p077o000Oo.OooO0OO f38123OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f38124OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f38125OooO0oo;

    public class OooO00o extends Property<o0OoOo0, Float> {
        public OooO00o() {
            super(Float.class, "animationFraction");
        }

        @Override // android.util.Property
        public final Float get(o0OoOo0 o0oooo1) {
            return Float.valueOf(o0oooo1.f38120OooO);
        }

        @Override // android.util.Property
        public final void set(o0OoOo0 o0oooo1, Float f) {
            o0OoOo0 o0oooo2 = o0oooo1;
            float fFloatValue = f.floatValue();
            o0oooo2.f38120OooO = fFloatValue;
            float[] fArr = o0oooo2.f38096OooO0O0;
            fArr[0] = 0.0f;
            float f2 = (((int) (fFloatValue * 333.0f)) - 0) / 667;
            float interpolation = o0oooo2.f38123OooO0o0.getInterpolation(f2);
            fArr[2] = interpolation;
            fArr[1] = interpolation;
            float[] fArr2 = o0oooo2.f38096OooO0O0;
            float interpolation2 = o0oooo2.f38123OooO0o0.getInterpolation(f2 + 0.49925038f);
            fArr2[4] = interpolation2;
            fArr2[3] = interpolation2;
            float[] fArr3 = o0oooo2.f38096OooO0O0;
            fArr3[5] = 1.0f;
            if (o0oooo2.f38125OooO0oo && fArr3[3] < 1.0f) {
                int[] iArr = o0oooo2.f38097OooO0OO;
                iArr[2] = iArr[1];
                iArr[1] = iArr[0];
                iArr[0] = o0O0000O.OooO00o(o0oooo2.f38122OooO0o.f38054OooO0OO[o0oooo2.f38124OooO0oO], o0oooo2.f38095OooO00o.f38094o000oOoO);
                o0oooo2.f38125OooO0oo = false;
            }
            o0oooo2.f38095OooO00o.invalidateSelf();
        }
    }

    public o0OoOo0(@NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(3);
        this.f38124OooO0oO = 1;
        this.f38122OooO0o = linearProgressIndicatorSpec;
        this.f38123OooO0o0 = new p077o000Oo.OooO0OO();
    }

    @Override // o0OOO0O0.OooOo
    public final void OooO00o() {
        ObjectAnimator objectAnimator = this.f38121OooO0Oo;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // o0OOO0O0.OooOo
    public final void OooO0O0() {
        OooO0oO();
    }

    @Override // o0OOO0O0.OooOo
    public final void OooO0OO(@Nullable p103o000oo00.OooOO0O oooOO0O) {
    }

    @Override // o0OOO0O0.OooOo
    public final void OooO0Oo() {
    }

    @Override // o0OOO0O0.OooOo
    public final void OooO0o() {
    }

    @Override // o0OOO0O0.OooOo
    public final void OooO0o0() {
        if (this.f38121OooO0Oo == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f38119OooOO0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f);
            this.f38121OooO0Oo = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(333L);
            this.f38121OooO0Oo.setInterpolator(null);
            this.f38121OooO0Oo.setRepeatCount(-1);
            this.f38121OooO0Oo.addListener(new o000oOoO(this));
        }
        OooO0oO();
        this.f38121OooO0Oo.start();
    }

    @VisibleForTesting
    public final void OooO0oO() {
        this.f38125OooO0oo = true;
        this.f38124OooO0oO = 1;
        Arrays.fill(this.f38097OooO0OO, o0O0000O.OooO00o(this.f38122OooO0o.f38054OooO0OO[0], this.f38095OooO00o.f38094o000oOoO));
    }
}

package o0OOO0O0;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooOOOO extends Drawable implements Animatable {

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public static final Property<OooOOOO, Float> f38084OoooOOO = new OooO00o();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public ValueAnimator f38085Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Context f38086Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final OooO0O0 f38087Oooo0oO;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public float f38089OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public List<p103o000oo00.OooOO0O> f38090OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public ValueAnimator f38091OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f38092OoooO0O;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public int f38094o000oOoO;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final Paint f38093OoooOO0 = new Paint();

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public o0OOO0O0.OooO00o f38088Oooo0oo = new o0OOO0O0.OooO00o();

    public class OooO00o extends Property<OooOOOO, Float> {
        public OooO00o() {
            super(Float.class, "growFraction");
        }

        @Override // android.util.Property
        public final Float get(OooOOOO oooOOOO) {
            return Float.valueOf(oooOOOO.OooO0O0());
        }

        @Override // android.util.Property
        public final void set(OooOOOO oooOOOO, Float f) {
            OooOOOO oooOOOO2 = oooOOOO;
            float fFloatValue = f.floatValue();
            if (oooOOOO2.f38089OoooO != fFloatValue) {
                oooOOOO2.f38089OoooO = fFloatValue;
                oooOOOO2.invalidateSelf();
            }
        }
    }

    public OooOOOO(@NonNull Context context, @NonNull OooO0O0 oooO0O0) {
        this.f38086Oooo0o = context;
        this.f38087Oooo0oO = oooO0O0;
        setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<o000oo00.OooOO0O>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<o000oo00.OooOO0O>] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList, java.util.List<o000oo00.OooOO0O>] */
    public final boolean OooO(@NonNull p103o000oo00.OooOO0O oooOO0O) {
        ?? r0 = this.f38090OoooO0;
        if (r0 == 0 || !r0.contains(oooOO0O)) {
            return false;
        }
        this.f38090OoooO0.remove(oooOO0O);
        if (!this.f38090OoooO0.isEmpty()) {
            return true;
        }
        this.f38090OoooO0 = null;
        return true;
    }

    public final float OooO0O0() {
        OooO0O0 oooO0O0 = this.f38087Oooo0oO;
        if (!(oooO0O0.f38057OooO0o0 != 0)) {
            if (!(oooO0O0.f38056OooO0o != 0)) {
                return 1.0f;
            }
        }
        return this.f38089OoooO;
    }

    public final boolean OooO0OO() {
        return OooO0oO(false, false, false);
    }

    public final boolean OooO0Oo() {
        ValueAnimator valueAnimator = this.f38091OoooO00;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<o000oo00.OooOO0O>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<o000oo00.OooOO0O>] */
    public final void OooO0o(@NonNull p103o000oo00.OooOO0O oooOO0O) {
        if (this.f38090OoooO0 == null) {
            this.f38090OoooO0 = new ArrayList();
        }
        if (this.f38090OoooO0.contains(oooOO0O)) {
            return;
        }
        this.f38090OoooO0.add(oooOO0O);
    }

    public final boolean OooO0o0() {
        ValueAnimator valueAnimator = this.f38085Oooo;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    public final boolean OooO0oO(boolean z, boolean z2, boolean z3) {
        return OooO0oo(z, z2, z3 && this.f38088Oooo0oo.OooO00o(this.f38086Oooo0o.getContentResolver()) > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
    }

    public boolean OooO0oo(boolean z, boolean z2, boolean z3) {
        if (this.f38085Oooo == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f38084OoooOOO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f);
            this.f38085Oooo = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.f38085Oooo.setInterpolator(p338o0OO0o0O.OooO0o.f37973OooO0O0);
            ValueAnimator valueAnimator = this.f38085Oooo;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            this.f38085Oooo = valueAnimator;
            valueAnimator.addListener(new OooOOO0(this));
        }
        if (this.f38091OoooO00 == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f38084OoooOOO, 1.0f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            this.f38091OoooO00 = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.f38091OoooO00.setInterpolator(p338o0OO0o0O.OooO0o.f37973OooO0O0);
            ValueAnimator valueAnimator2 = this.f38091OoooO00;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            this.f38091OoooO00 = valueAnimator2;
            valueAnimator2.addListener(new OooOOO(this));
        }
        if (!isVisible() && !z) {
            return false;
        }
        ValueAnimator valueAnimator3 = z ? this.f38085Oooo : this.f38091OoooO00;
        if (!z3) {
            if (valueAnimator3.isRunning()) {
                valueAnimator3.end();
            } else {
                ValueAnimator[] valueAnimatorArr = {valueAnimator3};
                boolean z4 = this.f38092OoooO0O;
                this.f38092OoooO0O = true;
                for (int i = 0; i < 1; i++) {
                    valueAnimatorArr[i].end();
                }
                this.f38092OoooO0O = z4;
            }
            return super.setVisible(z, false);
        }
        if (z3 && valueAnimator3.isRunning()) {
            return false;
        }
        boolean z5 = !z || super.setVisible(z, false);
        if (!z ? this.f38087Oooo0oO.f38056OooO0o == 0 : this.f38087Oooo0oO.f38057OooO0o0 == 0) {
            if (z2 || !valueAnimator3.isPaused()) {
                valueAnimator3.start();
            } else {
                valueAnimator3.resume();
            }
            return z5;
        }
        ValueAnimator[] valueAnimatorArr2 = {valueAnimator3};
        boolean z6 = this.f38092OoooO0O;
        this.f38092OoooO0O = true;
        for (int i2 = 0; i2 < 1; i2++) {
            valueAnimatorArr2[i2].end();
        }
        this.f38092OoooO0O = z6;
        return z5;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f38094o000oOoO;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return OooO0o0() || OooO0Oo();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f38094o000oOoO = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f38093OoooOO0.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return OooO0oO(z, z2, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        OooO0oo(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        OooO0oo(false, true, false);
    }
}

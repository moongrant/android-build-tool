package o0OO;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.Objects;
import p338o0OO0o0O.OooOo00;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooO0O0 implements OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f37162OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ExtendedFloatingActionButton f37163OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayList<Animator.AnimatorListener> f37164OooO0OO = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0OO.OooO00o f37165OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public OooOo00 f37166OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public OooOo00 f37167OooO0o0;

    public class OooO00o extends Property<ExtendedFloatingActionButton, Float> {
        public OooO00o() {
            super(Float.class, "LABEL_OPACITY_PROPERTY");
        }

        @Override // android.util.Property
        public final Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
            ExtendedFloatingActionButton extendedFloatingActionButton2 = extendedFloatingActionButton;
            float fAlpha = (Color.alpha(extendedFloatingActionButton2.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton2.f17054oo000o.getColorForState(extendedFloatingActionButton2.getDrawableState(), OooO0O0.this.f37163OooO0O0.f17054oo000o.getDefaultColor()));
            LinearInterpolator linearInterpolator = p338o0OO0o0O.OooO0o.f37972OooO00o;
            return Float.valueOf((fAlpha * 1.0f) + ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        }

        @Override // android.util.Property
        public final void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f) {
            ExtendedFloatingActionButton extendedFloatingActionButton2 = extendedFloatingActionButton;
            Float f2 = f;
            int colorForState = extendedFloatingActionButton2.f17054oo000o.getColorForState(extendedFloatingActionButton2.getDrawableState(), OooO0O0.this.f37163OooO0O0.f17054oo000o.getDefaultColor());
            float fAlpha = Color.alpha(colorForState) / 255.0f;
            float fFloatValue = f2.floatValue();
            LinearInterpolator linearInterpolator = p338o0OO0o0O.OooO0o.f37972OooO00o;
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(Color.argb((int) ((((fAlpha - ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) * fFloatValue) + ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
            if (f2.floatValue() == 1.0f) {
                extendedFloatingActionButton2.OooOO0o(extendedFloatingActionButton2.f17054oo000o);
            } else {
                extendedFloatingActionButton2.OooOO0o(colorStateListValueOf);
            }
        }
    }

    public OooO0O0(@NonNull ExtendedFloatingActionButton extendedFloatingActionButton, o0OO.OooO00o oooO00o) {
        this.f37163OooO0O0 = extendedFloatingActionButton;
        this.f37162OooO00o = extendedFloatingActionButton.getContext();
        this.f37165OooO0Oo = oooO00o;
    }

    public final OooOo00 OooO() {
        OooOo00 oooOo00 = this.f37166OooO0o;
        if (oooOo00 != null) {
            return oooOo00;
        }
        if (this.f37167OooO0o0 == null) {
            this.f37167OooO0o0 = OooOo00.OooO0O0(this.f37162OooO00o, OooO0OO());
        }
        OooOo00 oooOo01 = this.f37167OooO0o0;
        Objects.requireNonNull(oooOo01);
        return oooOo01;
    }

    @Override // o0OO.OooOOO0
    @CallSuper
    public void OooO00o() {
        this.f37165OooO0Oo.f37161OooO00o = null;
    }

    @Override // o0OO.OooOOO0
    @CallSuper
    public void OooO0O0() {
        this.f37165OooO0Oo.f37161OooO00o = null;
    }

    @Override // o0OO.OooOOO0
    public AnimatorSet OooO0oO() {
        return OooO0oo(OooO());
    }

    @NonNull
    public final AnimatorSet OooO0oo(@NonNull OooOo00 oooOo00) {
        ArrayList arrayList = new ArrayList();
        if (oooOo00.OooO0oO("opacity")) {
            arrayList.add(oooOo00.OooO0Oo("opacity", this.f37163OooO0O0, View.ALPHA));
        }
        if (oooOo00.OooO0oO("scale")) {
            arrayList.add(oooOo00.OooO0Oo("scale", this.f37163OooO0O0, View.SCALE_Y));
            arrayList.add(oooOo00.OooO0Oo("scale", this.f37163OooO0O0, View.SCALE_X));
        }
        if (oooOo00.OooO0oO(ViewHierarchyConstants.DIMENSION_WIDTH_KEY)) {
            arrayList.add(oooOo00.OooO0Oo(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, this.f37163OooO0O0, ExtendedFloatingActionButton.f17038o00oO0O));
        }
        if (oooOo00.OooO0oO(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY)) {
            arrayList.add(oooOo00.OooO0Oo(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, this.f37163OooO0O0, ExtendedFloatingActionButton.f17040o0ooOO0));
        }
        if (oooOo00.OooO0oO("paddingStart")) {
            arrayList.add(oooOo00.OooO0Oo("paddingStart", this.f37163OooO0O0, ExtendedFloatingActionButton.f17041o0ooOOo));
        }
        if (oooOo00.OooO0oO("paddingEnd")) {
            arrayList.add(oooOo00.OooO0Oo("paddingEnd", this.f37163OooO0O0, ExtendedFloatingActionButton.f17042o0ooOoO));
        }
        if (oooOo00.OooO0oO("labelOpacity")) {
            arrayList.add(oooOo00.OooO0Oo("labelOpacity", this.f37163OooO0O0, new OooO00o()));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        p338o0OO0o0O.OooO.OooO00o(animatorSet, arrayList);
        return animatorSet;
    }

    @Override // o0OO.OooOOO0
    @CallSuper
    public void onAnimationStart(Animator animator) {
        o0OO.OooO00o oooO00o = this.f37165OooO0Oo;
        Animator animator2 = oooO00o.f37161OooO00o;
        if (animator2 != null) {
            animator2.cancel();
        }
        oooO00o.f37161OooO00o = animator;
    }
}

package o0O00O;

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
import java.util.ArrayList;
import o0O000.OooOOO;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OooO0O0 implements OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f41668OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ExtendedFloatingActionButton f41669OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ArrayList<Animator.AnimatorListener> f41670OooO0OO = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0O00O.OooO00o f41671OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public OooOOO f41672OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public OooOOO f41673OooO0o0;

    public class OooO00o extends Property<ExtendedFloatingActionButton, Float> {
        public OooO00o() {
            super(Float.class, "LABEL_OPACITY_PROPERTY");
        }

        @Override // android.util.Property
        public final Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
            ExtendedFloatingActionButton extendedFloatingActionButton2 = extendedFloatingActionButton;
            float fAlpha = (Color.alpha(extendedFloatingActionButton2.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton2.f17004Oooo0O0.getColorForState(extendedFloatingActionButton2.getDrawableState(), OooO0O0.this.f41669OooO0O0.f17004Oooo0O0.getDefaultColor()));
            LinearInterpolator linearInterpolator = o0O000.OooO0O0.f41571OooO00o;
            return Float.valueOf((fAlpha * 1.0f) + 0.0f);
        }

        @Override // android.util.Property
        public final void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f) {
            ExtendedFloatingActionButton extendedFloatingActionButton2 = extendedFloatingActionButton;
            Float f2 = f;
            int colorForState = extendedFloatingActionButton2.f17004Oooo0O0.getColorForState(extendedFloatingActionButton2.getDrawableState(), OooO0O0.this.f41669OooO0O0.f17004Oooo0O0.getDefaultColor());
            float fAlpha = Color.alpha(colorForState) / 255.0f;
            float fFloatValue = f2.floatValue();
            LinearInterpolator linearInterpolator = o0O000.OooO0O0.f41571OooO00o;
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(Color.argb((int) ((((fAlpha - 0.0f) * fFloatValue) + 0.0f) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
            if (f2.floatValue() == 1.0f) {
                extendedFloatingActionButton2.OooO0o(extendedFloatingActionButton2.f17004Oooo0O0);
            } else {
                extendedFloatingActionButton2.OooO0o(colorStateListValueOf);
            }
        }
    }

    public OooO0O0(@NonNull ExtendedFloatingActionButton extendedFloatingActionButton, o0O00O.OooO00o oooO00o) {
        this.f41669OooO0O0 = extendedFloatingActionButton;
        this.f41668OooO00o = extendedFloatingActionButton.getContext();
        this.f41671OooO0Oo = oooO00o;
    }

    @Override // o0O00O.OooOOO0
    @CallSuper
    public void OooO0o0() {
        this.f41671OooO0Oo.f41667OooO00o = null;
    }

    @Override // o0O00O.OooOOO0
    public AnimatorSet OooO0oO() {
        OooOOO oooOOO = this.f41672OooO0o;
        if (oooOOO == null) {
            if (this.f41673OooO0o0 == null) {
                this.f41673OooO0o0 = OooOOO.OooO0O0(OooO0o(), this.f41668OooO00o);
            }
            oooOOO = this.f41673OooO0o0;
            oooOOO.getClass();
        }
        return OooO0oo(oooOOO);
    }

    @NonNull
    public final AnimatorSet OooO0oo(@NonNull OooOOO oooOOO) {
        ArrayList arrayList = new ArrayList();
        boolean zOooO0oO = oooOOO.OooO0oO("opacity");
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f41669OooO0O0;
        if (zOooO0oO) {
            arrayList.add(oooOOO.OooO0Oo("opacity", extendedFloatingActionButton, View.ALPHA));
        }
        if (oooOOO.OooO0oO("scale")) {
            arrayList.add(oooOOO.OooO0Oo("scale", extendedFloatingActionButton, View.SCALE_Y));
            arrayList.add(oooOOO.OooO0Oo("scale", extendedFloatingActionButton, View.SCALE_X));
        }
        if (oooOOO.OooO0oO(ViewHierarchyConstants.DIMENSION_WIDTH_KEY)) {
            arrayList.add(oooOOO.OooO0Oo(ViewHierarchyConstants.DIMENSION_WIDTH_KEY, extendedFloatingActionButton, ExtendedFloatingActionButton.f16989Oooo0oO));
        }
        if (oooOOO.OooO0oO(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY)) {
            arrayList.add(oooOOO.OooO0Oo(ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, extendedFloatingActionButton, ExtendedFloatingActionButton.f16990Oooo0oo));
        }
        if (oooOOO.OooO0oO("paddingStart")) {
            arrayList.add(oooOOO.OooO0Oo("paddingStart", extendedFloatingActionButton, ExtendedFloatingActionButton.f16987Oooo));
        }
        if (oooOOO.OooO0oO("paddingEnd")) {
            arrayList.add(oooOOO.OooO0Oo("paddingEnd", extendedFloatingActionButton, ExtendedFloatingActionButton.f16991OoooO00));
        }
        if (oooOOO.OooO0oO("labelOpacity")) {
            arrayList.add(oooOOO.OooO0Oo("labelOpacity", extendedFloatingActionButton, new OooO00o()));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        o0O000.OooO0OO.OooO00o(animatorSet, arrayList);
        return animatorSet;
    }
}

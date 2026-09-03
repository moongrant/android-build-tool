package o0OO;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.Objects;
import p084o000Ooo.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(21)
public final class OooOO0O extends com.google.android.material.floatingactionbutton.OooO0o {

    public static class OooO00o extends MaterialShapeDrawable {
        public OooO00o(com.google.android.material.shape.OooO00o oooO00o) {
            super(oooO00o);
        }

        @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
        public final boolean isStateful() {
            return true;
        }
    }

    public OooOO0O(FloatingActionButton floatingActionButton, p345o0OOO0Oo.OooO0o oooO0o) {
        super(floatingActionButton, oooO0o);
    }

    @Override // com.google.android.material.floatingactionbutton.OooO0o
    public final void OooO0o(@NonNull Rect rect) {
        if (FloatingActionButton.this.f17077OoooOOo) {
            super.OooO0o(rect);
            return;
        }
        if (!this.f17110OooO0o || this.f17128OooOo0o.getSizeDimension() >= this.f17115OooOO0O) {
            rect.set(0, 0, 0, 0);
        } else {
            int sizeDimension = (this.f17115OooOO0O - this.f17128OooOo0o.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.OooO0o
    public final float OooO0o0() {
        return this.f17128OooOo0o.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.OooO0o
    public final void OooO0oO(ColorStateList colorStateList, @Nullable PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable layerDrawable;
        com.google.android.material.shape.OooO00o oooO00o = this.f17106OooO00o;
        Objects.requireNonNull(oooO00o);
        OooO00o oooO00o2 = new OooO00o(oooO00o);
        this.f17107OooO0O0 = oooO00o2;
        oooO00o2.setTintList(colorStateList);
        if (mode != null) {
            this.f17107OooO0O0.setTintMode(mode);
        }
        this.f17107OooO0O0.OooOOO0(this.f17128OooOo0o.getContext());
        if (i > 0) {
            Context context = this.f17128OooOo0o.getContext();
            com.google.android.material.shape.OooO00o oooO00o3 = this.f17106OooO00o;
            Objects.requireNonNull(oooO00o3);
            OooO0OO oooO0OO = new OooO0OO(oooO00o3);
            int iOooO0O0 = o000O000.OooO00o.OooO0O0(context, p337o0OO0o0.OooO.design_fab_stroke_top_outer_color);
            int iOooO0O1 = o000O000.OooO00o.OooO0O0(context, p337o0OO0o0.OooO.design_fab_stroke_top_inner_color);
            int iOooO0O2 = o000O000.OooO00o.OooO0O0(context, p337o0OO0o0.OooO.design_fab_stroke_end_inner_color);
            int iOooO0O3 = o000O000.OooO00o.OooO0O0(context, p337o0OO0o0.OooO.design_fab_stroke_end_outer_color);
            oooO0OO.f37169OooO = iOooO0O0;
            oooO0OO.f37178OooOO0 = iOooO0O1;
            oooO0OO.f37179OooOO0O = iOooO0O2;
            oooO0OO.f37180OooOO0o = iOooO0O3;
            float f = i;
            if (oooO0OO.f37177OooO0oo != f) {
                oooO0OO.f37177OooO0oo = f;
                oooO0OO.f37171OooO0O0.setStrokeWidth(f * 1.3333f);
                oooO0OO.f37181OooOOO = true;
                oooO0OO.invalidateSelf();
            }
            oooO0OO.OooO0O0(colorStateList);
            this.f17109OooO0Oo = oooO0OO;
            OooO0OO oooO0OO2 = this.f17109OooO0Oo;
            Objects.requireNonNull(oooO0OO2);
            MaterialShapeDrawable materialShapeDrawable = this.f17107OooO0O0;
            Objects.requireNonNull(materialShapeDrawable);
            layerDrawable = new LayerDrawable(new Drawable[]{oooO0OO2, materialShapeDrawable});
        } else {
            this.f17109OooO0Oo = null;
            layerDrawable = this.f17107OooO0O0;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(o0OOO0OO.OooO0O0.OooO0OO(colorStateList2), layerDrawable, null);
        this.f17108OooO0OO = rippleDrawable;
        this.f17111OooO0o0 = rippleDrawable;
    }

    @Override // com.google.android.material.floatingactionbutton.OooO0o
    public final void OooOO0() {
    }

    @Override // com.google.android.material.floatingactionbutton.OooO0o
    public final void OooOO0O() {
        OooOo0O();
    }

    @Override // com.google.android.material.floatingactionbutton.OooO0o
    public final void OooOO0o(int[] iArr) {
        if (Build.VERSION.SDK_INT == 21) {
            if (!this.f17128OooOo0o.isEnabled()) {
                this.f17128OooOo0o.setElevation(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                this.f17128OooOo0o.setTranslationZ(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                return;
            }
            this.f17128OooOo0o.setElevation(this.f17113OooO0oo);
            if (this.f17128OooOo0o.isPressed()) {
                this.f17128OooOo0o.setTranslationZ(this.f17114OooOO0);
            } else if (this.f17128OooOo0o.isFocused() || this.f17128OooOo0o.isHovered()) {
                this.f17128OooOo0o.setTranslationZ(this.f17105OooO);
            } else {
                this.f17128OooOo0o.setTranslationZ(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            }
        }
    }

    @Override // com.google.android.material.floatingactionbutton.OooO0o
    public final void OooOOO0(float f, float f2, float f3) {
        int i = Build.VERSION.SDK_INT;
        if (i == 21) {
            this.f17128OooOo0o.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.OooO0o.f17099OooOooo, OooOo(f, f3));
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.OooO0o.f17101Oooo000, OooOo(f, f2));
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.OooO0o.f17102Oooo00O, OooOo(f, f2));
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.OooO0o.f17103Oooo00o, OooOo(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f17128OooOo0o, "elevation", f).setDuration(0L));
            if (i >= 22 && i <= 24) {
                FloatingActionButton floatingActionButton = this.f17128OooOo0o;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f17128OooOo0o, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(com.google.android.material.floatingactionbutton.OooO0o.f17098OooOooO);
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.OooO0o.f17100Oooo0, animatorSet);
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.OooO0o.f17104Oooo0O0, OooOo(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
            this.f17128OooOo0o.setStateListAnimator(stateListAnimator);
        }
        if (OooOOoo()) {
            OooOo0O();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.OooO0o
    public final void OooOOo0(@Nullable ColorStateList colorStateList) {
        Drawable drawable = this.f17108OooO0OO;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(o0OOO0OO.OooO0O0.OooO0OO(colorStateList));
        } else if (drawable != null) {
            o0OOO0o.OooO0O0.OooO0oo(drawable, o0OOO0OO.OooO0O0.OooO0OO(colorStateList));
        }
    }

    @Override // com.google.android.material.floatingactionbutton.OooO0o
    public final boolean OooOOoo() {
        if (!FloatingActionButton.this.f17077OoooOOo) {
            if (!this.f17110OooO0o || this.f17128OooOo0o.getSizeDimension() >= this.f17115OooOO0O) {
                return false;
            }
        }
        return true;
    }

    @NonNull
    public final Animator OooOo(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f17128OooOo0o, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f17128OooOo0o, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(com.google.android.material.floatingactionbutton.OooO0o.f17098OooOooO);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.OooO0o
    public final void OooOo0() {
    }
}

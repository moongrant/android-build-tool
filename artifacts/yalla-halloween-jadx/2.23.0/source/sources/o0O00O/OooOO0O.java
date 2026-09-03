package o0O00O;

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
import androidx.core.content.ContextCompat;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.ArrayList;
import p270o0O0000o.o00000O0;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(21)
public final class OooOO0O extends com.google.android.material.floatingactionbutton.OooOO0O {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public StateListAnimator f41695Oooo0oO;

    public static class OooO00o extends MaterialShapeDrawable {
        @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
        public final boolean isStateful() {
            return true;
        }
    }

    @Override // com.google.android.material.floatingactionbutton.OooOO0O
    public final void OooO() {
        OooOOo0();
    }

    @Override // com.google.android.material.floatingactionbutton.OooOO0O
    public final void OooO0o(@NonNull Rect rect) {
        if (FloatingActionButton.this.f17026OooOOO) {
            super.OooO0o(rect);
            return;
        }
        boolean z = this.f17069OooO0o;
        FloatingActionButton floatingActionButton = this.f17086OooOo0O;
        if (!z || floatingActionButton.getSizeDimension() >= this.f17074OooOO0O) {
            rect.set(0, 0, 0, 0);
        } else {
            int sizeDimension = (this.f17074OooOO0O - floatingActionButton.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.OooOO0O
    public final float OooO0o0() {
        return this.f17086OooOo0O.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.OooOO0O
    public final void OooO0oO(ColorStateList colorStateList, @Nullable PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable layerDrawable;
        MaterialShapeDrawable materialShapeDrawableOooOOoo = OooOOoo();
        this.f17066OooO0O0 = materialShapeDrawableOooOOoo;
        materialShapeDrawableOooOOoo.setTintList(colorStateList);
        if (mode != null) {
            this.f17066OooO0O0.setTintMode(mode);
        }
        MaterialShapeDrawable materialShapeDrawable = this.f17066OooO0O0;
        FloatingActionButton floatingActionButton = this.f17086OooOo0O;
        materialShapeDrawable.OooOO0O(floatingActionButton.getContext());
        if (i > 0) {
            Context context = floatingActionButton.getContext();
            com.google.android.material.shape.OooO0O0 oooO0O0 = this.f17065OooO00o;
            oooO0O0.getClass();
            OooO0OO oooO0OO = new OooO0OO(oooO0O0);
            int i2 = o00000O0.design_fab_stroke_top_outer_color;
            Object obj = ContextCompat.f5271OooO00o;
            int iOooO00o = ContextCompat.OooO0o.OooO00o(context, i2);
            int iOooO00o2 = ContextCompat.OooO0o.OooO00o(context, o00000O0.design_fab_stroke_top_inner_color);
            int iOooO00o3 = ContextCompat.OooO0o.OooO00o(context, o00000O0.design_fab_stroke_end_inner_color);
            int iOooO00o4 = ContextCompat.OooO0o.OooO00o(context, o00000O0.design_fab_stroke_end_outer_color);
            oooO0OO.f41675OooO = iOooO00o;
            oooO0OO.f41684OooOO0 = iOooO00o2;
            oooO0OO.f41685OooOO0O = iOooO00o3;
            oooO0OO.f41686OooOO0o = iOooO00o4;
            float f = i;
            if (oooO0OO.f41683OooO0oo != f) {
                oooO0OO.f41683OooO0oo = f;
                oooO0OO.f41677OooO0O0.setStrokeWidth(f * 1.3333f);
                oooO0OO.f41687OooOOO = true;
                oooO0OO.invalidateSelf();
            }
            if (colorStateList != null) {
                oooO0OO.f41688OooOOO0 = colorStateList.getColorForState(oooO0OO.getState(), oooO0OO.f41688OooOOO0);
            }
            oooO0OO.f41690OooOOOo = colorStateList;
            oooO0OO.f41687OooOOO = true;
            oooO0OO.invalidateSelf();
            this.f17068OooO0Oo = oooO0OO;
            OooO0OO oooO0OO2 = this.f17068OooO0Oo;
            oooO0OO2.getClass();
            MaterialShapeDrawable materialShapeDrawable2 = this.f17066OooO0O0;
            materialShapeDrawable2.getClass();
            layerDrawable = new LayerDrawable(new Drawable[]{oooO0OO2, materialShapeDrawable2});
        } else {
            this.f17068OooO0Oo = null;
            layerDrawable = this.f17066OooO0O0;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(p274o0O00OoO.OooO0OO.OooO0OO(colorStateList2), layerDrawable, null);
        this.f17067OooO0OO = rippleDrawable;
        this.f17070OooO0o0 = rippleDrawable;
    }

    @Override // com.google.android.material.floatingactionbutton.OooOO0O
    public final void OooO0oo() {
    }

    @Override // com.google.android.material.floatingactionbutton.OooOO0O
    public final void OooOO0(int[] iArr) {
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.material.floatingactionbutton.OooOO0O
    public final void OooOO0O(float f, float f2, float f3) {
        int i = Build.VERSION.SDK_INT;
        FloatingActionButton floatingActionButton = this.f17086OooOo0O;
        if (floatingActionButton.getStateListAnimator() == this.f41695Oooo0oO) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.OooOO0O.f17059Oooo00o, OooOOo(f, f3));
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.OooOO0O.f17056Oooo0, OooOOo(f, f2));
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.OooOO0O.f17060Oooo0O0, OooOOo(f, f2));
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.OooOO0O.f17061Oooo0OO, OooOOo(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f).setDuration(0L));
            if (i <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(com.google.android.material.floatingactionbutton.OooOO0O.f17053OooOoo);
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.OooOO0O.f17063Oooo0o0, animatorSet);
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.OooOO0O.f17062Oooo0o, OooOOo(0.0f, 0.0f));
            this.f41695Oooo0oO = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (OooOOOO()) {
            OooOOo0();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.OooOO0O
    public final void OooOOO0(@Nullable ColorStateList colorStateList) {
        Drawable drawable = this.f17067OooO0OO;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(p274o0O00OoO.OooO0OO.OooO0OO(colorStateList));
        } else {
            super.OooOOO0(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.OooOO0O
    public final boolean OooOOOO() {
        if (FloatingActionButton.this.f17026OooOOO) {
            return true;
        }
        return !(!this.f17069OooO0o || this.f17086OooOo0O.getSizeDimension() >= this.f17074OooOO0O);
    }

    @Override // com.google.android.material.floatingactionbutton.OooOO0O
    public final void OooOOOo() {
    }

    @NonNull
    public final AnimatorSet OooOOo(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        FloatingActionButton floatingActionButton = this.f17086OooOo0O;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(com.google.android.material.floatingactionbutton.OooOO0O.f17053OooOoo);
        return animatorSet;
    }

    @NonNull
    public final MaterialShapeDrawable OooOOoo() {
        com.google.android.material.shape.OooO0O0 oooO0O0 = this.f17065OooO00o;
        oooO0O0.getClass();
        return new OooO00o(oooO0O0);
    }
}

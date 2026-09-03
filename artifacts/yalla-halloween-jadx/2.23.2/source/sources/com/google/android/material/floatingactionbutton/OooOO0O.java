package com.google.android.material.floatingactionbutton;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.internal.o0OoOo0;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.ArrayList;
import java.util.Iterator;
import p053o00000oo.o00Ooo;
import p272o0O0000o.o0000;
import p272o0O0000o.o00000;
import p277o0O00Ooo.OooOOOO;

/* JADX INFO: loaded from: classes3.dex */
public class OooOO0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f16591OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public com.google.android.material.shape.OooO0O0 f16592OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public MaterialShapeDrawable f16593OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public Drawable f16594OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public o0O00O.OooO0OO f16595OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f16596OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public LayerDrawable f16597OooO0o0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f16599OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f16600OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f16601OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public Animator f16602OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public o0O000.OooOOO f16603OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public o0O000.OooOOO f16604OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public float f16605OooOOOO;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f16608OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f16609OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public ArrayList<OooOO0> f16611OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f16612OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public final FloatingActionButton f16613OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final o0O00o00.OooO0O0 f16614OooOo0o;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @Nullable
    public o0O00O.OooOO0 f16618OooOoo0;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final p064o0000oO0.OooO f16580OooOoo = o0O000.OooO0O0.f40882OooO0OO;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final int f16581OooOooO = o00000.motionDurationLong2;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final int f16582OooOooo = o00000.motionEasingEmphasizedInterpolator;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final int f16584Oooo000 = o00000.motionDurationMedium1;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public static final int f16585Oooo00O = o00000.motionEasingEmphasizedAccelerateInterpolator;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public static final int[] f16586Oooo00o = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public static final int[] f16583Oooo0 = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public static final int[] f16587Oooo0O0 = {R.attr.state_focused, R.attr.state_enabled};

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public static final int[] f16588Oooo0OO = {R.attr.state_hovered, R.attr.state_enabled};

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public static final int[] f16590Oooo0o0 = {R.attr.state_enabled};

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final int[] f16589Oooo0o = new int[0];

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f16598OooO0oO = true;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public float f16606OooOOOo = 1.0f;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f16607OooOOo = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final Rect f16610OooOo = new Rect();

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final RectF f16616OooOoO0 = new RectF();

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final RectF f16615OooOoO = new RectF();

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final Matrix f16617OooOoOO = new Matrix();

    public class OooO extends OooOOO {

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ OooOO0O f16619OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(o0O00O.OooOO0O oooOO0O) {
            super(oooOO0O);
            this.f16619OooO0oo = oooOO0O;
        }

        @Override // com.google.android.material.floatingactionbutton.OooOO0O.OooOOO
        public final float OooO00o() {
            OooOO0O oooOO0O = this.f16619OooO0oo;
            return oooOO0O.f16599OooO0oo + oooOO0O.f16600OooOO0;
        }
    }

    public class OooO00o extends o0O000.OooOOO0 {
        public OooO00o() {
        }

        @Override // android.animation.TypeEvaluator
        public final Matrix evaluate(float f, @NonNull Matrix matrix, @NonNull Matrix matrix2) {
            OooOO0O.this.f16606OooOOOo = f;
            float[] fArr = this.f40890OooO00o;
            matrix.getValues(fArr);
            float[] fArr2 = this.f40891OooO0O0;
            matrix2.getValues(fArr2);
            for (int i = 0; i < 9; i++) {
                float f2 = fArr2[i];
                float f3 = fArr[i];
                fArr2[i] = OooOo.OooO0o.OooO00o(f2, f3, f, f3);
            }
            Matrix matrix3 = this.f40892OooO0OO;
            matrix3.setValues(fArr2);
            return matrix3;
        }
    }

    public class OooO0O0 implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ float f16621OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ float f16622OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ float f16623OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ float f16624OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ float f16625OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ float f16626OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ float f16627OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ Matrix f16628OooOO0O;

        public OooO0O0(float f, float f2, float f3, float f4, float f5, float f6, float f7, Matrix matrix) {
            this.f16622OooO0Oo = f;
            this.f16624OooO0o0 = f2;
            this.f16623OooO0o = f3;
            this.f16625OooO0oO = f4;
            this.f16626OooO0oo = f5;
            this.f16621OooO = f6;
            this.f16627OooOO0 = f7;
            this.f16628OooOO0O = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            OooOO0O oooOO0O = OooOO0O.this;
            oooOO0O.f16613OooOo0O.setAlpha(o0O000.OooO0O0.OooO00o(this.f16622OooO0Oo, this.f16624OooO0o0, 0.0f, 0.2f, fFloatValue));
            FloatingActionButton floatingActionButton = oooOO0O.f16613OooOo0O;
            float f = this.f16625OooO0oO;
            float f2 = this.f16623OooO0o;
            floatingActionButton.setScaleX(((f - f2) * fFloatValue) + f2);
            FloatingActionButton floatingActionButton2 = oooOO0O.f16613OooOo0O;
            float f3 = this.f16626OooO0oo;
            floatingActionButton2.setScaleY(((f - f3) * fFloatValue) + f3);
            float f4 = this.f16627OooOO0;
            float f5 = this.f16621OooO;
            oooOO0O.f16606OooOOOo = OooOo.OooO0o.OooO00o(f4, f5, fFloatValue, f5);
            float fOooO00o = OooOo.OooO0o.OooO00o(f4, f5, fFloatValue, f5);
            Matrix matrix = this.f16628OooOO0O;
            oooOO0O.OooO00o(fOooO00o, matrix);
            oooOO0O.f16613OooOo0O.setImageMatrix(matrix);
        }
    }

    public class OooO0OO extends OooOOO {
        @Override // com.google.android.material.floatingactionbutton.OooOO0O.OooOOO
        public final float OooO00o() {
            return 0.0f;
        }
    }

    public class OooO0o extends OooOOO {

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ OooOO0O f16630OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(o0O00O.OooOO0O oooOO0O) {
            super(oooOO0O);
            this.f16630OooO0oo = oooOO0O;
        }

        @Override // com.google.android.material.floatingactionbutton.OooOO0O.OooOOO
        public final float OooO00o() {
            OooOO0O oooOO0O = this.f16630OooO0oo;
            return oooOO0O.f16599OooO0oo + oooOO0O.f16591OooO;
        }
    }

    public interface OooOO0 {
        void OooO00o();

        void OooO0O0();
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.OooOO0O$OooOO0O, reason: collision with other inner class name */
    public interface InterfaceC0219OooOO0O {
    }

    public abstract class OooOOO extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f16631OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public float f16632OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public float f16633OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ OooOO0O f16634OooO0oO;

        public OooOOO(o0O00O.OooOO0O oooOO0O) {
            this.f16634OooO0oO = oooOO0O;
        }

        public abstract float OooO00o();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            float f = (int) this.f16632OooO0o;
            MaterialShapeDrawable materialShapeDrawable = this.f16634OooO0oO.f16593OooO0O0;
            if (materialShapeDrawable != null) {
                materialShapeDrawable.OooOOO0(f);
            }
            this.f16631OooO0Oo = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            boolean z = this.f16631OooO0Oo;
            OooOO0O oooOO0O = this.f16634OooO0oO;
            if (!z) {
                MaterialShapeDrawable materialShapeDrawable = oooOO0O.f16593OooO0O0;
                this.f16633OooO0o0 = materialShapeDrawable == null ? 0.0f : materialShapeDrawable.f17105OooO0Oo.f17139OooOOO;
                this.f16632OooO0o = OooO00o();
                this.f16631OooO0Oo = true;
            }
            float f = this.f16633OooO0o0;
            float animatedFraction = (int) ((valueAnimator.getAnimatedFraction() * (this.f16632OooO0o - f)) + f);
            MaterialShapeDrawable materialShapeDrawable2 = oooOO0O.f16593OooO0O0;
            if (materialShapeDrawable2 != null) {
                materialShapeDrawable2.OooOOO0(animatedFraction);
            }
        }
    }

    public class OooOOO0 extends OooOOO {

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ OooOO0O f16635OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(o0O00O.OooOO0O oooOO0O) {
            super(oooOO0O);
            this.f16635OooO0oo = oooOO0O;
        }

        @Override // com.google.android.material.floatingactionbutton.OooOO0O.OooOOO
        public final float OooO00o() {
            return this.f16635OooO0oo.f16599OooO0oo;
        }
    }

    public OooOO0O(FloatingActionButton floatingActionButton, FloatingActionButton.OooO0O0 oooO0O0) {
        this.f16613OooOo0O = floatingActionButton;
        this.f16614OooOo0o = oooO0O0;
        o0OoOo0 o0oooo1 = new o0OoOo0();
        o0O00O.OooOO0O oooOO0O = (o0O00O.OooOO0O) this;
        o0oooo1.OooO00o(f16586Oooo00o, OooO0Oo(new OooO(oooOO0O)));
        o0oooo1.OooO00o(f16583Oooo0, OooO0Oo(new OooO0o(oooOO0O)));
        o0oooo1.OooO00o(f16587Oooo0O0, OooO0Oo(new OooO0o(oooOO0O)));
        o0oooo1.OooO00o(f16588Oooo0OO, OooO0Oo(new OooO0o(oooOO0O)));
        o0oooo1.OooO00o(f16590Oooo0o0, OooO0Oo(new OooOOO0(oooOO0O)));
        o0oooo1.OooO00o(f16589Oooo0o, OooO0Oo(new OooO0OO(oooOO0O)));
        this.f16605OooOOOO = floatingActionButton.getRotation();
    }

    @NonNull
    public static ValueAnimator OooO0Oo(@NonNull OooOOO oooOOO) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f16580OooOoo);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(oooOOO);
        valueAnimator.addUpdateListener(oooOOO);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public void OooO() {
        throw null;
    }

    public final void OooO00o(float f, @NonNull Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f16613OooOo0O.getDrawable();
        if (drawable == null || this.f16608OooOOo0 == 0) {
            return;
        }
        RectF rectF = this.f16616OooOoO0;
        RectF rectF2 = this.f16615OooOoO;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        int i = this.f16608OooOOo0;
        rectF2.set(0.0f, 0.0f, i, i);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i2 = this.f16608OooOOo0;
        matrix.postScale(f, f, i2 / 2.0f, i2 / 2.0f);
    }

    @NonNull
    public final AnimatorSet OooO0O0(@NonNull o0O000.OooOOO oooOOO, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f};
        FloatingActionButton floatingActionButton = this.f16613OooOo0O;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) property, fArr);
        oooOOO.OooO0o("opacity").OooO00o(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_X, f2);
        oooOOO.OooO0o("scale").OooO00o(objectAnimatorOfFloat2);
        int i = Build.VERSION.SDK_INT;
        if (i == 26) {
            objectAnimatorOfFloat2.setEvaluator(new o0O00O.OooO());
        }
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_Y, f2);
        oooOOO.OooO0o("scale").OooO00o(objectAnimatorOfFloat3);
        if (i == 26) {
            objectAnimatorOfFloat3.setEvaluator(new o0O00O.OooO());
        }
        arrayList.add(objectAnimatorOfFloat3);
        Matrix matrix = this.f16617OooOoOO;
        OooO00o(f3, matrix);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(floatingActionButton, new o0O000.OooOO0O(), new OooO00o(), new Matrix(matrix));
        oooOOO.OooO0o("iconScale").OooO00o(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        o0O000.OooO0OO.OooO00o(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet OooO0OO(float f, float f2, float f3, int i, int i2) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        FloatingActionButton floatingActionButton = this.f16613OooOo0O;
        valueAnimatorOfFloat.addUpdateListener(new OooO0O0(floatingActionButton.getAlpha(), f, floatingActionButton.getScaleX(), f2, floatingActionButton.getScaleY(), this.f16606OooOOOo, f3, new Matrix(this.f16617OooOoOO)));
        arrayList.add(valueAnimatorOfFloat);
        o0O000.OooO0OO.OooO00o(animatorSet, arrayList);
        animatorSet.setDuration(o0O00OOO.OooO00o.OooO0OO(i, floatingActionButton.getContext(), floatingActionButton.getContext().getResources().getInteger(o0000.material_motion_duration_long_1)));
        animatorSet.setInterpolator(o0O00OOO.OooO00o.OooO0Oo(floatingActionButton.getContext(), i2, o0O000.OooO0O0.f40881OooO0O0));
        return animatorSet;
    }

    public void OooO0o(@NonNull Rect rect) {
        int sizeDimension = this.f16596OooO0o ? (this.f16601OooOO0O - this.f16613OooOo0O.getSizeDimension()) / 2 : 0;
        float fOooO0o0 = this.f16598OooO0oO ? OooO0o0() + this.f16600OooOO0 : 0.0f;
        int iMax = Math.max(sizeDimension, (int) Math.ceil(fOooO0o0));
        int iMax2 = Math.max(sizeDimension, (int) Math.ceil(fOooO0o0 * 1.5f));
        rect.set(iMax, iMax2, iMax, iMax2);
    }

    public float OooO0o0() {
        throw null;
    }

    public void OooO0oO(ColorStateList colorStateList, @Nullable PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        throw null;
    }

    public void OooO0oo() {
        throw null;
    }

    public void OooOO0(int[] iArr) {
        throw null;
    }

    public void OooOO0O(float f, float f2, float f3) {
        throw null;
    }

    public final void OooOO0o() {
        ArrayList<OooOO0> arrayList = this.f16611OooOo0;
        if (arrayList != null) {
            Iterator<OooOO0> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().OooO00o();
            }
        }
    }

    public final void OooOOO(@NonNull com.google.android.material.shape.OooO0O0 oooO0O0) {
        this.f16592OooO00o = oooO0O0;
        MaterialShapeDrawable materialShapeDrawable = this.f16593OooO0O0;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(oooO0O0);
        }
        Object obj = this.f16594OooO0OO;
        if (obj instanceof p280o0O00o0O.o0OoOo0) {
            ((p280o0O00o0O.o0OoOo0) obj).setShapeAppearanceModel(oooO0O0);
        }
        o0O00O.OooO0OO oooO0OO = this.f16595OooO0Oo;
        if (oooO0OO != null) {
            oooO0OO.f40996OooOOOO = oooO0O0;
            oooO0OO.invalidateSelf();
        }
    }

    public void OooOOO0(@Nullable ColorStateList colorStateList) {
        Drawable drawable = this.f16594OooO0OO;
        if (drawable != null) {
            o00Ooo.OooO0O0.OooO0oo(drawable, OooOOOO.OooO0OO(colorStateList));
        }
    }

    public boolean OooOOOO() {
        throw null;
    }

    public void OooOOOo() {
        throw null;
    }

    public final void OooOOo0() {
        Rect rect = this.f16610OooOo;
        OooO0o(rect);
        o000OO.OooOOO0.OooO0o0(this.f16597OooO0o0, "Didn't initialize content background");
        boolean zOooOOOO = OooOOOO();
        o0O00o00.OooO0O0 oooO0O0 = this.f16614OooOo0o;
        if (zOooOOOO) {
            super/*android.widget.ImageButton*/.setBackgroundDrawable(new InsetDrawable((Drawable) this.f16597OooO0o0, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            LayerDrawable layerDrawable = this.f16597OooO0o0;
            FloatingActionButton.OooO0O0 oooO0O1 = (FloatingActionButton.OooO0O0) oooO0O0;
            if (layerDrawable != null) {
                super/*android.widget.ImageButton*/.setBackgroundDrawable(layerDrawable);
            } else {
                oooO0O1.getClass();
            }
        }
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        FloatingActionButton floatingActionButton = FloatingActionButton.this;
        floatingActionButton.f16555OooOOOO.set(i, i2, i3, i4);
        int i5 = floatingActionButton.f16552OooOO0o;
        floatingActionButton.setPadding(i + i5, i2 + i5, i3 + i5, i4 + i5);
    }
}

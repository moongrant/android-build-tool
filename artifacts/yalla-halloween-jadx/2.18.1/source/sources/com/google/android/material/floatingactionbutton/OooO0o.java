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
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.OooOOOO;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import p338o0OO0o0O.OooOo00;
import p347o0OOO0o0.o00000;

/* JADX INFO: loaded from: classes2.dex */
public class OooO0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f17105OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public com.google.android.material.shape.OooO00o f17106OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public MaterialShapeDrawable f17107OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public Drawable f17108OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public o0OO.OooO0OO f17109OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f17110OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public LayerDrawable f17111OooO0o0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f17113OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f17114OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f17115OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final OooOOOO f17116OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public OooOo00 f17117OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public Animator f17118OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public OooOo00 f17119OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public float f17120OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f17121OooOOo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final p345o0OOO0Oo.OooO0o f17124OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f17125OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f17126OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public ArrayList<OooOO0> f17127OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final FloatingActionButton f17128OooOo0o;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @Nullable
    public o0OO.OooOO0 f17132OooOoo;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final p077o000Oo.OooO0O0 f17098OooOooO = p338o0OO0o0O.OooO0o.f37974OooO0OO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final int[] f17099OooOooo = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final int[] f17101Oooo000 = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public static final int[] f17102Oooo00O = {R.attr.state_focused, R.attr.state_enabled};

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public static final int[] f17103Oooo00o = {R.attr.state_hovered, R.attr.state_enabled};

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public static final int[] f17100Oooo0 = {R.attr.state_enabled};

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public static final int[] f17104Oooo0O0 = new int[0];

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f17112OooO0oO = true;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public float f17122OooOOo0 = 1.0f;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f17123OooOOoo = 0;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final Rect f17130OooOoO0 = new Rect();

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final RectF f17129OooOoO = new RectF();

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final RectF f17131OooOoOO = new RectF();

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final Matrix f17133OooOoo0 = new Matrix();

    public class OooO extends OooOOO {
        public OooO() {
            super();
        }

        @Override // com.google.android.material.floatingactionbutton.OooO0o.OooOOO
        public final float OooO00o() {
            OooO0o oooO0o = OooO0o.this;
            return oooO0o.f17113OooO0oo + oooO0o.f17114OooOO0;
        }
    }

    public class OooO00o extends p338o0OO0o0O.OooOOOO {
        public OooO00o() {
        }

        @Override // android.animation.TypeEvaluator
        public final Matrix evaluate(float f, @NonNull Matrix matrix, @NonNull Matrix matrix2) {
            OooO0o.this.f17122OooOOo0 = f;
            matrix.getValues(this.f37981OooO00o);
            matrix2.getValues(this.f37982OooO0O0);
            for (int i = 0; i < 9; i++) {
                float[] fArr = this.f37982OooO0O0;
                float f2 = fArr[i];
                float[] fArr2 = this.f37981OooO00o;
                fArr[i] = ((f2 - fArr2[i]) * f) + fArr2[i];
            }
            this.f37983OooO0OO.setValues(this.f37982OooO0O0);
            return this.f37983OooO0OO;
        }
    }

    public class OooO0O0 implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ float f17136Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ float f17137Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ float f17138Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ float f17139Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ Matrix f17140OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ float f17141OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ float f17142OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ float f17143OoooO0O;

        public OooO0O0(float f, float f2, float f3, float f4, float f5, float f6, float f7, Matrix matrix) {
            this.f17137Oooo0o = f;
            this.f17138Oooo0oO = f2;
            this.f17139Oooo0oo = f3;
            this.f17136Oooo = f4;
            this.f17142OoooO00 = f5;
            this.f17141OoooO0 = f6;
            this.f17143OoooO0O = f7;
            this.f17140OoooO = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            OooO0o.this.f17128OooOo0o.setAlpha(p338o0OO0o0O.OooO0o.OooO00o(this.f17137Oooo0o, this.f17138Oooo0oO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 0.2f, fFloatValue));
            FloatingActionButton floatingActionButton = OooO0o.this.f17128OooOo0o;
            float f = this.f17139Oooo0oo;
            floatingActionButton.setScaleX(((this.f17136Oooo - f) * fFloatValue) + f);
            FloatingActionButton floatingActionButton2 = OooO0o.this.f17128OooOo0o;
            float f2 = this.f17142OoooO00;
            floatingActionButton2.setScaleY(((this.f17136Oooo - f2) * fFloatValue) + f2);
            OooO0o oooO0o = OooO0o.this;
            float f3 = this.f17141OoooO0;
            float f4 = this.f17143OoooO0O;
            oooO0o.f17122OooOOo0 = Oooo000.OooO00o.OooO00o(f4, f3, fFloatValue, f3);
            oooO0o.OooO00o(Oooo000.OooO00o.OooO00o(f4, f3, fFloatValue, f3), this.f17140OoooO);
            OooO0o.this.f17128OooOo0o.setImageMatrix(this.f17140OoooO);
        }
    }

    public class OooO0OO extends OooOOO {
        public OooO0OO(OooO0o oooO0o) {
            super();
        }

        @Override // com.google.android.material.floatingactionbutton.OooO0o.OooOOO
        public final float OooO00o() {
            return ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.OooO0o$OooO0o, reason: collision with other inner class name */
    public class C0108OooO0o extends OooOOO {
        public C0108OooO0o() {
            super();
        }

        @Override // com.google.android.material.floatingactionbutton.OooO0o.OooOOO
        public final float OooO00o() {
            OooO0o oooO0o = OooO0o.this;
            return oooO0o.f17113OooO0oo + oooO0o.f17105OooO;
        }
    }

    public interface OooOO0 {
        void OooO00o();

        void OooO0O0();
    }

    public interface OooOO0O {
    }

    public abstract class OooOOO extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public boolean f17147Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public float f17148Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public float f17149Oooo0oo;

        public OooOOO() {
        }

        public abstract float OooO00o();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            OooO0o.this.OooOo0o((int) this.f17149Oooo0oo);
            this.f17147Oooo0o = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            if (!this.f17147Oooo0o) {
                MaterialShapeDrawable materialShapeDrawable = OooO0o.this.f17107OooO0O0;
                this.f17148Oooo0oO = materialShapeDrawable == null ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : materialShapeDrawable.f17510Oooo0o.f17545OooOOO;
                this.f17149Oooo0oo = OooO00o();
                this.f17147Oooo0o = true;
            }
            OooO0o oooO0o = OooO0o.this;
            float f = this.f17148Oooo0oO;
            oooO0o.OooOo0o((int) ((valueAnimator.getAnimatedFraction() * (this.f17149Oooo0oo - f)) + f));
        }
    }

    public class OooOOO0 extends OooOOO {
        public OooOOO0() {
            super();
        }

        @Override // com.google.android.material.floatingactionbutton.OooO0o.OooOOO
        public final float OooO00o() {
            return OooO0o.this.f17113OooO0oo;
        }
    }

    public OooO0o(FloatingActionButton floatingActionButton, p345o0OOO0Oo.OooO0o oooO0o) {
        this.f17128OooOo0o = floatingActionButton;
        this.f17124OooOo = oooO0o;
        OooOOOO oooOOOO = new OooOOOO();
        this.f17116OooOO0o = oooOOOO;
        oooOOOO.OooO00o(f17099OooOooo, OooO0Oo(new OooO()));
        oooOOOO.OooO00o(f17101Oooo000, OooO0Oo(new C0108OooO0o()));
        oooOOOO.OooO00o(f17102Oooo00O, OooO0Oo(new C0108OooO0o()));
        oooOOOO.OooO00o(f17103Oooo00o, OooO0Oo(new C0108OooO0o()));
        oooOOOO.OooO00o(f17100Oooo0, OooO0Oo(new OooOOO0()));
        oooOOOO.OooO00o(f17104Oooo0O0, OooO0Oo(new OooO0OO(this)));
        this.f17120OooOOOo = floatingActionButton.getRotation();
    }

    public final boolean OooO() {
        if (this.f17128OooOo0o.getVisibility() != 0) {
            return this.f17123OooOOoo == 2;
        }
        return this.f17123OooOOoo != 1;
    }

    public final void OooO00o(float f, @NonNull Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f17128OooOo0o.getDrawable();
        if (drawable == null || this.f17121OooOOo == 0) {
            return;
        }
        RectF rectF = this.f17129OooOoO;
        RectF rectF2 = this.f17131OooOoOO;
        rectF.set(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        int i = this.f17121OooOOo;
        rectF2.set(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, i, i);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i2 = this.f17121OooOOo;
        matrix.postScale(f, f, i2 / 2.0f, i2 / 2.0f);
    }

    @NonNull
    public final AnimatorSet OooO0O0(@NonNull OooOo00 oooOo00, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f17128OooOo0o, (Property<FloatingActionButton, Float>) View.ALPHA, f);
        oooOo00.OooO0o("opacity").OooO00o(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f17128OooOo0o, (Property<FloatingActionButton, Float>) View.SCALE_X, f2);
        oooOo00.OooO0o("scale").OooO00o(objectAnimatorOfFloat2);
        int i = Build.VERSION.SDK_INT;
        if (i == 26) {
            objectAnimatorOfFloat2.setEvaluator(new o0OO.OooO());
        }
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f17128OooOo0o, (Property<FloatingActionButton, Float>) View.SCALE_Y, f2);
        oooOo00.OooO0o("scale").OooO00o(objectAnimatorOfFloat3);
        if (i == 26) {
            objectAnimatorOfFloat3.setEvaluator(new o0OO.OooO());
        }
        arrayList.add(objectAnimatorOfFloat3);
        OooO00o(f3, this.f17133OooOoo0);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.f17128OooOo0o, new p338o0OO0o0O.OooOOO(), new OooO00o(), new Matrix(this.f17133OooOoo0));
        oooOo00.OooO0o("iconScale").OooO00o(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        p338o0OO0o0O.OooO.OooO00o(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet OooO0OO(float f, float f2, float f3) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new OooO0O0(this.f17128OooOo0o.getAlpha(), f, this.f17128OooOo0o.getScaleX(), f2, this.f17128OooOo0o.getScaleY(), this.f17122OooOOo0, f3, new Matrix(this.f17133OooOoo0)));
        arrayList.add(valueAnimatorOfFloat);
        p338o0OO0o0O.OooO.OooO00o(animatorSet, arrayList);
        animatorSet.setDuration(o0OOO00o.OooO00o.OooO0OO(this.f17128OooOo0o.getContext(), p337o0OO0o0.OooO0o.motionDurationLong1, this.f17128OooOo0o.getContext().getResources().getInteger(p337o0OO0o0.OooOOO.material_motion_duration_long_1)));
        animatorSet.setInterpolator(o0OOO00o.OooO00o.OooO0Oo(this.f17128OooOo0o.getContext(), p337o0OO0o0.OooO0o.motionEasingStandard, p338o0OO0o0O.OooO0o.f37973OooO0O0));
        return animatorSet;
    }

    @NonNull
    public final ValueAnimator OooO0Oo(@NonNull OooOOO oooOOO) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f17098OooOooO);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(oooOOO);
        valueAnimator.addUpdateListener(oooOOO);
        valueAnimator.setFloatValues(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 1.0f);
        return valueAnimator;
    }

    public void OooO0o(@NonNull Rect rect) {
        int sizeDimension = this.f17110OooO0o ? (this.f17115OooOO0O - this.f17128OooOo0o.getSizeDimension()) / 2 : 0;
        float fOooO0o0 = this.f17112OooO0oO ? OooO0o0() + this.f17114OooOO0 : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
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

    public final boolean OooO0oo() {
        if (this.f17128OooOo0o.getVisibility() == 0) {
            return this.f17123OooOOoo == 1;
        }
        return this.f17123OooOOoo != 2;
    }

    public void OooOO0() {
        throw null;
    }

    public void OooOO0O() {
        throw null;
    }

    public void OooOO0o(int[] iArr) {
        throw null;
    }

    public final void OooOOO() {
        ArrayList<OooOO0> arrayList = this.f17127OooOo0O;
        if (arrayList != null) {
            Iterator<OooOO0> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().OooO00o();
            }
        }
    }

    public void OooOOO0(float f, float f2, float f3) {
        throw null;
    }

    public final void OooOOOO() {
        ArrayList<OooOO0> arrayList = this.f17127OooOo0O;
        if (arrayList != null) {
            Iterator<OooOO0> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().OooO0O0();
            }
        }
    }

    public final void OooOOOo(float f) {
        this.f17122OooOOo0 = f;
        Matrix matrix = this.f17133OooOoo0;
        OooO00o(f, matrix);
        this.f17128OooOo0o.setImageMatrix(matrix);
    }

    public final void OooOOo(@NonNull com.google.android.material.shape.OooO00o oooO00o) {
        this.f17106OooO00o = oooO00o;
        MaterialShapeDrawable materialShapeDrawable = this.f17107OooO0O0;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearanceModel(oooO00o);
        }
        Object obj = this.f17108OooO0OO;
        if (obj instanceof o00000) {
            ((o00000) obj).setShapeAppearanceModel(oooO00o);
        }
        o0OO.OooO0OO oooO0OO = this.f17109OooO0Oo;
        if (oooO0OO != null) {
            oooO0OO.f37183OooOOOO = oooO00o;
            oooO0OO.invalidateSelf();
        }
    }

    public void OooOOo0(@Nullable ColorStateList colorStateList) {
        throw null;
    }

    public boolean OooOOoo() {
        throw null;
    }

    public void OooOo0() {
        throw null;
    }

    public final boolean OooOo00() {
        FloatingActionButton floatingActionButton = this.f17128OooOo0o;
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        return ViewCompat.OooOO0O.OooO0OO(floatingActionButton) && !this.f17128OooOo0o.isInEditMode();
    }

    public final void OooOo0O() {
        Rect rect = this.f17130OooOoO0;
        OooO0o(rect);
        o000OO0O.OooOOO0.OooO0Oo(this.f17111OooO0o0, "Didn't initialize content background");
        if (OooOOoo()) {
            InsetDrawable insetDrawable = new InsetDrawable((Drawable) this.f17111OooO0o0, rect.left, rect.top, rect.right, rect.bottom);
            FloatingActionButton.OooO0O0 oooO0O0 = (FloatingActionButton.OooO0O0) this.f17124OooOo;
            Objects.requireNonNull(oooO0O0);
            super/*android.view.View*/.setBackgroundDrawable(insetDrawable);
        } else {
            p345o0OOO0Oo.OooO0o oooO0o = this.f17124OooOo;
            LayerDrawable layerDrawable = this.f17111OooO0o0;
            FloatingActionButton.OooO0O0 oooO0O1 = (FloatingActionButton.OooO0O0) oooO0o;
            Objects.requireNonNull(oooO0O1);
            if (layerDrawable != null) {
                super/*android.view.View*/.setBackgroundDrawable(layerDrawable);
            }
        }
        p345o0OOO0Oo.OooO0o oooO0o2 = this.f17124OooOo;
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        FloatingActionButton.OooO0O0 oooO0O2 = (FloatingActionButton.OooO0O0) oooO0o2;
        FloatingActionButton.this.f17078OoooOo0.set(i, i2, i3, i4);
        FloatingActionButton floatingActionButton = FloatingActionButton.this;
        int i5 = floatingActionButton.f17083o000oOoO;
        floatingActionButton.setPadding(i + i5, i2 + i5, i3 + i5, i4 + i5);
    }

    public final void OooOo0o(float f) {
        MaterialShapeDrawable materialShapeDrawable = this.f17107OooO0O0;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.OooOOOO(f);
        }
    }
}

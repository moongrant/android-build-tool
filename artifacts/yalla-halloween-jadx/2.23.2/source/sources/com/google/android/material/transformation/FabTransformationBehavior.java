package com.google.android.material.transformation;

import OooOo.OooO0o;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OOo0;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o0O000.OooO;
import o0O000.OooOO0;
import o0O000.OooOOO;
import o0O000.OooOOOO;
import o0O000.OooOo00;
import p190o00o0O.OooOo;
import p272o0O0000o.o0000Ooo;
import p647o0ooOoOO.o3;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Rect f17737OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final RectF f17738OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int[] f17739OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final RectF f17740OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f17741OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f17742OooO0oo;

    public class OooO00o extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f17743OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ View f17744OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ View f17745OooO0o0;

        public OooO00o(boolean z, View view, View view2) {
            this.f17743OooO0Oo = z;
            this.f17745OooO0o0 = view;
            this.f17744OooO0o = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f17743OooO0Oo) {
                return;
            }
            this.f17745OooO0o0.setVisibility(4);
            View view = this.f17744OooO0o;
            view.setAlpha(1.0f);
            view.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            if (this.f17743OooO0Oo) {
                this.f17745OooO0o0.setVisibility(0);
                View view = this.f17744OooO0o;
                view.setAlpha(0.0f);
                view.setVisibility(4);
            }
        }
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public OooOOO f17746OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public OooOo00 f17747OooO0O0;
    }

    public FabTransformationBehavior() {
        this.f17737OooO0OO = new Rect();
        this.f17738OooO0Oo = new RectF();
        this.f17740OooO0o0 = new RectF();
        this.f17739OooO0o = new int[2];
    }

    @NonNull
    public static Pair OooOo0O(float f, float f2, boolean z, @NonNull OooO0O0 oooO0O0) {
        OooOOOO oooOOOOOooO0o;
        OooOOOO oooOOOOOooO0o2;
        if (f == 0.0f || f2 == 0.0f) {
            oooOOOOOooO0o = oooO0O0.f17746OooO00o.OooO0o("translationXLinear");
            oooOOOOOooO0o2 = oooO0O0.f17746OooO00o.OooO0o("translationYLinear");
        } else if ((!z || f2 >= 0.0f) && (z || f2 <= 0.0f)) {
            oooOOOOOooO0o = oooO0O0.f17746OooO00o.OooO0o("translationXCurveDownwards");
            oooOOOOOooO0o2 = oooO0O0.f17746OooO00o.OooO0o("translationYCurveDownwards");
        } else {
            oooOOOOOooO0o = oooO0O0.f17746OooO00o.OooO0o("translationXCurveUpwards");
            oooOOOOOooO0o2 = oooO0O0.f17746OooO00o.OooO0o("translationYCurveUpwards");
        }
        return new Pair(oooOOOOOooO0o, oooOOOOOooO0o2);
    }

    public static float OooOoO0(@NonNull OooO0O0 oooO0O0, @NonNull OooOOOO oooOOOO, float f) {
        long j = oooOOOO.f40893OooO00o;
        OooOOOO oooOOOOOooO0o = oooO0O0.f17746OooO00o.OooO0o("expansion");
        float interpolation = oooOOOO.OooO0O0().getInterpolation((((oooOOOOOooO0o.f40893OooO00o + oooOOOOOooO0o.f40894OooO0O0) + 17) - j) / oooOOOO.f40894OooO0O0);
        LinearInterpolator linearInterpolator = o0O000.OooO0O0.f40880OooO00o;
        return OooO0o.OooO00o(0.0f, f, interpolation, f);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @CallSuper
    public final boolean OooO0O0(@NonNull View view, @NonNull View view2) {
        int expandedComponentIdHint;
        if (view.getVisibility() != 8) {
            return (view2 instanceof FloatingActionButton) && ((expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint()) == 0 || expandedComponentIdHint == view.getId());
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @CallSuper
    public final void OooO0OO(@NonNull CoordinatorLayout.OooO0o oooO0o) {
        if (oooO0o.f5224OooO0oo == 0) {
            oooO0o.f5224OooO0oo = 80;
        }
    }

    public final float OooOo(@NonNull View view, @NonNull View view2, @NonNull OooOo00 oooOo00) {
        RectF rectF = this.f17738OooO0Oo;
        RectF rectF2 = this.f17740OooO0o0;
        OooOoO(view, rectF);
        rectF.offset(this.f17741OooO0oO, this.f17742OooO0oo);
        OooOoO(view2, rectF2);
        oooOo00.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x019e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0362  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    @NonNull
    public final AnimatorSet OooOo0(@NonNull View view, @NonNull View view2, boolean z, boolean z2) {
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        ObjectAnimator objectAnimatorOfFloat3;
        ArrayList arrayList;
        OooO0O0 oooO0O0;
        ArrayList arrayList2;
        AnimatorSet animatorSetOooO00o;
        ArrayList arrayList3;
        boolean z3;
        ObjectAnimator objectAnimatorOfInt;
        OooO0O0 oooO0O1;
        int i;
        ObjectAnimator objectAnimatorOfFloat4;
        ObjectAnimator objectAnimatorOfInt2;
        OooO0O0 oooO0O0OooOoOO = OooOoOO(view2.getContext(), z);
        if (z) {
            this.f17741OooO0oO = view.getTranslationX();
            this.f17742OooO0oo = view.getTranslationY();
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        float fOooO = ViewCompat.OooOOO.OooO(view2) - ViewCompat.OooOOO.OooO(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-fOooO);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -fOooO);
        }
        oooO0O0OooOoOO.f17746OooO00o.OooO0o("elevation").OooO00o(objectAnimatorOfFloat);
        arrayList4.add(objectAnimatorOfFloat);
        RectF rectF = this.f17738OooO0Oo;
        float fOooOo0o = OooOo0o(view, view2, oooO0O0OooOoOO.f17747OooO0O0);
        float fOooOo = OooOo(view, view2, oooO0O0OooOoOO.f17747OooO0O0);
        Pair pairOooOo0O = OooOo0O(fOooOo0o, fOooOo, z, oooO0O0OooOoOO);
        OooOOOO oooOOOO = (OooOOOO) pairOooOo0O.first;
        OooOOOO oooOOOO2 = (OooOOOO) pairOooOo0O.second;
        RectF rectF2 = this.f17740OooO0o0;
        Rect rect = this.f17737OooO0OO;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-fOooOo0o);
                view2.setTranslationY(-fOooOo);
            }
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            float fOooOoO0 = OooOoO0(oooO0O0OooOoOO, oooOOOO, -fOooOo0o);
            float fOooOoO1 = OooOoO0(oooO0O0OooOoOO, oooOOOO2, -fOooOo);
            view2.getWindowVisibleDisplayFrame(rect);
            rectF.set(rect);
            OooOoO(view2, rectF2);
            rectF2.offset(fOooOoO0, fOooOoO1);
            rectF2.intersect(rectF);
            rectF.set(rectF2);
            objectAnimatorOfFloat3 = objectAnimatorOfFloat6;
            objectAnimatorOfFloat2 = objectAnimatorOfFloat5;
        } else {
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fOooOo0o);
            objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fOooOo);
        }
        oooOOOO.OooO00o(objectAnimatorOfFloat2);
        oooOOOO2.OooO00o(objectAnimatorOfFloat3);
        arrayList4.add(objectAnimatorOfFloat2);
        arrayList4.add(objectAnimatorOfFloat3);
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        float fOooOo0o2 = OooOo0o(view, view2, oooO0O0OooOoOO.f17747OooO0O0);
        float fOooOo2 = OooOo(view, view2, oooO0O0OooOoOO.f17747OooO0O0);
        Pair pairOooOo0O2 = OooOo0O(fOooOo0o2, fOooOo2, z, oooO0O0OooOoOO);
        OooOOOO oooOOOO3 = (OooOOOO) pairOooOo0O2.first;
        OooOOOO oooOOOO4 = (OooOOOO) pairOooOo0O2.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        fArr[0] = z ? fOooOo0o2 : this.f17741OooO0oO;
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        fArr2[0] = z ? fOooOo2 : this.f17742OooO0oo;
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fArr2);
        oooOOOO3.OooO00o(objectAnimatorOfFloat7);
        oooOOOO4.OooO00o(objectAnimatorOfFloat8);
        arrayList4.add(objectAnimatorOfFloat7);
        arrayList4.add(objectAnimatorOfFloat8);
        boolean z4 = view2 instanceof com.google.android.material.circularreveal.OooO0O0;
        if (z4 && (view instanceof ImageView)) {
            com.google.android.material.circularreveal.OooO0O0 oooO0O2 = (com.google.android.material.circularreveal.OooO0O0) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                arrayList = arrayList5;
            } else {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    objectAnimatorOfInt2 = ObjectAnimator.ofInt(drawable, OooOO0.f40886OooO00o, 0);
                } else {
                    objectAnimatorOfInt2 = ObjectAnimator.ofInt(drawable, OooOO0.f40886OooO00o, 255);
                }
                objectAnimatorOfInt2.addUpdateListener(new com.google.android.material.transformation.OooO00o(view2));
                oooO0O0OooOoOO.f17746OooO00o.OooO0o("iconFade").OooO00o(objectAnimatorOfInt2);
                arrayList4.add(objectAnimatorOfInt2);
                com.google.android.material.transformation.OooO0O0 oooO0O3 = new com.google.android.material.transformation.OooO0O0(oooO0O2, drawable);
                arrayList = arrayList5;
                arrayList.add(oooO0O3);
            }
        } else {
            arrayList = arrayList5;
        }
        if (z4) {
            com.google.android.material.circularreveal.OooO0O0 oooO0O4 = (com.google.android.material.circularreveal.OooO0O0) view2;
            OooOo00 oooOo00 = oooO0O0OooOoOO.f17747OooO0O0;
            OooOoO(view, rectF);
            rectF.offset(this.f17741OooO0oO, this.f17742OooO0oo);
            OooOoO(view2, rectF2);
            rectF2.offset(-OooOo0o(view, view2, oooOo00), 0.0f);
            float fCenterX = rectF.centerX() - rectF2.left;
            OooOo00 oooOo01 = oooO0O0OooOoOO.f17747OooO0O0;
            OooOoO(view, rectF);
            rectF.offset(this.f17741OooO0oO, this.f17742OooO0oo);
            OooOoO(view2, rectF2);
            rectF2.offset(0.0f, -OooOo(view, view2, oooOo01));
            float fCenterY = rectF.centerY() - rectF2.top;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (ViewCompat.OooOO0O.OooO0OO(floatingActionButton)) {
                rect.set(0, 0, floatingActionButton.getWidth(), floatingActionButton.getHeight());
                floatingActionButton.OooOO0O(rect);
            }
            float fWidth2 = rect.width() / 2.0f;
            OooOOOO oooOOOOOooO0o = oooO0O0OooOoOO.f17746OooO00o.OooO0o("expansion");
            if (z) {
                if (!z2) {
                    oooO0O4.setRevealInfo(new com.google.android.material.circularreveal.OooO0O0.OooO0o(fCenterX, fCenterY, fWidth2));
                }
                if (z2) {
                    fWidth2 = oooO0O4.getRevealInfo().f16328OooO0OO;
                }
                animatorSetOooO00o = com.google.android.material.circularreveal.OooO00o.OooO00o(oooO0O4, fCenterX, fCenterY, o0O00OO.OooO00o.OooO00o(fCenterX, fCenterY, fWidth, fHeight));
                animatorSetOooO00o.addListener(new OooO0OO(oooO0O4));
                long j = oooOOOOOooO0o.f40893OooO00o;
                int i2 = (int) fCenterX;
                int i3 = (int) fCenterY;
                if (j > 0) {
                    Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view2, i2, i3, fWidth2, fWidth2);
                    animatorCreateCircularReveal.setStartDelay(0L);
                    animatorCreateCircularReveal.setDuration(j);
                    arrayList4.add(animatorCreateCircularReveal);
                }
                oooO0O0 = oooO0O0OooOoOO;
                arrayList2 = arrayList;
            } else {
                float f = oooO0O4.getRevealInfo().f16328OooO0OO;
                AnimatorSet animatorSetOooO00o2 = com.google.android.material.circularreveal.OooO00o.OooO00o(oooO0O4, fCenterX, fCenterY, fWidth2);
                long j2 = oooOOOOOooO0o.f40893OooO00o;
                int i4 = (int) fCenterX;
                int i5 = (int) fCenterY;
                ArrayList arrayList6 = arrayList;
                long jMax = 0;
                if (j2 > 0) {
                    Animator animatorCreateCircularReveal2 = ViewAnimationUtils.createCircularReveal(view2, i4, i5, f, f);
                    animatorCreateCircularReveal2.setStartDelay(0L);
                    animatorCreateCircularReveal2.setDuration(j2);
                    arrayList4.add(animatorCreateCircularReveal2);
                }
                OooOo<String, OooOOOO> oooOo = oooO0O0OooOoOO.f17746OooO00o.f40888OooO00o;
                int i6 = oooOo.f38568OooO0o;
                int i7 = 0;
                while (i7 < i6) {
                    OooOo<String, OooOOOO> oooOo2 = oooOo;
                    OooOOOO oooOOOOOooOO0o = oooOo.OooOO0o(i7);
                    jMax = Math.max(jMax, oooOOOOOooOO0o.f40893OooO00o + oooOOOOOooOO0o.f40894OooO0O0);
                    i7++;
                    arrayList6 = arrayList6;
                    oooOo = oooOo2;
                    i6 = i6;
                    oooO0O0OooOoOO = oooO0O0OooOoOO;
                }
                oooO0O0 = oooO0O0OooOoOO;
                arrayList2 = arrayList6;
                long j3 = oooOOOOOooO0o.f40893OooO00o + oooOOOOOooO0o.f40894OooO0O0;
                if (j3 < jMax) {
                    Animator animatorCreateCircularReveal3 = ViewAnimationUtils.createCircularReveal(view2, i4, i5, fWidth2, fWidth2);
                    animatorCreateCircularReveal3.setStartDelay(j3);
                    animatorCreateCircularReveal3.setDuration(jMax - j3);
                    arrayList4.add(animatorCreateCircularReveal3);
                }
                animatorSetOooO00o = animatorSetOooO00o2;
            }
            oooOOOOOooO0o.OooO00o(animatorSetOooO00o);
            arrayList4.add(animatorSetOooO00o);
            arrayList3 = arrayList2;
            arrayList3.add(new o3(oooO0O4));
        } else {
            oooO0O0 = oooO0O0OooOoOO;
            arrayList3 = arrayList;
        }
        if (z4) {
            com.google.android.material.circularreveal.OooO0O0 oooO0O5 = (com.google.android.material.circularreveal.OooO0O0) view2;
            WeakHashMap<View, o000OOo0> weakHashMap2 = ViewCompat.f5341OooO00o;
            ColorStateList colorStateListOooO0oO = ViewCompat.OooOOO.OooO0oO(view);
            int colorForState = colorStateListOooO0oO != null ? colorStateListOooO0oO.getColorForState(view.getDrawableState(), colorStateListOooO0oO.getDefaultColor()) : 0;
            int i8 = 16777215 & colorForState;
            z3 = z;
            if (z3) {
                if (!z2) {
                    oooO0O5.setCircularRevealScrimColor(colorForState);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(oooO0O5, com.google.android.material.circularreveal.OooO0O0.OooO0OO.f16325OooO00o, i8);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(oooO0O5, com.google.android.material.circularreveal.OooO0O0.OooO0OO.f16325OooO00o, colorForState);
            }
            objectAnimatorOfInt.setEvaluator(o0O000.OooO0o.f40885OooO00o);
            oooO0O1 = oooO0O0;
            oooO0O1.f17746OooO00o.OooO0o("color").OooO00o(objectAnimatorOfInt);
            arrayList4.add(objectAnimatorOfInt);
        } else {
            z3 = z;
            oooO0O1 = oooO0O0;
        }
        boolean z5 = view2 instanceof ViewGroup;
        if (z5) {
            View viewFindViewById = view2.findViewById(o0000Ooo.mtrl_child_content_container);
            ViewGroup viewGroup = null;
            if (viewFindViewById != null) {
                if (viewFindViewById instanceof ViewGroup) {
                    viewGroup = (ViewGroup) viewFindViewById;
                }
            } else if ((view2 instanceof TransformationChildLayout) || (view2 instanceof TransformationChildCard)) {
                View childAt = ((ViewGroup) view2).getChildAt(0);
                if (childAt instanceof ViewGroup) {
                    viewGroup = (ViewGroup) childAt;
                }
            } else if (z5) {
                viewGroup = (ViewGroup) view2;
            }
            if (viewGroup == null) {
                i = 0;
            } else {
                if (z3) {
                    if (!z2) {
                        OooO.f40879OooO00o.set(viewGroup, Float.valueOf(0.0f));
                    }
                    i = 0;
                    objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewGroup, OooO.f40879OooO00o, 1.0f);
                } else {
                    i = 0;
                    objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewGroup, OooO.f40879OooO00o, 0.0f);
                }
                oooO0O1.f17746OooO00o.OooO0o("contentFade").OooO00o(objectAnimatorOfFloat4);
                arrayList4.add(objectAnimatorOfFloat4);
            }
        } else {
            i = 0;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        o0O000.OooO0OO.OooO00o(animatorSet, arrayList4);
        animatorSet.addListener(new OooO00o(z3, view2, view));
        int size = arrayList3.size();
        for (int i9 = i; i9 < size; i9++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList3.get(i9));
        }
        return animatorSet;
    }

    public final float OooOo0o(@NonNull View view, @NonNull View view2, @NonNull OooOo00 oooOo00) {
        RectF rectF = this.f17738OooO0Oo;
        RectF rectF2 = this.f17740OooO0o0;
        OooOoO(view, rectF);
        rectF.offset(this.f17741OooO0oO, this.f17742OooO0oo);
        OooOoO(view2, rectF2);
        oooOo00.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public final void OooOoO(@NonNull View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f17739OooO0o;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public abstract OooO0O0 OooOoOO(Context context, boolean z);

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17737OooO0OO = new Rect();
        this.f17738OooO0Oo = new RectF();
        this.f17740OooO0o0 = new RectF();
        this.f17739OooO0o = new int[2];
    }
}

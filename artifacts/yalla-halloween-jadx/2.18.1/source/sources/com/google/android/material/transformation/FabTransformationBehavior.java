package com.google.android.material.transformation;

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
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;
import o000O0O0.o00000O;
import p021OooOooo.o00O0O;
import p031OoooO.o0000O;
import p338o0OO0o0O.OooO;
import p338o0OO0o0O.OooO0o;
import p338o0OO0o0O.OooOO0;
import p338o0OO0o0O.OooOO0O;
import p338o0OO0o0O.OooOOO0;
import p338o0OO0o0O.OooOo;
import p338o0OO0o0O.OooOo00;
import p340o0OO0oOO.o0OOO0OO;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Rect f18092OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final RectF f18093OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int[] f18094OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final RectF f18095OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float f18096OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public float f18097OooO0oo;

    public class OooO00o extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ boolean f18098Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ View f18099Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ View f18100Oooo0oo;

        public OooO00o(boolean z, View view, View view2) {
            this.f18098Oooo0o = z;
            this.f18099Oooo0oO = view;
            this.f18100Oooo0oo = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f18098Oooo0o) {
                return;
            }
            this.f18099Oooo0oO.setVisibility(4);
            this.f18100Oooo0oo.setAlpha(1.0f);
            this.f18100Oooo0oo.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            if (this.f18098Oooo0o) {
                this.f18099Oooo0oO.setVisibility(0);
                this.f18100Oooo0oo.setAlpha(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                this.f18100Oooo0oo.setVisibility(4);
            }
        }
    }

    public static class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public OooOo00 f18101OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public o00O0O f18102OooO0O0;
    }

    public FabTransformationBehavior() {
        this.f18092OooO0OO = new Rect();
        this.f18093OooO0Oo = new RectF();
        this.f18095OooO0o0 = new RectF();
        this.f18094OooO0o = new int[2];
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @CallSuper
    public final boolean OooO0O0(@NonNull View view, @NonNull View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @CallSuper
    public final void OooO0OO(@NonNull CoordinatorLayout.OooO0o oooO0o) {
        if (oooO0o.f7768OooO0oo == 0) {
            oooO0o.f7768OooO0oo = 80;
        }
    }

    public final float OooOo(@NonNull View view, @NonNull View view2, @NonNull o00O0O o00o0o2) {
        RectF rectF = this.f18093OooO0Oo;
        RectF rectF2 = this.f18095OooO0o0;
        OooOo0O(view, rectF);
        OooOoOO(view2, rectF2);
        Objects.requireNonNull(o00o0o2);
        return (rectF2.centerX() - rectF.centerX()) + ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x03a2 A[LOOP:0: B:100:0x03a0->B:101:0x03a2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x018c  */
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
        ArrayList arrayList3;
        Animator animatorOooO00o;
        OooOo oooOo;
        ArrayList arrayList4;
        boolean z3;
        ObjectAnimator objectAnimatorOfInt;
        OooO0O0 oooO0O1;
        ViewGroup viewGroupOooOoo;
        int i;
        ObjectAnimator objectAnimatorOfFloat4;
        AnimatorSet animatorSet;
        int size;
        ObjectAnimator objectAnimatorOfInt2;
        OooO0O0 oooO0O0OooOoo0 = OooOoo0(view2.getContext(), z);
        if (z) {
            this.f18096OooO0oO = view.getTranslationX();
            this.f18097OooO0oo = view.getTranslationY();
        }
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        float fOooO = ViewCompat.OooOOO.OooO(view2) - ViewCompat.OooOOO.OooO(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-fOooO);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -fOooO);
        }
        oooO0O0OooOoo0.f18101OooO00o.OooO0o("elevation").OooO00o(objectAnimatorOfFloat);
        arrayList5.add(objectAnimatorOfFloat);
        RectF rectF = this.f18093OooO0Oo;
        float fOooOo = OooOo(view, view2, oooO0O0OooOoo0.f18102OooO0O0);
        float fOooOoO0 = OooOoO0(view, view2, oooO0O0OooOoo0.f18102OooO0O0);
        Pair<OooOo, OooOo> pairOooOo0o = OooOo0o(fOooOo, fOooOoO0, z, oooO0O0OooOoo0);
        OooOo oooOo2 = (OooOo) pairOooOo0o.first;
        OooOo oooOo3 = (OooOo) pairOooOo0o.second;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-fOooOo);
                view2.setTranslationY(-fOooOoO0);
            }
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            float fOooOoO = OooOoO(oooO0O0OooOoo0, oooOo2, -fOooOo);
            float fOooOoO2 = OooOoO(oooO0O0OooOoo0, oooOo3, -fOooOoO0);
            Rect rect = this.f18092OooO0OO;
            view2.getWindowVisibleDisplayFrame(rect);
            RectF rectF2 = this.f18093OooO0Oo;
            rectF2.set(rect);
            RectF rectF3 = this.f18095OooO0o0;
            OooOoOO(view2, rectF3);
            rectF3.offset(fOooOoO, fOooOoO2);
            rectF3.intersect(rectF2);
            rectF.set(rectF3);
            objectAnimatorOfFloat3 = objectAnimatorOfFloat6;
            objectAnimatorOfFloat2 = objectAnimatorOfFloat5;
        } else {
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fOooOo);
            objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fOooOoO0);
        }
        oooOo2.OooO00o(objectAnimatorOfFloat2);
        oooOo3.OooO00o(objectAnimatorOfFloat3);
        arrayList5.add(objectAnimatorOfFloat2);
        arrayList5.add(objectAnimatorOfFloat3);
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        float fOooOo2 = OooOo(view, view2, oooO0O0OooOoo0.f18102OooO0O0);
        float fOooOoO1 = OooOoO0(view, view2, oooO0O0OooOoo0.f18102OooO0O0);
        Pair<OooOo, OooOo> pairOooOo0o2 = OooOo0o(fOooOo2, fOooOoO1, z, oooO0O0OooOoo0);
        OooOo oooOo4 = (OooOo) pairOooOo0o2.first;
        OooOo oooOo5 = (OooOo) pairOooOo0o2.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            fOooOo2 = this.f18096OooO0oO;
        }
        fArr[0] = fOooOo2;
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            fOooOoO1 = this.f18097OooO0oo;
        }
        fArr2[0] = fOooOoO1;
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fArr2);
        oooOo4.OooO00o(objectAnimatorOfFloat7);
        oooOo5.OooO00o(objectAnimatorOfFloat8);
        arrayList5.add(objectAnimatorOfFloat7);
        arrayList5.add(objectAnimatorOfFloat8);
        boolean z4 = view2 instanceof com.google.android.material.circularreveal.OooO0O0;
        if (z4 && (view instanceof ImageView)) {
            com.google.android.material.circularreveal.OooO0O0 oooO0O2 = (com.google.android.material.circularreveal.OooO0O0) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                arrayList = arrayList6;
            } else {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
                    }
                    objectAnimatorOfInt2 = ObjectAnimator.ofInt(drawable, OooOOO0.f37980OooO00o, 0);
                } else {
                    objectAnimatorOfInt2 = ObjectAnimator.ofInt(drawable, OooOOO0.f37980OooO00o, KotlinVersion.MAX_COMPONENT_VALUE);
                }
                objectAnimatorOfInt2.addUpdateListener(new com.google.android.material.transformation.OooO00o(view2));
                oooO0O0OooOoo0.f18101OooO00o.OooO0o("iconFade").OooO00o(objectAnimatorOfInt2);
                arrayList5.add(objectAnimatorOfInt2);
                com.google.android.material.transformation.OooO0O0 oooO0O3 = new com.google.android.material.transformation.OooO0O0(oooO0O2, drawable);
                arrayList = arrayList6;
                arrayList.add(oooO0O3);
            }
        } else {
            arrayList = arrayList6;
        }
        if (z4) {
            com.google.android.material.circularreveal.OooO0O0 oooO0O4 = (com.google.android.material.circularreveal.OooO0O0) view2;
            o00O0O o00o0o2 = oooO0O0OooOoo0.f18102OooO0O0;
            RectF rectF4 = this.f18093OooO0Oo;
            RectF rectF5 = this.f18095OooO0o0;
            OooOo0O(view, rectF4);
            OooOoOO(view2, rectF5);
            rectF5.offset(-OooOo(view, view2, o00o0o2), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            float fCenterX = rectF4.centerX() - rectF5.left;
            o00O0O o00o0o3 = oooO0O0OooOoo0.f18102OooO0O0;
            RectF rectF6 = this.f18093OooO0Oo;
            RectF rectF7 = this.f18095OooO0o0;
            OooOo0O(view, rectF6);
            OooOoOO(view2, rectF7);
            rectF7.offset(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, -OooOoO0(view, view2, o00o0o3));
            float fCenterY = rectF6.centerY() - rectF7.top;
            ((FloatingActionButton) view).OooO0oO(this.f18092OooO0OO);
            float fWidth2 = this.f18092OooO0OO.width() / 2.0f;
            OooOo oooOoOooO0o = oooO0O0OooOoo0.f18101OooO00o.OooO0o("expansion");
            if (z) {
                if (!z2) {
                    oooO0O4.setRevealInfo(new com.google.android.material.circularreveal.OooO0O0.OooO0o(fCenterX, fCenterY, fWidth2));
                }
                if (z2) {
                    fWidth2 = oooO0O4.getRevealInfo().f16864OooO0OO;
                }
                animatorOooO00o = com.google.android.material.circularreveal.OooO00o.OooO00o(oooO0O4, fCenterX, fCenterY, o0000O.OooO0OO(fCenterX, fCenterY, fWidth, fHeight));
                animatorOooO00o.addListener(new OooO0OO(oooO0O4));
                long j = oooOoOooO0o.f37984OooO00o;
                int i2 = (int) fCenterX;
                int i3 = (int) fCenterY;
                if (j > 0) {
                    Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view2, i2, i3, fWidth2, fWidth2);
                    animatorCreateCircularReveal.setStartDelay(0L);
                    animatorCreateCircularReveal.setDuration(j);
                    arrayList5.add(animatorCreateCircularReveal);
                }
                arrayList3 = arrayList5;
                arrayList2 = arrayList;
                oooOo = oooOoOooO0o;
                oooO0O0 = oooO0O0OooOoo0;
            } else {
                float f = oooO0O4.getRevealInfo().f16864OooO0OO;
                Animator animatorOooO00o2 = com.google.android.material.circularreveal.OooO00o.OooO00o(oooO0O4, fCenterX, fCenterY, fWidth2);
                long j2 = oooOoOooO0o.f37984OooO00o;
                int i4 = (int) fCenterX;
                int i5 = (int) fCenterY;
                ArrayList arrayList7 = arrayList;
                if (j2 > 0) {
                    Animator animatorCreateCircularReveal2 = ViewAnimationUtils.createCircularReveal(view2, i4, i5, f, f);
                    animatorCreateCircularReveal2.setStartDelay(0L);
                    animatorCreateCircularReveal2.setDuration(j2);
                    arrayList5.add(animatorCreateCircularReveal2);
                }
                long j3 = oooOoOooO0o.f37984OooO00o;
                long j4 = oooOoOooO0o.f37985OooO0O0;
                OooOo00 oooOo00 = oooO0O0OooOoo0.f18101OooO00o;
                int i6 = oooOo00.f37989OooO00o.f421Oooo0oo;
                oooO0O0 = oooO0O0OooOoo0;
                arrayList2 = arrayList7;
                int i7 = 0;
                long jMax = 0;
                while (i7 < i6) {
                    int i8 = i6;
                    OooOo oooOoOooOOO0 = oooOo00.f37989OooO00o.OooOOO0(i7);
                    jMax = Math.max(jMax, oooOoOooOOO0.f37984OooO00o + oooOoOooOOO0.f37985OooO0O0);
                    i7++;
                    i6 = i8;
                    oooOoOooO0o = oooOoOooO0o;
                    oooOo00 = oooOo00;
                    arrayList5 = arrayList5;
                }
                ArrayList arrayList8 = arrayList5;
                OooOo oooOo6 = oooOoOooO0o;
                long j5 = j3 + j4;
                if (j5 < jMax) {
                    Animator animatorCreateCircularReveal3 = ViewAnimationUtils.createCircularReveal(view2, i4, i5, fWidth2, fWidth2);
                    animatorCreateCircularReveal3.setStartDelay(j5);
                    animatorCreateCircularReveal3.setDuration(jMax - j5);
                    arrayList3 = arrayList8;
                    arrayList3.add(animatorCreateCircularReveal3);
                } else {
                    arrayList3 = arrayList8;
                }
                animatorOooO00o = animatorOooO00o2;
                oooOo = oooOo6;
            }
            oooOo.OooO00o(animatorOooO00o);
            arrayList3.add(animatorOooO00o);
            arrayList4 = arrayList2;
            arrayList4.add(new o0OOO0OO(oooO0O4));
        } else {
            oooO0O0 = oooO0O0OooOoo0;
            arrayList3 = arrayList5;
            arrayList4 = arrayList;
        }
        if (z4) {
            com.google.android.material.circularreveal.OooO0O0 oooO0O5 = (com.google.android.material.circularreveal.OooO0O0) view2;
            WeakHashMap<View, o00000O> weakHashMap2 = ViewCompat.f7870OooO00o;
            ColorStateList colorStateListOooO0oO = ViewCompat.OooOOO.OooO0oO(view);
            int colorForState = colorStateListOooO0oO != null ? colorStateListOooO0oO.getColorForState(view.getDrawableState(), colorStateListOooO0oO.getDefaultColor()) : 0;
            int i9 = 16777215 & colorForState;
            z3 = z;
            if (z3) {
                if (!z2) {
                    oooO0O5.setCircularRevealScrimColor(colorForState);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(oooO0O5, com.google.android.material.circularreveal.OooO0O0.OooO0OO.f16861OooO00o, i9);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(oooO0O5, com.google.android.material.circularreveal.OooO0O0.OooO0OO.f16861OooO00o, colorForState);
            }
            objectAnimatorOfInt.setEvaluator(OooOO0.f37977OooO00o);
            oooO0O1 = oooO0O0;
            oooO0O1.f18101OooO00o.OooO0o("color").OooO00o(objectAnimatorOfInt);
            arrayList3.add(objectAnimatorOfInt);
        } else {
            z3 = z;
            oooO0O1 = oooO0O0;
        }
        if (view2 instanceof ViewGroup) {
            View viewFindViewById = view2.findViewById(p337o0OO0o0.OooOOO0.mtrl_child_content_container);
            if (viewFindViewById != null) {
                viewGroupOooOoo = OooOoo(viewFindViewById);
            } else {
                viewGroupOooOoo = ((view2 instanceof TransformationChildLayout) || (view2 instanceof TransformationChildCard)) ? OooOoo(((ViewGroup) view2).getChildAt(0)) : OooOoo(view2);
            }
            if (viewGroupOooOoo != null) {
                if (z3) {
                    if (!z2) {
                        OooOO0O.f37978OooO00o.set(viewGroupOooOoo, Float.valueOf(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
                    }
                    i = 0;
                    objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewGroupOooOoo, OooOO0O.f37978OooO00o, 1.0f);
                } else {
                    i = 0;
                    objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewGroupOooOoo, OooOO0O.f37978OooO00o, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                }
                oooO0O1.f18101OooO00o.OooO0o("contentFade").OooO00o(objectAnimatorOfFloat4);
                arrayList3.add(objectAnimatorOfFloat4);
            }
            animatorSet = new AnimatorSet();
            OooO.OooO00o(animatorSet, arrayList3);
            animatorSet.addListener(new OooO00o(z3, view2, view));
            size = arrayList4.size();
            while (i < size) {
                animatorSet.addListener((Animator.AnimatorListener) arrayList4.get(i));
                i++;
            }
            return animatorSet;
        }
        i = 0;
        animatorSet = new AnimatorSet();
        OooO.OooO00o(animatorSet, arrayList3);
        animatorSet.addListener(new OooO00o(z3, view2, view));
        size = arrayList4.size();
        while (i < size) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList4.get(i));
            i++;
        }
        return animatorSet;
    }

    public final void OooOo0O(@NonNull View view, @NonNull RectF rectF) {
        OooOoOO(view, rectF);
        rectF.offset(this.f18096OooO0oO, this.f18097OooO0oo);
    }

    @NonNull
    public final Pair<OooOo, OooOo> OooOo0o(float f, float f2, boolean z, @NonNull OooO0O0 oooO0O0) {
        OooOo oooOoOooO0o;
        OooOo oooOoOooO0o2;
        if (f == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || f2 == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            oooOoOooO0o = oooO0O0.f18101OooO00o.OooO0o("translationXLinear");
            oooOoOooO0o2 = oooO0O0.f18101OooO00o.OooO0o("translationYLinear");
        } else if ((!z || f2 >= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) && (z || f2 <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE)) {
            oooOoOooO0o = oooO0O0.f18101OooO00o.OooO0o("translationXCurveDownwards");
            oooOoOooO0o2 = oooO0O0.f18101OooO00o.OooO0o("translationYCurveDownwards");
        } else {
            oooOoOooO0o = oooO0O0.f18101OooO00o.OooO0o("translationXCurveUpwards");
            oooOoOooO0o2 = oooO0O0.f18101OooO00o.OooO0o("translationYCurveUpwards");
        }
        return new Pair<>(oooOoOooO0o, oooOoOooO0o2);
    }

    public final float OooOoO(@NonNull OooO0O0 oooO0O0, @NonNull OooOo oooOo, float f) {
        long j = oooOo.f37984OooO00o;
        long j2 = oooOo.f37985OooO0O0;
        OooOo oooOoOooO0o = oooO0O0.f18101OooO00o.OooO0o("expansion");
        float interpolation = oooOo.OooO0O0().getInterpolation((((oooOoOooO0o.f37984OooO00o + oooOoOooO0o.f37985OooO0O0) + 17) - j) / j2);
        LinearInterpolator linearInterpolator = OooO0o.f37972OooO00o;
        return Oooo000.OooO00o.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f, interpolation, f);
    }

    public final float OooOoO0(@NonNull View view, @NonNull View view2, @NonNull o00O0O o00o0o2) {
        RectF rectF = this.f18093OooO0Oo;
        RectF rectF2 = this.f18095OooO0o0;
        OooOo0O(view, rectF);
        OooOoOO(view2, rectF2);
        Objects.requireNonNull(o00o0o2);
        return (rectF2.centerY() - rectF.centerY()) + ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    public final void OooOoOO(@NonNull View view, RectF rectF) {
        rectF.set(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, view.getWidth(), view.getHeight());
        int[] iArr = this.f18094OooO0o;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    @Nullable
    public final ViewGroup OooOoo(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    public abstract OooO0O0 OooOoo0(Context context, boolean z);

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18092OooO0OO = new Rect();
        this.f18093OooO0Oo = new RectF();
        this.f18095OooO0o0 = new RectF();
        this.f18094OooO0o = new int[2];
    }
}

package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import p338o0OO0o0O.OooO;
import p338o0OO0o0O.OooOo;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooOo f18103OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOo f18104OooO0Oo;

    public class OooO00o extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ boolean f18105Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ View f18106Oooo0oO;

        public OooO00o(boolean z, View view) {
            this.f18105Oooo0o = z;
            this.f18106Oooo0oO = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f18105Oooo0o) {
                return;
            }
            this.f18106Oooo0oO.setVisibility(4);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            if (this.f18105Oooo0o) {
                this.f18106Oooo0oO.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
        this.f18103OooO0OO = new OooOo(75L);
        this.f18104OooO0Oo = new OooOo(0L);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean OooO0O0(View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean OooOOoo(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
        return false;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    @NonNull
    public final AnimatorSet OooOo0(@NonNull View view, @NonNull View view2, boolean z, boolean z2) {
        ObjectAnimator objectAnimatorOfFloat;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        OooOo oooOo = z ? this.f18103OooO0OO : this.f18104OooO0Oo;
        if (z) {
            if (!z2) {
                view2.setAlpha(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 1.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        }
        oooOo.OooO00o(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        AnimatorSet animatorSet = new AnimatorSet();
        OooO.OooO00o(animatorSet, arrayList);
        animatorSet.addListener(new OooO00o(z, view2));
        return animatorSet;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18103OooO0OO = new OooOo(75L);
        this.f18104OooO0Oo = new OooOo(0L);
    }
}

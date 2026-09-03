package com.google.android.material.transformation;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p544o0oO0O0o.o0000oo;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public AnimatorSet f18212OooO0O0;

    public ExpandableTransformationBehavior() {
    }

    @NonNull
    public abstract AnimatorSet OooOo0(View view, View view2, boolean z, boolean z2);

    @Override // com.google.android.material.transformation.ExpandableBehavior
    @CallSuper
    public void OooOo00(View view, View view2, boolean z, boolean z2) {
        AnimatorSet animatorSet = this.f18212OooO0O0;
        boolean z3 = animatorSet != null;
        if (z3) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSetOooOo0 = OooOo0(view, view2, z, z3);
        this.f18212OooO0O0 = animatorSetOooOo0;
        animatorSetOooOo0.addListener(new o0000oo(this));
        this.f18212OooO0O0.start();
        if (z2) {
            return;
        }
        this.f18212OooO0O0.end();
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

package com.google.android.material.search;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.yalla.support.keyboardpanel.panel.PanelLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0OoOo0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f17576OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f17577OooO0o0;

    public /* synthetic */ o0OoOo0(Object obj, int i) {
        this.f17576OooO0Oo = i;
        this.f17577OooO0o0 = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it) {
        int i = this.f17576OooO0Oo;
        Object obj = this.f17577OooO0o0;
        switch (i) {
            case 0:
                ((com.google.android.material.internal.OooO) obj).OooO00o(it.getAnimatedFraction());
                break;
            default:
                PanelLayout this$0 = (PanelLayout) obj;
                int i2 = PanelLayout.f22635OooO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                ViewGroup.LayoutParams layoutParams = this$0.getLayoutParams();
                Object animatedValue = it.getAnimatedValue();
                Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                layoutParams.height = ((Integer) animatedValue).intValue();
                this$0.requestLayout();
                break;
        }
    }
}

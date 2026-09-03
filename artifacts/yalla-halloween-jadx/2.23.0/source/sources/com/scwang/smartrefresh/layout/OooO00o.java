package com.scwang.smartrefresh.layout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.scwang.smartrefresh.layout.constant.RefreshState;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO00o extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SmartRefreshLayout.OooOOO f21302OooO0Oo;

    public OooO00o(SmartRefreshLayout.OooOOO oooOOO) {
        this.f21302OooO0Oo = oooOOO;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        SmartRefreshLayout.this.f21381o0ooOO0.OooO0Oo(RefreshState.TwoLevel);
    }
}

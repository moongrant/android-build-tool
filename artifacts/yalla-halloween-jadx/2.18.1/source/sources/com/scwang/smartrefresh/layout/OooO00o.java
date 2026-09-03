package com.scwang.smartrefresh.layout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.scwang.smartrefresh.layout.constant.RefreshState;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ SmartRefreshLayout.OooOo00 f19470Oooo0o;

    public OooO00o(SmartRefreshLayout.OooOo00 oooOo00) {
        this.f19470Oooo0o = oooOo00;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        SmartRefreshLayout.this.f19524o0000o0O.OooO0Oo(RefreshState.TwoLevel);
    }
}

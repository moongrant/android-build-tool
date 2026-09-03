package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f16412OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f16413OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ActionMenuView f16414OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ boolean f16415OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f16416OooO0oo;

    public OooOO0(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z) {
        this.f16416OooO0oo = bottomAppBar;
        this.f16414OooO0o0 = actionMenuView;
        this.f16413OooO0o = i;
        this.f16415OooO0oO = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f16412OooO0Oo = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f16412OooO0Oo) {
            return;
        }
        BottomAppBar bottomAppBar = this.f16416OooO0oo;
        int i = bottomAppBar.f16381o00O0O;
        boolean z = i != 0;
        if (i != 0) {
            bottomAppBar.f16381o00O0O = 0;
            bottomAppBar.getMenu().clear();
            bottomAppBar.OooOO0O(i);
        }
        bottomAppBar.Oooo00o(this.f16414OooO0o0, this.f16413OooO0o, this.f16415OooO0oO, z);
    }
}

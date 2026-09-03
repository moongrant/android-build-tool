package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f15935OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f15936OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ActionMenuView f15937OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ boolean f15938OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f15939OooO0oo;

    public OooO(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z) {
        this.f15939OooO0oo = bottomAppBar;
        this.f15937OooO0o0 = actionMenuView;
        this.f15936OooO0o = i;
        this.f15938OooO0oO = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f15935OooO0Oo = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f15935OooO0Oo) {
            return;
        }
        BottomAppBar bottomAppBar = this.f15939OooO0oo;
        int i = bottomAppBar.f15909o00O0O;
        boolean z = i != 0;
        if (i != 0) {
            bottomAppBar.f15909o00O0O = 0;
            bottomAppBar.getMenu().clear();
            bottomAppBar.OooOO0O(i);
        }
        bottomAppBar.Oooo00o(this.f15937OooO0o0, this.f15936OooO0o, this.f15938OooO0oO, z);
    }
}

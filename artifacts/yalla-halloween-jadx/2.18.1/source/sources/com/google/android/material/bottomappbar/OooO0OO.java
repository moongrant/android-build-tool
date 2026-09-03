package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ boolean f16572Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f16573Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ ActionMenuView f16574Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f16575Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f16576OoooO00;

    public OooO0OO(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z) {
        this.f16576OoooO00 = bottomAppBar;
        this.f16574Oooo0oO = actionMenuView;
        this.f16575Oooo0oo = i;
        this.f16572Oooo = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f16573Oooo0o = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f16573Oooo0o) {
            return;
        }
        BottomAppBar bottomAppBar = this.f16576OoooO00;
        int i = bottomAppBar.f16547o00000oo;
        boolean z = i != 0;
        if (i != 0) {
            bottomAppBar.f16547o00000oo = 0;
            bottomAppBar.getMenu().clear();
            bottomAppBar.OooOOO(i);
        }
        BottomAppBar bottomAppBar2 = this.f16576OoooO00;
        ActionMenuView actionMenuView = this.f16574Oooo0oO;
        int i2 = this.f16575Oooo0oo;
        boolean z2 = this.f16572Oooo;
        Objects.requireNonNull(bottomAppBar2);
        OooO0o oooO0o = new OooO0o(bottomAppBar2, actionMenuView, i2, z2);
        if (z) {
            actionMenuView.post(oooO0o);
        } else {
            oooO0o.run();
        }
    }
}

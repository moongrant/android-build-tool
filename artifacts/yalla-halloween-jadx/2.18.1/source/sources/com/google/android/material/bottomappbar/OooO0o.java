package com.google.android.material.bottomappbar;

import androidx.appcompat.widget.ActionMenuView;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f16577Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ ActionMenuView f16578Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f16579Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ boolean f16580Oooo0oo;

    public OooO0o(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z) {
        this.f16577Oooo = bottomAppBar;
        this.f16578Oooo0o = actionMenuView;
        this.f16579Oooo0oO = i;
        this.f16580Oooo0oo = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ActionMenuView actionMenuView = this.f16578Oooo0o;
        actionMenuView.setTranslationX(this.f16577Oooo.Oooo000(actionMenuView, this.f16579Oooo0oO, this.f16580Oooo0oo));
    }
}

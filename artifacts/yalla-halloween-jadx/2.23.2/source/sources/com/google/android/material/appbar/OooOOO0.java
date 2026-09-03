package com.google.android.material.appbar;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import o0000O.o00000;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO0 implements o00000 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f15801OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ View f15802OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f15803OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f15804OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f15805OooO0oo;

    public OooOOO0(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
        this.f15805OooO0oo = baseBehavior;
        this.f15801OooO0Oo = coordinatorLayout;
        this.f15803OooO0o0 = appBarLayout;
        this.f15802OooO0o = view;
        this.f15804OooO0oO = i;
    }

    @Override // o0000O.o00000
    public final boolean perform(@NonNull View view, @Nullable o00000.OooO00o oooO00o) {
        this.f15805OooO0oo.OooOO0O(this.f15801OooO0Oo, this.f15803OooO0o0, this.f15802OooO0o, 0, this.f15804OooO0oO, new int[]{0, 0}, 1);
        return true;
    }
}

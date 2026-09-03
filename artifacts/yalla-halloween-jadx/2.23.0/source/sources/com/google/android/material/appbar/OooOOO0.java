package com.google.android.material.appbar;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import o0000O.o000OOo;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO0 implements o000OOo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f16273OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ View f16274OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f16275OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f16276OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f16277OooO0oo;

    public OooOOO0(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
        this.f16277OooO0oo = baseBehavior;
        this.f16273OooO0Oo = coordinatorLayout;
        this.f16275OooO0o0 = appBarLayout;
        this.f16274OooO0o = view;
        this.f16276OooO0oO = i;
    }

    @Override // o0000O.o000OOo
    public final boolean perform(@NonNull View view, @Nullable o000OOo.OooO00o oooO00o) {
        this.f16277OooO0oo.OooOO0O(this.f16273OooO0Oo, this.f16275OooO0o0, this.f16274OooO0o, 0, this.f16276OooO0oO, new int[]{0, 0}, 1);
        return true;
    }
}

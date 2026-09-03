package com.google.android.material.appbar;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p072o000O0o0.o000Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO implements o000Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f16462OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f16463OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ View f16464OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f16465OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f16466OooO0o0;

    public OooO0OO(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
        this.f16466OooO0o0 = baseBehavior;
        this.f16462OooO00o = coordinatorLayout;
        this.f16463OooO0O0 = appBarLayout;
        this.f16464OooO0OO = view;
        this.f16465OooO0Oo = i;
    }

    @Override // p072o000O0o0.o000Oo0
    public final boolean perform(@NonNull View view, @Nullable o000Oo0.OooO00o oooO00o) {
        this.f16466OooO0o0.OooOO0O(this.f16462OooO00o, this.f16463OooO0O0, this.f16464OooO0OO, 0, this.f16465OooO0Oo, new int[]{0, 0}, 1);
        return true;
    }
}

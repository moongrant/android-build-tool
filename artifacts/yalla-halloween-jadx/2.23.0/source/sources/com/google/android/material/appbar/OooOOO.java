package com.google.android.material.appbar;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import o0000O.o000OOo;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO implements o000OOo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f16271OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f16272OooO0o0;

    public OooOOO(AppBarLayout appBarLayout, boolean z) {
        this.f16271OooO0Oo = appBarLayout;
        this.f16272OooO0o0 = z;
    }

    @Override // o0000O.o000OOo
    public final boolean perform(@NonNull View view, @Nullable o000OOo.OooO00o oooO00o) {
        this.f16271OooO0Oo.setExpanded(this.f16272OooO0o0);
        return true;
    }
}

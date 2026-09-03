package com.google.android.material.appbar;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import o0000O.o00000;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO implements o00000 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f15799OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f15800OooO0o0;

    public OooOOO(AppBarLayout appBarLayout, boolean z) {
        this.f15799OooO0Oo = appBarLayout;
        this.f15800OooO0o0 = z;
    }

    @Override // o0000O.o00000
    public final boolean perform(@NonNull View view, @Nullable o00000.OooO00o oooO00o) {
        this.f15799OooO0Oo.setExpanded(this.f15800OooO0o0);
        return true;
    }
}

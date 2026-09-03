package com.google.android.material.appbar;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p072o000O0o0.o000Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o implements o000Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f16467OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ boolean f16468OooO0O0;

    public OooO0o(AppBarLayout appBarLayout, boolean z) {
        this.f16467OooO00o = appBarLayout;
        this.f16468OooO0O0 = z;
    }

    @Override // p072o000O0o0.o000Oo0
    public final boolean perform(@NonNull View view, @Nullable o000Oo0.OooO00o oooO00o) {
        this.f16467OooO00o.setExpanded(this.f16468OooO0O0);
        return true;
    }
}

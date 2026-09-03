package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.o000000O;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o implements o000000O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO0O0 f16041OooO0Oo;

    public OooO00o(OooO0O0 oooO0O0) {
        this.f16041OooO0Oo = oooO0O0;
    }

    @Override // androidx.core.view.o000000O
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        OooO0O0 oooO0O0 = this.f16041OooO0Oo;
        OooO0O0.C0215OooO0O0 c0215OooO0O0 = oooO0O0.f16049OooOOO;
        if (c0215OooO0O0 != null) {
            oooO0O0.f16043OooO0o.f16006OoooOOo.remove(c0215OooO0O0);
        }
        OooO0O0.C0215OooO0O0 c0215OooO0O1 = new OooO0O0.C0215OooO0O0(oooO0O0.f16042OooO, windowInsetsCompat);
        oooO0O0.f16049OooOOO = c0215OooO0O1;
        c0215OooO0O1.OooO0o0(oooO0O0.getWindow());
        oooO0O0.f16043OooO0o.OooOo00(oooO0O0.f16049OooOOO);
        return windowInsetsCompat;
    }
}

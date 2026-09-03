package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.o000000O;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o implements o000000O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO0O0 f16514OooO0Oo;

    public OooO00o(OooO0O0 oooO0O0) {
        this.f16514OooO0Oo = oooO0O0;
    }

    @Override // androidx.core.view.o000000O
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        OooO0O0 oooO0O0 = this.f16514OooO0Oo;
        OooO0O0.C0218OooO0O0 c0218OooO0O0 = oooO0O0.f16522OooOOO;
        if (c0218OooO0O0 != null) {
            oooO0O0.f16516OooO0o.f16479OoooOOo.remove(c0218OooO0O0);
        }
        OooO0O0.C0218OooO0O0 c0218OooO0O1 = new OooO0O0.C0218OooO0O0(oooO0O0.f16515OooO, windowInsetsCompat);
        oooO0O0.f16522OooOOO = c0218OooO0O1;
        c0218OooO0O1.OooO0o0(oooO0O0.getWindow());
        oooO0O0.f16516OooO0o.OooOo00(oooO0O0.f16522OooOOO);
        return windowInsetsCompat;
    }
}

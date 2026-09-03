package com.google.android.material.datepicker;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f16973Oooo0o;

    public OooOo00(OooOO0O oooOO0O) {
        this.f16973Oooo0o = oooOO0O;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        OooOO0O oooOO0O = this.f16973Oooo0o;
        int i = oooOO0O.f16953OoooO0;
        if (i == 2) {
            oooOO0O.OooO0o0(1);
        } else if (i == 1) {
            oooOO0O.OooO0o0(2);
        }
    }
}

package com.google.android.material.datepicker;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OoOo0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOo00 f16486OooO0Oo;

    public o0OoOo0(OooOo00 oooOo00) {
        this.f16486OooO0Oo = oooOo00;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        OooOo00 oooOo00 = this.f16486OooO0Oo;
        OooOo00.OooO0o oooO0o = oooOo00.f16433OooOO0;
        OooOo00.OooO0o oooO0o2 = OooOo00.OooO0o.YEAR;
        if (oooO0o == oooO0o2) {
            oooOo00.OooO0Oo(OooOo00.OooO0o.DAY);
        } else if (oooO0o == OooOo00.OooO0o.DAY) {
            oooOo00.OooO0Oo(oooO0o2);
        }
    }
}

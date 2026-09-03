package com.google.android.material.datepicker;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo000 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oo000o f16977Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f16978Oooo0oO;

    public Oooo000(OooOO0O oooOO0O, oo000o oo000oVar) {
        this.f16978Oooo0oO = oooOO0O;
        this.f16977Oooo0o = oo000oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iFindLastVisibleItemPosition = this.f16978Oooo0oO.OooO0O0().findLastVisibleItemPosition() - 1;
        if (iFindLastVisibleItemPosition >= 0) {
            this.f16978Oooo0oO.OooO0Oo(this.f16977Oooo0o.OooO00o(iFindLastVisibleItemPosition));
        }
    }
}

package com.google.android.material.datepicker;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oo000o f16971Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f16972Oooo0oO;

    public OooOo(OooOO0O oooOO0O, oo000o oo000oVar) {
        this.f16972Oooo0oO = oooOO0O;
        this.f16971Oooo0o = oo000oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iFindFirstVisibleItemPosition = this.f16972Oooo0oO.OooO0O0().findFirstVisibleItemPosition() + 1;
        if (iFindFirstVisibleItemPosition < this.f16972Oooo0oO.f16956OoooOO0.getAdapter().getItemCount()) {
            this.f16972Oooo0oO.OooO0Oo(this.f16971Oooo0o.OooO00o(iFindFirstVisibleItemPosition));
        }
    }
}

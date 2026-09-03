package com.yalantis.ucrop;

import android.view.View;
import p416o0Oo0oO0.o00oO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooO0o.OooO0O0 f20279Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ OooO0o f20280Oooo0oO;

    public OooO0OO(OooO0o oooO0o, OooO0o.OooO0O0 oooO0O0) {
        this.f20280Oooo0oO = oooO0o;
        this.f20279Oooo0o = oooO0O0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        OooO0o.OooO00o oooO00o = this.f20280Oooo0oO.f20284OooO0Oo;
        if (oooO00o != null) {
            int adapterPosition = this.f20279Oooo0o.getAdapterPosition();
            OooO00o oooO00o2 = (OooO00o) oooO00o;
            if (o00oO0o.OooO00o(oooO00o2.f20277OooO00o.f20293o0OO00O.get(adapterPosition).f20351o000oOoO)) {
                return;
            }
            PictureMultiCuttingActivity pictureMultiCuttingActivity = oooO00o2.f20277OooO00o;
            if (pictureMultiCuttingActivity.f20292o0O0O00 == adapterPosition) {
                return;
            }
            pictureMultiCuttingActivity.OooOoo0();
            PictureMultiCuttingActivity pictureMultiCuttingActivity2 = oooO00o2.f20277OooO00o;
            pictureMultiCuttingActivity2.f20292o0O0O00 = adapterPosition;
            pictureMultiCuttingActivity2.f20291o000OOo = adapterPosition;
            pictureMultiCuttingActivity2.OooOoO();
        }
    }
}

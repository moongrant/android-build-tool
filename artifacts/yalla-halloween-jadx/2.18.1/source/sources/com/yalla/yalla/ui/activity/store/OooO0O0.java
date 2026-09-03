package com.yalla.yalla.ui.activity.store;

import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PurchaseTopCardActivity f23210Oooo0o;

    public OooO0O0(PurchaseTopCardActivity purchaseTopCardActivity) {
        this.f23210Oooo0o = purchaseTopCardActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WalletActivity.OooO00o oooO00o = WalletActivity.f23268OoooooO;
        PurchaseTopCardActivity purchaseTopCardActivity = this.f23210Oooo0o;
        Objects.requireNonNull(purchaseTopCardActivity);
        oooO00o.OooO00o(purchaseTopCardActivity, false);
    }
}

package com.yalla.yalla.ui.activity.store;

import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PurchaseSkillCardActivity f23209Oooo0o;

    public OooO00o(PurchaseSkillCardActivity purchaseSkillCardActivity) {
        this.f23209Oooo0o = purchaseSkillCardActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WalletActivity.OooO00o oooO00o = WalletActivity.f23268OoooooO;
        PurchaseSkillCardActivity purchaseSkillCardActivity = this.f23209Oooo0o;
        Objects.requireNonNull(purchaseSkillCardActivity);
        oooO00o.OooO00o(purchaseSkillCardActivity, false);
    }
}

package p499o0o00o0O;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.activity.store.PurchaseSkillCardActivity;
import p590o0oo0.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O00O implements Observer<Long> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PurchaseSkillCardActivity f49367OooO0Oo;

    public o000O00O(PurchaseSkillCardActivity purchaseSkillCardActivity) {
        this.f49367OooO0Oo = purchaseSkillCardActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Long l) {
        this.f49367OooO0Oo.f26989OooOOo0.setText(OooOOOO.OooO0Oo(l + ""));
    }
}

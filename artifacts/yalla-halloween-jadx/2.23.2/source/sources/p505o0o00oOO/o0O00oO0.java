package p505o0o00oOO;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.activity.store.PurchaseSkillCardActivity;
import p605o0oo0O0O.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00oO0 implements Observer<Long> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PurchaseSkillCardActivity f50332OooO0Oo;

    public o0O00oO0(PurchaseSkillCardActivity purchaseSkillCardActivity) {
        this.f50332OooO0Oo = purchaseSkillCardActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Long l) {
        this.f50332OooO0Oo.f26524OooOOo0.setText(o0O0O0Oo.OooO0Oo(l + ""));
    }
}

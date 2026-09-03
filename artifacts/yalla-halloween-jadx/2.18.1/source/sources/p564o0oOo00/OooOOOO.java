package p564o0oOo00;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.activity.store.PurchaseSkillCardActivity;
import p168o00Ooo0.o0O0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOOO implements Observer<Long> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PurchaseSkillCardActivity f45124OooO00o;

    public OooOOOO(PurchaseSkillCardActivity purchaseSkillCardActivity) {
        this.f45124OooO00o = purchaseSkillCardActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Long l) {
        this.f45124OooO00o.f23212OoooOo0.setText(o0O0O00.OooO0Oo(l + ""));
    }
}

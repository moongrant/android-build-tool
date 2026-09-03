package p505o0o00oOO;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o0000Ooo;
import com.yalla.yalla.ui.activity.store.PurchaseSkillCardActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O0O extends o0000Ooo {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ PurchaseSkillCardActivity f50333OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O0O(PurchaseSkillCardActivity purchaseSkillCardActivity, FragmentManager fragmentManager) {
        super(fragmentManager, 0);
        this.f50333OooO0oo = purchaseSkillCardActivity;
    }

    @Override // p114o00O00o.OooO0OO
    public final int OooO0OO() {
        return this.f50333OooO0oo.f26527OooOo0.size();
    }

    @Override // p114o00O00o.OooO0OO
    public final CharSequence OooO0o0(int i) {
        PurchaseSkillCardActivity purchaseSkillCardActivity = this.f50333OooO0oo;
        return i < purchaseSkillCardActivity.f26525OooOOoo.length ? purchaseSkillCardActivity.getResources().getString(purchaseSkillCardActivity.f26525OooOOoo[i]) : "";
    }

    @Override // androidx.fragment.app.o0000Ooo
    public final Fragment OooOOo0(int i) {
        return this.f50333OooO0oo.f26527OooOo0.get(i);
    }
}

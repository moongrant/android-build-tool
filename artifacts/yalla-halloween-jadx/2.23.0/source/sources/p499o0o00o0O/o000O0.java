package p499o0o00o0O;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o00000OO;
import com.yalla.yalla.ui.activity.store.PurchaseSkillCardActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0 extends o00000OO {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ PurchaseSkillCardActivity f49365OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0(PurchaseSkillCardActivity purchaseSkillCardActivity, FragmentManager fragmentManager) {
        super(fragmentManager, 0);
        this.f49365OooO0oo = purchaseSkillCardActivity;
    }

    @Override // p082o000OoOo.OooOO0O
    public final int OooO0OO() {
        return this.f49365OooO0oo.f26992OooOo0.size();
    }

    @Override // p082o000OoOo.OooOO0O
    public final CharSequence OooO0o0(int i) {
        PurchaseSkillCardActivity purchaseSkillCardActivity = this.f49365OooO0oo;
        return i < purchaseSkillCardActivity.f26990OooOOoo.length ? purchaseSkillCardActivity.getResources().getString(purchaseSkillCardActivity.f26990OooOOoo[i]) : "";
    }

    @Override // androidx.fragment.app.o00000OO
    public final Fragment OooOOo0(int i) {
        return this.f49365OooO0oo.f26992OooOo0.get(i);
    }
}

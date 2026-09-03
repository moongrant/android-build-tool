package p564o0oOo00;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.o00000;
import com.yalla.yalla.ui.activity.store.PurchaseSkillCardActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOo00 extends o00000 {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ PurchaseSkillCardActivity f45126OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo00(PurchaseSkillCardActivity purchaseSkillCardActivity, FragmentManager fragmentManager) {
        super(fragmentManager);
        this.f45126OooO0oo = purchaseSkillCardActivity;
    }

    @Override // p105o000oo0o.o00Ooo
    public final int OooO0OO() {
        return this.f45126OooO0oo.f23216Ooooo0o.size();
    }

    @Override // p105o000oo0o.o00Ooo
    public final CharSequence OooO0o0(int i) {
        PurchaseSkillCardActivity purchaseSkillCardActivity = this.f45126OooO0oo;
        return i < purchaseSkillCardActivity.f23214OoooOoo.length ? purchaseSkillCardActivity.getResources().getString(this.f45126OooO0oo.f23214OoooOoo[i]) : "";
    }

    @Override // androidx.fragment.app.o00000
    public final Fragment OooOOOo(int i) {
        return this.f45126OooO0oo.f23216Ooooo0o.get(i);
    }
}

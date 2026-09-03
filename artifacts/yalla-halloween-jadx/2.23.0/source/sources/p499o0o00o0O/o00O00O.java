package p499o0o00o0O;

import androidx.viewpager.widget.ViewPager;
import com.yalla.yalla.ui.activity.store.RechargeActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O00O implements ViewPager.OooOOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RechargeActivity f49384OooO0Oo;

    public o00O00O(RechargeActivity rechargeActivity) {
        this.f49384OooO0Oo = rechargeActivity;
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrollStateChanged(int i) {
        if (i != 0) {
            return;
        }
        int i2 = RechargeActivity.f27013OooOo;
        RechargeActivity rechargeActivity = this.f49384OooO0Oo;
        int currentItem = rechargeActivity.OooOo().f58390OooO0Oo.getCurrentItem();
        if (rechargeActivity.f27018OooOo0o == currentItem) {
            return;
        }
        rechargeActivity.f27018OooOo0o = currentItem;
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageSelected(int i) {
    }
}

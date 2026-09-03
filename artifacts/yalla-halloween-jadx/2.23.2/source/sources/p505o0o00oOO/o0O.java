package p505o0o00oOO;

import androidx.viewpager.widget.ViewPager;
import com.yalla.yalla.ui.activity.store.RechargeActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O implements ViewPager.OooOOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RechargeActivity f50327OooO0Oo;

    public o0O(RechargeActivity rechargeActivity) {
        this.f50327OooO0Oo = rechargeActivity;
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrollStateChanged(int i) {
        if (i != 0) {
            return;
        }
        int i2 = RechargeActivity.f26548OooOo;
        RechargeActivity rechargeActivity = this.f50327OooO0Oo;
        int currentItem = rechargeActivity.OooOo().f44330OooO0Oo.getCurrentItem();
        if (rechargeActivity.f26553OooOo0o == currentItem) {
            return;
        }
        rechargeActivity.f26553OooOo0o = currentItem;
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageSelected(int i) {
    }
}

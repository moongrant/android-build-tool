package p485o0o00O0;

import androidx.viewpager.widget.ViewPager;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O000 implements ViewPager.OooOOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailActivity f47832OooO0Oo;

    public o00O000(MomentDetailActivity momentDetailActivity) {
        this.f47832OooO0Oo = momentDetailActivity;
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageSelected(int i) {
        OooOOO0.OooO0O0("onPageSelected position = " + i);
        MomentDetailActivity momentDetailActivity = this.f47832OooO0Oo;
        momentDetailActivity.f26069OooOooO = i;
        if (i == 0) {
            momentDetailActivity.OooOoo0().initData();
        } else if (i == 1) {
            momentDetailActivity.OooOooO().initData();
        } else if (i == 2) {
            momentDetailActivity.OooOoo().initData();
        }
        momentDetailActivity.OooOoOO().f59055OooO0oo.setData(i);
        if (momentDetailActivity.f26063OooOo0o.get(i) == momentDetailActivity.OooOoo()) {
            momentDetailActivity.OooOoo().showFragment(true);
        } else {
            momentDetailActivity.OooOoo().showFragment(false);
        }
    }
}

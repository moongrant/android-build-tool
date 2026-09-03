package p492o0o00OO0;

import androidx.viewpager.widget.ViewPager;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
public final class o00oOoo implements ViewPager.OooOOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailActivity f49200OooO0Oo;

    public o00oOoo(MomentDetailActivity momentDetailActivity) {
        this.f49200OooO0Oo = momentDetailActivity;
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageSelected(int i) {
        o0000O00.OooO0O0("onPageSelected position = " + i);
        MomentDetailActivity momentDetailActivity = this.f49200OooO0Oo;
        momentDetailActivity.f25620OooOooO = i;
        if (i == 0) {
            momentDetailActivity.OooOoOO().initData();
        } else if (i == 1) {
            momentDetailActivity.OooOoo().initData();
        } else if (i == 2) {
            momentDetailActivity.OooOoo0().initData();
        }
        momentDetailActivity.OooOoO().f44934OooO0oo.setData(i);
        if (momentDetailActivity.f25614OooOo0o.get(i) == momentDetailActivity.OooOoo0()) {
            momentDetailActivity.OooOoo0().showFragment(true);
        } else {
            momentDetailActivity.OooOoo0().showFragment(false);
        }
    }
}

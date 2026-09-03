package p492o0o00OO0;

import androidx.viewpager.widget.ViewPager;
import com.yalla.yalla.ui.activity.moment.ShowImageActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO00OO implements ViewPager.OooOOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ShowImageActivity f49315OooO0Oo;

    public o0OO00OO(ShowImageActivity showImageActivity) {
        this.f49315OooO0Oo = showImageActivity;
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrollStateChanged(int i) {
        this.f49315OooO0Oo.f25814OooOoo = i == 1;
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageSelected(int i) {
        ShowImageActivity showImageActivity = this.f49315OooO0Oo;
        showImageActivity.f25805OooOOoo = i;
        if (showImageActivity.OooOoO0().OooO0OO() > 1) {
            showImageActivity.OooOo0o().f44717OooO0Oo.setText((i + 1) + "/" + showImageActivity.OooOoO0().OooO0OO());
        }
    }
}

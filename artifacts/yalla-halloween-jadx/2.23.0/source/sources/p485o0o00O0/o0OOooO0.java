package p485o0o00O0;

import androidx.viewpager.widget.ViewPager;
import com.yalla.yalla.ui.activity.moment.ShowImageActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOooO0 implements ViewPager.OooOOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ShowImageActivity f48003OooO0Oo;

    public o0OOooO0(ShowImageActivity showImageActivity) {
        this.f48003OooO0Oo = showImageActivity;
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrollStateChanged(int i) {
        this.f48003OooO0Oo.f26263OooOoo = i == 1;
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageSelected(int i) {
        ShowImageActivity showImageActivity = this.f48003OooO0Oo;
        showImageActivity.f26254OooOOoo = i;
        if (showImageActivity.OooOoO0().OooO0OO() > 1) {
            showImageActivity.OooOo0o().f59457OooO0Oo.setText((i + 1) + "/" + showImageActivity.OooOoO0().OooO0OO());
        }
    }
}

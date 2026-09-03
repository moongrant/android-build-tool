package p538o0o0Oo0;

import OooO00o.OooO00o;
import androidx.viewpager.widget.ViewPager;
import com.yalla.yalla.ui.activity.moment.ShowImageActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class o0 implements ViewPager.OooOOO0 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ ShowImageActivity f43902Oooo0o;

    public o0(ShowImageActivity showImageActivity) {
        this.f43902Oooo0o = showImageActivity;
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrollStateChanged(int i) {
        this.f43902Oooo0o.f22531o0OoOo0 = i == 1;
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageSelected(int i) {
        ShowImageActivity showImageActivity = this.f43902Oooo0o;
        showImageActivity.f22518OoooOoo = i;
        if (showImageActivity.OooOooo().OooO0OO() > 1) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("");
            sbOooO0o0.append(i + 1);
            sbOooO0o0.append('/');
            sbOooO0o0.append(this.f43902Oooo0o.OooOooo().OooO0OO());
            this.f43902Oooo0o.OooOoo().f50707OooO0Oo.setText(sbOooO0o0.toString());
        }
    }
}

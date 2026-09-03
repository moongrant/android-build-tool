package p192o00o0O0;

import OooO00o.OooO00o;
import androidx.viewpager.widget.ViewPager;
import com.app.selectPicture.activity.ShowImagesLoadActivity;
import p201o00o0OoO.o00;

/* JADX INFO: loaded from: classes.dex */
public final class o00000OO implements ViewPager.OooOOO0 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ ShowImagesLoadActivity f33087Oooo0o;

    public o00000OO(ShowImagesLoadActivity showImagesLoadActivity) {
        this.f33087Oooo0o = showImagesLoadActivity;
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageSelected(int i) {
        o00 o00Var = this.f33087Oooo0o.f12277Oooo;
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("");
        sbOooO0o0.append(i + 1);
        sbOooO0o0.append("/");
        sbOooO0o0.append(this.f33087Oooo0o.f12278Oooo0oO.size());
        o00Var.OooO0o0(sbOooO0o0.toString());
    }
}

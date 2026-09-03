package p505o0o00oOO;

import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.yalla.yalla.ui.activity.store.StoreActivity;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;
import p605o0oo0O0O.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO000o implements ViewPager.OooOOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ StoreActivity f50350OooO0Oo;

    public o0OO000o(StoreActivity storeActivity) {
        this.f50350OooO0Oo = storeActivity;
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrollStateChanged(int i) {
        if (i != 0) {
            return;
        }
        StoreActivity storeActivity = this.f50350OooO0Oo;
        int currentItem = storeActivity.f26558OooOOo0.getCurrentItem();
        if (storeActivity.f26564OooOo0o == currentItem) {
            return;
        }
        if (currentItem == 0) {
            TextView textView = storeActivity.f26559OooOOoo;
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            textView.setText(o0O0O0Oo.OooO0Oo(String.valueOf(o0O00oO0.OooO0O0().getValue())));
            storeActivity.f26562OooOo00.setText(o000000.Recharge_);
            storeActivity.f26561OooOo0.reverseTransition(300);
            storeActivity.f26565OooOoO0.setVisibility(8);
            storeActivity.f26563OooOo0O.reverseTransition(300);
        } else if (currentItem == 1) {
            storeActivity.OooOo0O();
        }
        storeActivity.f26564OooOo0o = currentItem;
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageSelected(int i) {
    }
}

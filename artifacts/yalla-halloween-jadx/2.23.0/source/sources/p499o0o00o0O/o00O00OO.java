package p499o0o00o0O;

import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.yalla.yalla.ui.activity.store.StoreActivity;
import p464o0Oooo.o000000O;
import p584o0oOooO0.oO00OOo0;
import p590o0oo0.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O00OO implements ViewPager.OooOOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ StoreActivity f49385OooO0Oo;

    public o00O00OO(StoreActivity storeActivity) {
        this.f49385OooO0Oo = storeActivity;
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrollStateChanged(int i) {
        if (i != 0) {
            return;
        }
        StoreActivity storeActivity = this.f49385OooO0Oo;
        int currentItem = storeActivity.f27023OooOOo0.getCurrentItem();
        if (storeActivity.f27029OooOo0o == currentItem) {
            return;
        }
        if (currentItem == 0) {
            TextView textView = storeActivity.f27024OooOOoo;
            o000000O o000000o2 = o000000O.f46674OooO00o;
            textView.setText(OooOOOO.OooO0Oo(String.valueOf(o000000O.OooO0O0().getValue())));
            storeActivity.f27027OooOo00.setText(oO00OOo0.Recharge_);
            storeActivity.f27026OooOo0.reverseTransition(300);
            storeActivity.f27030OooOoO0.setVisibility(8);
            storeActivity.f27028OooOo0O.reverseTransition(300);
        } else if (currentItem == 1) {
            storeActivity.OooOo0O();
        }
        storeActivity.f27029OooOo0o = currentItem;
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageSelected(int i) {
    }
}

package p564o0oOo00;

import androidx.viewpager.widget.ViewPager;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import com.yalla.yalla.ui.activity.store.StoreActivity;
import p168o00Ooo0.o0O0O00;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OO00O implements ViewPager.OooOOO0 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ StoreActivity f45169Oooo0o;

    public o0OO00O(StoreActivity storeActivity) {
        this.f45169Oooo0o = storeActivity;
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrollStateChanged(int i) {
        if (i != 0) {
            return;
        }
        int currentItem = this.f45169Oooo0o.f23238OoooOo0.getCurrentItem();
        StoreActivity storeActivity = this.f45169Oooo0o;
        if (storeActivity.f23244OooooOO == currentItem) {
            return;
        }
        if (currentItem == 0) {
            storeActivity.f23240OoooOoo.setText(o0O0O00.OooO0Oo(String.valueOf(OooOOO.f41216OooO00o.OooO0OO().getValue())));
            storeActivity.f23241Ooooo00.setText(R.string.Recharge);
            storeActivity.f23242Ooooo0o.reverseTransition(ShopVehicleListModel.VehicleTagType_Vip300);
            storeActivity.f23246Oooooo0.setVisibility(8);
            storeActivity.f23243OooooO0.reverseTransition(ShopVehicleListModel.VehicleTagType_Vip300);
        } else if (currentItem == 1) {
            storeActivity.OooOoOO();
        }
        this.f45169Oooo0o.f23244OooooOO = currentItem;
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageSelected(int i) {
    }
}

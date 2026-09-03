package p564o0oOo00;

import androidx.viewpager.widget.ViewPager;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import com.yalla.yalla.ui.activity.store.WalletActivity;
import p168o00Ooo0.o0O0O00;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O00O implements ViewPager.OooOOO0 {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ WalletActivity f45153Oooo0o;

    public o000O00O(WalletActivity walletActivity) {
        this.f45153Oooo0o = walletActivity;
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrollStateChanged(int i) {
        if (i != 0) {
            return;
        }
        WalletActivity walletActivity = this.f45153Oooo0o;
        WalletActivity.OooO00o oooO00o = WalletActivity.f23268OoooooO;
        int currentItem = walletActivity.OooOoo().f48972OooO0oo.getCurrentItem();
        WalletActivity walletActivity2 = this.f45153Oooo0o;
        double d = currentItem;
        if (walletActivity2.f23273OooooOO == d) {
            return;
        }
        if (currentItem == 0) {
            walletActivity2.OooOoo().f48971OooO0oO.setText(o0O0O00.OooO0Oo(OooOOO.f41216OooO00o.OooO0OO().getValue() + ""));
            walletActivity2.OooOooO().reverseTransition(ShopVehicleListModel.VehicleTagType_Vip300);
            walletActivity2.OooOooo().reverseTransition(ShopVehicleListModel.VehicleTagType_Vip300);
        } else if (currentItem == 1) {
            walletActivity2.Oooo000();
        }
        this.f45153Oooo0o.f23273OooooOO = d;
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OooOOO0
    public final void onPageSelected(int i) {
    }
}

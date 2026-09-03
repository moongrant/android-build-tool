package p566o0oOo00O;

import androidx.viewpager2.widget.ViewPager2;
import com.yalla.yalla.model.PremiumShopModel;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O000o extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PremiumActivity f45250OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ List<PremiumShopModel.PremiumInfo> f45251OooO0O0;

    public o00O000o(PremiumActivity premiumActivity, List<PremiumShopModel.PremiumInfo> list) {
        this.f45250OooO00o = premiumActivity;
        this.f45251OooO0O0 = list;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        super.onPageSelected(i);
        PremiumActivity premiumActivity = this.f45250OooO00o;
        premiumActivity.f23370Ooooooo = i;
        PremiumActivity.OooOooO(premiumActivity, this.f45251OooO0O0.get(i));
    }
}

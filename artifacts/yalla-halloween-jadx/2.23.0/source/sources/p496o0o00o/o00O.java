package p496o0o00o;

import androidx.viewpager2.widget.ViewPager2;
import com.yalla.yalla.model.PremiumShopModel;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PremiumActivity f49000OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ List<PremiumShopModel.PremiumInfo> f49001OooO0O0;

    public o00O(PremiumActivity premiumActivity, ArrayList arrayList) {
        this.f49000OooO00o = premiumActivity;
        this.f49001OooO0O0 = arrayList;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        super.onPageSelected(i);
        PremiumActivity premiumActivity = this.f49000OooO00o;
        premiumActivity.f27151OooOoo0 = i;
        PremiumActivity.OooOoO0(premiumActivity, this.f49001OooO0O0.get(i));
    }
}

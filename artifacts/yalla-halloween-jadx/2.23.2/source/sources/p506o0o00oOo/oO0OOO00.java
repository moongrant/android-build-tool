package p506o0o00oOo;

import androidx.viewpager2.widget.ViewPager2;
import com.yalla.yalla.model.PremiumShopModel;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0OOO00 extends ViewPager2.OnPageChangeCallback {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PremiumActivity f50496OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ List<PremiumShopModel.PremiumInfo> f50497OooO0O0;

    public oO0OOO00(PremiumActivity premiumActivity, ArrayList arrayList) {
        this.f50496OooO00o = premiumActivity;
        this.f50497OooO0O0 = arrayList;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public final void onPageSelected(int i) {
        super.onPageSelected(i);
        PremiumActivity premiumActivity = this.f50496OooO00o;
        premiumActivity.f26684OooOoo0 = i;
        PremiumActivity.OooOoO0(premiumActivity, this.f50497OooO0O0.get(i));
    }
}

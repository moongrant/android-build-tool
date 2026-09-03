package p496o0o00o;

import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.PremiumShopModel;
import com.yalla.yalla.model.PremiumState;
import com.yalla.yalla.model.PremiumTimeModel;
import com.yalla.yalla.model.VipBuyResultModel;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO00O extends Lambda implements Function1<VipBuyResultModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PremiumActivity f49179OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ PremiumShopModel.PremiumInfo f49180OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO00O(PremiumActivity premiumActivity, PremiumShopModel.PremiumInfo premiumInfo) {
        super(1);
        this.f49179OooO0Oo = premiumActivity;
        this.f49180OooO0o0 = premiumInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(VipBuyResultModel vipBuyResultModel) {
        VipBuyResultModel vipBuyResultModel2 = vipBuyResultModel;
        if (vipBuyResultModel2 != null) {
            o000000O o000000o2 = o000000O.f46674OooO00o;
            o000000O.OooO0O0().postValue(Long.valueOf(vipBuyResultModel2.getBalance()));
            o000000O.OooOO0o().setValue(new Pair(Boolean.TRUE, Integer.valueOf(this.f49180OooO0o0.getVipLevel().getValue())));
        }
        PremiumActivity premiumActivity = this.f49179OooO0Oo;
        PremiumTimeModel premiumTimeModel = premiumActivity.f27147OooOoO;
        if (premiumTimeModel != null) {
            premiumTimeModel.setState(PremiumState.Opened.getValue());
        }
        PremiumActivity.OooOoO0(premiumActivity, (PremiumShopModel.PremiumInfo) premiumActivity.f27142OooOo.get(premiumActivity.f27151OooOoo0));
        if (!premiumActivity.isFinishing()) {
            PremiumActivity.OooOoOO(premiumActivity);
            premiumActivity.Oooo0o0(false);
        }
        LiveEventBus.get("CUSTOM_THEME_GET_YALLA_PREMIUM_4_5").post(null);
        return Unit.INSTANCE;
    }
}

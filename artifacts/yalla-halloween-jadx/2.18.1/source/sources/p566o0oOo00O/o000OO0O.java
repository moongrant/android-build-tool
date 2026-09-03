package p566o0oOo00O;

import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.common.ui.view.PremiumState;
import com.yalla.yalla.model.PremiumShopModel;
import com.yalla.yalla.model.PremiumTimeModel;
import com.yalla.yalla.model.VipBuyResultModel;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OO0O extends Lambda implements Function1<VipBuyResultModel, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PremiumActivity f45224Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ PremiumShopModel.PremiumInfo f45225Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO0O(PremiumActivity premiumActivity, PremiumShopModel.PremiumInfo premiumInfo) {
        super(1);
        this.f45224Oooo0o = premiumActivity;
        this.f45225Oooo0oO = premiumInfo;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.PremiumShopModel$PremiumInfo>] */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(VipBuyResultModel vipBuyResultModel) {
        VipBuyResultModel vipBuyResultModel2 = vipBuyResultModel;
        if (vipBuyResultModel2 != null) {
            PremiumShopModel.PremiumInfo premiumInfo = this.f45225Oooo0oO;
            OooOOO oooOOO = OooOOO.f41216OooO00o;
            oooOOO.OooO0OO().postValue(Long.valueOf(vipBuyResultModel2.getBalance()));
            oooOOO.OooOOO0().setValue(new Pair<>(Boolean.TRUE, Integer.valueOf(premiumInfo.getVipLevel().getValue())));
        }
        PremiumTimeModel premiumTimeModel = this.f45224Oooo0o.f23367Oooooo;
        if (premiumTimeModel != null) {
            premiumTimeModel.setState(PremiumState.Opened.getValue());
        }
        PremiumActivity premiumActivity = this.f45224Oooo0o;
        PremiumActivity.OooOooO(premiumActivity, (PremiumShopModel.PremiumInfo) premiumActivity.f23366OooooOo.get(premiumActivity.f23370Ooooooo));
        if (!this.f45224Oooo0o.isFinishing()) {
            this.f45224Oooo0o.OoooO00();
            this.f45224Oooo0o.Oooo(false);
        }
        LiveEventBus.get("CUSTOM_THEME_GET_YALLA_PREMIUM_4_5").post(null);
        return Unit.INSTANCE;
    }
}

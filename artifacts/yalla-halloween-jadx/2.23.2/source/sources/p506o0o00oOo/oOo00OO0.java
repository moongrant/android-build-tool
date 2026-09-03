package p506o0o00oOo;

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
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo00OO0 extends Lambda implements Function1<VipBuyResultModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PremiumActivity f50563OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ PremiumShopModel.PremiumInfo f50564OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo00OO0(PremiumActivity premiumActivity, PremiumShopModel.PremiumInfo premiumInfo) {
        super(1);
        this.f50563OooO0Oo = premiumActivity;
        this.f50564OooO0o0 = premiumInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(VipBuyResultModel vipBuyResultModel) {
        VipBuyResultModel vipBuyResultModel2 = vipBuyResultModel;
        if (vipBuyResultModel2 != null) {
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            o0O00oO0.OooO0O0().postValue(Long.valueOf(vipBuyResultModel2.getBalance()));
            o0O00oO0.OooOO0o().setValue(new Pair(Boolean.TRUE, Integer.valueOf(this.f50564OooO0o0.getVipLevel().getValue())));
        }
        PremiumActivity premiumActivity = this.f50563OooO0Oo;
        PremiumTimeModel premiumTimeModel = premiumActivity.f26680OooOoO;
        if (premiumTimeModel != null) {
            premiumTimeModel.setState(PremiumState.Opened.getValue());
        }
        PremiumActivity.OooOoO0(premiumActivity, (PremiumShopModel.PremiumInfo) premiumActivity.f26675OooOo.get(premiumActivity.f26684OooOoo0));
        if (!premiumActivity.isFinishing()) {
            PremiumActivity.OooOoOO(premiumActivity);
            premiumActivity.Oooo0OO(false);
        }
        LiveEventBus.get("CUSTOM_THEME_GET_YALLA_PREMIUM_4_5").post(null);
        return Unit.INSTANCE;
    }
}

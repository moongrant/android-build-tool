package p506o0o00oOo;

import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.vip.VipShopExchangeModel;
import com.yalla.yalla.ui.activity.user.UserWelfareMallActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class b1 extends Lambda implements Function1<VipShopExchangeModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserWelfareMallActivity f50394OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(UserWelfareMallActivity userWelfareMallActivity) {
        super(1);
        this.f50394OooO0Oo = userWelfareMallActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(VipShopExchangeModel vipShopExchangeModel) {
        VipShopExchangeModel it = vipShopExchangeModel;
        Intrinsics.checkNotNullParameter(it, "it");
        LiveEventBus.get("WELFARE_INFO_CHANGE").post(it);
        UserWelfareMallActivity userWelfareMallActivity = this.f50394OooO0Oo;
        UserWelfareMallActivity.OooOo(userWelfareMallActivity).getCurrentUserWelfareModel().setEnable(it.getIsEnable());
        userWelfareMallActivity.f26910OooOo0O.setValue(Long.valueOf(it.getPointBalance()));
        userWelfareMallActivity.f26911OooOo0o.setValue(Long.valueOf(it.getExpiringPoint()));
        return Unit.INSTANCE;
    }
}

package p566o0oOo00O;

import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.RechargeMenuConfirmOrderResultModel;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OO00 extends Lambda implements Function1<ApiResult<RechargeMenuConfirmOrderResultModel>, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PremiumActivity f45222Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f45223Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO00(PremiumActivity premiumActivity, Ref.BooleanRef booleanRef) {
        super(1);
        this.f45222Oooo0o = premiumActivity;
        this.f45223Oooo0oO = booleanRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<RechargeMenuConfirmOrderResultModel> apiResult) {
        ApiResult<RechargeMenuConfirmOrderResultModel> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        PremiumActivity premiumActivity = this.f45222Oooo0o;
        premiumActivity.f23372o00Oo0 = false;
        Intrinsics.checkNotNull(premiumActivity, "null cannot be cast to non-null type com.yalla.yalla.ui.activity.BaseActivityK");
        premiumActivity.OooOoO();
        if (this.f45223Oooo0oO.element) {
            LiveEventBus.get("Subscription_OnSuccess_UpdateUserInfo").postDelay(Boolean.TRUE, 2000L);
        }
        return Unit.INSTANCE;
    }
}

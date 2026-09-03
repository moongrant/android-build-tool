package p496o0o00o;

import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.RechargeMenuConfirmOrderResultModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes4.dex */
public final class oo00o extends Lambda implements Function1<ApiResult<RechargeMenuConfirmOrderResultModel>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PremiumActivity f49190OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f49191OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo00o(PremiumActivity premiumActivity, Ref.BooleanRef booleanRef) {
        super(1);
        this.f49190OooO0Oo = premiumActivity;
        this.f49191OooO0o0 = booleanRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<RechargeMenuConfirmOrderResultModel> apiResult) {
        ApiResult<RechargeMenuConfirmOrderResultModel> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        PremiumActivity premiumActivity = this.f49190OooO0Oo;
        premiumActivity.f27155Oooo000 = false;
        Intrinsics.checkNotNull(premiumActivity, "null cannot be cast to non-null type com.yalla.yalla.ui.activity.BaseActivityK");
        premiumActivity.OooOo0();
        if (this.f49191OooO0o0.element) {
            LiveEventBus.get("Subscription_OnSuccess_UpdateUserInfo").postDelay(Boolean.TRUE, 2000L);
        }
        return Unit.INSTANCE;
    }
}

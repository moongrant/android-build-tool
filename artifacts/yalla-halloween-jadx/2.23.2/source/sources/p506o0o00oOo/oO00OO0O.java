package p506o0o00oOo;

import com.yalla.yalla.data.db.table.PayOrder;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00OO0O extends Lambda implements Function1<ApiError, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PremiumActivity f50449OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f50450OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ PayOrder f50451OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00OO0O(PremiumActivity premiumActivity, PayOrder payOrder, Ref.BooleanRef booleanRef) {
        super(1);
        this.f50449OooO0Oo = premiumActivity;
        this.f50451OooO0o0 = payOrder;
        this.f50450OooO0o = booleanRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiError apiError) {
        ApiError it = apiError;
        Intrinsics.checkNotNullParameter(it, "it");
        int code = it.getCode();
        PremiumActivity premiumActivity = this.f50449OooO0Oo;
        PayOrder payOrder = this.f50451OooO0o0;
        if (code == 2000) {
            int i = PremiumActivity.f26673Oooo0oO;
            premiumActivity.Oooo0O0().deleteOrderToDB(payOrder.getOrderId());
            this.f50450OooO0o.element = true;
        } else if (code != 2005) {
            payOrder.setErrorCode(it.getCode());
            int i2 = PremiumActivity.f26673Oooo0oO;
            premiumActivity.Oooo0O0().onConfirmOrderErrorUploadLog(payOrder);
            premiumActivity.f26686OooOooo++;
            PremiumActivity.OooOoO(premiumActivity, payOrder);
        } else {
            payOrder.setErrorCode(it.getCode());
            int i3 = PremiumActivity.f26673Oooo0oO;
            premiumActivity.Oooo0O0().onConfirmOrderErrorUploadLog(payOrder);
            premiumActivity.f26686OooOooo++;
            PremiumActivity.OooOoO(premiumActivity, payOrder);
            premiumActivity.Oooo0O0().deleteOrderToDB(payOrder.getOrderId());
        }
        return Unit.INSTANCE;
    }
}

package p496o0o00o;

import com.yalla.yalla.data.db.table.PayOrder;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O00o0 extends Lambda implements Function1<ApiError, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PremiumActivity f49017OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f49018OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ PayOrder f49019OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00o0(PremiumActivity premiumActivity, PayOrder payOrder, Ref.BooleanRef booleanRef) {
        super(1);
        this.f49017OooO0Oo = premiumActivity;
        this.f49019OooO0o0 = payOrder;
        this.f49018OooO0o = booleanRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiError apiError) {
        ApiError it = apiError;
        Intrinsics.checkNotNullParameter(it, "it");
        int code = it.getCode();
        PremiumActivity premiumActivity = this.f49017OooO0Oo;
        PayOrder payOrder = this.f49019OooO0o0;
        if (code == 2000) {
            int i = PremiumActivity.f27140Oooo0oO;
            premiumActivity.Oooo0OO().deleteOrderToDB(payOrder.getOrderId());
            this.f49018OooO0o.element = true;
        } else if (code != 2005) {
            payOrder.setErrorCode(it.getCode());
            int i2 = PremiumActivity.f27140Oooo0oO;
            premiumActivity.Oooo0OO().onConfirmOrderErrorUploadLog(payOrder);
            premiumActivity.f27153OooOooo++;
            PremiumActivity.OooOoO(premiumActivity, payOrder);
        } else {
            payOrder.setErrorCode(it.getCode());
            int i3 = PremiumActivity.f27140Oooo0oO;
            premiumActivity.Oooo0OO().onConfirmOrderErrorUploadLog(payOrder);
            premiumActivity.f27153OooOooo++;
            PremiumActivity.OooOoO(premiumActivity, payOrder);
            premiumActivity.Oooo0OO().deleteOrderToDB(payOrder.getOrderId());
        }
        return Unit.INSTANCE;
    }
}

package p436o0OoOOo;

import com.yalla.yalla.data.db.table.PayOrder;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.ui.vm.WalletCoinVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O0 extends Lambda implements Function1<ApiError, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PayOrder f47047OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0000 f47048OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O0(PayOrder payOrder, o0000 o0000Var) {
        super(1);
        this.f47047OooO0Oo = payOrder;
        this.f47048OooO0o0 = o0000Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiError apiError) {
        ApiError it = apiError;
        Intrinsics.checkNotNullParameter(it, "it");
        int code = it.getCode();
        PayOrder payOrder = this.f47047OooO0Oo;
        payOrder.setErrorCode(code);
        o0000 o0000Var = this.f47048OooO0o0;
        ((WalletCoinVM) o0000Var.f47030OooO0oo.getValue()).onConfirmOrderErrorUploadLog(payOrder);
        o0000Var.f47035OooOOO0++;
        o0000.OooO0O0(payOrder, o0000Var);
        int code2 = it.getCode();
        if (code2 == 2000 || code2 == 2005) {
            o0000Var.OooO0o0().deleteOrderToDB(payOrder.getOrderId());
        }
        return Unit.INSTANCE;
    }
}

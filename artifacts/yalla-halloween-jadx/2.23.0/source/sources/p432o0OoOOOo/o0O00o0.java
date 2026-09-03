package p432o0OoOOOo;

import com.yalla.yalla.data.db.table.PayOrder;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.ui.vm.WalletCoinVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00o0 extends Lambda implements Function1<ApiError, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PayOrder f45958OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o00OOOOo f45959OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00o0(PayOrder payOrder, o00OOOOo o00ooooo2) {
        super(1);
        this.f45958OooO0Oo = payOrder;
        this.f45959OooO0o0 = o00ooooo2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiError apiError) {
        ApiError it = apiError;
        Intrinsics.checkNotNullParameter(it, "it");
        int code = it.getCode();
        PayOrder payOrder = this.f45958OooO0Oo;
        payOrder.setErrorCode(code);
        o00OOOOo o00ooooo2 = this.f45959OooO0o0;
        ((WalletCoinVM) o00ooooo2.f45927OooO0oo.getValue()).onConfirmOrderErrorUploadLog(payOrder);
        o00ooooo2.f45932OooOOO0++;
        o00OOOOo.OooO0O0(payOrder, o00ooooo2);
        int code2 = it.getCode();
        if (code2 == 2000 || code2 == 2005) {
            o00ooooo2.OooO0o0().deleteOrderToDB(payOrder.getOrderId());
        }
        return Unit.INSTANCE;
    }
}

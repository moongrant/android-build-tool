package p432o0OoOOOo;

import android.os.Looper;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.db.table.PayOrder;
import com.yalla.yalla.manager.unBlur.googlepay.quick.GooglePayQuickVM;
import com.yalla.yalla.model.RechargeMenuConfirmOrderResultModel;
import com.yalla.yalla.ui.vm.WalletCoinVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p464o0Oooo.o000000O;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oOO extends Lambda implements Function1<RechargeMenuConfirmOrderResultModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00OOOOo f45972OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ PayOrder f45973OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oOO(PayOrder payOrder, o00OOOOo o00ooooo2) {
        super(1);
        this.f45972OooO0Oo = o00ooooo2;
        this.f45973OooO0o0 = payOrder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(RechargeMenuConfirmOrderResultModel rechargeMenuConfirmOrderResultModel) {
        Long balance;
        RechargeMenuConfirmOrderResultModel rechargeMenuConfirmOrderResultModel2 = rechargeMenuConfirmOrderResultModel;
        LiveEventBus.get("ConfirmRechargeOrder_Success").post(Boolean.TRUE);
        if (rechargeMenuConfirmOrderResultModel2 != null && (balance = rechargeMenuConfirmOrderResultModel2.getBalance()) != null) {
            long jLongValue = balance.longValue();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            o000000O.OooO0O0().postValue(Long.valueOf(jLongValue));
        }
        o00OOOOo o00ooooo2 = this.f45972OooO0Oo;
        GooglePayQuickVM googlePayQuickVMOooO0o0 = o00ooooo2.OooO0o0();
        PayOrder payOrder = this.f45973OooO0o0;
        googlePayQuickVMOooO0o0.deleteOrderToDB(payOrder.getOrderId());
        String string = o00ooooo2.f45920OooO00o.getString(oO00OOo0.purchase_succ);
        if (!(string == null || StringsKt.isBlank(string))) {
            o000Oo0 o000oo0OooO00o = o000O00.OooO00o(string, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                o000O0.f10355OooO0O0.post(o000oo0OooO00o);
            }
        }
        ((WalletCoinVM) o00ooooo2.f45927OooO0oo.getValue()).onConfirmOrderSuccessUploadLog(payOrder.getAmount(), payOrder.getSku(), o00ooooo2.OooO0Oo().f10111OooOOoo);
        Function0<Unit> function0 = o00ooooo2.f45924OooO0o;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}

package p436o0OoOOo;

import android.os.Looper;
import androidx.activity.OooOo00;
import com.code.android.util.o000O00O;
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
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000oo extends Lambda implements Function1<RechargeMenuConfirmOrderResultModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0000 f47054OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ PayOrder f47055OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000oo(PayOrder payOrder, o0000 o0000Var) {
        super(1);
        this.f47054OooO0Oo = o0000Var;
        this.f47055OooO0o0 = payOrder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(RechargeMenuConfirmOrderResultModel rechargeMenuConfirmOrderResultModel) {
        Long balance;
        RechargeMenuConfirmOrderResultModel rechargeMenuConfirmOrderResultModel2 = rechargeMenuConfirmOrderResultModel;
        LiveEventBus.get("ConfirmRechargeOrder_Success").post(Boolean.TRUE);
        if (rechargeMenuConfirmOrderResultModel2 != null && (balance = rechargeMenuConfirmOrderResultModel2.getBalance()) != null) {
            long jLongValue = balance.longValue();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            o0O00oO0.OooO0O0().postValue(Long.valueOf(jLongValue));
        }
        o0000 o0000Var = this.f47054OooO0Oo;
        GooglePayQuickVM googlePayQuickVMOooO0o0 = o0000Var.OooO0o0();
        PayOrder payOrder = this.f47055OooO0o0;
        googlePayQuickVMOooO0o0.deleteOrderToDB(payOrder.getOrderId());
        String string = o0000Var.f47023OooO00o.getString(o000000.purchase_succ);
        if (!(string == null || StringsKt.isBlank(string))) {
            o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(string, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
            }
        }
        ((WalletCoinVM) o0000Var.f47030OooO0oo.getValue()).onConfirmOrderSuccessUploadLog(payOrder.getAmount(), payOrder.getSku(), o0000Var.OooO0Oo().f13189OooOOoo);
        Function0<Unit> function0 = o0000Var.f47027OooO0o;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}

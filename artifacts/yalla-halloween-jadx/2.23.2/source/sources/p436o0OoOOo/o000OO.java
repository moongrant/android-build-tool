package p436o0OoOOo;

import androidx.lifecycle.LifecycleOwnerKt;
import com.yalla.yalla.model.RechargeMenuCreateOrderModel;
import com.yalla.yalla.model.RechargeMenuCreateOrderResultModel;
import com.yalla.yalla.model.RechargeMenuToPayModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OO extends Lambda implements Function1<RechargeMenuCreateOrderResultModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0000 f47073OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RechargeMenuCreateOrderModel f47074OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO(o0000 o0000Var, RechargeMenuCreateOrderModel rechargeMenuCreateOrderModel) {
        super(1);
        this.f47073OooO0Oo = o0000Var;
        this.f47074OooO0o0 = rechargeMenuCreateOrderModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(RechargeMenuCreateOrderResultModel rechargeMenuCreateOrderResultModel) {
        RechargeMenuCreateOrderResultModel rechargeMenuCreateOrderResultModel2 = rechargeMenuCreateOrderResultModel;
        o0000 o0000Var = this.f47073OooO0Oo;
        if (rechargeMenuCreateOrderResultModel2 == null || StringsKt.isBlank(rechargeMenuCreateOrderResultModel2.getOrderid())) {
            o0000Var.f47033OooOO0o = false;
        } else {
            RechargeMenuToPayModel rechargeMenuToPayModel = new RechargeMenuToPayModel();
            RechargeMenuCreateOrderModel rechargeMenuCreateOrderModel = this.f47074OooO0o0;
            rechargeMenuToPayModel.setSku(rechargeMenuCreateOrderModel.getSku());
            rechargeMenuToPayModel.setType(rechargeMenuCreateOrderModel.getType());
            rechargeMenuToPayModel.setSkuDetails(rechargeMenuCreateOrderModel.getSkuDetails());
            rechargeMenuToPayModel.setProductDetails(rechargeMenuCreateOrderModel.getProductDetails());
            rechargeMenuToPayModel.setUnit(rechargeMenuCreateOrderModel.getUnit());
            rechargeMenuToPayModel.setPmId(rechargeMenuCreateOrderModel.getPmId());
            rechargeMenuToPayModel.setOrderid(rechargeMenuCreateOrderResultModel2.getOrderid());
            rechargeMenuToPayModel.setCoin(rechargeMenuCreateOrderModel.getCoin());
            rechargeMenuToPayModel.setAmount(rechargeMenuCreateOrderModel.getAmount());
            o0000Var.getClass();
            if (StringsKt.isBlank(rechargeMenuToPayModel.getOrderid())) {
                o0000Var.f47033OooOO0o = false;
            } else {
                o0000Var.f47033OooOO0o = true;
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(o0000Var.f47023OooO00o), Dispatchers.getIO(), null, new o000O0Oo(o0000Var, rechargeMenuToPayModel, null), 2, null);
            }
        }
        return Unit.INSTANCE;
    }
}

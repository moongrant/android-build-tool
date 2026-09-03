package p432o0OoOOOo;

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
public final class o0oOOo extends Lambda implements Function1<RechargeMenuCreateOrderResultModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00OOOOo f45974OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RechargeMenuCreateOrderModel f45975OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oOOo(o00OOOOo o00ooooo2, RechargeMenuCreateOrderModel rechargeMenuCreateOrderModel) {
        super(1);
        this.f45974OooO0Oo = o00ooooo2;
        this.f45975OooO0o0 = rechargeMenuCreateOrderModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(RechargeMenuCreateOrderResultModel rechargeMenuCreateOrderResultModel) {
        RechargeMenuCreateOrderResultModel rechargeMenuCreateOrderResultModel2 = rechargeMenuCreateOrderResultModel;
        o00OOOOo o00ooooo2 = this.f45974OooO0Oo;
        if (rechargeMenuCreateOrderResultModel2 == null || StringsKt.isBlank(rechargeMenuCreateOrderResultModel2.getOrderid())) {
            o00ooooo2.f45930OooOO0o = false;
        } else {
            RechargeMenuToPayModel rechargeMenuToPayModel = new RechargeMenuToPayModel();
            RechargeMenuCreateOrderModel rechargeMenuCreateOrderModel = this.f45975OooO0o0;
            rechargeMenuToPayModel.setSku(rechargeMenuCreateOrderModel.getSku());
            rechargeMenuToPayModel.setType(rechargeMenuCreateOrderModel.getType());
            rechargeMenuToPayModel.setSkuDetails(rechargeMenuCreateOrderModel.getSkuDetails());
            rechargeMenuToPayModel.setProductDetails(rechargeMenuCreateOrderModel.getProductDetails());
            rechargeMenuToPayModel.setUnit(rechargeMenuCreateOrderModel.getUnit());
            rechargeMenuToPayModel.setPmId(rechargeMenuCreateOrderModel.getPmId());
            rechargeMenuToPayModel.setOrderid(rechargeMenuCreateOrderResultModel2.getOrderid());
            rechargeMenuToPayModel.setCoin(rechargeMenuCreateOrderModel.getCoin());
            rechargeMenuToPayModel.setAmount(rechargeMenuCreateOrderModel.getAmount());
            o00ooooo2.getClass();
            if (StringsKt.isBlank(rechargeMenuToPayModel.getOrderid())) {
                o00ooooo2.f45930OooOO0o = false;
            } else {
                o00ooooo2.f45930OooOO0o = true;
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(o00ooooo2.f45920OooO00o), Dispatchers.getIO(), null, new o0O00(o00ooooo2, rechargeMenuToPayModel, null), 2, null);
            }
        }
        return Unit.INSTANCE;
    }
}

package p432o0OoOOOo;

import android.view.View;
import com.yalla.yalla.model.RechargeMenuCreateOrderModel;
import com.yalla.yalla.model.RechargeMenuType;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import com.yalla.yalla.util.PaySupportChannels;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p466o0Oooo0o.oo00o;

/* JADX INFO: loaded from: classes4.dex */
public final class o0o0Oo extends oo00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ o00OOOO0 f45969OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ RechargeMenuType f45970OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ ViewHolder f45971OooO0oo;

    public o0o0Oo(RechargeMenuType rechargeMenuType, ViewHolder viewHolder, o00OOOO0 o00oooo1) {
        this.f45970OooO0oO = rechargeMenuType;
        this.f45971OooO0oo = viewHolder;
        this.f45969OooO = o00oooo1;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        RechargeMenuCreateOrderModel rechargeMenuCreateOrderModel = new RechargeMenuCreateOrderModel();
        RechargeMenuType rechargeMenuType = this.f45970OooO0oO;
        rechargeMenuCreateOrderModel.setSku(rechargeMenuType.getSku());
        rechargeMenuCreateOrderModel.setType(PaySupportChannels.pay_type_googlePay.getNum());
        rechargeMenuCreateOrderModel.setSkuDetails(rechargeMenuType.getSkuDetails());
        rechargeMenuCreateOrderModel.setProductDetails(rechargeMenuType.getProductDetails());
        rechargeMenuCreateOrderModel.setUnit(rechargeMenuType.getUnit());
        rechargeMenuCreateOrderModel.setPmId(rechargeMenuType.getPmId());
        rechargeMenuCreateOrderModel.setPayurl(rechargeMenuType.getPayurl());
        rechargeMenuCreateOrderModel.setCoin(rechargeMenuType.getCoin());
        rechargeMenuCreateOrderModel.setAmount(rechargeMenuType.getAmount());
        rechargeMenuCreateOrderModel.setCurrency(rechargeMenuType.getUnit());
        rechargeMenuCreateOrderModel.setPositionLocal(this.f45971OooO0oo.getLayoutPosition());
        Function1<? super RechargeMenuCreateOrderModel, Unit> function1 = this.f45969OooO.f45917OooOoo;
        if (function1 != null) {
            function1.invoke(rechargeMenuCreateOrderModel);
        }
    }
}

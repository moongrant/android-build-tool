package p436o0OoOOo;

import android.view.View;
import com.yalla.yalla.model.RechargeMenuCreateOrderModel;
import com.yalla.yalla.model.RechargeMenuType;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import com.yalla.yalla.util.PaySupportChannels;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p473o0OoooOo.o0OOOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000OO extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ o0000Ooo f47043OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ RechargeMenuType f47044OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ ViewHolder f47045OooO0oo;

    public o00000OO(RechargeMenuType rechargeMenuType, ViewHolder viewHolder, o0000Ooo o0000ooo) {
        this.f47044OooO0oO = rechargeMenuType;
        this.f47045OooO0oo = viewHolder;
        this.f47043OooO = o0000ooo;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        RechargeMenuCreateOrderModel rechargeMenuCreateOrderModel = new RechargeMenuCreateOrderModel();
        RechargeMenuType rechargeMenuType = this.f47044OooO0oO;
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
        rechargeMenuCreateOrderModel.setPositionLocal(this.f47045OooO0oo.getLayoutPosition());
        Function1<? super RechargeMenuCreateOrderModel, Unit> function1 = this.f47043OooO.f47052OooOoo;
        if (function1 != null) {
            function1.invoke(rechargeMenuCreateOrderModel);
        }
    }
}

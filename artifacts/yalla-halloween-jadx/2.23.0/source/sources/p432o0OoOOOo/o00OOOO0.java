package p432o0OoOOOo;

import OooO0O0.OooO0O0;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.android.billingclient.api.SkuDetails;
import com.chad.library.adapter.base.BaseViewHolder;
import com.yalla.yalla.model.RechargeMenuCreateOrderModel;
import com.yalla.yalla.model.RechargeMenuType;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import com.zego.zegoavkit2.ZegoConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.Nullable;
import p431o0OoOOOO.o00OO0OO;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p590o0oo0.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00OOOO0 extends o000O<RechargeMenuType> {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @Nullable
    public Function1<? super RechargeMenuCreateOrderModel, Unit> f45917OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f45918OooOoo0;

    /* JADX WARN: Illegal instructions before constructor call */
    public o00OOOO0(FragmentActivity context) {
        int i = oO00OO0O.item_google_pay;
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, i);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        RechargeMenuType item = (RechargeMenuType) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        if (this.f45918OooOoo0 > 0) {
            int i = oO00O0oO.recharge_totalValue;
            ViewGroup.LayoutParams layoutParams = helper.getView(i).getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.width = this.f45918OooOoo0;
            helper.getView(i).setLayoutParams(layoutParams2);
        }
        helper.setText(oO00O0oO.recharge_number, OooOOOO.OooO0Oo(String.valueOf(item.getCoin())));
        int i2 = oO00O0oO.recharge_totalValue;
        String unit = item.getUnit();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        helper.setText(i2, unit + ZegoConstants.ZegoVideoDataAuxPublishingStream + OooO0O0.OooO00o(new Object[]{Double.valueOf(item.getAmount())}, 1, "%.2f", "format(format, *args)"));
        SkuDetails skuDetails = item.getSkuDetails();
        if (skuDetails != null) {
            String strOooO0O0 = skuDetails.OooO0O0();
            Intrinsics.checkNotNullExpressionValue(strOooO0O0, "it.priceCurrencyCode");
            helper.setText(i2, o00OO0OO.OooO00o(skuDetails.OooO00o(), strOooO0O0));
        }
        helper.setViewOnClickListener(i2, new o0o0Oo(item, helper, this));
    }
}

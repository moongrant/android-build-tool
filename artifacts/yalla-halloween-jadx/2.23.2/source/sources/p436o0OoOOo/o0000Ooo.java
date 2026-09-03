package p436o0OoOOo;

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
import p437o0OoOOo0.o000O0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;
import p571o0oOoO0.o0000oo;
import p605o0oo0O0O.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0000Ooo extends o0000oo<RechargeMenuType> {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @Nullable
    public Function1<? super RechargeMenuCreateOrderModel, Unit> f47052OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f47053OooOoo0;

    /* JADX WARN: Illegal instructions before constructor call */
    public o0000Ooo(FragmentActivity context) {
        int i = oo0o0Oo.item_google_pay;
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, i);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
        ViewHolder helper = (ViewHolder) baseViewHolder;
        RechargeMenuType item = (RechargeMenuType) obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        if (this.f47053OooOoo0 > 0) {
            int i = o0OO00O.recharge_totalValue;
            ViewGroup.LayoutParams layoutParams = helper.getView(i).getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.width = this.f47053OooOoo0;
            helper.getView(i).setLayoutParams(layoutParams2);
        }
        helper.setText(o0OO00O.recharge_number, o0O0O0Oo.OooO0Oo(String.valueOf(item.getCoin())));
        int i2 = o0OO00O.recharge_totalValue;
        String unit = item.getUnit();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        helper.setText(i2, unit + ZegoConstants.ZegoVideoDataAuxPublishingStream + OooO0O0.OooO00o(new Object[]{Double.valueOf(item.getAmount())}, 1, "%.2f", "format(format, *args)"));
        SkuDetails skuDetails = item.getSkuDetails();
        if (skuDetails != null) {
            String strOooO0O0 = skuDetails.OooO0O0();
            Intrinsics.checkNotNullExpressionValue(strOooO0O0, "getPriceCurrencyCode(...)");
            helper.setText(i2, o000O0O0.OooO00o(skuDetails.OooO00o(), strOooO0O0));
        }
        helper.setViewOnClickListener(i2, new o00000OO(item, helper, this));
    }
}

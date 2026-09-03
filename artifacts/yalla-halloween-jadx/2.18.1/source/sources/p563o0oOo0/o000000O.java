package p563o0oOo0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.android.billingclient.api.SkuDetails;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO0;
import com.yalla.yalla.common.manager.googlepay.GooglePayPrice;
import com.yalla.yalla.common.model.RechargeMenuCreateOrderModel;
import com.yalla.yalla.common.model.RechargeMenuType;
import com.yalla.yalla.common.util.PaySupportChannels;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p168o00Ooo0.o0O0O00;
import p188o00o00o0.OooO0OO;
import p188o00o00o0.OooO0o;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public class o000000O extends OooO0OO<RechargeMenuType> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f44981OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public Function1<? super RechargeMenuCreateOrderModel, Unit> f44982OooO0O0;

    public static final class OooO00o extends OooOOO0 {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ RechargeMenuType f44983Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ OooO0o f44984Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o000000O f44985Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(RechargeMenuType rechargeMenuType, OooO0o oooO0o, o000000O o000000o2) {
            super(0L, 1, null);
            this.f44983Oooo0o = rechargeMenuType;
            this.f44984Oooo0oO = oooO0o;
            this.f44985Oooo0oo = o000000o2;
        }

        @Override // com.yalla.support.common.util.OooOOO0
        public final void onNoDoubleClick(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            RechargeMenuCreateOrderModel rechargeMenuCreateOrderModel = new RechargeMenuCreateOrderModel();
            rechargeMenuCreateOrderModel.setSku(this.f44983Oooo0o.getSku());
            rechargeMenuCreateOrderModel.setType(PaySupportChannels.pay_type_googlePay.getNum());
            rechargeMenuCreateOrderModel.setSkuDetails(this.f44983Oooo0o.getSkuDetails());
            rechargeMenuCreateOrderModel.setUnit(this.f44983Oooo0o.getUnit());
            rechargeMenuCreateOrderModel.setPmId(this.f44983Oooo0o.getPmId());
            rechargeMenuCreateOrderModel.setPayurl(this.f44983Oooo0o.getPayurl());
            rechargeMenuCreateOrderModel.setCoin(this.f44983Oooo0o.getCoin());
            rechargeMenuCreateOrderModel.setAmount(this.f44983Oooo0o.getAmount());
            rechargeMenuCreateOrderModel.setCurrency(this.f44983Oooo0o.getUnit());
            rechargeMenuCreateOrderModel.setPositionLocal(this.f44984Oooo0oO.getLayoutPosition());
            Function1<? super RechargeMenuCreateOrderModel, Unit> function1 = this.f44985Oooo0oo.f44982OooO0O0;
            if (function1 != null) {
                function1.invoke(rechargeMenuCreateOrderModel);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000O(Context context, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        super(context, R.layout.item_google_pay);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NotNull OooO0o helper, @NotNull RechargeMenuType item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        if (this.f44981OooO00o > 0) {
            ViewGroup.LayoutParams layoutParams = helper.OooO0Oo(R.id.recharge_totalValue).getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.width = this.f44981OooO00o;
            helper.OooO0Oo(R.id.recharge_totalValue).setLayoutParams(layoutParams2);
        }
        helper.OooOO0(R.id.recharge_number, o0O0O00.OooO0Oo(String.valueOf(item.getCoin())));
        if (item.getSkuDetails() == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(item.getUnit());
            sb.append(' ');
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(item.getAmount())}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            sb.append(str);
            helper.OooOO0(R.id.recharge_totalValue, sb.toString());
        } else {
            GooglePayPrice googlePayPrice = GooglePayPrice.INSTANCE;
            SkuDetails skuDetails = item.getSkuDetails();
            Intrinsics.checkNotNull(skuDetails);
            helper.OooOO0(R.id.recharge_totalValue, googlePayPrice.getGooglePayPriceFormat(skuDetails));
        }
        helper.OooOOOO(R.id.recharge_totalValue, new OooO00o(item, helper, this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000O(@NotNull Context context) {
        super(context, R.layout.item_wallet_coin_type);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}

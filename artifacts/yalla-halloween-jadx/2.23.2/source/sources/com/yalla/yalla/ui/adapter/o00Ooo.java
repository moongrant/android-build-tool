package com.yalla.yalla.ui.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.android.billingclient.api.SkuDetails;
import com.yalla.yalla.model.RechargeMenuCreateOrderModel;
import com.yalla.yalla.model.RechargeMenuType;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import com.yalla.yalla.util.PaySupportChannels;
import com.zego.zegoavkit2.ZegoConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p473o0OoooOo.o0OOOO0o;
import p605o0oo0O0O.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public class o00Ooo extends p571o0oOoO0.o0000oo<RechargeMenuType> {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @Nullable
    public Function1<? super RechargeMenuCreateOrderModel, Unit> f27154OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f27155OooOoo0;

    public static final class OooO00o extends o0OOOO0o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ o00Ooo f27156OooO;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ RechargeMenuType f27157OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ ViewHolder f27158OooO0oo;

        public OooO00o(RechargeMenuType rechargeMenuType, ViewHolder viewHolder, o00Ooo o00ooo2) {
            this.f27157OooO0oO = rechargeMenuType;
            this.f27158OooO0oo = viewHolder;
            this.f27156OooO = o00ooo2;
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            RechargeMenuCreateOrderModel rechargeMenuCreateOrderModel = new RechargeMenuCreateOrderModel();
            RechargeMenuType rechargeMenuType = this.f27157OooO0oO;
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
            rechargeMenuCreateOrderModel.setPositionLocal(this.f27158OooO0oo.getLayoutPosition());
            Function1<? super RechargeMenuCreateOrderModel, Unit> function1 = this.f27156OooO.f27154OooOoo;
            if (function1 != null) {
                function1.invoke(rechargeMenuCreateOrderModel);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public o00Ooo(Context context) {
        int i = p562o0oOo000.oo0o0Oo.item_google_pay;
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, i);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: Oooo0o0, reason: merged with bridge method [inline-methods] */
    public void OooO0oO(@NotNull ViewHolder helper, @NotNull RechargeMenuType item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        if (this.f27155OooOoo0 > 0) {
            int i = p562o0oOo000.o0OO00O.recharge_totalValue;
            ViewGroup.LayoutParams layoutParams = helper.getView(i).getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.width = this.f27155OooOoo0;
            helper.getView(i).setLayoutParams(layoutParams2);
        }
        helper.setText(p562o0oOo000.o0OO00O.recharge_number, o0O0O0Oo.OooO0Oo(String.valueOf(item.getCoin())));
        int i2 = p562o0oOo000.o0OO00O.recharge_totalValue;
        String unit = item.getUnit();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        helper.setText(i2, unit + ZegoConstants.ZegoVideoDataAuxPublishingStream + OooO0O0.OooO0O0.OooO00o(new Object[]{Double.valueOf(item.getAmount())}, 1, "%.2f", "format(format, *args)"));
        SkuDetails skuDetails = item.getSkuDetails();
        if (skuDetails != null) {
            String strOooO0O0 = skuDetails.OooO0O0();
            Intrinsics.checkNotNullExpressionValue(strOooO0O0, "getPriceCurrencyCode(...)");
            helper.setText(i2, p437o0OoOOo0.o000O0O0.OooO00o(skuDetails.OooO00o(), strOooO0O0));
        }
        helper.setViewOnClickListener(i2, new OooO00o(item, helper, this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Ooo(@NotNull Context context, int i) {
        super(context, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}

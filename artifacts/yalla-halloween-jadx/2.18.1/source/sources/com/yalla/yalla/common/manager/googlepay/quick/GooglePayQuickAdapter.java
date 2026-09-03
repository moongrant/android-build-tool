package com.yalla.yalla.common.manager.googlepay.quick;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.android.billingclient.api.SkuDetails;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO0;
import com.yalla.yalla.common.manager.googlepay.GooglePayPrice;
import com.yalla.yalla.common.model.RechargeMenuCreateOrderModel;
import com.yalla.yalla.common.model.RechargeMenuType;
import com.yalla.yalla.common.util.PaySupportChannels;
import java.util.Arrays;
import kotlin.Metadata;
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

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001c\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0014R\"\u0010\t\u001a\u00020\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR?\u0010\u0014\u001a\u001f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, d2 = {"Lcom/yalla/yalla/common/manager/googlepay/quick/GooglePayQuickAdapter;", "Lo00o00o0/OooO0OO;", "Lcom/yalla/yalla/common/model/RechargeMenuType;", "Lo00o00o0/OooO0o;", "helper", "item", "", "convert", "", "minwidth", "I", "getMinwidth", "()I", "setMinwidth", "(I)V", "Lkotlin/Function1;", "Lcom/yalla/yalla/common/model/RechargeMenuCreateOrderModel;", "Lkotlin/ParameterName;", "name", DeviceRequestsHelper.DEVICE_INFO_MODEL, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/jvm/functions/Function1;", "getListener", "()Lkotlin/jvm/functions/Function1;", "setListener", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/content/Context;", d.R, "layoutResId", "<init>", "(Landroid/content/Context;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class GooglePayQuickAdapter extends OooO0OO<RechargeMenuType> {
    public static final int $stable = 8;

    @Nullable
    private Function1<? super RechargeMenuCreateOrderModel, Unit> listener;
    private int minwidth;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayQuickAdapter(@NotNull Context context, int i) {
        super(context, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Nullable
    public final Function1<RechargeMenuCreateOrderModel, Unit> getListener() {
        return this.listener;
    }

    public int getMinwidth() {
        return this.minwidth;
    }

    public final void setListener(@Nullable Function1<? super RechargeMenuCreateOrderModel, Unit> function1) {
        this.listener = function1;
    }

    public void setMinwidth(int i) {
        this.minwidth = i;
    }

    public /* synthetic */ GooglePayQuickAdapter(Context context, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? R.layout.item_google_pay : i);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NotNull final OooO0o helper, @NotNull final RechargeMenuType item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        if (getMinwidth() > 0) {
            ViewGroup.LayoutParams layoutParams = helper.OooO0Oo(R.id.recharge_totalValue).getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.width = getMinwidth();
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
        helper.OooOOOO(R.id.recharge_totalValue, new OooOOO0() { // from class: com.yalla.yalla.common.manager.googlepay.quick.GooglePayQuickAdapter.convert.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0L, 1, null);
            }

            @Override // com.yalla.support.common.util.OooOOO0
            public void onNoDoubleClick(@NotNull View view) {
                Intrinsics.checkNotNullParameter(view, "view");
                RechargeMenuCreateOrderModel rechargeMenuCreateOrderModel = new RechargeMenuCreateOrderModel();
                rechargeMenuCreateOrderModel.setSku(item.getSku());
                rechargeMenuCreateOrderModel.setType(PaySupportChannels.pay_type_googlePay.getNum());
                rechargeMenuCreateOrderModel.setSkuDetails(item.getSkuDetails());
                rechargeMenuCreateOrderModel.setUnit(item.getUnit());
                rechargeMenuCreateOrderModel.setPmId(item.getPmId());
                rechargeMenuCreateOrderModel.setPayurl(item.getPayurl());
                rechargeMenuCreateOrderModel.setCoin(item.getCoin());
                rechargeMenuCreateOrderModel.setAmount(item.getAmount());
                rechargeMenuCreateOrderModel.setCurrency(item.getUnit());
                rechargeMenuCreateOrderModel.setPositionLocal(helper.getLayoutPosition());
                Function1<RechargeMenuCreateOrderModel, Unit> listener = this.getListener();
                if (listener != null) {
                    listener.invoke(rechargeMenuCreateOrderModel);
                }
            }
        });
    }
}

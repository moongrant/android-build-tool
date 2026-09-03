package com.yalla.yalla.ui.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.SkuDetails;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.facebook.appevents.AppEventsConstants;
import com.yalla.yalla.model.RechargeMenuCreateOrderModel;
import com.yalla.yalla.model.RechargeMenuType;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import p590o0oOooo0.oOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o000OOo extends o00Ooo {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f27082OooOooO;

    public static final class OooO00o extends p571o0oOoO0.o0000oo<RechargeMenuType> {

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final /* synthetic */ o000OOo f27083OooOoo0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(final RechargeMenuType rechargeMenuType, final ViewHolder viewHolder, final o000OOo o000ooo2, Context context, int i, List<RechargeMenuType> list) {
            super(i, context, list);
            this.f27083OooOoo0 = o000ooo2;
            this.f13179OooO0oo = new BaseQuickAdapter.OooO0O0() { // from class: com.yalla.yalla.ui.adapter.o0O0O00
                @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0O0
                public final void OooO0O0(BaseQuickAdapter baseQuickAdapter, View view, int i2) {
                    o000OOo.OooO00o this$0 = this.f27166OooO0Oo;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    RechargeMenuType item = rechargeMenuType;
                    Intrinsics.checkNotNullParameter(item, "$item");
                    ViewHolder helper = viewHolder;
                    Intrinsics.checkNotNullParameter(helper, "$helper");
                    o000OOo this$1 = o000ooo2;
                    Intrinsics.checkNotNullParameter(this$1, "this$1");
                    RechargeMenuCreateOrderModel rechargeMenuCreateOrderModel = new RechargeMenuCreateOrderModel();
                    rechargeMenuCreateOrderModel.setSku(((RechargeMenuType) this$0.f13189OooOOoo.get(i2)).getSku());
                    rechargeMenuCreateOrderModel.setType(item.getType());
                    rechargeMenuCreateOrderModel.setSkuDetails(((RechargeMenuType) this$0.f13189OooOOoo.get(i2)).getSkuDetails());
                    rechargeMenuCreateOrderModel.setProductDetails(((RechargeMenuType) this$0.f13189OooOOoo.get(i2)).getProductDetails());
                    rechargeMenuCreateOrderModel.setUnit(((RechargeMenuType) this$0.f13189OooOOoo.get(i2)).getUnit());
                    rechargeMenuCreateOrderModel.setPmId(((RechargeMenuType) this$0.f13189OooOOoo.get(i2)).getPmId());
                    rechargeMenuCreateOrderModel.setPayurl(item.getPayurl());
                    rechargeMenuCreateOrderModel.setCoin(((RechargeMenuType) this$0.f13189OooOOoo.get(i2)).getCoin());
                    rechargeMenuCreateOrderModel.setAmount(((RechargeMenuType) this$0.f13189OooOOoo.get(i2)).getAmount());
                    rechargeMenuCreateOrderModel.setCurrency(item.getUnit());
                    rechargeMenuCreateOrderModel.setPositionLocal(helper.getLayoutPosition());
                    Function1<? super RechargeMenuCreateOrderModel, Unit> function1 = this$1.f27154OooOoo;
                    if (function1 != null) {
                        function1.invoke(rechargeMenuCreateOrderModel);
                    }
                }
            };
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
            ViewHolder helper = (ViewHolder) baseViewHolder;
            RechargeMenuType item = (RechargeMenuType) obj;
            Intrinsics.checkNotNullParameter(helper, "helper");
            Intrinsics.checkNotNullParameter(item, "item");
            helper.setText(p562o0oOo000.o0OO00O.tvCoin, String.valueOf(item.getCoin()));
            String strValueOf = String.valueOf(item.getAmount());
            if (StringsKt__StringsKt.indexOf$default((CharSequence) strValueOf, ".", 0, false, 6, (Object) null) == strValueOf.length() - 2) {
                strValueOf = strValueOf.concat(AppEventsConstants.EVENT_PARAM_VALUE_NO);
            }
            int i = p562o0oOo000.o0OO00O.btPay;
            helper.setText(i, item.getUnit() + ZegoConstants.ZegoVideoDataAuxPublishingStream + strValueOf);
            SkuDetails skuDetails = item.getSkuDetails();
            if (skuDetails != null) {
                String strOooO0O0 = skuDetails.OooO0O0();
                Intrinsics.checkNotNullExpressionValue(strOooO0O0, "getPriceCurrencyCode(...)");
                helper.setText(i, p437o0OoOOo0.o000O0O0.OooO00o(skuDetails.OooO00o(), strOooO0O0));
            }
            o000OOo o000ooo2 = this.f27083OooOoo0;
            if (o000ooo2.f27155OooOoo0 > 0) {
                ViewGroup.LayoutParams layoutParams = helper.getView(i).getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) layoutParams2).width = o000ooo2.f27155OooOoo0;
                helper.getView(i).setLayoutParams(layoutParams2);
            }
            helper.addOnClickListener(i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo(Context context) {
        super(context, p562o0oOo000.oo0o0Oo.item_wallet_coin_type);
        boolean zOooO0O0 = oOO0.f57167OooO00o.OooO0O0();
        Intrinsics.checkNotNullParameter(context, "context");
        this.f27082OooOooO = zOooO0O0 ? 0 : -1;
        this.f13176OooO0o = new androidx.fragment.app.o000O0Oo(this);
    }

    @Override // com.yalla.yalla.ui.adapter.o00Ooo, com.chad.library.adapter.base.BaseQuickAdapter
    /* JADX INFO: renamed from: Oooo0o0 */
    public final void OooO0oO(@NotNull ViewHolder helper, @NotNull RechargeMenuType item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        Context context = this.f56423OooOo;
        o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(context);
        oooO00o.f43126OooO0OO = item.getLogo();
        oooO00o.f43124OooO00o = 0;
        oooO00o.f43151OooOoo0 = 3;
        oooO00o.OooO0Oo((ImageView) helper.getView(p562o0oOo000.o0OO00O.nivType));
        helper.setText(p562o0oOo000.o0OO00O.tvName, item.getName());
        RecyclerView recyclerView = (RecyclerView) helper.getView(p562o0oOo000.o0OO00O.rvList);
        ImageView imageView = (ImageView) helper.getView(p562o0oOo000.o0OO00O.ivMask);
        if (helper.getLayoutPosition() == this.f27082OooOooO) {
            Intrinsics.checkNotNull(recyclerView);
            com.code.android.util.o000O.OooOOOO(recyclerView);
            imageView.setRotationX(180.0f);
        } else {
            imageView.setRotationX(0.0f);
            Intrinsics.checkNotNull(recyclerView);
            com.code.android.util.o000O.OooO0O0(recyclerView);
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(new OooO00o(item, helper, this, this.f56423OooOo, p562o0oOo000.oo0o0Oo.user_item_wallet_coin_list, item.getShoplist()));
    }
}

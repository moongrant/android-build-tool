package p563o0oOo0;

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
import com.weieyu.yalla.R;
import com.yalla.yalla.common.manager.googlepay.GooglePayPrice;
import com.yalla.yalla.common.model.RechargeMenuCreateOrderModel;
import com.yalla.yalla.common.model.RechargeMenuType;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import p143o00OOooo.o00O00;
import p188o00o00o0.OooO0OO;
import p188o00o00o0.OooO0o;
import p254o00ooO0O.oOO00O;
import p516o0o0O000.OooOo;
import p616o0oo0Ooo.oO0O00;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class o0000O extends o000000O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ int f44998OooO0Oo = 0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f44999OooO0OO;

    public static final class OooO00o extends OooO0OO<RechargeMenuType> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ o0000O f45000OooO00o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(final RechargeMenuType rechargeMenuType, final OooO0o oooO0o, final o0000O o0000o2, Context context, List<RechargeMenuType> list) {
            super(context, R.layout.user_item_wallet_coin_list, list);
            this.f45000OooO00o = o0000o2;
            setOnItemChildClickListener(new BaseQuickAdapter.OooOOO0() { // from class: o0oOo0.o000OO
                @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOO0
                public final void OooO0oo(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                    o0000O.OooO00o this$0 = this.f45048OooO0Oo;
                    RechargeMenuType item = rechargeMenuType;
                    OooO0o helper = oooO0o;
                    o0000O this$1 = o0000o2;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullParameter(item, "$item");
                    Intrinsics.checkNotNullParameter(helper, "$helper");
                    Intrinsics.checkNotNullParameter(this$1, "this$1");
                    RechargeMenuCreateOrderModel rechargeMenuCreateOrderModel = new RechargeMenuCreateOrderModel();
                    rechargeMenuCreateOrderModel.setSku(this$0.getData().get(i).getSku());
                    rechargeMenuCreateOrderModel.setType(item.getType());
                    rechargeMenuCreateOrderModel.setSkuDetails(this$0.getData().get(i).getSkuDetails());
                    rechargeMenuCreateOrderModel.setUnit(this$0.getData().get(i).getUnit());
                    rechargeMenuCreateOrderModel.setPmId(this$0.getData().get(i).getPmId());
                    rechargeMenuCreateOrderModel.setPayurl(item.getPayurl());
                    rechargeMenuCreateOrderModel.setCoin(this$0.getData().get(i).getCoin());
                    rechargeMenuCreateOrderModel.setAmount(this$0.getData().get(i).getAmount());
                    rechargeMenuCreateOrderModel.setCurrency(item.getUnit());
                    rechargeMenuCreateOrderModel.setPositionLocal(helper.getLayoutPosition());
                    Function1<? super RechargeMenuCreateOrderModel, Unit> function1 = this$1.f44982OooO0O0;
                    if (function1 != null) {
                        function1.invoke(rechargeMenuCreateOrderModel);
                    }
                }
            });
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
            OooO0o helper = (OooO0o) oooO00o;
            RechargeMenuType item = (RechargeMenuType) obj;
            Intrinsics.checkNotNullParameter(helper, "helper");
            Intrinsics.checkNotNullParameter(item, "item");
            helper.OooOO0(R.id.tvCoin, String.valueOf(item.getCoin()));
            String strValueOf = String.valueOf(item.getAmount());
            if (StringsKt__StringsKt.indexOf$default((CharSequence) strValueOf, ".", 0, false, 6, (Object) null) == strValueOf.length() - 2) {
                strValueOf = strValueOf + '0';
            }
            if (item.getSkuDetails() == null) {
                helper.OooOO0(R.id.btPay, item.getUnit() + ' ' + strValueOf);
            } else {
                GooglePayPrice googlePayPrice = GooglePayPrice.INSTANCE;
                SkuDetails skuDetails = item.getSkuDetails();
                Intrinsics.checkNotNull(skuDetails);
                helper.OooOO0(R.id.btPay, googlePayPrice.getGooglePayPriceFormat(skuDetails));
            }
            if (this.f45000OooO00o.f44981OooO00o > 0) {
                ViewGroup.LayoutParams layoutParams = helper.OooO0Oo(R.id.btPay).getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) layoutParams2).width = this.f45000OooO00o.f44981OooO00o;
                helper.OooO0Oo(R.id.btPay).setLayoutParams(layoutParams2);
            }
            helper.OooO0O0(R.id.btPay);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O(Context context) {
        super(context);
        boolean zOooO0O0 = OooOo.f42064OooO00o.OooO0O0();
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44999OooO0OO = zOooO0O0 ? 0 : -1;
        setOnItemClickListener(new o00O00(this, 2));
    }

    @Override // p563o0oOo0.o000000O, com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(@NotNull OooO0o helper, @NotNull RechargeMenuType item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(getContext());
        oooO00o.f48429OooO0OO = item.getLogo();
        oooO00o.f48427OooO00o = 0;
        oooO00o.f48454OooOoo0 = 3;
        oooO00o.OooO0o((ImageView) helper.OooO0Oo(R.id.nivType));
        helper.OooOO0(R.id.tvName, item.getName());
        RecyclerView rvList = (RecyclerView) helper.OooO0Oo(R.id.rvList);
        ImageView imageView = (ImageView) helper.OooO0Oo(R.id.ivMask);
        if (helper.getLayoutPosition() == this.f44999OooO0OO) {
            Intrinsics.checkNotNullExpressionValue(rvList, "rvList");
            oOO00O.OooO(rvList);
            imageView.setRotationX(180.0f);
        } else {
            imageView.setRotationX(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            Intrinsics.checkNotNullExpressionValue(rvList, "rvList");
            oOO00O.OooO00o(rvList);
        }
        rvList.setLayoutManager(new LinearLayoutManager(getContext()));
        rvList.setAdapter(new OooO00o(item, helper, this, getContext(), item.getShoplist()));
    }
}

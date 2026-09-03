package p185o00o000o;

import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.app.base.model.GiftAnimationModel;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.common.manager.PackManager;
import com.yalla.yalla.common.manager.googlepay.GooglePaySkuDetail;
import com.yalla.yalla.common.ui.view.UserPremiumView;
import com.yalla.yalla.model.PremiumShopModel;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import com.yalla.yalla.ui.view.MomentEditRecordHeadView;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import p143o00OOooO.o0OoOo0;
import p255o00ooO0O.o000O0O0;
import p524o0o0O0o.o00O0;
import p524o0o0O0o.oo0o0O0;
import p532o0o0OOO.o00OO000;
import p532o0o0OOO.o00OO0O0;
import p581o0oOoOOo.u0;
import p581o0oOoOOo.v0;
import p581o0oOoOOo.w0;
import p608o0oo0O.OooOo;
import p656o0ooo.o000oOoO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOOOO implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f33038Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f33039OoooO00;

    public /* synthetic */ OooOOOO(Object obj, int i) {
        this.f33038Oooo = i;
        this.f33039OoooO00 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.PremiumShopModel$PremiumInfo>] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f33038Oooo) {
            case 0:
                OooOo oooOo = (OooOo) this.f33039OoooO00;
                Objects.requireNonNull(oooOo);
                OooOo.OooO0O0("102210");
                String str = ((GiftAnimationModel) oooOo.f32183OoooO0).fromUserId;
                long j = 0;
                if (str != null) {
                    try {
                        j = Long.parseLong(str);
                        break;
                    } catch (Exception unused) {
                    }
                }
                RoomUserInfoModel roomUserInfoModelOooOO0 = o00OO000.f43171OooO00o.OooOO0(j);
                if (roomUserInfoModelOooOO0 != null) {
                    o00OO0O0.f43338OooooOo.OooO00o().f43391OoooOoo.postValue(roomUserInfoModelOooOO0);
                }
                break;
            case 1:
                final PremiumActivity this$0 = (PremiumActivity) this.f33039OoooO00;
                PremiumActivity.OooO00o oooO00o = PremiumActivity.f23379o0Oo0oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                final PremiumShopModel.PremiumInfo premiumInfo = (PremiumShopModel.PremiumInfo) this$0.f23385OoooooO.get(this$0.f23387o00O0O);
                String str2 = this$0.Oooo0o().get(this$0.f23387o00O0O);
                String strOooO0OO = OooOOO.OooO0OO(R.string.single_USD);
                double amount = premiumInfo.getAmount();
                GooglePaySkuDetail googlePaySkuDetail = premiumInfo.getGooglePaySkuDetail();
                if (googlePaySkuDetail != null) {
                    strOooO0OO = googlePaySkuDetail.getUnit();
                    amount = googlePaySkuDetail.getAmount();
                }
                if (this$0.f23399oo000o == null) {
                    this$0.f23399oo000o = new w0(this$0);
                }
                w0 w0Var = this$0.f23399oo000o;
                if (w0Var != null) {
                    w0Var.f46375OoooOo0 = new o0OoOo0(this$0);
                    w0Var.f46376OoooOoO = new o000oOoO() { // from class: o0oOo00O.o000O0
                        @Override // p656o0ooo.o000oOoO
                        public final void OooO0Oo() {
                            PremiumActivity this$1 = this$0;
                            PremiumShopModel.PremiumInfo goods = premiumInfo;
                            PremiumActivity.OooO00o oooO00o2 = PremiumActivity.f23379o0Oo0oo;
                            Intrinsics.checkNotNullParameter(this$1, "this$0");
                            Intrinsics.checkNotNullParameter(goods, "$goods");
                            Objects.requireNonNull(this$1);
                            p518o0o0O000.OooOo oooOo2 = p518o0o0O000.OooOo.f42083OooO00o;
                            if (!oooOo2.OooO0O0()) {
                                if ((goods.getGooglePaySkuDetail() == null) || !PackManager.INSTANCE.isHaveGooglePlay(this$1)) {
                                    ToastUtil.f12582OooO00o.OooO0O0(OooOOO.OooO0OO(R.string.google_play_useless));
                                    return;
                                } else {
                                    this$1.Oooo00O(goods);
                                    return;
                                }
                            }
                            if (goods.getChannelSKU() != null) {
                                PremiumShopModel.ChannelSKU channelSKU = goods.getChannelSKU();
                                if (oooOo2.OooO0OO(channelSKU != null ? channelSKU.getSku() : null)) {
                                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$1), Dispatchers.getIO(), null, new o000OO00(this$1, goods, null), 2, null);
                                    return;
                                }
                            }
                            ToastUtil.f12582OooO00o.OooO0O0(OooOOO.OooO0OO(R.string.huawei_play_useless));
                        }
                    };
                    w0Var.f46371OoooO0O.setImageResource(UserPremiumView.f21071OoooO.OooO00o(premiumInfo.getIndex() + 1));
                    w0Var.f46377o000oOoO.setText("");
                    w0Var.f46372OoooOO0.setText(str2);
                    w0Var.f46377o000oOoO.append(o00O0.OooO0OO(strOooO0OO, "#333333", 0));
                    w0Var.f46377o000oOoO.append(o00O0.OooO0OO(String.format("%.2f", Double.valueOf(amount)), "#FF5B48", 0));
                    w0Var.f46377o000oOoO.append(o00O0.OooO0OO(OooOOO.OooO0OO(R.string._1_Month), "#333333", -2));
                    if (p518o0o0O000.OooOo.f42083OooO00o.OooO0O0()) {
                        w0Var.f46374OoooOOo.setText(o000O0O0.OooO0OO(R.string.huawei_subscription_explanation));
                    } else {
                        w0Var.f46374OoooOOo.setText(o000O0O0.OooO0OO(R.string.subscription_member_instructions_content));
                    }
                    String strOooO0OO2 = o000O0O0.OooO0OO(R.string.privacy_policy);
                    String strOooO0OO3 = o000O0O0.OooO0OO(R.string.terms_service);
                    int iOooO00o = OooOOO.OooO00o(R.color.color_e9a711);
                    oo0o0O0.OooO0O0(w0Var.f46374OoooOOo, strOooO0OO3, new u0(w0Var));
                    oo0o0O0.OooO0O0(w0Var.f46374OoooOOo, strOooO0OO2, new v0(w0Var));
                    oo0o0O0.OooO0o0(w0Var.f46374OoooOOo, new String[]{strOooO0OO2, strOooO0OO3}, iOooO00o);
                    w0Var.show();
                }
                break;
            default:
                MomentEditRecordHeadView this$1 = (MomentEditRecordHeadView) this.f33039OoooO00;
                int i = MomentEditRecordHeadView.f25000OoooO0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Function0<Unit> function0 = this$1.f25002OoooO00;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
        }
    }
}

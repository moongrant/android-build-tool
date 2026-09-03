package p184o00o000o;

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
import p142o00OOooO.o0OoOo0;
import p254o00ooO0O.o000O0O0;
import p522o0o0O0o.o00O0;
import p522o0o0O0o.oo0o0O0;
import p530o0o0OOO.o00O;
import p530o0o0OOO.o00OO00O;
import p579o0oOoOOo.v0;
import p579o0oOoOOo.w0;
import p579o0oOoOOo.x0;
import p606o0oo0O.OooOo;
import p654o0ooo.o000oOoO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOOOO implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f33015Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f33016Oooo0oO;

    public /* synthetic */ OooOOOO(Object obj, int i) {
        this.f33015Oooo0o = i;
        this.f33016Oooo0oO = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.PremiumShopModel$PremiumInfo>] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f33015Oooo0o) {
            case 0:
                OooOo oooOo = (OooOo) this.f33016Oooo0oO;
                Objects.requireNonNull(oooOo);
                OooOo.OooO0O0("102210");
                String str = ((GiftAnimationModel) oooOo.f32163Oooo0oo).fromUserId;
                long j = 0;
                if (str != null) {
                    try {
                        j = Long.parseLong(str);
                        break;
                    } catch (Exception unused) {
                    }
                }
                RoomUserInfoModel roomUserInfoModelOooOO0 = o00O.f43140OooO00o.OooOO0(j);
                if (roomUserInfoModelOooOO0 != null) {
                    o00OO00O.f43313OooooOo.OooO00o().f43366OoooOoo.postValue(roomUserInfoModelOooOO0);
                }
                break;
            case 1:
                final PremiumActivity this$0 = (PremiumActivity) this.f33016Oooo0oO;
                PremiumActivity.OooO00o oooO00o = PremiumActivity.f23360o0ooOOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                final PremiumShopModel.PremiumInfo premiumInfo = (PremiumShopModel.PremiumInfo) this$0.f23366OooooOo.get(this$0.f23370Ooooooo);
                String str2 = this$0.Oooo0o().get(this$0.f23370Ooooooo);
                String strOooO0OO = OooOOO.OooO0OO(R.string.single_USD);
                double amount = premiumInfo.getAmount();
                GooglePaySkuDetail googlePaySkuDetail = premiumInfo.getGooglePaySkuDetail();
                if (googlePaySkuDetail != null) {
                    strOooO0OO = googlePaySkuDetail.getUnit();
                    amount = googlePaySkuDetail.getAmount();
                }
                if (this$0.f23373o00Ooo == null) {
                    this$0.f23373o00Ooo = new x0(this$0);
                }
                x0 x0Var = this$0.f23373o00Ooo;
                if (x0Var != null) {
                    x0Var.f46364o000oOoO = new o0OoOo0(this$0);
                    x0Var.f46363OoooOOO = new o000oOoO() { // from class: o0oOo00O.o000O0Oo
                        @Override // p654o0ooo.o000oOoO
                        public final void OooO0Oo() {
                            PremiumActivity this$1 = this$0;
                            PremiumShopModel.PremiumInfo goods = premiumInfo;
                            PremiumActivity.OooO00o oooO00o2 = PremiumActivity.f23360o0ooOOo;
                            Intrinsics.checkNotNullParameter(this$1, "this$0");
                            Intrinsics.checkNotNullParameter(goods, "$goods");
                            Objects.requireNonNull(this$1);
                            p516o0o0O000.OooOo oooOo2 = p516o0o0O000.OooOo.f42064OooO00o;
                            if (!oooOo2.OooO0O0()) {
                                if ((goods.getGooglePaySkuDetail() == null) || !PackManager.INSTANCE.isHaveGooglePlay(this$1)) {
                                    ToastUtil.f12567OooO00o.OooO0O0(OooOOO.OooO0OO(R.string.google_play_useless));
                                    return;
                                } else {
                                    this$1.Oooo00O(goods);
                                    return;
                                }
                            }
                            if (goods.getChannelSKU() != null) {
                                PremiumShopModel.ChannelSKU channelSKU = goods.getChannelSKU();
                                if (oooOo2.OooO0OO(channelSKU != null ? channelSKU.getSku() : null)) {
                                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$1), Dispatchers.getIO(), null, new o000OOo0(this$1, goods, null), 2, null);
                                    return;
                                }
                            }
                            ToastUtil.f12567OooO00o.OooO0O0(OooOOO.OooO0OO(R.string.huawei_play_useless));
                        }
                    };
                    x0Var.f46354Oooo.setImageResource(UserPremiumView.f21052OoooO00.OooO00o(premiumInfo.getIndex() + 1));
                    x0Var.f46361OoooO0O.setText("");
                    x0Var.f46359OoooO0.setText(str2);
                    x0Var.f46361OoooO0O.append(o00O0.OooO0OO(strOooO0OO, "#333333", 0));
                    x0Var.f46361OoooO0O.append(o00O0.OooO0OO(String.format("%.2f", Double.valueOf(amount)), "#FF5B48", 0));
                    x0Var.f46361OoooO0O.append(o00O0.OooO0OO(OooOOO.OooO0OO(R.string._1_Month), "#333333", -2));
                    if (p516o0o0O000.OooOo.f42064OooO00o.OooO0O0()) {
                        x0Var.f46362OoooOO0.setText(o000O0O0.OooO0OO(R.string.huawei_subscription_explanation));
                    } else {
                        x0Var.f46362OoooOO0.setText(o000O0O0.OooO0OO(R.string.subscription_member_instructions_content));
                    }
                    String strOooO0OO2 = o000O0O0.OooO0OO(R.string.privacy_policy);
                    String strOooO0OO3 = o000O0O0.OooO0OO(R.string.terms_service);
                    int iOooO00o = OooOOO.OooO00o(R.color.color_e9a711);
                    oo0o0O0.OooO0O0(x0Var.f46362OoooOO0, strOooO0OO3, new v0(x0Var));
                    oo0o0O0.OooO0O0(x0Var.f46362OoooOO0, strOooO0OO2, new w0(x0Var));
                    oo0o0O0.OooO0o0(x0Var.f46362OoooOO0, new String[]{strOooO0OO2, strOooO0OO3}, iOooO00o);
                    x0Var.show();
                }
                break;
            default:
                MomentEditRecordHeadView this$1 = (MomentEditRecordHeadView) this.f33016Oooo0oO;
                int i = MomentEditRecordHeadView.f24981Oooo0oo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Function0<Unit> function0 = this$1.f24983Oooo0oO;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
        }
    }
}

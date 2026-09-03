package p185o00o000o;

import android.os.Looper;
import android.view.View;
import com.app.base.model.GiftAnimationModel;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.common.ui.view.PremiumState;
import com.yalla.yalla.model.PremiumShopModel;
import com.yalla.yalla.model.PremiumTimeModel;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p255o00ooO0O.o00O000;
import p255o00ooO0O.o0O0ooO;
import p256o00ooO0o.oo0oOO0;
import p532o0o0OOO.o00OO000;
import p568o0oOo00O.o00O00OO;
import p581o0oOoOOo.a0;
import p608o0oo0O.OooOo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOo00 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f33054Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f33055OoooO00;

    public /* synthetic */ OooOo00(Object obj, int i) {
        this.f33054Oooo = i;
        this.f33055OoooO00 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.PremiumShopModel$PremiumInfo>] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f33054Oooo) {
            case 0:
                OooOo oooOo = (OooOo) this.f33055OoooO00;
                Objects.requireNonNull(oooOo);
                OooOo.OooO0O0("102211");
                o00OO000 o00oo001 = o00OO000.f43171OooO00o;
                o00OO000.f43214OoooO00.postValue((GiftAnimationModel) oooOo.f32183OoooO0);
                break;
            case 1:
                PremiumActivity this$0 = (PremiumActivity) this.f33055OoooO00;
                PremiumActivity.OooO00o oooO00o = PremiumActivity.f23379o0Oo0oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                PremiumTimeModel premiumTimeModel = this$0.f23395o0OoOo0;
                boolean z = true;
                if (premiumTimeModel != null) {
                    if (premiumTimeModel.getSub()) {
                        String strOooO0OO = OooOOO.OooO0OO(R.string.vip3vip4_to_vip2vip1);
                        ToastUtil toastUtil = ToastUtil.f12583OooO0O0;
                        if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                            z = false;
                        }
                        if (!z) {
                            o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                            if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                o00O000 o00o001 = o00O000.f34368OooO00o;
                                o00O000.f34370OooO0OO.post(o0o0oooOooO0O0);
                            } else {
                                o0o0oooOooO0O0.run();
                            }
                            break;
                        }
                    }
                }
                PremiumShopModel.PremiumInfo premiumInfo = (PremiumShopModel.PremiumInfo) this$0.f23385OoooooO.get(this$0.f23387o00O0O);
                String str = this$0.Oooo0o().get(this$0.f23387o00O0O);
                int i = this$0.f23400ooOO;
                String strOooO00o = "";
                if (i == 0) {
                    int promotionprice = premiumInfo.getPromotionprice();
                    PremiumTimeModel premiumTimeModel2 = this$0.f23395o0OoOo0;
                    strOooO00o = premiumTimeModel2 != null && premiumTimeModel2.getState() == PremiumState.Opened.getValue() ? com.yalla.support.common.util.OooOo.OooO00o(OooOOO.OooO0OO(R.string.Confirm_to_pay_activate_previous), promotionprice + "", str, this$0.Oooo0o().get(this$0.f23388o00Oo0.OooO0O0())) : com.yalla.support.common.util.OooOo.OooO00o(OooOOO.OooO0OO(R.string.Confirm_to_pay_activate), promotionprice + "", str);
                } else if (i == 1) {
                    strOooO00o = com.yalla.support.common.util.OooOo.OooO00o(com.yalla.support.common.util.OooOo.OooO00o(OooOOO.OooO0OO(R.string.Confirm_to_pay_renew), premiumInfo.getRenew() + ""), str);
                }
                oo0oOO0 oo0ooo0 = new oo0oOO0(this$0);
                oo0ooo0.OooOo0O(strOooO00o);
                oo0ooo0.OooOoOO(true);
                oo0ooo0.OooOo0o(new o00O00OO(this$0, premiumInfo));
                oo0ooo0.OooOOO0();
                break;
            default:
                a0 this$1 = (a0) this.f33055OoooO00;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooO0O0();
                break;
        }
    }
}

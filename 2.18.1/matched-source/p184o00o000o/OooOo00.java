package p184o00o000o;

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
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p255o00ooO0o.oo0oOO0;
import p530o0o0OOO.o00O;
import p566o0oOo00O.o00O00o0;
import p579o0oOoOOo.b0;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOo00 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f33031Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f33032Oooo0oO;

    public /* synthetic */ OooOo00(Object obj, int i) {
        this.f33031Oooo0o = i;
        this.f33032Oooo0oO = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.PremiumShopModel$PremiumInfo>] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f33031Oooo0o) {
            case 0:
                OooOo oooOo = (OooOo) this.f33032Oooo0oO;
                Objects.requireNonNull(oooOo);
                OooOo.OooO0O0("102211");
                o00O o00o2 = o00O.f43140OooO00o;
                o00O.f43183OoooO00.postValue((GiftAnimationModel) oooOo.f32163Oooo0oo);
                break;
            case 1:
                PremiumActivity this$0 = (PremiumActivity) this.f33032Oooo0oO;
                PremiumActivity.OooO00o oooO00o = PremiumActivity.f23360o0ooOOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                PremiumTimeModel premiumTimeModel = this$0.f23367Oooooo;
                boolean z = true;
                if (premiumTimeModel != null) {
                    if (premiumTimeModel.getSub()) {
                        String strOooO0OO = OooOOO.OooO0OO(R.string.vip3vip4_to_vip2vip1);
                        ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
                        if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                            z = false;
                        }
                        if (!z) {
                            o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                            if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                o00O000 o00o001 = o00O000.f34346OooO00o;
                                o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                            } else {
                                o0o0oooOooO0O0.run();
                            }
                            break;
                        }
                    }
                }
                PremiumShopModel.PremiumInfo premiumInfo = (PremiumShopModel.PremiumInfo) this$0.f23366OooooOo.get(this$0.f23370Ooooooo);
                String str = this$0.Oooo0o().get(this$0.f23370Ooooooo);
                int i = this$0.f23369OoooooO;
                String strOooO00o = "";
                if (i == 0) {
                    int promotionprice = premiumInfo.getPromotionprice();
                    PremiumTimeModel premiumTimeModel2 = this$0.f23367Oooooo;
                    strOooO00o = premiumTimeModel2 != null && premiumTimeModel2.getState() == PremiumState.Opened.getValue() ? com.yalla.support.common.util.OooOo.OooO00o(OooOOO.OooO0OO(R.string.Confirm_to_pay_activate_previous), promotionprice + "", str, this$0.Oooo0o().get(this$0.f23378o0OoOo0.OooO0O0())) : com.yalla.support.common.util.OooOo.OooO00o(OooOOO.OooO0OO(R.string.Confirm_to_pay_activate), promotionprice + "", str);
                } else if (i == 1) {
                    strOooO00o = com.yalla.support.common.util.OooOo.OooO00o(com.yalla.support.common.util.OooOo.OooO00o(OooOOO.OooO0OO(R.string.Confirm_to_pay_renew), premiumInfo.getRenew() + ""), str);
                }
                oo0oOO0 oo0ooo0 = new oo0oOO0(this$0);
                oo0ooo0.OooOo0O(strOooO00o);
                oo0ooo0.OooOoOO(true);
                oo0ooo0.OooOo0o(new o00O00o0(this$0, premiumInfo));
                oo0ooo0.OooOOO0();
                break;
            default:
                b0 this$1 = (b0) this.f33032Oooo0oO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooO0O0();
                break;
        }
    }
}

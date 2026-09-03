package p506o0o00oOo;

import android.view.View;
import com.code.android.util.o0000;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.model.PremiumShopModel;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import com.yalla.yalla.ui.view.UserPremiumView;
import kotlin.jvm.internal.Intrinsics;
import o000O00O.o000O0;
import p039OoooOoo.oo0oOO0;
import p269o00oooo0.o0O0oo0o;
import p423o0OoO0OO.o00O00OO;
import p423o0OoO0OO.o00O0O0O;
import p437o0OoOOo0.o000OO00;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OOO0o;
import p590o0oOooo0.oOO0;
import p650o0ooo.n3;
import p650o0ooo.o3;
import p650o0ooo.p3;
import p650o0ooo.p4;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oO0O0OoO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f50491OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f50492OooO0o0;

    public /* synthetic */ oO0O0OoO(Object obj, int i) {
        this.f50491OooO0Oo = i;
        this.f50492OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f50491OooO0Oo;
        Object obj = this.f50492OooO0o0;
        switch (i) {
            case 0:
                PremiumActivity this$0 = (PremiumActivity) obj;
                int i2 = PremiumActivity.f26673Oooo0oO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                PremiumShopModel.PremiumInfo premiumInfo = (PremiumShopModel.PremiumInfo) this$0.f26675OooOo.get(this$0.f26684OooOoo0);
                String str = this$0.Oooo0().get(this$0.f26684OooOoo0);
                String strOooO0OO = o0000.OooO0OO(o000000.single_USD);
                double amount = premiumInfo.getAmount();
                o000OO00 googlePaySkuDetail = premiumInfo.getGooglePaySkuDetail();
                if (googlePaySkuDetail != null) {
                    strOooO0OO = googlePaySkuDetail.f47161OooO0OO;
                    amount = googlePaySkuDetail.f47160OooO0O0;
                }
                if (this$0.f26689Oooo00O == null) {
                    this$0.f26689Oooo00O = new p3(this$0);
                }
                p3 p3Var = this$0.f26689Oooo00O;
                if (p3Var != null) {
                    p3Var.f59104OooOOO0 = new o000O0(this$0);
                    p3Var.f59103OooOOO = new oo0oOO0(this$0, premiumInfo);
                    int index = premiumInfo.getIndex() + 1;
                    NetImageView netImageView = p3Var.f59098OooO0oO;
                    int i3 = UserPremiumView.f30257OooO0o0;
                    netImageView.setImageResource(UserPremiumView.OooO00o.OooO00o(index));
                    p3Var.f59100OooOO0.setText("");
                    p3Var.f59094OooO.setText(str);
                    p3Var.f59100OooOO0.append(o00O00OO.OooO0OO(0, strOooO0OO, "#333333"));
                    p3Var.f59100OooOO0.append(o00O00OO.OooO0OO(0, String.format("%.2f", Double.valueOf(amount)), "#FF5B48"));
                    p3Var.f59100OooOO0.append(o00O00OO.OooO0OO(-2, o0000.OooO0OO(o000000._1_Month), "#333333"));
                    if (oOO0.f57167OooO00o.OooO0O0()) {
                        p3Var.f59102OooOO0o.setText(o0000.OooO0OO(o000000.huawei_subscription_explanation));
                    } else {
                        p3Var.f59102OooOO0o.setText(o0000.OooO0OO(o000000.subscription_member_instructions_content));
                    }
                    String strOooO0OO2 = o0000.OooO0OO(o000000.privacy_policy);
                    String strOooO0OO3 = o0000.OooO0OO(o000000.terms_service);
                    int iOooO00o = o0000.OooO00o(o0OOO0o.color_e9a711);
                    o00O0O0O.OooO00o(p3Var.f59102OooOO0o, strOooO0OO3, new n3(p3Var));
                    o00O0O0O.OooO00o(p3Var.f59102OooOO0o, strOooO0OO2, new o3(p3Var));
                    o00O0O0O.OooO0Oo(p3Var.f59102OooOO0o, iOooO00o, strOooO0OO2, strOooO0OO3);
                    p3Var.show();
                }
                break;
            default:
                p4 this$1 = (p4) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                o0O0oo0o.OooO00o().OooO0o("cancel", true);
                this$1.getClass();
                this$1.OooO0OO();
                break;
        }
    }
}

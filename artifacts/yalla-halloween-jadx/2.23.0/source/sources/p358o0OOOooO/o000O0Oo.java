package p358o0OOOooO;

import android.os.Looper;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.yalla.album.PreviewImageActivity;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.common.manager.PayManager;
import com.yalla.yalla.model.PremiumShopModel;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import com.yalla.yalla.ui.view.UserPremiumView;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p200o00o0o.o000OOo;
import p417o0OoO0.o0000O0O;
import p417o0OoO0.o000O0o;
import p427o0OoOO00.Oooo0;
import p431o0OoOOOO.o00OO;
import p466o0Oooo0o.oOO00O;
import p519o0o0O0oO.n3;
import p519o0o0O0oO.o3;
import p519o0o0O0oO.p3;
import p579o0oOoo.oO000O0;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o000O0Oo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f43798OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f43799OooO0o0;

    public /* synthetic */ o000O0Oo(AppCompatActivity appCompatActivity, int i) {
        this.f43798OooO0Oo = i;
        this.f43799OooO0o0 = appCompatActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f43798OooO0Oo;
        AppCompatActivity appCompatActivity = this.f43799OooO0o0;
        switch (i) {
            case 0:
                PreviewImageActivity this$0 = (PreviewImageActivity) appCompatActivity;
                int i2 = PreviewImageActivity.f22538OooO0o0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.finish();
                break;
            default:
                final PremiumActivity this$1 = (PremiumActivity) appCompatActivity;
                int i3 = PremiumActivity.f27140Oooo0oO;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                PremiumShopModel.PremiumInfo premiumInfo = (PremiumShopModel.PremiumInfo) this$1.f27142OooOo.get(this$1.f27151OooOoo0);
                String str = this$1.Oooo0O0().get(this$1.f27151OooOoo0);
                String strOooO0OO = o0000.OooO0OO(oO00OOo0.single_USD);
                double amount = premiumInfo.getAmount();
                o00OO googlePaySkuDetail = premiumInfo.getGooglePaySkuDetail();
                if (googlePaySkuDetail != null) {
                    strOooO0OO = googlePaySkuDetail.f45872OooO0OO;
                    amount = googlePaySkuDetail.f45871OooO0O0;
                }
                if (this$1.f27156Oooo00O == null) {
                    this$1.f27156Oooo00O = new p3(this$1);
                }
                p3 p3Var = this$1.f27156Oooo00O;
                if (p3Var != null) {
                    p3Var.f53086OooOOO0 = new oOO00O() { // from class: o0o00o.o00O00O
                        @Override // p466o0Oooo0o.oOO00O
                        public final void OooO00o() {
                            int i4 = PremiumActivity.f27140Oooo0oO;
                            PremiumActivity this$2 = this$1;
                            Intrinsics.checkNotNullParameter(this$2, "this$0");
                            this$2.getClass();
                            boolean z = true;
                            new Oooo0(this$2, new PayManager(this$2)).OooO0OO(this$2.Oooo00O(), true);
                            String strOooO0OO2 = o0000.OooO0OO(oO00OOo0.Restoring_Please_wait_a_moment);
                            if (strOooO0OO2 != null && !StringsKt.isBlank(strOooO0OO2)) {
                                z = false;
                            }
                            if (z) {
                                return;
                            }
                            o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO2, "runnable");
                            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                o000oo0OooO00o.run();
                            } else {
                                o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                            }
                        }
                    };
                    p3Var.f53085OooOOO = new o000OOo(this$1, premiumInfo);
                    int index = premiumInfo.getIndex() + 1;
                    NetImageView netImageView = p3Var.f53080OooO0oO;
                    int i4 = UserPremiumView.f30802OooO0o0;
                    netImageView.setImageResource(UserPremiumView.OooO00o.OooO00o(index));
                    p3Var.f53082OooOO0.setText("");
                    p3Var.f53076OooO.setText(str);
                    p3Var.f53082OooOO0.append(o0000O0O.OooO0OO(0, strOooO0OO, "#333333"));
                    p3Var.f53082OooOO0.append(o0000O0O.OooO0OO(0, String.format("%.2f", Double.valueOf(amount)), "#FF5B48"));
                    p3Var.f53082OooOO0.append(o0000O0O.OooO0OO(-2, o0000.OooO0OO(oO00OOo0._1_Month), "#333333"));
                    if (oO000O0.f56533OooO00o.OooO0O0()) {
                        p3Var.f53084OooOO0o.setText(o0000.OooO0OO(oO00OOo0.huawei_subscription_explanation));
                    } else {
                        p3Var.f53084OooOO0o.setText(o0000.OooO0OO(oO00OOo0.subscription_member_instructions_content));
                    }
                    String strOooO0OO2 = o0000.OooO0OO(oO00OOo0.privacy_policy);
                    String strOooO0OO3 = o0000.OooO0OO(oO00OOo0.terms_service);
                    int iOooO00o = o0000.OooO00o(oO00O0o.color_e9a711);
                    o000O0o.OooO00o(p3Var.f53084OooOO0o, strOooO0OO3, new n3(p3Var));
                    o000O0o.OooO00o(p3Var.f53084OooOO0o, strOooO0OO2, new o3(p3Var));
                    o000O0o.OooO0Oo(p3Var.f53084OooOO0o, iOooO00o, strOooO0OO2, strOooO0OO3);
                    p3Var.show();
                }
                break;
        }
    }
}

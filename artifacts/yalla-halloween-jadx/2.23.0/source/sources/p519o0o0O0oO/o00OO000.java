package p519o0o0O0oO;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.code.android.util.o0000;
import com.code.android.util.o000OO00;
import com.yalla.yalla.model.SignInModel;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.vm.main.SignTaskVM;
import com.yalla.yalla.util.Function.OooO00o;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oO0O0OoO;
import p587o0oOooo.o0OO000;
import p641o0ooOOOO.y3;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO000 implements Observer<ApiResult<SignInModel>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00O0OOO f52594OooO0Oo;

    public o00OO000(o00O0OOO o00o0ooo2) {
        this.f52594OooO0Oo = o00o0ooo2;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(ApiResult<SignInModel> apiResult) {
        ApiResult<SignInModel> apiResult2 = apiResult;
        boolean zIsSuccess = apiResult2.isSuccess();
        o00O0OOO o00o0ooo2 = this.f52594OooO0Oo;
        if (!zIsSuccess || apiResult2.getData() == null) {
            if (o00o0ooo2.f52572OooOOo) {
                o0OO000.OooO00o("201018");
            } else {
                o0OO000.OooO00o("205008");
            }
            ApiError error = apiResult2.getError();
            if (error != null && 1090 == error.getCode()) {
                o00o0ooo2.OooOOo0();
                return;
            } else {
                if (((FragmentActivity) o00o0ooo2.f52566OooOO0O).isFinishing()) {
                    return;
                }
                o00o0ooo2.OooOOOo();
                return;
            }
        }
        if (o00o0ooo2.f52572OooOOo) {
            o0OO000.OooO00o("201017");
        } else {
            o0OO000.OooO00o("205006");
        }
        SignInModel data = apiResult2.getData();
        Intrinsics.checkNotNull(data);
        SignInModel signInModel = data;
        ConstraintLayout constraintLayout = o00o0ooo2.OooOOO().f57548OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "signInBinding.root");
        o000OO00.OooO0OO(constraintLayout);
        o00o0ooo2.OooOOO0().f57474OooO0O0.removeAllViews();
        LinearLayout linearLayout = o00o0ooo2.OooOOO0().f57474OooO0O0;
        Lazy lazy = o00o0ooo2.f52573OooOOo0;
        linearLayout.addView(((y3) lazy.getValue()).f59379OooO00o);
        y3 y3Var = (y3) lazy.getValue();
        SignTaskVM signTaskVM = o00o0ooo2.f52567OooOO0o;
        if (signInModel != null) {
            if (signInModel.getChangeCoin() == 0) {
                ImageView ivCoin = y3Var.f59381OooO0OO;
                Intrinsics.checkNotNullExpressionValue(ivCoin, "ivCoin");
                o000OO00.OooO0O0(ivCoin);
            } else {
                ImageView ivCoin2 = y3Var.f59381OooO0OO;
                Intrinsics.checkNotNullExpressionValue(ivCoin2, "ivCoin");
                o000OO00.OooOOOO(ivCoin2);
            }
            if (signInModel.getChangeCrystal() == 0) {
                ImageView ivCrystal = y3Var.f59382OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(ivCrystal, "ivCrystal");
                o000OO00.OooO0O0(ivCrystal);
            } else {
                ImageView ivCrystal2 = y3Var.f59382OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(ivCrystal2, "ivCrystal");
                o000OO00.OooOOOO(ivCrystal2);
            }
            y3Var.f59383OooO0o0.setText(signTaskVM.getGoldCrystalTips(signInModel));
        }
        new OooO00o(oO0O0OoO.sign_caizhi, 32, o00o0ooo2.f52566OooOO0O, y3Var.f59380OooO0O0, false).f32798OooO0O0 = new o0O0o(y3Var, o00o0ooo2);
        SignTaskVM.loadTaskListData$default(signTaskVM, 1, false, 2, null);
        SignInModel data2 = apiResult2.getData();
        Intrinsics.checkNotNull(data2);
        if (Intrinsics.areEqual(data2.isPopup(), "1")) {
            g0 g0Var = new g0(o00o0ooo2.f52566OooOO0O);
            String strOooO0OO = o0000.OooO0OO(oO00OOo0.enjoying_yalla);
            TextView textView = g0Var.f52259OooOO0O;
            if (textView != null) {
                textView.setText("");
                g0Var.f52259OooOO0O.setVisibility(8);
                if (!TextUtils.isEmpty(strOooO0OO)) {
                    g0Var.f52259OooOO0O.setText(strOooO0OO);
                    g0Var.f52259OooOO0O.setVisibility(0);
                }
            }
            String strOooO0OO2 = o0000.OooO0OO(oO00OOo0.tap_a_star_to_rate_it);
            TextView textView2 = g0Var.f52260OooOO0o;
            if (textView2 != null) {
                textView2.setText("");
                g0Var.f52260OooOO0o.setVisibility(8);
                if (!TextUtils.isEmpty(strOooO0OO2)) {
                    g0Var.f52260OooOO0o.setText(strOooO0OO2);
                    g0Var.f52260OooOO0o.setVisibility(0);
                }
            }
            g0Var.show();
        }
    }
}

package com.yalla.yalla.ui.activity.room;

import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.app.base.protobuf.room.Room;
import com.yalla.yalla.model.SignInModel;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.vm.main.SignTaskVM;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p405o0Oo0OOO.oO0Oo0oo;
import p650o0ooo.j0;
import p650o0ooo.oO0O00oO;
import p650o0ooo.oOO00000;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0O0oo0o implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f26468OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ View.OnClickListener f26469OooO0o0;

    public /* synthetic */ o0O0oo0o(int i, View.OnClickListener onClickListener) {
        this.f26468OooO0Oo = i;
        this.f26469OooO0o0 = onClickListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f26468OooO0Oo;
        boolean z = true;
        View.OnClickListener onClickListener = this.f26469OooO0o0;
        switch (i) {
            case 0:
                VoteGameCreateActivity this$0 = (VoteGameCreateActivity) onClickListener;
                int i2 = VoteGameCreateActivity.f26301OooOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.app.base.protobuf.room.Room.InitiateVoteReply");
                long createUserId = ((Room.InitiateVoteReply) obj).getCreateUserId();
                p475o0Ooooo0.o0O00oO0 o0o00oo1 = p475o0Ooooo0.o0O00oO0.f47936OooO00o;
                Long l = (Long) p475o0Ooooo0.o0O00oO0.OooOOo0().getValue();
                if (l != null && createUserId == l.longValue()) {
                    o0oo0000.OooO00o.OooO0O0("102106");
                    String strOooO0OO = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Success);
                    if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                        z = false;
                    }
                    if (!z) {
                        com.code.android.util.o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o.run();
                        } else {
                            com.code.android.util.o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                        }
                    }
                    this$0.finish();
                }
                break;
            default:
                oO0O00oO this$1 = (oO0O00oO) onClickListener;
                ApiResult apiResult = (ApiResult) obj;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                if (apiResult.isSuccess() && apiResult.getData() != null) {
                    if (this$1.f58866OooOOo) {
                        o0oo0000.OooO00o.OooO0O0("201017");
                    } else {
                        o0oo0000.OooO00o.OooO0O0("205006");
                    }
                    Object data = apiResult.getData();
                    Intrinsics.checkNotNull(data);
                    SignInModel signInModel = (SignInModel) data;
                    ConstraintLayout constraintLayout = this$1.OooOOO().f45308OooO00o;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
                    com.code.android.util.o000O.OooO0OO(constraintLayout);
                    this$1.OooOOO0().f44407OooO0O0.removeAllViews();
                    LinearLayout linearLayout = this$1.OooOOO0().f44407OooO0O0;
                    Lazy lazy = this$1.f58867OooOOo0;
                    linearLayout.addView(((oO0Oo0oo) lazy.getValue()).f44936OooO00o);
                    oO0Oo0oo oo0oo0oo = (oO0Oo0oo) lazy.getValue();
                    SignTaskVM signTaskVM = this$1.f58861OooOO0o;
                    if (signInModel != null) {
                        if (signInModel.getChangeCoin() == 0) {
                            ImageView ivCoin = oo0oo0oo.f44938OooO0OO;
                            Intrinsics.checkNotNullExpressionValue(ivCoin, "ivCoin");
                            com.code.android.util.o000O.OooO0O0(ivCoin);
                        } else {
                            ImageView ivCoin2 = oo0oo0oo.f44938OooO0OO;
                            Intrinsics.checkNotNullExpressionValue(ivCoin2, "ivCoin");
                            com.code.android.util.o000O.OooOOOO(ivCoin2);
                        }
                        if (signInModel.getChangeCrystal() == 0) {
                            ImageView ivCrystal = oo0oo0oo.f44939OooO0Oo;
                            Intrinsics.checkNotNullExpressionValue(ivCrystal, "ivCrystal");
                            com.code.android.util.o000O.OooO0O0(ivCrystal);
                        } else {
                            ImageView ivCrystal2 = oo0oo0oo.f44939OooO0Oo;
                            Intrinsics.checkNotNullExpressionValue(ivCrystal2, "ivCrystal");
                            com.code.android.util.o000O.OooOOOO(ivCrystal2);
                        }
                        oo0oo0oo.f44940OooO0o0.setText(signTaskVM.getGoldCrystalTips(signInModel));
                    }
                    new com.yalla.yalla.util.Function.OooO00o(p562o0oOo000.o00oO0o.sign_caizhi, 32, this$1.f58860OooOO0O, oo0oo0oo.f44937OooO0O0, false).f32262OooO0O0 = new oOO00000(oo0oo0oo, this$1);
                    SignTaskVM.loadTaskListData$default(signTaskVM, 1, false, 2, null);
                    Object data2 = apiResult.getData();
                    Intrinsics.checkNotNull(data2);
                    if (Intrinsics.areEqual(((SignInModel) data2).isPopup(), "1")) {
                        j0 j0Var = new j0(this$1.f58860OooOO0O);
                        String strOooO0OO2 = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.enjoying_yalla);
                        TextView textView = j0Var.f58303OooOO0O;
                        if (textView != null) {
                            textView.setText("");
                            j0Var.f58303OooOO0O.setVisibility(8);
                            if (!TextUtils.isEmpty(strOooO0OO2)) {
                                j0Var.f58303OooOO0O.setText(strOooO0OO2);
                                j0Var.f58303OooOO0O.setVisibility(0);
                            }
                        }
                        String strOooO0OO3 = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.tap_a_star_to_rate_it);
                        TextView textView2 = j0Var.f58304OooOO0o;
                        if (textView2 != null) {
                            textView2.setText("");
                            j0Var.f58304OooOO0o.setVisibility(8);
                            if (!TextUtils.isEmpty(strOooO0OO3)) {
                                j0Var.f58304OooOO0o.setText(strOooO0OO3);
                                j0Var.f58304OooOO0o.setVisibility(0);
                            }
                        }
                        j0Var.show();
                    }
                } else {
                    if (this$1.f58866OooOOo) {
                        o0oo0000.OooO00o.OooO0O0("201018");
                    } else {
                        o0oo0000.OooO00o.OooO0O0("205008");
                    }
                    ApiError error = apiResult.getError();
                    if (error != null && 1090 == error.getCode()) {
                        this$1.OooOOo0();
                    } else if (!((FragmentActivity) this$1.f58860OooOO0O).isFinishing()) {
                        this$1.OooOOOo();
                    }
                }
                break;
        }
    }
}

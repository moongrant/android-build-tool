package com.yalla.yalla.ui.fragment;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.model.PostUserModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000Ooo extends p654o0ooo.o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ PostDetailPraiseFragment f24485Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ PostUserModel f24486OoooO00;

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ PostDetailPraiseFragment f24487Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ PostUserModel f24488Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(PostDetailPraiseFragment postDetailPraiseFragment, PostUserModel postUserModel) {
            super(0);
            this.f24487Oooo0o = postDetailPraiseFragment;
            this.f24488Oooo0oO = postUserModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            FragmentActivity activity = this.f24487Oooo0o.getActivity();
            if (activity == null) {
                return null;
            }
            PostUserModel postUserModel = this.f24488Oooo0oO;
            UserInfoActivity.OooO00o.OooO0Oo(UserInfoActivity.f23452o0ooOO0, activity, postUserModel.getUserid() + "", false, 12);
            return null;
        }
    }

    public o0000Ooo(PostDetailPraiseFragment postDetailPraiseFragment, PostUserModel postUserModel) {
        this.f24485Oooo = postDetailPraiseFragment;
        this.f24486OoooO00 = postUserModel;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        OooO00o onLogin = new OooO00o(this.f24485Oooo, this.f24486OoooO00);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        if (Intrinsics.areEqual(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
            return;
        }
        Activity activityOooO0O0 = p254o00ooO0O.o00000O.f34254OooO00o.OooO0O0();
        if (activityOooO0O0 != null) {
            LoginActivity.OooO00o oooO00o = LoginActivity.f21752OooooO0;
            o00OO0O0.o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
        }
    }
}

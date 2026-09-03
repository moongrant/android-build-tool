package com.yalla.yalla.ui.fragment;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.model.MomentGift;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o00000O0 extends p654o0ooo.o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ PostDetailGiftFragment f24473Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ MomentGift f24474OoooO00;

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ PostDetailGiftFragment f24475Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ MomentGift f24476Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(PostDetailGiftFragment postDetailGiftFragment, MomentGift momentGift) {
            super(0);
            this.f24475Oooo0o = postDetailGiftFragment;
            this.f24476Oooo0oO = momentGift;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            FragmentActivity activity = this.f24475Oooo0o.getActivity();
            if (activity == null) {
                return null;
            }
            MomentGift momentGift = this.f24476Oooo0oO;
            UserInfoActivity.OooO00o.OooO0Oo(UserInfoActivity.f23452o0ooOO0, activity, momentGift.getUserId() + "", false, 12);
            return null;
        }
    }

    public o00000O0(PostDetailGiftFragment postDetailGiftFragment, MomentGift momentGift) {
        this.f24473Oooo = postDetailGiftFragment;
        this.f24474OoooO00 = momentGift;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        OooO00o onLogin = new OooO00o(this.f24473Oooo, this.f24474OoooO00);
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

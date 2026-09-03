package com.yalla.yalla.ui.fragment;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.model.PostCommentDetailModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class oo000o extends p654o0ooo.o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ PostDetailCommentFragment f24547Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ PostCommentDetailModel f24548OoooO00;

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ PostDetailCommentFragment f24549Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ PostCommentDetailModel f24550Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(PostDetailCommentFragment postDetailCommentFragment, PostCommentDetailModel postCommentDetailModel) {
            super(0);
            this.f24549Oooo0o = postDetailCommentFragment;
            this.f24550Oooo0oO = postCommentDetailModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f23452o0ooOO0;
            FragmentActivity fragmentActivityRequireActivity = this.f24549Oooo0o.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
            UserInfoActivity.OooO00o.OooO0Oo(oooO00o, fragmentActivityRequireActivity, this.f24550Oooo0oO.getUserid(), false, 12);
            return null;
        }
    }

    public oo000o(PostDetailCommentFragment postDetailCommentFragment, PostCommentDetailModel postCommentDetailModel) {
        this.f24547Oooo = postDetailCommentFragment;
        this.f24548OoooO00 = postCommentDetailModel;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        OooO00o onLogin = new OooO00o(this.f24547Oooo, this.f24548OoooO00);
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

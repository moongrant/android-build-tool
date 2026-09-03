package com.yalla.yalla.ui.fragment.moment;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.yalla.yalla.model.PostUserModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p473o0OoooOo.o0OOOO0o;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000 extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ MomentDetailLikeFragment f28295OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ PostUserModel f28296OooO0oo;

    @SourceDebugExtension({"SMAP\nMomentDetailLikeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentDetailLikeFragment.kt\ncom/yalla/yalla/ui/fragment/moment/MomentDetailLikeFragment$baseAdapter$2$1$convert$1$onNoDoubleClick$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,288:1\n1#2:289\n*E\n"})
    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailLikeFragment f28297OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ PostUserModel f28298OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MomentDetailLikeFragment momentDetailLikeFragment, PostUserModel postUserModel) {
            super(0);
            this.f28297OooO0Oo = momentDetailLikeFragment;
            this.f28298OooO0o0 = postUserModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            FragmentActivity activity = this.f28297OooO0Oo.getActivity();
            if (activity != null) {
                UserInfoActivity.OooO00o.OooO0OO(UserInfoActivity.f26775Oooo0o, activity, androidx.media3.session.o0000O00.OooO00o(this.f28298OooO0o0.getUserid()), false, 12);
            }
            return Unit.INSTANCE;
        }
    }

    public o0000(MomentDetailLikeFragment momentDetailLikeFragment, PostUserModel postUserModel) {
        this.f28295OooO0oO = momentDetailLikeFragment;
        this.f28296OooO0oo = postUserModel;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        OooO00o onLogin = new OooO00o(this.f28295OooO0oO, this.f28296OooO0oo);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
            return;
        }
        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            int i = LoginActivity.f24727OooOo0O;
            LoginActivity.OooO00o.OooO00o(activityOooO0O0);
        }
    }
}

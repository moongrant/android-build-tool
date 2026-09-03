package com.yalla.yalla.ui.fragment;

import android.app.Activity;
import android.view.View;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.common.ui.view.PraiseView;
import com.yalla.yalla.model.PostCommentDetailModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OO00O extends p654o0ooo.o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ PostDetailCommentFragment f24529Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ PraiseView f24530OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ PostCommentDetailModel f24531OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ p188o00o00o0.OooO0o f24532OoooO0O;

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ p188o00o00o0.OooO0o f24533Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ PostDetailCommentFragment f24534Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ PostCommentDetailModel f24535Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ PraiseView f24536Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(PostDetailCommentFragment postDetailCommentFragment, PostCommentDetailModel postCommentDetailModel, PraiseView praiseView, p188o00o00o0.OooO0o oooO0o) {
            super(0);
            this.f24534Oooo0o = postDetailCommentFragment;
            this.f24535Oooo0oO = postCommentDetailModel;
            this.f24536Oooo0oo = praiseView;
            this.f24533Oooo = oooO0o;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f24534Oooo0o.getVm().commentPraise(this.f24535Oooo0oO.getId() + "", this.f24535Oooo0oO.isPraise() ? 1 : 0).observe(this.f24534Oooo0o.getViewLifecycleOwner(), new o0o0000.OooOo(new o0Oo0oo(this.f24534Oooo0o, this.f24535Oooo0oO, this.f24536Oooo0oo, this.f24533Oooo), null, null, false));
            return null;
        }
    }

    public o0OO00O(PostDetailCommentFragment postDetailCommentFragment, PostCommentDetailModel postCommentDetailModel, PraiseView praiseView, p188o00o00o0.OooO0o oooO0o) {
        this.f24529Oooo = postDetailCommentFragment;
        this.f24531OoooO00 = postCommentDetailModel;
        this.f24530OoooO0 = praiseView;
        this.f24532OoooO0O = oooO0o;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        OooO00o onLogin = new OooO00o(this.f24529Oooo, this.f24531OoooO00, this.f24530OoooO0, this.f24532OoooO0O);
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

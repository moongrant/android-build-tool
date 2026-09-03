package com.yalla.yalla.ui.fragment;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.app.base.base.activity.BaseActivity;
import com.code.android.util.ToastUtil;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.model.PostCommentDetailModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p176o00OoooO.oO00OOOo;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes3.dex */
public final class o000000 extends p654o0ooo.o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ PostCommentDetailModel f24463Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ SVGAView f24464OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ PostDetailCommentFragment f24465OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ TextView f24466OoooO0O;

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ TextView f24467Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ PostCommentDetailModel f24468Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ PostDetailCommentFragment f24469Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ SVGAView f24470Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(PostCommentDetailModel postCommentDetailModel, PostDetailCommentFragment postDetailCommentFragment, SVGAView sVGAView, TextView textView) {
            super(0);
            this.f24468Oooo0o = postCommentDetailModel;
            this.f24469Oooo0oO = postDetailCommentFragment;
            this.f24470Oooo0oo = sVGAView;
            this.f24467Oooo = textView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0O00000.OooO0OO("Monents_commentFlower");
            if (Intrinsics.areEqual(kotlin.collections.unsigned.OooO00o.OooO0O0(p498o0o00Oo0.OooOOO.f41216OooO00o), this.f24468Oooo0o.getUserid())) {
                ToastUtil.f12567OooO00o.OooO0O0(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.send_reward_self));
                return null;
            }
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            if (!p497o0o00Oo.OooOOO0.OooO().OooOO0O()) {
                FragmentActivity fragmentActivityRequireActivity = this.f24469Oooo0oO.requireActivity();
                Intrinsics.checkNotNull(fragmentActivityRequireActivity, "null cannot be cast to non-null type com.app.base.base.activity.BaseActivity");
                oO00OOOo.OooO00o((BaseActivity) fragmentActivityRequireActivity, new o000OOo(this.f24469Oooo0oO, this.f24468Oooo0o, this.f24470Oooo0oo, this.f24467Oooo));
                return null;
            }
            PostDetailCommentFragment postDetailCommentFragment = this.f24469Oooo0oO;
            PostCommentDetailModel postCommentDetailModel = this.f24468Oooo0o;
            SVGAView rewardSvga = this.f24470Oooo0oo;
            Intrinsics.checkNotNullExpressionValue(rewardSvga, "rewardSvga");
            TextView tvRewardCount = this.f24467Oooo;
            Intrinsics.checkNotNullExpressionValue(tvRewardCount, "tvRewardCount");
            postDetailCommentFragment.sendReward(postCommentDetailModel, rewardSvga, tvRewardCount);
            return null;
        }
    }

    public o000000(PostCommentDetailModel postCommentDetailModel, PostDetailCommentFragment postDetailCommentFragment, SVGAView sVGAView, TextView textView) {
        this.f24463Oooo = postCommentDetailModel;
        this.f24465OoooO00 = postDetailCommentFragment;
        this.f24464OoooO0 = sVGAView;
        this.f24466OoooO0O = textView;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        OooO00o onLogin = new OooO00o(this.f24463Oooo, this.f24465OoooO00, this.f24464OoooO0, this.f24466OoooO0O);
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
